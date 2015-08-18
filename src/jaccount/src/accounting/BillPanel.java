/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
package accounting;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class BillPanel extends JPanel {

  private AProps aProps;
  private static PrinterJob pj = null;
  private static JFileChooser fileChooser = null;
  BillAll allBillPane = null;
  BillOne oneBillPane = null;
  private JScrollPane jsp;
  private Date startDate;
  private Date endDate;
  private AccountJCB accJCB;
  private AccountInfo2 accInfo;
  private boolean bOneUser = false;
  private boolean bSummary = false;
  private boolean bAllSummary = false;
  private JButton bXls;


  public BillPanel(AccountJCB cb, boolean bOne, boolean bSum, Date sDate, Date eDate) {
    this.accJCB = cb;
    this.bOneUser = bOne;
    this.bSummary = bSum;
    this.startDate = sDate;
    this.endDate = eDate;

    setLayout( new BorderLayout() );
    
    aProps = AProps.getInstance();

    jsp = new JScrollPane();
    if (!bOne) {
        allBillPane = new BillAll(bSum);
        jsp.setViewportView(allBillPane);
    }
    add(jsp, BorderLayout.CENTER);
    jsp.getVerticalScrollBar().setUnitIncrement(16);

    JPanel pSouth = new JPanel();
    pSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 5)); 
    JButton bPrint = new JButton("Print");
    bPrint.addActionListener( new PrintBill() );
    pSouth.add(bPrint);
    bXls = new JButton("Save for Excel");
    bXls.addActionListener( new XlsBill() );
    pSouth.add(bXls);

    add(pSouth, BorderLayout.SOUTH);
    build();
  }

  private void build() {
     if (accJCB == null)
         return;
     int num = accJCB.getItemCount(); 
     if (num < 1)
         return;
     int i, k;

     if (bSummary && !bOneUser)
        bAllSummary = true;
     else
        bAllSummary = false;
     k = 0;
     if (bOneUser)
         k = accJCB.getSelectedIndex();
     for (i = k; i < num; i++) {
         String user = (String) accJCB.getItemAt(i);
         BillOne bill = null;
         accInfo = accJCB.read(user);
         if (accInfo != null) {
             ReadLast rd = ReadLast.getInstance(accInfo);
             rd.startDate(startDate);
             rd.endDate(endDate);
             bill = new BillOne(accInfo, bSummary);    
         }
         if (bOneUser) {
            if (bill != null) {
               oneBillPane = bill;
               jsp.setViewportView(bill);
            }
            break;
         }
         else
            allBillPane.addBill(bill);
     }
  }


   private class PrintBill implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if (oneBillPane == null && allBillPane == null)
                return;
            if (pj == null)
                pj = PrinterJob.getPrinterJob();
            if (!pj.printDialog())
                return;
            if (oneBillPane != null) {
                oneBillPane.startPrint();
                pj.setPrintable(oneBillPane);
            }
            else if (allBillPane != null) {
                allBillPane.startPrint();
                pj.setPrintable(allBillPane);
            }
            try {
                pj.print();
            }
            catch (PrinterException pe) { }
        }
   }

   private class XlsBill implements ActionListener {
        public void actionPerformed (ActionEvent ae) {
            if (oneBillPane == null && allBillPane == null)
                return;
            String s;
            File fileDest = new File("*.csv");
            
            if (fileChooser == null) {
                fileChooser = new JFileChooser(AProps.getInstance().getRootDir()+"/adm/accounting");
                fileChooser.setApproveButtonText("Ok");
                fileChooser.setSelectedFile(fileDest);
            }
            int ret = fileChooser.showOpenDialog(bXls);
            if (ret != JFileChooser.APPROVE_OPTION)
                return;
            fileDest = fileChooser.getSelectedFile();
            if (fileDest == null)
                return;
            String filePath = fileDest.getAbsolutePath();
            if (fileDest.exists() && !fileDest.canWrite()) {
                JOptionPane.showMessageDialog(bXls,
                "Cannot write to file: "+filePath,
                "Write to File",
                JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (fileDest.exists()) {
                int v = JOptionPane.showConfirmDialog(bXls,
                      "This file already exists. Would you like to overwrite the existing file?",
                      "Save to File",
                      JOptionPane.YES_NO_OPTION);
                if (v != JOptionPane.YES_OPTION)
                    return;
            }
            PrintWriter fout = null;
            try {
                fout = new PrintWriter(new FileWriter(filePath));
                if (fout != null) {
                     if (oneBillPane != null)
                         oneBillPane.writeToCsv(fout, true);
                     else if (allBillPane != null)
                         allBillPane.writeToCsv(fout);
                }
            }
            catch(IOException er) { }

            finally {
                try {
                    if (fout != null)
                        fout.close();
                } catch (Exception e) {}
            }
        }
   }
}

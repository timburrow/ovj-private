/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
package accounting;

import java.awt.Component;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class DaySpinRenderer implements TableCellRenderer {
  JSpinner spin;
  public DaySpinRenderer() {
  }
  public Component getTableCellRendererComponent(
                           JTable table, Object value, boolean isSelected,
                           boolean hasFocus, int row, int column) {
     spin = (JSpinner)value;
     return (JSpinner)spin;
  }
}
/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*
 * 
 *
 */
package vnmr.templates;


/**
 *  StatementElement build element for VElement
 *  @author		Dean Sindorf
 */
public class VTreeNodeElement extends VElement {
    //----------------------------------------------------------------
    /** build JComponent */
    //----------------------------------------------------------------
    public String toString(){
        String rtn = getAttribute("Title");
        if (rtn == null || rtn.trim().length() == 0) {
            rtn = getAttribute("title");
            if (rtn == null) {
                rtn = "";
            }
        }
        return rtn;
    }
    public boolean isActive() { return true;}
}

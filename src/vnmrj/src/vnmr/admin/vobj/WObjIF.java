/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package vnmr.admin.vobj;

/**
 * Title:   WObjIF
 * Description: Interface for a wanda object.
 * Copyright:    Copyright (c) 2002
 */

public interface WObjIF
{

    public void setValue(String strValue);
    public String getValue();
    public String getAttribute(int nAttr);
    public void setAttribute(int nAttr, String strValue);
}

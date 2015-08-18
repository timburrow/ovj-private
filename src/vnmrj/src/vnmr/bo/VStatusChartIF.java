/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package  vnmr.bo;

import java.awt.*;
import java.util.*;
import vnmr.util.*;

public interface  VStatusChartIF {
    public void validate();
    public String getAttribute(int attr);
    public void setAttribute(int attr, String c);
    public void updateValue(Vector params);
    public void updateValue();
    public void setValue(String c);
    public void updateStatus(String msg);
    public void destroy();
    public void setSize(Dimension win);
}


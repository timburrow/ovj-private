/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package  vnmr.ui;

import java.awt.*;
import java.util.*;
import vnmr.util.*;

public interface  ParamListenerIF {
    public void updateValue(Vector params);
    public void updateAllValue();
}


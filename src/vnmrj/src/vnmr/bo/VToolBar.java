/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package  vnmr.bo;

//import java.awt.*;
import java.util.*;
import javax.swing.*;
import vnmr.util.*;
import vnmr.ui.*;

/**
 * A tool bar that handles parameter changes for its child VObj's
 */
public class  VToolBar extends JToolBar implements ParamListenerIF {

    public void updateValue(Vector params) {
	ParamListenerUtils.updateValue(this, params);
    }

    public void updateAllValue() {
	if (getComponentCount() <= 0)
		setBorderPainted(false);
	else
		setBorderPainted(true);

	ParamListenerUtils.updateAllValue(this);
    }
}

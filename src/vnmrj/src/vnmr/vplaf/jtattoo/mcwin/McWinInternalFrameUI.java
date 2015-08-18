/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */
package vnmr.vplaf.jtattoo.mcwin;

import vnmr.vplaf.jtattoo.BaseInternalFrameUI;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.plaf.ComponentUI;

/**
 * @author Michael Hagen
 */
public class McWinInternalFrameUI extends BaseInternalFrameUI {

    public McWinInternalFrameUI(JInternalFrame b) {
        super(b);
    }

    public static ComponentUI createUI(JComponent c) {
        return new McWinInternalFrameUI((JInternalFrame) c);
    }

    protected JComponent createNorthPane(JInternalFrame w) {
        titlePane = new McWinInternalFrameTitlePane(w);
        return titlePane;
    }
}


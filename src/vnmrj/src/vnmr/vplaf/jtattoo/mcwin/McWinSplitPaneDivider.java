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

import vnmr.vplaf.jtattoo.BaseSplitPaneDivider;
import java.awt.Graphics;

/**
 * @author Michael Hagen
 */
public class McWinSplitPaneDivider extends BaseSplitPaneDivider {

    public McWinSplitPaneDivider(McWinSplitPaneUI ui) {
        super(ui);
    }

    public void paint(Graphics g) {
        if (McWinLookAndFeel.getTheme().isBrightMode()) {
            centerOneTouchButtons = true;
            doLayout();
            super.paint(g);
        } else {
            centerOneTouchButtons = false;
            doLayout();
            McWinUtils.fillComponent(g, this);
            paintComponents(g);
        }
    }
}

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
package vnmr.vplaf.jtattoo;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 * @author Michael Hagen
 */
public class BaseMenuBarUI extends BasicMenuBarUI {

    public static ComponentUI createUI(JComponent c) {
        return new BaseMenuBarUI();
    }

    public void paint(Graphics g, JComponent c) {
        int w = c.getWidth();
        int h = c.getHeight();
        JTattooUtilities.fillHorGradient(g, AbstractLookAndFeel.getTheme().getMenuBarColors(), 0, 0, w, h);
    }
}

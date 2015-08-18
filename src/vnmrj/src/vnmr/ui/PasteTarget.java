/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package  vnmr.ui;

import java.awt.datatransfer.*;

/**
 * paste target
 *
 * @author Mark Cao
 */
public interface PasteTarget extends CutCopyPasteTarget {
    /**
     * Requested a paste of the given transferable data.
     * @return true if paste succeeded
     */
    public boolean pasteRequested(Transferable transferable);

} // interface PasteTarget

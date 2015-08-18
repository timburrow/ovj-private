/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package  vnmr.util;

public interface VColorImageListenerIF {
    public void clearImageInfo();
    public void addImageInfo(int id, int displaOrder, int colormapId,
                             int transparency, String imgName);
    public void selectImageInfo(int id);
}


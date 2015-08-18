/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package vnmr.print;

import javax.print.attribute.PrintRequestAttribute;
import javax.print.attribute.standard.Media;

public class SunAlternateMedia implements PrintRequestAttribute {

    private Media media;

    public SunAlternateMedia(Media altMedia) {
        media = altMedia;
    }

    public Media getMedia() {
        return media;
    }

    public final Class<SunAlternateMedia> getCategory() {
        return SunAlternateMedia.class;
    }

    public final String getName() {
        return "sun-alternate-media";
    }
    
}


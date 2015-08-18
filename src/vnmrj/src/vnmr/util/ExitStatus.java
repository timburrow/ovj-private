/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

package vnmr.util;

import vnmr.ui.*;

/********************************************************** <pre>
 * Summary: Return whether or not vnmrj has been told to exit.
 *
 *      This isolation class is called when a routine wants to know
 *      if vnmrj is in the process of shutting down.  There is an
 *      identically named class for managedb which simply returns false.
 </pre> **********************************************************/

public class ExitStatus {

    static public boolean exiting() {
        return VNMRFrame.exiting();
    }

}

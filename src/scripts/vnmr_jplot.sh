: '@(#)vnmr_jplot.sh 22.1 03/24/08 1991-1994 '
# 
#
# Copyright (C) 2015  Stanford University
# 
# You may distribute under the terms of either the GNU General Public
# License or the Apache License, as specified in the README file.
# 
# For more information, see the README file.
# 
#
: /bin/sh

"$vnmrsystem"/jre/bin/java  -Dsysdir="$vnmrsystem" -Duserdir="$vnmruser" -Duser=$USER -cp "$vnmrsystem"/java/jplot.jar PlotConfig $* &

: '@(#)vnmr_setgauss.sh 22.1 03/24/08 1991-1996 '
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
: setgauss
:  add a Gaussian fraction to fitspec.outpar
:  and copy it back to fitspec.inpar
awk '
BEGIN { FS=","
}
{
printf "%12g, %12g, %12g, %6s\n", $1, $2, $3, "'$2'"
}' $1/fitspec.outpar > $1/fitspec.inpar


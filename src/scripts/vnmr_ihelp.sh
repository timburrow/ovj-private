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

echo $1
if test $# -gt 0
then
    acroread $1  >& /dev/null &
fi

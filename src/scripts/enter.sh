#! /bin/csh
# '@(#)enter.sh 22.1 03/24/08 1991-1996 '
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
# The first argument must be the filename
# If more than one argument is given, the second is the location
# of the configuration information (e.g. /vnmr/asm) and the
# third is the vnmr address parameter

setenv TCLDIR $vnmrsystem/tcl
setenv TCL_LIBRARY $TCLDIR/tcllibrary
setenv TK_LIBRARY $TCLDIR/tklibrary

if ($#argv == 0) then
  echo "a filename argument must be supplied to $0"
  exit 0
endif
if (`dirname $1` == ".") then
  set file=`pwd`/$1
else
  set file=$1
endif

cd $TCLDIR/bin
if ($#argv == 1) then
   ./enter "$file" &
else if ($#argv == 3) then
   ./enter "$file" "$2" "$3" &
else
   ./enter "$file" $argv[2-] &
endif

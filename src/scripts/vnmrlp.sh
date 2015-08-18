: '@(#)vnmrlp.sh 22.1 03/24/08 1991-1996 '
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
#! /bin/sh

ostype=`vnmr_uname`

if [ $1 = "lpshow" ]
  then if [ $ostype = "AIX" -o $ostype = "SunOS" ]
         then
              lpq -P $2
         else   # [ $ostype = "IRIX" -o $ostype = "SOLARIS" ]
              lpstat
       fi  
fi

if [ $1 = "lpkill" ]
  then  if [ $ostype = "AIX" -o $ostype = "SunOS" ] 
          then
               lprm -P $2 -
          else  # [ $ostype = "IRIX" -o $ostype = "SOLARIS" ] 
               if [ $ostype = "IRIX" ]
                 then
                    auser=`whoami`
                 else
	            auser=`id | sed -e 's/[^(]*[(]\([^)]*\)[)].*/\1/'`
               fi
               cancel -u $auser $2 2>&1
        fi 
fi

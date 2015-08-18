/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
/*
* Varian Assoc.,Inc. All Rights Reserved.
* This software contains proprietary and confidential
* information of Varian Assoc., Inc. and its contributors.
* Use, disclosure and reproduction is prohibited without
* prior consent.
*/

/* --- define the different byte sizes in char,int,long for SUN or VM02 --- */
#ifdef SUN
typedef char c68char;
typedef short c68int;
typedef long c68long;
#else
typedef char c68char;
typedef int c68int;
typedef long c68long;
#endif
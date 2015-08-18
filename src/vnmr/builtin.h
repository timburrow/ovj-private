/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */

/*-------------------------------------------------------------------------
|	builtin.h
|
|	This include file contains the structure of a command
+-------------------------------------------------------------------------*/
struct _cmd { char   *n;
	      int   (*f)();
	      int    graphcmd;
	      /* int    destruct; */
	    };
typedef struct _cmd cmd;


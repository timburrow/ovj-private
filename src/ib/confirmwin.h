/*
 * Copyright (C) 2015  Stanford University
 *
 * You may distribute under the terms of either the GNU General Public
 * License or the Apache License, as specified in the README file.
 *
 * For more information, see the README file.
 */
#ifndef _CONFIRMWIN_H
#define _CONFIRMWIN_H
/************************************************************************
*									
*  Copyright (c) Varian Assoc., Inc.  All Rights Reserved.
*
*************************************************************************
*									
*  Charly Gatot
*  Spectroscopy Imaging Systems Corporation
*  Fremont, CA	94538
*									
*************************************************************************/

/************************************************************************
*                                                                       *
*  Popup notice window to ask the confirmation from the user.           *
*  It blocks all window activities until the user responds to the       * 
*  confirmer window.                                                    * 
*
*  Return TRUE if the user clicks 'true_button' and FALSE if he clicks	*
*  'false_button'.							*
*									*
*  Example of usage:							*
*    answer=confirmwin_popup("Yes", "No", "Filename already exists."	*
*    	"Overwrite this datafile ?", NULL);				*
*  									*
*  Note that the last argument must be NULL.				*
*                                                                       */
extern int
confirmwin_popup(
	char *true_button,  /* name of button to be return TRUE */
	char *false_button, /* name of button to be return FALSE */
	...);		    /* message strings to be printed out line by */
			    /* line (Last arguement must be NULL) */
#endif _CONFIRMWIN_H

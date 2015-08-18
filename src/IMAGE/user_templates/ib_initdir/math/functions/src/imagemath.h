/* Copyright (c) Agilent Technologies  All Rights Reserved. */

/* 
 * Agilent Technologies All Rights Reserved.
 * This software contains proprietary and confidential
 * information of Agilent Technologies and its contributors.
 * Use, disclosure and reproduction is prohibited without
 * prior consent.
 */

#ifndef IMAGEMATH_H
#define IMAGEMATH_H

#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>

#include "parmlist.h"

typedef void DDLNode;
typedef void DDLSymbolTable;
typedef DDLSymbolTable *FDFptr;
#include "ddl_c_interface.h"

#ifndef TRUE
#define TRUE (0==0)
#define FALSE (!TRUE)
#endif

#define LINEAR_FIXED 1
#define LINEAR_RECALC 2
#define LINEAR_RECALC_OFFSET 4
#define LINEAR_ANY 7
#define NONLINEAR 8

#define IN_DATA(vec,img,pixel) (in_data[vecindx[(vec)]+(img)][(pixel)])

#ifdef IMAGEMATH_MAIN
#define EXTERN
#else
#define EXTERN extern
#endif

EXTERN int img_width, img_height, img_depth, img_size;
EXTERN int *in_width, *in_height, *in_depth, *in_size;
EXTERN int pixel_indx;
EXTERN FDFptr *in_object;
EXTERN float **in_data;
EXTERN int nbr_infiles;
EXTERN int nbr_strings;
EXTERN char **in_strings;
EXTERN int nbr_params;
EXTERN float *in_params;
EXTERN int input_sizes_differ;
EXTERN int *out_width, *out_height, *out_depth, *out_size;
EXTERN FDFptr *out_object;
EXTERN float **out_data;
EXTERN int nbr_outfiles;
EXTERN int nbr_image_vecs;
EXTERN int *in_vec_len;
EXTERN int *vecindx;

extern int want_output(int n);
extern int create_output_files(int n, FDFptr cloner);
extern int write_output_files();
extern void *getmem();
extern void release_memitem(void *adr);
float gammln(float xx);
void gcf(float *gammcf, float a, float x, float *gln);
void gser(float *gamser, float a, float x, float *gln);
float gammq(float a, float x);
extern float chisqComp(float chisq, int n);
extern float chisqCompInv(float p, int n);

#undef EXTERN

#endif /* IMAGEMATH_H */

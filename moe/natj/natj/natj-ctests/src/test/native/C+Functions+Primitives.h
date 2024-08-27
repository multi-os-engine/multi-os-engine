/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

#ifndef C_Functions_Primitives_h
#define C_Functions_Primitives_h

#include "Common_Defines.h"

#pragma mark - Functions with primitive types

NATJ_TEST_EXTERN bool NGBoolCreate(bool a);
NATJ_TEST_EXTERN char NGByteCreate(char a);
NATJ_TEST_EXTERN short NGShortCreate(short a);
NATJ_TEST_EXTERN unichar NGCharCreate(unichar a);
NATJ_TEST_EXTERN int NGIntCreate(int a);
NATJ_TEST_EXTERN long long NGLongCreate(long long a);
NATJ_TEST_EXTERN float NGFloatCreate(float a);
NATJ_TEST_EXTERN double NGDoubleCreate(double a);

NATJ_TEST_EXTERN bool NGBoolCompare(bool a, bool b);
NATJ_TEST_EXTERN bool NGByteCompare(char a, char b);
NATJ_TEST_EXTERN bool NGShortCompare(short a, short b);
NATJ_TEST_EXTERN bool NGCharCompare(unichar a, unichar b);
NATJ_TEST_EXTERN bool NGIntCompare(int a, int b);
NATJ_TEST_EXTERN bool NGLongCompare(long long a, long long b);
NATJ_TEST_EXTERN bool NGFloatCompare(float a, float b);
NATJ_TEST_EXTERN bool NGDoubleCompare(double a, double b);

#pragma mark - Functions with primitive* types

NATJ_TEST_EXTERN bool *NGBoolCreateArray(int count);
NATJ_TEST_EXTERN char *NGByteCreateArray(int count);
NATJ_TEST_EXTERN short *NGShortCreateArray(int count);
NATJ_TEST_EXTERN unichar *NGCharCreateArray(int count);
NATJ_TEST_EXTERN int *NGIntCreateArray(int count);
NATJ_TEST_EXTERN long long *NGLongCreateArray(int count);
NATJ_TEST_EXTERN float *NGFloatCreateArray(int count);
NATJ_TEST_EXTERN double *NGDoubleCreateArray(int count);

NATJ_TEST_EXTERN bool NGBoolArrayCompare(bool *a, bool *b, int count);
NATJ_TEST_EXTERN bool NGByteArrayCompare(char *a, char *b, int count);
NATJ_TEST_EXTERN bool NGShortArrayCompare(short *a, short *b, int count);
NATJ_TEST_EXTERN bool NGCharArrayCompare(unichar *a, unichar *b, int count);
NATJ_TEST_EXTERN bool NGIntArrayCompare(int *a, int *b, int count);
NATJ_TEST_EXTERN bool NGLongArrayCompare(long long *a, long long *b, int count);
NATJ_TEST_EXTERN bool NGFloatArrayCompare(float *a, float *b, int count);
NATJ_TEST_EXTERN bool NGDoubleArrayCompare(double *a, double *b, int count);

NATJ_TEST_EXTERN void NGBoolArrayFree(bool *a);
NATJ_TEST_EXTERN void NGByteArrayFree(char *a);
NATJ_TEST_EXTERN void NGShortArrayFree(short *a);
NATJ_TEST_EXTERN void NGCharArrayFree(unichar *a);
NATJ_TEST_EXTERN void NGIntArrayFree(int *a);
NATJ_TEST_EXTERN void NGLongArrayFree(long long *a);
NATJ_TEST_EXTERN void NGFloatArrayFree(float *a);
NATJ_TEST_EXTERN void NGDoubleArrayFree(double *a);

#pragma mark - Functions with primitive** types

NATJ_TEST_EXTERN bool **NGBoolCreateArrayRef(bool *array);
NATJ_TEST_EXTERN char **NGByteCreateArrayRef(char *array);
NATJ_TEST_EXTERN short **NGShortCreateArrayRef(short *array);
NATJ_TEST_EXTERN unichar **NGCharCreateArrayRef(unichar *array);
NATJ_TEST_EXTERN int **NGIntCreateArrayRef(int *array);
NATJ_TEST_EXTERN long long **NGLongCreateArrayRef(long long *array);
NATJ_TEST_EXTERN float **NGFloatCreateArrayRef(float *array);
NATJ_TEST_EXTERN double **NGDoubleCreateArrayRef(double *array);

NATJ_TEST_EXTERN bool NGBoolArrayRefCompare(bool **a, bool *b, int count);
NATJ_TEST_EXTERN bool NGByteArrayRefCompare(char **a, char *b, int count);
NATJ_TEST_EXTERN bool NGShortArrayRefCompare(short **a, short *b, int count);
NATJ_TEST_EXTERN bool NGCharArrayRefCompare(unichar **a, unichar *b, int count);
NATJ_TEST_EXTERN bool NGIntArrayRefCompare(int **a, int *b, int count);
NATJ_TEST_EXTERN bool NGLongArrayRefCompare(long long **a, long long *b, int count);
NATJ_TEST_EXTERN bool NGFloatArrayRefCompare(float **a, float *b, int count);
NATJ_TEST_EXTERN bool NGDoubleArrayRefCompare(double **a, double *b, int count);

NATJ_TEST_EXTERN void NGBoolArrayRefFree(bool **a);
NATJ_TEST_EXTERN void NGByteArrayRefFree(char **a);
NATJ_TEST_EXTERN void NGShortArrayRefFree(short **a);
NATJ_TEST_EXTERN void NGCharArrayRefFree(unichar **a);
NATJ_TEST_EXTERN void NGIntArrayRefFree(int **a);
NATJ_TEST_EXTERN void NGLongArrayRefFree(long long **a);
NATJ_TEST_EXTERN void NGFloatArrayRefFree(float **a);
NATJ_TEST_EXTERN void NGDoubleArrayRefFree(double **a);

#endif /* C_Functions_Primitives_h */

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

#ifndef Structs_h
#define Structs_h

#include "Common_Defines.h"

struct NJPoint {
    NJFloat x;
    NJFloat y;
};
typedef struct NJPoint NJPoint;

struct NJSize {
    NJFloat width;
    NJFloat height;
};
typedef struct NJSize NJSize;

struct NJRect {
    NJPoint origin;
    NJSize size;
};
typedef struct NJRect NJRect;

typedef struct {
    int x;
    int y;
} NG_I_Struct;

struct NG_I2_Struct {
    int x[2];
    int y[2];
};
typedef struct NG_I2_Struct NG_I2_Struct;
typedef struct NG_I2_Struct NGIntTwoStruct;

struct _NG_ISMulti_Struct {
    NG_I_Struct p[5];
};
typedef struct _NG_ISMulti_Struct NG_ISMulti_Struct;

struct _NG_ISPtr_Struct {
    NG_I_Struct *p;
};
typedef struct _NG_ISPtr_Struct NG_ISPtr_Struct;

struct _NG_ISPtrMulti_Struct {
    NG_I_Struct *p[2][5];
};
typedef struct _NG_ISPtrMulti_Struct NG_ISPtrMulti_Struct;

struct _NG_ISPtrPtrMulti_Struct {
    NG_I_Struct **p[10];
};
typedef struct _NG_ISPtrPtrMulti_Struct NG_ISPtrPtrMulti_Struct;

struct NG_P_Struct {
    bool _bool;
    char _byte;
    short _short;
    unichar _char;
    int _int;
    long long _long;
    float _float;
    double _double;
};
typedef struct NG_P_Struct NG_P_Struct;

struct _NG_PPtr_Struct {
    bool *_bool;
    char *_byte;
    short *_short;
    unichar *_char;
    int *_int;
    long long *_long;
    float *_float;
    double *_double;
};
typedef struct _NG_PPtr_Struct NG_PPtr_Struct;

struct _NG_PPtrMulti_Struct {
    bool *_bool[1];
    char *_byte[2];
    short *_short[3];
    unichar *_char[4];
    int *_int[5];
    long long *_long[6];
    float *_float[7];
    double *_double[8];
};
typedef struct _NG_PPtrMulti_Struct NG_PPtrMulti_Struct;

struct _NG_PPtrPtr_Struct {
    bool **_bool;
    char **_byte;
    short **_short;
    unichar **_char;
    int **_int;
    long long **_long;
    float **_float;
    double **_double;
};
typedef struct _NG_PPtrPtr_Struct NG_PPtrPtr_Struct;

struct _NG_PPtrPtrMulti_Struct {
    bool **_bool[1];
    char **_byte[2];
    short **_short[3];
    unichar **_char[4];
    int **_int[5];
    long long **_long[6];
    float **_float[7];
    double **_double[8];
};
typedef struct _NG_PPtrPtrMulti_Struct NG_PPtrPtrMulti_Struct;

struct _NG_FnPtr_Struct {
    void (*cb1)(int);
    void (*cb2)(float);
    
};
typedef struct _NG_FnPtr_Struct NG_FnPtr_Struct;

#endif /* Structs_h */

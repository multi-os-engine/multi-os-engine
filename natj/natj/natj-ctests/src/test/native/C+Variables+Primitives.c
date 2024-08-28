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

#include "C+Variables+Primitives.h"

const bool kNGBoolDefault = false;
const char kNGByteDefault = 0;
const short kNGShortDefault = 0;
const unichar kNGCharDefault = 0;
const int kNGIntDefault = 0;
const long long kNGLongDefault = 0;
const float kNGFloatDefault = 0;
const double kNGDoubleDefault = 0;

const bool kNGBoolUnit = true;
const char kNGByteUnit = 1;
const short kNGShortUnit = 1;
const unichar kNGCharUnit = 1;
const int kNGIntUnit = 1;
const long long kNGLongUnit = 1LL;
const float kNGFloatUnit = 1.0f;
const double kNGDoubleUnit = 1.0;

const bool kNGBoolValueA = false;
const char kNGByteValueA = 25;
const short kNGShortValueA = 452;
const unichar kNGCharValueA = 2652;
const int kNGIntValueA = 2564;
const long long kNGLongValueA = 11951951LL;
const float kNGFloatValueA = 0.654f;
const double kNGDoubleValueA = 1232.543;

const bool kNGBoolValueB = false;
const char kNGByteValueB = 65;
const short kNGShortValueB = 32;
const unichar kNGCharValueB = 156;
const int kNGIntValueB = 23;
const long long kNGLongValueB = 61565165LL;
const float kNGFloatValueB = 5331.5f;
const double kNGDoubleValueB = 1651.1;

const bool kNGBoolValueC = true;
const char kNGByteValueC = 87;
const short kNGShortValueC = 3213;
const unichar kNGCharValueC = 3126;
const int kNGIntValueC = 896489;
const long long kNGLongValueC = 21365914LL;
const float kNGFloatValueC = 516.1f;
const double kNGDoubleValueC = 5465.6;

const bool *kNGBoolValues = 0;
const char *kNGByteValues = 0;
const short *kNGShortValues = 0;
const unichar *kNGCharValues = 0;
const int *kNGIntValues = 0;
const long long *kNGLongValues = 0;
const float *kNGFloatValues = 0;
const double *kNGDoubleValues = 0;

void NGPrepareVariablesWithPrimitivesTest() {
    kNGBoolValues = (bool *)malloc(5 * sizeof(bool));
    kNGByteValues = (char *)malloc(5 * sizeof(char));
    kNGShortValues = (short *)malloc(5 * sizeof(short));
    kNGCharValues = (unichar *)malloc(5 * sizeof(unichar));
    kNGIntValues = (int *)malloc(5 * sizeof(int));
    kNGLongValues = (long long *)malloc(5 * sizeof(long long));
    kNGFloatValues = (float *)malloc(5 * sizeof(float));
    kNGDoubleValues =(double *) malloc(5 * sizeof(double));
    bool datax[5] = { kNGBoolDefault, kNGBoolUnit, kNGBoolValueA, kNGBoolValueB, kNGBoolValueC };
    char datab[5] = { kNGByteDefault, kNGByteUnit, kNGByteValueA, kNGByteValueB, kNGByteValueC };
    short datas[5] = { kNGShortDefault, kNGShortUnit, kNGShortValueA, kNGShortValueB, kNGShortValueC };
    unichar datac[5] = { kNGCharDefault, kNGCharUnit, kNGCharValueA, kNGCharValueB, kNGCharValueC };
    int datai[5] = { kNGIntDefault, kNGIntUnit, kNGIntValueA, kNGIntValueB, kNGIntValueC };
    long long datal[5] = { kNGLongDefault, kNGLongUnit, kNGLongValueA, kNGLongValueB, kNGLongValueC };
    float dataf[5] = { kNGFloatDefault, kNGFloatUnit, kNGFloatValueA, kNGFloatValueB, kNGFloatValueC };
    double datad[5] = { kNGDoubleDefault, kNGDoubleUnit, kNGDoubleValueA, kNGDoubleValueB, kNGDoubleValueC };
    memcpy((void *)kNGBoolValues, datax, 5 * sizeof(bool));
    memcpy((void *)kNGByteValues, datab, 5 * sizeof(char));
    memcpy((void *)kNGShortValues, datas, 5 * sizeof(short));
    memcpy((void *)kNGCharValues, datac, 5 * sizeof(unichar));
    memcpy((void *)kNGIntValues, datai, 5 * sizeof(int));
    memcpy((void *)kNGLongValues, datal, 5 * sizeof(long long));
    memcpy((void *)kNGFloatValues, dataf, 5 * sizeof(float));
    memcpy((void *)kNGDoubleValues, datad, 5 * sizeof(double));
}

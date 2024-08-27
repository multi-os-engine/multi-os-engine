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

#ifndef NativeDataSource_h
#define NativeDataSource_h

#include "Structs.h"

NATJ_TEST_EXTERN void NativeDataSourceInit();

NATJ_TEST_EXTERN const bool *getBoolTestPtr();
NATJ_TEST_EXTERN const bool *getBoolZeroPtr();

NATJ_TEST_EXTERN const int8_t *getByteTestPtr();
NATJ_TEST_EXTERN const int8_t *getByteZeroPtr();

NATJ_TEST_EXTERN const int16_t *getShortTestPtr();
NATJ_TEST_EXTERN const int16_t *getShortZeroPtr();

NATJ_TEST_EXTERN const unichar *getCharTestPtr();
NATJ_TEST_EXTERN const unichar *getCharZeroPtr();

NATJ_TEST_EXTERN const wchar_t *getWCharTTestPtr();
NATJ_TEST_EXTERN const wchar_t *getWCharTZeroPtr();

NATJ_TEST_EXTERN const int32_t *getIntTestPtr();
NATJ_TEST_EXTERN const int32_t *getIntZeroPtr();

NATJ_TEST_EXTERN const NJInt *getNIntTestPtr();
NATJ_TEST_EXTERN const NJInt *getNIntZeroPtr();

NATJ_TEST_EXTERN const NJUInt *getNUIntTestPtr();
NATJ_TEST_EXTERN const NJUInt *getNUIntZeroPtr();

NATJ_TEST_EXTERN const long *getNLongTestPtr();
NATJ_TEST_EXTERN const long *getNLongZeroPtr();

NATJ_TEST_EXTERN const unsigned long *getNULongTestPtr();
NATJ_TEST_EXTERN const unsigned long *getNULongZeroPtr();

NATJ_TEST_EXTERN const int64_t *getLongTestPtr();
NATJ_TEST_EXTERN const int64_t *getLongZeroPtr();

NATJ_TEST_EXTERN const float_t *getFloatTestPtr();
NATJ_TEST_EXTERN const float_t *getFloatZeroPtr();

NATJ_TEST_EXTERN const NJFloat *getNFloatTestPtr();
NATJ_TEST_EXTERN const NJFloat *getNFloatZeroPtr();

NATJ_TEST_EXTERN const double_t *getDoubleTestPtr();
NATJ_TEST_EXTERN const double_t *getDoubleZeroPtr();

NATJ_TEST_EXTERN const NJRect *getStructTestPtr();
NATJ_TEST_EXTERN const NJRect *getStructZeroPtr();

#endif /* NativeDataSource_h */

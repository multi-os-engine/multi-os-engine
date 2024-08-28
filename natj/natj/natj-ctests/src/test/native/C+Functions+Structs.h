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

#ifndef C_Functions_Structs_h
#define C_Functions_Structs_h

#include "Common_Defines.h"
#include "Structs.h"

#pragma mark - Functions with small struct types

NATJ_TEST_EXTERN NG_I_Struct NGIStructCreate(int x, int y);
NATJ_TEST_EXTERN bool NGIStructCompare(NG_I_Struct value, int x, int y);

#pragma mark - Functions with small struct* types

NATJ_TEST_EXTERN NG_I_Struct *NGIStructCreatePtr(NG_I_Struct value);
NATJ_TEST_EXTERN bool NGIStructRefCompare(NG_I_Struct *value, int x, int y);
NATJ_TEST_EXTERN void NGIStructRefFree(NG_I_Struct *value);

#pragma mark - Functions with large struct types

NATJ_TEST_EXTERN NG_ISMulti_Struct NGISMultiStructCreate(int x, int y);
NATJ_TEST_EXTERN int NGISMultiStructFind(NG_ISMulti_Struct value, int x, int y);

#pragma mark - Functions with large struct* types

NATJ_TEST_EXTERN NG_ISMulti_Struct *NGISMultiStructCreatePtr(int x, int y);
NATJ_TEST_EXTERN void NGISMultiStructRefFree(NG_ISMulti_Struct *value);

#endif /* C_Functions_Structs_h */

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

#ifndef NATJGEN_TEST_STRUCTS__H
#define NATJGEN_TEST_STRUCTS__H

#include "moe_types.h"

typedef struct EmptyStruct {};

typedef struct {
	int f1;
} PrimStruct;

typedef struct {
	int f0;
	int f1[0];
} PrimEmptyArrayStruct;

typedef struct {
	int f1[5];
} PrimSingleArrayStruct;

typedef struct {
	int f1[5][6];
} PrimMultiArrayStruct;

typedef struct {
	void (*f1)(int a, int b);
} CallbackStruct;

typedef struct {
	CallbackStruct f1;
} StructStruct;

typedef struct SimpleLongStruct {
    unsigned long f1;
} TypedefSimpleLongStruct, *TypedefSimpleLongStructPtr;
// BUG: workaround
// typedef struct SimpleLongStruct *TypedefSimpleLongStructPtr;

#endif /* NATJGEN_TEST_STRUCTS__H */

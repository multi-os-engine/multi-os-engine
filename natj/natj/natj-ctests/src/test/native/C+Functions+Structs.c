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

#include "C+Functions+Structs.h"

#pragma mark - Functions with small struct types

NG_I_Struct NGIStructCreate(int x, int y) {
    return (NG_I_Struct) {x, y};
}

bool NGIStructCompare(NG_I_Struct value, int x, int y) {
    return value.x == x && value.y == y;
}

#pragma mark - Functions with small struct* types

NG_I_Struct *NGIStructCreatePtr(NG_I_Struct value) {
    NG_I_Struct *ptr = (NG_I_Struct *)malloc(sizeof(NG_I_Struct));
    memcpy(ptr, &value, sizeof(NG_I_Struct));
    return ptr;
}

bool NGIStructRefCompare(NG_I_Struct *value, int x, int y) {
    return value->x == x && value->y == y;
}

void NGIStructRefFree(NG_I_Struct *value) {
    free(value);
}

#pragma mark - Functions with large struct types

NG_ISMulti_Struct NGISMultiStructCreate(int x, int y) {
    NG_ISMulti_Struct value = { 0, 0, 0, 0, 0 };
    for (int i = 0; i < 5; ++i) {
        value.p[i] = NGIStructCreate(x + i - 2, y + i - 2);
    }
    return value;
}

int NGISMultiStructFind(NG_ISMulti_Struct value, int x, int y) {
    for (int i = 0; i < 5; ++i) {
        if (NGIStructCompare(value.p[i], x, y)) {
            return i;
        }
    }
    return -1;
}

#pragma mark - Functions with large struct* types

NG_ISMulti_Struct *NGISMultiStructCreatePtr(int x, int y) {
    NG_ISMulti_Struct *value = (NG_ISMulti_Struct *)malloc(sizeof(NG_ISMulti_Struct));
    for (int i = 0; i < 5; ++i) {
        value->p[i] = NGIStructCreate(x + i - 2, y + i - 2);
    }
    return value;
}

void NGISMultiStructRefFree(NG_ISMulti_Struct *value) {
    free(value);
}

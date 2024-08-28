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

#include "C+Functions+Variadic.h"
#include "Structs.h"

#define TEST_INNER(rtype, ptype, cmp)                   \
    va_list vl;                                         \
    va_start(vl, n);                                    \
                                                        \
    bool match = true;                                  \
    for (int i = 0; match && i < n; i++) {              \
        rtype _1 = va_arg(vl, ptype);                   \
        rtype _2 = va_arg(vl, ptype);                   \
        if (!(cmp)) {                                   \
            match = false;                              \
        }                                               \
    }                                                   \
                                                        \
    va_end(vl);                                         \
    return match;

#define TEST_METHOD_DIRECT(name, rtype, ptype, cmp) \
bool test##name##sWithPairNumber(uint32_t n, ...) { \
    TEST_INNER(rtype, ptype, cmp)                   \
}

#define TEST_METHOD(name, rtype, ptype, cmp)    \
TEST_METHOD_DIRECT(name, rtype, ptype, cmp)

TEST_METHOD(Boolean, uint8_t, uint32_t, _1 == _2)
TEST_METHOD(Byte, int8_t, int32_t, _1 == _2)
TEST_METHOD(Char, uint16_t, uint32_t, _1 == _2)
TEST_METHOD(Short, int16_t, int32_t, _1 == _2)
TEST_METHOD(Int, int32_t, int32_t, _1 == _2)
TEST_METHOD(Long, int64_t, int64_t, _1 == _2)
TEST_METHOD(Float, float, double, _1 == _2)
TEST_METHOD(Double, double, double, _1 == _2)

bool NJRectEqualToRect(NJRect rect1, NJRect rect2) {
    return rect1.origin.x == rect2.origin.x
    && rect1.origin.y == rect2.origin.y
    && rect1.size.width == rect2.size.width
    && rect1.size.height == rect2.size.height;
}

TEST_METHOD(CGRect, NJRect, NJRect, NJRectEqualToRect(_1, _2))
TEST_METHOD(CString, const char*, const char*, strcmp(_1, _2) == 0)

TEST_METHOD(NFloat, NJFloat, double, _1 == _2)
TEST_METHOD(NUInt, NJUInt, NJUInt, _1 == _2)
TEST_METHOD(NInt, NJInt, NJInt, _1 == _2)

TEST_METHOD(NLong, long, long, _1 == _2)
TEST_METHOD(NULong, unsigned long, unsigned long, _1 == _2)
TEST_METHOD(WCharT, wchar_t, int, _1 == _2)

#undef TEST_INNER
#undef TEST_METHOD_DIRECT
#undef TEST_METHOD_BLOCK
#undef TEST_METHOD

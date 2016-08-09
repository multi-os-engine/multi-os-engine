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

#import "ObjC+Methods+Variadic.h"

#import <CoreGraphics/CoreGraphics.h>

@implementation VariadicClass

#define TEST_INNER(rtype, ptype, cmp)                   \
    va_list vl;                                         \
    va_start(vl, n);                                    \
                                                        \
    BOOL match = true;                                  \
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

#define TEST_METHOD_DIRECT(name, rtype, ptype, cmp)     \
+ (BOOL) test##name##sWithPairNumber:(uint32_t)n, ... { \
    TEST_INNER(rtype, ptype, cmp)                       \
}

#define TEST_METHOD_BLOCK(name, rtype, ptype, cmp) \
+ (BOOL(^)(uint32_t, ...)) blockFor##name##s {     \
    return ^(uint32_t n, ...) {                    \
        TEST_INNER(rtype, ptype, cmp)              \
    };                                             \
}

#define TEST_METHOD(name, rtype, ptype, cmp)    \
    TEST_METHOD_DIRECT(name, rtype, ptype, cmp) \
    TEST_METHOD_BLOCK(name, rtype, ptype, cmp)

TEST_METHOD(Boolean, uint8_t, uint32_t, _1 == _2)
TEST_METHOD(Byte, int8_t, int32_t, _1 == _2)
TEST_METHOD(Char, uint16_t, uint32_t, _1 == _2)
TEST_METHOD(Short, int16_t, int32_t, _1 == _2)
TEST_METHOD(Int, int32_t, int32_t, _1 == _2)
TEST_METHOD(Long, int64_t, int64_t, _1 == _2)

TEST_METHOD(Float, float, double, _1 == _2)
TEST_METHOD_BLOCK(UnboxingFloat, float, double, _1 == _2)
TEST_METHOD_BLOCK(ExplicitUnboxingFloat, float, double, _1 == _2)

TEST_METHOD(Double, double, double, _1 == _2)

TEST_METHOD(CGRect, CGRect, CGRect, CGRectEqualToRect(_1, _2))
TEST_METHOD(CString, const char*, const char*, strcmp(_1, _2) == 0)

TEST_METHOD(BoxedFloat, id, id,
            [_1 isKindOfClass:NSClassFromString(@"java.lang.Float")] &&
            [_2 isKindOfClass:NSClassFromString(@"java.lang.Float")])
TEST_METHOD_BLOCK(ExplicitBoxedFloat, id, id,
            [_1 isKindOfClass:NSClassFromString(@"java.lang.Float")] &&
            [_2 isKindOfClass:NSClassFromString(@"java.lang.Float")])

TEST_METHOD(NFloat, CGFloat, double, _1 == _2)
TEST_METHOD_BLOCK(ExplicitNFloat, CGFloat, double, _1 == _2)

TEST_METHOD(NUInt, NSUInteger, NSUInteger, _1 == _2)
TEST_METHOD_BLOCK(ExplicitNUInt, NSUInteger, NSUInteger, _1 == _2)

TEST_METHOD(NInt, NSInteger, NSInteger, _1 == _2)
TEST_METHOD_BLOCK(ExplicitNInt, NSInteger, NSInteger, _1 == _2)

TEST_METHOD(NLong, long, long, _1 == _2)
TEST_METHOD_BLOCK(ExplicitNLong, long, long, _1 == _2)

TEST_METHOD(NULong, unsigned long, unsigned long, _1 == _2)
TEST_METHOD_BLOCK(ExplicitNULong, unsigned long, unsigned long, _1 == _2)

TEST_METHOD(WCharT, wchar_t, uint32_t, _1 == _2)
TEST_METHOD_BLOCK(ExplicitWCharT, wchar_t, uint32_t, _1 == _2)

#undef TEST_INNER
#undef TEST_METHOD_DIRECT
#undef TEST_METHOD_BLOCK
#undef TEST_METHOD

@end

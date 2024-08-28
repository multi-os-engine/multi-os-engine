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

#import <Foundation/Foundation.h>

@interface VariadicClass : NSObject

#define TEST_METHOD_DIRECT(name)                       \
+ (BOOL) test##name##sWithPairNumber:(uint32_t)n, ...;

#define TEST_METHOD_BLOCK(name)               \
+ (BOOL(^)(uint32_t, ...)) blockFor##name##s;

#define TEST_METHOD(name) \
TEST_METHOD_DIRECT(name)  \
TEST_METHOD_BLOCK(name)

TEST_METHOD(Boolean)
TEST_METHOD(Byte)
TEST_METHOD(Char)
TEST_METHOD(Short)
TEST_METHOD(Int)
TEST_METHOD(Long)

TEST_METHOD(Float)
TEST_METHOD_BLOCK(UnboxingFloat)
TEST_METHOD_BLOCK(ExplicitUnboxingFloat)

TEST_METHOD(Double)

TEST_METHOD(CGRect)
TEST_METHOD(CString)

TEST_METHOD(BoxedFloat)
TEST_METHOD_BLOCK(ExplicitBoxedFloat)

TEST_METHOD(NFloat)
TEST_METHOD_BLOCK(ExplicitNFloat)

TEST_METHOD(NUInt)
TEST_METHOD_BLOCK(ExplicitNUInt)

TEST_METHOD(NInt)
TEST_METHOD_BLOCK(ExplicitNInt)

TEST_METHOD(NLong)
TEST_METHOD_BLOCK(ExplicitNLong)

TEST_METHOD(NULong)
TEST_METHOD_BLOCK(ExplicitNULong)

TEST_METHOD(WCharT)
TEST_METHOD_BLOCK(ExplicitWCharT)

#undef TEST_METHOD_DIRECT
#undef TEST_METHOD_BLOCK
#undef TEST_METHOD

+ (BOOL) testFirstArgString:(NSString *)str withVariadics:(NSString *) others,
    ...;

@end

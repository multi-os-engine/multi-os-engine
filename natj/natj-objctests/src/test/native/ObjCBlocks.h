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
#import <CoreGraphics/CoreGraphics.h>

#define MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(__name, __type) \
+ (void)execBlockWith ## __name:(void (^)(__type))value;

@interface ObjCBlocks : NSObject

+ (bool (^)(bool, int8_t, uint16_t, double, float, int32_t, int64_t, int16_t, CGSize,
            bool, int8_t, uint16_t, double, float, int32_t, int64_t, int16_t, CGSize))getMultipleBlock;
+ (bool (^)(bool, bool))getBooleanAnderBlock;
+ (int8_t (^)(int8_t, int8_t))getByteMultiplierBlock;
+ (unichar (^)(unichar, unichar))getCharMultiplierBlock;
+ (int16_t (^)(int16_t, int16_t))getShortMultiplierBlock;
+ (int32_t (^)(int32_t, int32_t))getIntMultiplierBlock;
+ (int64_t (^)(int64_t, int64_t))getLongMultiplierBlock;
+ (float (^)(float, float))getFloatMultiplierBlock;
+ (double (^)(double, double))getDoubleMultiplierBlock;
+ (void (^)(NSMutableArray*, NSString*, NSString*))getVoidStringArrayElementAdderBlock;
+ (NSMutableArray* (^)(NSString*, NSString*))getStringArrayElementAdderBlock;
+ (NSString* (^)(NSString*, NSString*))getStringConcatenaterBlock;
+ (NSInteger (^)(NSInteger, NSInteger))getNIntAdder;
+ (NSUInteger (^)(NSUInteger, NSUInteger))getNUIntAdder;
+ (CGFloat (^)(CGFloat, CGFloat))getNFloatAdder;
+ (void (^)(NSError**))getBlockWithOutArg;

MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Bool, bool)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Byte, int8_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Short, int16_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Char, unichar)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Int, int32_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Long, int64_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Float, float)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Double, double)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(Struct, CGSize)

MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(BoolPtr, bool*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(BytePtr, int8_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ShortPtr, int16_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(CharPtr, unichar*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(IntPtr, int32_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(LongPtr, int64_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(FloatPtr, float*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(DoublePtr, double*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(StructPtr, CGSize*)

+ (void)execBlockWithStructPtr2:(void (^)(uint64_t, CGPoint*))value;
+ (bool)validateExecBlockWithStructPtr2:(CGPoint*)value;

MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstBoolPtr, const bool*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstBytePtr, const int8_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstShortPtr, const int16_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstCharPtr, const unichar*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstIntPtr, const int32_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstLongPtr, const int64_t*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstFloatPtr, const float*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstDoublePtr, const double*)
MOE_NATJGEN_TEST_BLOCK_EXEC_DECL(ConstStructPtr, const CGSize*)

@end

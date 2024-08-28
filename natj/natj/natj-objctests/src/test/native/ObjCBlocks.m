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

#import "ObjCBlocks.h"

typedef struct {
    CGPoint pt;
    uint64_t extra;
} CGPointExtended;

@implementation ObjCBlocks

+ (bool (^)(bool, int8_t, uint16_t, double, float, int32_t, int64_t, int16_t, CGSize,
            bool, int8_t, uint16_t, double, float, int32_t, int64_t, int16_t, CGSize))getMultipleBlock {
    return ^bool (bool bo1, int8_t by1, uint16_t ch1, double do1, float fl1, int32_t in1, int64_t lo1, int16_t sh1, CGSize si1,
                  bool bo2, int8_t by2, uint16_t ch2, double do2, float fl2, int32_t in2, int64_t lo2, int16_t sh2, CGSize si2) {
        return (bo1 == bo2) && (by1 == by2) && (ch1 == ch2) && (do1 == do2) && (fl1 == fl2) && (in1 == in2) && (lo1 == lo2) && (sh1 == sh2) && (bo1 == bo2) && (si1.width == si2.width) && (si1.height == si2.height);
    };
}

+ (bool (^)(bool, bool))getBooleanAnderBlock {
    return ^bool (bool a, bool b) {
        return a && b;
    };
}

+ (int8_t (^)(int8_t, int8_t))getByteMultiplierBlock {
    return ^int8_t(int8_t a, int8_t b) {
        return a * b;
    };
}

+ (unichar (^)(unichar, unichar))getCharMultiplierBlock {
    return ^unichar (unichar a, unichar b) {
        return a * b;
    };
}

+ (int16_t (^)(int16_t, int16_t))getShortMultiplierBlock {
    return ^int16_t (int16_t a, int16_t b) {
        return a * b;
    };
}

+ (int32_t (^)(int32_t, int32_t))getIntMultiplierBlock {
    return ^int32_t (int32_t a, int32_t b) {
        return a * b;
    };
}

+ (int64_t (^)(int64_t, int64_t))getLongMultiplierBlock {
    return ^int64_t (int64_t a, int64_t b) {
        return a * b;
    };
}

+ (float (^)(float, float))getFloatMultiplierBlock {
    return ^float (float a, float b) {
        return a * b;
    };
}

+ (double (^)(double, double))getDoubleMultiplierBlock {
    return ^double (double a, double b) {
        return a * b;
    };
}

+ (void (^)(NSMutableArray*, NSString*, NSString*))getVoidStringArrayElementAdderBlock {
    return ^void (NSMutableArray* array, NSString* a, NSString* b) {
        [array addObject:a];
        [array addObject:b];
    };
}

+ (NSMutableArray* (^)(NSString*, NSString*))getStringArrayElementAdderBlock {
    return ^NSMutableArray* (NSString* a, NSString* b) {
        return [NSMutableArray arrayWithObjects:a, b, nil];
    };
}

+ (NSString* (^)(NSString*, NSString*))getStringConcatenaterBlock {
    return ^NSString* (NSString* a, NSString* b) {
        return [a stringByAppendingString:b];
    };
}

+ (NSInteger (^)(NSInteger, NSInteger))getNIntAdder {
    return ^NSInteger(NSInteger a, NSInteger b) {
        return a + b;
    };
}

+ (NSUInteger (^)(NSUInteger, NSUInteger))getNUIntAdder {
    return ^NSUInteger(NSUInteger a, NSUInteger b) {
        return a + b;
    };
}

+ (CGFloat (^)(CGFloat, CGFloat))getNFloatAdder {
    return ^CGFloat(CGFloat a, CGFloat b) {
        return a + b;
    };
}

+ (void (^)(NSError**))getBlockWithOutArg {
    return ^(NSError** error) {
        error[0] = [[[NSError alloc] initWithDomain:@"test" code:123 userInfo:nil] autorelease];
    };
}

#define MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(__name, __type, __value)\
+ (void)execBlockWith ## __name:(void (^)(__type))value { value((__type)__value); }

#define MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(__name, __type)\
+ (void)execBlockWith ## __name:(void (^)(__type*))value {\
__type* var = calloc(sizeof(__type), 1);\
value(var);\
free(var);\
}

#define MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(__name, __type)\
+ (void)execBlockWith ## __name:(void (^)(const __type*))value {\
const __type* var = calloc(sizeof(__type), 1);\
value(var);\
free((void*)var);\
}

MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Bool, bool, 1)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Byte, int8_t, 0xFA)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Short, int16_t, 0xFAFA)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Char, unichar, 0xFAFA)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Int, int32_t, 0xFAFAFAFA)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Long, int64_t, 0xFAFAFAFAFAFAFAFA)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Float, float, 3.14f)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Double, double, 3.14)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF(Struct, CGSize, CGSizeMake(10.0, 20.0))

MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(BoolPtr, bool)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(BytePtr, int8_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(ShortPtr, int16_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(CharPtr, unichar)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(IntPtr, int32_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(LongPtr, int64_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(FloatPtr, float)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(DoublePtr, double)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF2(StructPtr, CGSize)

+ (void)execBlockWithStructPtr2:(void (^)(uint64_t, CGPoint*))value {
    CGPointExtended* var = calloc(sizeof(CGPointExtended), 1);
    var->pt = CGPointMake(10.0, 20.0);
    var->extra = 0xFEFEFEFEFEFEFEFEL;
    value((uint64_t)var, (CGPoint*)var);
    free(var);
}

+ (bool)validateExecBlockWithStructPtr2:(CGPoint*)value {
    return ((CGPointExtended*)value)->extra == 0xFEFEFEFEFEFEFEFEL;
}

MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstBoolPtr, bool)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstBytePtr, int8_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstShortPtr, int16_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstCharPtr, unichar)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstIntPtr, int32_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstLongPtr, int64_t)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstFloatPtr, float)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstDoublePtr, double)
MOE_NATJGEN_TEST_BLOCK_EXEC_DEF3(ConstStructPtr, CGSize)

@end

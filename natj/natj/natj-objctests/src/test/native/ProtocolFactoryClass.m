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

#import "ProtocolFactoryClass.h"

#import <objc/runtime.h>

@interface ProxiedProtocolImplementor : NSObject<ProxiedValueProtocol,
                                                 ProxiedPtrProtocol,
                                                 ProxiedConstPtrProtocol>

@end

@implementation ProxiedProtocolImplementor

- (BOOL)returnBool:(BOOL)value { return value; }
- (uint8_t)returnByte:(uint8_t)value { return value; }
- (uint16_t)returnChar:(uint16_t)value { return value; }
- (double)returnDouble:(double)value { return value; }
- (float)returnFloat:(float)value { return value; }
- (int32_t)returnInt:(int32_t)value { return value; }
- (int64_t)returnLong:(int64_t)value { return value; }
- (int16_t)returnShort:(int16_t)value { return value; }
- (CGSize)returnStruct:(CGSize)value { return value; }
- (BOOL)checkMultiple:(BOOL)bo1 :(int8_t)by1 :(uint16_t)ch1 :(double)do1 :(float)fl1 :(int32_t)in1 :(int64_t)lo1 :(int16_t)sh1 :(CGSize)si1
                     :(BOOL)bo2 :(int8_t)by2 :(uint16_t)ch2 :(double)do2 :(float)fl2 :(int32_t)in2 :(int64_t)lo2 :(int16_t)sh2 :(CGSize)si2 {
    return (bo1 == bo2) && (by1 == by2) && (ch1 == ch2) && (do1 == do2) && (fl1 == fl2) && (in1 == in2) && (lo1 == lo2) && (sh1 == sh2) && (bo1 == bo2) && (si1.width == si2.width) && (si1.height == si2.height);
}

- (BOOL)returnBoolPtr:(BOOL*)value { return *value; }
- (uint8_t)returnBytePtr:(uint8_t*)value { return *value; }
- (uint16_t)returnCharPtr:(uint16_t*)value { return *value; }
- (double)returnDoublePtr:(double*)value { return *value; }
- (float)returnFloatPtr:(float*)value { return *value; }
- (int32_t)returnIntPtr:(int32_t*)value { return *value; }
- (int64_t)returnLongPtr:(int64_t*)value { return *value; }
- (int16_t)returnShortPtr:(int16_t*)value { return *value; }
- (CGSize)returnStructPtr2:(CGSize*)value { return *value; }
- (CGSize)returnStructPtr:(CGSize*)value { return *value; }

- (BOOL)returnConstBoolPtr:(BOOL*)value { return *value; }
- (uint8_t)returnConstBytePtr:(uint8_t*)value { return *value; }
- (uint16_t)returnConstCharPtr:(uint16_t*)value { return *value; }
- (double)returnConstDoublePtr:(double*)value { return *value; }
- (float)returnConstFloatPtr:(float*)value { return *value; }
- (int32_t)returnConstIntPtr:(int32_t*)value { return *value; }
- (int64_t)returnConstLongPtr:(int64_t*)value { return *value; }
- (int16_t)returnConstShortPtr:(int16_t*)value { return *value; }
- (CGSize)returnConstStructPtr:(CGSize*)value { return *value; }

@end

@interface ProxiedCastableProtocolImplementor : NSObject<ProxiedValueProtocol>

@end

@implementation ProxiedCastableProtocolImplementor

- (BOOL)returnBool:(BOOL)value { return value; }
- (uint8_t)returnByte:(uint8_t)value { return value; }
- (uint16_t)returnChar:(uint16_t)value { return value; }
- (double)returnDouble:(double)value { return value; }
- (float)returnFloat:(float)value { return value; }
- (int32_t)returnInt:(int32_t)value { return value; }
- (int64_t)returnLong:(int64_t)value { return value; }
- (int16_t)returnShort:(int16_t)value { return value; }
- (CGSize)returnStruct:(CGSize)value { return value; }
- (BOOL)checkMultiple:(BOOL)bo1 :(int8_t)by1 :(uint16_t)ch1 :(double)do1 :(float)fl1 :(int32_t)in1 :(int64_t)lo1 :(int16_t)sh1 :(CGSize)si1
                     :(BOOL)bo2 :(int8_t)by2 :(uint16_t)ch2 :(double)do2 :(float)fl2 :(int32_t)in2 :(int64_t)lo2 :(int16_t)sh2 :(CGSize)si2 {
    return (bo1 == bo2) && (by1 == by2) && (ch1 == ch2) && (do1 == do2) && (fl1 == fl2) && (in1 == in2) && (lo1 == lo2) && (sh1 == sh2) && (bo1 == bo2) && (si1.width == si2.width) && (si1.height == si2.height);
}

@end

@implementation ProtocolFactoryClass

- (id)init {
    self = [super init];
    if (self != nil) {
        implementor = [[ProxiedProtocolImplementor alloc] init];
        castableImplementor = [[ProxiedCastableProtocolImplementor alloc] init];
    }
    return self;
}

- (id<ProxiedValueProtocol>)valueObject {
    return implementor;
}

- (id<ProxiedPtrProtocol>)ptrObject {
    return implementor;
}

- (id<ProxiedConstPtrProtocol>)constPtrObject {
    return implementor;
}

- (id)castableValueObject {
    return castableImplementor;
}

- (BOOL)checkTransparentValueObject:(NSObject<ProxiedValueProtocol>*)transparent
       andNonTransparentValueObject:(NSObject<ProxiedValueProtocol>*)nonTransparent {
    if (transparent == nonTransparent) {
        return NO;
    }
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wundeclared-selector"
    if (!class_respondsToSelector(object_getClass(nonTransparent), @selector(instance))) {
#pragma clang diagnostic pop
        return NO;
    }
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wobjc-method-access"
    id<ProxiedValueProtocol> instance = [nonTransparent instance];
#pragma clang diagnostic pop
    if (instance != transparent) {
        return NO;
    }
    if ([transparent returnLong:0xFAFAFAFAFAFAFAFA] != 0xFAFAFAFAFAFAFAFA) {
        return NO;
    }
    if ([nonTransparent returnLong:0xFAFAFAFAFAFAFAFA] != 0xFAFAFAFAFAFAFAFA) {
        return NO;
    }
    return YES;
}

@end

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

@protocol ProxiedValueProtocol

- (BOOL)returnBool:(BOOL)value;
- (uint8_t)returnByte:(uint8_t)value;
- (uint16_t)returnChar:(uint16_t)value;
- (double)returnDouble:(double)value;
- (float)returnFloat:(float)value;
- (int32_t)returnInt:(int32_t)value;
- (int64_t)returnLong:(int64_t)value;
- (int16_t)returnShort:(int16_t)value;
- (CGSize)returnStruct:(CGSize)value;
- (BOOL)checkMultiple:(BOOL)bo1 :(int8_t)by1 :(uint16_t)ch1 :(double)do1 :(float)fl1 :(int32_t)in1 :(int64_t)lo1 :(int16_t)sh1 :(CGSize)si1
                     :(BOOL)bo2 :(int8_t)by2 :(uint16_t)ch2 :(double)do2 :(float)fl2 :(int32_t)in2 :(int64_t)lo2 :(int16_t)sh2 :(CGSize)si2;

@end

@protocol ProxiedPtrProtocol

- (BOOL)returnBoolPtr:(BOOL*)value;
- (uint8_t)returnBytePtr:(uint8_t*)value;
- (uint16_t)returnCharPtr:(uint16_t*)value;
- (double)returnDoublePtr:(double*)value;
- (float)returnFloatPtr:(float*)value;
- (int32_t)returnIntPtr:(int32_t*)value;
- (int64_t)returnLongPtr:(int64_t*)value;
- (int16_t)returnShortPtr:(int16_t*)value;
- (CGSize)returnStructPtr2:(CGSize*)value;
- (CGSize)returnStructPtr:(CGSize*)value;

@end

@protocol ProxiedConstPtrProtocol

- (BOOL)returnConstBoolPtr:(BOOL*)value;
- (uint8_t)returnConstBytePtr:(uint8_t*)value;
- (uint16_t)returnConstCharPtr:(uint16_t*)value;
- (double)returnConstDoublePtr:(double*)value;
- (float)returnConstFloatPtr:(float*)value;
- (int32_t)returnConstIntPtr:(int32_t*)value;
- (int64_t)returnConstLongPtr:(int64_t*)value;
- (int16_t)returnConstShortPtr:(int16_t*)value;
- (CGSize)returnConstStructPtr:(CGSize*)value;

@end

@interface ProtocolFactoryClass : NSObject {
    id<ProxiedValueProtocol, ProxiedPtrProtocol, ProxiedConstPtrProtocol> implementor;
    id castableImplementor;
}

- (id<ProxiedValueProtocol>)valueObject;

- (id<ProxiedPtrProtocol>)ptrObject;

- (id<ProxiedConstPtrProtocol>)constPtrObject;

- (id)castableValueObject;

- (BOOL)checkTransparentValueObject:(NSObject<ProxiedValueProtocol>*)transparent
       andNonTransparentValueObject:(NSObject<ProxiedValueProtocol>*)nonTransparent;

@end

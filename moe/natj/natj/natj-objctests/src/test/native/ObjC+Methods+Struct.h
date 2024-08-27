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
#import "Structs.h"

@interface StructClass : NSObject

#pragma mark - Instance methods with small struct types

- (NG_I_Struct) IStructCreate:(int)x :(int)y;
- (bool) IStructCompare:(NG_I_Struct)value :(int)x :(int)y;

#pragma mark - Instance methods with small struct* types

- (NG_I_Struct *) IStructCreatePtr:(NG_I_Struct)value;
- (bool) IStructRefCompare:(NG_I_Struct *)value :(int)x :(int)y;
- (void) IStructRefFree:(NG_I_Struct *)value;

#pragma mark - Instance methods with large struct types

- (NG_ISMulti_Struct) ISMultiStructCreate:(int)x :(int)y;
- (int) ISMultiStructFind:(NG_ISMulti_Struct)value :(int)x :(int)y;

#pragma mark - Instance methods with large struct* types

- (NG_ISMulti_Struct *) ISMultiStructCreatePtr:(int)x :(int)y;
- (void) ISMultiStructRefFree:(NG_ISMulti_Struct *)value;

#pragma mark - Class methods with small struct types

+ (NG_I_Struct) IStructCreate:(int)x :(int)y;
+ (bool) IStructCompare:(NG_I_Struct)value :(int)x :(int)y;

#pragma mark - Class methods with small struct* types

+ (NG_I_Struct *) IStructCreatePtr:(NG_I_Struct)value;
+ (bool) IStructRefCompare:(NG_I_Struct *)value :(int)x :(int)y;
+ (void) IStructRefFree:(NG_I_Struct *)value;

#pragma mark - Class methods with large struct types

+ (NG_ISMulti_Struct) ISMultiStructCreate:(int)x :(int)y;
+ (int) ISMultiStructFind:(NG_ISMulti_Struct)value :(int)x :(int)y;

#pragma mark - Class methods with large struct* types

+ (NG_ISMulti_Struct *) ISMultiStructCreatePtr:(int)x :(int)y;
+ (void) ISMultiStructRefFree:(NG_ISMulti_Struct *)value;

@end

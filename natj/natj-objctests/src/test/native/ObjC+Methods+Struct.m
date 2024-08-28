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

#import "ObjC+Methods+Struct.h"

@implementation StructClass

#pragma mark - Instance methods with small struct types

- (NG_I_Struct) IStructCreate:(int)x :(int)y {
    return (NG_I_Struct) {x, y};
}

- (bool) IStructCompare:(NG_I_Struct)value :(int)x :(int)y {
    return value.x == x && value.y == y;
}

#pragma mark - Instance methods with small struct* types

- (NG_I_Struct *) IStructCreatePtr:(NG_I_Struct)value {
    NG_I_Struct *ptr = malloc(sizeof(NG_I_Struct));
    memcpy(ptr, &value, sizeof(NG_I_Struct));
    return ptr;
}

- (bool) IStructRefCompare:(NG_I_Struct *)value :(int)x :(int)y {
    return value->x == x && value->y == y;
}

- (void) IStructRefFree:(NG_I_Struct *)value {
    free(value);
}

#pragma mark - Instance methods with large struct types

- (NG_ISMulti_Struct) ISMultiStructCreate:(int)x :(int)y {
    NG_ISMulti_Struct value;
    memset(&value, 0, sizeof(NG_ISMulti_Struct));
    for (int i = 0; i < 5; ++i) {
        value.p[i] = [self IStructCreate:x + i - 2 :y + i - 2];
    }
    return value;
}

- (int) ISMultiStructFind:(NG_ISMulti_Struct)value :(int)x :(int)y {
    for (int i = 0; i < 5; ++i) {
        if ([self IStructCompare:value.p[i] :x :y]) {
            return i;
        }
    }
    return -1;
}

#pragma mark - Instance methods with large struct* types

- (NG_ISMulti_Struct *) ISMultiStructCreatePtr:(int)x :(int)y {
    NG_ISMulti_Struct *value = malloc(sizeof(NG_ISMulti_Struct));
    for (int i = 0; i < 5; ++i) {
        value->p[i] = [self IStructCreate:x + i - 2 :y + i - 2];
    }
    return value;
}

- (void) ISMultiStructRefFree:(NG_ISMulti_Struct *)value {
    free(value);
}

#pragma mark - Class methods with small struct types

+ (NG_I_Struct) IStructCreate:(int)x :(int)y {
    return (NG_I_Struct) {x, y};
}

+ (bool) IStructCompare:(NG_I_Struct)value :(int)x :(int)y {
    return value.x == x && value.y == y;
}

#pragma mark - Class methods with small struct* types

+ (NG_I_Struct *) IStructCreatePtr:(NG_I_Struct)value {
    NG_I_Struct *ptr = malloc(sizeof(NG_I_Struct));
    memcpy(ptr, &value, sizeof(NG_I_Struct));
    return ptr;
}

+ (bool) IStructRefCompare:(NG_I_Struct *)value :(int)x :(int)y {
    return value->x == x && value->y == y;
}

+ (void) IStructRefFree:(NG_I_Struct *)value {
    free(value);
}

#pragma mark - Class methods with large struct types

+ (NG_ISMulti_Struct) ISMultiStructCreate:(int)x :(int)y {
    NG_ISMulti_Struct value;
    memset(&value, 0, sizeof(NG_ISMulti_Struct));
    for (int i = 0; i < 5; ++i) {
        value.p[i] = [self IStructCreate:x + i - 2 :y + i - 2];
    }
    return value;
}

+ (int) ISMultiStructFind:(NG_ISMulti_Struct)value :(int)x :(int)y {
    for (int i = 0; i < 5; ++i) {
        if ([self IStructCompare:value.p[i] :x :y]) {
            return i;
        }
    }
    return -1;
}

#pragma mark - Class methods with large struct* types

+ (NG_ISMulti_Struct *) ISMultiStructCreatePtr:(int)x :(int)y {
    NG_ISMulti_Struct *value = malloc(sizeof(NG_ISMulti_Struct));
    for (int i = 0; i < 5; ++i) {
        value->p[i] = [self IStructCreate:x + i - 2 :y + i - 2];
    }
    return value;
}

+ (void) ISMultiStructRefFree:(NG_ISMulti_Struct *)value {
    free(value);
}

@end

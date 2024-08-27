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

@interface PrimitiveClass : NSObject

#pragma mark - Instance methods with primitive types

- (bool) boolCreate :(bool)a;
- (char) byteCreate :(char)a;
- (short) shortCreate :(short)a;
- (unichar) charCreate :(unichar)a;
- (int) intCreate :(int)a;
- (long long) longCreate :(long long)a;
- (float) floatCreate :(float)a;
- (double) doubleCreate :(double)a;

- (bool) boolCompare :(bool)a :(bool)b;
- (bool) byteCompare :(char)a :(char)b;
- (bool) shortCompare :(short)a :(short)b;
- (bool) charCompare :(unichar)a :(unichar)b;
- (bool) intCompare :(int)a :(int)b;
- (bool) longCompare :(long long)a :(long long)b;
- (bool) floatCompare :(float)a :(float)b;
- (bool) doubleCompare :(double)a :(double)b;

#pragma mark - Instance methods with primitive* types

- (bool *) boolCreateArray :(int)count;
- (char *) byteCreateArray :(int)count;
- (short *) shortCreateArray :(int)count;
- (unichar *) charCreateArray :(int)count;
- (int *) intCreateArray :(int)count;
- (long long *) longCreateArray :(int)count;
- (float *) floatCreateArray :(int)count;
- (double *) doubleCreateArray :(int)count;

- (bool) boolArrayCompare :(bool *)a :(bool *)b :(int)count;
- (bool) byteArrayCompare :(char *)a :(char *)b :(int)count;
- (bool) shortArrayCompare :(short *)a :(short *)b :(int)count;
- (bool) charArrayCompare :(unichar *)a :(unichar *)b :(int)count;
- (bool) intArrayCompare :(int *)a :(int *)b :(int)count;
- (bool) longArrayCompare :(long long *)a :(long long *)b :(int)count;
- (bool) floatArrayCompare :(float *)a :(float *)b :(int)count;
- (bool) doubleArrayCompare :(double *)a :(double *)b :(int)count;

- (void) boolArrayFree :(bool *)a;
- (void) byteArrayFree :(char *)a;
- (void) shortArrayFree :(short *)a;
- (void) charArrayFree :(unichar *)a;
- (void) intArrayFree :(int *)a;
- (void) longArrayFree :(long long *)a;
- (void) floatArrayFree :(float *)a;
- (void) doubleArrayFree :(double *)a;

#pragma mark - Instance methods with primitive** types

- (bool **) boolCreateArrayRef :(bool *)array;
- (char **) byteCreateArrayRef :(char *)array;
- (short **) shortCreateArrayRef :(short *)array;
- (unichar **) charCreateArrayRef :(unichar *)array;
- (int **) intCreateArrayRef :(int *)array;
- (long long **) longCreateArrayRef :(long long *)array;
- (float **) floatCreateArrayRef :(float *)array;
- (double **) doubleCreateArrayRef :(double *)array;

- (bool) boolArrayRefCompare :(bool **)a :(bool *)b :(int)count;
- (bool) byteArrayRefCompare :(char **)a :(char *)b :(int)count;
- (bool) shortArrayRefCompare :(short **)a :(short *)b :(int)count;
- (bool) charArrayRefCompare :(unichar **)a :(unichar *)b :(int)count;
- (bool) intArrayRefCompare :(int **)a :(int *)b :(int)count;
- (bool) longArrayRefCompare :(long long **)a :(long long *)b :(int)count;
- (bool) floatArrayRefCompare :(float **)a :(float *)b :(int)count;
- (bool) doubleArrayRefCompare :(double **)a :(double *)b :(int)count;

- (void) boolArrayRefFree :(bool **)a;
- (void) byteArrayRefFree :(char **)a;
- (void) shortArrayRefFree :(short **)a;
- (void) charArrayRefFree :(unichar **)a;
- (void) intArrayRefFree :(int **)a;
- (void) longArrayRefFree :(long long **)a;
- (void) floatArrayRefFree :(float **)a;
- (void) doubleArrayRefFree :(double **)a;

#pragma mark - Class methods with primitive types

+ (bool) boolCreate :(bool)a;
+ (char) byteCreate :(char)a;
+ (short) shortCreate :(short)a;
+ (unichar) charCreate :(unichar)a;
+ (int) intCreate :(int)a;
+ (long long) longCreate :(long long)a;
+ (float) floatCreate :(float)a;
+ (double) doubleCreate :(double)a;

+ (bool) boolCompare :(bool)a :(bool)b;
+ (bool) byteCompare :(char)a :(char)b;
+ (bool) shortCompare :(short)a :(short)b;
+ (bool) charCompare :(unichar)a :(unichar)b;
+ (bool) intCompare :(int)a :(int)b;
+ (bool) longCompare :(long long)a :(long long)b;
+ (bool) floatCompare :(float)a :(float)b;
+ (bool) doubleCompare :(double)a :(double)b;

#pragma mark - Class methods with primitive* types

+ (bool *) boolCreateArray :(int)count;
+ (char *) byteCreateArray :(int)count;
+ (short *) shortCreateArray :(int)count;
+ (unichar *) charCreateArray :(int)count;
+ (int *) intCreateArray :(int)count;
+ (long long *) longCreateArray :(int)count;
+ (float *) floatCreateArray :(int)count;
+ (double *) doubleCreateArray :(int)count;

+ (bool) boolArrayCompare :(bool *)a :(bool *)b :(int)count;
+ (bool) byteArrayCompare :(char *)a :(char *)b :(int)count;
+ (bool) shortArrayCompare :(short *)a :(short *)b :(int)count;
+ (bool) charArrayCompare :(unichar *)a :(unichar *)b :(int)count;
+ (bool) intArrayCompare :(int *)a :(int *)b :(int)count;
+ (bool) longArrayCompare :(long long *)a :(long long *)b :(int)count;
+ (bool) floatArrayCompare :(float *)a :(float *)b :(int)count;
+ (bool) doubleArrayCompare :(double *)a :(double *)b :(int)count;

+ (void) boolArrayFree :(bool *)a;
+ (void) byteArrayFree :(char *)a;
+ (void) shortArrayFree :(short *)a;
+ (void) charArrayFree :(unichar *)a;
+ (void) intArrayFree :(int *)a;
+ (void) longArrayFree :(long long *)a;
+ (void) floatArrayFree :(float *)a;
+ (void) doubleArrayFree :(double *)a;

#pragma mark - Class methods with primitive** types

+ (bool **) boolCreateArrayRef :(bool *)array;
+ (char **) byteCreateArrayRef :(char *)array;
+ (short **) shortCreateArrayRef :(short *)array;
+ (unichar **) charCreateArrayRef :(unichar *)array;
+ (int **) intCreateArrayRef :(int *)array;
+ (long long **) longCreateArrayRef :(long long *)array;
+ (float **) floatCreateArrayRef :(float *)array;
+ (double **) doubleCreateArrayRef :(double *)array;

+ (bool) boolArrayRefCompare :(bool **)a :(bool *)b :(int)count;
+ (bool) byteArrayRefCompare :(char **)a :(char *)b :(int)count;
+ (bool) shortArrayRefCompare :(short **)a :(short *)b :(int)count;
+ (bool) charArrayRefCompare :(unichar **)a :(unichar *)b :(int)count;
+ (bool) intArrayRefCompare :(int **)a :(int *)b :(int)count;
+ (bool) longArrayRefCompare :(long long **)a :(long long *)b :(int)count;
+ (bool) floatArrayRefCompare :(float **)a :(float *)b :(int)count;
+ (bool) doubleArrayRefCompare :(double **)a :(double *)b :(int)count;

+ (void) boolArrayRefFree :(bool **)a;
+ (void) byteArrayRefFree :(char **)a;
+ (void) shortArrayRefFree :(short **)a;
+ (void) charArrayRefFree :(unichar **)a;
+ (void) intArrayRefFree :(int **)a;
+ (void) longArrayRefFree :(long long **)a;
+ (void) floatArrayRefFree :(float **)a;
+ (void) doubleArrayRefFree :(double **)a;

@end

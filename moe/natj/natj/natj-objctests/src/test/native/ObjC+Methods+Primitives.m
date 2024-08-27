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

#import "ObjC+Methods+Primitives.h"

@implementation PrimitiveClass

#pragma mark - Instance methods with primitive types

- (bool) boolCreate :(bool)a { return a; }
- (char) byteCreate :(char)a { return a; }
- (short) shortCreate :(short)a { return a; }
- (unichar) charCreate :(unichar)a { return a; }
- (int) intCreate :(int)a { return a; }
- (long long) longCreate :(long long)a { return a; }
- (float) floatCreate :(float)a { return a; }
- (double) doubleCreate :(double)a { return a; }

- (bool) boolCompare :(bool)a :(bool)b { return a == b; }
- (bool) byteCompare :(char)a :(char)b { return a == b; }
- (bool) shortCompare :(short)a :(short)b { return a == b; }
- (bool) charCompare :(unichar)a :(unichar)b { return a == b; }
- (bool) intCompare :(int)a :(int)b { return a == b; }
- (bool) longCompare :(long long)a :(long long)b { return a == b; }
- (bool) floatCompare :(float)a :(float)b { return a == b; }
- (bool) doubleCompare :(double)a :(double)b { return a == b; }

#pragma mark - Instance methods with primitive* types

- (bool *) boolCreateArray :(int)count { return malloc(count * sizeof(bool)); }
- (char *) byteCreateArray :(int)count { return malloc(count * sizeof(char)); }
- (short *) shortCreateArray :(int)count { return malloc(count * sizeof(short)); }
- (unichar *) charCreateArray :(int)count { return malloc(count * sizeof(unichar)); }
- (int *) intCreateArray :(int)count { return malloc(count * sizeof(int)); }
- (long long *) longCreateArray :(int)count { return malloc(count * sizeof(long long)); }
- (float *) floatCreateArray :(int)count { return malloc(count * sizeof(float)); }
- (double *) doubleCreateArray :(int)count { return malloc(count * sizeof(double)); }

- (bool) boolArrayCompare :(bool *)a :(bool *)b :(int)count { return memcmp(a, b, count * sizeof(bool)) == 0; }
- (bool) byteArrayCompare :(char *)a :(char *)b :(int)count { return memcmp(a, b, count * sizeof(char)) == 0; }
- (bool) shortArrayCompare :(short *)a :(short *)b :(int)count { return memcmp(a, b, count * sizeof(short)) == 0; }
- (bool) charArrayCompare :(unichar *)a :(unichar *)b :(int)count { return memcmp(a, b, count * sizeof(unichar)) == 0; }
- (bool) intArrayCompare :(int *)a :(int *)b :(int)count { return memcmp(a, b, count * sizeof(int)) == 0; }
- (bool) longArrayCompare :(long long *)a :(long long *)b :(int)count { return memcmp(a, b, count * sizeof(long long)) == 0; }
- (bool) floatArrayCompare :(float *)a :(float *)b :(int)count { return memcmp(a, b, count * sizeof(float)) == 0; }
- (bool) doubleArrayCompare :(double *)a :(double *)b :(int)count { return memcmp(a, b, count * sizeof(double)) == 0; }

- (void) boolArrayFree :(bool *)a { free(a); }
- (void) byteArrayFree :(char *)a { free(a); }
- (void) shortArrayFree :(short *)a { free(a); }
- (void) charArrayFree :(unichar *)a { free(a); }
- (void) intArrayFree :(int *)a { free(a); }
- (void) longArrayFree :(long long *)a { free(a); }
- (void) floatArrayFree :(float *)a { free(a); }
- (void) doubleArrayFree :(double *)a { free(a); }

#pragma mark - Instance methods with primitive** types

- (bool **) boolCreateArrayRef :(bool *)array { bool **ref = malloc(sizeof(bool*)); ref[0] = array; return ref; }
- (char **) byteCreateArrayRef :(char *)array { char **ref = malloc(sizeof(char*)); ref[0] = array; return ref; }
- (short **) shortCreateArrayRef :(short *)array { short **ref = malloc(sizeof(short*)); ref[0] = array; return ref; }
- (unichar **) charCreateArrayRef :(unichar *)array { unichar **ref = malloc(sizeof(unichar*)); ref[0] = array; return ref; }
- (int **) intCreateArrayRef :(int *)array { int **ref = malloc(sizeof(int*)); ref[0] = array; return ref; }
- (long long **) longCreateArrayRef :(long long *)array { long long **ref = malloc(sizeof(long long*)); ref[0] = array; return ref; }
- (float **) floatCreateArrayRef :(float *)array { float **ref = malloc(sizeof(float*)); ref[0] = array; return ref; }
- (double **) doubleCreateArrayRef :(double *)array { double **ref = malloc(sizeof(double*)); ref[0] = array; return ref; }

- (bool) boolArrayRefCompare :(bool **)a :(bool *)b :(int)count { return memcmp(a[0], b, count * sizeof(bool)) == 0; }
- (bool) byteArrayRefCompare :(char **)a :(char *)b :(int)count { return memcmp(a[0], b, count * sizeof(char)) == 0; }
- (bool) shortArrayRefCompare :(short **)a :(short *)b :(int)count { return memcmp(a[0], b, count * sizeof(short)) == 0; }
- (bool) charArrayRefCompare :(unichar **)a :(unichar *)b :(int)count { return memcmp(a[0], b, count * sizeof(unichar)) == 0; }
- (bool) intArrayRefCompare :(int **)a :(int *)b :(int)count { return memcmp(a[0], b, count * sizeof(int)) == 0; }
- (bool) longArrayRefCompare :(long long **)a :(long long *)b :(int)count { return memcmp(a[0], b, count * sizeof(long long)) == 0; }
- (bool) floatArrayRefCompare :(float **)a :(float *)b :(int)count { return memcmp(a[0], b, count * sizeof(float)) == 0; }
- (bool) doubleArrayRefCompare :(double **)a :(double *)b :(int)count { return memcmp(a[0], b, count * sizeof(double)) == 0; }

- (void) boolArrayRefFree :(bool **)a { free(a); }
- (void) byteArrayRefFree :(char **)a { free(a); }
- (void) shortArrayRefFree :(short **)a { free(a); }
- (void) charArrayRefFree :(unichar **)a { free(a); }
- (void) intArrayRefFree :(int **)a { free(a); }
- (void) longArrayRefFree :(long long **)a { free(a); }
- (void) floatArrayRefFree :(float **)a { free(a); }
- (void) doubleArrayRefFree :(double **)a { free(a); }

#pragma mark - Class methods with primitive types

+ (bool) boolCreate :(bool)a { return a; }
+ (char) byteCreate :(char)a { return a; }
+ (short) shortCreate :(short)a { return a; }
+ (unichar) charCreate :(unichar)a { return a; }
+ (int) intCreate :(int)a { return a; }
+ (long long) longCreate :(long long)a { return a; }
+ (float) floatCreate :(float)a { return a; }
+ (double) doubleCreate :(double)a { return a; }

+ (bool) boolCompare :(bool)a :(bool)b { return a == b; }
+ (bool) byteCompare :(char)a :(char)b { return a == b; }
+ (bool) shortCompare :(short)a :(short)b { return a == b; }
+ (bool) charCompare :(unichar)a :(unichar)b { return a == b; }
+ (bool) intCompare :(int)a :(int)b { return a == b; }
+ (bool) longCompare :(long long)a :(long long)b { return a == b; }
+ (bool) floatCompare :(float)a :(float)b { return a == b; }
+ (bool) doubleCompare :(double)a :(double)b { return a == b; }

#pragma mark - Class methods with primitive* types

+ (bool *) boolCreateArray :(int)count { return malloc(count * sizeof(bool)); }
+ (char *) byteCreateArray :(int)count { return malloc(count * sizeof(char)); }
+ (short *) shortCreateArray :(int)count { return malloc(count * sizeof(short)); }
+ (unichar *) charCreateArray :(int)count { return malloc(count * sizeof(unichar)); }
+ (int *) intCreateArray :(int)count { return malloc(count * sizeof(int)); }
+ (long long *) longCreateArray :(int)count { return malloc(count * sizeof(long long)); }
+ (float *) floatCreateArray :(int)count { return malloc(count * sizeof(float)); }
+ (double *) doubleCreateArray :(int)count { return malloc(count * sizeof(double)); }

+ (bool) boolArrayCompare :(bool *)a :(bool *)b :(int)count { return memcmp(a, b, count * sizeof(bool)) == 0; }
+ (bool) byteArrayCompare :(char *)a :(char *)b :(int)count { return memcmp(a, b, count * sizeof(char)) == 0; }
+ (bool) shortArrayCompare :(short *)a :(short *)b :(int)count { return memcmp(a, b, count * sizeof(short)) == 0; }
+ (bool) charArrayCompare :(unichar *)a :(unichar *)b :(int)count { return memcmp(a, b, count * sizeof(unichar)) == 0; }
+ (bool) intArrayCompare :(int *)a :(int *)b :(int)count { return memcmp(a, b, count * sizeof(int)) == 0; }
+ (bool) longArrayCompare :(long long *)a :(long long *)b :(int)count { return memcmp(a, b, count * sizeof(long long)) == 0; }
+ (bool) floatArrayCompare :(float *)a :(float *)b :(int)count { return memcmp(a, b, count * sizeof(float)) == 0; }
+ (bool) doubleArrayCompare :(double *)a :(double *)b :(int)count { return memcmp(a, b, count * sizeof(double)) == 0; }

+ (void) boolArrayFree :(bool *)a { free(a); }
+ (void) byteArrayFree :(char *)a { free(a); }
+ (void) shortArrayFree :(short *)a { free(a); }
+ (void) charArrayFree :(unichar *)a { free(a); }
+ (void) intArrayFree :(int *)a { free(a); }
+ (void) longArrayFree :(long long *)a { free(a); }
+ (void) floatArrayFree :(float *)a { free(a); }
+ (void) doubleArrayFree :(double *)a { free(a); }

#pragma mark - Class methods with primitive** types

+ (bool **) boolCreateArrayRef :(bool *)array { bool **ref = malloc(sizeof(bool*)); ref[0] = array; return ref; }
+ (char **) byteCreateArrayRef :(char *)array { char **ref = malloc(sizeof(char*)); ref[0] = array; return ref; }
+ (short **) shortCreateArrayRef :(short *)array { short **ref = malloc(sizeof(short*)); ref[0] = array; return ref; }
+ (unichar **) charCreateArrayRef :(unichar *)array { unichar **ref = malloc(sizeof(unichar*)); ref[0] = array; return ref; }
+ (int **) intCreateArrayRef :(int *)array { int **ref = malloc(sizeof(int*)); ref[0] = array; return ref; }
+ (long long **) longCreateArrayRef :(long long *)array { long long **ref = malloc(sizeof(long long*)); ref[0] = array; return ref; }
+ (float **) floatCreateArrayRef :(float *)array { float **ref = malloc(sizeof(float*)); ref[0] = array; return ref; }
+ (double **) doubleCreateArrayRef :(double *)array { double **ref = malloc(sizeof(double*)); ref[0] = array; return ref; }

+ (bool) boolArrayRefCompare :(bool **)a :(bool *)b :(int)count { return memcmp(a[0], b, count * sizeof(bool)) == 0; }
+ (bool) byteArrayRefCompare :(char **)a :(char *)b :(int)count { return memcmp(a[0], b, count * sizeof(char)) == 0; }
+ (bool) shortArrayRefCompare :(short **)a :(short *)b :(int)count { return memcmp(a[0], b, count * sizeof(short)) == 0; }
+ (bool) charArrayRefCompare :(unichar **)a :(unichar *)b :(int)count { return memcmp(a[0], b, count * sizeof(unichar)) == 0; }
+ (bool) intArrayRefCompare :(int **)a :(int *)b :(int)count { return memcmp(a[0], b, count * sizeof(int)) == 0; }
+ (bool) longArrayRefCompare :(long long **)a :(long long *)b :(int)count { return memcmp(a[0], b, count * sizeof(long long)) == 0; }
+ (bool) floatArrayRefCompare :(float **)a :(float *)b :(int)count { return memcmp(a[0], b, count * sizeof(float)) == 0; }
+ (bool) doubleArrayRefCompare :(double **)a :(double *)b :(int)count { return memcmp(a[0], b, count * sizeof(double)) == 0; }

+ (void) boolArrayRefFree :(bool **)a { free(a); }
+ (void) byteArrayRefFree :(char **)a { free(a); }
+ (void) shortArrayRefFree :(short **)a { free(a); }
+ (void) charArrayRefFree :(unichar **)a { free(a); }
+ (void) intArrayRefFree :(int **)a { free(a); }
+ (void) longArrayRefFree :(long long **)a { free(a); }
+ (void) floatArrayRefFree :(float **)a { free(a); }
+ (void) doubleArrayRefFree :(double **)a { free(a); }

@end

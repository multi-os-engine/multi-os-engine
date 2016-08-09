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

#include <limits.h>
#include <stdio.h>
#include <wchar.h>

#include "NativeDataSource.h"

#ifdef _WIN32
#include <stdlib.h>
#define __NATJ_BYTE_SWAP_16(x) _byteswap_ushort(x)
#define __NATJ_BYTE_SWAP_32(x) _byteswap_ulong(x)
#define __NATJ_BYTE_SWAP_64(x) _byteswap_uint64(x)
#define __NATJ_BYTE_SWAP_16_T unsigned short
#define __NATJ_BYTE_SWAP_32_T unsigned long
#define __NATJ_BYTE_SWAP_64_T unsigned __int64
#elif defined(__APPLE__)
#include <libkern/OSByteOrder.h>
#define __NATJ_BYTE_SWAP_16(x) OSSwapInt16(x)
#define __NATJ_BYTE_SWAP_32(x) OSSwapInt32(x)
#define __NATJ_BYTE_SWAP_64(x) OSSwapInt64(x)
#define __NATJ_BYTE_SWAP_16_T uint16_t
#define __NATJ_BYTE_SWAP_32_T uint32_t
#define __NATJ_BYTE_SWAP_64_T uint64_t
#elif defined(__linux__)
#include <byteswap.h>
#define __NATJ_BYTE_SWAP_16(x) bswap_16(x)
#define __NATJ_BYTE_SWAP_32(x) bswap_32(x)
#define __NATJ_BYTE_SWAP_64(x) bswap_64(x)
#define __NATJ_BYTE_SWAP_16_T uint16_t
#define __NATJ_BYTE_SWAP_32_T uint32_t
#define __NATJ_BYTE_SWAP_64_T uint64_t
#else
#error no byte swap intrinsics
#endif

static const NJUInt NUM_ELEMENTS = 1000;

void swap16(NJUInt count, void *input) {
    __NATJ_BYTE_SWAP_16_T *data = (__NATJ_BYTE_SWAP_16_T *)input;
    for (NJUInt i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_16(data[i]);
    }
}

void swap32(NJUInt count, void *input) {
    __NATJ_BYTE_SWAP_32_T *data = (__NATJ_BYTE_SWAP_32_T *)input;
    for (NJUInt i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_32(data[i]);
    }
}

void swap64(NJUInt count, void *input) {
    __NATJ_BYTE_SWAP_64_T *data = (__NATJ_BYTE_SWAP_64_T *)input;
    for (NJUInt i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_64(data[i]);
    }
}

void *loadFile(const char *fileName, NJUInt elemSize) {
    void *buffer;
    {
        char cwd[PATH_MAX];
        __NATJ_ASSERT(getcwd(cwd, sizeof(cwd)) != NULL);

#ifdef _WIN32
#define PATH_SEP '\\'
#else
#define PATH_SEP '/'
#endif

        char path[PATH_MAX];
        snprintf(path, sizeof path, "%s%csrc%ctest%cresources%c%s", cwd,
                 PATH_SEP, PATH_SEP, PATH_SEP, PATH_SEP, fileName);
        //printf("Loading %s\n", path);

        long length;
        FILE *f = fopen(path, "rb");
        __NATJ_ASSERT(f != NULL);

        fseek(f, 0, SEEK_END);
        length = ftell(f);
        __NATJ_ASSERT(length == NUM_ELEMENTS * elemSize);
        fseek(f, 0, SEEK_SET);

        buffer = malloc(length);
        __NATJ_ASSERT(buffer != NULL);

        __NATJ_ASSERT(fread(buffer, 1, length, f) == NUM_ELEMENTS * elemSize);
        fclose(f);
    }

    if (elemSize == 2) {
        swap16(NUM_ELEMENTS, buffer);
    } else if (elemSize == 4) {
        swap32(NUM_ELEMENTS, buffer);
    } else if (elemSize == 8) {
        swap64(NUM_ELEMENTS, buffer);
    }
    return buffer;
}

void *createZero(NJUInt elemSize) {
    return calloc(NUM_ELEMENTS, elemSize);
}

static const bool *testBoolPtr;
static const bool *zeroBoolPtr;

static const int8_t *testBytePtr;
static const int8_t *zeroBytePtr;

static const int16_t *testShortPtr;
static const int16_t *zeroShortPtr;

static const unichar *testCharPtr;
static const unichar *zeroCharPtr;

static const wchar_t *testWCharTPtr;
static const wchar_t *zeroWCharTPtr;

static const int32_t *testIntPtr;
static const int32_t *zeroIntPtr;

static const NJInt *testNIntPtr;
static const NJInt *zeroNIntPtr;

static const NJUInt *testNUIntPtr;
static const NJUInt *zeroNUIntPtr;

static const long *testNLongPtr;
static const long *zeroNLongPtr;

static const unsigned long *testNULongPtr;
static const unsigned long *zeroNULongPtr;

static const int64_t *testLongPtr;
static const int64_t *zeroLongPtr;

static const float_t *testFloatPtr;
static const float_t *zeroFloatPtr;

static const NJFloat *testNFloatPtr;
static const NJFloat *zeroNFloatPtr;

static const double_t *testDoublePtr;
static const double_t *zeroDoublePtr;

static const NJRect *testStructPtr;
static const NJRect *zeroStructPtr;

void NativeDataSourceInit() {
#if __NATJ_TEST_IS_64BIT__
    __NATJ_ASSERT(sizeof(NJInt) == 8);
    __NATJ_ASSERT(sizeof(NJUInt) == 8);
    __NATJ_ASSERT(sizeof(NJFloat) == 8);
#else
    __NATJ_ASSERT(sizeof(NJInt) == 4);
    __NATJ_ASSERT(sizeof(NJUInt) == 4);
    __NATJ_ASSERT(sizeof(NJFloat) == 4);
#endif

#ifdef _WIN32
    __NATJ_ASSERT(sizeof(wchar_t) == 2);
#else
    __NATJ_ASSERT(sizeof(wchar_t) == 4);
#endif

#if defined(__LP64__) && __LP64__
    __NATJ_ASSERT(sizeof(long) == 8);
#else
    __NATJ_ASSERT(sizeof(long) == 4);
#endif

    testBoolPtr = (const bool *)loadFile("1000-boolean.txt", sizeof(bool));
    zeroBoolPtr = (const bool *)createZero(sizeof(bool));

    testBytePtr = (const int8_t *)loadFile("1000-byte.txt", sizeof(int8_t));
    zeroBytePtr = (const int8_t *)createZero(sizeof(int8_t));

    testShortPtr = (const int16_t *)loadFile("1000-short.txt", sizeof(int16_t));
    zeroShortPtr = (const int16_t *)createZero(sizeof(int16_t));

    testCharPtr = (const unichar *)loadFile("1000-char.txt", sizeof(unichar));
    zeroCharPtr = (const unichar *)createZero(sizeof(unichar));

#ifdef _WIN32
    testWCharTPtr = (const wchar_t *)loadFile("1000-char.txt", sizeof(wchar_t));
#else
    testWCharTPtr = (const wchar_t *)loadFile("1000-int.txt", sizeof(wchar_t));
#endif
    zeroWCharTPtr = (const wchar_t *)createZero(sizeof(wchar_t));

    testIntPtr = (const int32_t *)loadFile("1000-int.txt", sizeof(int32_t));
    zeroIntPtr = (const int32_t *)createZero(sizeof(int32_t));

#if __NATJ_TEST_IS_64BIT__
    testNIntPtr = (const NJInt *)loadFile("1000-long.txt", sizeof(int64_t));
#else
    testNIntPtr = (const NJInt *)loadFile("1000-int.txt", sizeof(int32_t));
#endif
    zeroNIntPtr = (const NJInt *)createZero(sizeof(NJInt));

#if __NATJ_TEST_IS_64BIT__
    testNUIntPtr = (const NJUInt *)loadFile("1000-long.txt", sizeof(int64_t));
#else
    testNUIntPtr = (const NJUInt *)loadFile("1000-int.txt", sizeof(int32_t));
#endif
    zeroNUIntPtr = (const NJUInt *)createZero(sizeof(NJUInt));

#if defined(__LP64__) && __LP64__
    testNLongPtr = (const long *)loadFile("1000-long.txt", sizeof(int64_t));
#else
    testNLongPtr = (const long *)loadFile("1000-int.txt", sizeof(int32_t));
#endif
    zeroNLongPtr = (const long *)createZero(sizeof(long));

#if defined(__LP64__) && __LP64__
    testNULongPtr = (const unsigned long *)loadFile("1000-long.txt", sizeof(int64_t));
#else
    testNULongPtr = (const unsigned long *)loadFile("1000-int.txt", sizeof(int32_t));
#endif
    zeroNULongPtr = (const unsigned long *)createZero(sizeof(unsigned long));

    testLongPtr = (const int64_t *)loadFile("1000-long.txt", sizeof(int64_t));
    zeroLongPtr = (const int64_t *)createZero(sizeof(int64_t));

    testFloatPtr = (const float_t *)loadFile("1000-float.txt", sizeof(float_t));
    zeroFloatPtr = (const float_t *)createZero(sizeof(float_t));

#if __NATJ_TEST_IS_64BIT__
    testNFloatPtr = (const NJFloat *)loadFile("1000-double.txt", sizeof(double_t));
#else
    testNFloatPtr = (const NJFloat *)loadFile("1000-float.txt", sizeof(float_t));
#endif
    zeroNFloatPtr = (const NJFloat *)createZero(sizeof(NJFloat));

    testDoublePtr = (const double_t *)loadFile("1000-double.txt", sizeof(double_t));
    zeroDoublePtr = (const double_t *)createZero(sizeof(double_t));

    NJRect *tmpStructPtr = (NJRect *)createZero(sizeof(NJRect));
    for (NJUInt idx = 0; idx < NUM_ELEMENTS; ++idx) {
        tmpStructPtr[idx].origin.x = testFloatPtr[(idx + 0) % NUM_ELEMENTS];
        tmpStructPtr[idx].origin.y = testFloatPtr[(idx + 1) % NUM_ELEMENTS];
        tmpStructPtr[idx].size.width = testFloatPtr[(idx + 2) % NUM_ELEMENTS];
        tmpStructPtr[idx].size.height = testFloatPtr[(idx + 3) % NUM_ELEMENTS];
    }
    testStructPtr = tmpStructPtr;
    zeroStructPtr = (const NJRect *)createZero(sizeof(NJRect));
}

const bool *getBoolTestPtr() {
    return testBoolPtr;
}

const bool *getBoolZeroPtr() {
    return zeroBoolPtr;
}

const int8_t *getByteTestPtr() {
    return testBytePtr;
}

const int8_t *getByteZeroPtr() {
    return zeroBytePtr;
}

const int16_t *getShortTestPtr() {
    return testShortPtr;
}

const int16_t *getShortZeroPtr() {
    return zeroShortPtr;
}

const unichar *getCharTestPtr() {
    return testCharPtr;
}

const unichar *getCharZeroPtr() {
    return zeroCharPtr;
}

const wchar_t *getWCharTTestPtr() {
    return testWCharTPtr;
}

const wchar_t *getWCharTZeroPtr() {
    return zeroWCharTPtr;
}

const int32_t *getIntTestPtr() {
    return testIntPtr;
}

const int32_t *getIntZeroPtr() {
    return zeroIntPtr;
}

const NJInt *getNIntTestPtr() {
    return testNIntPtr;
}

const NJInt *getNIntZeroPtr() {
    return zeroNIntPtr;
}

const NJUInt *getNUIntTestPtr() {
    return testNUIntPtr;
}

const NJUInt *getNUIntZeroPtr() {
    return zeroNUIntPtr;
}

const long *getNLongTestPtr() {
    return testNLongPtr;
}

const long *getNLongZeroPtr() {
    return zeroNLongPtr;
}

const unsigned long *getNULongTestPtr() {
    return testNULongPtr;
}

const unsigned long *getNULongZeroPtr() {
    return zeroNULongPtr;
}

const int64_t *getLongTestPtr() {
    return testLongPtr;
}

const int64_t *getLongZeroPtr() {
    return zeroLongPtr;
}

const float_t *getFloatTestPtr() {
    return testFloatPtr;
}

const float_t *getFloatZeroPtr() {
    return zeroFloatPtr;
}

const NJFloat *getNFloatTestPtr() {
    return testNFloatPtr;
}

const NJFloat *getNFloatZeroPtr() {
    return zeroNFloatPtr;
}

const double_t *getDoubleTestPtr() {
    return testDoublePtr;
}

const double_t *getDoubleZeroPtr() {
    return zeroDoublePtr;
}

const NJRect *getStructTestPtr() {
    return testStructPtr;
}

const NJRect *getStructZeroPtr() {
    return zeroStructPtr;
}

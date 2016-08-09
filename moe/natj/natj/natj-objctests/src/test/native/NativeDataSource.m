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

#import "NativeDataSource.h"

#ifndef __NATJ_ASSERT
#define __NATJ_ASSERT(x) { if (!(x)) { abort(); }}
#endif

static const NSUInteger NUM_ELEMENTS = 1000;

#if defined(__APPLE__)
#include <libkern/OSByteOrder.h>
#define __NATJ_BYTE_SWAP_16(x) OSSwapInt16(x)
#define __NATJ_BYTE_SWAP_32(x) OSSwapInt32(x)
#define __NATJ_BYTE_SWAP_64(x) OSSwapInt64(x)
#define __NATJ_BYTE_SWAP_16_T uint16_t
#define __NATJ_BYTE_SWAP_32_T uint32_t
#define __NATJ_BYTE_SWAP_64_T uint64_t
#else
#error no byte swap intrinsics
#endif

void swap16(NSUInteger count, void *input) {
    __NATJ_BYTE_SWAP_16_T *data = (__NATJ_BYTE_SWAP_16_T *)input;
    for (NSUInteger i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_16(data[i]);
    }
}

void swap32(NSUInteger count, void *input) {
    __NATJ_BYTE_SWAP_32_T *data = (__NATJ_BYTE_SWAP_32_T *)input;
    for (NSUInteger i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_32(data[i]);
    }
}

void swap64(NSUInteger count, void *input) {
    __NATJ_BYTE_SWAP_64_T *data = (__NATJ_BYTE_SWAP_64_T *)input;
    for (NSUInteger i = 0; i < count; ++i) {
        data[i] = __NATJ_BYTE_SWAP_64(data[i]);
    }
}

void *loadFile(const char *fileName, int elemSize) {
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

void *createZero(NSUInteger elemSize) {
    return calloc(NUM_ELEMENTS, elemSize);
}

static NSNumber * const *testObjCObjectPtr;
static NSNumber * const *zeroObjCObjectPtr;

@implementation NativeDataSource

+ (void)initialize {
    if (self == [NativeDataSource class]) {
        int32_t *testIntPtr = loadFile("1000-int.txt", sizeof(int32_t));
        
        NSNumber **tmpObjCObjectPtr = createZero(sizeof(NSNumber *));
        for (NSUInteger idx = 0; idx < NUM_ELEMENTS; ++idx) {
            tmpObjCObjectPtr[idx] = [[NSNumber alloc] initWithInt:testIntPtr[idx]];
        }
        testObjCObjectPtr = tmpObjCObjectPtr;
        zeroObjCObjectPtr = createZero(sizeof(NSNumber *));
        
        free(testIntPtr);
    }
}

+ (NSNumber * const *)getObjCObjectTestPtr {
    return testObjCObjectPtr;
}

+ (NSNumber * const *)getObjCObjectZeroPtr {
    return zeroObjCObjectPtr;
}

@end

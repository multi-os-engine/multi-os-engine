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

#ifndef Common_Defines_h
#define Common_Defines_h

#include <stdarg.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>

#ifdef _WIN32
  #ifdef _WIN64
    #define __NATJ_TEST_IS_64BIT__ 1
  #else
    #define __NATJ_TEST_IS_64BIT__ 0
  #endif
#elif defined(__LP64__) && __LP64__
  #define __NATJ_TEST_IS_64BIT__ 1
#else
  #define __NATJ_TEST_IS_64BIT__ 0
#endif

#ifndef bool
#define bool uint8_t
#endif

#ifndef true
#define true ((uint8_t)1)
#endif

#ifndef false
#define false ((uint8_t)0)
#endif

#ifndef unichar
#define unichar uint16_t
#endif

#if __NATJ_TEST_IS_64BIT__
typedef long long NJInt;
typedef unsigned long long NJUInt;
typedef double NJFloat;
#else
typedef int NJInt;
typedef unsigned int NJUInt;
typedef float NJFloat;
#endif

#ifndef float_t
#define float_t float
#endif

#ifndef double_t
#define double_t double
#endif

#if defined(_WIN32)
  #ifdef __cplusplus
    #define NATJ_TEST_EXTERN extern "C" __declspec(dllexport)
  #else
    #define NATJ_TEST_EXTERN extern __declspec(dllexport)
  #endif
#else
  #ifdef __cplusplus
    #define NATJ_TEST_EXTERN extern "C" __attribute__((visibility ("default")))
  #else
    #define NATJ_TEST_EXTERN extern __attribute__((visibility ("default")))
  #endif
#endif

#define __NATJ_ASSERT(x) { if (!(x)) { abort(); }}

#endif /* Common_Defines_h */

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

#ifndef NATJGEN_TEST_MOE_TYPES__H
#define NATJGEN_TEST_MOE_TYPES__H

#include <unistd.h>

#if __LP64__ || __LLP64__
#define NATJGEN_PLATFORM_IS_64BIT 1
#else
#define NATJGEN_PLATFORM_IS_64BIT 0
#endif

#ifndef NJG_ENUM
#if (__cplusplus && __cplusplus >= 201103L && (__has_extension(cxx_strong_enums) || __has_feature(objc_fixed_enum))) || (!__cplusplus && __has_feature(objc_fixed_enum))
#define NJG_ENUM(_type, _name) enum _name : _type _name; enum _name : _type
void natjgen_control_HasSizedEnums();
#else
#define NJG_ENUM(_type, _name) enum _name _name; enum _name
#endif
#endif


#ifdef __OBJC__
void natjgen_control_HasObjC();
#endif /* __OBJC__ */

#ifndef __OBJC__
#ifndef BOOL
typedef signed char BOOL; 
#endif
#ifndef true
#define true ((BOOL)1)
#endif
#ifndef false
#define false ((BOOL)0)
#endif
#endif /* __OBJC__ */

#if NATJGEN_PLATFORM_IS_64BIT
#ifdef __LLP64__
typedef long long moe_nint_t;
typedef unsigned long long moe_nuint_t;
typedef double moe_nfloat_t;
#else
typedef long moe_nint_t;
typedef unsigned long moe_nuint_t;
typedef double moe_nfloat_t;
#endif
#else
typedef int moe_nint_t;
typedef unsigned int moe_nuint_t;
typedef float moe_nfloat_t;
#endif

typedef unsigned short moe_unichar_t;
typedef long long moe_int64_t;

typedef struct { int field; } moe_struct_t;
typedef struct __moe_opaqueptr_t *moe_opaqueptr_t;

#ifdef __OBJC__

#include <Foundation/Foundation.h>

@interface moe_objc_class : NSObject

@end

#endif /* __OBJC__ */

#endif /* NATJGEN_TEST_MOE_TYPES__H */

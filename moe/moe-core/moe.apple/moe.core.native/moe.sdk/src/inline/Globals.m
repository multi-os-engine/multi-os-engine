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

#import <ctype.h>
#import <dispatch/dispatch.h>
#import <libkern/OSByteOrder.h>
#import <math.h>
#import <stdio.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT uint16_t __natj_inline__OSSwapInt16(uint16_t data) {
	return _OSSwapInt16(data);
}

EXPORT uint32_t __natj_inline__OSSwapInt32(uint32_t data) {
	return _OSSwapInt32(data);
}

EXPORT uint64_t __natj_inline__OSSwapInt64(uint64_t data) {
	return _OSSwapInt64(data);
}

EXPORT uint16_t __natj_inline_OSReadSwapInt16(const volatile void * base, uintptr_t offset) {
	return OSReadSwapInt16(base, offset);
}

EXPORT uint32_t __natj_inline_OSReadSwapInt32(const volatile void * base, uintptr_t offset) {
	return OSReadSwapInt32(base, offset);
}

EXPORT uint64_t __natj_inline_OSReadSwapInt64(const volatile void * base, uintptr_t offset) {
	return OSReadSwapInt64(base, offset);
}

EXPORT void __natj_inline_OSWriteSwapInt16(volatile void * base, uintptr_t offset, uint16_t data) {
	OSWriteSwapInt16(base, offset, data);
}

EXPORT void __natj_inline_OSWriteSwapInt32(volatile void * base, uintptr_t offset, uint32_t data) {
	OSWriteSwapInt32(base, offset, data);
}

EXPORT void __natj_inline_OSWriteSwapInt64(volatile void * base, uintptr_t offset, uint64_t data) {
	OSWriteSwapInt64(base, offset, data);
}

EXPORT int __natj_inline___darwin_fd_isset(int _n, const struct fd_set * _p) {
	return __darwin_fd_isset(_n, _p);
}

EXPORT void __natj_inline__dispatch_object_validate(dispatch_object_t  _Nonnull __strong object) {
	_dispatch_object_validate(object);
}

EXPORT dispatch_queue_t _Nonnull __natj_inline_dispatch_get_main_queue() {
	return dispatch_get_main_queue();
}

EXPORT void __natj_inline__dispatch_once(dispatch_once_t * _Nonnull predicate, dispatch_block_t  _Nonnull __strong block) {
	_dispatch_once(predicate, block);
}

EXPORT void __natj_inline__dispatch_once_f(dispatch_once_t * _Nonnull predicate, void * _Nullable context, dispatch_function_t _Nonnull function) {
	_dispatch_once_f(predicate, context, function);
}

EXPORT int __natj_inline___inline_isfinitef(float arg1) {
	return __inline_isfinitef(arg1);
}

EXPORT int __natj_inline___inline_isfinited(double arg1) {
	return __inline_isfinited(arg1);
}

EXPORT int __natj_inline___inline_isinff(float arg1) {
	return __inline_isinff(arg1);
}

EXPORT int __natj_inline___inline_isinfd(double arg1) {
	return __inline_isinfd(arg1);
}

EXPORT int __natj_inline___inline_isnanf(float arg1) {
	return __inline_isnanf(arg1);
}

EXPORT int __natj_inline___inline_isnand(double arg1) {
	return __inline_isnand(arg1);
}

EXPORT int __natj_inline___inline_isnormalf(float arg1) {
	return __inline_isnormalf(arg1);
}

EXPORT int __natj_inline___inline_isnormald(double arg1) {
	return __inline_isnormald(arg1);
}

EXPORT int __natj_inline___inline_signbitf(float arg1) {
	return __inline_signbitf(arg1);
}

EXPORT int __natj_inline___inline_signbitd(double arg1) {
	return __inline_signbitd(arg1);
}

EXPORT void __natj_inline___sincosf(float __x, float * __sinp, float * __cosp) {
	__sincosf(__x, __sinp, __cosp);
}

EXPORT void __natj_inline___sincos(double __x, double * __sinp, double * __cosp) {
	__sincos(__x, __sinp, __cosp);
}

EXPORT void __natj_inline___sincospif(float __x, float * __sinp, float * __cosp) {
	__sincospif(__x, __sinp, __cosp);
}

EXPORT void __natj_inline___sincospi(double __x, double * __sinp, double * __cosp) {
	__sincospi(__x, __sinp, __cosp);
}

EXPORT int __natj_inline_isascii(int _c) {
	return isascii(_c);
}

EXPORT int __natj_inline___istype(__darwin_ct_rune_t _c, unsigned long _f) {
	return __istype(_c, _f);
}

EXPORT __darwin_ct_rune_t __natj_inline___isctype(__darwin_ct_rune_t _c, unsigned long _f) {
	return __isctype(_c, _f);
}

EXPORT int __natj_inline___wcwidth(__darwin_ct_rune_t _c) {
	return __wcwidth(_c);
}

EXPORT int __natj_inline_isalnum(int _c) {
	return isalnum(_c);
}

EXPORT int __natj_inline_isalpha(int _c) {
	return isalpha(_c);
}

EXPORT int __natj_inline_isblank(int _c) {
	return isblank(_c);
}

EXPORT int __natj_inline_iscntrl(int _c) {
	return iscntrl(_c);
}

EXPORT int __natj_inline_isdigit(int _c) {
	return isdigit(_c);
}

EXPORT int __natj_inline_isgraph(int _c) {
	return isgraph(_c);
}

EXPORT int __natj_inline_islower(int _c) {
	return islower(_c);
}

EXPORT int __natj_inline_isprint(int _c) {
	return isprint(_c);
}

EXPORT int __natj_inline_ispunct(int _c) {
	return ispunct(_c);
}

EXPORT int __natj_inline_isspace(int _c) {
	return isspace(_c);
}

EXPORT int __natj_inline_isupper(int _c) {
	return isupper(_c);
}

EXPORT int __natj_inline_isxdigit(int _c) {
	return isxdigit(_c);
}

EXPORT int __natj_inline_toascii(int _c) {
	return toascii(_c);
}

EXPORT int __natj_inline_tolower(int _c) {
	return tolower(_c);
}

EXPORT int __natj_inline_toupper(int _c) {
	return toupper(_c);
}

EXPORT int __natj_inline_digittoint(int _c) {
	return digittoint(_c);
}

EXPORT int __natj_inline_ishexnumber(int _c) {
	return ishexnumber(_c);
}

EXPORT int __natj_inline_isideogram(int _c) {
	return isideogram(_c);
}

EXPORT int __natj_inline_isnumber(int _c) {
	return isnumber(_c);
}

EXPORT int __natj_inline_isphonogram(int _c) {
	return isphonogram(_c);
}

EXPORT int __natj_inline_isrune(int _c) {
	return isrune(_c);
}

EXPORT int __natj_inline_isspecial(int _c) {
	return isspecial(_c);
}

EXPORT int __natj_inline___sputc(int _c, FILE * _p) {
	return __sputc(_c, _p);
}

EXPORT int32_t __natj_inline_OSHostByteOrder() {
	return OSHostByteOrder();
}

EXPORT uint16_t __natj_inline__OSReadInt16(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt16(base, byteOffset);
}

EXPORT uint32_t __natj_inline__OSReadInt32(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt32(base, byteOffset);
}

EXPORT uint64_t __natj_inline__OSReadInt64(const volatile void * base, uintptr_t byteOffset) {
	return _OSReadInt64(base, byteOffset);
}

EXPORT void __natj_inline__OSWriteInt16(volatile void * base, uintptr_t byteOffset, uint16_t data) {
	_OSWriteInt16(base, byteOffset, data);
}

EXPORT void __natj_inline__OSWriteInt32(volatile void * base, uintptr_t byteOffset, uint32_t data) {
	_OSWriteInt32(base, byteOffset, data);
}

EXPORT void __natj_inline__OSWriteInt64(volatile void * base, uintptr_t byteOffset, uint64_t data) {
	_OSWriteInt64(base, byteOffset, data);
}



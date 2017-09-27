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

#import </var/folders/68/8hyw029j2zj855ftq6d6qjdc0000gn/T/NatJGen3427900463688252882/arm_neon.h>
#import <_types/_uint16_t.h>
#import <_types/_uint32_t.h>
#import <_types/_uint64_t.h>
#import <_types/_uint8_t.h>
#import <arm/_types.h>
#import <ctype.h>
#import <dispatch/object.h>
#import <dispatch/once.h>
#import <dispatch/queue.h>
#import <libkern/OSByteOrder.h>
#import <libkern/arm/OSByteOrder.h>
#import <math.h>
#import <simd/common.h>
#import <simd/math.h>
#import <simd/vector_types.h>
#import <stdio.h>
#import <sys/_types/_fd_def.h>
#import <sys/_types/_int16_t.h>
#import <sys/_types/_int32_t.h>
#import <sys/_types/_int64_t.h>
#import <sys/_types/_int8_t.h>
#import <sys/_types/_uintptr_t.h>


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

EXPORT uint32_t __natj_inline_vsha1h_u32(uint32_t __p0) {
	return vsha1h_u32(__p0);
}

EXPORT float64_t __natj_inline_vabdd_f64(float64_t __p0, float64_t __p1) {
	return vabdd_f64(__p0, __p1);
}

EXPORT float32_t __natj_inline_vabds_f32(float32_t __p0, float32_t __p1) {
	return vabds_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vabsd_s64(int64_t __p0) {
	return vabsd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vaddd_u64(uint64_t __p0, uint64_t __p1) {
	return vaddd_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vaddd_s64(int64_t __p0, int64_t __p1) {
	return vaddd_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcaged_f64(float64_t __p0, float64_t __p1) {
	return vcaged_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcages_f32(float32_t __p0, float32_t __p1) {
	return vcages_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcagtd_f64(float64_t __p0, float64_t __p1) {
	return vcagtd_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcagts_f32(float32_t __p0, float32_t __p1) {
	return vcagts_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcaled_f64(float64_t __p0, float64_t __p1) {
	return vcaled_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcales_f32(float32_t __p0, float32_t __p1) {
	return vcales_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcaltd_f64(float64_t __p0, float64_t __p1) {
	return vcaltd_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcalts_f32(float32_t __p0, float32_t __p1) {
	return vcalts_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vceqd_u64(uint64_t __p0, uint64_t __p1) {
	return vceqd_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vceqd_s64(int64_t __p0, int64_t __p1) {
	return vceqd_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vceqd_f64(float64_t __p0, float64_t __p1) {
	return vceqd_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vceqs_f32(float32_t __p0, float32_t __p1) {
	return vceqs_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vceqzd_u64(uint64_t __p0) {
	return vceqzd_u64(__p0);
}

EXPORT int64_t __natj_inline_vceqzd_s64(int64_t __p0) {
	return vceqzd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vceqzd_f64(float64_t __p0) {
	return vceqzd_f64(__p0);
}

EXPORT uint32_t __natj_inline_vceqzs_f32(float32_t __p0) {
	return vceqzs_f32(__p0);
}

EXPORT int64_t __natj_inline_vcged_s64(int64_t __p0, int64_t __p1) {
	return vcged_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcged_u64(uint64_t __p0, uint64_t __p1) {
	return vcged_u64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcged_f64(float64_t __p0, float64_t __p1) {
	return vcged_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcges_f32(float32_t __p0, float32_t __p1) {
	return vcges_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vcgezd_s64(int64_t __p0) {
	return vcgezd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vcgezd_f64(float64_t __p0) {
	return vcgezd_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcgezs_f32(float32_t __p0) {
	return vcgezs_f32(__p0);
}

EXPORT int64_t __natj_inline_vcgtd_s64(int64_t __p0, int64_t __p1) {
	return vcgtd_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcgtd_u64(uint64_t __p0, uint64_t __p1) {
	return vcgtd_u64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcgtd_f64(float64_t __p0, float64_t __p1) {
	return vcgtd_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcgts_f32(float32_t __p0, float32_t __p1) {
	return vcgts_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vcgtzd_s64(int64_t __p0) {
	return vcgtzd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vcgtzd_f64(float64_t __p0) {
	return vcgtzd_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcgtzs_f32(float32_t __p0) {
	return vcgtzs_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcled_u64(uint64_t __p0, uint64_t __p1) {
	return vcled_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vcled_s64(int64_t __p0, int64_t __p1) {
	return vcled_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcled_f64(float64_t __p0, float64_t __p1) {
	return vcled_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vcles_f32(float32_t __p0, float32_t __p1) {
	return vcles_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vclezd_s64(int64_t __p0) {
	return vclezd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vclezd_f64(float64_t __p0) {
	return vclezd_f64(__p0);
}

EXPORT uint32_t __natj_inline_vclezs_f32(float32_t __p0) {
	return vclezs_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcltd_u64(uint64_t __p0, uint64_t __p1) {
	return vcltd_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vcltd_s64(int64_t __p0, int64_t __p1) {
	return vcltd_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vcltd_f64(float64_t __p0, float64_t __p1) {
	return vcltd_f64(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vclts_f32(float32_t __p0, float32_t __p1) {
	return vclts_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vcltzd_s64(int64_t __p0) {
	return vcltzd_s64(__p0);
}

EXPORT uint64_t __natj_inline_vcltzd_f64(float64_t __p0) {
	return vcltzd_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcltzs_f32(float32_t __p0) {
	return vcltzs_f32(__p0);
}

EXPORT float32_t __natj_inline_vcvts_f32_s32(int32_t __p0) {
	return vcvts_f32_s32(__p0);
}

EXPORT float32_t __natj_inline_vcvts_f32_u32(uint32_t __p0) {
	return vcvts_f32_u32(__p0);
}

EXPORT float64_t __natj_inline_vcvtd_f64_s64(int64_t __p0) {
	return vcvtd_f64_s64(__p0);
}

EXPORT float64_t __natj_inline_vcvtd_f64_u64(uint64_t __p0) {
	return vcvtd_f64_u64(__p0);
}

EXPORT int32_t __natj_inline_vcvts_s32_f32(float32_t __p0) {
	return vcvts_s32_f32(__p0);
}

EXPORT int64_t __natj_inline_vcvtd_s64_f64(float64_t __p0) {
	return vcvtd_s64_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcvts_u32_f32(float32_t __p0) {
	return vcvts_u32_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcvtd_u64_f64(float64_t __p0) {
	return vcvtd_u64_f64(__p0);
}

EXPORT int32_t __natj_inline_vcvtas_s32_f32(float32_t __p0) {
	return vcvtas_s32_f32(__p0);
}

EXPORT int64_t __natj_inline_vcvtad_s64_f64(float64_t __p0) {
	return vcvtad_s64_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcvtas_u32_f32(float32_t __p0) {
	return vcvtas_u32_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcvtad_u64_f64(float64_t __p0) {
	return vcvtad_u64_f64(__p0);
}

EXPORT int32_t __natj_inline_vcvtms_s32_f32(float32_t __p0) {
	return vcvtms_s32_f32(__p0);
}

EXPORT int64_t __natj_inline_vcvtmd_s64_f64(float64_t __p0) {
	return vcvtmd_s64_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcvtms_u32_f32(float32_t __p0) {
	return vcvtms_u32_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcvtmd_u64_f64(float64_t __p0) {
	return vcvtmd_u64_f64(__p0);
}

EXPORT int32_t __natj_inline_vcvtns_s32_f32(float32_t __p0) {
	return vcvtns_s32_f32(__p0);
}

EXPORT int64_t __natj_inline_vcvtnd_s64_f64(float64_t __p0) {
	return vcvtnd_s64_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcvtns_u32_f32(float32_t __p0) {
	return vcvtns_u32_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcvtnd_u64_f64(float64_t __p0) {
	return vcvtnd_u64_f64(__p0);
}

EXPORT int32_t __natj_inline_vcvtps_s32_f32(float32_t __p0) {
	return vcvtps_s32_f32(__p0);
}

EXPORT int64_t __natj_inline_vcvtpd_s64_f64(float64_t __p0) {
	return vcvtpd_s64_f64(__p0);
}

EXPORT uint32_t __natj_inline_vcvtps_u32_f32(float32_t __p0) {
	return vcvtps_u32_f32(__p0);
}

EXPORT uint64_t __natj_inline_vcvtpd_u64_f64(float64_t __p0) {
	return vcvtpd_u64_f64(__p0);
}

EXPORT float32_t __natj_inline_vcvtxd_f32_f64(float64_t __p0) {
	return vcvtxd_f32_f64(__p0);
}

EXPORT float64_t __natj_inline_vmulxd_f64(float64_t __p0, float64_t __p1) {
	return vmulxd_f64(__p0, __p1);
}

EXPORT float32_t __natj_inline_vmulxs_f32(float32_t __p0, float32_t __p1) {
	return vmulxs_f32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vnegd_s64(int64_t __p0) {
	return vnegd_s64(__p0);
}

EXPORT int8_t __natj_inline_vqabsb_s8(int8_t __p0) {
	return vqabsb_s8(__p0);
}

EXPORT int32_t __natj_inline_vqabss_s32(int32_t __p0) {
	return vqabss_s32(__p0);
}

EXPORT int64_t __natj_inline_vqabsd_s64(int64_t __p0) {
	return vqabsd_s64(__p0);
}

EXPORT int16_t __natj_inline_vqabsh_s16(int16_t __p0) {
	return vqabsh_s16(__p0);
}

EXPORT uint8_t __natj_inline_vqaddb_u8(uint8_t __p0, uint8_t __p1) {
	return vqaddb_u8(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vqadds_u32(uint32_t __p0, uint32_t __p1) {
	return vqadds_u32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vqaddd_u64(uint64_t __p0, uint64_t __p1) {
	return vqaddd_u64(__p0, __p1);
}

EXPORT uint16_t __natj_inline_vqaddh_u16(uint16_t __p0, uint16_t __p1) {
	return vqaddh_u16(__p0, __p1);
}

EXPORT int8_t __natj_inline_vqaddb_s8(int8_t __p0, int8_t __p1) {
	return vqaddb_s8(__p0, __p1);
}

EXPORT int32_t __natj_inline_vqadds_s32(int32_t __p0, int32_t __p1) {
	return vqadds_s32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqaddd_s64(int64_t __p0, int64_t __p1) {
	return vqaddd_s64(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqaddh_s16(int16_t __p0, int16_t __p1) {
	return vqaddh_s16(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqdmlals_s32(int64_t __p0, int32_t __p1, int32_t __p2) {
	return vqdmlals_s32(__p0, __p1, __p2);
}

EXPORT int32_t __natj_inline_vqdmlalh_s16(int32_t __p0, int16_t __p1, int16_t __p2) {
	return vqdmlalh_s16(__p0, __p1, __p2);
}

EXPORT int64_t __natj_inline_vqdmlsls_s32(int64_t __p0, int32_t __p1, int32_t __p2) {
	return vqdmlsls_s32(__p0, __p1, __p2);
}

EXPORT int32_t __natj_inline_vqdmlslh_s16(int32_t __p0, int16_t __p1, int16_t __p2) {
	return vqdmlslh_s16(__p0, __p1, __p2);
}

EXPORT int32_t __natj_inline_vqdmulhs_s32(int32_t __p0, int32_t __p1) {
	return vqdmulhs_s32(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqdmulhh_s16(int16_t __p0, int16_t __p1) {
	return vqdmulhh_s16(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqdmulls_s32(int32_t __p0, int32_t __p1) {
	return vqdmulls_s32(__p0, __p1);
}

EXPORT int32_t __natj_inline_vqdmullh_s16(int16_t __p0, int16_t __p1) {
	return vqdmullh_s16(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqmovns_s32(int32_t __p0) {
	return vqmovns_s32(__p0);
}

EXPORT int32_t __natj_inline_vqmovnd_s64(int64_t __p0) {
	return vqmovnd_s64(__p0);
}

EXPORT int8_t __natj_inline_vqmovnh_s16(int16_t __p0) {
	return vqmovnh_s16(__p0);
}

EXPORT uint16_t __natj_inline_vqmovns_u32(uint32_t __p0) {
	return vqmovns_u32(__p0);
}

EXPORT uint32_t __natj_inline_vqmovnd_u64(uint64_t __p0) {
	return vqmovnd_u64(__p0);
}

EXPORT uint8_t __natj_inline_vqmovnh_u16(uint16_t __p0) {
	return vqmovnh_u16(__p0);
}

EXPORT int16_t __natj_inline_vqmovuns_s32(int32_t __p0) {
	return vqmovuns_s32(__p0);
}

EXPORT int32_t __natj_inline_vqmovund_s64(int64_t __p0) {
	return vqmovund_s64(__p0);
}

EXPORT int8_t __natj_inline_vqmovunh_s16(int16_t __p0) {
	return vqmovunh_s16(__p0);
}

EXPORT int8_t __natj_inline_vqnegb_s8(int8_t __p0) {
	return vqnegb_s8(__p0);
}

EXPORT int32_t __natj_inline_vqnegs_s32(int32_t __p0) {
	return vqnegs_s32(__p0);
}

EXPORT int64_t __natj_inline_vqnegd_s64(int64_t __p0) {
	return vqnegd_s64(__p0);
}

EXPORT int16_t __natj_inline_vqnegh_s16(int16_t __p0) {
	return vqnegh_s16(__p0);
}

EXPORT int32_t __natj_inline_vqrdmulhs_s32(int32_t __p0, int32_t __p1) {
	return vqrdmulhs_s32(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqrdmulhh_s16(int16_t __p0, int16_t __p1) {
	return vqrdmulhh_s16(__p0, __p1);
}

EXPORT uint8_t __natj_inline_vqrshlb_u8(uint8_t __p0, uint8_t __p1) {
	return vqrshlb_u8(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vqrshls_u32(uint32_t __p0, uint32_t __p1) {
	return vqrshls_u32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vqrshld_u64(uint64_t __p0, uint64_t __p1) {
	return vqrshld_u64(__p0, __p1);
}

EXPORT uint16_t __natj_inline_vqrshlh_u16(uint16_t __p0, uint16_t __p1) {
	return vqrshlh_u16(__p0, __p1);
}

EXPORT int8_t __natj_inline_vqrshlb_s8(int8_t __p0, int8_t __p1) {
	return vqrshlb_s8(__p0, __p1);
}

EXPORT int32_t __natj_inline_vqrshls_s32(int32_t __p0, int32_t __p1) {
	return vqrshls_s32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqrshld_s64(int64_t __p0, int64_t __p1) {
	return vqrshld_s64(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqrshlh_s16(int16_t __p0, int16_t __p1) {
	return vqrshlh_s16(__p0, __p1);
}

EXPORT uint8_t __natj_inline_vqshlb_u8(uint8_t __p0, uint8_t __p1) {
	return vqshlb_u8(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vqshls_u32(uint32_t __p0, uint32_t __p1) {
	return vqshls_u32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vqshld_u64(uint64_t __p0, uint64_t __p1) {
	return vqshld_u64(__p0, __p1);
}

EXPORT uint16_t __natj_inline_vqshlh_u16(uint16_t __p0, uint16_t __p1) {
	return vqshlh_u16(__p0, __p1);
}

EXPORT int8_t __natj_inline_vqshlb_s8(int8_t __p0, int8_t __p1) {
	return vqshlb_s8(__p0, __p1);
}

EXPORT int32_t __natj_inline_vqshls_s32(int32_t __p0, int32_t __p1) {
	return vqshls_s32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqshld_s64(int64_t __p0, int64_t __p1) {
	return vqshld_s64(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqshlh_s16(int16_t __p0, int16_t __p1) {
	return vqshlh_s16(__p0, __p1);
}

EXPORT uint8_t __natj_inline_vqsubb_u8(uint8_t __p0, uint8_t __p1) {
	return vqsubb_u8(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vqsubs_u32(uint32_t __p0, uint32_t __p1) {
	return vqsubs_u32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vqsubd_u64(uint64_t __p0, uint64_t __p1) {
	return vqsubd_u64(__p0, __p1);
}

EXPORT uint16_t __natj_inline_vqsubh_u16(uint16_t __p0, uint16_t __p1) {
	return vqsubh_u16(__p0, __p1);
}

EXPORT int8_t __natj_inline_vqsubb_s8(int8_t __p0, int8_t __p1) {
	return vqsubb_s8(__p0, __p1);
}

EXPORT int32_t __natj_inline_vqsubs_s32(int32_t __p0, int32_t __p1) {
	return vqsubs_s32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vqsubd_s64(int64_t __p0, int64_t __p1) {
	return vqsubd_s64(__p0, __p1);
}

EXPORT int16_t __natj_inline_vqsubh_s16(int16_t __p0, int16_t __p1) {
	return vqsubh_s16(__p0, __p1);
}

EXPORT float64_t __natj_inline_vrecped_f64(float64_t __p0) {
	return vrecped_f64(__p0);
}

EXPORT float32_t __natj_inline_vrecpes_f32(float32_t __p0) {
	return vrecpes_f32(__p0);
}

EXPORT float64_t __natj_inline_vrecpsd_f64(float64_t __p0, float64_t __p1) {
	return vrecpsd_f64(__p0, __p1);
}

EXPORT float32_t __natj_inline_vrecpss_f32(float32_t __p0, float32_t __p1) {
	return vrecpss_f32(__p0, __p1);
}

EXPORT float64_t __natj_inline_vrecpxd_f64(float64_t __p0) {
	return vrecpxd_f64(__p0);
}

EXPORT float32_t __natj_inline_vrecpxs_f32(float32_t __p0) {
	return vrecpxs_f32(__p0);
}

EXPORT uint64_t __natj_inline_vrshld_u64(uint64_t __p0, uint64_t __p1) {
	return vrshld_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vrshld_s64(int64_t __p0, int64_t __p1) {
	return vrshld_s64(__p0, __p1);
}

EXPORT float64_t __natj_inline_vrsqrted_f64(float64_t __p0) {
	return vrsqrted_f64(__p0);
}

EXPORT float32_t __natj_inline_vrsqrtes_f32(float32_t __p0) {
	return vrsqrtes_f32(__p0);
}

EXPORT float64_t __natj_inline_vrsqrtsd_f64(float64_t __p0, float64_t __p1) {
	return vrsqrtsd_f64(__p0, __p1);
}

EXPORT float32_t __natj_inline_vrsqrtss_f32(float32_t __p0, float32_t __p1) {
	return vrsqrtss_f32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vshld_u64(uint64_t __p0, uint64_t __p1) {
	return vshld_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vshld_s64(int64_t __p0, int64_t __p1) {
	return vshld_s64(__p0, __p1);
}

EXPORT uint8_t __natj_inline_vsqaddb_u8(uint8_t __p0, uint8_t __p1) {
	return vsqaddb_u8(__p0, __p1);
}

EXPORT uint32_t __natj_inline_vsqadds_u32(uint32_t __p0, uint32_t __p1) {
	return vsqadds_u32(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vsqaddd_u64(uint64_t __p0, uint64_t __p1) {
	return vsqaddd_u64(__p0, __p1);
}

EXPORT uint16_t __natj_inline_vsqaddh_u16(uint16_t __p0, uint16_t __p1) {
	return vsqaddh_u16(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vsubd_u64(uint64_t __p0, uint64_t __p1) {
	return vsubd_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vsubd_s64(int64_t __p0, int64_t __p1) {
	return vsubd_s64(__p0, __p1);
}

EXPORT uint64_t __natj_inline_vtstd_u64(uint64_t __p0, uint64_t __p1) {
	return vtstd_u64(__p0, __p1);
}

EXPORT int64_t __natj_inline_vtstd_s64(int64_t __p0, int64_t __p1) {
	return vtstd_s64(__p0, __p1);
}

EXPORT int8_t __natj_inline_vuqaddb_s8(int8_t __p0, int8_t __p1) {
	return vuqaddb_s8(__p0, __p1);
}

EXPORT int32_t __natj_inline_vuqadds_s32(int32_t __p0, int32_t __p1) {
	return vuqadds_s32(__p0, __p1);
}

EXPORT int64_t __natj_inline_vuqaddd_s64(int64_t __p0, int64_t __p1) {
	return vuqaddd_s64(__p0, __p1);
}

EXPORT int16_t __natj_inline_vuqaddh_s16(int16_t __p0, int16_t __p1) {
	return vuqaddh_s16(__p0, __p1);
}

EXPORT float __natj_inline_simd_muladd(float x, float y, float z) {
	return simd_muladd(x, y, z);
}

EXPORT float __natj_inline_simd_sign(float x) {
	return simd_sign(x);
}

EXPORT float __natj_inline_simd_mix(float x, float y, float t) {
	return simd_mix(x, y, t);
}

EXPORT float __natj_inline_simd_precise_recip(float x) {
	return simd_precise_recip(x);
}

EXPORT float __natj_inline_simd_fast_recip(float x) {
	return simd_fast_recip(x);
}

EXPORT float __natj_inline_simd_recip(float x) {
	return simd_recip(x);
}

EXPORT float __natj_inline_simd_precise_rsqrt(float x) {
	return simd_precise_rsqrt(x);
}

EXPORT float __natj_inline_simd_fast_rsqrt(float x) {
	return simd_fast_rsqrt(x);
}

EXPORT float __natj_inline_simd_rsqrt(float x) {
	return simd_rsqrt(x);
}

EXPORT float __natj_inline_simd_fract(float x) {
	return simd_fract(x);
}

EXPORT float __natj_inline_simd_step(float edge, float x) {
	return simd_step(edge, x);
}

EXPORT float __natj_inline_simd_smoothstep(float edge0, float edge1, float x) {
	return simd_smoothstep(edge0, edge1, x);
}



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

#import <CoreFoundation/CFBase.h>
#import <CoreFoundation/CFByteOrder.h>
#import <CoreFoundation/CFString.h>
#import <MacTypes.h>
#import <_types/_uint16_t.h>
#import <_types/_uint32_t.h>
#import <_types/_uint64_t.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

EXPORT CFRange __natj_inline_CFRangeMake(CFIndex loc, CFIndex len) {
	return CFRangeMake(loc, len);
}

EXPORT CFByteOrder __natj_inline_CFByteOrderGetCurrent() {
	return CFByteOrderGetCurrent();
}

EXPORT uint16_t __natj_inline_CFSwapInt16(uint16_t arg) {
	return CFSwapInt16(arg);
}

EXPORT uint32_t __natj_inline_CFSwapInt32(uint32_t arg) {
	return CFSwapInt32(arg);
}

EXPORT uint64_t __natj_inline_CFSwapInt64(uint64_t arg) {
	return CFSwapInt64(arg);
}

EXPORT uint16_t __natj_inline_CFSwapInt16BigToHost(uint16_t arg) {
	return CFSwapInt16BigToHost(arg);
}

EXPORT uint32_t __natj_inline_CFSwapInt32BigToHost(uint32_t arg) {
	return CFSwapInt32BigToHost(arg);
}

EXPORT uint64_t __natj_inline_CFSwapInt64BigToHost(uint64_t arg) {
	return CFSwapInt64BigToHost(arg);
}

EXPORT uint16_t __natj_inline_CFSwapInt16HostToBig(uint16_t arg) {
	return CFSwapInt16HostToBig(arg);
}

EXPORT uint32_t __natj_inline_CFSwapInt32HostToBig(uint32_t arg) {
	return CFSwapInt32HostToBig(arg);
}

EXPORT uint64_t __natj_inline_CFSwapInt64HostToBig(uint64_t arg) {
	return CFSwapInt64HostToBig(arg);
}

EXPORT uint16_t __natj_inline_CFSwapInt16LittleToHost(uint16_t arg) {
	return CFSwapInt16LittleToHost(arg);
}

EXPORT uint32_t __natj_inline_CFSwapInt32LittleToHost(uint32_t arg) {
	return CFSwapInt32LittleToHost(arg);
}

EXPORT uint64_t __natj_inline_CFSwapInt64LittleToHost(uint64_t arg) {
	return CFSwapInt64LittleToHost(arg);
}

EXPORT uint16_t __natj_inline_CFSwapInt16HostToLittle(uint16_t arg) {
	return CFSwapInt16HostToLittle(arg);
}

EXPORT uint32_t __natj_inline_CFSwapInt32HostToLittle(uint32_t arg) {
	return CFSwapInt32HostToLittle(arg);
}

EXPORT uint64_t __natj_inline_CFSwapInt64HostToLittle(uint64_t arg) {
	return CFSwapInt64HostToLittle(arg);
}

EXPORT CFSwappedFloat32 __natj_inline_CFConvertFloat32HostToSwapped(Float32 arg) {
	return CFConvertFloat32HostToSwapped(arg);
}

EXPORT Float32 __natj_inline_CFConvertFloat32SwappedToHost(CFSwappedFloat32 arg) {
	return CFConvertFloat32SwappedToHost(arg);
}

EXPORT CFSwappedFloat64 __natj_inline_CFConvertFloat64HostToSwapped(Float64 arg) {
	return CFConvertFloat64HostToSwapped(arg);
}

EXPORT Float64 __natj_inline_CFConvertFloat64SwappedToHost(CFSwappedFloat64 arg) {
	return CFConvertFloat64SwappedToHost(arg);
}

EXPORT CFSwappedFloat32 __natj_inline_CFConvertFloatHostToSwapped(float arg) {
	return CFConvertFloatHostToSwapped(arg);
}

EXPORT float __natj_inline_CFConvertFloatSwappedToHost(CFSwappedFloat32 arg) {
	return CFConvertFloatSwappedToHost(arg);
}

EXPORT CFSwappedFloat64 __natj_inline_CFConvertDoubleHostToSwapped(double arg) {
	return CFConvertDoubleHostToSwapped(arg);
}

EXPORT double __natj_inline_CFConvertDoubleSwappedToHost(CFSwappedFloat64 arg) {
	return CFConvertDoubleSwappedToHost(arg);
}

EXPORT void __natj_inline_CFStringInitInlineBuffer(CFStringRef str, CFStringInlineBuffer * buf, CFRange range) {
	CFStringInitInlineBuffer(str, buf, range);
}

EXPORT UniChar __natj_inline_CFStringGetCharacterFromInlineBuffer(CFStringInlineBuffer * buf, CFIndex idx) {
	return CFStringGetCharacterFromInlineBuffer(buf, idx);
}

EXPORT Boolean __natj_inline_CFStringIsSurrogateHighCharacter(UniChar character) {
	return CFStringIsSurrogateHighCharacter(character);
}

EXPORT Boolean __natj_inline_CFStringIsSurrogateLowCharacter(UniChar character) {
	return CFStringIsSurrogateLowCharacter(character);
}

EXPORT UTF32Char __natj_inline_CFStringGetLongCharacterForSurrogatePair(UniChar surrogateHigh, UniChar surrogateLow) {
	return CFStringGetLongCharacterForSurrogatePair(surrogateHigh, surrogateLow);
}

EXPORT Boolean __natj_inline_CFStringGetSurrogatePairForLongCharacter(UTF32Char character, UniChar * surrogates) {
	return CFStringGetSurrogatePairForLongCharacter(character, surrogates);
}



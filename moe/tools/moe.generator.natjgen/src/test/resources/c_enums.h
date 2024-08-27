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

#ifndef NATJGEN_TEST_C_ENUMS__H
#define NATJGEN_TEST_C_ENUMS__H

#include "moe_types.h"
#include <limits.h>

typedef NJG_ENUM(char, CharEnum) {
	CharEnum_zero = 0,
	CharEnum_one = 1,
	CharEnum_min = SCHAR_MIN,
	CharEnum_max = SCHAR_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	CharEnum_diff = 0x55,
#else
	CharEnum_diff = (char)0xAA,
#endif
};

typedef NJG_ENUM(unsigned char, UCharEnum) {
	UCharEnum_zero = 0,
	UCharEnum_one = 1,
	UCharEnum_min = 0,
	UCharEnum_max = UCHAR_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	UCharEnum_diff = 0x55,
#else
	UCharEnum_diff = 0xAA,
#endif
};

typedef NJG_ENUM(short, ShortEnum) {
	ShortEnum_zero = 0,
	ShortEnum_one = 1,
	ShortEnum_min = SHRT_MIN,
	ShortEnum_max = SHRT_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	ShortEnum_diff = 0x5555,
#else
	ShortEnum_diff = (short)0xAAAA,
#endif
};

typedef NJG_ENUM(unsigned short, UShortEnum) {
	UShortEnum_zero = 0,
	UShortEnum_one = 1,
	UShortEnum_min = 0,
	UShortEnum_max = USHRT_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	UShortEnum_diff = 0x5555,
#else
	UShortEnum_diff = 0xAAAA,
#endif
};

typedef NJG_ENUM(int, IntEnum) {
	IntEnum_zero = 0,
	IntEnum_one = 1,
	IntEnum_min = INT_MIN,
	IntEnum_max = INT_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	IntEnum_diff = 0x55555555,
#else
	IntEnum_diff = (int)0xAAAAAAAA,
#endif
};

typedef NJG_ENUM(unsigned int, UIntEnum) {
	UIntEnum_zero = 0,
	UIntEnum_one = 1,
	UIntEnum_min = 0,
	UIntEnum_max = UINT_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	UIntEnum_diff = 0x55555555,
#else
	UIntEnum_diff = 0xAAAAAAAA,
#endif
};

typedef NJG_ENUM(long, LongEnum) {
	LongEnum_zero = 0,
	LongEnum_one = 1,
	LongEnum_min = LONG_MIN,
	LongEnum_max = LONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	LongEnum_diff = 0x5555555555555555,
#else
	LongEnum_diff = (long)0xAAAAAAAA,
#endif
};

typedef NJG_ENUM(unsigned long, ULongEnum) {
	ULongEnum_zero = 0,
	ULongEnum_one = 1,
	ULongEnum_min = 0,
	ULongEnum_max = ULONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	ULongEnum_diff = 0x5555555555555555,
#else
	ULongEnum_diff = 0xAAAAAAAA,
#endif
};

typedef NJG_ENUM(long long, LongLongEnum) {
	LongLongEnum_zero = 0,
	LongLongEnum_one = 1,
	LongLongEnum_min = LLONG_MIN,
	LongLongEnum_max = LLONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	LongLongEnum_diff = 0x5555555555555555,
#else
	LongLongEnum_diff = (long long)0xAAAAAAAAAAAAAAAA,
#endif
};

typedef NJG_ENUM(unsigned long long, ULongLongEnum) {
	ULongLongEnum_zero = 0,
	ULongLongEnum_one = 1,
	ULongLongEnum_min = 0,
	ULongLongEnum_max = ULLONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	ULongLongEnum_diff = 0x5555555555555555,
#else
	ULongLongEnum_diff = 0xAAAAAAAAAAAAAAAA,
#endif
};

typedef NJG_ENUM(moe_nint_t, NIntEnum) {
	NIntEnum_zero = 0,
	NIntEnum_one = 1,
	NIntEnum_min = LONG_MIN,
	NIntEnum_max = LONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	NIntEnum_diff = 0x5555555555555555,
#else
	NIntEnum_diff = (moe_nint_t)0xAAAAAAAA,
#endif
};

typedef NJG_ENUM(moe_nuint_t, NUIntEnum) {
	NUIntEnum_zero = 0,
	NUIntEnum_one = 1,
	NUIntEnum_min = 0,
	NUIntEnum_max = ULONG_MAX,
#if NATJGEN_PLATFORM_IS_64BIT
	NUIntEnum_diff = 0x5555555555555555,
#else
	NUIntEnum_diff = 0xAAAAAAAA,
#endif
};

#endif /* NATJGEN_TEST_C_ENUMS__H */

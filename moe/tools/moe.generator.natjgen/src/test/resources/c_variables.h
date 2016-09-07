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

 
#ifndef NATJGEN_TEST_C_VARIABLES__H
#define NATJGEN_TEST_C_VARIABLES__H

#include "moe_types.h"
#include <limits.h>

static const BOOL cvar_bool_false = false;
static const BOOL cvar_bool_true = true;
static const char cvar_int8_max = 0xFF;
static const unsigned char cvar_uint8_max = 0xFF;
static const short cvar_int16_max = 0xFFFF;
static const unsigned short cvar_uint16_max = 0xFFFF;

static const int cvar_int32_zero = 0;
static const int cvar_int32_poz_one = 1;
static const int cvar_int32_neg_one = -1;

static const unsigned int cvar_uint32_zero = 0;
static const unsigned int cvar_uint32_poz_one = 1;
static const unsigned int cvar_uint32_poz_max = ~0;

static const long long cvar_int64_zero = 0L;
static const long long cvar_int64_poz_one = 1L;
static const long long cvar_int64_neg_one = -1L;

static const unsigned long long cvar_uint64_zero = 0L;
static const unsigned long long cvar_uint64_poz_one = 1L;
static const unsigned long long cvar_uint64_poz_max = ~0L;

static const moe_nint_t cvar_nint_zero = 0L;
static const moe_nint_t cvar_nint_poz_one = 1L;
static const moe_nint_t cvar_nint_neg_one = -1L;

static const moe_nuint_t cvar_nuint_zero = 0L;
static const moe_nuint_t cvar_nuint_poz_one = 1L;
static const moe_nuint_t cvar_nuint_poz_max = ~0L;

static const moe_nfloat_t cvar_nfloat_zero = 0.0;
static const moe_nfloat_t cvar_nfloat_poz_one = 1.0;
static const moe_nfloat_t cvar_nfloat_neg_one = -1.0;

static const long cvar_long_max = LONG_MAX;
static const unsigned long cvar_ulong_max = ULONG_MAX;

static const moe_nint_t cvar_nint_max = LONG_MAX;
static const moe_nuint_t cvar_nuint_max = ULONG_MAX;

static const moe_nint_t cvar_nint_signbit = 1L << 31;
static const moe_nuint_t cvar_nuint_signbit = 1L << 31;

#if NATJGEN_PLATFORM_IS_64BIT

static const BOOL cvar_bool_diff = true;

static const char cvar_int8_diff = 0xFE;
static const unsigned char cvar_uint8_diff = 0xFE;

static const short cvar_int16_diff = 0xFEDC;
static const unsigned short cvar_uint16_diff = 0xFEDC;

static const moe_nint_t cvar_nint_diff = 0x123456789ABCDEF0;
static const moe_nuint_t cvar_nuint_diff = 0xFEDCBA9876543210;
static const moe_nfloat_t cvar_nfloat_diff = 3.402823e+48;

static const long long cvar_int64_diff = 1L;

#else

static const BOOL cvar_bool_diff = false;

static const char cvar_int8_diff = 0x12;
static const unsigned char cvar_uint8_diff = 0x12;

static const short cvar_int16_diff = 0x1234;
static const unsigned short cvar_uint16_diff = 0x1234;

static const moe_nint_t cvar_nint_diff = 0x12345678;
static const moe_nuint_t cvar_nuint_diff = 0xFEDCBA98;
static const moe_nfloat_t cvar_nfloat_diff = 3.402823e+38;

static const long long cvar_int64_diff = 0L;

#endif

#endif /* NATJGEN_TEST_C_VARIABLES__H */

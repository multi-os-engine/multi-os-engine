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

#include "moe_types.h"

#pragma mark - void

void basic_types_void_fn_ret();

#pragma mark - char

char basic_types_char_fn_ret();
void basic_types_char_fn_arg(char val);
unsigned char basic_types_unsigned_char_fn_ret();
void basic_types_unsigned_char_fn_arg(unsigned char val);
signed char basic_types_signed_char_fn_ret();
void basic_types_signed_char_fn_arg(signed char val);

#pragma mark - short

short basic_types_short_fn_ret();
void basic_types_short_fn_arg(short val);
unsigned short basic_types_unsigned_short_fn_ret();
void basic_types_unsigned_short_fn_arg(unsigned short val);
signed short basic_types_signed_short_fn_ret();
void basic_types_signed_short_fn_arg(signed short val);

#pragma mark - int

int basic_types_int_fn_ret();
void basic_types_int_fn_arg(int val);
unsigned int basic_types_unsigned_int_fn_ret();
void basic_types_unsigned_int_fn_arg(unsigned int val);
signed int basic_types_signed_int_fn_ret();
void basic_types_signed_int_fn_arg(signed int val);

#pragma mark - long long

long long basic_types_long_long_fn_ret();
void basic_types_long_long_fn_arg(long long val);
unsigned long long basic_types_unsigned_long_long_fn_ret();
void basic_types_unsigned_long_long_fn_arg(unsigned long long val);
signed long long basic_types_signed_long_long_fn_ret();
void basic_types_signed_long_long_fn_arg(signed long long val);

#pragma mark - float

float basic_types_float_fn_ret();
void basic_types_float_fn_arg(float val);

#pragma mark - double

double basic_types_double_fn_ret();
void basic_types_double_fn_arg(double val);

#pragma mark - nint

moe_nint_t basic_types_nint_fn_ret();
void basic_types_nint_fn_arg(moe_nint_t val);

#pragma mark - nuint

moe_nuint_t basic_types_nuint_fn_ret();
void basic_types_nuint_fn_arg(moe_nuint_t val);

#pragma mark - nfloat

moe_nfloat_t basic_types_nfloat_fn_ret();
void basic_types_nfloat_fn_arg(moe_nfloat_t val);

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

#define NATJGEN_TEST_CREATE_PTR_FUNCTIONS(__type)\
NATJGEN_TEST_CREATE_PTR_FUNCTIONS3(,__type,)

#define NATJGEN_TEST_CREATE_PTR_FUNCTIONS_OWNED(__ownership, __type)\
NATJGEN_TEST_CREATE_PTR_FUNCTIONS3(__ownership,__type,)

#define NATJGEN_TEST_CREATE_PTR_FUNCTIONS2(__type, __typeptr)\
NATJGEN_TEST_CREATE_PTR_FUNCTIONS3(,__type,__typeptr)

#define NATJGEN_TEST_CREATE_PTR_FUNCTIONS3(__ownership, __type, __typeptr)\
__type __typeptr __ownership * __type ## _ptr_fn_ret();\
__type __typeptr const __ownership * const_ ## __type ## _ptr_fn_ret();\
\
__type __typeptr __ownership * * __type ## _ptr_ptr_fn_ret();\
__type __typeptr __ownership * const * __type ## _ptr_const_ptr_fn_ret();\
__type __typeptr const __ownership * * const_ ## __type ## _ptr_ptr_fn_ret();\
__type __typeptr const __ownership * const * const_ ## __type ## _ptr_const_ptr_fn_ret();\
\
__type __typeptr __ownership * * * __type ## _ptr_ptr_ptr_fn_ret();\
__type __typeptr __ownership * * const * __type ## _ptr_ptr_const_ptr_fn_ret();\
__type __typeptr __ownership * const * * __type ## _ptr_const_ptr_ptr_fn_ret();\
__type __typeptr __ownership * const * const * __type ## _ptr_const_ptr_const_ptr_fn_ret();\
__type __typeptr const __ownership * * * const_ ## __type ## _ptr_ptr_ptr_fn_ret();\
__type __typeptr const __ownership * * const * const_ ## __type ## _ptr_ptr_const_ptr_fn_ret();\
__type __typeptr const __ownership * const * * const_ ## __type ## _ptr_const_ptr_ptr_fn_ret();\
__type __typeptr const __ownership * const * const * const_ ## __type ## _ptr_const_ptr_const_ptr_fn_ret();\
\
void __type ## _ptr_fn_arg(__type __typeptr __ownership *);\
void const_ ## __type ## _ptr_fn_arg(__type __typeptr const __ownership *);\
\
void __type ## _ptr_ptr_fn_arg(__type __typeptr __ownership * *);\
void __type ## _ptr_const_ptr_fn_arg(__type __typeptr __ownership * const *);\
void const_ ## __type ## _ptr_ptr_fn_arg(__type __typeptr const __ownership * *);\
void const_ ## __type ## _ptr_const_ptr_fn_arg(__type __typeptr const __ownership * const *);\
\
void __type ## _ptr_ptr_ptr_fn_arg(__type __typeptr __ownership * * *);\
void __type ## _ptr_ptr_const_ptr_fn_arg(__type __typeptr __ownership * * const *);\
void __type ## _ptr_const_ptr_ptr_fn_arg(__type __typeptr __ownership * const * *);\
void __type ## _ptr_const_ptr_const_ptr_fn_arg(__type __typeptr __ownership * const * const *);\
void const_ ## __type ## _ptr_ptr_ptr_fn_arg(__type __typeptr const __ownership * * *);\
void const_ ## __type ## _ptr_ptr_const_ptr_fn_arg(__type __typeptr const __ownership * * const *);\
void const_ ## __type ## _ptr_const_ptr_ptr_fn_arg(__type __typeptr const __ownership * const * *);\
void const_ ## __type ## _ptr_const_ptr_const_ptr_fn_arg(__type __typeptr const __ownership * const * const *);

NATJGEN_TEST_CREATE_PTR_FUNCTIONS(void)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(char)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_unichar_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(short)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(int)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_int64_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_nint_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_nuint_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(float)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(double)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_nfloat_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_struct_t)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(moe_opaqueptr_t)

#ifdef __OBJC__

NATJGEN_TEST_CREATE_PTR_FUNCTIONS_OWNED(__strong, id)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS3(__strong, moe_objc_class, *)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS(SEL)
NATJGEN_TEST_CREATE_PTR_FUNCTIONS2(Class, *)

#endif /* __OBJC__ */

#undef NATJGEN_TEST_CREATE_PTR_FUNCTIONS

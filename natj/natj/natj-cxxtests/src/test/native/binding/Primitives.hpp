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

#ifndef Binding_Primitives_hpp
#define Binding_Primitives_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    class Primitives {
    public:
        enum InvocationID : int {
            ILLEGAL,
            CTOR_PRIMITIVES,
            CTOR_I1,
            CTOR_I8,
            CTOR_I16,
            CTOR_I32,
            CTOR_IL,
            CTOR_I64,
            CTOR_U8,
            CTOR_U16,
            CTOR_U32,
            CTOR_U64,
            CTOR_UL,
            CTOR_F32,
            CTOR_F64,
            CTOR_C8,
            CTOR_C16,
            CTOR_C32,
            CTOR_CWI,
            GET_I1,
            GET_I8,
            GET_I16,
            GET_I32,
            GET_IL,
            GET_I64,
            GET_U8,
            GET_U16,
            GET_U32,
            GET_UL,
            GET_U64,
            GET_F32,
            GET_F64,
            GET_C8,
            GET_C16,
            GET_C32,
            GET_CWI,
            SET_I1,
            SET_I8,
            SET_I16,
            SET_I32,
            SET_IL,
            SET_I64,
            SET_U8,
            SET_U16,
            SET_U32,
            SET_UL,
            SET_U64,
            SET_F32,
            SET_F64,
            SET_C8,
            SET_C16,
            SET_C32,
            SET_CWI,
            PASS_I1,
            PASS_I8,
            PASS_I16,
            PASS_I32,
            PASS_IL,
            PASS_I64,
            PASS_U8,
            PASS_U16,
            PASS_U32,
            PASS_UL,
            PASS_U64,
            PASS_F32,
            PASS_F64,
            PASS_C8,
            PASS_C16,
            PASS_C32,
            PASS_CWI,
        };
        static InvocationID lastInvocation;
    private:
        m_longlong_t seed;
    public:
        Primitives() : seed(0)  { lastInvocation = CTOR_PRIMITIVES; }

        // Regex: Primitives($5 pSeed) : seed(pSeed) { }
        Primitives(m_bool_t pSeed) : seed(pSeed) { lastInvocation = CTOR_I1; }
        Primitives(m_sbyte_t pSeed) : seed(pSeed) { lastInvocation = CTOR_I8; }
        Primitives(m_short_t pSeed) : seed(pSeed) { lastInvocation = CTOR_I16; }
        Primitives(m_int_t pSeed) : seed(pSeed) { lastInvocation = CTOR_I32; }
        Primitives(m_long_t pSeed) : seed(pSeed) { lastInvocation = CTOR_IL; }
        Primitives(m_longlong_t pSeed) : seed(pSeed) { lastInvocation = CTOR_I64; }
        Primitives(m_ubyte_t pSeed) : seed(pSeed) { lastInvocation = CTOR_U8; }
        Primitives(m_ushort_t pSeed) : seed(pSeed) { lastInvocation = CTOR_U16; }
        Primitives(m_uint_t pSeed) : seed(pSeed) { lastInvocation = CTOR_U32; }
        Primitives(m_ulong_t pSeed) : seed(pSeed) { lastInvocation = CTOR_UL; }
        Primitives(m_ulonglong_t pSeed) : seed(pSeed) { lastInvocation = CTOR_U64; }
        Primitives(m_float_t pSeed) : seed(pSeed) { lastInvocation = CTOR_F32; }
        Primitives(m_double_t pSeed) : seed(pSeed) { lastInvocation = CTOR_F64; }
        Primitives(m_byte_t pSeed) : seed(pSeed) { lastInvocation = CTOR_C8; }
        Primitives(m_char16_t pSeed) : seed(pSeed) { lastInvocation = CTOR_C16; }
        Primitives(m_char32_t pSeed) : seed(pSeed) { lastInvocation = CTOR_C32; }
        Primitives(m_wchar_t pSeed) : seed(pSeed) { lastInvocation = CTOR_CWI; }

        // Regex: $5 get$8() const { return seed; }
        m_bool_t getI1() const { lastInvocation = GET_I1; return seed; }
        m_sbyte_t getI8() const { lastInvocation = GET_I8; return seed; }
        m_short_t getI16() const { lastInvocation = GET_I16; return seed; }
        m_int_t getI32() const { lastInvocation = GET_I32; return seed & 0xFFFFFFFF; }
        m_long_t getIL() const { lastInvocation = GET_IL; return seed; }
        m_longlong_t getI64() const { lastInvocation = GET_I64; return seed; }
        m_ubyte_t getU8() const { lastInvocation = GET_U8; return seed; }
        m_ushort_t getU16() const { lastInvocation = GET_U16; return seed; }
        m_uint_t getU32() const { lastInvocation = GET_U32; return seed & 0xFFFFFFFF; }
        m_ulong_t getUL() const { lastInvocation = GET_UL; return seed; }
        m_ulonglong_t getU64() const { lastInvocation = GET_U64; return seed; }
        m_float_t getF32() const { lastInvocation = GET_F32; return seed; }
        m_double_t getF64() const { lastInvocation = GET_F64; return seed; }
        m_byte_t getC8() const { lastInvocation = GET_C8; return seed; }
        m_char16_t getC16() const { lastInvocation = GET_C16; return seed; }
        m_char32_t getC32() const { lastInvocation = GET_C32; return (m_char32_t)seed; }
        m_wchar_t getCWI() const { lastInvocation = GET_CWI; return (m_wchar_t)seed; }

        // Regex: void set($5 value) { seed = value; }
        void set(m_bool_t value) { seed = value; lastInvocation = SET_I1; }
        void set(m_sbyte_t value) { seed = value; lastInvocation = SET_I8; }
        void set(m_short_t value) { seed = value; lastInvocation = SET_I16; }
        void set(m_int_t value) { seed = value; lastInvocation = SET_I32; }
        void set(m_long_t value) { seed = value; lastInvocation = SET_IL; }
        void set(m_longlong_t value) { seed = value; lastInvocation = SET_I64; }
        void set(m_ubyte_t value) { seed = value; lastInvocation = SET_U8; }
        void set(m_ushort_t value) { seed = value; lastInvocation = SET_U16; }
        void set(m_uint_t value) { seed = value; lastInvocation = SET_U32; }
        void set(m_ulong_t value) { seed = value; lastInvocation = SET_UL; }
        void set(m_ulonglong_t value) { seed = value; lastInvocation = SET_U64; }
        void set(m_float_t value) { seed = value; lastInvocation = SET_F32; }
        void set(m_double_t value) { seed = value; lastInvocation = SET_F64; }
        void set(m_byte_t value) { seed = value; lastInvocation = SET_C8; }
        void set(m_char16_t value) { seed = value; lastInvocation = SET_C16; }
        void set(m_char32_t value) { seed = value; lastInvocation = SET_C32; }
        void set(m_wchar_t value) { seed = value; lastInvocation = SET_CWI; }

        // Regex: static $5 pass($5 value) { return value; }
        static m_bool_t pass(m_bool_t value) { lastInvocation = PASS_I1; return value; }
        static m_sbyte_t pass(m_sbyte_t value) {  lastInvocation = PASS_I8; return value;}
        static m_short_t pass(m_short_t value) { lastInvocation = PASS_I16; return value; }
        static m_int_t pass(m_int_t value) { lastInvocation = PASS_I32; return value; }
        static m_long_t pass(m_long_t value) { lastInvocation = PASS_IL; return value; }
        static m_longlong_t pass(m_longlong_t value) { lastInvocation = PASS_I64; return value; }
        static m_ubyte_t pass(m_ubyte_t value) { lastInvocation = PASS_U8; return value; }
        static m_ushort_t pass(m_ushort_t value) { lastInvocation = PASS_U16; return value; }
        static m_uint_t pass(m_uint_t value) { lastInvocation = PASS_U32; return value; }
        static m_ulong_t pass(m_ulong_t value) { lastInvocation = PASS_UL; return value; }
        static m_ulonglong_t pass(m_ulonglong_t value) { lastInvocation = PASS_U64; return value; }
        static m_float_t pass(m_float_t value) { lastInvocation = PASS_F32; return value; }
        static m_double_t pass(m_double_t value) { lastInvocation = PASS_F64; return value; }
        static m_byte_t pass(m_byte_t value) {  lastInvocation = PASS_C8; return value;}
        static m_char16_t pass(m_char16_t value) {  lastInvocation = PASS_C16; return value;}
        static m_char32_t pass(m_char32_t value) {  lastInvocation = PASS_C32; return value;}
        static m_wchar_t pass(m_wchar_t value) {  lastInvocation = PASS_CWI; return value;}
    };
} } } }

#endif /* Binding_Primitives_hpp */

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

#ifndef Inheritance_Operators_hpp
#define Inheritance_Operators_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace inheritance {
    class Operators {
    public:
        virtual ~Operators() {}

        virtual int operator++() = 0;
        virtual int operator--() = 0;
        virtual int operator++(int) = 0;
        virtual int operator--(int) = 0;

        virtual int operator+() const = 0;
        virtual int operator-() const = 0;

        virtual bool operator!() const = 0;
        virtual int operator~() const = 0;

        virtual int operator+(int rhs) const = 0;
        virtual int operator-(int rhs) const = 0;
        virtual int operator*(int rhs) const = 0;
        virtual int operator/(int rhs) const = 0;
        virtual int operator%(int rhs) const = 0;

        virtual bool operator==(int rhs) const = 0;
        virtual bool operator!=(int rhs) const = 0;
        virtual bool operator<(int rhs) const = 0;
        virtual bool operator<=(int rhs) const = 0;
        virtual bool operator>(int rhs) const = 0;
        virtual bool operator>=(int rhs) const = 0;

        virtual bool operator&&(int rhs) const = 0;
        virtual bool operator||(int rhs) const = 0;

        virtual int operator&(int rhs) const = 0;
        virtual int operator|(int rhs) const = 0;
        virtual int operator^(int rhs) const = 0;
        virtual int operator<<(int rhs) const = 0;
        virtual int operator>>(int rhs) const = 0;

        virtual int operator+=(int rhs) = 0;
        virtual int operator-=(int rhs) = 0;
        virtual int operator*=(int rhs) = 0;
        virtual int operator/=(int rhs) = 0;
        virtual int operator%=(int rhs) = 0;

        virtual int operator&=(int rhs) = 0;
        virtual int operator|=(int rhs) = 0;
        virtual int operator^=(int rhs) = 0;
        virtual int operator<<=(int rhs) = 0;
        virtual int operator>>=(int rhs) = 0;

        virtual int operator[](int idx) const = 0;

        virtual int operator()() const = 0;
        virtual int operator()(int a) const = 0;
        virtual int operator()(int a, int b) const = 0;
        virtual int operator()(int a, int b, int c) const = 0;
        virtual int operator->() const = 0;
    };

    inline int invoke_preInc(Operators *op) { return op->operator++(); }
    inline int invoke_preDec(Operators *op) { return op->operator--(); }
    inline int invoke_postInc(Operators *op) { return op->operator++(0); }
    inline int invoke_postDec(Operators *op) { return op->operator--(0); }

    inline int invoke_unaryPlus(Operators *op) { return op->operator+(); }
    inline int invoke_unaryMinus(Operators *op) { return op->operator-(); }

    inline bool invoke_negate(Operators *op) { return op->operator!(); }
    inline int invoke_complement(Operators *op) { return op->operator~(); }

    inline int invoke_add(Operators *op, int value) { return op->operator+(value); }
    inline int invoke_sub(Operators *op, int value) { return op->operator-(value); }
    inline int invoke_mul(Operators *op, int value) { return op->operator*(value); }
    inline int invoke_div(Operators *op, int value) { return op->operator/(value); }
    inline int invoke_mod(Operators *op, int value) { return op->operator%(value); }

    inline bool invoke_eq(Operators *op, int value) { return op->operator==(value); }
    inline bool invoke_neq(Operators *op, int value) { return op->operator!=(value); }
    inline bool invoke_lt(Operators *op, int value) { return op->operator<(value); }
    inline bool invoke_le(Operators *op, int value) { return op->operator<=(value); }
    inline bool invoke_gt(Operators *op, int value) { return op->operator>(value); }
    inline bool invoke_ge(Operators *op, int value) { return op->operator>=(value); }

    inline bool invoke_land(Operators *op, int value) { return op->operator&&(value); }
    inline bool invoke_lor(Operators *op, int value) { return op->operator||(value); }

    inline int invoke_band(Operators *op, int value) { return op->operator&(value); }
    inline int invoke_bor(Operators *op, int value) { return op->operator|(value); }
    inline int invoke_bxor(Operators *op, int value) { return op->operator^(value); }
    inline int invoke_lsh(Operators *op, int value) { return op->operator<<(value); }
    inline int invoke_rsh(Operators *op, int value) { return op->operator>>(value); }

    inline int invoke_get(Operators *op, int offs) { return op->operator[](offs); }

    inline int invoke_add_assign(Operators *op, int value) { return op->operator+=(value); }
    inline int invoke_sub_assign(Operators *op, int value) { return op->operator-=(value); }
    inline int invoke_mul_assign(Operators *op, int value) { return op->operator*=(value); }
    inline int invoke_div_assign(Operators *op, int value) { return op->operator/=(value); }
    inline int invoke_mod_assign(Operators *op, int value) { return op->operator%=(value); }
    inline int invoke_band_assign(Operators *op, int value) { return op->operator&=(value); }
    inline int invoke_bor_assign(Operators *op, int value) { return op->operator|=(value); }
    inline int invoke_bxor_assign(Operators *op, int value) { return op->operator^=(value); }
    inline int invoke_lsh_assign(Operators *op, int value) { return op->operator<<=(value); }
    inline int invoke_rsh_assign(Operators *op, int value) { return op->operator>>=(value); }

    inline int invoke_call0(Operators *op) { return op->operator()(); }
    inline int invoke_call1(Operators *op, int value) { return op->operator()(value); }
    inline int invoke_call2(Operators *op, int value, int value2) { return op->operator()(value, value2); }
    inline int invoke_call3(Operators *op, int value, int value2, int value3) { return op->operator()(value, value2, value3); }
    inline int invoke_arrow(Operators *op) { return op->operator->(); }

    class CastOperators {
    public:
        virtual ~CastOperators() {}

        virtual operator bool() = 0;
        virtual operator int() = 0;
        virtual operator MyClass() = 0;
        virtual operator MyClass&() = 0;
        virtual operator MyClass*() = 0;
        virtual operator const MyClass() const = 0;
        virtual operator const MyClass&() const = 0;
        virtual operator const MyClass*() const = 0;
        virtual operator natj_jobject_t() = 0;
    };

    inline bool invoke_toBool(CastOperators *op) { return op->operator bool(); }
    inline int invoke_toInt(CastOperators *op) { return op->operator int(); }
    inline MyClass invoke_toMyClassValue(CastOperators *op) { return op->operator MyClass(); }
    inline MyClass& invoke_toMyClassReference(CastOperators *op) { return op->operator MyClass&(); }
    inline MyClass* invoke_toMyClass(CastOperators *op) { return op->operator MyClass*(); }
    inline const MyClass invoke_toConstMyClassValue(const CastOperators *op) { return op->operator const MyClass(); }
    inline const MyClass& invoke_toConstMyClassReference(const CastOperators *op) { return op->operator const MyClass&(); }
    inline const MyClass* invoke_toConstMyClass(const CastOperators *op) { return op->operator const MyClass*(); }
    inline natj_jobject_t invoke_toObject(CastOperators *op) { return op->operator natj_jobject_t(); }
} } } }

#endif /* Inheritance_Operators_hpp */

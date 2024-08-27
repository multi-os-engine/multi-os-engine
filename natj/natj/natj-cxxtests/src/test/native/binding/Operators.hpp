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

#ifndef Binding_Operators_hpp
#define Binding_Operators_hpp

#include "../BaseTypes.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    class Int {
    public:
        enum OperatorID : int {
            ILLEGAL,
            POST_INCREMENT,
            POST_DECREMENT,
            PRE_INCREMENT,
            PRE_DECREMENT,
            UNARY_PLUS,
            UNARY_MINUS,
            NEGATE,
            COMPLEMENT,
            ADD,
            SUBTRACT,
            MULTIPLY,
            DIVIDE,
            MODULUS,
            EQUAL,
            INEQUAL,
            GREATER,
            LESS,
            GREATER_EQUAL,
            LESS_EQUAL,
            LOGICAL_AND,
            LOGICAL_OR,
            BITWISE_AND,
            BITWISE_OR,
            BITWISE_XOR,
            LEFT_SHIFT,
            RIGHT_SHIFT,
            ADD_ASSIGN,
            SUBTRACT_ASSIGN,
            MULTIPLY_ASSIGN,
            DIVIDE_ASSIGN,
            MODULUS_ASSIGN,
            RIGHT_SHIFT_ASSIGN,
            LEFT_SHIFT_ASSIGN,
            BITWISE_AND_ASSIGN,
            BITWISE_XOR_ASSIGN,
            BITWISE_OR_ASSIGN,
            ASSIGN,
            SUBSCRIPT,
            EXT_SUBSCRIPT_ASSIGN,
            FUNCTION_CALL,
            ARROW,
        };
        static OperatorID lastInvocation;
    private:
        int mValue;

        Int(int value) : mValue(value) {}
    public:
        Int() : mValue(0) {}
        int get() const { return mValue; }
        void set(int value) { mValue = value; }

        Int& operator++() { ++mValue; lastInvocation = PRE_INCREMENT; return *this; }
        Int& operator--() { --mValue; lastInvocation = PRE_DECREMENT; return *this; }
        Int operator++(int) { Int ret(mValue); ++mValue; lastInvocation = POST_INCREMENT; return ret; }
        Int operator--(int) { Int ret(mValue); --mValue; lastInvocation = POST_DECREMENT; return ret; }

        Int operator+() const { lastInvocation = UNARY_PLUS; return Int(mValue); }
        Int operator-() const { lastInvocation = UNARY_MINUS; return Int(-mValue); }

        bool operator!() const { lastInvocation = NEGATE; return !mValue; }
        Int operator~() const { lastInvocation = COMPLEMENT; return Int(~mValue); }

        Int operator+(int rhs) const { lastInvocation = ADD; return Int(mValue + rhs); }
        Int operator-(int rhs) const { lastInvocation = SUBTRACT; return Int(mValue - rhs); }
        Int operator*(int rhs) const { lastInvocation = MULTIPLY; return Int(mValue * rhs); }
        Int operator/(int rhs) const { lastInvocation = DIVIDE; return Int(mValue / rhs); }
        Int operator%(int rhs) const { lastInvocation = MODULUS; return Int(mValue % rhs); }

        bool operator==(const Int& rhs) const { lastInvocation = EQUAL; return mValue == rhs.mValue; }
        bool operator!=(const Int& rhs) const { lastInvocation = INEQUAL; return mValue != rhs.mValue; }
        bool operator<(const Int& rhs) const { lastInvocation = LESS; return mValue < rhs.mValue; }
        bool operator<=(const Int& rhs) const { lastInvocation = LESS_EQUAL; return mValue <= rhs.mValue; }
        bool operator>(const Int& rhs) const { lastInvocation = GREATER; return mValue > rhs.mValue; }
        bool operator>=(const Int& rhs) const { lastInvocation = GREATER_EQUAL; return mValue >= rhs.mValue; }

        bool operator&&(const Int& rhs) const { lastInvocation = LOGICAL_AND; return mValue && rhs.mValue; }
        bool operator||(const Int& rhs) const { lastInvocation = LOGICAL_OR; return mValue || rhs.mValue; }

        Int operator&(const Int& rhs) const { lastInvocation = BITWISE_AND; return mValue & rhs.mValue; }
        Int operator|(const Int& rhs) const { lastInvocation = BITWISE_OR; return mValue | rhs.mValue; }
        Int operator^(const Int& rhs) const { lastInvocation = BITWISE_XOR; return mValue ^ rhs.mValue; }
        Int operator<<(const Int& rhs) const { lastInvocation = LEFT_SHIFT; return mValue << rhs.mValue; }
        Int operator>>(const Int& rhs) const { lastInvocation = RIGHT_SHIFT; return mValue >> rhs.mValue; }

        Int& operator+=(int rhs) { mValue += rhs; lastInvocation = ADD_ASSIGN; return *this; }
        Int& operator-=(int rhs) { mValue -= rhs; lastInvocation = SUBTRACT_ASSIGN; return *this; }
        Int& operator*=(int rhs) { mValue *= rhs; lastInvocation = MULTIPLY_ASSIGN; return *this; }
        Int& operator/=(int rhs) { mValue /= rhs; lastInvocation = DIVIDE_ASSIGN; return *this; }
        Int& operator%=(int rhs) { mValue %= rhs; lastInvocation = MODULUS_ASSIGN; return *this; }

        Int& operator&=(const Int& rhs) { mValue &= rhs.mValue; lastInvocation = BITWISE_AND_ASSIGN; return *this; }
        Int& operator|=(const Int& rhs) { mValue |= rhs.mValue; lastInvocation = BITWISE_OR_ASSIGN; return *this; }
        Int& operator^=(const Int& rhs) { mValue ^= rhs.mValue; lastInvocation = BITWISE_XOR_ASSIGN; return *this; }
        Int& operator<<=(const Int& rhs) { mValue <<= rhs.mValue; lastInvocation = LEFT_SHIFT_ASSIGN; return *this; }
        Int& operator>>=(const Int& rhs) { mValue >>= rhs.mValue; lastInvocation = RIGHT_SHIFT_ASSIGN; return *this; }

        int operator[](int idx) const { lastInvocation = SUBSCRIPT; return mValue + idx; }

        int operator()(int a, int b, int c) const { lastInvocation = FUNCTION_CALL; return mValue + a + b + c; }
        int operator->() const { lastInvocation = ARROW; return mValue; }
    };

    class IntExtOp {
    public:
        enum OperatorID : int {
            ILLEGAL,
            INTEXTOP_POST_INCREMENT,
            INTEXTOP_POST_DECREMENT,
            INTEXTOP_PRE_INCREMENT,
            INTEXTOP_PRE_DECREMENT,
            INTEXTOP_UNARY_PLUS,
            INTEXTOP_UNARY_MINUS,
            INTEXTOP_NEGATE,
            INTEXTOP_COMPLEMENT,
            INTEXTOP_ADD,
            INTEXTOP_SUBTRACT,
            INTEXTOP_MULTIPLY,
            INTEXTOP_DIVIDE,
            INTEXTOP_MODULUS,
            INTEXTOP_EQUAL,
            INTEXTOP_INEQUAL,
            INTEXTOP_GREATER,
            INTEXTOP_LESS,
            INTEXTOP_GREATER_EQUAL,
            INTEXTOP_LESS_EQUAL,
            INTEXTOP_LOGICAL_AND,
            INTEXTOP_LOGICAL_OR,
            INTEXTOP_BITWISE_AND,
            INTEXTOP_BITWISE_OR,
            INTEXTOP_BITWISE_XOR,
            INTEXTOP_LEFT_SHIFT,
            INTEXTOP_RIGHT_SHIFT,
            INTEXTOP_ADD_ASSIGN,
            INTEXTOP_SUBTRACT_ASSIGN,
            INTEXTOP_MULTIPLY_ASSIGN,
            INTEXTOP_DIVIDE_ASSIGN,
            INTEXTOP_MODULUS_ASSIGN,
            INTEXTOP_RIGHT_SHIFT_ASSIGN,
            INTEXTOP_LEFT_SHIFT_ASSIGN,
            INTEXTOP_BITWISE_AND_ASSIGN,
            INTEXTOP_BITWISE_XOR_ASSIGN,
            INTEXTOP_BITWISE_OR_ASSIGN,
            INTEXTOP_ASSIGN,
            INTEXTOP_SUBSCRIPT,
            INTEXTOP_EXT_SUBSCRIPT_ASSIGN,
        };
        static OperatorID lastInvocation;
    private:
        int mValue;

        IntExtOp(int value) : mValue(value) {}
    public:
        IntExtOp() : mValue(0) {}
        int get() const { return mValue; }
        void set(int value) { mValue = value; }

        friend IntExtOp& operator++(IntExtOp& lhs);
        friend IntExtOp& operator--(IntExtOp& lhs);
        friend IntExtOp operator++(IntExtOp& lhs, int);
        friend IntExtOp operator--(IntExtOp& lhs, int);

        friend IntExtOp operator+(const IntExtOp& lhs);
        friend IntExtOp operator-(const IntExtOp& lhs);

        friend bool operator!(const IntExtOp& lhs);
        friend IntExtOp operator~(const IntExtOp& lhs);

        friend IntExtOp operator+(const IntExtOp& lhs, int rhs);
        friend IntExtOp operator-(const IntExtOp& lhs, int rhs);
        friend IntExtOp operator*(const IntExtOp& lhs, int rhs);
        friend IntExtOp operator/(const IntExtOp& lhs, int rhs);
        friend IntExtOp operator%(const IntExtOp& lhs, int rhs);

        friend bool operator==(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator!=(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator<(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator<=(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator>(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator>=(const IntExtOp& lhs, const IntExtOp& rhs);

        friend bool operator&&(const IntExtOp& lhs, const IntExtOp& rhs);
        friend bool operator||(const IntExtOp& lhs, const IntExtOp& rhs);

        friend IntExtOp operator&(const IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp operator|(const IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp operator^(const IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp operator<<(const IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp operator>>(const IntExtOp& lhs, const IntExtOp& rhs);

        friend IntExtOp& operator+=(IntExtOp& lhs, int rhs);
        friend IntExtOp& operator-=(IntExtOp& lhs, int rhs);
        friend IntExtOp& operator*=(IntExtOp& lhs, int rhs);
        friend IntExtOp& operator/=(IntExtOp& lhs, int rhs);
        friend IntExtOp& operator%=(IntExtOp& lhs, int rhs);

        friend IntExtOp& operator&=(IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp& operator|=(IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp& operator^=(IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp& operator<<=(IntExtOp& lhs, const IntExtOp& rhs);
        friend IntExtOp& operator>>=(IntExtOp& lhs, const IntExtOp& rhs);
    };

    IntExtOp& operator++(IntExtOp& lhs);
    IntExtOp& operator--(IntExtOp& lhs);
    IntExtOp operator++(IntExtOp& lhs, int);
    IntExtOp operator--(IntExtOp& lhs, int);

    IntExtOp operator+(const IntExtOp& lhs);
    IntExtOp operator-(const IntExtOp& lhs);

    bool operator!(const IntExtOp& lhs);
    IntExtOp operator~(const IntExtOp& lhs);

    IntExtOp operator+(const IntExtOp& lhs, int rhs);
    IntExtOp operator-(const IntExtOp& lhs, int rhs);
    IntExtOp operator*(const IntExtOp& lhs, int rhs);
    IntExtOp operator/(const IntExtOp& lhs, int rhs);
    IntExtOp operator%(const IntExtOp& lhs, int rhs);

    bool operator==(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator!=(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator<(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator<=(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator>(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator>=(const IntExtOp& lhs, const IntExtOp& rhs);

    bool operator&&(const IntExtOp& lhs, const IntExtOp& rhs);
    bool operator||(const IntExtOp& lhs, const IntExtOp& rhs);

    IntExtOp operator&(const IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp operator|(const IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp operator^(const IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp operator<<(const IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp operator>>(const IntExtOp& lhs, const IntExtOp& rhs);

    IntExtOp& operator+=(IntExtOp& lhs, int rhs);
    IntExtOp& operator-=(IntExtOp& lhs, int rhs);
    IntExtOp& operator*=(IntExtOp& lhs, int rhs);
    IntExtOp& operator/=(IntExtOp& lhs, int rhs);
    IntExtOp& operator%=(IntExtOp& lhs, int rhs);

    IntExtOp& operator&=(IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp& operator|=(IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp& operator^=(IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp& operator<<=(IntExtOp& lhs, const IntExtOp& rhs);
    IntExtOp& operator>>=(IntExtOp& lhs, const IntExtOp& rhs);

    class IntCastOp {
    public:
        operator bool() { return true; }
        operator int() { return 100; }
        operator MyClass() { return MyClass(200); }
        operator MyClass&() { MyClass *tmp = new MyClass(201); return *tmp; }
        operator MyClass*() { MyClass *tmp = new MyClass(202); return tmp; }
        operator const MyClass() const { return MyClass(300); }
        operator const MyClass&() const { MyClass *tmp = new MyClass(301); return *tmp; }
        operator const MyClass*() const { MyClass *tmp = new MyClass(302); return tmp; }
        operator natj_jobject_t() { return 0; }
    };
} } } }

#endif /* Binding_Operators_hpp */

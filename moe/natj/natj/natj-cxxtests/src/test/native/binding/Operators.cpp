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

#include "Operators.hpp"

namespace natj { namespace cxx { namespace tests { namespace binding {
    enum Int::OperatorID Int::lastInvocation = Int::ILLEGAL;
    enum IntExtOp::OperatorID IntExtOp::lastInvocation = IntExtOp::ILLEGAL;

    IntExtOp& operator++(IntExtOp& lhs) { ++lhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_PRE_INCREMENT; return lhs; }
    IntExtOp& operator--(IntExtOp& lhs) { --lhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_PRE_DECREMENT; return lhs; }
    IntExtOp operator++(IntExtOp& lhs, int) { IntExtOp ret(lhs.mValue); ++lhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_POST_INCREMENT; return ret; }
    IntExtOp operator--(IntExtOp& lhs, int) { IntExtOp ret(lhs.mValue); --lhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_POST_DECREMENT; return ret; }

    IntExtOp operator+(const IntExtOp& lhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_UNARY_PLUS; return IntExtOp(lhs.mValue); }
    IntExtOp operator-(const IntExtOp& lhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_UNARY_MINUS; return IntExtOp(-lhs.mValue); }

    bool operator!(const IntExtOp& lhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_NEGATE; return !lhs.mValue; }
    IntExtOp operator~(const IntExtOp& lhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_COMPLEMENT; return IntExtOp(~lhs.mValue); }

    IntExtOp operator+(const IntExtOp& lhs, int rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_ADD; return IntExtOp(lhs.mValue + rhs); }
    IntExtOp operator-(const IntExtOp& lhs, int rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_SUBTRACT; return IntExtOp(lhs.mValue - rhs); }
    IntExtOp operator*(const IntExtOp& lhs, int rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_MULTIPLY; return IntExtOp(lhs.mValue * rhs); }
    IntExtOp operator/(const IntExtOp& lhs, int rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_DIVIDE; return IntExtOp(lhs.mValue / rhs); }
    IntExtOp operator%(const IntExtOp& lhs, int rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_MODULUS; return IntExtOp(lhs.mValue % rhs); }

    bool operator==(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_EQUAL; return lhs.mValue == rhs.mValue; }
    bool operator!=(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_INEQUAL; return lhs.mValue != rhs.mValue; }
    bool operator<(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LESS; return lhs.mValue < rhs.mValue; }
    bool operator<=(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LESS_EQUAL; return lhs.mValue <= rhs.mValue; }
    bool operator>(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_GREATER; return lhs.mValue > rhs.mValue; }
    bool operator>=(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_GREATER_EQUAL; return lhs.mValue >= rhs.mValue; }

    bool operator&&(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LOGICAL_AND; return lhs.mValue && rhs.mValue; }
    bool operator||(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LOGICAL_OR; return lhs.mValue || rhs.mValue; }

    IntExtOp operator&(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_AND; return lhs.mValue & rhs.mValue; }
    IntExtOp operator|(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_OR; return lhs.mValue | rhs.mValue; }
    IntExtOp operator^(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_XOR; return lhs.mValue ^ rhs.mValue; }
    IntExtOp operator<<(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LEFT_SHIFT; return lhs.mValue << rhs.mValue; }
    IntExtOp operator>>(const IntExtOp& lhs, const IntExtOp& rhs) { IntExtOp::lastInvocation = IntExtOp::INTEXTOP_RIGHT_SHIFT; return lhs.mValue >> rhs.mValue; }

    IntExtOp& operator+=(IntExtOp& lhs, int rhs) { lhs.mValue += rhs; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_ADD_ASSIGN; return lhs; }
    IntExtOp& operator-=(IntExtOp& lhs, int rhs) { lhs.mValue -= rhs; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_SUBTRACT_ASSIGN; return lhs; }
    IntExtOp& operator*=(IntExtOp& lhs, int rhs) { lhs.mValue *= rhs; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_MULTIPLY_ASSIGN; return lhs; }
    IntExtOp& operator/=(IntExtOp& lhs, int rhs) { lhs.mValue /= rhs; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_DIVIDE_ASSIGN; return lhs; }
    IntExtOp& operator%=(IntExtOp& lhs, int rhs) { lhs.mValue %= rhs; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_MODULUS_ASSIGN; return lhs; }

    IntExtOp& operator&=(IntExtOp& lhs, const IntExtOp& rhs) { lhs.mValue &= rhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_AND_ASSIGN; return lhs; }
    IntExtOp& operator|=(IntExtOp& lhs, const IntExtOp& rhs) { lhs.mValue |= rhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_OR_ASSIGN; return lhs; }
    IntExtOp& operator^=(IntExtOp& lhs, const IntExtOp& rhs) { lhs.mValue ^= rhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_BITWISE_XOR_ASSIGN; return lhs; }
    IntExtOp& operator<<=(IntExtOp& lhs, const IntExtOp& rhs) { lhs.mValue <<= rhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_LEFT_SHIFT_ASSIGN; return lhs; }
    IntExtOp& operator>>=(IntExtOp& lhs, const IntExtOp& rhs) { lhs.mValue >>= rhs.mValue; IntExtOp::lastInvocation = IntExtOp::INTEXTOP_RIGHT_SHIFT_ASSIGN; return lhs; }
} } } }

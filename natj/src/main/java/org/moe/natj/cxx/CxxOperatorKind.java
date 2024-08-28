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

package org.moe.natj.cxx;

public enum CxxOperatorKind {
    /**
     * C++ equivalent: operator++(int)
     */
    POST_INCREMENT,
    /**
     * C++ equivalent: operator--(int)
     */
    POST_DECREMENT,
    /**
     * C++ equivalent: operator++()
     */
    PRE_INCREMENT,
    /**
     * C++ equivalent: operator--()
     */
    PRE_DECREMENT,
    /**
     * C++ equivalent: operator+()
     */
    UNARY_PLUS,
    /**
     * C++ equivalent: operator-()
     */
    UNARY_MINUS,
    /**
     * C++ equivalent: operator!()
     */
    NEGATE,
    /**
     * C++ equivalent: operator~()
     */
    COMPLEMENT,
    /**
     * C++ equivalent: operator*()
     */
    INDIRECT,
    /**
     * C++ equivalent: operator&()
     */
    ADDRESS_OF,
    /**
     * C++ equivalent: operator+(T rhs)
     */
    ADD,
    /**
     * C++ equivalent: operator-(T rhs)
     */
    SUBTRACT,
    /**
     * C++ equivalent: operator*(T rhs)
     */
    MULTIPLY,
    /**
     * C++ equivalent: operator/(T rhs)
     */
    DIVIDE,
    /**
     * C++ equivalent: operator%(T rhs)
     */
    MODULUS,
    /**
     * C++ equivalent: operator==(T rhs)
     */
    EQUAL,
    /**
     * C++ equivalent: operator!=(T rhs)
     */
    INEQUAL,
    /**
     * C++ equivalent: operator>(T rhs)
     */
    GREATER,
    /**
     * C++ equivalent: operator<(T rhs)
     */
    LESS,
    /**
     * C++ equivalent: operator>=(T rhs)
     */
    GREATER_EQUAL,
    /**
     * C++ equivalent: operator<=(T rhs)
     */
    LESS_EQUAL,
    /**
     * C++ equivalent: operator&&(T rhs)
     */
    LOGICAL_AND,
    /**
     * C++ equivalent: operator||(T rhs)
     */
    LOGICAL_OR,
    /**
     * C++ equivalent: operator&(T rhs)
     */
    BITWISE_AND,
    /**
     * C++ equivalent: operator|(T rhs)
     */
    BITWISE_OR,
    /**
     * C++ equivalent: operator^(T rhs)
     */
    BITWISE_XOR,
    /**
     * C++ equivalent: operator<<(T rhs)
     */
    LEFT_SHIFT,
    /**
     * C++ equivalent: operator>>(T rhs)
     */
    RIGHT_SHIFT,
    /**
     * C++ equivalent: operator+=(T rhs)
     */
    ADD_ASSIGN,
    /**
     * C++ equivalent: operator-=(T rhs)
     */
    SUBTRACT_ASSIGN,
    /**
     * C++ equivalent: operator*=(T rhs)
     */
    MULTIPLY_ASSIGN,
    /**
     * C++ equivalent: operator/=(T rhs)
     */
    DIVIDE_ASSIGN,
    /**
     * C++ equivalent: operator%=(T rhs)
     */
    MODULUS_ASSIGN,
    /**
     * C++ equivalent: operator>>=(T rhs)
     */
    RIGHT_SHIFT_ASSIGN,
    /**
     * C++ equivalent: operator<<=(T rhs)
     */
    LEFT_SHIFT_ASSIGN,
    /**
     * C++ equivalent: operator&=(T rhs)
     */
    BITWISE_AND_ASSIGN,
    /**
     * C++ equivalent: operator^=(T rhs)
     */
    BITWISE_XOR_ASSIGN,
    /**
     * C++ equivalent: operator|=(T rhs)
     */
    BITWISE_OR_ASSIGN,
    /**
     * C++ equivalent: operator=(T rhs)
     */
    ASSIGN,
    /**
     * C++ equivalent: operator[](T rhs)
     */
    SUBSCRIPT,
    /**
     * C++ equivalent: operator()(...)
     */
    FUNCTION_CALL,
    /**
     * C++ equivalent: operator->(T rhs)
     */
    ARROW,
    /**
     * Subscript operator extension. Allows for the following code to have a cleaner binding:
     * C++ code: vector[idx] = value;
     * Java method: T set(I idx, T value);
     */
    EXT_SUBSCRIPT_ASSIGN,
    //
    ;
}

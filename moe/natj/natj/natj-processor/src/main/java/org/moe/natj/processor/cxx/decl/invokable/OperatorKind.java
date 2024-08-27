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

package org.moe.natj.processor.cxx.decl.invokable;

/**
 * C++ operator kinds.
 */
public enum OperatorKind {
    /**
     * C++ equivalent: operator++(int)
     */
    POST_INCREMENT("++", 1),

    /**
     * C++ equivalent: operator--(int)
     */
    POST_DECREMENT("--", 1),

    /**
     * C++ equivalent: operator++()
     */
    PRE_INCREMENT("++", 1),

    /**
     * C++ equivalent: operator--()
     */
    PRE_DECREMENT("--", 1),

    /**
     * C++ equivalent: operator+()
     */
    UNARY_PLUS("+", 1),

    /**
     * C++ equivalent: operator-()
     */
    UNARY_MINUS("-", 1),

    /**
     * C++ equivalent: operator!()
     */
    NEGATE("!", 1),

    /**
     * C++ equivalent: operator~()
     */
    COMPLEMENT("~", 1),

    /**
     * C++ equivalent: operator*()
     */
    INDIRECT("*", 1),

    /**
     * C++ equivalent: operator&()
     */
    ADDRESS_OF("&", 1),

    /**
     * C++ equivalent: operator+(T rhs)
     */
    ADD("+"),

    /**
     * C++ equivalent: operator-(T rhs)
     */
    SUBTRACT("-"),

    /**
     * C++ equivalent: operator*(T rhs)
     */
    MULTIPLY("*"),

    /**
     * C++ equivalent: operator/(T rhs)
     */
    DIVIDE("/"),

    /**
     * C++ equivalent: operator%(T rhs)
     */
    MODULUS("%"),

    /**
     * C++ equivalent: operator==(T rhs)
     */
    EQUAL("=="),

    /**
     * C++ equivalent: operator!=(T rhs)
     */
    INEQUAL("!="),

    /**
     * C++ equivalent: operator>(T rhs)
     */
    GREATER(">"),

    /**
     * C++ equivalent: operator<(T rhs)
     */
    LESS("<"),

    /**
     * C++ equivalent: operator>=(T rhs)
     */
    GREATER_EQUAL(">="),

    /**
     * C++ equivalent: operator<=(T rhs)
     */
    LESS_EQUAL("<="),

    /**
     * C++ equivalent: operator&&(T rhs)
     */
    LOGICAL_AND("&&"),

    /**
     * C++ equivalent: operator||(T rhs)
     */
    LOGICAL_OR("||"),

    /**
     * C++ equivalent: operator&(T rhs)
     */
    BITWISE_AND("&"),

    /**
     * C++ equivalent: operator|(T rhs)
     */
    BITWISE_OR("|"),

    /**
     * C++ equivalent: operator^(T rhs)
     */
    BITWISE_XOR("^"),

    /**
     * C++ equivalent: operator<<(T rhs)
     */
    LEFT_SHIFT("<<"),

    /**
     * C++ equivalent: operator>>(T rhs)
     */
    RIGHT_SHIFT(">>"),

    /**
     * C++ equivalent: operator+=(T rhs)
     */
    ADD_ASSIGN("+="),

    /**
     * C++ equivalent: operator-=(T rhs)
     */
    SUBTRACT_ASSIGN("-="),

    /**
     * C++ equivalent: operator*=(T rhs)
     */
    MULTIPLY_ASSIGN("*="),

    /**
     * C++ equivalent: operator/=(T rhs)
     */
    DIVIDE_ASSIGN("/="),

    /**
     * C++ equivalent: operator%=(T rhs)
     */
    MODULUS_ASSIGN("%="),

    /**
     * C++ equivalent: operator>>=(T rhs)
     */
    RIGHT_SHIFT_ASSIGN(">>="),

    /**
     * C++ equivalent: operator<<=(T rhs)
     */
    LEFT_SHIFT_ASSIGN("<<="),

    /**
     * C++ equivalent: operator&=(T rhs)
     */
    BITWISE_AND_ASSIGN("&="),

    /**
     * C++ equivalent: operator^=(T rhs)
     */
    BITWISE_XOR_ASSIGN("^="),

    /**
     * C++ equivalent: operator|=(T rhs)
     */
    BITWISE_OR_ASSIGN("|="),

    /**
     * C++ equivalent: operator=(T rhs)
     */
    ASSIGN("="),

    /**
     * C++ equivalent: operator[](T rhs)
     */
    SUBSCRIPT("[]"),

    /**
     * C++ equivalent: operator()(...)
     */
    FUNCTION_CALL("()", -1),

    /**
     * C++ equivalent: operator->(T rhs)
     */
    ARROW("->", 1),

    /*
    Extensions
     */

    /**
     * Subscript operator extension. Allows for the following code to have a cleaner binding:
     * C++ code: vector[idx] = value;
     * Java method: T set(I idx, T value);
     */
    EXT_SUBSCRIPT_ASSIGN("[]", 3),
    //
    ;

    /**
     * Operator name.
     */
    private final String name;

    /**
     * Number of operands (including the object invoked on).
     */
    private final int numOperands;

    /**
     * Create a new OperatorKind with two operands.
     *
     * @param name Operator name
     */
    OperatorKind(String name) {
        this(name, 2);
    }

    /**
     * Create a new OperatorKind.
     *
     * @param name        Operator name
     * @param numOperands Number of operands
     */
    OperatorKind(String name, int numOperands) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.numOperands = numOperands;
    }

    /**
     * Returns the operator's name.
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the operator's number of operands.
     *
     * @return Number of operands
     */
    public int numOperands() {
        return numOperands;
    }

    /**
     * Tells whether or not this operator is an assignable extension.
     *
     * @return True iff this operator is an assignable extension
     */
    public boolean isExtAssignable() {
        return this == EXT_SUBSCRIPT_ASSIGN;
    }
}

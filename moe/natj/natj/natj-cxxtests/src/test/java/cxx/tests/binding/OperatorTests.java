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

package cxx.tests.binding;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import cxx.tests.NatJTest;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class OperatorTests extends NatJTest {

    private enum OperatorID {
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
    }

    @CxxGlobalGetter("natj::cxx::tests::binding::Int::lastInvocation")
    private static native int lastInvocation();

    @AfterClass
    public static void afterClass() {
        for (Int val : objectPool) {
            CxxRuntime.delete(val);
        }
        objectPool.clear();
    }

    @CxxConstructor()
    private static native Int newInt();

    private static final HashSet<Int> objectPool = new HashSet<Int>();

    private Int c() {
        return c(0);
    }

    private Int c(int val) {
        Int newInt = newInt();
        newInt.set(val);
        objectPool.add(newInt);
        return newInt;
    }

    private Int c(Int v) {
        objectPool.add(v);
        return v;
    }

    private static void assertLastInvocation(OperatorID inv) {
        assertNotNull(inv);
        assertEquals(inv.ordinal(), lastInvocation());
    }

    @Test
    public void testOperators() {
        Int val = c();
        assertEquals(0, val.get());

        assertEquals("preInc", 1, val.preInc().get());
        assertLastInvocation(OperatorID.PRE_INCREMENT);

        assertEquals("preDec", 0, val.preDec().get());
        assertLastInvocation(OperatorID.PRE_DECREMENT);

        assertEquals("postInc", 0, c(val.postInc()).get());
        assertLastInvocation(OperatorID.POST_INCREMENT);

        assertEquals("postDec", 1, c(val.postDec()).get());
        assertLastInvocation(OperatorID.POST_DECREMENT);

        assertEquals(0, val.get());

        val.set(10);
        assertEquals("unaryPlus", 10, c(val.unaryPlus()).get());
        assertLastInvocation(OperatorID.UNARY_PLUS);

        assertEquals("unaryMinus", -10, c(val.unaryMinus()).get());
        assertLastInvocation(OperatorID.UNARY_MINUS);

        assertFalse("negate", val.negate());
        assertLastInvocation(OperatorID.NEGATE);

        assertEquals("complement", -11, c(val.complement()).get());
        assertLastInvocation(OperatorID.COMPLEMENT);

        assertEquals("add", 15, c(val.add(5)).get());
        assertLastInvocation(OperatorID.ADD);

        assertEquals("sub", 5, c(val.sub(5)).get());
        assertLastInvocation(OperatorID.SUBTRACT);

        assertEquals("mul", 50, c(val.mul(5)).get());
        assertLastInvocation(OperatorID.MULTIPLY);

        assertEquals("div", 2, c(val.div(5)).get());
        assertLastInvocation(OperatorID.DIVIDE);

        assertEquals("mod", 2, c(val.mod(8)).get());
        assertLastInvocation(OperatorID.MODULUS);

        assertTrue("eq", val.eq(c(10)));
        assertLastInvocation(OperatorID.EQUAL);

        assertFalse("neq", val.neq(c(10)));
        assertLastInvocation(OperatorID.INEQUAL);

        assertFalse("lt", val.lt(c(10)));
        assertLastInvocation(OperatorID.LESS);

        assertTrue("le", val.le(c(10)));
        assertLastInvocation(OperatorID.LESS_EQUAL);

        assertFalse("gt", val.gt(c(10)));
        assertLastInvocation(OperatorID.GREATER);

        assertTrue("ge", val.ge(c(10)));
        assertLastInvocation(OperatorID.GREATER_EQUAL);

        assertFalse("land", val.land(c(0)));
        assertLastInvocation(OperatorID.LOGICAL_AND);

        assertTrue("lor", val.lor(c(0)));
        assertLastInvocation(OperatorID.LOGICAL_OR);

        assertEquals("band", 8, c(val.band(c(8))).get());
        assertLastInvocation(OperatorID.BITWISE_AND);

        assertEquals("bor", 11, c(val.bor(c(1))).get());
        assertLastInvocation(OperatorID.BITWISE_OR);

        assertEquals("bxor", 8, c(val.bxor(c(2))).get());
        assertLastInvocation(OperatorID.BITWISE_XOR);

        assertEquals("lsh", 20, c(val.lsh(c(1))).get());
        assertLastInvocation(OperatorID.LEFT_SHIFT);

        assertEquals("rsh", 5, c(val.rsh(c(1))).get());
        assertLastInvocation(OperatorID.RIGHT_SHIFT);

        assertEquals("add_assign", 15, c(val.add_assign(5)).get());
        assertLastInvocation(OperatorID.ADD_ASSIGN);

        assertEquals("sub_assign", 10, c(val.sub_assign(5)).get());
        assertLastInvocation(OperatorID.SUBTRACT_ASSIGN);

        assertEquals("mul_assign", 50, c(val.mul_assign(5)).get());
        assertLastInvocation(OperatorID.MULTIPLY_ASSIGN);

        assertEquals("div_assign", 10, c(val.div_assign(5)).get());
        assertLastInvocation(OperatorID.DIVIDE_ASSIGN);

        assertEquals("mod_assign", 2, c(val.mod_assign(8)).get());
        assertLastInvocation(OperatorID.MODULUS_ASSIGN);

        val.set(10);
        assertEquals("band_assign", 8, c(val.band_assign(c(8))).get());
        assertLastInvocation(OperatorID.BITWISE_AND_ASSIGN);

        val.set(10);
        assertEquals("bor_assign", 11, c(val.bor_assign(c(1))).get());
        assertLastInvocation(OperatorID.BITWISE_OR_ASSIGN);

        val.set(10);
        assertEquals("bxor_assign", 8, c(val.bxor_assign(c(2))).get());
        assertLastInvocation(OperatorID.BITWISE_XOR_ASSIGN);

        val.set(10);
        assertEquals("lsh_assign", 20, c(val.lsh_assign(c(1))).get());
        assertLastInvocation(OperatorID.LEFT_SHIFT_ASSIGN);

        val.set(10);
        assertEquals("rsh_assign", 5, c(val.rsh_assign(c(1))).get());
        assertLastInvocation(OperatorID.RIGHT_SHIFT_ASSIGN);

        val.set(10);
        assertEquals("arrow", 10, c(val.arrow()).get());
        assertLastInvocation(OperatorID.ARROW);

        val.set(10);
        assertEquals("call", 20, c(val.call(1, 3, 6)).get());
        assertLastInvocation(OperatorID.FUNCTION_CALL);
    }

    @CxxHeader("binding/Operators.hpp")
    @CxxClass("natj::cxx::tests::binding::Int")
    private interface Int extends CxxObject {
        @CxxMethod()
        int get();

        @CxxMethod()
        void set(int value);

        @CxxOperator(CxxOperatorKind.PRE_INCREMENT)
        @CxxByReference
        Int preInc();

        @CxxOperator(CxxOperatorKind.PRE_DECREMENT)
        @CxxByReference
        Int preDec();

        @CxxOperator(CxxOperatorKind.POST_INCREMENT)
        @CxxByValue
        Int postInc();

        @CxxOperator(CxxOperatorKind.POST_DECREMENT)
        @CxxByValue
        Int postDec();

        @CxxOperator(value = CxxOperatorKind.UNARY_PLUS, isConst = true)
        @CxxByValue
        Int unaryPlus();

        @CxxOperator(value = CxxOperatorKind.UNARY_MINUS, isConst = true)
        @CxxByValue
        Int unaryMinus();

        @CxxOperator(value = CxxOperatorKind.NEGATE, isConst = true)
        boolean negate();

        @CxxOperator(value = CxxOperatorKind.COMPLEMENT, isConst = true)
        @CxxByValue
        Int complement();

        @CxxOperator(value = CxxOperatorKind.ADD, isConst = true)
        @CxxByValue
        Int add(int value);

        @CxxOperator(value = CxxOperatorKind.SUBTRACT, isConst = true)
        @CxxByValue
        Int sub(int value);

        @CxxOperator(value = CxxOperatorKind.MULTIPLY, isConst = true)
        @CxxByValue
        Int mul(int value);

        @CxxOperator(value = CxxOperatorKind.DIVIDE, isConst = true)
        @CxxByValue
        Int div(int value);

        @CxxOperator(value = CxxOperatorKind.MODULUS, isConst = true)
        @CxxByValue
        Int mod(int value);

        @CxxOperator(value = CxxOperatorKind.EQUAL, isConst = true)
        boolean eq(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.INEQUAL, isConst = true)
        boolean neq(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.LESS, isConst = true)
        boolean lt(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.LESS_EQUAL, isConst = true)
        boolean le(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.GREATER, isConst = true)
        boolean gt(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.GREATER_EQUAL, isConst = true)
        boolean ge(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.LOGICAL_AND, isConst = true)
        boolean land(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.LOGICAL_OR, isConst = true)
        boolean lor(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_AND, isConst = true)
        @CxxByValue
        Int band(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_OR, isConst = true)
        @CxxByValue
        Int bor(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_XOR, isConst = true)
        @CxxByValue
        Int bxor(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.LEFT_SHIFT, isConst = true)
        @CxxByValue
        Int lsh(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.RIGHT_SHIFT, isConst = true)
        @CxxByValue
        Int rsh(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        int get(int offs);

        @CxxOperator(CxxOperatorKind.ADD_ASSIGN)
        @CxxByReference
        Int add_assign(int value);

        @CxxOperator(CxxOperatorKind.SUBTRACT_ASSIGN)
        @CxxByReference
        Int sub_assign(int value);

        @CxxOperator(CxxOperatorKind.MULTIPLY_ASSIGN)
        @CxxByReference
        Int mul_assign(int value);

        @CxxOperator(CxxOperatorKind.DIVIDE_ASSIGN)
        @CxxByReference
        Int div_assign(int value);

        @CxxOperator(CxxOperatorKind.MODULUS_ASSIGN)
        @CxxByReference
        Int mod_assign(int value);

        @CxxOperator(CxxOperatorKind.BITWISE_AND_ASSIGN)
        @CxxByReference
        Int band_assign(@CxxConst @CxxByReference Int value);

        @CxxOperator(CxxOperatorKind.BITWISE_OR_ASSIGN)
        @CxxByReference
        Int bor_assign(@CxxConst @CxxByReference Int value);

        @CxxOperator(CxxOperatorKind.BITWISE_XOR_ASSIGN)
        @CxxByReference
        Int bxor_assign(@CxxConst @CxxByReference Int value);

        @CxxOperator(CxxOperatorKind.LEFT_SHIFT_ASSIGN)
        @CxxByReference
        Int lsh_assign(@CxxConst @CxxByReference Int value);

        @CxxOperator(CxxOperatorKind.RIGHT_SHIFT_ASSIGN)
        @CxxByReference
        Int rsh_assign(@CxxConst @CxxByReference Int value);

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, isConst = true)
        int call(int value, int value2, int value3);

        @CxxOperator(value = CxxOperatorKind.ARROW, isConst = true)
        int arrow();
    }
}

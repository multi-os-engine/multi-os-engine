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

import org.moe.natj.cxx.CxxExpectedGeneratedCodeException;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import cxx.tests.NatJTest;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class OperatorFunctionTests extends NatJTest {

    private enum OperatorID {
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
    }

    @AfterClass
    public static void afterClass() {
        for (IntExtOp val : objectPool) {
            CxxRuntime.delete(val);
        }
        objectPool.clear();
    }

    @CxxConstructor()
    private static native IntExtOp newIntExtOp();

    private static final HashSet<IntExtOp> objectPool = new HashSet<IntExtOp>();

    private IntExtOp c() {
        return c(0);
    }

    private IntExtOp c(int val) {
        IntExtOp newIntExtOp = newIntExtOp();
        newIntExtOp.set(val);
        objectPool.add(newIntExtOp);
        return newIntExtOp;
    }

    private IntExtOp c(IntExtOp v) {
        objectPool.add(v);
        return v;
    }

    private static void assertLastInvocation(OperatorID inv) {
        assertNotNull(inv);
        assertEquals(inv.ordinal(), lastInvocation());
    }

    @Test
    public void testOperators() {
        IntExtOp val = c();
        assertEquals(0, val.get());

        assertEquals("preInc", 1, preInc(val).get());
        assertLastInvocation(OperatorID.INTEXTOP_PRE_INCREMENT);

        assertEquals("preDec", 0, preDec(val).get());
        assertLastInvocation(OperatorID.INTEXTOP_PRE_DECREMENT);

        assertEquals("postInc", 0, c(postInc(val)).get());
        assertLastInvocation(OperatorID.INTEXTOP_POST_INCREMENT);

        assertEquals("postDec", 1, c(postDec(val)).get());
        assertLastInvocation(OperatorID.INTEXTOP_POST_DECREMENT);

        assertEquals(0, val.get());

        val.set(10);
        assertEquals("unaryPlus", 10, c(unaryPlus(val)).get());
        assertLastInvocation(OperatorID.INTEXTOP_UNARY_PLUS);

        assertEquals("unaryMinus", -10, c(unaryMinus(val)).get());
        assertLastInvocation(OperatorID.INTEXTOP_UNARY_MINUS);

        assertFalse("negate", negate(val));
        assertLastInvocation(OperatorID.INTEXTOP_NEGATE);

        assertEquals("complement", -11, c(complement(val)).get());
        assertLastInvocation(OperatorID.INTEXTOP_COMPLEMENT);

        assertEquals("add", 15, c(add(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_ADD);

        assertEquals("sub", 5, c(sub(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_SUBTRACT);

        assertEquals("mul", 50, c(mul(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_MULTIPLY);

        assertEquals("div", 2, c(div(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_DIVIDE);

        assertEquals("mod", 2, c(mod(val, 8)).get());
        assertLastInvocation(OperatorID.INTEXTOP_MODULUS);

        assertTrue("eq", eq(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_EQUAL);

        assertFalse("neq", neq(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_INEQUAL);

        assertFalse("lt", lt(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_LESS);

        assertTrue("le", le(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_LESS_EQUAL);

        assertFalse("gt", gt(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_GREATER);

        assertTrue("ge", ge(val, c(10)));
        assertLastInvocation(OperatorID.INTEXTOP_GREATER_EQUAL);

        assertFalse("land", land(val, c(0)));
        assertLastInvocation(OperatorID.INTEXTOP_LOGICAL_AND);

        assertTrue("lor", lor(val, c(0)));
        assertLastInvocation(OperatorID.INTEXTOP_LOGICAL_OR);

        assertEquals("band", 8, c(band(val, c(8))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_AND);

        assertEquals("bor", 11, c(bor(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_OR);

        assertEquals("bxor", 8, c(bxor(val, c(2))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_XOR);

        assertEquals("lsh", 20, c(lsh(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_LEFT_SHIFT);

        assertEquals("rsh", 5, c(rsh(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_RIGHT_SHIFT);

        assertEquals("add_assign", 15, c(add_assign(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_ADD_ASSIGN);

        assertEquals("sub_assign", 10, c(sub_assign(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_SUBTRACT_ASSIGN);

        assertEquals("mul_assign", 50, c(mul_assign(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_MULTIPLY_ASSIGN);

        assertEquals("div_assign", 10, c(div_assign(val, 5)).get());
        assertLastInvocation(OperatorID.INTEXTOP_DIVIDE_ASSIGN);

        assertEquals("mod_assign", 2, c(mod_assign(val, 8)).get());
        assertLastInvocation(OperatorID.INTEXTOP_MODULUS_ASSIGN);

        val.set(10);
        assertEquals("band_assign", 8, c(band_assign(val, c(8))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_AND_ASSIGN);

        val.set(10);
        assertEquals("bor_assign", 11, c(bor_assign(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_OR_ASSIGN);

        val.set(10);
        assertEquals("bxor_assign", 8, c(bxor_assign(val, c(2))).get());
        assertLastInvocation(OperatorID.INTEXTOP_BITWISE_XOR_ASSIGN);

        val.set(10);
        assertEquals("lsh_assign", 20, c(lsh_assign(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_LEFT_SHIFT_ASSIGN);

        val.set(10);
        assertEquals("rsh_assign", 5, c(rsh_assign(val, c(1))).get());
        assertLastInvocation(OperatorID.INTEXTOP_RIGHT_SHIFT_ASSIGN);
    }

    @CxxGlobalGetter("natj::cxx::tests::binding::IntExtOp::lastInvocation")
    private static native int lastInvocation();

    @CxxHeader("binding/Operators.hpp")
    @CxxClass("natj::cxx::tests::binding::IntExtOp")
    private interface IntExtOp extends CxxObject {
        @CxxMethod()
        int get();

        @CxxMethod()
        void set(int value);
    }

    @CxxOperatorFunction(CxxOperatorKind.PRE_INCREMENT)
    @CxxByReference
    static IntExtOp preInc(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.PRE_DECREMENT)
    @CxxByReference
    static IntExtOp preDec(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.POST_INCREMENT)
    @CxxByValue
    static IntExtOp postInc(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.POST_DECREMENT)
    @CxxByValue
    static IntExtOp postDec(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.UNARY_PLUS)
    @CxxByValue
    static IntExtOp unaryPlus(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.UNARY_MINUS)
    @CxxByValue
    static IntExtOp unaryMinus(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.NEGATE)
    static boolean negate(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.COMPLEMENT)
    @CxxByValue
    static IntExtOp complement(@CxxByReference IntExtOp lhs) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD)
    @CxxByValue
    static IntExtOp add(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT)
    @CxxByValue
    static IntExtOp sub(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY)
    @CxxByValue
    static IntExtOp mul(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.DIVIDE)
    @CxxByValue
    static IntExtOp div(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MODULUS)
    @CxxByValue
    static IntExtOp mod(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.EQUAL)
    static boolean eq(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.INEQUAL)
    static boolean neq(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LESS)
    static boolean lt(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LESS_EQUAL)
    static boolean le(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.GREATER)
    static boolean gt(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.GREATER_EQUAL)
    static boolean ge(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LOGICAL_AND)
    static boolean land(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LOGICAL_OR)
    static boolean lor(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_AND)
    @CxxByValue
    static IntExtOp band(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_OR)
    @CxxByValue
    static IntExtOp bor(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_XOR)
    @CxxByValue
    static IntExtOp bxor(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LEFT_SHIFT)
    @CxxByValue
    static IntExtOp lsh(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.RIGHT_SHIFT)
    @CxxByValue
    static IntExtOp rsh(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.ADD_ASSIGN)
    @CxxByReference
    static IntExtOp add_assign(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.SUBTRACT_ASSIGN)
    @CxxByReference
    static IntExtOp sub_assign(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MULTIPLY_ASSIGN)
    @CxxByReference
    static IntExtOp mul_assign(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.DIVIDE_ASSIGN)
    @CxxByReference
    static IntExtOp div_assign(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.MODULUS_ASSIGN)
    @CxxByReference
    static IntExtOp mod_assign(@CxxByReference IntExtOp lhs, int value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_AND_ASSIGN)
    @CxxByReference
    static IntExtOp band_assign(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_OR_ASSIGN)
    @CxxByReference
    static IntExtOp bor_assign(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.BITWISE_XOR_ASSIGN)
    @CxxByReference
    static IntExtOp bxor_assign(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.LEFT_SHIFT_ASSIGN)
    @CxxByReference
    static IntExtOp lsh_assign(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxOperatorFunction(CxxOperatorKind.RIGHT_SHIFT_ASSIGN)
    @CxxByReference
    static IntExtOp rsh_assign(@CxxByReference IntExtOp lhs, @CxxByReference IntExtOp value) {
        throw new CxxExpectedGeneratedCodeException();
    }
}

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

package cxx.tests.inheritance;

import org.moe.natj.cxx.*;
import org.moe.natj.cxx.ann.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperatorTests {
    @CxxHeader("inheritance/Operators.hpp")
    @CxxClass("natj::cxx::tests::inheritance::Operators")
    private interface Operators extends CxxObject {
        @CxxOperator(value = CxxOperatorKind.PRE_INCREMENT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int preInc();

        @CxxOperator(value = CxxOperatorKind.PRE_DECREMENT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int preDec();

        @CxxOperator(value = CxxOperatorKind.POST_INCREMENT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int postInc();

        @CxxOperator(value = CxxOperatorKind.POST_DECREMENT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int postDec();

        @CxxOperator(value = CxxOperatorKind.UNARY_PLUS, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int unaryPlus();

        @CxxOperator(value = CxxOperatorKind.UNARY_MINUS, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int unaryMinus();

        @CxxOperator(value = CxxOperatorKind.NEGATE, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean negate();

        @CxxOperator(value = CxxOperatorKind.COMPLEMENT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int complement();

        @CxxOperator(value = CxxOperatorKind.ADD, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int add(int value);

        @CxxOperator(value = CxxOperatorKind.SUBTRACT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int sub(int value);

        @CxxOperator(value = CxxOperatorKind.MULTIPLY, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int mul(int value);

        @CxxOperator(value = CxxOperatorKind.DIVIDE, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int div(int value);

        @CxxOperator(value = CxxOperatorKind.MODULUS, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int mod(int value);

        @CxxOperator(value = CxxOperatorKind.EQUAL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean eq(int value);

        @CxxOperator(value = CxxOperatorKind.INEQUAL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean neq(int value);

        @CxxOperator(value = CxxOperatorKind.LESS, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean lt(int value);

        @CxxOperator(value = CxxOperatorKind.LESS_EQUAL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean le(int value);

        @CxxOperator(value = CxxOperatorKind.GREATER, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean gt(int value);

        @CxxOperator(value = CxxOperatorKind.GREATER_EQUAL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean ge(int value);

        @CxxOperator(value = CxxOperatorKind.LOGICAL_AND, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean land(int value);

        @CxxOperator(value = CxxOperatorKind.LOGICAL_OR, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        boolean lor(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_AND, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int band(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_OR, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int bor(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_XOR, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int bxor(int value);

        @CxxOperator(value = CxxOperatorKind.LEFT_SHIFT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int lsh(int value);

        @CxxOperator(value = CxxOperatorKind.RIGHT_SHIFT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int rsh(int value);

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int get(int offs);

        @CxxOperator(value = CxxOperatorKind.ADD_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int add_assign(int value);

        @CxxOperator(value = CxxOperatorKind.SUBTRACT_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int sub_assign(int value);

        @CxxOperator(value = CxxOperatorKind.MULTIPLY_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int mul_assign(int value);

        @CxxOperator(value = CxxOperatorKind.DIVIDE_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int div_assign(int value);

        @CxxOperator(value = CxxOperatorKind.MODULUS_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int mod_assign(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_AND_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int band_assign(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_OR_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int bor_assign(int value);

        @CxxOperator(value = CxxOperatorKind.BITWISE_XOR_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int bxor_assign(int value);

        @CxxOperator(value = CxxOperatorKind.LEFT_SHIFT_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int lsh_assign(int value);

        @CxxOperator(value = CxxOperatorKind.RIGHT_SHIFT_ASSIGN, virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int rsh_assign(int value);

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int call0();

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int call1(int value);

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int call2(int value, int value2);

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int call3(int value, int value2, int value3);

        @CxxOperator(value = CxxOperatorKind.ARROW, virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        int arrow();
    }

    @CxxFunction("natj::cxx::tests::inheritance::invoke_preInc")
    private static native int preInc(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_preDec")
    private static native int preDec(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_postInc")
    private static native int postInc(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_postDec")
    private static native int postDec(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_unaryPlus")
    private static native int unaryPlus(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_unaryMinus")
    private static native int unaryMinus(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_negate")
    private static native boolean negate(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_complement")
    private static native int complement(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_add")
    private static native int add(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_sub")
    private static native int sub(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_mul")
    private static native int mul(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_div")
    private static native int div(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_mod")
    private static native int mod(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_eq")
    private static native boolean eq(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_neq")
    private static native boolean neq(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_lt")
    private static native boolean lt(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_le")
    private static native boolean le(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_gt")
    private static native boolean gt(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_ge")
    private static native boolean ge(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_land")
    private static native boolean land(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_lor")
    private static native boolean lor(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_band")
    private static native int band(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_bor")
    private static native int bor(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_bxor")
    private static native int bxor(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_lsh")
    private static native int lsh(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_rsh")
    private static native int rsh(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_get")
    private static native int get(Operators op, int offs);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_add_assign")
    private static native int add_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_sub_assign")
    private static native int sub_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_mul_assign")
    private static native int mul_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_div_assign")
    private static native int div_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_mod_assign")
    private static native int mod_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_band_assign")
    private static native int band_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_bor_assign")
    private static native int bor_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_bxor_assign")
    private static native int bxor_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_lsh_assign")
    private static native int lsh_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_rsh_assign")
    private static native int rsh_assign(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_call0")
    private static native int call0(Operators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_call1")
    private static native int call1(Operators op, int value);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_call2")
    private static native int call2(Operators op, int value, int value2);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_call3")
    private static native int call3(Operators op, int value, int value2, int value3);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_arrow")
    private static native int arrow(Operators op);

    @CxxInheritedClass("natj::java::tests::inheritance::Operators")
    private static class Inherited extends CxxInheritedObject implements Operators {
        @CxxInheritedConstructor
        private static native long constructor(long ref);

        protected Inherited() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return constructor(javaReference);
                }
            });
        }

        @CxxOperator(value = CxxOperatorKind.PRE_INCREMENT, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int preInc() {
            return 10;
        }

        @CxxOperator(value = CxxOperatorKind.PRE_DECREMENT, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int preDec() {
            return 11;
        }

        @CxxOperator(value = CxxOperatorKind.POST_INCREMENT, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int postInc() {
            return 12;
        }

        @CxxOperator(value = CxxOperatorKind.POST_DECREMENT, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int postDec() {
            return 13;
        }

        @CxxOperator(value = CxxOperatorKind.UNARY_PLUS, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int unaryPlus() {
            return 20;
        }

        @CxxOperator(value = CxxOperatorKind.UNARY_MINUS, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int unaryMinus() {
            return 21;
        }

        @CxxOperator(value = CxxOperatorKind.NEGATE, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean negate() {
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.COMPLEMENT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int complement() {
            return 31;
        }

        @CxxOperator(value = CxxOperatorKind.ADD, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int add(int value) {
            assertEquals(1040, value);
            return 40;
        }

        @CxxOperator(value = CxxOperatorKind.SUBTRACT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int sub(int value) {
            assertEquals(1041, value);
            return 41;
        }

        @CxxOperator(value = CxxOperatorKind.MULTIPLY, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int mul(int value) {
            assertEquals(1042, value);
            return 42;
        }

        @CxxOperator(value = CxxOperatorKind.DIVIDE, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int div(int value) {
            assertEquals(1043, value);
            return 43;
        }

        @CxxOperator(value = CxxOperatorKind.MODULUS, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int mod(int value) {
            assertEquals(1044, value);
            return 44;
        }

        @CxxOperator(value = CxxOperatorKind.EQUAL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean eq(int value) {
            assertEquals(1050, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.INEQUAL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean neq(int value) {
            assertEquals(1051, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.LESS, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean lt(int value) {
            assertEquals(1052, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.LESS_EQUAL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean le(int value) {
            assertEquals(1053, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.GREATER, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean gt(int value) {
            assertEquals(1054, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.GREATER_EQUAL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean ge(int value) {
            assertEquals(1055, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.LOGICAL_AND, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean land(int value) {
            assertEquals(1060, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.LOGICAL_OR, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public boolean lor(int value) {
            assertEquals(1061, value);
            return true;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_AND, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int band(int value) {
            assertEquals(1070, value);
            return 70;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_OR, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int bor(int value) {
            assertEquals(1071, value);
            return 71;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_XOR, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int bxor(int value) {
            assertEquals(1072, value);
            return 72;
        }

        @CxxOperator(value = CxxOperatorKind.LEFT_SHIFT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int lsh(int value) {
            assertEquals(1073, value);
            return 73;
        }

        @CxxOperator(value = CxxOperatorKind.RIGHT_SHIFT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int rsh(int value) {
            assertEquals(1074, value);
            return 74;
        }

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int get(int offs) {
            assertEquals(1080, offs);
            return 80;
        }

        @CxxOperator(value = CxxOperatorKind.ADD_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int add_assign(int value) {
            assertEquals(1090, value);
            return 90;
        }

        @CxxOperator(value = CxxOperatorKind.SUBTRACT_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int sub_assign(int value) {
            assertEquals(1091, value);
            return 91;
        }

        @CxxOperator(value = CxxOperatorKind.MULTIPLY_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int mul_assign(int value) {
            assertEquals(1092, value);
            return 92;
        }

        @CxxOperator(value = CxxOperatorKind.DIVIDE_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int div_assign(int value) {
            assertEquals(1093, value);
            return 93;
        }

        @CxxOperator(value = CxxOperatorKind.MODULUS_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int mod_assign(int value) {
            assertEquals(1094, value);
            return 94;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_AND_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int band_assign(int value) {
            assertEquals(1100, value);
            return 100;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_OR_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int bor_assign(int value) {
            assertEquals(1101, value);
            return 101;
        }

        @CxxOperator(value = CxxOperatorKind.BITWISE_XOR_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int bxor_assign(int value) {
            assertEquals(1102, value);
            return 102;
        }

        @CxxOperator(value = CxxOperatorKind.LEFT_SHIFT_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int lsh_assign(int value) {
            assertEquals(1110, value);
            return 110;
        }

        @CxxOperator(value = CxxOperatorKind.RIGHT_SHIFT_ASSIGN, virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int rsh_assign(int value) {
            assertEquals(1111, value);
            return 111;
        }

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int call0() {
            return 120;
        }

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int call1(int value) {
            assertEquals(10000, value);
            return 121;
        }

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int call2(int value, int value2) {
            assertEquals(10000, value);
            assertEquals(20000, value2);
            return 122;
        }

        @CxxOperator(value = CxxOperatorKind.FUNCTION_CALL, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int call3(int value, int value2, int value3) {
            assertEquals(10000, value);
            assertEquals(20000, value2);
            assertEquals(30000, value3);
            return 123;
        }

        @CxxOperator(value = CxxOperatorKind.ARROW, virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @Override
        public int arrow() {
            return 130;
        }
    }

    @Test
    public void testPreInc() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(10, preInc(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testPreDec() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(11, preDec(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testPostInc() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(12, postInc(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testPostDec() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(13, postDec(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testUnaryPlus() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(20, unaryPlus(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testUnaryMinus() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(21, unaryMinus(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testNegate() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(negate(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testComplement() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(31, complement(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testAdd() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(40, add(op, 1040));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testSub() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(41, sub(op, 1041));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testMul() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(42, mul(op, 1042));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testDiv() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(43, div(op, 1043));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testMod() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(44, mod(op, 1044));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testEq() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(eq(op, 1050));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testNeq() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(neq(op, 1051));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLt() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(lt(op, 1052));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLe() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(le(op, 1053));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testGt() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(gt(op, 1054));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testGe() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(ge(op, 1055));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLand() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(land(op, 1060));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLor() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertTrue(lor(op, 1061));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBand() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(70, band(op, 1070));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBor() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(71, bor(op, 1071));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBxor() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(72, bxor(op, 1072));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLsh() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(73, lsh(op, 1073));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testRsh() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(74, rsh(op, 1074));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testGet() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(80, get(op, 1080));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testAdd_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(90, add_assign(op, 1090));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testSub_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(91, sub_assign(op, 1091));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testMul_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(92, mul_assign(op, 1092));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testDiv_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(93, div_assign(op, 1093));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testMod_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(94, mod_assign(op, 1094));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBand_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(100, band_assign(op, 1100));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBor_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(101, bor_assign(op, 1101));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testBxor_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(102, bxor_assign(op, 1102));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testLsh_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(110, lsh_assign(op, 1110));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testRsh_assign() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(111, rsh_assign(op, 1111));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testCall0() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(120, call0(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testCall1() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(121, call1(op, 10000));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testCall2() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(122, call2(op, 10000, 20000));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testCall3() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(123, call3(op, 10000, 20000, 30000));
        } finally {
            CxxRuntime.delete(op);
        }
    }

    @Test
    public void testArrow() {
        Operators op = new Inherited();
        assertNotNull(op);
        try {
            assertEquals(130, arrow(op));
        } finally {
            CxxRuntime.delete(op);
        }
    }
}

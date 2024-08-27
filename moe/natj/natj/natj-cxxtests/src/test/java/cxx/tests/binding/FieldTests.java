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
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import cxx.tests.NatJTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

@CxxHeader("binding/Fields.hpp")
public class FieldTests extends NatJTest {

    @CxxHeader("binding/Fields.hpp")
    @CxxClass("natj::cxx::tests::binding::FieldA")
    private interface FieldA extends CxxObject {

        @CxxFieldGetter
        int fI32();

        @CxxFieldSetter
        void fI32(int value);

        @CxxFieldGetter
        @CxxUnsigned
        long fU64A();

        @CxxFieldSetter
        void fU64A(@CxxUnsigned long value);

        @CxxFieldGetter
        boolean i1();

        @CxxFieldSetter
        void i1(boolean value);

        /* Requires Java 8
        @CxxFieldGetter()
        static int sfI32() {
            throw new CxxExpectedGeneratedCodeException();
        }

        @CxxFieldSetter()
        static void sfI32(int value) {
            throw new CxxExpectedGeneratedCodeException();
        }
        */
    }

    @CxxHeader("binding/Fields.hpp")
    @CxxClass("natj::cxx::tests::binding::FieldB")
    private interface FieldB extends FieldA {

        @CxxFieldGetter
        int fI32();

        @CxxFieldSetter
        void fI32(int value);

        @CxxFieldGetter()
        boolean i1();

        @CxxFieldSetter(isMutable = true)
        void i1(boolean value);
    }

    @CxxHeader("binding/Fields.hpp")
    @CxxClass("natj::cxx::tests::binding::FieldC")
    private interface FieldC extends CxxObject {

        @CxxFieldGetter
        @CxxByValue
        @CxxConst
        FieldA a();

        @CxxFieldGetter
        @CxxByValue
        @CxxConst
        FieldB b();
    }

    @BeforeClass
    public static void beforeClass() {
        resetTest();
    }

    @CxxFunction("natj::cxx::tests::binding::resetVariableAndFieldValues")
    private static native void resetTest();

    @CxxConstructor()
    private static native FieldA newFieldA();

    @CxxConstructor()
    private static native FieldB newFieldB();

    @CxxConstructor()
    private static native FieldC newFieldC();

    @CxxGlobalGetter("natj::cxx::tests::binding::M_PI_IN_NAMESPACE")
    private static native float PI();

    @CxxGlobalGetter("ThisIsALongGlobal")
    private static native long getLongGlobal();

    @CxxGlobalSetter("ThisIsALongGlobal")
    private static native long setLongGlobal(long value);

    @CxxGlobalGetter()
    private static native long ThisIsALongGlobal();

    @CxxGlobalSetter()
    private static native long ThisIsALongGlobal(long value);

    @Test
    public void testAField() {
        FieldA tmp = newFieldA();
        assertNotNull(tmp);
        assertEquals(10, tmp.fI32());
        tmp.fI32(tmp.fI32() + 5);
        assertEquals(15, tmp.fI32());
        assertFalse(tmp.i1());

        CxxRuntime.delete(tmp);
    }

    @Test
    public void testBField() {
        FieldB tmp = newFieldB();
        assertNotNull(tmp);
        assertEquals(20, tmp.fI32());
        tmp.fI32(tmp.fI32() + 5);
        assertEquals(25, tmp.fI32());
        assertTrue(tmp.i1());

        FieldA tmpA = tmp.cxxGetDirectInterface(FieldA.class);
        assertNotNull(tmpA);
        assertEquals(10, tmpA.fI32());
        tmpA.fI32(tmpA.fI32() + 5);
        assertEquals(15, tmpA.fI32());

        CxxRuntime.delete(tmp);
    }

    @Test
    public void testInheritedField() {
        FieldB tmp = newFieldB();
        assertNotNull(tmp);
        assertEquals(100, tmp.fU64A());
        tmp.fU64A(tmp.fU64A() + 5);
        assertEquals(105, tmp.fU64A());

        FieldA tmpA = tmp.cxxGetDirectInterface(FieldA.class);
        assertNotNull(tmpA);
        assertEquals(105, tmpA.fU64A());
        tmpA.fU64A(tmpA.fU64A() + 5);
        assertEquals(110, tmpA.fU64A());

        CxxRuntime.delete(tmp);
    }

    /* Requires Java 8
    @Test
    public void testClassStatic() {
        assertEquals(1000, FieldA.sfI32());
        FieldA.sfI32(FieldA.sfI32() + 5);
        assertEquals(1005, FieldA.sfI32());
    }
    */

    @Test
    public void testGlobals() {
        assertEquals(3.14f, PI(), DELTA_F);
        assertEquals(100, getLongGlobal());
        setLongGlobal(getLongGlobal() + 5);
        assertEquals(105, getLongGlobal());

        assertEquals(105, ThisIsALongGlobal());
        ThisIsALongGlobal(ThisIsALongGlobal() + 5);
        assertEquals(110, ThisIsALongGlobal());
    }

    @Test
    public void testMutableAndImmutableSetters() {
        FieldC tmpC = newFieldC();
        assertNotNull(tmpC);

        FieldA tmpA = tmpC.a();
        assertNotNull(tmpA);
        assertEquals(10, tmpA.fI32());
        assertFalse(tmpA.i1());
        try {
            tmpA.fI32(21);
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }
        try {
            tmpA.i1(true);
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }

        FieldB tmpB = tmpC.b();
        assertNotNull(tmpB);
        assertEquals(20, tmpB.fI32());
        assertTrue(tmpB.i1());

        try {
            tmpB.fI32(21);
        } catch (UnsupportedOperationException expected) {
            assertNotNull(expected);
        }

        tmpB.i1(false);
        assertFalse(tmpB.i1());

        CxxRuntime.delete(tmpC);
    }
}

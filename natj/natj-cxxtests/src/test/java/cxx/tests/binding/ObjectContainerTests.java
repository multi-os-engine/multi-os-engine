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
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectContainerTests extends NatJTest {

    @CxxHeader("binding/ObjectContainer.hpp")
    @CxxClass("natj::cxx::tests::binding::ObjectContainer")
    private interface ObjectContainer extends CxxObject {
        @CxxMethod()
        @CxxByValue
        MyClass byValue();

        @CxxMethod(value = "byValue", isConst = true)
        @CxxByValue
        @CxxConst
        MyClass byValue_const();

        @CxxMethod()
        @CxxByReference
        MyClass byReference();

        @CxxMethod(value = "byReference", isConst = true)
        @CxxByReference
        @CxxConst
        MyClass byReference_const();

        @CxxMethod()
        MyClass byPointer();

        @CxxMethod(value = "byPointer", isConst = true)
        @CxxConst
        MyClass byPointer_const();

        @CxxMethod()
        void setByValue(@CxxByValue MyClass p);

        @CxxMethod()
        void setByReference(@CxxByReference MyClass p);

        @CxxMethod()
        void setByPointer(MyClass p);

        @CxxMethod(isConst = true)
        @CxxConst
        ObjectContainer thisAsConst();
    }

    private enum InvocationID {
        ILLEGAL,
        BY_VALUE,
        BY_REFERENCE,
        BY_POINTER,
        CONST_BY_VALUE,
        CONST_BY_REFERENCE,
        CONST_BY_POINTER,
        SET_BY_VALUE,
        SET_BY_REFERENCE,
        SET_BY_POINTER,
    }

    @CxxConstructor()
    private static ObjectContainer newContainer() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @CxxGlobalGetter("natj::cxx::tests::binding::ObjectContainer::lastInvocation")
    private static native int lastInvocation();

    @Test
    public void testReturnValues() {
        ObjectContainer objectContainer = newContainer();
        assertNotNull(objectContainer);
        MyClass p = newMyClass(100);
        objectContainer.setByPointer(p);
        Assert.assertEquals(InvocationID.SET_BY_POINTER.ordinal(), lastInvocation());

        MyClass byValue = objectContainer.byValue();
        assertEquals(InvocationID.BY_VALUE.ordinal(), lastInvocation());
        assertNotNull(byValue);
        assertFalse(byValue.cxxIsConstInterface());
        assertEquals(100, byValue.value());
        assertFalse(byValue.cxxIsIdenticalTo(p));
        CxxRuntime.delete(byValue);

        MyClass reference = objectContainer.byReference();
        assertEquals(InvocationID.BY_REFERENCE.ordinal(), lastInvocation());
        assertNotNull(reference);
        assertFalse(reference.cxxIsConstInterface());
        assertEquals(100, reference.value());
        assertTrue(reference.cxxIsIdenticalTo(p));
        assertSame(reference, p);

        MyClass pointer = objectContainer.byPointer();
        assertEquals(InvocationID.BY_POINTER.ordinal(), lastInvocation());
        assertNotNull(pointer);
        assertFalse(pointer.cxxIsConstInterface());
        assertEquals(100, pointer.value());
        assertTrue(pointer.cxxIsIdenticalTo(p));
        assertSame(pointer, p);

        CxxRuntime.delete(objectContainer);
        CxxRuntime.delete(p);
    }

    @Test
    public void testConstReturnValues() {
        ObjectContainer objectContainer = newContainer();
        assertNotNull(objectContainer);
        MyClass p = newMyClass(100);
        objectContainer.setByPointer(p);
        Assert.assertEquals(InvocationID.SET_BY_POINTER.ordinal(), lastInvocation());

        MyClass byValue = objectContainer.byValue_const();
        assertEquals(InvocationID.CONST_BY_VALUE.ordinal(), lastInvocation());
        assertNotNull(byValue);
        assertTrue(byValue.cxxIsConstInterface());
        assertEquals(100, byValue.value());
        assertFalse(byValue.cxxIsIdenticalTo(p));
        CxxRuntime.delete(byValue);

        MyClass reference = objectContainer.byReference_const();
        assertEquals(InvocationID.CONST_BY_REFERENCE.ordinal(), lastInvocation());
        assertNotNull(reference);
        assertTrue(reference.cxxIsConstInterface());
        assertEquals(100, reference.value());
        assertTrue(reference.cxxIsIdenticalTo(p));
        assertNotSame(reference, p);

        MyClass pointer = objectContainer.byPointer_const();
        assertEquals(InvocationID.CONST_BY_POINTER.ordinal(), lastInvocation());
        assertNotNull(pointer);
        assertTrue(pointer.cxxIsConstInterface());
        assertEquals(100, pointer.value());
        assertTrue(pointer.cxxIsIdenticalTo(p));
        assertNotSame(pointer, p);

        CxxRuntime.delete(objectContainer);
        CxxRuntime.delete(p);
    }

    @Test
    public void testParameterValues() {
        ObjectContainer base = newContainer();
        assertNotNull(base);
        MyClass v1 = newMyClass(1);
        assertNotNull(v1);
        MyClass v2 = newMyClass(2);
        assertNotNull(v2);
        MyClass v3 = newMyClass(3);
        assertNotNull(v3);

        assertEquals(1, v1.value());
        assertEquals(2, v2.value());
        assertEquals(3, v3.value());
        base.setByValue(v1);
        assertEquals(InvocationID.SET_BY_VALUE.ordinal(), lastInvocation());
        final MyClass byValueByPointer = base.byPointer();
        assertEquals(1, byValueByPointer.value());
        base.setByReference(v2);
        CxxRuntime.detachOnly(byValueByPointer);
        assertEquals(InvocationID.SET_BY_REFERENCE.ordinal(), lastInvocation());
        assertEquals(2, base.byPointer().value());
        base.setByPointer(v3);
        assertEquals(InvocationID.SET_BY_POINTER.ordinal(), lastInvocation());
        assertEquals(3, base.byPointer().value());

        CxxRuntime.delete(base);
        CxxRuntime.delete(v1);
        CxxRuntime.delete(v2);
        CxxRuntime.delete(v3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNonConstByValueOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            CxxRuntime.delete(base.byValue());
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNonConstByReferenceOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            base.byReference();
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testNonConstByPointerOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            base.byPointer();
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test
    public void testConstByValueOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            CxxRuntime.delete(base.byValue_const());
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test
    public void testConstByReferenceOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            base.byReference_const();
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test
    public void testConstByPointerOnConst() {
        ObjectContainer base = newContainer().thisAsConst();
        assertTrue(base.cxxIsConstInterface());
        try {
            base.byPointer_const();
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNullParameterByValue() {
        ObjectContainer base = newContainer();
        try {
            base.setByValue(null);
        } finally {
            CxxRuntime.delete(base);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNullParameterByReference() {
        ObjectContainer base = newContainer();
        try {
            base.setByReference(null);
        } finally {
            CxxRuntime.delete(base);
        }
    }
}

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
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastOperatorTest extends NatJTest {

    @CxxHeader("binding/Operators.hpp")
    @CxxClass("natj::cxx::tests::binding::IntCastOp")
    private interface IntCastOp extends CxxObject {
        @CxxCastOperator()
        boolean toBool();

        @CxxCastOperator()
        int toInt();

        @CxxCastOperator()
        @CxxByValue
        MyClass toMyClassValue();

        @CxxCastOperator()
        @CxxByReference
        MyClass toMyClassReference();

        @CxxCastOperator()
        MyClass toMyClass();

        @CxxCastOperator(isConst = true)
        @CxxByValue
        @CxxConst
        MyClass toConstMyClassValue();

        @CxxCastOperator(isConst = true)
        @CxxByReference
        @CxxConst
        MyClass toConstMyClassReference();

        @CxxCastOperator(isConst = true)
        @CxxConst
        MyClass toConstMyClass();

        @CxxCastOperator()
        @CxxJavaObject
        Object toObject();
    }

    @CxxConstructor()
    private static native IntCastOp newIntCastOp();

    @Test
    public void testToBool() {
        final IntCastOp tmp = newIntCastOp();
        try {
            assertTrue(tmp.toBool());
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToInt() {
        final IntCastOp tmp = newIntCastOp();
        try {
            assertEquals(100, tmp.toInt());
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClassValue() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toMyClassValue();
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(200, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClassReference() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toMyClassReference();
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(201, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClass() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toMyClass();
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(202, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClassValue() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toConstMyClassValue();
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(300, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClassReference() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toConstMyClassReference();
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(301, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClass() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final MyClass myClass = tmp.toConstMyClass();
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(302, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToObject() {
        final IntCastOp tmp = newIntCastOp();
        try {
            final Object object = tmp.toObject();
            assertNull(object);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }
}

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

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxMethodVirtuality;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import cxx.interfaces.MyClass;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastOperatorTest extends NatJTest {
    @CxxHeader("inheritance/Operators.hpp")
    @CxxClass("natj::cxx::tests::inheritance::CastOperators")
    private interface CastOperators extends CxxObject {
        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        boolean toBool();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        int toInt();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByValue
        MyClass toMyClassValue();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxByReference
        MyClass toMyClassReference();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        MyClass toMyClass();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        @CxxByValue
        @CxxConst
        MyClass toConstMyClassValue();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        @CxxByReference
        @CxxConst
        MyClass toConstMyClassReference();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL, isConst = true)
        @CxxConst
        MyClass toConstMyClass();

        @CxxCastOperator(virtuality = CxxMethodVirtuality.PURE_VIRTUAL)
        @CxxJavaObject
        Object toObject();
    }

    @CxxFunction("natj::cxx::tests::inheritance::invoke_toBool")
    private static native boolean invoke_toBool(CastOperators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_toInt")
    private static native int invoke_toInt(CastOperators op);

    @CxxByValue
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toMyClassValue")
    private static native MyClass invoke_toMyClassValue(CastOperators op);

    @CxxByReference
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toMyClassReference")
    private static native MyClass invoke_toMyClassReference(CastOperators op);

    @CxxFunction("natj::cxx::tests::inheritance::invoke_toMyClass")
    private static native MyClass invoke_toMyClass(CastOperators op);

    @CxxByValue
    @CxxConst
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toConstMyClassValue")
    private static native MyClass invoke_toConstMyClassValue(@CxxConst CastOperators op);

    @CxxByReference
    @CxxConst
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toConstMyClassReference")
    private static native MyClass invoke_toConstMyClassReference(@CxxConst CastOperators op);

    @CxxConst
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toConstMyClass")
    private static native MyClass invoke_toConstMyClass(@CxxConst CastOperators op);

    @CxxJavaObject
    @CxxFunction("natj::cxx::tests::inheritance::invoke_toObject")
    private static native Object invoke_toObject(CastOperators op);

    @CxxInheritedClass("natj::java::tests::inheritance::CastOperators")
    private static class Inherited extends CxxInheritedObject implements CastOperators {
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

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public boolean toBool() {
            return true;
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public int toInt() {
            return 1000;
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxByValue
        @Override
        public MyClass toMyClassValue() {
            return newMyClass(2000);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxByReference
        @Override
        public MyClass toMyClassReference() {
            return newMyClass(2001);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @Override
        public MyClass toMyClass() {
            return newMyClass(2002);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByValue
        @CxxConst
        @Override
        public MyClass toConstMyClassValue() {
            return newMyClass(3000);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxByReference
        @CxxConst
        @Override
        public MyClass toConstMyClassReference() {
            return newMyClass(3001);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL, isConst = true)
        @CxxConst
        @Override
        public MyClass toConstMyClass() {
            return newMyClass(3002);
        }

        @CxxCastOperator(virtuality = CxxMethodVirtuality.VIRTUAL)
        @CxxJavaObject
        @Override
        public Object toObject() {
            return JAVA_OBJECT;
        }
    }

    @Test
    public void testToBool() {
        final CastOperators tmp = new Inherited();
        try {
            assertTrue(invoke_toBool(tmp));
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToInt() {
        final CastOperators tmp = new Inherited();
        try {
            assertEquals(1000, invoke_toInt(tmp));
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClassValue() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toMyClassValue(tmp);
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(2000, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClassReference() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toMyClassReference(tmp);
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(2001, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToMyClass() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toMyClass(tmp);
            assertNotNull(myClass);
            try {
                assertFalse(myClass.cxxIsConstInterface());
                assertEquals(2002, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClassValue() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toConstMyClassValue(tmp);
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(3000, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClassReference() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toConstMyClassReference(tmp);
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(3001, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToConstMyClass() {
        final CastOperators tmp = new Inherited();
        try {
            final MyClass myClass = invoke_toConstMyClass(tmp);
            assertNotNull(myClass);
            try {
                assertTrue(myClass.cxxIsConstInterface());
                assertEquals(3002, myClass.value());
            } finally {
                CxxRuntime.delete(myClass);
            }
        } finally {
            CxxRuntime.delete(tmp);
        }
    }

    @Test
    public void testToObject() {
        final CastOperators tmp = new Inherited();
        try {
            final Object object = invoke_toObject(tmp);
            assertNotNull(object);
            assertSame(JAVA_OBJECT, object);
        } finally {
            CxxRuntime.delete(tmp);
        }
    }
}

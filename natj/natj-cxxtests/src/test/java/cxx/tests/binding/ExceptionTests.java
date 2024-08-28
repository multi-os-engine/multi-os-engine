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

import org.moe.natj.cxx.*;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import cxx.tests.NatJTest;
import org.junit.Test;

@CxxHeader("binding/Functions.hpp")
public class ExceptionTests {

    @CxxHeader("inheritance/Exceptions.hpp")
    @CxxClass("natj::cxx::tests::inheritance::Exceptions")
    private interface Exceptions extends CxxObject {
        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        void throwException();
    }

    @CxxInheritedClass("natj::java::tests::inherited::ExTClass")
    private static class ExTClass extends CxxInheritedObject implements Exceptions {

        @CxxInheritedConstructor()
        public static native long newInstance(long java);

        public ExTClass() {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return newInstance(javaReference);
                }
            });
        }

        @CxxMethod(virtuality = CxxMethodVirtuality.VIRTUAL)
        public void throwException() {
            throw new RuntimeException();
        }
    }

    @CxxHeader(value = "vector", useQuotes = false)
    @CxxClass("std::vector<natj::java::tests::inherited::ExTClass*>")
    private interface Vector extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxConst
        ExTClass get(@NULong long index);

        @CxxMethod
        void push_back(ExTClass value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        ExTClass set(@NULong long index, ExTClass value);

        @CxxMethod
        ExTClass at(@NULong long index);
    }

    @CxxConstructor()
    private static native Vector newVector();

    @CxxFunction
    public static native void testThrowsIntegerException();

    @CxxFunction("natj::cxx::tests::inheritance::callExceptionThrower")
    public static native void callExceptionThrower(Exceptions exc);

    @Test(expected = StdException.class)
    public void testStdException() {
        NatJTest.ObjectPool pool = new NatJTest.ObjectPool();
        try {
            final Vector vec = pool.add(newVector());
            vec.at(0);
        } finally {
            pool.clear();
        }
    }

    @Test(expected = RuntimeException.class)
    public void testIntegerException() {
        testThrowsIntegerException();
    }

    @Test(expected = RuntimeException.class)
    public void testInheritedException() {
        NatJTest.ObjectPool pool = new NatJTest.ObjectPool();
        try {
            final ExTClass ext = pool.add(new ExTClass());
            callExceptionThrower(ext);
        } finally {
            pool.clear();
        }
    }
}

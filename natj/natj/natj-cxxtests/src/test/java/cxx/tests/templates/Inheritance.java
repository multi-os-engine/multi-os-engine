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

package cxx.tests.templates;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.ann.*;
import cxx.interfaces.MyClass;
import cxx.interfaces.MyClass2;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class Inheritance extends NatJTest {
    @CxxHeader("templates/Inheritance.hpp")
    @CxxTemplate("natj::cxx::tests::templates::Base<{{T}}>")
    private interface Base<T extends CxxObject> extends CxxObject {
        @CxxMethod
        @CxxByValue
        T forward(@CxxConst @CxxByReference T what);
    }

    @CxxTemplate("natj::cxx::tests::templates::Inherited<{{T}}>")
    private interface Inherited<T extends CxxObject> extends Base<T> {
        @CxxMethod
        @CxxByValue
        T forwardDouble(@CxxConst @CxxByReference T what);
    }

    @CxxTemplate("natj::cxx::tests::templates::SecondInherited<{{T}},{{U}}>")
    private interface SecondInherited<T extends CxxObject, U extends CxxObject> extends Inherited<U> {
        @CxxMethod
        @CxxByValue
        T forwardNTimes(@CxxConst @CxxByReference T what, @CxxConst @CxxByReference U howmany);
    }

    @CxxConstructor
    private static native SecondInherited<MyClass, MyClass2> create();

    @Test
    public void testInheritance() {
        final ObjectPool pool = new ObjectPool();
        try {
            final SecondInherited<MyClass, MyClass2> root = pool.add(create());
            assertNotNull(root);
            assertTrue(root instanceof SecondInherited);

            final MyClass2 mc100 = pool.add(newMyClass2(100));
            assertNotNull(mc100);

            final MyClass2 fwd100 = pool.add(root.forward(mc100));
            assertNotNull(fwd100);
            assertEquals(100, fwd100.value());

            final MyClass2 fwd200 = pool.add(root.forwardDouble(mc100));
            assertNotNull(fwd200);
            assertEquals(200, fwd200.value());

            final MyClass fwd300 = pool.add(root.forwardNTimes(pool.add(newMyClass(3)), mc100));
            assertNotNull(fwd300);
            assertEquals(300, fwd300.value());
        } finally {
            pool.clear();
        }
    }
}

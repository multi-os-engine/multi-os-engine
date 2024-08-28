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
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import cxx.interfaces.MyClass;
import cxx.interfaces.MyClass2;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StandardClasses extends NatJTest {

    @CxxTemplate("std::vector<{{T}}>")
    public interface Vector<T extends CxxObject> extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(CxxOperatorKind.SUBSCRIPT)
        @CxxByReference
        T get(@NULong long index);

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        @CxxConst
        @CxxByReference
        T get_const(@NULong long index);

        @CxxMethod
        void push_back(@CxxConst @CxxByReference T elem);

        @CxxMethod
        @CxxByValue
        Iterator<T> begin();

        @CxxMethod
        @CxxByValue
        Iterator<T> end();

        @CxxTemplate("std::vector<{{U}}>::iterator")
        interface Iterator<U extends CxxObject> extends CxxObject {
            @CxxOperator(CxxOperatorKind.INDIRECT)
            @CxxByReference
            U get();

            @CxxOperator(CxxOperatorKind.PRE_INCREMENT)
            @CxxByReference
            Iterator<U> succ();
        }
    }

    @CxxConstructor()
    private static native Vector<MyClass> newMyClassVector();

    @CxxConstructor()
    private static native Vector<MyClass2> newMyClass2Vector();

    @CxxHeader("templates/VectorCounter.hpp")
    @CxxTemplate("natj::cxx::tests::templates::VectorCounter<{{T}}>")
    @CxxDefaultConstructorUnavailable
    public interface VectorCounter<T extends CxxObject> extends CxxObject {
        @CxxFieldGetter()
        @NULong
        long size();
    }

    @CxxConstructor()
    private static native VectorCounter<MyClass> newMyClassVectorCounter(@CxxConst @CxxByReference Vector<MyClass> vector);

    @CxxConstructor()
    private static native VectorCounter<MyClass2> newMyClass2VectorCounter(@CxxConst @CxxByReference Vector<MyClass2> vector);

    @CxxTemplate("std::unique_ptr<{{T}}>")
    @CxxDestructorUnavailable
    @CxxCopyConstructorUnavailable
    private interface UniquePtr<T extends CxxObject> extends CxxObject {
        @CxxMethod(isConst = true)
        T get();
    }

    @CxxConstructor
    private static native UniquePtr<Vector<MyClass>> create(Vector<MyClass> value);

    @Test
    public void testMyClass2Vector() {
        final ObjectPool pool = new ObjectPool();
        try {
            // Create
            final Vector<MyClass2> vector = pool.add(newMyClass2Vector());
            assertNotNull(vector);
            assertEquals(0, vector.size());

            // Add 10
            vector.push_back(pool.add(newMyClass2(10)));
            assertEquals(1, vector.size());
            final MyClass2 get0 = vector.get(0);
            assertNotNull(get0);
            assertEquals(10, get0.value());

            // Add 20
            vector.push_back(pool.add(newMyClass2(20)));
            assertEquals(2, vector.size());
            final MyClass2 get1 = vector.get(1);
            assertNotNull(get1);
            assertEquals(20, get1.value());

            // Add 30
            vector.push_back(pool.add(newMyClass2(30)));
            assertEquals(3, vector.size());
            final MyClass2 get2 = vector.get(2);
            assertNotNull(get2);
            assertEquals(30, get2.value());

            // Create a counter
            final VectorCounter<MyClass2> counter = pool.add(newMyClass2VectorCounter(vector));
            assertNotNull(counter);
            assertEquals(3, counter.size());
        } finally {
            pool.clear();
        }
    }

    @CxxOperatorFunction(CxxOperatorKind.EQUAL)
    public static native boolean equals(@CxxConst @CxxByReference Vector.Iterator<MyClass2> a,
                                        @CxxConst @CxxByReference Vector.Iterator<MyClass2> b);

    @Test
    public void testMyClass2VectorIterator() {
        final ObjectPool pool = new ObjectPool();
        try {
            // Create
            final Vector<MyClass2> vector = pool.add(newMyClass2Vector());
            assertNotNull(vector);
            assertEquals(0, vector.size());

            // Create values
            MyClass2 values[] = new MyClass2[]{
                    pool.add(newMyClass2(10)),
                    pool.add(newMyClass2(20)),
                    pool.add(newMyClass2(30))
            };

            // Add values
            vector.push_back(values[0]);
            vector.push_back(values[1]);
            vector.push_back(values[2]);
            assertEquals(3, vector.size());

            // Iterator
            int valueIndex = 0;
            final Vector.Iterator<MyClass2> it = vector.begin();
            while (!equals(it, vector.end())) {
                assertEquals(values[valueIndex++].value(), it.get().value());
                it.succ();
            }
        } finally {
            pool.clear();
        }
    }

    @Test(expected = ClassCastException.class)
    public void testInvalidGenericCast() {
        final ObjectPool pool = new ObjectPool();
        try {
            // Create
            final Vector vector = pool.add(newMyClassVector());
            assertNotNull(vector);
            assertEquals(0, vector.size());

            // Cast to invalid type
            final Vector<MyClass2> badVector = vector;

            // Create a counter for the original type, expecting a ClassCastException here
            newMyClass2VectorCounter(badVector);
        } finally {
            pool.clear();
        }
    }
}

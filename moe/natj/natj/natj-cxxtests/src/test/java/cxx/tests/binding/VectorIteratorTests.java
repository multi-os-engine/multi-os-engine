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

import org.moe.natj.cxx.CxxInheritedObject;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxOperatorKind;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.*;
import org.moe.natj.general.ann.NULong;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VectorIteratorTests extends NatJTest {

    @CxxInheritedClass("natj::java::tests::inherited::VITClass")
    private static class VITClass extends CxxInheritedObject {
        public final String value;

        @CxxInheritedConstructor()
        public static native long newInstance(long java);

        public VITClass(String value) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return newInstance(javaReference);
                }
            });
            this.value = value;
        }
    }

    @CxxHeader(value = "vector", useQuotes = false)
    @CxxClass("std::vector<natj::java::tests::inherited::VITClass*>")
    private interface Vector extends CxxObject {
        @CxxMethod(isConst = true)
        @NULong
        long size();

        @CxxOperator(value = CxxOperatorKind.SUBSCRIPT, isConst = true)
        VITClass get(@NULong long index);

        @CxxMethod
        void push_back(VITClass value);

        @CxxOperator(CxxOperatorKind.EXT_SUBSCRIPT_ASSIGN)
        VITClass set(@NULong long index, VITClass value);

        @CxxMethod
        @CxxByValue
        Iterator begin();

        @CxxMethod
        @CxxByValue
        Iterator end();
    }

    @CxxClass("std::vector<natj::java::tests::inherited::VITClass*>::iterator")
    private interface Iterator extends CxxObject {
        @CxxOperator(CxxOperatorKind.INDIRECT)
        VITClass get();

        @CxxOperator(CxxOperatorKind.PRE_INCREMENT)
        @CxxByReference
        Iterator succ();
    }

    @CxxOperatorFunction(CxxOperatorKind.EQUAL)
    private static native boolean equals(@CxxConst @CxxByReference Iterator a, @CxxConst @CxxByReference Iterator b);

    @CxxConstructor()
    private static native Vector newVector();

    @Test
    public void testElementClass() {
        final VITClass vitClass = new VITClass(null);
        assertNotNull(vitClass);
        CxxRuntime.delete(vitClass);
    }

    @Test
    public void testVectorBasics() {
        final String values[] = new String[]{"a", "b", "c", "d"};
        ObjectPool pool = new ObjectPool();
        try {
            final Vector vec = pool.add(newVector());
            vec.push_back(pool.add(new VITClass(values[0])));
            vec.push_back(pool.add(new VITClass(values[1])));
            vec.push_back(pool.add(new VITClass(values[2])));
            vec.push_back(pool.add(new VITClass(values[3])));

            assertEquals(4, vec.size());
            assertEquals(values[0], vec.get(0).value);
            assertEquals(values[1], vec.get(1).value);
            assertEquals(values[2], vec.get(2).value);
            assertEquals(values[3], vec.get(3).value);

            int valueIndex = 0;
            final Iterator it = vec.begin();
            while (!equals(it, vec.end())) {
                assertEquals(values[valueIndex++], it.get().value);
                it.succ();
            }
        } finally {
            pool.clear();
        }
    }
}

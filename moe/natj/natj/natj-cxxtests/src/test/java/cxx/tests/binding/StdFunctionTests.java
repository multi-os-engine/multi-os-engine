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
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class StdFunctionTests extends NatJTest {

    @CxxHeader("binding/SpecialObjects.hpp")
    @CxxClass("natj::cxx::tests::binding::Multiplier<float>")
    @CxxDefaultConstructorUnavailable
    private interface MultiplierF extends CxxObject {
    }

    @CxxConstructor()
    private static native MultiplierF createMultiplier(float by);

    @CxxInheritedClass("natj::java::tests::inherited::CustomMultiplier")
    private static class CustomMultiplierF extends CxxInheritedObject {

        @CxxInheritedConstructor()
        private static native long constructor(long ref);

        private final float by;

        public CustomMultiplierF(float by) {
            super(new ICxxConstructor() {
                @Override
                public long construct(long javaReference) {
                    return constructor(javaReference);
                }
            });
            this.by = by;
        }

        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        float call(float value) {
            return value * by;
        }
    }

    @CxxHeader(value = "functional", useQuotes = false)
    @CxxClass("std::reference_wrapper<natj::java::tests::inherited::CustomMultiplier>")
    @CxxDefaultConstructorUnavailable
    private interface CustomMultiplierFReferenceWrapper extends CxxObject {
    }

    @CxxConstructor()
    private static native CustomMultiplierFReferenceWrapper wrap(@CxxByReference CustomMultiplierF by);

    @CxxHeader(value = "functional", useQuotes = false)
    @CxxClass("std::function<float(float)>")
    private interface StdFunctionF extends CxxObject {
        @CxxOperator(CxxOperatorKind.FUNCTION_CALL)
        float call(float value);
    }

    @CxxConstructor()
    private static native StdFunctionF createFunction(@CxxConst @CxxByReference MultiplierF by);

    @CxxConstructor()
    private static native StdFunctionF createFunction(@CxxConst @CxxByReference CustomMultiplierFReferenceWrapper by);

    @Test
    public void testFunctionCall() {
        final MultiplierF multiplier = createMultiplier(2.0f);
        assertNotNull(multiplier);
        final StdFunctionF function = createFunction(multiplier);
        try {
            assertNotNull(function);
        } finally {
            CxxRuntime.delete(multiplier);
        }
        try {
            assertEquals(10.0f, function.call(5.0f), 0.0f);
        } finally {
            CxxRuntime.delete(function);
        }
    }

    @Test
    public void testInheritedFunctionCall() {
        ObjectPool pool = new ObjectPool();
        try {
            final CustomMultiplierF multiplier = pool.add(new CustomMultiplierF(4.0f));
            assertNotNull(multiplier);
            final CustomMultiplierFReferenceWrapper referenceWrapper = pool.add(wrap(multiplier));
            assertNotNull(referenceWrapper);
            final StdFunctionF function = pool.add(createFunction(referenceWrapper));
            assertNotNull(function);
            assertEquals(20.0f, function.call(5.0f), 0.0f);
        } finally {
            pool.clear();
        }
    }
}

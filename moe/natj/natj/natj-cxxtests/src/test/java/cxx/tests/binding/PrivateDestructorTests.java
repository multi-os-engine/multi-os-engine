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
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PrivateDestructorTests extends NatJTest {

    @CxxHeader("binding/SpecialObjects.hpp")
    @CxxClass("natj::cxx::tests::binding::PrivateDtor")
    @CxxDestructorUnavailable
    @CxxDefaultConstructorUnavailable
    @CxxCopyConstructorUnavailable
    private interface PrivateDtor extends CxxObject {

        @CxxMethod
        void Release();
    }

    @CxxConstructor()
    private static native PrivateDtor newPrivateDtor();

    @Test
    public void testPrivateDestructorCall() {
        PrivateDtor object = newPrivateDtor();
        assertNotNull(object);
        try {
            CxxRuntime.delete(object);
            throw new RuntimeException("unreachable");
        } catch (UnsupportedOperationException ignore) {
            // expected
            assertNotNull(ignore);
        }

        CxxRuntime.deleteWith(object, new CxxRuntime.Releaser<PrivateDtor>() {
            @Override
            public void release(PrivateDtor privateDtor) {
                privateDtor.Release();
            }
        });
    }
}

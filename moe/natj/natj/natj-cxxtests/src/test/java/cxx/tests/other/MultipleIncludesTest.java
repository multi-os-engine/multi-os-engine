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

package cxx.tests.other;

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.cxx.ann.CxxClass;
import org.moe.natj.cxx.ann.CxxConstructor;
import org.moe.natj.cxx.ann.CxxHeader;
import org.moe.natj.cxx.ann.CxxHeaders;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class MultipleIncludesTest extends NatJTest {

    @CxxHeaders({
            @CxxHeader("other/HeaderTestA.hpp"),
            @CxxHeader("other/HeaderTestB.hpp")
    })
    @CxxClass("natj::cxx::tests::other::HTA<natj::cxx::tests::other::HTB>")
    private interface A extends CxxObject {

    }

    @CxxConstructor()
    private static native A newA();

    @Test
    public void testConstructor() {
        A a = newA();
        assertNotNull(a);
        CxxRuntime.delete(a);
    }
}

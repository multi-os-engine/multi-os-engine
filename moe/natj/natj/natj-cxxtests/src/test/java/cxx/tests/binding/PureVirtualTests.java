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

import org.moe.natj.cxx.CxxRuntime;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PureVirtualTests extends HierarchyTestBase {

    @Test(expected = UnsupportedOperationException.class)
    public void testPureClassConstruction() {
        newPureA();
    }

    @Test
    public void testNonPureClassConstruction() {
        NonPureB b = newNonPureB();
        assertNotNull(b);
        b.foo();

        PureA a = b.cxxGetDirectInterface(PureA.class);
        assertNotNull(a);
        a.foo();

        CxxRuntime.delete(b);
    }
}

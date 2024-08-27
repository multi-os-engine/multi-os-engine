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

import org.moe.natj.cxx.ann.CxxEnum;
import org.moe.natj.cxx.ann.CxxFunction;
import org.moe.natj.cxx.ann.CxxHeader;
import cxx.tests.NatJTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@CxxHeader("binding/Enums.hpp")
public class EnumTests extends NatJTest {

    private static final int VALUE_1 = 0;
    private static final int VALUE_2 = 1;

    @CxxFunction("natj::cxx::tests::binding::forwardMyEnum")
    @CxxEnum("natj::cxx::tests::binding::MyEnum")
    private static native int forward(@CxxEnum("natj::cxx::tests::binding::MyEnum") int value);

    @Test
    public void testEnumBinding() {
        assertEquals(VALUE_1, forward(VALUE_1));
        assertEquals(VALUE_2, forward(VALUE_2));
    }
}

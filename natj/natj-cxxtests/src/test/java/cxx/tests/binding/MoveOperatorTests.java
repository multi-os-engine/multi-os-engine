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

public class MoveOperatorTests extends NatJTest {

    @CxxHeader("binding/SpecialObjects.hpp")
    @CxxClass("std::vector<std::unique_ptr<natj::cxx::tests::binding::StdVecUniqPtrElem>>")
    @CxxCopyConstructorUnavailable
    private interface StdVecUniqPtr extends CxxObject {
    }

    @CxxFunction("natj::cxx::tests::binding::getStdVecUniqPtr")
    @CxxByValue
    private static native StdVecUniqPtr getStdVecUniqPtr();

    @Test
    public void testMoveConstructorOnlyCase() {
        final StdVecUniqPtr uniqPtr = getStdVecUniqPtr();
        assertNotNull(uniqPtr);
        CxxRuntime.delete(uniqPtr);
    }
}

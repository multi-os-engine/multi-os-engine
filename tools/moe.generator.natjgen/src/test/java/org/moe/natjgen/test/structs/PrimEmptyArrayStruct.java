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

package org.moe.natjgen.test.structs;

import org.eclipse.jdt.core.dom.MethodDeclaration;

public class PrimEmptyArrayStruct extends AbstractStructTest {

    public void test_getter_f1() {
        MethodDeclaration method = getMethod("f1");
        assertNull(method);
    }

    public void test_setter_f1() {
        MethodDeclaration method = getMethod("setF1");
        assertNull(method);
    }

}

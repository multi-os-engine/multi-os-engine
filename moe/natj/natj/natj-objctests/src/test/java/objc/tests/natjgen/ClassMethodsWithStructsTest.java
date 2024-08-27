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

package objc.tests.natjgen;

import objc.binding.StructClass;
import objc.binding.struct.NG_ISMulti_Struct;
import objc.binding.struct.NG_I_Struct;
import org.junit.Assert;
import org.junit.Test;

public class ClassMethodsWithStructsTest {

    @Test
    public void testSmallStruct() {
        NG_I_Struct s = StructClass.IStructCreate_static(5, 10);
        Assert.assertTrue(StructClass.IStructCompare_static(s, 5, 10));
    }

    @Test
    public void testSmallStructPtr() {
        NG_I_Struct s = StructClass.IStructCreate_static(5, 10);
        NG_I_Struct x = StructClass.IStructCreatePtr_static(s);
        Assert.assertTrue(StructClass.IStructRefCompare_static(x, 5, 10));
        StructClass.IStructRefFree_static(x);
    }

    @Test
    public void testLargeStruct() {
        NG_ISMulti_Struct s = StructClass.ISMultiStructCreate_static(5, 10);
        Assert.assertEquals(2, StructClass.ISMultiStructFind_static(s, 5, 10));
    }

    @Test
    public void testLargeStructPtr() {
        NG_ISMulti_Struct s = StructClass.ISMultiStructCreatePtr_static(5, 10);
        Assert.assertEquals(2, StructClass.ISMultiStructFind_static(s, 5, 10));
        StructClass.ISMultiStructRefFree_static(s);
    }
}

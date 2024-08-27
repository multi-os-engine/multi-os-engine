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


public class InstanceMethodsWithStructsTest {

    @Test
    public void testSmallStruct() {
        StructClass object = StructClass.alloc().init();

        NG_I_Struct s = object.IStructCreate(5, 10);
        Assert.assertTrue(object.IStructCompare(s, 5, 10));
    }

    @Test
    public void testSmallStructPtr() {
        StructClass object = StructClass.alloc().init();

        NG_I_Struct s = object.IStructCreate(5, 10);
        NG_I_Struct x = object.IStructCreatePtr(s);
        Assert.assertTrue(object.IStructRefCompare(x, 5, 10));
        object.IStructRefFree(x);
    }

    @Test
    public void testLargeStruct() {
        StructClass object = StructClass.alloc().init();

        NG_ISMulti_Struct s = object.ISMultiStructCreate(5, 10);
        Assert.assertEquals(2, object.ISMultiStructFind(s, 5, 10));
    }

    @Test
    public void testLargeStructPtr() {
        StructClass object = StructClass.alloc().init();

        NG_ISMulti_Struct s = object.ISMultiStructCreatePtr(5, 10);
        Assert.assertEquals(2, object.ISMultiStructFind(s, 5, 10));
        object.ISMultiStructRefFree(s);
    }
}

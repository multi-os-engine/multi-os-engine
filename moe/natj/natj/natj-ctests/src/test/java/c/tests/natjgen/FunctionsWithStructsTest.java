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

package c.tests.natjgen;

import c.binding.struct.NG_ISMulti_Struct;
import c.binding.struct.NG_I_Struct;
import org.junit.Assert;
import org.junit.Test;

import static c.binding.c.Globals.*;

public class FunctionsWithStructsTest {

    @Test
    public void testSmallStruct() {
        NG_I_Struct s = NGIStructCreate(5, 10);
        Assert.assertTrue(NGIStructCompare(s, 5, 10));
    }

    @Test
    public void testSmallStructPtr() {
        NG_I_Struct s = NGIStructCreate(5, 10);
        NG_I_Struct x = NGIStructCreatePtr(s);
        Assert.assertTrue(NGIStructRefCompare(x, 5, 10));
        NGIStructRefFree(x);
    }

    @Test
    public void testLargeStruct() {
        NG_ISMulti_Struct s = NGISMultiStructCreate(5, 10);
        Assert.assertTrue(NGISMultiStructFind(s, 5, 10) == 2);
    }

    @Test
    public void testLargeStructPtr() {
        NG_ISMulti_Struct s = NGISMultiStructCreatePtr(5, 10);
        Assert.assertTrue(NGISMultiStructFind(s, 5, 10) == 2);
        NGISMultiStructRefFree(s);
    }

}

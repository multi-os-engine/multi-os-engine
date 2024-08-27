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

import c.binding.struct.NG_FnPtr_Struct;
import org.junit.Assert;
import org.junit.Test;

public class FunctionTest {

    @Test
    public void test_field_get_set_sanity() {
        NG_FnPtr_Struct struct = new NG_FnPtr_Struct();
        Assert.assertNotNull(struct);
        Assert.assertEquals(null, struct.cb1());
        Assert.assertEquals(null, struct.cb2());

        NG_FnPtr_Struct.Function_cb1 cb1 = new NG_FnPtr_Struct.Function_cb1() {
            @Override
            public void call_cb1(int arg0) {

            }
        };
        Assert.assertNotNull(cb1);
        struct.setCb1(cb1);
        Assert.assertEquals(cb1, struct.cb1());
        Assert.assertEquals(null, struct.cb2());

        NG_FnPtr_Struct.Function_cb2 cb2 = new NG_FnPtr_Struct.Function_cb2() {
            @Override
            public void call_cb2(float arg0) {

            }
        };
        Assert.assertNotNull(cb2);
        struct.setCb2(cb2);
        Assert.assertEquals(cb1, struct.cb1());
        Assert.assertEquals(cb2, struct.cb2());
    }

}

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

package objc.tests.init;

import objc.binding.ClusterClass;
import org.junit.Assert;
import org.junit.Test;

public class ObjCInitTest {

    private final String TEST_STRING = "INIT TEST";

    @Test
    public void test_clusteredInit() {
        ClusterClass uninitialized = ClusterClass.alloc();
        ClusterClass initialized = uninitialized.initWithString(TEST_STRING);

        Assert.assertEquals(uninitialized.getPeer().getPeer(), 0);
        Assert.assertEquals(TEST_STRING, initialized.string());
    }
}

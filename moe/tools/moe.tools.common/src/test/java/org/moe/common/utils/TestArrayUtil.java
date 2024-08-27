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

package org.moe.common.utils;

import junit.framework.TestCase;
import org.junit.Assert;

public class TestArrayUtil extends TestCase {

    public void test_concatenate_1() {
        assertEquals(null, ArrayUtil.concatenate(null, null));
    }

    public void test_concatenate_2() {
        String[] exp = new String[] {"value"};
        String[] act = ArrayUtil.concatenate(null, new String[]{"value"});
        Assert.assertArrayEquals(exp, act);
    }

    public void test_concatenate_3() {
        String[] exp = new String[] {"value"};
        String[] act = ArrayUtil.concatenate(new String[]{"value"}, null);
        Assert.assertArrayEquals(exp, act);
    }

    public void test_concatenate_4() {
        String[] exp = new String[] {};
        String[] act = ArrayUtil.concatenate(new String[] {}, new String[]{});
        Assert.assertArrayEquals(exp, act);
    }

    public void test_concatenate_5() {
        String[] exp = new String[] {"value1", "value2"};
        String[] act = ArrayUtil.concatenate(new String[]{"value1"}, new String[]{"value2"});
        Assert.assertArrayEquals(exp, act);
    }

    public void test_contains_0() {
        assertFalse(ArrayUtil.contains(null, "value"));
    }

    public void test_contains_1() {
        assertFalse(ArrayUtil.contains(new String[] {"value"}, "notthevalue"));
    }

    public void test_contains_2() {
        assertFalse(ArrayUtil.contains(new String[] {"value"}, "Value"));
    }

    public void test_contains_4() {
        assertTrue(ArrayUtil.contains(new String[]{"value"}, "value"));
    }

    public void test_containsCaseInsensitive_0() {
        assertFalse(ArrayUtil.containsCaseInsensitive(null, "value"));
    }

    public void test_containsCaseInsensitive_1() {
        assertFalse(ArrayUtil.containsCaseInsensitive(new String[]{"value"}, "notthevalue"));
    }

    public void test_containsCaseInsensitive_2() {
        assertTrue(ArrayUtil.containsCaseInsensitive(new String[]{"value"}, "Value"));
    }

    public void test_containsCaseInsensitive_4() {
        assertTrue(ArrayUtil.containsCaseInsensitive(new String[] {"value"}, "value"));
    }

    public void test_join_0() {
        assertEquals(null, ArrayUtil.join((String[])null, "-"));
    }

    public void test_join_1() {
        assertEquals("", ArrayUtil.join(new String[] {}, "-"));
    }

    public void test_join_2() {
        assertEquals("value", ArrayUtil.join(new String[] {"value"}, "-"));
    }

    public void test_join_3() {
        assertEquals("value1-value2", ArrayUtil.join(new String[] {"value1", "value2"}, "-"));
    }

}

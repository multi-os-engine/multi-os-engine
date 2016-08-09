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

package objc.tests;

import mac.coregraphics.struct.CGRect;
import org.junit.Assert;

public abstract class NatJTest {

    static {
        // TODO: this is a workaround for compile issues produced by the need of static linking STL on Windows
        if (!System.getProperty("os.name").startsWith("Windows")) {
            System.loadLibrary("natj");
        }
        System.loadLibrary("TestClassesObjC");
    }

    protected static final void assertArrayEquals(boolean[] expecteds, boolean[] actuals) {
        Assert.assertEquals("arrays don't have the same length", expecteds.length, actuals.length);
        for (int idx = 0; idx < expecteds.length; ++idx) {
            Assert.assertEquals("values compare failed", expecteds[idx], actuals[idx]);
        }
    }

    protected static final void assertArrayEquals(CGRect[] expecteds, CGRect[] actuals) {
        Assert.assertEquals("arrays don't have the same length", expecteds.length, actuals.length);
        for (int idx = 0; idx < expecteds.length; ++idx) {
            assertEquals("values compare failed", expecteds[idx], actuals[idx]);
        }
    }

    protected static final void assertArrayEquals(Object[] expecteds, Object[] actuals) {
        Assert.assertArrayEquals(expecteds, actuals);
    }

    protected static void assertEquals(CGRect expected, CGRect actual) {
        assertEquals(null, expected, actual);
    }

    protected static void assertEquals(String message, CGRect expected, CGRect actual) {
        Assert.assertEquals("CGRect.o.x compare failed", expected.origin().x(), actual.origin().x(), 0.0f);
        Assert.assertEquals("CGRect.o.y compare failed", expected.origin().y(), actual.origin().y(), 0.0f);
        Assert.assertEquals("CGRect.s.w compare failed", expected.size().width(), actual.size().width(), 0.0f);
        Assert.assertEquals("CGRect.s.h compare failed", expected.size().height(), actual.size().height(), 0.0f);
    }
}

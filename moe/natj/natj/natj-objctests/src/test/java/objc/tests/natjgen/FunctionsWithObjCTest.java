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

import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import mac.NSObject;
import mac.foundation.NSNumber;
import mac.foundation.NSString;
import org.junit.Assert;
import org.junit.Test;

import static objc.binding.c.Globals.*;

public class FunctionsWithObjCTest {

    private static final int COUNT = 10;

    @Test
    public void testId() {
        Object obj = NGIdCreate();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof Object);

        Object obj2 = NGIdPass(obj);
        Assert.assertSame(obj, obj2);
    }

    @Test
    public void testIdPtr() {
        Ptr<ObjCObject> objs = NGIdArrayCreate(COUNT);

        for (int i = 0; i < COUNT; ++i) {
            Object obj = NGIdCreate();
            NGIdSetAtIndex(objs, i, obj);
            Assert.assertSame(obj, NGIdGetAtIndex(objs, i));
        }

        NGIdArrayFree(objs, COUNT);
    }

    @Test
    public void testObject() {
        NSObject obj = NGObjectCreate();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof NSObject);

        NSObject obj2 = NGObjectPass(obj);
        Assert.assertSame(obj, obj2);
    }

    @Test
    public void testPtr() {
        Ptr<NSObject> objs = NGObjectArrayCreate(COUNT);

        for (int i = 0; i < COUNT; ++i) {
            NSObject obj = NGObjectCreate();
            NGObjectSetAtIndex(objs, i, obj);
            Assert.assertSame(obj, NGObjectGetAtIndex(objs, i));
        }

        NGObjectArrayFree(objs, COUNT);
    }

    @Test
    public void testString() {
        String obj = NGStringCreate();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof String);

        String obj2 = NGStringPass(obj);
        Assert.assertEquals(obj, obj2);
    }

    @Test
    public void testStringPtr() {
        Ptr<NSString> objs = NGStringArrayCreate(COUNT);

        for (int i = 0; i < COUNT; ++i) {
            String obj = NGStringCreate();
            NGStringSetAtIndex(objs, i, obj);
            Assert.assertEquals(obj, NGStringGetAtIndex(objs, i));
        }

        NGStringArrayFree(objs, COUNT);
    }

    @Test
    public void testNumber() {
        NSNumber obj = NGNumberCreate();
        Assert.assertNotNull(obj);
        Assert.assertTrue(obj instanceof NSNumber);

        NSNumber obj2 = NGNumberPass(obj);
        Assert.assertSame(obj, obj2);
    }

    @Test
    public void testNumberPtr() {
        Ptr<NSNumber> objs = NGNumberArrayCreate(COUNT);

        for (int i = 0; i < COUNT; ++i) {
            NSNumber obj = NGNumberCreate();
            NGNumberSetAtIndex(objs, i, obj);
            Assert.assertSame(obj, NGNumberGetAtIndex(objs, i));
        }

        NGNumberArrayFree(objs, COUNT);
    }
}

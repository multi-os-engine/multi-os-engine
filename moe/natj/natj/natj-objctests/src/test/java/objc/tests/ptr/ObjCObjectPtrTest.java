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

package objc.tests.ptr;

import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import mac.foundation.NSError;
import mac.foundation.NSNumber;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ObjCObjectPtrTest {

    private static ObjectPtrClass test;

    @BeforeClass
    public static void createTestObject() {
        test = ObjectPtrClass.alloc().init();
    }

    @Test
    public void testPtrArgWithOneElement() {
        Ptr<NSError> one = PtrFactory.newObjectReference(NSError.class);
        test.fillWithOneElement(one);
        NSError err = one.get();

        Assert.assertNotNull(err);
        Assert.assertEquals(err.domain(), "test1");
        Assert.assertEquals(err.code(), 123L);
    }

    @Test
    public void testPtrArgWithThreeElement() {
        Ptr<NSNumber> one = PtrFactory.newObjectPtr(NSNumber.class, 3, true, false);
        test.fillWithThreeElements(one);

        double arr[] = {66.77, 77.88, 88.99};

        for (int i = 0; i < 3; i++) {
            NSNumber num = one.get(i);

            Assert.assertNotNull(num);
            Assert.assertEquals(num.doubleValue(), arr[i], 0.0);
        }
    }

    @Test
    public void testPtrArgWithOneAndThreeElements() {
        Ptr<NSError> one = PtrFactory.newObjectReference(NSError.class);
        Ptr<NSNumber> two = PtrFactory.newObjectPtr(NSNumber.class, 3, true, false);
        test.fillWithOneElementAndWithThreeElements(one, two);

        {
            NSError err = one.get();

            Assert.assertNotNull(err);
            Assert.assertEquals(err.domain(), "test2");
            Assert.assertEquals(err.code(), 456L);
        }

        {
            double arr[] = {11.22, 22.33, 33.44};

            for (int i = 0; i < 3; i++) {
                NSNumber num = two.get(i);

                Assert.assertNotNull(num);
                Assert.assertEquals(num.doubleValue(), arr[i], 0.0);
            }
        }
    }

    @Test
    public void testPtrArgReplacing1() {
        Ptr<NSError> one = PtrFactory.newObjectReference(NSError.class);
        NSError oldErr = NSError.errorWithDomainCodeUserInfo("domain", 100, null);
        one.set(oldErr);
        test.fillWithOneElement(one);
        NSError err = one.get();

        Assert.assertNotSame(err, oldErr);
    }

    @Test
    public void testPtrArgReplacing2() {
        Ptr<NSError> one = PtrFactory.newObjectReference(NSError.class);
        NSError oldErr = NSError.errorWithDomainCodeUserInfo("domain", 100, null);
        one.set(oldErr);
        test.fillWithOneElement2(one);
        NSError err = one.get();

        Assert.assertNotSame(err, oldErr);
    }
}

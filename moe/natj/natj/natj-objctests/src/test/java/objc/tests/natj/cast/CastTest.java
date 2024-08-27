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

package objc.tests.natj.cast;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCRuntime;
import apple.corefoundation.c.CoreFoundation;
import apple.corefoundation.enums.CFStringBuiltInEncodings;
import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.struct.CFRange;
import apple.foundation.NSArray;
import apple.foundation.NSString;
import objc.binding.CustomizableDefaultClass;
import org.junit.Assert;
import org.junit.Test;

public class CastTest {

    @Test
    public void testCastIntegrityFromObjCObject() {
        NSString obj = NSString.stringWithString("str");

        CFStringRef optr = ObjCRuntime.cast(obj, CFStringRef.class);
        Assert.assertEquals(obj.getPeerPointer(), optr.getPeer().getPeer());
        Assert.assertSame(obj, ObjCRuntime.cast(optr, NSString.class));

        VoidPtr vptr = CRuntime.cast(optr);
        Assert.assertEquals(optr.getPeer().getPeer(), vptr.getPeer().getPeer());
        Assert.assertEquals(obj.getPeerPointer(), vptr.getPeer().getPeer());
        Assert.assertEquals(optr.getPeer().getPeer(), CRuntime.cast(vptr, CFStringRef.class).getPeer().getPeer());

        // Sanity test
        Assert.assertEquals(3, obj.length());
    }

    @Test
    public void testCastIntegrityFromOpaquePtr() {
        CFStringRef optr = CoreFoundation.CFStringCreateWithCString(null, "str", CFStringBuiltInEncodings.ASCII);

        NSString obj = ObjCRuntime.cast(optr, NSString.class);
        Assert.assertEquals(obj.getPeerPointer(), optr.getPeer().getPeer());
        Assert.assertSame(obj, ObjCRuntime.cast(optr, NSString.class));

        VoidPtr vptr = CRuntime.cast(optr);
        Assert.assertEquals(optr.getPeer().getPeer(), vptr.getPeer().getPeer());
        Assert.assertEquals(obj.getPeerPointer(), vptr.getPeer().getPeer());
        Assert.assertEquals(optr.getPeer().getPeer(), CRuntime.cast(vptr, CFStringRef.class).getPeer().getPeer());

        // Sanity test
        Assert.assertEquals(3, obj.length());
    }

    @Test
    public void testCastIntegrityFromVoidPtr() {
        NSArray base = NSString.stringWithString("str.str").componentsSeparatedByString(".");
        CFArrayRef baseRef = ObjCRuntime.cast(base, CFArrayRef.class);
        Assert.assertSame(base, ObjCRuntime.cast(baseRef, NSArray.class));

        @SuppressWarnings("unchecked")
        Ptr<ConstVoidPtr> list = (Ptr<ConstVoidPtr>) PtrFactory.newPointerPtr(Void.class, 2, 1, true, false);
        CoreFoundation.CFArrayGetValues(baseRef, new CFRange(0, 1), list);

        ConstVoidPtr vptr = list.get(0);

        CFStringRef optr = CRuntime.cast(vptr, CFStringRef.class);
        Assert.assertEquals(vptr.getPeer().getPeer(), optr.getPeer().getPeer());

        NSString obj = ObjCRuntime.cast(optr, NSString.class);
        Assert.assertEquals(obj.getPeerPointer(), optr.getPeer().getPeer());
        Assert.assertSame(obj, ObjCRuntime.cast(optr, NSString.class));

        // Sanity test
        Assert.assertEquals(3, obj.length());
    }

    @Test
    public void testCastDynamicObjCObjectToObjcObject() {
        {
            CustomizableDefaultClass cdf = CustomizableDefaultClass.alloc().init();
            Assert.assertNull(cdf.text());
        }

        {
            final CustomizableDefaultClass transparentDefaults = ObjCRuntime.cast(CustomizableDefaultClass.classDefaults(), CustomizableDefaultClass.class, true);
            final CustomizableDefaultClass nonTransparentDefaults = ObjCRuntime.cast(CustomizableDefaultClass.classDefaults(), CustomizableDefaultClass.class, false);
            transparentDefaults.setText("Hello World");
            Assert.assertTrue(CustomizableDefaultClass.checkTransparentDefaultsObjectAndNonTransparentDefaultsObject(transparentDefaults, nonTransparentDefaults));
        }

        {
            CustomizableDefaultClass cdf = CustomizableDefaultClass.alloc().init();
            Assert.assertEquals("Hello World", cdf.text());
        }
    }

}

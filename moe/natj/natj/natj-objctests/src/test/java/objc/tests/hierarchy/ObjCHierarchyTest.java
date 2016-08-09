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

package objc.tests.hierarchy;

import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCException;
import org.moe.natj.objc.SEL;
import mac.foundation.NSException;
import mac.foundation.NSInvocation;
import mac.foundation.NSMethodSignature;
import mac.foundation.c.Foundation;
import objc.binding.CustomClassA;
import objc.binding.ObjCUtility;
import org.junit.Assert;
import org.junit.Test;

public class ObjCHierarchyTest {
    @Test
    public void test_testUnimplementedOptionalMethodInvoke() {
        ObjCException noSel = null;
        try {
            ObjCUtility.dontImplementThis();
        } catch (ObjCException ex) {
            noSel = ex;
        }

        Assert.assertNotNull(noSel);
        Assert.assertTrue(noSel.getNativeException() instanceof NSException);
        Assert.assertEquals(((NSException) noSel.getNativeException()).name(), Foundation.NSInvalidArgumentException());
    }

    @Test
    public void test_ObjCBasedJavaClass_javainvoke() {
        A obj = A.alloc().init();

        Assert.assertEquals(obj.javaMethod(), 0xF413);
        Assert.assertEquals(obj.javaMethodWithSelector(), 0xF856);
    }

    @Test
    public void test_ObjCBasedJavaClass_nsinvocation() {
        A obj = A.alloc().init();
        SEL selector = new SEL("javaMethodWithSelector");
        NSMethodSignature ms = obj.methodSignatureForSelector(selector);
        NSInvocation inv = NSInvocation.invocationWithMethodSignature(ms);
        inv.setSelector(selector);
        inv.invokeWithTarget(obj);

        BytePtr ret_ptr = PtrFactory.newByteArray((int) ms.methodReturnLength());
        inv.getReturnValue(ret_ptr);
        Assert.assertEquals(ret_ptr.getIntPtr().getValue(), 0xF856);
    }

    @Test
    public void test_java_call_stringOne() {
        B obj = B.alloc().init();
        obj.setStringOne("test");
        Assert.assertEquals("test_A_B", obj.stringOne());
    }

    @Test
    public void test_java_call_stringTwo() {
        B obj = B.alloc().init();
        obj.setStringTwo("test");
        Assert.assertEquals("test_A", obj.stringTwo());
    }

    @Test
    public void test_java_call_stringThree() {
        B obj = B.alloc().init();
        obj.setStringThree("test");
        Assert.assertEquals("test_B", obj.stringThree());
    }

    @Test
    public void test_java_call_stringFour() {
        B obj = B.alloc().init();
        obj.setStringFour("test");
        Assert.assertEquals("test", obj.stringFour());
    }

    @Test
    public void test_objc_call_stringOne() {
        B obj = B.alloc().init();
        obj.setStringOne("test");
        Assert.assertEquals("test_A_B", CustomClassA.getStringOne(obj));
    }

    @Test
    public void test_objc_call_stringTwo() {
        B obj = B.alloc().init();
        obj.setStringTwo("test");
        Assert.assertEquals("test_A", CustomClassA.getStringTwo(obj));
    }

    @Test
    public void test_objc_call_stringThree() {
        B obj = B.alloc().init();
        obj.setStringThree("test");
        Assert.assertEquals("test_B", CustomClassA.getStringThree(obj));
    }

    @Test
    public void test_objc_call_stringFour() {
        B obj = B.alloc().init();
        obj.setStringFour("test");
        Assert.assertEquals("test", CustomClassA.getStringFour(obj));
    }

    @Test
    public void test_java_call_inherited_static() {
        Assert.assertEquals(InheritedA.object_1, InheritedA.static_getObject1());
    }

    @Test
    public void test_java_call_inherited() {
        InheritedA obj = InheritedA.alloc().init();
        Assert.assertEquals(InheritedA.object_1, obj.getObject1());
    }

    @Test
    public void test_objc_call_inherited_static() {
        Object obj = InheritedA.object_1;
        Assert.assertEquals(
                obj,
                ObjCUtility.objectReturnFromClassSelector(
                        InheritedA.class.getName(), new SEL("getObject1")));
    }

    @Test
    public void test_obj_call_inherited() {
        InheritedA obj = InheritedA.alloc().init();
        Assert.assertEquals(InheritedA.object_1, ObjCUtility
                .objectReturnFromObjectSelector(obj, new SEL("getObject1")));
    }
}

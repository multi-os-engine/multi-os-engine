/*
Copyright (C) 2017 Migeran

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

import apple.NSObject;
import objc.binding.CustomBindingClassName;
import org.junit.Assert;
import org.junit.Test;
import org.moe.natj.objc.Class;

import static objc.util.GlobalsAdditions.class_getName;

public class CustomBindingClassNameTest {

    @Test
    public void test_runtimeSupport() {
        CustomBindingClassName obj = CustomBindingClassName.alloc().init();
        Assert.assertEquals("MyValue", obj.string());
    }

    @Test
    public void test_getObjCClass() {
        final Class objcClass = Class.fromJavaClass(CustomBindingClassName.class);
        Assert.assertEquals("MyCustomBindingClassName", class_getName(objcClass));
    }

    @Test
    public void test_getObjCClassName() {
        Assert.assertEquals("MyCustomBindingClassName", Class.getObjCClassName(CustomBindingClassName.class));
        Assert.assertEquals("NSObject", Class.getObjCClassName(NSObject.class));
    }
}

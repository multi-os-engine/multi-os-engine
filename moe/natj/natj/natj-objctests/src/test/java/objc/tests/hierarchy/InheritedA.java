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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

public class InheritedA extends NSObject {
    static {
        NatJ.register();
    }

    @Generated("NatJ")
    @Selector("alloc")
    public static native InheritedA alloc();

    @Selector("init")
    public native InheritedA init();

    @Generated("NatJ")
    protected InheritedA(Pointer peer) {
        super(peer);
    }

    public static final Object object_1 = new Object();

    @Selector("getObject1")
    public static Object static_getObject1() {
        return object_1;
    }

    @Selector("getObject1")
    public Object getObject1() {
        return object_1;
    }
}

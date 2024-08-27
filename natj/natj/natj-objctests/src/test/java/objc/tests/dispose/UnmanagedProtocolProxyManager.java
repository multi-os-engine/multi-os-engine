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

package objc.tests.dispose;

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class UnmanagedProtocolProxyManager extends NSObject {

    protected UnmanagedProtocolProxyManager(Pointer peer) {
        super(peer);
    }

    @Selector("instanceCount")
    @NUInt
    public static native long instanceCount();

    @Selector("unmanagedProtocolProxy")
    public static native UnmanagedProtocolProxy unmanagedProtocolProxy();

    @Owned
    @Selector("createUnmanagedProtocolProxy")
    public static native UnmanagedProtocolProxy createUnmanagedProtocolProxy();

    @Runtime(ObjCRuntime.class)
    @ObjCProtocolName("UnmanagedProtocolProxy")
    public interface UnmanagedProtocolProxy {

        @Selector("add::")
        int add(int a, int b);

    }

}

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

package mac.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.objc.ann.ObjCBlock;
import mac.NSObject;

@Generated
@Runtime(CRuntime.class)
public final class Globals {
    static {
        NatJ.register();
    }

    /**
     * dispatch_release</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Performance/Reference/GCD_libdispatch_Ref/index.html#//apple_ref/c/func/dispatch_release">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void dispatch_release(
            NSObject object);

    /**
     * dispatch_queue_create</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Performance/Reference/GCD_libdispatch_Ref/index.html#//apple_ref/c/func/dispatch_queue_create">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native NSObject dispatch_queue_create(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String label,
            NSObject attr);

    /**
     * dispatch_group_create</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Performance/Reference/GCD_libdispatch_Ref/index.html#//apple_ref/c/func/dispatch_group_create">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native NSObject dispatch_group_create();

    /**
     * dispatch_group_async</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Performance/Reference/GCD_libdispatch_Ref/index.html#//apple_ref/c/func/dispatch_group_async">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void dispatch_group_async(
            NSObject group,
            NSObject queue,
            @ObjCBlock(name = "call_dispatch_group_async") Block_dispatch_group_async block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_dispatch_group_async {
        @Generated
        void call_dispatch_group_async();
    }

    /**
     * dispatch_group_wait</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Performance/Reference/GCD_libdispatch_Ref/index.html#//apple_ref/c/func/dispatch_group_wait">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NInt
    public static native long dispatch_group_wait(
            NSObject group, long timeout);
}

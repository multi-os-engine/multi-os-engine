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

package objc.binding;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class ObjCExceptionClass extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ObjCExceptionClass(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ObjCExceptionClass alloc();

    @Generated
    @Selector("expectExceptionWithMessage:withBlock:")
    public static native void expectExceptionWithMessageWithBlock(
            String message,
            @ObjCBlock(name = "call_expectExceptionWithMessageWithBlock") Block_expectExceptionWithMessageWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expectExceptionWithMessageWithBlock {
        @Generated
        void call_expectExceptionWithMessageWithBlock(String arg0);
    }

    @Generated
    @Selector("init")
    public native ObjCExceptionClass init();

    @Generated
    @Selector("throwExceptionWithMessage:")
    public static native void throwExceptionWithMessage(String message);
}

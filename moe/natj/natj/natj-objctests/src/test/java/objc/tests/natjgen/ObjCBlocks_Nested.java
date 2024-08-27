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


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ObjCBlocks_Nested extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ObjCBlocks_Nested(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ObjCBlocks_Nested alloc();

    @Generated
    @Selector("init")
    public native ObjCBlocks_Nested init();

    @Selector("getBlockCallerBlock:")
    @ObjCBlock(name = "call_getBlockCallerBlock")
    public static native Block_getBlockCallerBlock getBlockCallerBlock(int expected);

    @Selector("performBlockCallerBlock:expected:")
    public static native int performBlockCallerBlock(@ObjCBlock(name = "call_getBlockCallerBlock_inner") Block_getBlockCallerBlock_inner block, int expected);

    @Runtime(ObjCRuntime.class)
    static public interface Block_getBlockCallerBlock {
        public int call_getBlockCallerBlock(@ObjCBlock(name = "call_getBlockCallerBlock_inner") Block_getBlockCallerBlock_inner block);
    }

    @Runtime(ObjCRuntime.class)
    static public interface Block_getBlockCallerBlock_inner {
        public int call_getBlockCallerBlock_inner(@ObjCBlock(name = "call_getBlockCallerBlock_inner_inner") Block_getBlockCallerBlock_inner_inner block);
    }

    @Runtime(ObjCRuntime.class)
    static public interface Block_getBlockCallerBlock_inner_inner {
        public int call_getBlockCallerBlock_inner_inner();
    }
}

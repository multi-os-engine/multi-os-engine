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

package mac.foundation;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSDictionary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSDictionary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjectsUsingBlock(
            @ObjCBlock(name = "call_enumerateKeysAndObjectsUsingBlock") Block_enumerateKeysAndObjectsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    static public interface Block_enumerateKeysAndObjectsUsingBlock {
        @Generated
        public void call_enumerateKeysAndObjectsUsingBlock(
                @Mapped(ObjCObjectMapper.class) Object arg0,
                @Mapped(ObjCObjectMapper.class) Object arg1, BoolPtr arg2);
    }

    @Generated
    @Selector("init")
    public native NSDictionary init();
}

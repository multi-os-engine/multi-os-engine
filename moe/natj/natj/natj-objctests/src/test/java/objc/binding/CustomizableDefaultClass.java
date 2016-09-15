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

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import objc.binding.protocol.DefaultClassAttributes;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class CustomizableDefaultClass extends NSObject implements DefaultClassAttributes {
    protected CustomizableDefaultClass(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native CustomizableDefaultClass alloc();

    @Selector("init")
    public native CustomizableDefaultClass init();

    @Selector("classDefaults")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object classDefaults();

    @ProtocolClassMethod("classDefaults")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _classDefaults() {
        return classDefaults();
    }

    @Selector("text")
    public native String text();

    @Selector("setText:")
    public native void setText(String var1);

    @Selector("checkTransparentDefaultsObject:andNonTransparentDefaultsObject:")
    public static native boolean checkTransparentDefaultsObjectAndNonTransparentDefaultsObject(CustomizableDefaultClass transparent, CustomizableDefaultClass nonTransparent);
}

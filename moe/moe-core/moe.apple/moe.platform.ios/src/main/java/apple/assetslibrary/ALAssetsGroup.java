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

package apple.assetslibrary;

import apple.NSObject;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("AssetsLibrary")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ALAssetsGroup extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ALAssetsGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ALAssetsGroup alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("addAsset:")
    public native boolean addAsset(ALAsset asset);

    @Generated
    @Deprecated
    @Selector("enumerateAssetsAtIndexes:options:usingBlock:")
    public native void enumerateAssetsAtIndexesOptionsUsingBlock(NSIndexSet indexSet, @NUInt long options,
            @ObjCBlock(name = "call_enumerateAssetsAtIndexesOptionsUsingBlock") Block_enumerateAssetsAtIndexesOptionsUsingBlock enumerationBlock);

    @Generated
    @Deprecated
    @Selector("enumerateAssetsUsingBlock:")
    public native void enumerateAssetsUsingBlock(
            @ObjCBlock(name = "call_enumerateAssetsUsingBlock") Block_enumerateAssetsUsingBlock enumerationBlock);

    @Generated
    @Deprecated
    @Selector("enumerateAssetsWithOptions:usingBlock:")
    public native void enumerateAssetsWithOptionsUsingBlock(@NUInt long options,
            @ObjCBlock(name = "call_enumerateAssetsWithOptionsUsingBlock") Block_enumerateAssetsWithOptionsUsingBlock enumerationBlock);

    @Generated
    @Selector("init")
    public native ALAssetsGroup init();

    @Generated
    @Deprecated
    @Selector("isEditable")
    public native boolean isEditable();

    @Generated
    @Deprecated
    @Selector("numberOfAssets")
    @NInt
    public native long numberOfAssets();

    @Generated
    @Deprecated
    @Selector("posterImage")
    public native CGImageRef posterImage();

    @Generated
    @Deprecated
    @Selector("setAssetsFilter:")
    public native void setAssetsFilter(ALAssetsFilter filter);

    @Generated
    @Deprecated
    @Selector("valueForProperty:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object valueForProperty(String property);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsAtIndexesOptionsUsingBlock {
        @Generated
        void call_enumerateAssetsAtIndexesOptionsUsingBlock(ALAsset arg0, @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsUsingBlock {
        @Generated
        void call_enumerateAssetsUsingBlock(ALAsset arg0, @NUInt long arg1, BoolPtr arg2);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateAssetsWithOptionsUsingBlock {
        @Generated
        void call_enumerateAssetsWithOptionsUsingBlock(ALAsset arg0, @NUInt long arg1, BoolPtr arg2);
    }
}

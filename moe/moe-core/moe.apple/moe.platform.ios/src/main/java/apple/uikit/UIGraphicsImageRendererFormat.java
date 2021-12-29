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

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIGraphicsImageRendererFormat extends UIGraphicsRendererFormat {
    static {
        NatJ.register();
    }

    @Generated
    protected UIGraphicsImageRendererFormat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGraphicsImageRendererFormat alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIGraphicsImageRendererFormat allocWithZone(VoidPtr zone);

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
    @Selector("defaultFormat")
    public static native UIGraphicsImageRendererFormat defaultFormat();

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
    public static native UIGraphicsImageRendererFormat new_objc();

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
    @Selector("init")
    public native UIGraphicsImageRendererFormat init();

    /**
     * indicates the bitmap context will draw fully opaque. The preferredFormat sets this to NO.
     */
    @Generated
    @Selector("opaque")
    public native boolean opaque();

    /**
     * indicates the bitmap context should draw into a context capable of rendering extended color images. The preferredFormat sets this according to the main screen's current configuration.
     */
    @Generated
    @Selector("prefersExtendedRange")
    public native boolean prefersExtendedRange();

    /**
     * display scale of the context. The preferredFormat uses the scale most appropriate for the main screen's current configuration.
     */
    @Generated
    @Selector("scale")
    @NFloat
    public native double scale();

    /**
     * indicates the bitmap context will draw fully opaque. The preferredFormat sets this to NO.
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * indicates the bitmap context should draw into a context capable of rendering extended color images. The preferredFormat sets this according to the main screen's current configuration.
     */
    @Generated
    @Selector("setPrefersExtendedRange:")
    public native void setPrefersExtendedRange(boolean value);

    /**
     * display scale of the context. The preferredFormat uses the scale most appropriate for the main screen's current configuration.
     */
    @Generated
    @Selector("setScale:")
    public native void setScale(@NFloat double value);

    /**
     * Returns a format optimized for the specified trait collection, taking into account properties such as displayScale and displayGamut.
     * Traits that are not specified will be ignored, with their corresponding format properties defaulting to the values in preferredFormat.
     */
    @Generated
    @Selector("formatForTraitCollection:")
    public static native UIGraphicsImageRendererFormat formatForTraitCollection(UITraitCollection traitCollection);

    @Generated
    @Selector("preferredFormat")
    public static native UIGraphicsImageRendererFormat preferredFormat();

    @Generated
    @Selector("preferredRange")
    @NInt
    public native long preferredRange();

    @Generated
    @Selector("setPreferredRange:")
    public native void setPreferredRange(@NInt long value);
}

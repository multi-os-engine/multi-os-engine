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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * UIVibrancyEffect amplifies and adjusts the color of content layered behind the view, allowing content placed inside
 * the contentView to become more vivid. It is intended to be placed over, or as a subview of, a UIVisualEffectView that
 * has been configured with a UIBlurEffect. This effect only affects content added to the contentView. Because the
 * vibrancy effect is color dependent, subviews added to the contentView need to be tintColorDidChange aware and must be
 * prepared to update themselves accordingly. UIImageView will need its image to have a rendering mode of
 * UIImageRenderingModeAlwaysTemplate to receive the proper effect.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIVibrancyEffect extends UIVisualEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected UIVibrancyEffect(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIVibrancyEffect alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIVibrancyEffect allocWithZone(VoidPtr zone);

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
    @Selector("effectForBlurEffect:")
    public static native UIVibrancyEffect effectForBlurEffect(UIBlurEffect blurEffect);

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
    public static native UIVibrancyEffect new_objc();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("notificationCenterVibrancyEffect")
    public static native UIVibrancyEffect notificationCenterVibrancyEffect();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * For use with select supporting text and glyphs.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("widgetPrimaryVibrancyEffect")
    public static native UIVibrancyEffect widgetPrimaryVibrancyEffect();

    /**
     * For use with select supporting text and glyphs where further diminution is required.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("widgetSecondaryVibrancyEffect")
    public static native UIVibrancyEffect widgetSecondaryVibrancyEffect();

    @Generated
    @Selector("init")
    public native UIVibrancyEffect init();

    @Generated
    @Selector("initWithCoder:")
    public native UIVibrancyEffect initWithCoder(NSCoder coder);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("effectForBlurEffect:style:")
    public static native UIVibrancyEffect effectForBlurEffectStyle(UIBlurEffect blurEffect, @NInt long style);

    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: Use WidgetKit instead. Today View extensions have been deprecated.
     */
    @Deprecated
    @Generated
    @Selector("widgetEffectForVibrancyStyle:")
    public static native UIVibrancyEffect widgetEffectForVibrancyStyle(@NInt long vibrancyStyle);
}

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

package apple.quartzcore;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.scenekit.SCNAnimation;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Subclass for property-based animations. *
 * 
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAPropertyAnimation extends CAAnimation {
    static {
        NatJ.register();
    }

    @Generated
    protected CAPropertyAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAPropertyAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAPropertyAnimation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animation")
    public static native CAPropertyAnimation animation();

    /**
     * Creates a new animation object with its `keyPath' property set to
     * 'path'.
     */
    @Generated
    @Selector("animationWithKeyPath:")
    public static native CAPropertyAnimation animationWithKeyPath(@Nullable String path);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Nullable
    @Generated
    @Selector("defaultValueForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object defaultValueForKey(@NotNull String key);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CAPropertyAnimation new_objc();

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
    public native CAPropertyAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native CAPropertyAnimation initWithCoder(@NotNull NSCoder coder);

    /**
     * When true the value specified by the animation will be "added" to
     * the current presentation value of the property to produce the new
     * presentation value. The addition function is type-dependent, e.g.
     * for affine transforms the two matrices are concatenated. Defaults to
     * NO.
     */
    @Generated
    @Selector("isAdditive")
    public native boolean isAdditive();

    /**
     * When true the value specified by the animation will be "added" to
     * the current presentation value of the property to produce the new
     * presentation value. The addition function is type-dependent, e.g.
     * for affine transforms the two matrices are concatenated. Defaults to
     * NO.
     */
    @Generated
    @Selector("setAdditive:")
    public native void setAdditive(boolean value);

    /**
     * The `cumulative' property affects how repeating animations produce
     * their result. If true then the current value of the animation is the
     * value at the end of the previous repeat cycle, plus the value of the
     * current repeat cycle. If false, the value is simply the value
     * calculated for the current repeat cycle. Defaults to NO.
     */
    @Generated
    @Selector("isCumulative")
    public native boolean isCumulative();

    /**
     * The `cumulative' property affects how repeating animations produce
     * their result. If true then the current value of the animation is the
     * value at the end of the previous repeat cycle, plus the value of the
     * current repeat cycle. If false, the value is simply the value
     * calculated for the current repeat cycle. Defaults to NO.
     */
    @Generated
    @Selector("setCumulative:")
    public native void setCumulative(boolean value);

    /**
     * The key-path describing the property to be animated.
     */
    @Nullable
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    /**
     * The key-path describing the property to be animated.
     */
    @Generated
    @Selector("setKeyPath:")
    public native void setKeyPath(@Nullable String value);

    /**
     * If non-nil a function that is applied to interpolated values
     * before they are set as the new presentation value of the animation's
     * target property. Defaults to nil.
     */
    @Generated
    @Selector("setValueFunction:")
    public native void setValueFunction(@Nullable CAValueFunction value);

    /**
     * If non-nil a function that is applied to interpolated values
     * before they are set as the new presentation value of the animation's
     * target property. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("valueFunction")
    public native CAValueFunction valueFunction();

    @NotNull
    @Generated
    @Selector("animationWithSCNAnimation:")
    public static native CAAnimation animationWithSCNAnimation(@NotNull SCNAnimation animation);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

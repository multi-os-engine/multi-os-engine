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
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * General keyframe animation class. *
 * 
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAKeyframeAnimation extends CAPropertyAnimation {
    static {
        NatJ.register();
    }

    @Generated
    protected CAKeyframeAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAKeyframeAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAKeyframeAnimation allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animation")
    public static native CAKeyframeAnimation animation();

    @Generated
    @Selector("animationWithKeyPath:")
    public static native CAKeyframeAnimation animationWithKeyPath(@Nullable String path);

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
    public static native CAKeyframeAnimation new_objc();

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

    @Nullable
    @Generated
    @Selector("biasValues")
    public native NSArray<? extends NSNumber> biasValues();

    /**
     * The "calculation mode". Possible values are `discrete', `linear',
     * `paced', `cubic' and `cubicPaced'. Defaults to `linear'. When set to
     * `paced' or `cubicPaced' the `keyTimes' and `timingFunctions'
     * properties of the animation are ignored and calculated implicitly.
     */
    @NotNull
    @Generated
    @Selector("calculationMode")
    public native String calculationMode();

    @Nullable
    @Generated
    @Selector("continuityValues")
    public native NSArray<? extends NSNumber> continuityValues();

    @Generated
    @Selector("init")
    public native CAKeyframeAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native CAKeyframeAnimation initWithCoder(@NotNull NSCoder coder);

    /**
     * An optional array of `NSNumber' objects defining the pacing of the
     * animation. Each time corresponds to one value in the `values' array,
     * and defines when the value should be used in the animation function.
     * Each value in the array is a floating point number in the range
     * [0,1].
     */
    @Nullable
    @Generated
    @Selector("keyTimes")
    public native NSArray<? extends NSNumber> keyTimes();

    /**
     * An optional path object defining the behavior of the animation
     * function. When non-nil overrides the `values' property. Each point
     * in the path except for `moveto' points defines a single keyframe for
     * the purpose of timing and interpolation. Defaults to nil. For
     * constant velocity animation along the path, `calculationMode' should
     * be set to `paced'. Upon assignment the path is copied.
     */
    @Nullable
    @Generated
    @Selector("path")
    public native CGPathRef path();

    /**
     * Defines whether or objects animating along paths rotate to match the
     * path tangent. Possible values are `auto' and `autoReverse'. Defaults
     * to nil. The effect of setting this property to a non-nil value when
     * no path object is supplied is undefined. `autoReverse' rotates to
     * match the tangent plus 180 degrees.
     */
    @Nullable
    @Generated
    @Selector("rotationMode")
    public native String rotationMode();

    @Generated
    @Selector("setBiasValues:")
    public native void setBiasValues(@Nullable NSArray<? extends NSNumber> value);

    /**
     * The "calculation mode". Possible values are `discrete', `linear',
     * `paced', `cubic' and `cubicPaced'. Defaults to `linear'. When set to
     * `paced' or `cubicPaced' the `keyTimes' and `timingFunctions'
     * properties of the animation are ignored and calculated implicitly.
     */
    @Generated
    @Selector("setCalculationMode:")
    public native void setCalculationMode(@NotNull String value);

    @Generated
    @Selector("setContinuityValues:")
    public native void setContinuityValues(@Nullable NSArray<? extends NSNumber> value);

    /**
     * An optional array of `NSNumber' objects defining the pacing of the
     * animation. Each time corresponds to one value in the `values' array,
     * and defines when the value should be used in the animation function.
     * Each value in the array is a floating point number in the range
     * [0,1].
     */
    @Generated
    @Selector("setKeyTimes:")
    public native void setKeyTimes(@Nullable NSArray<? extends NSNumber> value);

    /**
     * An optional path object defining the behavior of the animation
     * function. When non-nil overrides the `values' property. Each point
     * in the path except for `moveto' points defines a single keyframe for
     * the purpose of timing and interpolation. Defaults to nil. For
     * constant velocity animation along the path, `calculationMode' should
     * be set to `paced'. Upon assignment the path is copied.
     */
    @Generated
    @Selector("setPath:")
    public native void setPath(@Nullable CGPathRef value);

    /**
     * Defines whether or objects animating along paths rotate to match the
     * path tangent. Possible values are `auto' and `autoReverse'. Defaults
     * to nil. The effect of setting this property to a non-nil value when
     * no path object is supplied is undefined. `autoReverse' rotates to
     * match the tangent plus 180 degrees.
     */
    @Generated
    @Selector("setRotationMode:")
    public native void setRotationMode(@Nullable String value);

    /**
     * For animations with the cubic calculation modes, these properties
     * provide control over the interpolation scheme. Each keyframe may
     * have a tension, continuity and bias value associated with it, each
     * in the range [-1, 1] (this defines a Kochanek-Bartels spline, see
     * http://en.wikipedia.org/wiki/Kochanek-Bartels_spline).
     * 
     * The tension value controls the "tightness" of the curve (positive
     * values are tighter, negative values are rounder). The continuity
     * value controls how segments are joined (positive values give sharp
     * corners, negative values give inverted corners). The bias value
     * defines where the curve occurs (positive values move the curve before
     * the control point, negative values move it after the control point).
     * 
     * The first value in each array defines the behavior of the tangent to
     * the first control point, the second value controls the second
     * point's tangents, and so on. Any unspecified values default to zero
     * (giving a Catmull-Rom spline if all are unspecified).
     */
    @Generated
    @Selector("setTensionValues:")
    public native void setTensionValues(@Nullable NSArray<? extends NSNumber> value);

    /**
     * An optional array of CAMediaTimingFunction objects. If the `values' array
     * defines n keyframes, there should be n-1 objects in the
     * `timingFunctions' array. Each function describes the pacing of one
     * keyframe to keyframe segment.
     */
    @Generated
    @Selector("setTimingFunctions:")
    public native void setTimingFunctions(@Nullable NSArray<? extends CAMediaTimingFunction> value);

    /**
     * An array of objects providing the value of the animation function for
     * each keyframe.
     */
    @Generated
    @Selector("setValues:")
    public native void setValues(@Nullable NSArray<?> value);

    /**
     * For animations with the cubic calculation modes, these properties
     * provide control over the interpolation scheme. Each keyframe may
     * have a tension, continuity and bias value associated with it, each
     * in the range [-1, 1] (this defines a Kochanek-Bartels spline, see
     * http://en.wikipedia.org/wiki/Kochanek-Bartels_spline).
     * 
     * The tension value controls the "tightness" of the curve (positive
     * values are tighter, negative values are rounder). The continuity
     * value controls how segments are joined (positive values give sharp
     * corners, negative values give inverted corners). The bias value
     * defines where the curve occurs (positive values move the curve before
     * the control point, negative values move it after the control point).
     * 
     * The first value in each array defines the behavior of the tangent to
     * the first control point, the second value controls the second
     * point's tangents, and so on. Any unspecified values default to zero
     * (giving a Catmull-Rom spline if all are unspecified).
     */
    @Nullable
    @Generated
    @Selector("tensionValues")
    public native NSArray<? extends NSNumber> tensionValues();

    /**
     * An optional array of CAMediaTimingFunction objects. If the `values' array
     * defines n keyframes, there should be n-1 objects in the
     * `timingFunctions' array. Each function describes the pacing of one
     * keyframe to keyframe segment.
     */
    @Nullable
    @Generated
    @Selector("timingFunctions")
    public native NSArray<? extends CAMediaTimingFunction> timingFunctions();

    /**
     * An array of objects providing the value of the animation function for
     * each keyframe.
     */
    @Nullable
    @Generated
    @Selector("values")
    public native NSArray<?> values();

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

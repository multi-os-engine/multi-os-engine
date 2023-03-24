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
import apple.foundation.protocol.NSCopying;
import apple.uikit.protocol.UITimingCurveProvider;
import apple.uikit.protocol.UIViewImplicitlyAnimating;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIViewPropertyAnimator extends NSObject implements UIViewImplicitlyAnimating, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIViewPropertyAnimator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIViewPropertyAnimator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIViewPropertyAnimator allocWithZone(VoidPtr zone);

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
    public static native UIViewPropertyAnimator new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * This method provides compatibility with the old style [UIView
     * animationWithDuration:...] method. It is also useful for controlling
     * how animations options are inherited.
     * 
     * Creates a UIViewPropertyAnimator, sets the duration, options, etc. And starts the
     * animation with the associated animation and completion blocks. The animator
     * returned is interruptible only if it is not called from within the execution
     * block of another animation (animator or legacy). Note that if it is called
     * within the execution block of another animation it will inherit the duration
     * and other characteristics of that animation UNLESS the appropriate override
     * options have been specified. Also note that if is called within the execution
     * block of another propertyAnimator that is interruptible, the implicit
     * animations defined by this call will be tracked by the outer
     * propertyAnimator.
     */
    @NotNull
    @Generated
    @Selector("runningPropertyAnimatorWithDuration:delay:options:animations:completion:")
    public static native UIViewPropertyAnimator runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion(
            double duration, double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3") Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4") Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4 completion);

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
    @Selector("addAnimations:")
    public native void addAnimations(
            @NotNull @ObjCBlock(name = "call_addAnimations") UIViewImplicitlyAnimating.Block_addAnimations animation);

    @Generated
    @Selector("addAnimations:delayFactor:")
    public native void addAnimationsDelayFactor(
            @NotNull @ObjCBlock(name = "call_addAnimationsDelayFactor") UIViewImplicitlyAnimating.Block_addAnimationsDelayFactor animation,
            @NFloat double delayFactor);

    @Generated
    @Selector("addCompletion:")
    public native void addCompletion(
            @NotNull @ObjCBlock(name = "call_addCompletion") UIViewImplicitlyAnimating.Block_addCompletion completion);

    @Generated
    @Selector("continueAnimationWithTimingParameters:durationFactor:")
    public native void continueAnimationWithTimingParametersDurationFactor(
            @Nullable @Mapped(ObjCObjectMapper.class) UITimingCurveProvider parameters, @NFloat double durationFactor);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Defaults to 0. This property is set when calling -[UIView startAnimationAfterDelay:].
     */
    @Generated
    @Selector("delay")
    public native double delay();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("finishAnimationAtPosition:")
    public native void finishAnimationAtPosition(@NInt long finalPosition);

    @Generated
    @Selector("fractionComplete")
    @NFloat
    public native double fractionComplete();

    @Generated
    @Selector("init")
    public native UIViewPropertyAnimator init();

    @Generated
    @Selector("initWithDuration:controlPoint1:controlPoint2:animations:")
    public native UIViewPropertyAnimator initWithDurationControlPoint1ControlPoint2Animations(double duration,
            @ByValue CGPoint point1, @ByValue CGPoint point2,
            @Nullable @ObjCBlock(name = "call_initWithDurationControlPoint1ControlPoint2Animations") Block_initWithDurationControlPoint1ControlPoint2Animations animations);

    /**
     * All convenience initializers return an animator which is not running.
     */
    @Generated
    @Selector("initWithDuration:curve:animations:")
    public native UIViewPropertyAnimator initWithDurationCurveAnimations(double duration, @NInt long curve,
            @Nullable @ObjCBlock(name = "call_initWithDurationCurveAnimations") Block_initWithDurationCurveAnimations animations);

    @Generated
    @Selector("initWithDuration:dampingRatio:animations:")
    public native UIViewPropertyAnimator initWithDurationDampingRatioAnimations(double duration, @NFloat double ratio,
            @Nullable @ObjCBlock(name = "call_initWithDurationDampingRatioAnimations") Block_initWithDurationDampingRatioAnimations animations);

    @Generated
    @Selector("initWithDuration:timingParameters:")
    public native UIViewPropertyAnimator initWithDurationTimingParameters(double duration,
            @NotNull @Mapped(ObjCObjectMapper.class) UITimingCurveProvider parameters);

    /**
     * Defaults to YES. Raises if set on an active animator.
     */
    @Generated
    @Selector("isInterruptible")
    public native boolean isInterruptible();

    /**
     * Defaults to YES. Raises if set on an active animator.
     */
    @Generated
    @Selector("setInterruptible:")
    public native void setInterruptible(boolean value);

    /**
     * Defaults to NO. Set if you need to manage the the hit-testing of animating view hierarchies
     */
    @Generated
    @Selector("isManualHitTestingEnabled")
    public native boolean isManualHitTestingEnabled();

    /**
     * Defaults to NO. Set if you need to manage the the hit-testing of animating view hierarchies
     */
    @Generated
    @Selector("setManualHitTestingEnabled:")
    public native void setManualHitTestingEnabled(boolean value);

    @Generated
    @Selector("isReversed")
    public native boolean isReversed();

    @Generated
    @Selector("setReversed:")
    public native void setReversed(boolean value);

    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    /**
     * Defaults to YES. Raises if set on an active animator.
     */
    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    /**
     * Defaults to YES. Raises if set on an active animator.
     */
    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    @Generated
    @Selector("pauseAnimation")
    public native void pauseAnimation();

    @Generated
    @Selector("setFractionComplete:")
    public native void setFractionComplete(@NFloat double value);

    @Generated
    @Selector("startAnimation")
    public native void startAnimation();

    @Generated
    @Selector("startAnimationAfterDelay:")
    public native void startAnimationAfterDelay(double delay);

    @Generated
    @Selector("state")
    @NInt
    public native long state();

    @Generated
    @Selector("stopAnimation:")
    public native void stopAnimation(boolean withoutFinishing);

    @Nullable
    @Generated
    @Selector("timingParameters")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITimingCurveProvider timingParameters();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDurationControlPoint1ControlPoint2Animations {
        @Generated
        void call_initWithDurationControlPoint1ControlPoint2Animations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDurationCurveAnimations {
        @Generated
        void call_initWithDurationCurveAnimations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithDurationDampingRatioAnimations {
        @Generated
        void call_initWithDurationDampingRatioAnimations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3 {
        @Generated
        void call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4 {
        @Generated
        void call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4(@NInt long finalPosition);
    }

    /**
     * Defaults to NO. Provides the ability for an animator to pause on completion instead of transitioning to the
     * .inactive state.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("pausesOnCompletion")
    public native boolean pausesOnCompletion();

    /**
     * Defaults to YES. Provides the ability for an animator to pause and scrub either linearly or using the animator’s
     * current timing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("scrubsLinearly")
    public native boolean scrubsLinearly();

    /**
     * Defaults to NO. Provides the ability for an animator to pause on completion instead of transitioning to the
     * .inactive state.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPausesOnCompletion:")
    public native void setPausesOnCompletion(boolean value);

    /**
     * Defaults to YES. Provides the ability for an animator to pause and scrub either linearly or using the animator’s
     * current timing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setScrubsLinearly:")
    public native void setScrubsLinearly(boolean value);
}

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
import apple.coregraphics.struct.CGPoint;
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
    @Selector("runningPropertyAnimatorWithDuration:delay:options:animations:completion:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3") Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4") Block_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4 completion);

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
            @ObjCBlock(name = "call_addAnimations") UIViewImplicitlyAnimating.Block_addAnimations animation);

    @Generated
    @Selector("addAnimations:delayFactor:")
    public native void addAnimationsDelayFactor(
            @ObjCBlock(name = "call_addAnimationsDelayFactor") UIViewImplicitlyAnimating.Block_addAnimationsDelayFactor animation,
            @NFloat double delayFactor);

    @Generated
    @Selector("addCompletion:")
    public native void addCompletion(
            @ObjCBlock(name = "call_addCompletion") UIViewImplicitlyAnimating.Block_addCompletion completion);

    @Generated
    @Selector("continueAnimationWithTimingParameters:durationFactor:")
    public native void continueAnimationWithTimingParametersDurationFactor(
            @Mapped(ObjCObjectMapper.class) UITimingCurveProvider parameters, @NFloat double durationFactor);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

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
            @ObjCBlock(name = "call_initWithDurationControlPoint1ControlPoint2Animations") Block_initWithDurationControlPoint1ControlPoint2Animations animations);

    @Generated
    @Selector("initWithDuration:curve:animations:")
    public native UIViewPropertyAnimator initWithDurationCurveAnimations(double duration, @NInt long curve,
            @ObjCBlock(name = "call_initWithDurationCurveAnimations") Block_initWithDurationCurveAnimations animations);

    @Generated
    @Selector("initWithDuration:dampingRatio:animations:")
    public native UIViewPropertyAnimator initWithDurationDampingRatioAnimations(double duration, @NFloat double ratio,
            @ObjCBlock(name = "call_initWithDurationDampingRatioAnimations") Block_initWithDurationDampingRatioAnimations animations);

    @Generated
    @Selector("initWithDuration:timingParameters:")
    public native UIViewPropertyAnimator initWithDurationTimingParameters(double duration,
            @Mapped(ObjCObjectMapper.class) UITimingCurveProvider parameters);

    @Generated
    @Selector("isInterruptible")
    public native boolean isInterruptible();

    @Generated
    @Selector("setInterruptible:")
    public native void setInterruptible(boolean value);

    @Generated
    @Selector("isManualHitTestingEnabled")
    public native boolean isManualHitTestingEnabled();

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

    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

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
        void call_runningPropertyAnimatorWithDurationDelayOptionsAnimationsCompletion_4(@NInt long arg0);
    }
}

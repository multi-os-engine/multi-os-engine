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
import apple.uikit.protocol.UITimingCurveProvider;
import apple.uikit.protocol.UIViewControllerContextTransitioning;
import apple.uikit.protocol.UIViewControllerInteractiveTransitioning;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPercentDrivenInteractiveTransition extends NSObject implements UIViewControllerInteractiveTransitioning {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPercentDrivenInteractiveTransition(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPercentDrivenInteractiveTransition alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native UIPercentDrivenInteractiveTransition allocWithZone(VoidPtr zone);

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
    public static native UIPercentDrivenInteractiveTransition new_objc();

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
    @Selector("cancelInteractiveTransition")
    public native void cancelInteractiveTransition();

    @Generated
    @Selector("completionCurve")
    @NInt
    public native long completionCurve();

    @Generated
    @Selector("completionSpeed")
    @NFloat
    public native double completionSpeed();

    /**
     * This is the non-interactive duration that was returned when the
     * animators transitionDuration: method was called when the transition started.
     */
    @Generated
    @Selector("duration")
    @NFloat
    public native double duration();

    @Generated
    @Selector("finishInteractiveTransition")
    public native void finishInteractiveTransition();

    @Generated
    @Selector("init")
    public native UIPercentDrivenInteractiveTransition init();

    /**
     * Use this method to pause a running interruptible animator. This will ensure that all blocks
     * provided by a transition coordinator's notifyWhenInteractionChangesUsingBlock: method
     * are executed when a transition moves in and out of an interactive mode.
     */
    @Generated
    @Selector("pauseInteractiveTransition")
    public native void pauseInteractiveTransition();

    /**
     * The last percentComplete value specified by updateInteractiveTransition:
     */
    @Generated
    @Selector("percentComplete")
    @NFloat
    public native double percentComplete();

    /**
     * When the interactive part of the transition has completed, this property can
     * be set to indicate a different animation curve. It defaults to UIViewAnimationCurveEaseInOut.
     * Note that during the interactive portion of the animation the timing curve is linear.
     */
    @Generated
    @Selector("setCompletionCurve:")
    public native void setCompletionCurve(@NInt long value);

    /**
     * completionSpeed defaults to 1.0 which corresponds to a completion duration of
     * (1 - percentComplete)*duration.  It must be greater than 0.0. The actual
     * completion is inversely proportional to the completionSpeed.  This can be set
     * before cancelInteractiveTransition or finishInteractiveTransition is called
     * in order to speed up or slow down the non interactive part of the
     * transition.
     */
    @Generated
    @Selector("setCompletionSpeed:")
    public native void setCompletionSpeed(@NFloat double value);

    /**
     * For an interruptible animator, one can specify a different timing curve provider to use when the
     * transition is continued. This property is ignored if the animated transitioning object does not
     * vend an interruptible animator.
     */
    @Generated
    @Selector("setTimingCurve:")
    public native void setTimingCurve(@Mapped(ObjCObjectMapper.class) UITimingCurveProvider value);

    /**
     * Set this to NO in order to start an interruptible transition non
     * interactively. By default this is YES, which is consistent with the behavior
     * before 10.0.
     */
    @Generated
    @Selector("setWantsInteractiveStart:")
    public native void setWantsInteractiveStart(boolean value);

    @Generated
    @Selector("startInteractiveTransition:")
    public native void startInteractiveTransition(
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    /**
     * For an interruptible animator, one can specify a different timing curve provider to use when the
     * transition is continued. This property is ignored if the animated transitioning object does not
     * vend an interruptible animator.
     */
    @Generated
    @Selector("timingCurve")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITimingCurveProvider timingCurve();

    /**
     * These methods should be called by the gesture recognizer or some other logic
     * to drive the interaction. This style of interaction controller should only be
     * used with an animator that implements a CA style transition in the animator's
     * animateTransition: method. If this type of interaction controller is
     * specified, the animateTransition: method must ensure to call the
     * UIViewControllerTransitionParameters completeTransition: method. The other
     * interactive methods on UIViewControllerContextTransitioning should NOT be
     * called. If there is an interruptible animator, these methods will either scrub or continue
     * the transition in the forward or reverse directions.
     */
    @Generated
    @Selector("updateInteractiveTransition:")
    public native void updateInteractiveTransition(@NFloat double percentComplete);

    @Generated
    @Selector("wantsInteractiveStart")
    public native boolean wantsInteractiveStart();
}

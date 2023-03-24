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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.protocol.CAAnimationDelegate;
import apple.quartzcore.protocol.CAMediaTiming;
import apple.quartzcore.struct.CAFrameRateRange;
import apple.scenekit.SCNAnimationEvent;
import apple.scenekit.protocol.SCNAnimation;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The base animation class. *
 * 
 * API-Since: 2.0
 */
@Generated
@Library("QuartzCore")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CAAnimation extends NSObject implements NSSecureCoding, NSCopying, CAMediaTiming, CAAction, SCNAnimation {
    static {
        NatJ.register();
    }

    @Generated
    protected CAAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CAAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CAAnimation allocWithZone(VoidPtr zone);

    /**
     * Creates a new animation object.
     */
    @Generated
    @Selector("animation")
    public static native CAAnimation animation();

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

    /**
     * Animations implement the same property model as defined by CALayer.
     * See CALayer.h for more details.
     */
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
    public static native CAAnimation new_objc();

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

    /**
     * [@property] animationEvents
     * 
     * Specifies the animation events attached to the receiver.
     */
    @Nullable
    @Generated
    @Selector("animationEvents")
    public native NSArray<? extends SCNAnimationEvent> animationEvents();

    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    @Generated
    @Selector("beginTime")
    public native double beginTime();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The delegate of the animation. This object is retained for the
     * lifetime of the animation object. Defaults to nil. See below for the
     * supported delegate methods.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAAnimationDelegate delegate();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] fadeInDuration
     * 
     * Determines the receiver's fade-in duration.
     * 
     * When the fadeInDuration is greater than zero, the effect of the animation progressively increase from 0% to 100%
     * during the specified duration.
     */
    @Generated
    @Selector("fadeInDuration")
    @NFloat
    public native double fadeInDuration();

    /**
     * [@property] fadeOutDuration
     * 
     * Determines the receiver's fade-out duration.
     * 
     * When the fadeOutDuration is greater than zero, the effect of the animation progressively decrease from 100% to 0%
     * at the end of the animation duration.
     */
    @Generated
    @Selector("fadeOutDuration")
    @NFloat
    public native double fadeOutDuration();

    @NotNull
    @Generated
    @Selector("fillMode")
    public native String fillMode();

    @Generated
    @Selector("init")
    public native CAAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native CAAnimation initWithCoder(@NotNull NSCoder coder);

    /**
     * When true, the animation is removed from the render tree once its
     * active duration has passed. Defaults to YES.
     */
    @Generated
    @Selector("isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();

    /**
     * When true, the animation is removed from the render tree once its
     * active duration has passed. Defaults to YES.
     */
    @Generated
    @Selector("setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean value);

    @Generated
    @Selector("repeatCount")
    public native float repeatCount();

    @Generated
    @Selector("repeatDuration")
    public native double repeatDuration();

    @Generated
    @Selector("runActionForKey:object:arguments:")
    public native void runActionForKeyObjectArguments(@NotNull String event,
            @NotNull @Mapped(ObjCObjectMapper.class) Object anObject, @Nullable NSDictionary<?, ?> dict);

    /**
     * [@property] animationEvents
     * 
     * Specifies the animation events attached to the receiver.
     */
    @Generated
    @Selector("setAnimationEvents:")
    public native void setAnimationEvents(@Nullable NSArray<? extends SCNAnimationEvent> value);

    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    @Generated
    @Selector("setBeginTime:")
    public native void setBeginTime(double value);

    /**
     * The delegate of the animation. This object is retained for the
     * lifetime of the animation object. Defaults to nil. See below for the
     * supported delegate methods.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) CAAnimationDelegate value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * [@property] fadeInDuration
     * 
     * Determines the receiver's fade-in duration.
     * 
     * When the fadeInDuration is greater than zero, the effect of the animation progressively increase from 0% to 100%
     * during the specified duration.
     */
    @Generated
    @Selector("setFadeInDuration:")
    public native void setFadeInDuration(@NFloat double value);

    /**
     * [@property] fadeOutDuration
     * 
     * Determines the receiver's fade-out duration.
     * 
     * When the fadeOutDuration is greater than zero, the effect of the animation progressively decrease from 100% to 0%
     * at the end of the animation duration.
     */
    @Generated
    @Selector("setFadeOutDuration:")
    public native void setFadeOutDuration(@NFloat double value);

    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(@NotNull String value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(float value);

    @Generated
    @Selector("setRepeatDuration:")
    public native void setRepeatDuration(double value);

    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(float value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    /**
     * A timing function defining the pacing of the animation. Defaults to
     * nil indicating linear pacing.
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@Nullable CAMediaTimingFunction value);

    /**
     * [@property] usesSceneTimeBase
     * 
     * Determines whether the receiver is evaluated using the scene time or the system time. Defaults to NO.
     * 
     * A scene-time based animation is evaluated using the "sceneTime" value of the renderer that renders the scene.
     */
    @Generated
    @Selector("setUsesSceneTimeBase:")
    public native void setUsesSceneTimeBase(boolean value);

    @Generated
    @Selector("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey(@NotNull String key);

    @Generated
    @Selector("speed")
    public native float speed();

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    /**
     * A timing function defining the pacing of the animation. Defaults to
     * nil indicating linear pacing.
     */
    @Nullable
    @Generated
    @Selector("timingFunction")
    public native CAMediaTimingFunction timingFunction();

    /**
     * [@property] usesSceneTimeBase
     * 
     * Determines whether the receiver is evaluated using the scene time or the system time. Defaults to NO.
     * 
     * A scene-time based animation is evaluated using the "sceneTime" value of the renderer that renders the scene.
     */
    @Generated
    @Selector("usesSceneTimeBase")
    public native boolean usesSceneTimeBase();

    /**
     * Bridge with SCNAnimation
     * Initializes a CoreAnimation animation from a SCNAnimation
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("animationWithSCNAnimation:")
    public static native CAAnimation animationWithSCNAnimation(@NotNull apple.scenekit.SCNAnimation animation);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Defines the range of desired frame rate in frames-per-second for this
     * animation. The actual frame rate is dynamically adjusted to better align
     * with other animation sources.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredFrameRateRange")
    @ByValue
    public native CAFrameRateRange preferredFrameRateRange();

    /**
     * Defines the range of desired frame rate in frames-per-second for this
     * animation. The actual frame rate is dynamically adjusted to better align
     * with other animation sources.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredFrameRateRange:")
    public native void setPreferredFrameRateRange(@ByValue CAFrameRateRange value);
}

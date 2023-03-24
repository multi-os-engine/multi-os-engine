package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.CAAnimation;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNAnimation represents an animation that targets a specific key path.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNAnimation extends NSObject implements apple.scenekit.protocol.SCNAnimation, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNAnimation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNAnimation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNAnimation allocWithZone(VoidPtr zone);

    /**
     * Called when the animation starts.
     */
    @Nullable
    @Generated
    @Selector("animationDidStart")
    @ObjCBlock(name = "call_animationDidStart_ret")
    public native Block_animationDidStart_ret animationDidStart();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animationDidStart_ret {
        @Generated
        void call_animationDidStart_ret(@NotNull SCNAnimation animation,
                @NotNull @Mapped(ObjCObjectMapper.class) Object receiver);
    }

    /**
     * Called when the animation either completes its active duration or
     * is removed from the object it is attached to (i.e. the layer). The 'completed' argument of
     * SCNAnimationDidStopBlock
     * is true if the animation reached the end of its active duration without being removed.
     */
    @Nullable
    @Generated
    @Selector("animationDidStop")
    @ObjCBlock(name = "call_animationDidStop_ret")
    public native Block_animationDidStop_ret animationDidStop();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animationDidStop_ret {
        @Generated
        void call_animationDidStop_ret(@NotNull SCNAnimation animation,
                @NotNull @Mapped(ObjCObjectMapper.class) Object receiver, boolean completed);
    }

    /**
     * Specifies the animation events attached to the receiver.
     * 
     * @see SCNAnimationEvent
     */
    @Nullable
    @Generated
    @Selector("animationEvents")
    public native NSArray<? extends SCNAnimationEvent> animationEvents();

    /**
     * Loads and returns the animation with the specified name in the current application bundle.
     * 
     * @param animationName The name of the animation to load.
     */
    @NotNull
    @Generated
    @Selector("animationNamed:")
    public static native SCNAnimation animationNamed(@NotNull String animationName);

    /**
     * bridge with Core Animation
     * Returns a SCNAnimation initialized from a CAAnimation.
     * 
     * Only CABasicAnimation, CAKeyframeAnimation and CAAnimationGroup are currently supported.
     * 
     * @param caAnimation The CAAnimation to initialize from.
     */
    @NotNull
    @Generated
    @Selector("animationWithCAAnimation:")
    public static native SCNAnimation animationWithCAAnimation(@NotNull CAAnimation caAnimation);

    /**
     * Loads and returns an animation loaded from the specified URL.
     * 
     * @param animationUrl The url to load.
     */
    @NotNull
    @Generated
    @Selector("animationWithContentsOfURL:")
    public static native SCNAnimation animationWithContentsOfURL(@NotNull NSURL animationUrl);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * When true, the object plays backwards after playing forwards. Defaults to NO.
     */
    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    /**
     * Determines the receiver's blend-in duration.
     * 
     * When the blendInDuration is greater than zero, the effect of the animation progressively increase from 0% to 100%
     * during the specified duration.
     */
    @Generated
    @Selector("blendInDuration")
    public native double blendInDuration();

    /**
     * Determines the receiver's blend-out duration.
     * 
     * When the blendOutDuration is greater than zero, the effect of the animation progressively decrease from 100% to
     * 0% at the end of the animation duration.
     */
    @Generated
    @Selector("blendOutDuration")
    public native double blendOutDuration();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The duration of the animation in seconds. Defaults to 0.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * When true, the animation is active before its active duration and evaluates to its start value. Defaults to NO.
     */
    @Generated
    @Selector("fillsBackward")
    public native boolean fillsBackward();

    /**
     * When true, the animation remains active after its active duration and evaluates to its end value. Defaults to NO.
     */
    @Generated
    @Selector("fillsForward")
    public native boolean fillsForward();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native SCNAnimation init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNAnimation initWithCoder(@NotNull NSCoder coder);

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
     * When true, the animation is applied to the model tree once its active duration has passed. Defaults to NO.
     */
    @Generated
    @Selector("isAppliedOnCompletion")
    public native boolean isAppliedOnCompletion();

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
     * When true, the animation is removed from the render tree once its active duration has passed. Defaults to YES.
     */
    @Generated
    @Selector("isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * The key-path describing the property to be animated for single-property animations, nil for animations targetting
     * multiple nodes. defaults to nil.
     * The key-path uses the KVC syntax. It's also possible to target a specific sub-node with the following syntax:
     * /<node-name>.property1.property2.field (field is optional, <node-name> is the name of the targeted node).
     */
    @Nullable
    @Generated
    @Selector("keyPath")
    public native String keyPath();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNAnimation new_objc();

    /**
     * The repeat count of the object. May be fractional. Defaults to 0.
     */
    @Generated
    @Selector("repeatCount")
    @NFloat
    public native double repeatCount();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
     * Called when the animation starts.
     */
    @Generated
    @Selector("setAnimationDidStart:")
    public native void setAnimationDidStart(
            @Nullable @ObjCBlock(name = "call_setAnimationDidStart") Block_setAnimationDidStart value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAnimationDidStart {
        @Generated
        void call_setAnimationDidStart(@NotNull SCNAnimation animation,
                @NotNull @Mapped(ObjCObjectMapper.class) Object receiver);
    }

    /**
     * Called when the animation either completes its active duration or
     * is removed from the object it is attached to (i.e. the layer). The 'completed' argument of
     * SCNAnimationDidStopBlock
     * is true if the animation reached the end of its active duration without being removed.
     */
    @Generated
    @Selector("setAnimationDidStop:")
    public native void setAnimationDidStop(
            @Nullable @ObjCBlock(name = "call_setAnimationDidStop") Block_setAnimationDidStop value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAnimationDidStop {
        @Generated
        void call_setAnimationDidStop(@NotNull SCNAnimation animation,
                @NotNull @Mapped(ObjCObjectMapper.class) Object receiver, boolean completed);
    }

    /**
     * Specifies the animation events attached to the receiver.
     * 
     * @see SCNAnimationEvent
     */
    @Generated
    @Selector("setAnimationEvents:")
    public native void setAnimationEvents(@Nullable NSArray<? extends SCNAnimationEvent> value);

    /**
     * When true, the animation is applied to the model tree once its active duration has passed. Defaults to NO.
     */
    @Generated
    @Selector("setAppliedOnCompletion:")
    public native void setAppliedOnCompletion(boolean value);

    /**
     * When true, the object plays backwards after playing forwards. Defaults to NO.
     */
    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    /**
     * Determines the receiver's blend-in duration.
     * 
     * When the blendInDuration is greater than zero, the effect of the animation progressively increase from 0% to 100%
     * during the specified duration.
     */
    @Generated
    @Selector("setBlendInDuration:")
    public native void setBlendInDuration(double value);

    /**
     * Determines the receiver's blend-out duration.
     * 
     * When the blendOutDuration is greater than zero, the effect of the animation progressively decrease from 100% to
     * 0% at the end of the animation duration.
     */
    @Generated
    @Selector("setBlendOutDuration:")
    public native void setBlendOutDuration(double value);

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
     * The duration of the animation in seconds. Defaults to 0.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * When true, the animation is active before its active duration and evaluates to its start value. Defaults to NO.
     */
    @Generated
    @Selector("setFillsBackward:")
    public native void setFillsBackward(boolean value);

    /**
     * When true, the animation remains active after its active duration and evaluates to its end value. Defaults to NO.
     */
    @Generated
    @Selector("setFillsForward:")
    public native void setFillsForward(boolean value);

    /**
     * The key-path describing the property to be animated for single-property animations, nil for animations targetting
     * multiple nodes. defaults to nil.
     * The key-path uses the KVC syntax. It's also possible to target a specific sub-node with the following syntax:
     * /<node-name>.property1.property2.field (field is optional, <node-name> is the name of the targeted node).
     */
    @Generated
    @Selector("setKeyPath:")
    public native void setKeyPath(@Nullable String value);

    /**
     * When true, the animation is removed from the render tree once its active duration has passed. Defaults to YES.
     */
    @Generated
    @Selector("setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean value);

    /**
     * The repeat count of the object. May be fractional. Defaults to 0.
     */
    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(@NFloat double value);

    /**
     * The relative delay to start the animation, in relation to its parent animation if applicable. Defaults to 0.
     * 
     * This property is bridged with CoreAnimations's beginTime. However, for top level animations, startDelay is
     * relative to the current time (unlike CAAnimation's beginTime that is absolute). So if a CAAnimation has a
     * non-zero beginTime, startDelay is initialized as caAnimation.beginTime - CACurrentMediaTime().
     */
    @Generated
    @Selector("setStartDelay:")
    public native void setStartDelay(double value);

    /**
     * Additional offset in active local time. i.e. to convert from parent
     * time tp to active local time t: t = (tp - begin) * speed + offset.
     * Defaults to 0.
     */
    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    /**
     * A timing function defining the pacing of the animation. Defaults to nil indicating linear pacing.
     */
    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(@NotNull SCNTimingFunction value);

    /**
     * Determines whether the receiver is evaluated using the scene time or the system time. Defaults to NO.
     * 
     * A scene-time based animation is evaluated using the "sceneTime" value of the renderer that renders the scene.
     * The "sceneTime" base is typically used by players or editors that need to preview, edit and being able to change
     * the evaluation time.
     * 
     * @see SCNSceneSourceAnimationImportPolicyKey
     */
    @Generated
    @Selector("setUsesSceneTimeBase:")
    public native void setUsesSceneTimeBase(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The relative delay to start the animation, in relation to its parent animation if applicable. Defaults to 0.
     * 
     * This property is bridged with CoreAnimations's beginTime. However, for top level animations, startDelay is
     * relative to the current time (unlike CAAnimation's beginTime that is absolute). So if a CAAnimation has a
     * non-zero beginTime, startDelay is initialized as caAnimation.beginTime - CACurrentMediaTime().
     */
    @Generated
    @Selector("startDelay")
    public native double startDelay();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Additional offset in active local time. i.e. to convert from parent
     * time tp to active local time t: t = (tp - begin) * speed + offset.
     * Defaults to 0.
     */
    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    /**
     * A timing function defining the pacing of the animation. Defaults to nil indicating linear pacing.
     */
    @NotNull
    @Generated
    @Selector("timingFunction")
    public native SCNTimingFunction timingFunction();

    /**
     * Determines whether the receiver is evaluated using the scene time or the system time. Defaults to NO.
     * 
     * A scene-time based animation is evaluated using the "sceneTime" value of the renderer that renders the scene.
     * The "sceneTime" base is typically used by players or editors that need to preview, edit and being able to change
     * the evaluation time.
     * 
     * @see SCNSceneSourceAnimationImportPolicyKey
     */
    @Generated
    @Selector("usesSceneTimeBase")
    public native boolean usesSceneTimeBase();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

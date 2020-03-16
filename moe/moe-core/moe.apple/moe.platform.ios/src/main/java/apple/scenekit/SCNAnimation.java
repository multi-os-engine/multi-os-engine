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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animationDidStart")
    @ObjCBlock(name = "call_animationDidStart_ret")
    public native Block_animationDidStart_ret animationDidStart();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animationDidStart_ret {
        @Generated
        void call_animationDidStart_ret(SCNAnimation arg0, @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("animationDidStop")
    @ObjCBlock(name = "call_animationDidStop_ret")
    public native Block_animationDidStop_ret animationDidStop();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animationDidStop_ret {
        @Generated
        void call_animationDidStop_ret(SCNAnimation arg0, @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
    }

    @Generated
    @Selector("animationEvents")
    public native NSArray<? extends SCNAnimationEvent> animationEvents();

    @Generated
    @Selector("animationNamed:")
    public static native SCNAnimation animationNamed(String animationName);

    @Generated
    @Selector("animationWithCAAnimation:")
    public static native SCNAnimation animationWithCAAnimation(CAAnimation caAnimation);

    @Generated
    @Selector("animationWithContentsOfURL:")
    public static native SCNAnimation animationWithContentsOfURL(NSURL animationUrl);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("autoreverses")
    public native boolean autoreverses();

    @Generated
    @Selector("blendInDuration")
    public native double blendInDuration();

    @Generated
    @Selector("blendOutDuration")
    public native double blendOutDuration();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fillsBackward")
    public native boolean fillsBackward();

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
    public native SCNAnimation initWithCoder(NSCoder coder);

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
    @Selector("isAdditive")
    public native boolean isAdditive();

    @Generated
    @Selector("isAppliedOnCompletion")
    public native boolean isAppliedOnCompletion();

    @Generated
    @Selector("isCumulative")
    public native boolean isCumulative();

    @Generated
    @Selector("isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPath")
    public native String keyPath();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("setAdditive:")
    public native void setAdditive(boolean value);

    @Generated
    @Selector("setAnimationDidStart:")
    public native void setAnimationDidStart(
            @ObjCBlock(name = "call_setAnimationDidStart") Block_setAnimationDidStart value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAnimationDidStart {
        @Generated
        void call_setAnimationDidStart(SCNAnimation arg0, @Mapped(ObjCObjectMapper.class) Object arg1);
    }

    @Generated
    @Selector("setAnimationDidStop:")
    public native void setAnimationDidStop(
            @ObjCBlock(name = "call_setAnimationDidStop") Block_setAnimationDidStop value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setAnimationDidStop {
        @Generated
        void call_setAnimationDidStop(SCNAnimation arg0, @Mapped(ObjCObjectMapper.class) Object arg1, boolean arg2);
    }

    @Generated
    @Selector("setAnimationEvents:")
    public native void setAnimationEvents(NSArray<? extends SCNAnimationEvent> value);

    @Generated
    @Selector("setAppliedOnCompletion:")
    public native void setAppliedOnCompletion(boolean value);

    @Generated
    @Selector("setAutoreverses:")
    public native void setAutoreverses(boolean value);

    @Generated
    @Selector("setBlendInDuration:")
    public native void setBlendInDuration(double value);

    @Generated
    @Selector("setBlendOutDuration:")
    public native void setBlendOutDuration(double value);

    @Generated
    @Selector("setCumulative:")
    public native void setCumulative(boolean value);

    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    @Generated
    @Selector("setFillsBackward:")
    public native void setFillsBackward(boolean value);

    @Generated
    @Selector("setFillsForward:")
    public native void setFillsForward(boolean value);

    @Generated
    @Selector("setKeyPath:")
    public native void setKeyPath(String value);

    @Generated
    @Selector("setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean value);

    @Generated
    @Selector("setRepeatCount:")
    public native void setRepeatCount(@NFloat double value);

    @Generated
    @Selector("setStartDelay:")
    public native void setStartDelay(double value);

    @Generated
    @Selector("setTimeOffset:")
    public native void setTimeOffset(double value);

    @Generated
    @Selector("setTimingFunction:")
    public native void setTimingFunction(SCNTimingFunction value);

    @Generated
    @Selector("setUsesSceneTimeBase:")
    public native void setUsesSceneTimeBase(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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

    @Generated
    @Selector("timeOffset")
    public native double timeOffset();

    @Generated
    @Selector("timingFunction")
    public native SCNTimingFunction timingFunction();

    @Generated
    @Selector("usesSceneTimeBase")
    public native boolean usesSceneTimeBase();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
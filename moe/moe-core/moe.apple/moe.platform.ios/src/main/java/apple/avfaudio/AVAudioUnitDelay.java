package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioUnitDelay
 * <p>
 * an AVAudioUnitEffect that implements a delay effect
 * <p>
 * A delay unit delays the input signal by the specified time interval
 * and then blends it with the input signal. The amount of high frequency
 * roll-off can also be controlled in order to simulate the effect of
 * a tape delay.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitDelay extends AVAudioUnitEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitDelay(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitDelay alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitDelay allocWithZone(VoidPtr zone);

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

    /**
     * [@property] delayTime
     * Time taken by the delayed input signal to reach the output
     * <p>
     * Range: 0 -> 2
     * Default: 1
     * Unit: Seconds
     */
    @Generated
    @Selector("delayTime")
    public native double delayTime();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] feedback
     * <p>
     * Amount of the output signal fed back into the delay line
     * Range: -100 -> 100
     * Default: 50
     * Unit: Percent
     */
    @Generated
    @Selector("feedback")
    public native float feedback();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioUnitDelay init();

    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitDelay initWithAudioComponentDescription(
            @ByValue AudioComponentDescription audioComponentDescription);

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
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AVAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] lowPassCutoff
     * <p>
     * Cutoff frequency above which high frequency content is rolled off
     * Range: 10 -> (samplerate/2)
     * Default: 15000
     * Unit: Hertz
     */
    @Generated
    @Selector("lowPassCutoff")
    public native float lowPassCutoff();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioUnitDelay new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] delayTime
     * Time taken by the delayed input signal to reach the output
     * <p>
     * Range: 0 -> 2
     * Default: 1
     * Unit: Seconds
     */
    @Generated
    @Selector("setDelayTime:")
    public native void setDelayTime(double value);

    /**
     * [@property] feedback
     * <p>
     * Amount of the output signal fed back into the delay line
     * Range: -100 -> 100
     * Default: 50
     * Unit: Percent
     */
    @Generated
    @Selector("setFeedback:")
    public native void setFeedback(float value);

    /**
     * [@property] lowPassCutoff
     * <p>
     * Cutoff frequency above which high frequency content is rolled off
     * Range: 10 -> (samplerate/2)
     * Default: 15000
     * Unit: Hertz
     */
    @Generated
    @Selector("setLowPassCutoff:")
    public native void setLowPassCutoff(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] wetDryMix
     * <p>
     * Blend of the wet and dry signals
     * Range: 0 (all dry) -> 100 (all wet)
     * Default: 100
     * Unit: Percent
     */
    @Generated
    @Selector("setWetDryMix:")
    public native void setWetDryMix(float value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] wetDryMix
     * <p>
     * Blend of the wet and dry signals
     * Range: 0 (all dry) -> 100 (all wet)
     * Default: 100
     * Unit: Percent
     */
    @Generated
    @Selector("wetDryMix")
    public native float wetDryMix();
}

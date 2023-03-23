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
 * AVAudioUnitVarispeed
 * 
 * an AVAudioUnitTimeEffect that can be used to control the playback rate
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitVarispeed extends AVAudioUnitTimeEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitVarispeed(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitVarispeed alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitVarispeed allocWithZone(VoidPtr zone);

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
    @Selector("init")
    public native AVAudioUnitVarispeed init();

    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitVarispeed initWithAudioComponentDescription(
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

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioUnitVarispeed new_objc();

    /**
     * [@property] rate
     * 
     * controls the playback rate of the audio signal
     * 
     * Since this unit resamples the input signal, changing the playback rate also changes the pitch.
     * 
     * i.e. changing the rate to 2.0 results in the output audio playing one octave higher.
     * Similarly changing the rate to 0.5, results in the output audio playing one octave lower.
     * 
     * The playback rate and pitch can be calculated as
     * rate = pow(2, cents/1200.0)
     * pitch in cents = 1200.0 * log2(rate)
     * 
     * Where, 1 octave = 1200 cents
     * 1 musical semitone = 100 cents
     * 
     * Range: 0.25 -> 4.0
     * Default: 1.0
     * Unit: Generic
     */
    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] rate
     * 
     * controls the playback rate of the audio signal
     * 
     * Since this unit resamples the input signal, changing the playback rate also changes the pitch.
     * 
     * i.e. changing the rate to 2.0 results in the output audio playing one octave higher.
     * Similarly changing the rate to 0.5, results in the output audio playing one octave lower.
     * 
     * The playback rate and pitch can be calculated as
     * rate = pow(2, cents/1200.0)
     * pitch in cents = 1200.0 * log2(rate)
     * 
     * Where, 1 octave = 1200 cents
     * 1 musical semitone = 100 cents
     * 
     * Range: 0.25 -> 4.0
     * Default: 1.0
     * Unit: Generic
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

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
}

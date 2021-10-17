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
 * AVAudioUnitTimePitch
 * <p>
 * an AVAudioUnitTimeEffect that provides good quality time stretching and pitch shifting
 * <p>
 * In this time effect, the playback rate and pitch parameters function independently of each other
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitTimePitch extends AVAudioUnitTimeEffect {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitTimePitch(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitTimePitch alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitTimePitch allocWithZone(VoidPtr zone);

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
    public native AVAudioUnitTimePitch init();

    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitTimePitch initWithAudioComponentDescription(
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
    public static native AVAudioUnitTimePitch new_objc();

    /**
     * [@property] overlap
     * <p>
     * amount of overlap between segments of the input audio signal
     * <p>
     * A higher value results in fewer artifacts in the output signal.
     * This parameter also impacts the amount of CPU used.
     * <p>
     * Range:      3.0 -> 32.0
     * Default:    8.0
     * Unit:       Generic
     */
    @Generated
    @Selector("overlap")
    public native float overlap();

    /**
     * [@property] pitch
     * <p>
     * amount by which the input signal is pitch shifted
     * <p>
     * 1 octave  = 1200 cents
     * 1 musical semitone  = 100 cents
     * <p>
     * Range:      -2400 -> 2400
     * Default:    0.0
     * Unit:       Cents
     */
    @Generated
    @Selector("pitch")
    public native float pitch();

    /**
     * [@property] rate
     * <p>
     * playback rate of the input signal
     * <p>
     * Range:      1/32 -> 32.0
     * Default:    1.0
     * Unit:       Generic
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
     * [@property] overlap
     * <p>
     * amount of overlap between segments of the input audio signal
     * <p>
     * A higher value results in fewer artifacts in the output signal.
     * This parameter also impacts the amount of CPU used.
     * <p>
     * Range:      3.0 -> 32.0
     * Default:    8.0
     * Unit:       Generic
     */
    @Generated
    @Selector("setOverlap:")
    public native void setOverlap(float value);

    /**
     * [@property] pitch
     * <p>
     * amount by which the input signal is pitch shifted
     * <p>
     * 1 octave  = 1200 cents
     * 1 musical semitone  = 100 cents
     * <p>
     * Range:      -2400 -> 2400
     * Default:    0.0
     * Unit:       Cents
     */
    @Generated
    @Selector("setPitch:")
    public native void setPitch(float value);

    /**
     * [@property] rate
     * <p>
     * playback rate of the input signal
     * <p>
     * Range:      1/32 -> 32.0
     * Default:    1.0
     * Unit:       Generic
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

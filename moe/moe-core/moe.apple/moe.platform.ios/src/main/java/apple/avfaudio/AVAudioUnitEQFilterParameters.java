package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioUnitEQFilterParameters
 * <p>
 * Filter parameters used by AVAudioUnitEQ.
 * <p>
 * A standalone instance of AVAudioUnitEQFilterParameters cannot be created. Only an instance
 * vended out by a source object (e.g. AVAudioUnitEQ) can be used.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitEQFilterParameters extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitEQFilterParameters(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitEQFilterParameters alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitEQFilterParameters allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] bandwidth
     * <p>
     * Bandwidth in octaves.
     * <p>
     * Range: 0.05 -> 5.0
     * Unit: Octaves
     */
    @Generated
    @Selector("bandwidth")
    public native float bandwidth();

    /**
     * [@property] bypass
     * <p>
     * bypass state of band.
     * <p>
     * Default: YES
     */
    @Generated
    @Selector("bypass")
    public native boolean bypass();

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

    /**
     * [@property] filterType
     * <p>
     * AVAudioUnitEQFilterType
     * <p>
     * Default: AVAudioUnitEQFilterTypeParametric
     */
    @Generated
    @Selector("filterType")
    @NInt
    public native long filterType();

    /**
     * [@property] frequency
     * <p>
     * Frequency in Hertz.
     * <p>
     * Range: 20 -> (SampleRate/2)
     * Unit: Hertz
     */
    @Generated
    @Selector("frequency")
    public native float frequency();

    /**
     * [@property] gain
     * <p>
     * Gain in dB.
     * <p>
     * Range: -96 -> 24
     * Default: 0
     * Unit: dB
     */
    @Generated
    @Selector("gain")
    public native float gain();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioUnitEQFilterParameters init();

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
    public static native AVAudioUnitEQFilterParameters new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] bandwidth
     * <p>
     * Bandwidth in octaves.
     * <p>
     * Range: 0.05 -> 5.0
     * Unit: Octaves
     */
    @Generated
    @Selector("setBandwidth:")
    public native void setBandwidth(float value);

    /**
     * [@property] bypass
     * <p>
     * bypass state of band.
     * <p>
     * Default: YES
     */
    @Generated
    @Selector("setBypass:")
    public native void setBypass(boolean value);

    /**
     * [@property] filterType
     * <p>
     * AVAudioUnitEQFilterType
     * <p>
     * Default: AVAudioUnitEQFilterTypeParametric
     */
    @Generated
    @Selector("setFilterType:")
    public native void setFilterType(@NInt long value);

    /**
     * [@property] frequency
     * <p>
     * Frequency in Hertz.
     * <p>
     * Range: 20 -> (SampleRate/2)
     * Unit: Hertz
     */
    @Generated
    @Selector("setFrequency:")
    public native void setFrequency(float value);

    /**
     * [@property] gain
     * <p>
     * Gain in dB.
     * <p>
     * Range: -96 -> 24
     * Default: 0
     * Unit: dB
     */
    @Generated
    @Selector("setGain:")
    public native void setGain(float value);

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

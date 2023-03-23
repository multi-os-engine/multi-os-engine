package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioMixing;
import apple.avfaudio.struct.AVAudio3DPoint;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioMixerNode
 * 
 * A node that mixes its inputs to a single output.
 * 
 * Mixers may have any number of inputs.
 * 
 * The mixer accepts input at any sample rate and efficiently combines sample rate
 * conversions. It also accepts any channel count and will correctly upmix or downmix
 * to the output channel count.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioMixerNode extends AVAudioNode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioMixerNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioMixerNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioMixerNode allocWithZone(VoidPtr zone);

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
    @Selector("destinationForMixer:bus:")
    public native AVAudioMixingDestination destinationForMixerBus(AVAudioNode mixer, @NUInt long bus);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioMixerNode init();

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
    public static native AVAudioMixerNode new_objc();

    /**
     * [@property] nextAvailableInputBus
     * 
     * Find an unused input bus.
     * 
     * This will find and return the first input bus to which no other node is connected.
     */
    @Generated
    @Selector("nextAvailableInputBus")
    @NUInt
    public native long nextAvailableInputBus();

    @Generated
    @Selector("obstruction")
    public native float obstruction();

    @Generated
    @Selector("occlusion")
    public native float occlusion();

    /**
     * [@property] outputVolume
     * 
     * The mixer's output volume.
     * 
     * This accesses the mixer's output volume (0.0-1.0, inclusive).
     */
    @Generated
    @Selector("outputVolume")
    public native float outputVolume();

    @Generated
    @Selector("pan")
    public native float pan();

    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    public native long pointSourceInHeadMode();

    @Generated
    @Selector("position")
    @ByValue
    public native AVAudio3DPoint position();

    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    public native long renderingAlgorithm();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    @Generated
    @Selector("setObstruction:")
    public native void setObstruction(float value);

    @Generated
    @Selector("setOcclusion:")
    public native void setOcclusion(float value);

    /**
     * [@property] outputVolume
     * 
     * The mixer's output volume.
     * 
     * This accesses the mixer's output volume (0.0-1.0, inclusive).
     */
    @Generated
    @Selector("setOutputVolume:")
    public native void setOutputVolume(float value);

    @Generated
    @Selector("setPan:")
    public native void setPan(float value);

    @Generated
    @Selector("setPointSourceInHeadMode:")
    public native void setPointSourceInHeadMode(@NInt long value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue AVAudio3DPoint value);

    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(@NInt long value);

    @Generated
    @Selector("setReverbBlend:")
    public native void setReverbBlend(float value);

    @Generated
    @Selector("setSourceMode:")
    public native void setSourceMode(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("sourceMode")
    @NInt
    public native long sourceMode();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("volume")
    public native float volume();
}

package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioMixing;
import apple.avfaudio.struct.AVAudio3DPoint;
import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioTimeStamp;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioSourceNode
 * <p>
 * AVAudioSourceNode wraps a client provided block to supply audio.
 * <p>
 * With AVAudioSourceNode the client can supply audio data for rendering through an
 * AVAudioSourceNodeRenderBlock block.
 * This is similar to setting the input callback on an Audio Unit with the
 * kAudioUnitProperty_SetRenderCallback property.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSourceNode extends AVAudioNode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSourceNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSourceNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioSourceNode allocWithZone(VoidPtr zone);

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
    public native AVAudioSourceNode init();

    /**
     * initWithFormat:renderBlock:
     * <p>
     * Create a node with a render block.
     * <p>
     * The block can be called on realtime or non-realtime threads depending on the engine’s
     * operating mode and it is the client's responsibility to handle it in a thread-safe manner.
     * <p>
     * The audio format for the output bus will be set from the connection format when connecting
     * to another node.
     * <p>
     * AVAudioSourceNode supports different audio formats for the block and output, but only
     * Linear PCM conversions are supported (sample rate, bit depth, interleaving).
     *
     * @param format The format of the PCM audio data that will be supplied by the block.
     * @param block  The block to supply audio data to the output.
     */
    @Generated
    @Selector("initWithFormat:renderBlock:")
    public native AVAudioSourceNode initWithFormatRenderBlock(AVAudioFormat format,
            @ObjCBlock(name = "call_initWithFormatRenderBlock") Block_initWithFormatRenderBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithFormatRenderBlock {
        @Generated
        int call_initWithFormatRenderBlock(BoolPtr isSilence,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                int frameCount,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outputData);
    }

    /**
     * initWithRenderBlock:
     * <p>
     * Create a node with a render block.
     * <p>
     * The block can be called on realtime or non-realtime threads depending on the engine’s
     * operating mode and it is the client's responsibility to handle it in a thread-safe manner.
     * <p>
     * The audio format for the output bus will be set from the connection format when connecting
     * to another node.
     * <p>
     * The audio format for the block will be set to the node's output format. If node is
     * reconnected with a different output format, the audio format for the block will also change.
     *
     * @param block The block to supply audio data to the output.
     */
    @Generated
    @Selector("initWithRenderBlock:")
    public native AVAudioSourceNode initWithRenderBlock(
            @ObjCBlock(name = "call_initWithRenderBlock") Block_initWithRenderBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_initWithRenderBlock {
        @Generated
        int call_initWithRenderBlock(BoolPtr isSilence,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp timestamp,
                int frameCount,
                @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList outputData);
    }

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
    public static native AVAudioSourceNode new_objc();

    @Generated
    @Selector("obstruction")
    public native float obstruction();

    @Generated
    @Selector("occlusion")
    public native float occlusion();

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

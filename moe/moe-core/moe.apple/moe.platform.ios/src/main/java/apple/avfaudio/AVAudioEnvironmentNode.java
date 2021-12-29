package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioMixing;
import apple.avfaudio.struct.AVAudio3DAngularOrientation;
import apple.avfaudio.struct.AVAudio3DPoint;
import apple.avfaudio.struct.AVAudio3DVectorOrientation;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
 * AVAudioEnvironmentNode
 * <p>
 * Mixer node that simulates a 3D environment
 * <p>
 * AVAudioEnvironmentNode is a mixer node that simulates a 3D audio environment. Any node that
 * conforms to the AVAudioMixing protocol (e.g. AVAudioPlayerNode) can act as a source in this
 * environment.
 * <p>
 * The environment has an implicit "listener". By controlling the listener's position and
 * orientation, the application controls the way the user experiences the virtual world.
 * In addition, this node also defines properties for distance attenuation and reverberation
 * that help characterize the environment.
 * <p>
 * It is important to note that AVAudio3DMixingSourceMode affects how inputs with different channel
 * configurations are rendered. By default, only inputs with a mono channel are spatialized.
 * <p>
 * In order to set the environment node’s output to a multichannel format, use an AVAudioFormat
 * with a desired AudioChannelLayout.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioEnvironmentNode extends AVAudioNode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioEnvironmentNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioEnvironmentNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioEnvironmentNode allocWithZone(VoidPtr zone);

    /**
     * [@property] applicableRenderingAlgorithms
     * <p>
     * Returns an array of AVAudio3DMixingRenderingAlgorithm values based on the current output format
     * <p>
     * AVAudioEnvironmentNode supports several rendering algorithms per input bus which are defined
     * in <AVFAudio/AVAudioMixing.h>.
     * <p>
     * Depending on the current output format of the environment node, this method returns
     * an immutable array of the applicable rendering algorithms. This is important when the
     * environment node has been configured to a multichannel output format because only a subset
     * of the available rendering algorithms are designed to render to all of the channels.
     * <p>
     * This information should be retrieved after a successful connection to the destination node
     * via the engine's connect method.
     */
    @Generated
    @Selector("applicableRenderingAlgorithms")
    public native NSArray<? extends NSNumber> applicableRenderingAlgorithms();

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

    /**
     * [@property] distanceAttenuationParameters
     * <p>
     * The distance attenuation parameters for the environment
     */
    @Generated
    @Selector("distanceAttenuationParameters")
    public native AVAudioEnvironmentDistanceAttenuationParameters distanceAttenuationParameters();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioEnvironmentNode init();

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

    /**
     * [@property] listenerAngularOrientation
     * <p>
     * The listener's orientation in the environment
     * <p>
     * Changing listenerAngularOrientation will result in a corresponding change in listenerVectorOrientation.
     * All angles are specified in degrees.
     * Default:
     * The default orientation is with the listener looking directly along the negative Z axis.
     * yaw: 0.0
     * pitch: 0.0
     * roll: 0.0
     */
    @Generated
    @Selector("listenerAngularOrientation")
    @ByValue
    public native AVAudio3DAngularOrientation listenerAngularOrientation();

    /**
     * [@property] listenerPosition
     * <p>
     * Sets the listener's position in the 3D environment
     * <p>
     * The coordinates are specified in meters.
     * Default:
     * The default position of the listener is at the origin.
     * x: 0.0
     * y: 0.0
     * z: 0.0
     */
    @Generated
    @Selector("listenerPosition")
    @ByValue
    public native AVAudio3DPoint listenerPosition();

    /**
     * [@property] listenerVectorOrientation
     * <p>
     * The listener's orientation in the environment
     * <p>
     * Changing listenerVectorOrientation will result in a corresponding change in listenerAngularOrientation.
     * Default:
     * The default orientation is with the listener looking directly along the negative Z axis.
     * forward: (0, 0, -1)
     * up:      (0, 1, 0)
     */
    @Generated
    @Selector("listenerVectorOrientation")
    @ByValue
    public native AVAudio3DVectorOrientation listenerVectorOrientation();

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioEnvironmentNode new_objc();

    /**
     * [@property] nextAvailableInputBus
     * <p>
     * Find an unused input bus
     * <p>
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
     * [@property] outputType
     * <p>
     * Type of output hardware to be used with AVAudio3DMixingRenderingAlgorithmAuto
     * <p>
     * Output hardware cannot be automatically determined in Manual Rendering modes or for wired
     * output. This property can be used to override the output type if the correct type is known.
     * <p>
     * Selecting an output type that does not match the actual hardware can produce unexpected
     * results, especially with AVAudioEnvironmentOutputTypeBuiltInSpeakers. An app choosing
     * a value other than AVAudio3DMixingOutputTypeAuto should listen to route change
     * notifications and update the output type accordingly.
     * <p>
     * Default:    AVAudio3DMixingOutputTypeAuto
     */
    @Generated
    @Selector("outputType")
    @NInt
    public native long outputType();

    /**
     * [@property] outputVolume
     * <p>
     * The mixer's output volume.
     * <p>
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

    /**
     * [@property] reverbParameters
     * <p>
     * The reverb parameters for the environment
     */
    @Generated
    @Selector("reverbParameters")
    public native AVAudioEnvironmentReverbParameters reverbParameters();

    /**
     * [@property] listenerAngularOrientation
     * <p>
     * The listener's orientation in the environment
     * <p>
     * Changing listenerAngularOrientation will result in a corresponding change in listenerVectorOrientation.
     * All angles are specified in degrees.
     * Default:
     * The default orientation is with the listener looking directly along the negative Z axis.
     * yaw: 0.0
     * pitch: 0.0
     * roll: 0.0
     */
    @Generated
    @Selector("setListenerAngularOrientation:")
    public native void setListenerAngularOrientation(@ByValue AVAudio3DAngularOrientation value);

    /**
     * [@property] listenerPosition
     * <p>
     * Sets the listener's position in the 3D environment
     * <p>
     * The coordinates are specified in meters.
     * Default:
     * The default position of the listener is at the origin.
     * x: 0.0
     * y: 0.0
     * z: 0.0
     */
    @Generated
    @Selector("setListenerPosition:")
    public native void setListenerPosition(@ByValue AVAudio3DPoint value);

    /**
     * [@property] listenerVectorOrientation
     * <p>
     * The listener's orientation in the environment
     * <p>
     * Changing listenerVectorOrientation will result in a corresponding change in listenerAngularOrientation.
     * Default:
     * The default orientation is with the listener looking directly along the negative Z axis.
     * forward: (0, 0, -1)
     * up:      (0, 1, 0)
     */
    @Generated
    @Selector("setListenerVectorOrientation:")
    public native void setListenerVectorOrientation(@ByValue AVAudio3DVectorOrientation value);

    @Generated
    @Selector("setObstruction:")
    public native void setObstruction(float value);

    @Generated
    @Selector("setOcclusion:")
    public native void setOcclusion(float value);

    /**
     * [@property] outputType
     * <p>
     * Type of output hardware to be used with AVAudio3DMixingRenderingAlgorithmAuto
     * <p>
     * Output hardware cannot be automatically determined in Manual Rendering modes or for wired
     * output. This property can be used to override the output type if the correct type is known.
     * <p>
     * Selecting an output type that does not match the actual hardware can produce unexpected
     * results, especially with AVAudioEnvironmentOutputTypeBuiltInSpeakers. An app choosing
     * a value other than AVAudio3DMixingOutputTypeAuto should listen to route change
     * notifications and update the output type accordingly.
     * <p>
     * Default:    AVAudio3DMixingOutputTypeAuto
     */
    @Generated
    @Selector("setOutputType:")
    public native void setOutputType(@NInt long value);

    /**
     * [@property] outputVolume
     * <p>
     * The mixer's output volume.
     * <p>
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

package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.opaque.AudioComponentInstance;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * AVAudioIONode
 * <p>
 * Base class for a node that performs audio input or output in the engine.
 * <p>
 * When the engine is configured to render to/from an audio device, on macOS, AVAudioInputNode
 * and AVAudioOutputNode communicate with the system's default input and output devices.
 * On iOS, they communicate with the devices appropriate to the app's AVAudioSession category
 * and other configuration, also considering the user's actions such as
 * connecting/disconnecting external devices.
 * <p>
 * In the manual rendering mode, the AVAudioInputNode and AVAudioOutputNode perform the input
 * and output in the engine, in response to client's request.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioIONode extends AVAudioNode {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioIONode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioIONode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioIONode allocWithZone(VoidPtr zone);

    /**
     * [@property] audioUnit
     * <p>
     * The node's underlying AudioUnit, if any.
     * <p>
     * This is only necessary for certain advanced usages.
     */
    @Generated
    @Selector("audioUnit")
    public native AudioComponentInstance audioUnit();

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
    public native AVAudioIONode init();

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

    /**
     * [@property] voiceProcessingEnabled
     * <p>
     * Indicates whether voice processing is enabled.
     */
    @Generated
    @Selector("isVoiceProcessingEnabled")
    public native boolean isVoiceProcessingEnabled();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioIONode new_objc();

    /**
     * [@property] presentationLatency
     * <p>
     * The presentation or hardware latency, applicable when the engine is rendering to/from an
     * audio device.
     * <p>
     * This corresponds to kAudioDevicePropertyLatency and kAudioStreamPropertyLatency.
     * See <CoreAudio/AudioHardwareBase.h>.
     */
    @Generated
    @Selector("presentationLatency")
    public native double presentationLatency();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * setVoiceProcessingEnabled:error:
     * <p>
     * Enable or disable voice processing on the IO node.
     * <p>
     * If enabled, the input node does signal processing on the incoming audio (taking out any
     * of the audio that is played from the device at a given time from the incoming audio).
     * Disabling this mode on either of the IO nodes automatically disabled it on the other IO node.
     * <p>
     * Voice processing requires both input and output nodes to be in the voice processing mode.
     * Enabling this mode on either of the IO nodes automatically enables it on the other IO node.
     * Voice processing is only supported when the engine is rendering to the audio device and not
     * in the manual rendering mode.
     * Voice processing can only be be enabled or disabled when the engine is in a stopped state.
     * <p>
     * The output format of the input node and the input format of the output node have to be
     * the same and they can only be changed when the engine is in a stopped state.
     *
     * @param enabled  Whether voice processing is to be enabled.
     * @param outError On exit, if the IO node cannot enable or diable voice processing, a description of the error
     * @return YES for success
     */
    @Generated
    @Selector("setVoiceProcessingEnabled:error:")
    public native boolean setVoiceProcessingEnabledError(boolean enabled,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}

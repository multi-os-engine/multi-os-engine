package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * MIDIUMPEndpoint
 * 
 * An object representating a UMP Endpoint.
 * 
 * MIDIUMPEndpoint encapsulates a MIDI source and MIDI destination as a
 * bidirectional MIDI 2.0 communication node along with any associated stream
 * configuration metadata.
 * 
 * It is not necessary to create a MIDIUMPEndpoint or other MIDI endpoint in order to
 * use UMP natively. Any standard MIDI endpoint created with a specified MIDIProtocolID
 * is assumed to use all 16 UMP groups for the same unspecified function and to neither
 * transmit nor receive jitter-reduction timestamps.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDIUMPEndpoint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDIUMPEndpoint(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] MIDIDestination
     * 
     * The MIDI destination for the UMP endpoint.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("MIDIDestination")
    public native int MIDIDestination();

    /**
     * [@property] MIDIProtocol
     * 
     * The MIDI protocol currently used by the UMP endpoint.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("MIDIProtocol")
    public native int MIDIProtocol();

    /**
     * [@property] MIDISource
     * 
     * The MIDI source for the UMP endpoint.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("MIDISource")
    public native int MIDISource();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDIUMPEndpoint alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDIUMPEndpoint allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] deviceInfo
     * 
     * The MIDI 2.0 Device identity information associated with the device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("deviceInfo")
    @NotNull
    public native MIDI2DeviceInfo deviceInfo();

    /**
     * [@property] endpointType
     * 
     * Indicates the type of UMP Endpoint, if known.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("endpointType")
    public native byte endpointType();

    /**
     * [@property] functionBlocks
     * 
     * The Function Blocks associated with the UMP endpoint, if any.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("functionBlocks")
    @NotNull
    public native NSArray<? extends MIDIUMPFunctionBlock> functionBlocks();

    /**
     * [@property] hasJRTSReceiveCapability
     * 
     * Jitter-reduction timestamp receive capability.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasJRTSReceiveCapability")
    public native boolean hasJRTSReceiveCapability();

    /**
     * [@property] hasJRTSTransmitCapability
     * 
     * Jitter-reduction timestamp transmit capability
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasJRTSTransmitCapability")
    public native boolean hasJRTSTransmitCapability();

    /**
     * [@property] hasStaticFunctionBlocks
     * 
     * Indicates if the Function Block state will never change once discovered.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("hasStaticFunctionBlocks")
    public native boolean hasStaticFunctionBlocks();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDIUMPEndpoint init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] name
     * 
     * The UTF-8 encoded name of the UMP endpoint.
     * 
     * The name shall not be any longer than 98 bytes of UTF-8 Text.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native MIDIUMPEndpoint new_objc();

    /**
     * [@property] productInstanceID
     * 
     * Serial number (or similar value) uniquely identifying this manufacturer/family/model,
     * up to 42 bytes of ASCII Text in the ordinal range 32-126.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("productInstanceID")
    @NotNull
    public native String productInstanceID();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] functionBlocks
     * 
     * The Function Blocks associated with the UMP endpoint, if any.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setFunctionBlocks:")
    public native void setFunctionBlocks(@NotNull NSArray<? extends MIDIUMPFunctionBlock> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] supportedMIDIProtocols
     * 
     * All protocols the UMP endpoint is capable of using for communication.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportedMIDIProtocols")
    public native byte supportedMIDIProtocols();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
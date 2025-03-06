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
 * MIDICIDevice
 * 
 * An object representing a MIDI-CI Device.
 * 
 * The client instance MIDICIDeviceManager maintains a list of discovered CI devices.
 * MIDICIDevice objects are not constructible via API.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDICIDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDICIDevice(Pointer peer) {
        super(peer);
    }

    /**
     * [@property] MUID
     * 
     * The MIDI unique identifier (MUID) assigned to the CI device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("MUID")
    public native int MUID();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDICIDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDICIDevice allocWithZone(VoidPtr zone);

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
     * The basic information describing the CI device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("deviceInfo")
    @NotNull
    public native MIDI2DeviceInfo deviceInfo();

    /**
     * [@property] deviceType
     * 
     * The type of MIDI-CI device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("deviceType")
    public native byte deviceType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDICIDevice init();

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
     * [@property] maxPropertyExchangeRequests
     * 
     * The maximum number of simultaneous Property Exchange requests, if supported.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("maxPropertyExchangeRequests")
    @NUInt
    public native long maxPropertyExchangeRequests();

    /**
     * [@property] maxSysExSize
     * 
     * The maximum receivable MIDI System Exclusive size for this CI device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("maxSysExSize")
    @NUInt
    public native long maxSysExSize();

    @Generated
    @Owned
    @Selector("new")
    public static native MIDICIDevice new_objc();

    /**
     * [@property] profiles
     * 
     * The MIDI-CI Profiles that are registered to the Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("profiles")
    @NotNull
    public native NSArray<? extends MIDIUMPCIProfile> profiles();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] supportsProcessInquiry
     * 
     * MIDI-CI Process Inquiry capability.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsProcessInquiry")
    public native boolean supportsProcessInquiry();

    /**
     * [@property] supportsProfileConfiguration
     * 
     * MIDI-CI Profile Configuration capability.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsProfileConfiguration")
    public native boolean supportsProfileConfiguration();

    /**
     * [@property] supportsPropertyExchange
     * 
     * MIDI-CI Property Exchange capability.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsPropertyExchange")
    public native boolean supportsPropertyExchange();

    /**
     * [@property] supportsProtocolNegotiation
     * 
     * MIDI-CI Protocol Negotiation capability.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("supportsProtocolNegotiation")
    public native boolean supportsProtocolNegotiation();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
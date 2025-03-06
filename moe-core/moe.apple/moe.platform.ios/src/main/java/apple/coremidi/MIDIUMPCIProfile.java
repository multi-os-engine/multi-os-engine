package apple.coremidi;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
 * MIDIUMPCIProfile
 * 
 * An object representing Capability Inquiry Profile on a MIDICIDevice.
 * 
 * MIDI-CI profiles describe a mapping of MIDI messages to specific sounds and synthesis
 * behaviors, e.g. General MIDI, a drawbar organ, etc. A MIDI-CI Profile may be a standard
 * registered Profile or vendor-specific.
 * 
 * A MIDI-CI Profile ID consists of 5 bytes.
 * ===============================================================
 * Standard Profile Vendor-Specific Profile
 * Profile ID Byte 1: 0x7E Standard Profile Manufacturer SysEx ID 1 Profile
 * Profile ID Byte 2: Profile Bank Manufacturer SysEx ID 2 Profile
 * Profile ID Byte 3: Profile Number Manufacturer SysEx ID 3 Profile
 * Profile ID Byte 4: Profile Version Manufacturer-specific Info
 * Profile ID Byte 5: Profile Level Manufacturer-specific Info
 * 
 * MIDI-CI Profiles have the following generalized types:
 * 
 * Profile Type Source Channels Channel Range
 * ============ ========== =========== ========================
 * Single-channel 0x00~0x0F 1 1 channel (1 to 16) of a Group
 * Group 0x7E 16 All channels of a Group
 * Function Block 0x7F 16 per Group All channels of a Function Block
 * Multi-channel 0x00~0x0F 2 or more Profile-specific
 * 
 * MIDIUMPCIProfile objects may only be registered to a single CI device, and any number
 * of MIDIUMPCIProfile objects containg the same profile ID may be registered to CI
 * devices in the MIDI 2.0 subsystem.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDIUMPCIProfile extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDIUMPCIProfile(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDIUMPCIProfile alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDIUMPCIProfile allocWithZone(VoidPtr zone);

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
     * [@property] enabledChannelCount
     * 
     * The number of channels currently enabled on the Profile. When the profile is disabled,
     * this value is set to 0.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("enabledChannelCount")
    public native char enabledChannelCount();

    /**
     * [@property] firstChannel
     * 
     * The first channel number supported on the Profile.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("firstChannel")
    public native byte firstChannel();

    /**
     * [@property] groupOffset
     * 
     * For Group profiles defined on Function Blocks, the value to be added to the lowest
     * Function Block UMP Group for messaging (e.g., a Group Profile defined on the second
     * Group of a Function Block has a groupOffset of 1).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("groupOffset")
    public native byte groupOffset();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDIUMPCIProfile init();

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

    /**
     * [@property] isEnabled
     * 
     * The enable state of the Profile.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

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
     * The name of the MIDI-CI proifle.
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
    public static native MIDIUMPCIProfile new_objc();

    /**
     * [@property] profileType
     * 
     * The type of MIDI-CI Profile, i.e., single-channel, multichannel, Group, or Function Block.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("profileType")
    public native byte profileType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setProfileState:enabledChannelCount:error:
     * 
     * Issue a Set Profile On or Set Profile Off request on this profile using the MIDI server's
     * MUID.
     * 
     * The result of this operation, if any, is received via the profile notification
     * posted by the MIDICIDeviceManager.
     * Returns YES if the request is valid and the request was dispatched.
     * 
     * API-Since: 18.0
     * 
     * @param isEnabled           YES if setting the Profile to on.
     * @param enabledChannelCount The requsted number of channels to be enabled when
     *                            the Profile is enabled. This field is only used when isOn
     *                            is set to YES and the profile can enable a variable number
     *                            of channels. Otherwise, it is ignored.
     * @param error               The out-error used if an error occurred.
     */
    @Generated
    @Selector("setProfileState:enabledChannelCount:error:")
    public native boolean setProfileStateEnabledChannelCountError(boolean isEnabled, char enabledChannelCount,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] totalChannelCount
     * 
     * The total number of channels supported by the Profile.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("totalChannelCount")
    public native char totalChannelCount();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
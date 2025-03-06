package apple.coremidi;

import apple.NSObject;
import apple.coremidi.struct.MIDI2DeviceManufacturer;
import apple.coremidi.struct.MIDI2DeviceRevisionLevel;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * MIDI2DeviceInfo
 * 
 * An NSObject containing basic information about a MIDI 2.0 device. Used by
 * MIDIUMPEndpointPair and MIDICIDevice.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMIDI")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MIDI2DeviceInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MIDI2DeviceInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MIDI2DeviceInfo alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MIDI2DeviceInfo allocWithZone(VoidPtr zone);

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
     * [@property] family
     * 
     * The family of models to which the device belongs, up to 14 bits.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("family")
    public native char family();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MIDI2DeviceInfo init();

    /**
     * initWithManufacturerID:family:modelNumber:revisionLevel:
     * 
     * The initializer for constructing the MIDI2DeviceInfo object.
     * 
     * Provided values for family or modelNumber must be within their expected
     * bit range. For example, if modelNumber is outside of the range of a 14-bit number.
     * 
     * API-Since: 18.0
     * 
     * @param manufacturerID The 3-Byte manufacturer System Exclusive ID.
     * @param family         The 14-bit device family.
     * @param modelNumber    The 14-bit model number.
     * @param revisionLevel  The 4-Byte revision level.
     */
    @Generated
    @Selector("initWithManufacturerID:family:modelNumber:revisionLevel:")
    public native MIDI2DeviceInfo initWithManufacturerIDFamilyModelNumberRevisionLevel(
            @ByValue MIDI2DeviceManufacturer manufacturerID, char family, char modelNumber,
            @ByValue MIDI2DeviceRevisionLevel revisionLevel);

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
     * [@property] manufacturerID
     * 
     * The MIDI System Exclusive ID of the device manufacturer, up to 3-Bytes.
     * 
     * One-byte SysEx IDs use only the least significant byte (e.g., Apple's System Exclusive ID, 0x11).
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("manufacturerID")
    @ByValue
    public native MIDI2DeviceManufacturer manufacturerID();

    /**
     * [@property] modelNumber
     * 
     * The specific model from the device manufacturer, up to 14 bits.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("modelNumber")
    public native char modelNumber();

    @Generated
    @Owned
    @Selector("new")
    public static native MIDI2DeviceInfo new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] revisionLevel
     * 
     * The version number of a device model number.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("revisionLevel")
    @ByValue
    public native MIDI2DeviceRevisionLevel revisionLevel();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
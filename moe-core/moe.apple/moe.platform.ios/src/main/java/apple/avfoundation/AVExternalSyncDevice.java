package apple.avfoundation;

import apple.NSObject;
import apple.coremedia.opaque.CMClockRef;
import apple.coremedia.struct.CMTime;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUUID;
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
 * An external sync device connected to a host device that can be used to drive the timing of an internal component,
 * such as a camera sensor.
 * 
 * Each instance of ``AVExternalSyncDevice`` corresponds to a physical external device that can drive an internal
 * component, like a camera readout. You cannot create instances of ``AVExternalSyncDevice``. Instead, you obtain an
 * array of all currently available external sync devices using ``AVExternalSyncDeviceDiscoverySession``.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVExternalSyncDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVExternalSyncDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVExternalSyncDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVExternalSyncDevice allocWithZone(VoidPtr zone);

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

    /**
     * A clock representing the source of time from the external sync device.
     * 
     * This property returns `NULL` until the ``status`` reaches ``AVExternalSyncDeviceStatusActiveSync``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("clock")
    @Nullable
    public native CMClockRef clock();

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
    public native AVExternalSyncDevice init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native AVExternalSyncDevice new_objc();

    /**
     * The USB product identifier associated with the external sync device.
     * 
     * This `UInt32` value comes from the hardware vendor, and returns 0 if not available. Use this value in conjunction
     * with the ``vendorID`` to determine a specific product.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("productID")
    public native int productID();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Delay to wait before starting the frame capture.
     * 
     * An external sync is generally used to configure multiple devices in the real world. A display and a camera may
     * receive a signal at the same time, but that does not mean the refresh of the display and camera are aligned in a
     * way that does not cause tearing in the recording. The signal compensation delay can be used to offset the readout
     * of a camera on an intra-frame scale.
     * 
     * - Important: You should always set this property to a value less than the frame duration at which the camera is
     * operating.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSignalCompensationDelay:")
    public native void setSignalCompensationDelay(@ByValue CMTime value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Delay to wait before starting the frame capture.
     * 
     * An external sync is generally used to configure multiple devices in the real world. A display and a camera may
     * receive a signal at the same time, but that does not mean the refresh of the display and camera are aligned in a
     * way that does not cause tearing in the recording. The signal compensation delay can be used to offset the readout
     * of a camera on an intra-frame scale.
     * 
     * - Important: You should always set this property to a value less than the frame duration at which the camera is
     * operating.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("signalCompensationDelay")
    @ByValue
    public native CMTime signalCompensationDelay();

    /**
     * The status of the externally connected device.
     * 
     * Use this property to query the current connection status of the external sync device. This property is key-value
     * observable.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("status")
    @NInt
    public native long status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * A unique identifier for an external sync device.
     * 
     * Use this property to select a specific external sync device.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("uuid")
    @NotNull
    public native NSUUID uuid();

    /**
     * The USB vendor identifier associated with the external sync device.
     * 
     * This `UInt32` value is provided by the hardware vendor, and returns 0 if not available.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("vendorID")
    public native int vendorID();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
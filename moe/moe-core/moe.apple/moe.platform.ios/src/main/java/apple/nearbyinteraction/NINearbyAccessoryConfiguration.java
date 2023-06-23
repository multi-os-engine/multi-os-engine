package apple.nearbyinteraction;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A session configuration that enables interaction with supported accessories.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NINearbyAccessoryConfiguration extends NIConfiguration {
    static {
        NatJ.register();
    }

    @Generated
    protected NINearbyAccessoryConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * The discovery token identifying the accessory device for this session configuration.
     * 
     * NINearbyObject updates for this accessory will contain this discovery token.
     */
    @NotNull
    @Generated
    @Selector("accessoryDiscoveryToken")
    public native NIDiscoveryToken accessoryDiscoveryToken();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NINearbyAccessoryConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NINearbyAccessoryConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
    public native NINearbyAccessoryConfiguration init();

    @Generated
    @Selector("initWithCoder:")
    public native NINearbyAccessoryConfiguration initWithCoder(@NotNull NSCoder coder);

    /**
     * Create a new nearby accessory configuration using data received from the accessory.
     * 
     * @param data  Configuration data received from the accessory.
     * @param error An optional out error parameter that will be populated with an error if the provided data is invalid
     *              or unsupported.
     */
    @Generated
    @Selector("initWithData:error:")
    public native NINearbyAccessoryConfiguration initWithDataError(@NotNull NSData data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NINearbyAccessoryConfiguration new_objc();

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

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Create a new nearby accessory configuration for an accessory that is also a paired Bluetooth device
     * 
     * The accessory must be a Bluetooth LE peripheral that is paired, actively connected, and implements the Nearby
     * Interaction Service and Accessory Configuration Characteristic.
     * 
     * API-Since: 16.0
     * 
     * @param accessoryData           Configuration data received from the accessory
     * @param bluetoothPeerIdentifier The accessory's Bluetooth identifier
     * @param error                   An optional out error parameter that will be populated with an error if the
     *                                provided inputs are invalid or unsupported.
     */
    @Generated
    @Selector("initWithAccessoryData:bluetoothPeerIdentifier:error:")
    public native NINearbyAccessoryConfiguration initWithAccessoryDataBluetoothPeerIdentifierError(
            @NotNull NSData accessoryData, @NotNull NSUUID identifier,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Enables camera assistance during the NISession run with this configuration
     * 
     * If YES, optionally call -setARSession: on the NISession before calling -runWithConfiguration:
     * If YES and setARSession: is not called, an ARSession will automatically be created
     * If YES and the platform does not support camera assistance, the NISession will generate an error when
     * runWithConfiguration: is called
     * [@note] Check supportsCameraAssistance property in NIDeviceCapability returned from deviceCapabilities properties
     * on NISession
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isCameraAssistanceEnabled")
    public native boolean isCameraAssistanceEnabled();

    /**
     * Enables camera assistance during the NISession run with this configuration
     * 
     * If YES, optionally call -setARSession: on the NISession before calling -runWithConfiguration:
     * If YES and setARSession: is not called, an ARSession will automatically be created
     * If YES and the platform does not support camera assistance, the NISession will generate an error when
     * runWithConfiguration: is called
     * [@note] Check supportsCameraAssistance property in NIDeviceCapability returned from deviceCapabilities properties
     * on NISession
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCameraAssistanceEnabled:")
    public native void setCameraAssistanceEnabled(boolean value);
}

package apple.chip;

import apple.NSObject;
import apple.chip.protocol.CHIPDevicePairingDelegate;
import apple.chip.protocol.CHIPKeypair;
import apple.chip.protocol.CHIPPersistentStorageDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPDeviceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPDeviceController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPDeviceController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CHIPDeviceController allocWithZone(VoidPtr zone);

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

    /**
     * Return the Node Id assigned to the controller.
     */
    @Generated
    @Selector("getControllerNodeId")
    public native NSNumber getControllerNodeId();

    @Generated
    @Selector("getPairedDevice:error:")
    public native CHIPDevice getPairedDeviceError(long deviceID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CHIPDeviceController init();

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
    @Selector("isRunning")
    public native boolean isRunning();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPDeviceController new_objc();

    @Generated
    @Selector("pairDevice:address:port:discriminator:setupPINCode:error:")
    public native boolean pairDeviceAddressPortDiscriminatorSetupPINCodeError(long deviceID, String address, char port,
            char discriminator, int setupPINCode, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("pairDevice:onboardingPayload:onboardingPayloadType:error:")
    public native boolean pairDeviceOnboardingPayloadOnboardingPayloadTypeError(long deviceID, String onboardingPayload,
            @NUInt long onboardingPayloadType, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("pairDeviceWithoutSecurity:address:port:error:")
    public native boolean pairDeviceWithoutSecurityAddressPortError(long deviceID, String address, char port,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setListenPort:")
    public native void setListenPort(char port);

    /**
     * Set the Delegate for the Device Pairing  as well as the Queue on which the Delegate callbacks will be triggered
     *
     * @param[in] delegate The delegate the pairing process should use
     * @param[in] queue The queue on which the callbacks will be delivered
     */
    @Generated
    @Selector("setPairingDelegate:queue:")
    public native void setPairingDelegateQueue(@Mapped(ObjCObjectMapper.class) CHIPDevicePairingDelegate delegate,
            NSObject queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Return the single CHIPDeviceController we support existing.
     */
    @Generated
    @Selector("sharedController")
    public static native CHIPDeviceController sharedController();

    /**
     * Shutdown the CHIP Stack. Repeated calls to shutdown without calls to startup in between are NO-OPs.
     */
    @Generated
    @Selector("shutdown")
    public native boolean shutdown();

    @Generated
    @Selector("stopDevicePairing:error:")
    public native boolean stopDevicePairingError(long deviceID,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("unpairDevice:error:")
    public native boolean unpairDeviceError(long deviceID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("updateDevice:fabricId:")
    public native void updateDeviceFabricId(long deviceID, long fabricId);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("getConnectedDevice:queue:completionHandler:")
    public native boolean getConnectedDeviceQueueCompletionHandler(long deviceID, NSObject queue,
            @ObjCBlock(name = "call_getConnectedDeviceQueueCompletionHandler") Block_getConnectedDeviceQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getConnectedDeviceQueueCompletionHandler {
        @Generated
        void call_getConnectedDeviceQueueCompletionHandler(CHIPDevice device, NSError error);
    }

    @Generated
    @Selector("isDevicePaired:error:")
    public native boolean isDevicePairedError(long deviceID, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("pairDevice:discriminator:setupPINCode:csrNonce:error:")
    public native boolean pairDeviceDiscriminatorSetupPINCodeCsrNonceError(long deviceID, char discriminator,
            int setupPINCode, NSData csrNonce, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Start the CHIP Stack. Repeated calls to startup without calls to shutdown in between are NO-OPs. Use the isRunning property to
     * check if the stack needs to be started up.
     *
     * @param[in] storageDelegate The delegate for persistent storage
     * @param[in] vendorId The vendor ID of the commissioner application
     * @param[in] nocSigner The CHIPKeypair that is used to generate and sign Node Operational Credentials
     */
    @Generated
    @Selector("startup:vendorId:nocSigner:")
    public native boolean startupVendorIdNocSigner(
            @Mapped(ObjCObjectMapper.class) CHIPPersistentStorageDelegate storageDelegate, char vendorId,
            @Mapped(ObjCObjectMapper.class) CHIPKeypair nocSigner);
}

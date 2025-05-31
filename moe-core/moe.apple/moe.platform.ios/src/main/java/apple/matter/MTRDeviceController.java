package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.NSXPCConnection;
import apple.foundation.NSXPCInterface;
import apple.matter.protocol.MTRCommissionableBrowserDelegate;
import apple.matter.protocol.MTRDeviceControllerDelegate;
import apple.matter.protocol.MTRDevicePairingDelegate;
import apple.matter.protocol.MTRNOCChainIssuer;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSUUID;

/**
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceController allocWithZone(VoidPtr zone);

    /**
     * Return the attestation challenge for the secure session of the device being commissioned.
     * 
     * Attempts to retrieve the attestation challenge for a commissionee with the given Device ID.
     * Returns nil if given Device ID does not match an active commissionee, or if a Secure Session is not availale.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("attestationChallengeForDeviceID:")
    @Nullable
    public native NSData attestationChallengeForDeviceID(@NotNull NSNumber deviceID);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancel commissioning for the given node id. This will shut down any existing
     * commissioning session for that node id.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("cancelCommissioningForNodeID:error:")
    public native boolean cancelCommissioningForNodeIDError(@NotNull NSNumber nodeID,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use commissionNodeWithID:commissioningParams:error:
     */
    @Generated
    @Deprecated
    @Selector("commissionDevice:commissioningParams:error:")
    public native boolean commissionDeviceCommissioningParamsError(long deviceId,
            @NotNull MTRCommissioningParameters commissioningParams,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Commission the node with the given node ID. The node ID must match the node
     * ID that was used to set up the commissioning session.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("commissionNodeWithID:commissioningParams:error:")
    public native boolean commissionNodeWithIDCommissioningParamsError(@NotNull NSNumber nodeID,
            @NotNull MTRCommissioningParameters commissioningParams,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Compute a PASE verifier for the desired setup passcode.
     * 
     * @param[in] setupPasscode The desired passcode to use.
     * @param[in] iterations The number of iterations to use when generating the verifier.
     * @param[in] salt The 16-byte salt for verifier computation.
     * 
     *            Returns nil on errors (e.g. salt has the wrong size), otherwise the computed
     *            verifier bytes.
     * 
     *            API-Since: 16.4
     */
    @Generated
    @Selector("computePASEVerifierForSetupPasscode:iterations:salt:error:")
    @Nullable
    public static native NSData computePASEVerifierForSetupPasscodeIterationsSaltError(@NotNull NSNumber setupPasscode,
            @NotNull NSNumber iterations, @NotNull NSData salt,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use computePASEVerifierForSetupPasscode:iterations:salt:error:
     */
    @Generated
    @Deprecated
    @Selector("computePaseVerifier:iterations:salt:")
    @Nullable
    public native NSData computePaseVerifierIterationsSalt(int setupPincode, int iterations, @NotNull NSData salt);

    /**
     * Call this method after MTRDeviceAttestationDelegate
     * deviceAttestationFailedForController:opaqueDeviceHandle:error: or
     * deviceAttestationCompletedForController:opaqueDeviceHandle:attestationDeviceInfo:error:
     * is called to continue commissioning the device.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("continueCommissioningDevice:ignoreAttestationFailure:error:")
    public native boolean continueCommissioningDeviceIgnoreAttestationFailureError(@NotNull VoidPtr opaqueDeviceHandle,
            boolean ignoreAttestationFailure, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Return the Node ID assigned to the controller. Will return nil if the
     * controller is not running (and hence does not know its node id).
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("controllerNodeID")
    @Nullable
    public native NSNumber controllerNodeID();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use controllerNodeID
     */
    @Generated
    @Deprecated
    @Selector("controllerNodeId")
    @Nullable
    public native NSNumber controllerNodeId();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Returns a deserialized read parameter object from an object received over XPC
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("decodeXPCReadParams:")
    @Nullable
    public static native MTRReadParams decodeXPCReadParams(@Nullable NSDictionary<String, ?> params);

    /**
     * Returns a decoded values object from a values object received from XPC for read, write and command interactions
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("decodeXPCResponseValues:")
    @Nullable
    public static native NSArray<? extends NSDictionary<String, ?>> decodeXPCResponseValues(
            @Nullable NSArray<? extends NSDictionary<String, ?>> values);

    /**
     * Returns a deserialized subscribe parameter object from an object received over XPC
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("decodeXPCSubscribeParams:")
    @Nullable
    public static native MTRSubscribeParams decodeXPCSubscribeParams(@Nullable NSDictionary<String, ?> params);

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Get an MTRBaseDevice for a commissioning session that was set up for the
     * given node ID. Returns nil if no such commissioning session is available.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deviceBeingCommissionedWithNodeID:error:")
    @Nullable
    public native MTRBaseDevice deviceBeingCommissionedWithNodeIDError(@NotNull NSNumber nodeID,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns a serialized read parameter object to send over XPC
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("encodeXPCReadParams:")
    @Nullable
    public static native NSDictionary<String, ?> encodeXPCReadParams(@NotNull MTRReadParams params);

    /**
     * Returns an encoded values object to send over XPC for read, write and command interactions
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("encodeXPCResponseValues:")
    @Nullable
    public static native NSArray<? extends NSDictionary<String, ?>> encodeXPCResponseValues(
            @Nullable NSArray<? extends NSDictionary<String, ?>> values);

    /**
     * Returns a serialized subscribe parameter object to send over XPC
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("encodeXPCSubscribeParams:")
    @Nullable
    public static native NSDictionary<String, ?> encodeXPCSubscribeParams(@Nullable MTRSubscribeParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use attestationChallengeForDeviceID
     */
    @Generated
    @Deprecated
    @Selector("fetchAttestationChallengeForDeviceId:")
    @Nullable
    public native NSData fetchAttestationChallengeForDeviceId(long deviceId);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use [MTRBaseDevice deviceWithNodeID:controller:]
     */
    @Generated
    @Deprecated
    @Selector("getBaseDevice:queue:completionHandler:")
    public native boolean getBaseDeviceQueueCompletionHandler(long deviceID, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_getBaseDeviceQueueCompletionHandler") @NotNull Block_getBaseDeviceQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getBaseDeviceQueueCompletionHandler {
        @Generated
        void call_getBaseDeviceQueueCompletionHandler(@Nullable MTRBaseDevice device, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use deviceBeingCommissionedWithNodeID:error:
     */
    @Generated
    @Deprecated
    @Selector("getDeviceBeingCommissioned:error:")
    @Nullable
    public native MTRBaseDevice getDeviceBeingCommissionedError(long deviceId,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDeviceController init();

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
     * If true, the controller has not been shut down yet.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

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
    public static native MTRDeviceController new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDevice or MTRBaseDevice openCommissioningWindowWithSetupPasscode
     */
    @Generated
    @Deprecated
    @Selector("openPairingWindow:duration:error:")
    public native boolean openPairingWindowDurationError(long deviceID, @NUInt long duration,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRDevice or MTRBaseDevice openCommissioningWindowWithSetupPasscode
     */
    @Generated
    @Deprecated
    @Selector("openPairingWindowWithPIN:duration:discriminator:setupPIN:error:")
    @Nullable
    public native String openPairingWindowWithPINDurationDiscriminatorSetupPINError(long deviceID, @NUInt long duration,
            @NUInt long discriminator, @NUInt long setupPIN,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setupCommissioningSessionWithPayload:newNodeID:error:
     */
    @Generated
    @Deprecated
    @Selector("pairDevice:address:port:setupPINCode:error:")
    public native boolean pairDeviceAddressPortSetupPINCodeError(long deviceID, @NotNull String address, char port,
            int setupPINCode, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setupCommissioningSessionWithPayload:newNodeID:error:
     */
    @Generated
    @Deprecated
    @Selector("pairDevice:discriminator:setupPINCode:error:")
    public native boolean pairDeviceDiscriminatorSetupPINCodeError(long deviceID, char discriminator, int setupPINCode,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setupCommissioningSessionWithPayload:newNodeID:error:
     */
    @Generated
    @Deprecated
    @Selector("pairDevice:onboardingPayload:error:")
    public native boolean pairDeviceOnboardingPayloadError(long deviceID, @NotNull String onboardingPayload,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 17.6
     * Deprecated-Message: -[MTRDeviceControllerFactory preWarmCommissioningSession]
     */
    @Deprecated
    @Generated
    @Selector("preWarmCommissioningSession")
    public native void preWarmCommissioningSession();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set the Delegate for the device controller as well as the Queue on which the Delegate callbacks will be triggered
     * 
     * @param[in] delegate The delegate the commissioning process should use
     * 
     * @param[in] queue The queue on which the callbacks will be delivered
     * 
     *            API-Since: 16.4
     */
    @Generated
    @Selector("setDeviceControllerDelegate:queue:")
    public native void setDeviceControllerDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceControllerDelegate delegate,
            @NotNull dispatch_queue_t queue);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please set the operationalCertificateIssuer in the MTRDeviceControllerStartupParams instead.
     */
    @Generated
    @Deprecated
    @Selector("setNocChainIssuer:queue:")
    public native void setNocChainIssuerQueue(@Mapped(ObjCObjectMapper.class) @NotNull MTRNOCChainIssuer nocChainIssuer,
            @NotNull dispatch_queue_t queue);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setDeviceControllerDelegate:
     */
    @Generated
    @Deprecated
    @Selector("setPairingDelegate:queue:")
    public native void setPairingDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDevicePairingDelegate delegate,
            @NotNull dispatch_queue_t queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Set up a commissioning session for a device, using the provided discovered
     * result to connect to it.
     * 
     * [@error] error indication if the commissioning session establishment can't start at all.
     * 
     * The connection information for the device will be retrieved from the discovered device.
     * A device discovered over DNS-SD will use the discovered IPs/ports, while a device discovered
     * over BLE will use the underlying CBPeripheral.
     * 
     * Then a PASE session will be established with the device, unless an error
     * occurs. MTRDeviceControllerDelegate will be notified as follows:
     * 
     * * Invalid connection information: controller:statusUpdate: with MTRCommissioningStatusFailed.
     * 
     * * Commissioning session setup fails:
     * controller:commissioningSessionEstablishmentDone: with non-nil error.
     * 
     * * Commissioning session setup succeeds:
     * controller:commissioningSessionEstablishmentDone: with nil error.
     * 
     * Once a commissioning session is set up, getDeviceBeingCommissioned
     * can be used to get an MTRBaseDevice and discover what sort of network
     * credentials the device might need, and commissionDevice can be used to
     * commission the device.
     * 
     * API-Since: 17.0
     * 
     * @param discoveredDevice a previously discovered device.
     * @param payload          a setup payload (probably created from a QR code or numeric
     *                         code onboarding payload).
     * @param newNodeID        the planned node id for the node.
     */
    @Generated
    @Selector("setupCommissioningSessionWithDiscoveredDevice:payload:newNodeID:error:")
    public native boolean setupCommissioningSessionWithDiscoveredDevicePayloadNewNodeIDError(
            @NotNull MTRCommissionableBrowserResult discoveredDevice, @NotNull MTRSetupPayload payload,
            @NotNull NSNumber newNodeID, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Set up a commissioning session for a device, using the provided setup payload
     * to discover it and connect to it.
     * 
     * [@error] error indication if discovery can't start at all (e.g. because the
     * setup payload is invalid).
     * 
     * The IP and port for the device will be discovered automatically based on the
     * provided discriminator.
     * 
     * Then a PASE session will be established with the device, unless an error
     * occurs. MTRDeviceControllerDelegate will be notified as follows:
     * 
     * * Discovery fails: controller:statusUpdate: with MTRCommissioningStatusFailed.
     * 
     * * Commissioning session setup fails:
     * controller:commissioningSessionEstablishmentDone: with non-nil error.
     * 
     * * Commissioning session setup succeeds:
     * controller:commissioningSessionEstablishmentDone: with nil error.
     * 
     * Once a commissioning session is set up, getDeviceBeingCommissioned
     * can be used to get an MTRBaseDevice and discover what sort of network
     * credentials the device might need, and commissionDevice can be used to
     * commission the device.
     * 
     * API-Since: 16.2
     * 
     * @param payload   a setup payload (probably created from a QR code or numeric
     *                  code onboarding payload).
     * @param newNodeID the planned node id for the node.
     */
    @Generated
    @Selector("setupCommissioningSessionWithPayload:newNodeID:error:")
    public native boolean setupCommissioningSessionWithPayloadNewNodeIDError(@NotNull MTRSetupPayload payload,
            @NotNull NSNumber newNodeID, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Returns a shared device controller proxy for the controller object over XPC connection.
     * 
     * @param controllerID    an implementation specific id in case multiple shared device controllers are available
     *                        over XPC connection
     * @param xpcConnectBlock block to connect to an XPC listener serving the shared device controllers in an
     *                        implementation specific
     *                        way
     * 
     *                        API-Since: 16.4
     */
    @Generated
    @Selector("sharedControllerWithID:xpcConnectBlock:")
    @NotNull
    public static native MTRDeviceController sharedControllerWithIDXpcConnectBlock(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controllerID,
            @ObjCBlock(name = "call_sharedControllerWithIDXpcConnectBlock") @NotNull Block_sharedControllerWithIDXpcConnectBlock xpcConnectBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sharedControllerWithIDXpcConnectBlock {
        @Generated
        @NotNull
        NSXPCConnection call_sharedControllerWithIDXpcConnectBlock();
    }

    /**
     * Shut down the controller. Calls to shutdown after the first one are NO-OPs.
     * This must be called, either directly or via shutting down the
     * MTRDeviceControllerFactory, to avoid leaking the controller.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("shutdown")
    public native void shutdown();

    /**
     * Start scanning for commissionable devices.
     * 
     * This method will fail if the controller factory is not running or the browse has already been started.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("startBrowseForCommissionables:queue:")
    public native boolean startBrowseForCommissionablesQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRCommissionableBrowserDelegate delegate,
            @NotNull dispatch_queue_t queue);

    /**
     * Stop scanning for commissionable devices.
     * 
     * This method will fail if the controller factory is not running or the browse has not been started.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("stopBrowseForCommissionables")
    public native boolean stopBrowseForCommissionables();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use cancelCommissioningForNodeID:error:
     */
    @Generated
    @Deprecated
    @Selector("stopDevicePairing:error:")
    public native boolean stopDevicePairingError(long deviceID,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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

    /**
     * Returns an NSXPCInterface configured for MTRDeviceControllerClientProtocol.
     * 
     * API-Since: 16.5
     */
    @Generated
    @Selector("xpcInterfaceForClientProtocol")
    @NotNull
    public static native NSXPCInterface xpcInterfaceForClientProtocol();

    /**
     * Returns an NSXPCInterface configured for MTRDeviceControllerServerProtocol.
     * 
     * API-Since: 16.5
     */
    @Generated
    @Selector("xpcInterfaceForServerProtocol")
    @NotNull
    public static native NSXPCInterface xpcInterfaceForServerProtocol();

    /**
     * Adds a Delegate to the device controller as well as the Queue on which the Delegate callbacks will be triggered
     * 
     * Multiple delegates can be added to monitor MTRDeviceController state changes. Note that there should only
     * be one delegate that responds to pairing related callbacks.
     * 
     * If a delegate is added a second time, the call would be ignored.
     * 
     * All delegates are held by weak references, and so if a delegate object goes away, it will be automatically
     * removed.
     * 
     * @param[in] delegate The delegate the commissioning process should use
     * 
     * @param[in] queue The queue on which the callbacks will be delivered
     * 
     *            API-Since: 18.2
     */
    @Generated
    @Selector("addDeviceControllerDelegate:queue:")
    public native void addDeviceControllerDelegateQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceControllerDelegate delegate,
            @NotNull dispatch_queue_t queue);

    /**
     * Add a server endpoint for this controller. The endpoint starts off enabled.
     * 
     * Will fail in the following cases:
     * 
     * 1) There is already an endpoint defined with the given endpoint id.
     * 2) There are too many endpoints defined already.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addServerEndpoint:")
    public native boolean addServerEndpoint(@NotNull MTRServerEndpoint endpoint);

    /**
     * Initialize a device controller with the provided parameters. This will:
     * 
     * 1) Auto-start the MTRDeviceControllerFactory in storage-per-controller mode
     * if it has not already been started.
     * 2) Return nil or a running controller.
     * 
     * Once this returns non-nil, it's the caller's responsibility to call shutdown
     * on the controller to avoid leaking it.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithParameters:error:")
    @Nullable
    public native MTRDeviceController initWithParametersError(@NotNull MTRDeviceControllerAbstractParameters parameters,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * If true, the controller has been suspended via `suspend` and not resumed yet.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("isSuspended")
    public native boolean isSuspended();

    /**
     * Removes a Delegate from the device controller
     * 
     * @param[in] delegate The delegate to be removed
     * 
     *            API-Since: 18.2
     */
    @Generated
    @Selector("removeDeviceControllerDelegate:")
    public native void removeDeviceControllerDelegate(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceControllerDelegate delegate);

    /**
     * Remove the given server endpoint without being notified when the removal
     * completes.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("removeServerEndpoint:")
    public native void removeServerEndpoint(@NotNull MTRServerEndpoint endpoint);

    /**
     * Remove the given server endpoint from this controller. If the endpoint is
     * not attached to this controller, will just call the completion and do nothing
     * else.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("removeServerEndpoint:queue:completion:")
    public native void removeServerEndpointQueueCompletion(@NotNull MTRServerEndpoint endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_removeServerEndpointQueueCompletion") @NotNull Block_removeServerEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeServerEndpointQueueCompletion {
        @Generated
        void call_removeServerEndpointQueueCompletion();
    }

    /**
     * Resume the controller. This has no effect if the controller is not
     * suspended.
     * 
     * A resume following any number of suspend calls will resume the controller;
     * there does not need to be a resume call to match every suspend call.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * Suspend the controller. This will attempt to stop all network traffic associated
     * with the controller. The controller will remain suspended until it is
     * resumed.
     * 
     * Suspending an already-suspended controller has no effect.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("suspend")
    public native void suspend();

    /**
     * The ID assigned to this controller at creation time.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("uniqueIdentifier")
    @NotNull
    public native NSUUID uniqueIdentifier();

    /**
     * Returns the list of MTRDevice instances that this controller has loaded
     * into memory. Returns an empty array if no devices are in memory.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("devices")
    @NotNull
    public native NSArray<? extends MTRDevice> devices();

    /**
     * Forget any information we have about the device with the given node ID. That
     * includes clearing any information we have stored about it.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("forgetDeviceWithNodeID:")
    public native void forgetDeviceWithNodeID(@NotNull NSNumber nodeID);

    /**
     * Returns the list of node IDs for which this controller has stored
     * information. Returns empty list if the controller does not have any
     * information stored.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("nodesWithStoredData")
    @NotNull
    public native NSArray<? extends NSNumber> nodesWithStoredData();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use sharedControllerWithID:xpcConnectBlock:
     */
    @Generated
    @Deprecated
    @Selector("sharedControllerWithId:xpcConnectBlock:")
    @NotNull
    public static native MTRDeviceController sharedControllerWithIdXpcConnectBlock(
            @Mapped(ObjCObjectMapper.class) @Nullable Object controllerID,
            @ObjCBlock(name = "call_sharedControllerWithIdXpcConnectBlock") @NotNull Block_sharedControllerWithIdXpcConnectBlock xpcConnectBlock);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sharedControllerWithIdXpcConnectBlock {
        @Generated
        @NotNull
        NSXPCConnection call_sharedControllerWithIdXpcConnectBlock();
    }
}
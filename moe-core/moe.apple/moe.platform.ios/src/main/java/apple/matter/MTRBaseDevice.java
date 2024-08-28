package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseDevice allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Pease use deregisterReportHandlersWithQueue:completion:
     */
    @Generated
    @Deprecated
    @Selector("deregisterReportHandlersWithClientQueue:completion:")
    public native void deregisterReportHandlersWithClientQueueCompletion(@NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_deregisterReportHandlersWithClientQueueCompletion") @NotNull Block_deregisterReportHandlersWithClientQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deregisterReportHandlersWithClientQueueCompletion {
        @Generated
        void call_deregisterReportHandlersWithClientQueueCompletion();
    }

    /**
     * Deregister all local report handlers for a remote device
     * 
     * This method is applicable only for a remote device. For a local device, the stack has to be shutdown to stop
     * report handlers.
     * There could be multiple clients accessing a node through a remote controller object and hence it is not
     * appropriate
     * for one of those clients to shut down the entire stack to stop receiving reports.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deregisterReportHandlersWithQueue:completion:")
    public native void deregisterReportHandlersWithQueueCompletion(@NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_deregisterReportHandlersWithQueueCompletion") @NotNull Block_deregisterReportHandlersWithQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deregisterReportHandlersWithQueueCompletion {
        @Generated
        void call_deregisterReportHandlersWithQueueCompletion();
    }

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a device object with the given node id and controller. This
     * will always succeed, even if there is no such node id on the controller's
     * fabric, but attempts to actually use the MTRBaseDevice will fail
     * (asynchronously) in that case.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deviceWithNodeID:controller:")
    @NotNull
    public static native MTRBaseDevice deviceWithNodeIDController(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseDevice init();

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
     * Invoke a command with a designated command path
     * 
     * @param commandFields command fields object. The object must be a data-value NSDictionary object
     *                      as described in the MTRDeviceResponseHandler.
     *                      The attribute must be a Structure, i.e.,
     *                      the NSDictionary MTRTypeKey key must have the value MTRStructureValueType.
     * 
     * @param timeoutMs     timeout in milliseconds for timed invoke, or nil.
     * 
     * @param completion    response handler will receive either values or error. A
     *                      path-specific error status from the command invocation
     *                      will result in an error being passed to the completion, so
     *                      values will only be passed in when the command succeeds.
     * 
     *                      API-Since: 16.4
     */
    @Generated
    @Selector("invokeCommandWithEndpointID:clusterID:commandID:commandFields:timedInvokeTimeout:queue:completion:")
    public native void invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsTimedInvokeTimeoutQueueCompletion(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber commandID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object commandFields, @Nullable NSNumber timeoutMs,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsTimedInvokeTimeoutQueueCompletion") @NotNull Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsTimedInvokeTimeoutQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsTimedInvokeTimeoutQueueCompletion {
        @Generated
        void call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsTimedInvokeTimeoutQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * invokeCommandWithEndpointID:clusterID:commandID:commandFields:timedInvokeTimeout:queue:completion
     */
    @Generated
    @Deprecated
    @Selector("invokeCommandWithEndpointId:clusterId:commandId:commandFields:timedInvokeTimeout:clientQueue:completion:")
    public native void invokeCommandWithEndpointIdClusterIdCommandIdCommandFieldsTimedInvokeTimeoutClientQueueCompletion(
            @NotNull NSNumber endpointId, @NotNull NSNumber clusterId, @NotNull NSNumber commandId,
            @Mapped(ObjCObjectMapper.class) @NotNull Object commandFields, @Nullable NSNumber timeoutMs,
            @NotNull dispatch_queue_t clientQueue,
            @ObjCBlock(name = "call_invokeCommandWithEndpointIdClusterIdCommandIdCommandFieldsTimedInvokeTimeoutClientQueueCompletion") @NotNull Block_invokeCommandWithEndpointIdClusterIdCommandIdCommandFieldsTimedInvokeTimeoutClientQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithEndpointIdClusterIdCommandIdCommandFieldsTimedInvokeTimeoutClientQueueCompletion {
        @Generated
        void call_invokeCommandWithEndpointIdClusterIdCommandIdCommandFieldsTimedInvokeTimeoutClientQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

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
    public static native MTRBaseDevice new_objc();

    /**
     * Open a commissioning window on the device, using a random setup passcode.
     * 
     * On success, completion will be called on queue with the MTRSetupPayload that
     * can be used to commission the device.
     * 
     * @param discriminator The discriminator to use for the commissionable
     *                      advertisement.
     * @param duration      Duration, in seconds, during which the commissioning
     *                      window will be open.
     * 
     *                      API-Since: 17.0
     */
    @Generated
    @Selector("openCommissioningWindowWithDiscriminator:duration:queue:completion:")
    public native void openCommissioningWindowWithDiscriminatorDurationQueueCompletion(@NotNull NSNumber discriminator,
            @NotNull NSNumber duration, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_openCommissioningWindowWithDiscriminatorDurationQueueCompletion") @NotNull Block_openCommissioningWindowWithDiscriminatorDurationQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openCommissioningWindowWithDiscriminatorDurationQueueCompletion {
        @Generated
        void call_openCommissioningWindowWithDiscriminatorDurationQueueCompletion(@Nullable MTRSetupPayload arg0,
                @Nullable NSError arg1);
    }

    /**
     * Open a commissioning window on the device.
     * 
     * On success, completion will be called on queue with the MTRSetupPayload that
     * can be used to commission the device.
     * 
     * @param setupPasscode The setup passcode to use for the commissioning window.
     *                      See MTRSetupPayload's generateRandomSetupPasscode for
     *                      generating a valid random passcode.
     * @param discriminator The discriminator to use for the commissionable
     *                      advertisement.
     * @param duration      Duration, in seconds, during which the commissioning
     *                      window will be open.
     * 
     *                      API-Since: 16.2
     */
    @Generated
    @Selector("openCommissioningWindowWithSetupPasscode:discriminator:duration:queue:completion:")
    public native void openCommissioningWindowWithSetupPasscodeDiscriminatorDurationQueueCompletion(
            @NotNull NSNumber setupPasscode, @NotNull NSNumber discriminator, @NotNull NSNumber duration,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_openCommissioningWindowWithSetupPasscodeDiscriminatorDurationQueueCompletion") @NotNull Block_openCommissioningWindowWithSetupPasscodeDiscriminatorDurationQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openCommissioningWindowWithSetupPasscodeDiscriminatorDurationQueueCompletion {
        @Generated
        void call_openCommissioningWindowWithSetupPasscodeDiscriminatorDurationQueueCompletion(
                @Nullable MTRSetupPayload arg0, @Nullable NSError arg1);
    }

    /**
     * Reads multiple attribute or event paths from the device.
     * 
     * Nil is treated as an empty array for attributePaths and eventPaths.
     * 
     * Lists of attribute and event paths to read can be provided via attributePaths and eventPaths.
     * 
     * The completion will be called with an error if the entire read interaction fails. Otherwise it
     * will be called with an array of values. This array may be empty (e.g. if no paths matched the
     * wildcard paths passed in, or if empty lists of paths were passed in) or may include per-path
     * errors if particular paths failed.
     * 
     * If the sum of the lengths of attributePaths and eventPaths exceeds 9, the read may fail due to the device not
     * supporting that
     * many read paths.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("readAttributePaths:eventPaths:params:queue:completion:")
    public native void readAttributePathsEventPathsParamsQueueCompletion(
            @Nullable NSArray<? extends MTRAttributeRequestPath> attributePaths,
            @Nullable NSArray<? extends MTREventRequestPath> eventPaths, @Nullable MTRReadParams params,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePathsEventPathsParamsQueueCompletion") @NotNull Block_readAttributePathsEventPathsParamsQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePathsEventPathsParamsQueueCompletion {
        @Generated
        void call_readAttributePathsEventPathsParamsQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributesWithEndpointID:clusterID:attributeID:params:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWithEndpointId:clusterId:attributeId:params:clientQueue:completion:")
    public native void readAttributeWithEndpointIdClusterIdAttributeIdParamsClientQueueCompletion(
            @Nullable NSNumber endpointId, @Nullable NSNumber clusterId, @Nullable NSNumber attributeId,
            @Nullable MTRReadParams params, @NotNull dispatch_queue_t clientQueue,
            @ObjCBlock(name = "call_readAttributeWithEndpointIdClusterIdAttributeIdParamsClientQueueCompletion") @NotNull Block_readAttributeWithEndpointIdClusterIdAttributeIdParamsClientQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWithEndpointIdClusterIdAttributeIdParamsClientQueueCompletion {
        @Generated
        void call_readAttributeWithEndpointIdClusterIdAttributeIdParamsClientQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * Reads attributes from the device.
     * 
     * Nil values for endpointID, clusterID, attributeID indicate wildcards
     * (e.g. nil attributeID means "read all the attributes from the endpoint(s) and
     * cluster(s) that match endpointID/clusterID").
     * 
     * If all of endpointID, clusterID, attributeID are non-nil, a single
     * attribute will be read.
     * 
     * If all of endpointID, clusterID, attributeID are nil, all attributes on the
     * device will be read.
     * 
     * A non-nil attributeID along with a nil clusterID will only succeed if the
     * attribute ID is for a global attribute that applies to all clusters.
     * 
     * The completion will be called with an error if the entire read interaction fails.
     * Otherwise it will be called with values, which may be empty (e.g. if no paths
     * matched the wildcard) or may include per-path errors if particular paths
     * failed.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributesWithEndpointID:clusterID:attributeID:params:queue:completion:")
    public native void readAttributesWithEndpointIDClusterIDAttributeIDParamsQueueCompletion(
            @Nullable NSNumber endpointID, @Nullable NSNumber clusterID, @Nullable NSNumber attributeID,
            @Nullable MTRReadParams params, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributesWithEndpointIDClusterIDAttributeIDParamsQueueCompletion") @NotNull Block_readAttributesWithEndpointIDClusterIDAttributeIDParamsQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributesWithEndpointIDClusterIDAttributeIDParamsQueueCompletion {
        @Generated
        void call_readAttributesWithEndpointIDClusterIDAttributeIDParamsQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * Reads events from the device.
     * 
     * Nil values for endpointID, clusterID, eventID indicate wildcards
     * (e.g. nil eventID means "read all the events from the endpoint(s) and
     * cluster(s) that match endpointID/clusterID").
     * 
     * If all of endpointID, clusterID, eventID are non-nil, all the matching instances of a single
     * event will be read.
     * 
     * If all of endpointID, clusterID, eventID are nil, all events on the
     * device will be read.
     * 
     * The completion will be called with an error if the entire read interaction fails.
     * Otherwise it will be called with values, which may be empty (e.g. if no paths
     * matched the wildcard) or may include per-path errors if particular paths
     * failed.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("readEventsWithEndpointID:clusterID:eventID:params:queue:completion:")
    public native void readEventsWithEndpointIDClusterIDEventIDParamsQueueCompletion(@Nullable NSNumber endpointID,
            @Nullable NSNumber clusterID, @Nullable NSNumber eventID, @Nullable MTRReadParams params,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readEventsWithEndpointIDClusterIDEventIDParamsQueueCompletion") @NotNull Block_readEventsWithEndpointIDClusterIDEventIDParamsQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readEventsWithEndpointIDClusterIDEventIDParamsQueueCompletion {
        @Generated
        void call_readEventsWithEndpointIDClusterIDEventIDParamsQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The transport used by the current session with this device, or
     * `MTRTransportTypeUndefined` if no session is currently active.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("sessionTransportType")
    public native byte sessionTransportType();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeToAttributesWithEndpointID:clusterID:attributeID:params:queue:reportHandler:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWithEndpointId:clusterId:attributeId:minInterval:maxInterval:params:clientQueue:reportHandler:subscriptionEstablished:")
    public native void subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished(
            @Nullable NSNumber endpointId, @Nullable NSNumber clusterId, @Nullable NSNumber attributeId,
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @NotNull dispatch_queue_t clientQueue,
            @ObjCBlock(name = "call_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_7") @NotNull Block_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_7 reportHandler,
            @ObjCBlock(name = "call_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_8") @Nullable Block_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_8 subscriptionEstablishedHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_7 {
        @Generated
        void call_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_7(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_8 {
        @Generated
        void call_subscribeAttributeWithEndpointIdClusterIdAttributeIdMinIntervalMaxIntervalParamsClientQueueReportHandlerSubscriptionEstablished_8();
    }

    /**
     * Subscribes to multiple attribute or event paths.
     * 
     * Nil is treated as an empty array for attributePaths and eventPaths.
     * 
     * Lists of attribute and event paths to subscribe to can be provided via attributePaths and eventPaths.
     * 
     * The reportHandler will be called with an error if the subscription fails
     * entirely (including when both attributePaths and eventPaths are empty).
     * 
     * The reportHandler will be called with arrays of response-value dictionaries
     * (which may be data or errors) as path-specific data is received.
     * 
     * subscriptionEstablished will be called when the subscription is first
     * successfully established (after the initial set of data reports has been
     * delivered to reportHandler). If params allow automatic resubscription, it
     * will be called any time resubscription succeeds.
     * 
     * resubscriptionScheduled will be called if subscription drop is detected and
     * params allow automatic resubscription.
     * 
     * If the sum of the lengths of attributePaths and eventPaths exceeds 3, the subscribe may fail due to the device
     * not supporting
     * that many paths for a subscription.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("subscribeToAttributePaths:eventPaths:params:queue:reportHandler:subscriptionEstablished:resubscriptionScheduled:")
    public native void subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled(
            @Nullable NSArray<? extends MTRAttributeRequestPath> attributePaths,
            @Nullable NSArray<? extends MTREventRequestPath> eventPaths, @Nullable MTRSubscribeParams params,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_4") @NotNull Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_4 reportHandler,
            @ObjCBlock(name = "call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_5") @Nullable Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_5 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_6") @Nullable Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_6 resubscriptionScheduled);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_4 {
        @Generated
        void call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_4(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_5 {
        @Generated
        void call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_5();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_6 {
        @Generated
        void call_subscribeToAttributePathsEventPathsParamsQueueReportHandlerSubscriptionEstablishedResubscriptionScheduled_6(
                @NotNull NSError error, @NotNull NSNumber resubscriptionDelay);
    }

    /**
     * Subscribes to the specified attributes on the device.
     * 
     * Nil values for endpointID, clusterID, attributeID indicate wildcards
     * (e.g. nil attributeID means "subscribe to all the attributes from the
     * endpoint(s) and cluster(s) that match endpointID/clusterID").
     * 
     * If all of endpointID, clusterID, attributeID are non-nil, a single attribute
     * will be subscribed to.
     * 
     * If all of endpointID, clusterID, attributeID are nil, all attributes on the
     * device will be subscribed to.
     * 
     * A non-nil attributeID along with a nil clusterID will only succeed if the
     * attribute ID is for a global attribute that applies to all clusters.
     * 
     * The reportHandler will be called with an error if the subscription fails
     * entirely.
     * 
     * The reportHandler will be called with arrays of response-value dictionaries
     * (which may be data or errors) as path-specific data is received.
     * 
     * subscriptionEstablished will be called when the subscription is first
     * successfully established (after the initial set of data reports has been
     * delivered to reportHandler). If params allow automatic resubscription, it
     * will be called any time resubscription succeeds.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeToAttributesWithEndpointID:clusterID:attributeID:params:queue:reportHandler:subscriptionEstablished:")
    public native void subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished(
            @Nullable NSNumber endpointID, @Nullable NSNumber clusterID, @Nullable NSNumber attributeID,
            @Nullable MTRSubscribeParams params, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_5") @NotNull Block_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_5 reportHandler,
            @ObjCBlock(name = "call_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_6") @Nullable Block_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_6 subscriptionEstablished);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_5 {
        @Generated
        void call_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_5(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_6 {
        @Generated
        void call_subscribeToAttributesWithEndpointIDClusterIDAttributeIDParamsQueueReportHandlerSubscriptionEstablished_6();
    }

    /**
     * Subscribes to the specified events on the device.
     * 
     * Nil values for endpointID, clusterID, eventID indicate wildcards
     * (e.g. nil eventID means "subscribe to all the events from the
     * endpoint(s) and cluster(s) that match endpointID/clusterID").
     * 
     * If all of endpointID, clusterID, eventID are non-nil, a single event
     * will be subscribed to.
     * 
     * If all of endpointID, clusterID, eventID are nil, all events on the
     * device will be subscribed to.
     * 
     * The reportHandler will be called with an error if the subscription fails
     * entirely.
     * 
     * The reportHandler will be called with arrays of response-value dictionaries
     * (which may be data or errors) as path-specific data is received.
     * 
     * subscriptionEstablished will be called when the subscription is first
     * successfully established (after the initial set of data reports has been
     * delivered to reportHandler). If params allow automatic resubscription, it
     * will be called any time resubscription succeeds.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeToEventsWithEndpointID:clusterID:eventID:params:queue:reportHandler:subscriptionEstablished:")
    public native void subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished(
            @Nullable NSNumber endpointID, @Nullable NSNumber clusterID, @Nullable NSNumber eventID,
            @Nullable MTRSubscribeParams params, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_5") @NotNull Block_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_5 reportHandler,
            @ObjCBlock(name = "call_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_6") @Nullable Block_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_6 subscriptionEstablished);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_5 {
        @Generated
        void call_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_5(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_6 {
        @Generated
        void call_subscribeToEventsWithEndpointIDClusterIDEventIDParamsQueueReportHandlerSubscriptionEstablished_6();
    }

    /**
     * Deprecated MTRBaseDevice APIs.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeWithQueue:params:clusterStateCacheContainer:attributeReportHandler:eventReportHandler:errorHandler:subscriptionEstablished:resubscriptionScheduled:
     */
    @Generated
    @Deprecated
    @Selector("subscribeWithQueue:minInterval:maxInterval:params:cacheContainer:attributeReportHandler:eventReportHandler:errorHandler:subscriptionEstablished:resubscriptionScheduled:")
    public native void subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled(
            @NotNull dispatch_queue_t queue, char minInterval, char maxInterval, @Nullable MTRSubscribeParams params,
            @Nullable MTRAttributeCacheContainer attributeCacheContainer,
            @ObjCBlock(name = "call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5") @Nullable Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5 attributeReportHandler,
            @ObjCBlock(name = "call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6") @Nullable Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6 eventReportHandler,
            @ObjCBlock(name = "call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7") @NotNull Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7 errorHandler,
            @ObjCBlock(name = "call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_8") @Nullable Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_8 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_9") @Nullable Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_9 resubscriptionScheduledHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5 {
        @Generated
        void call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5(
                @NotNull NSArray<?> values);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6 {
        @Generated
        void call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6(
                @NotNull NSArray<?> values);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7 {
        @Generated
        void call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7(
                @NotNull NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_8 {
        @Generated
        void call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_8();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_9 {
        @Generated
        void call_subscribeWithQueueMinIntervalMaxIntervalParamsCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_9(
                @NotNull NSError error, @NotNull NSNumber resubscriptionDelay);
    }

    /**
     * Subscribe to receive attribute reports for everything (all endpoints, all
     * clusters, all attributes, all events) on the device.
     * 
     * A non-nil attribute cache container will cache attribute values, retrievable
     * through the designated attribute cache container.
     * 
     * attributeReportHandler will be called any time a data update is available (with a
     * non-nil "value")
     * 
     * The array passed to attributeReportHandler will contain MTRAttributeReport
     * instances. Errors for specific paths, not the whole subscription, will be
     * reported via those objects.
     * 
     * eventReportHandler will be called any time an event is reported (with a
     * non-nil "value")
     * 
     * The array passed to eventReportHandler will contain MTREventReport
     * instances. Errors for specific paths, not the whole subscription, will be
     * reported via those objects.
     * 
     * errorHandler will be called any time there is an error for the entire
     * subscription (with a non-nil "error"), and terminate the subscription. This
     * will generally not be invoked if auto-resubscription is enabled, unless there
     * is a fatal error during a resubscription attempt.
     * 
     * Both report handlers are not supported over XPC at the moment.
     * 
     * The subscriptionEstablished block, if not nil, will be called once the
     * subscription is established. This will be _after_ the first (priming) call
     * to both report handlers. Note that if the MTRSubscribeParams are set to
     * automatically resubscribe this can end up being called more than once.
     * 
     * The resubscriptionScheduled block, if not nil, will be called if
     * auto-resubscription is enabled, subscription loss is detected, and a
     * resubscription is scheduled. This can be called multiple times in a row
     * without an intervening subscriptionEstablished call if the resubscription
     * attempts fail.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeWithQueue:params:clusterStateCacheContainer:attributeReportHandler:eventReportHandler:errorHandler:subscriptionEstablished:resubscriptionScheduled:")
    public native void subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled(
            @NotNull dispatch_queue_t queue, @NotNull MTRSubscribeParams params,
            @Nullable MTRClusterStateCacheContainer clusterStateCacheContainer,
            @ObjCBlock(name = "call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_3") @Nullable Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_3 attributeReportHandler,
            @ObjCBlock(name = "call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_4") @Nullable Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_4 eventReportHandler,
            @ObjCBlock(name = "call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5") @NotNull Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5 errorHandler,
            @ObjCBlock(name = "call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6") @Nullable Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7") @Nullable Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7 resubscriptionScheduled);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_3 {
        @Generated
        void call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_3(
                @NotNull NSArray<?> values);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_4 {
        @Generated
        void call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_4(
                @NotNull NSArray<?> values);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5 {
        @Generated
        void call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_5(
                @NotNull NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6 {
        @Generated
        void call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_6();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7 {
        @Generated
        void call_subscribeWithQueueParamsClusterStateCacheContainerAttributeReportHandlerEventReportHandlerErrorHandlerSubscriptionEstablishedResubscriptionScheduled_7(
                @NotNull NSError error, @NotNull NSNumber resubscriptionDelay);
    }

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
     * Write to attribute in a designated attribute path
     * 
     * @param value      A data-value NSDictionary object as described in
     *                   MTRDeviceResponseHandler.
     * 
     * @param timeoutMs  timeout in milliseconds for timed write, or nil.
     * 
     * @param completion response handler will receive either values or error.
     * 
     *                   A path-specific error status will get turned into an error
     *                   passed to the completion, so values will only be passed in
     *                   when the write succeeds. In that case, values will have
     *                   the format documented in the definition of
     *                   MTRDeviceResponseHandler and will be an array with a single element
     *                   which is a dictionary that has a MTRAttributePathKey entry in it, whose value
     *                   is the attribute path that was successfully written to.
     * 
     *                   API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWithEndpointID:clusterID:attributeID:value:timedWriteTimeout:queue:completion:")
    public native void writeAttributeWithEndpointIDClusterIDAttributeIDValueTimedWriteTimeoutQueueCompletion(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber attributeID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @Nullable NSNumber timeoutMs,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_writeAttributeWithEndpointIDClusterIDAttributeIDValueTimedWriteTimeoutQueueCompletion") @NotNull Block_writeAttributeWithEndpointIDClusterIDAttributeIDValueTimedWriteTimeoutQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWithEndpointIDClusterIDAttributeIDValueTimedWriteTimeoutQueueCompletion {
        @Generated
        void call_writeAttributeWithEndpointIDClusterIDAttributeIDValueTimedWriteTimeoutQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * writeAttributeWithEndpointID:clusterID:attributeID:value:timedWriteTimeout:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWithEndpointId:clusterId:attributeId:value:timedWriteTimeout:clientQueue:completion:")
    public native void writeAttributeWithEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutClientQueueCompletion(
            @NotNull NSNumber endpointId, @NotNull NSNumber clusterId, @NotNull NSNumber attributeId,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @Nullable NSNumber timeoutMs,
            @NotNull dispatch_queue_t clientQueue,
            @ObjCBlock(name = "call_writeAttributeWithEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutClientQueueCompletion") @NotNull Block_writeAttributeWithEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutClientQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWithEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutClientQueueCompletion {
        @Generated
        void call_writeAttributeWithEndpointIdClusterIdAttributeIdValueTimedWriteTimeoutClientQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }
}
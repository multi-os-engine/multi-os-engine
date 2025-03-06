package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.matter.protocol.MTRDeviceDelegate;
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
import apple.foundation.NSURL;

/**
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDevice extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDevice(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDevice alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDevice allocWithZone(VoidPtr zone);

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
     * Get an MTRDevice object representing a device with a specific node ID
     * associated with a specific controller.
     * 
     * MTRDevice objects are stateful, and callers should hold on to the MTRDevice
     * while they are using it.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("deviceWithNodeID:controller:")
    @NotNull
    public static native MTRDevice deviceWithNodeIDController(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller);

    /**
     * Deprecated MTRDevice APIs.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use deviceWithNodeID:controller:
     */
    @Generated
    @Deprecated
    @Selector("deviceWithNodeID:deviceController:")
    @NotNull
    public static native MTRDevice deviceWithNodeIDDeviceController(long nodeID,
            @NotNull MTRDeviceController deviceController);

    /**
     * The estimated device system start time.
     * 
     * A device can report its events with either calendar time or time since system start time. When events are
     * reported with time
     * since system start time, this property will return an estimation of the device system start time. Because a
     * device may report
     * timestamps this way due to the lack of a wall clock, system start time can only be estimated based on event
     * receive time and the
     * timestamp value, and this estimation may change over time.
     * 
     * Device reboots may also cause the estimated device start time to jump forward.
     * 
     * If events are always reported with calendar time, then this property will return nil.
     * 
     * API-Since: 16.5
     */
    @Generated
    @Selector("estimatedStartTime")
    @Nullable
    public native NSDate estimatedStartTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDevice init();

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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:clientQueue:completion:")
    public native void invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutClientQueueCompletion(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber commandID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object commandFields,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueInterval, @Nullable NSNumber timeout, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutClientQueueCompletion") @NotNull Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutClientQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutClientQueueCompletion {
        @Generated
        void call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutClientQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:queue:completion:")
    public native void invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutQueueCompletion(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber commandID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object commandFields,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueInterval, @Nullable NSNumber timeout, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutQueueCompletion") @NotNull Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutQueueCompletion {
        @Generated
        void call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutQueueCompletion(
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
    public static native MTRDevice new_objc();

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
        void call_openCommissioningWindowWithDiscriminatorDurationQueueCompletion(@Nullable MTRSetupPayload payload,
                @Nullable NSError error);
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
                @Nullable MTRSetupPayload payload, @Nullable NSError error);
    }

    /**
     * Read attribute in a designated attribute path. If there is no value available
     * for the attribute, whether because the device does not implement it or
     * because the subscription priming read has not yet gotten to this attribute,
     * nil will be returned.
     * 
     * TODO: Need to fully document that this returns "the system's best guess" of attribute values.
     * 
     * @return a data-value dictionary of the attribute as described in MTRDeviceResponseHandler,
     *         or nil if there is no value.
     * 
     *         API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWithEndpointID:clusterID:attributeID:params:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWithEndpointIDClusterIDAttributeIDParams(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber attributeID,
            @Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Set the delegate to receive asynchronous callbacks about the device.
     * 
     * The delegate will be called on the provided queue, for attribute reports, event reports, and device state
     * changes.
     * 
     * API-Since: 16.1
     * Deprecated-Since: 18.0
     * Deprecated-Message: Please use addDelegate:queue:interestedPaths:
     */
    @Deprecated
    @Generated
    @Selector("setDelegate:queue:")
    public native void setDelegateQueue(@Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceDelegate delegate,
            @NotNull dispatch_queue_t queue);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The current state of the device.
     * 
     * The three states:
     * MTRDeviceStateUnknown
     * Unable to determine the state of the device at the moment.
     * 
     * MTRDeviceStateReachable
     * Communication with the device is expected to succeed.
     * 
     * MTRDeviceStateUnreachable
     * The device is currently unreachable.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("state")
    @NUInt
    public native long state();

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
     * @param value                 A data-value NSDictionary object as described in
     *                              MTRDeviceResponseHandler.
     * 
     * @param expectedValueInterval maximum interval in milliseconds during which reads of the attribute will return the
     *                              value being
     *                              written. This value must be within [1, UINT32_MAX], and will be clamped to this
     *                              range.
     * 
     *                              TODO: document that -readAttribute... will return the expected value for the
     *                              [endpoint,cluster,attribute] until one of the
     *                              following:
     *                              1. Another write for the same attribute happens.
     *                              2. expectedValueIntervalMs (clamped) expires. Need to figure out phrasing here.
     *                              3. We succeed at writing the attribute.
     *                              4. We fail at writing the attribute and give up on the write
     * 
     * @param timeout               timeout in milliseconds for timed write, or nil. This value must be within [1,
     *                              UINT16_MAX], and will be clamped
     *                              to this range.
     *                              TODO: make timeout arguments uniform
     * 
     *                              API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    public native void writeAttributeWithEndpointIDClusterIDAttributeIDValueExpectedValueIntervalTimedWriteTimeout(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber attributeID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @NotNull NSNumber expectedValueInterval,
            @Nullable NSNumber timeout);

    /**
     * Adds a delegate to receive asynchronous callbacks about the device.
     * 
     * The delegate will be called on the provided queue, for attribute reports, event reports, and device state
     * changes.
     * 
     * MTRDevice holds a weak reference to the delegate object.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addDelegate:queue:")
    public native void addDelegateQueue(@Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceDelegate delegate,
            @NotNull dispatch_queue_t queue);

    /**
     * Adds a delegate to receive asynchronous callbacks about the device, and limit attribute and/or event reports to a
     * specific set of paths.
     * 
     * interestedPathsForAttributes may contain either MTRClusterPath or MTRAttributePath to specify interested clusters
     * and attributes, or NSNumber for endpoints.
     * 
     * interestedPathsForEvents may contain either MTRClusterPath or MTREventPath to specify interested clusters and
     * events, or NSNumber for endpoints.
     * 
     * For both interested paths arguments, if nil is specified, then no filter will be applied.
     * 
     * Calling addDelegate: again with the same delegate object will update the interested paths for attributes and
     * events for this delegate.
     * 
     * MTRDevice holds a weak reference to the delegate object.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addDelegate:queue:interestedPathsForAttributes:interestedPathsForEvents:")
    public native void addDelegateQueueInterestedPathsForAttributesInterestedPathsForEvents(
            @Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceDelegate delegate, @NotNull dispatch_queue_t queue,
            @Nullable NSArray<?> interestedPathsForAttributes, @Nullable NSArray<?> interestedPathsForEvents);

    /**
     * Is the device cache primed for this device?
     * 
     * This will be true after the deviceCachePrimed: delegate callback has been called, false if not.
     * 
     * Please note if you have a storage delegate implemented, the cache is then stored persistently, so
     * the delegate would then only be called once, ever - and this property would basically always be true
     * if a subscription has ever been established at any point in the past.
     * 
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("deviceCachePrimed")
    public native boolean deviceCachePrimed();

    /**
     * The controller this device was created for. May return nil if that
     * controller has been shut down.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("deviceController")
    @Nullable
    public native MTRDeviceController deviceController();

    /**
     * Download log of the desired type from the device.
     * 
     * Note: The consumer of this API should move the file that the url points to or open it for reading before the
     * completion handler returns. Otherwise, the file will be deleted, and the data will be lost.
     * 
     * @param type       The type of log being requested. This should correspond to a value in the enum
     *                   MTRDiagnosticLogType.
     * @param timeout    The timeout for getting the log. If the timeout expires, completion will be called with
     *                   whatever
     *                   has been retrieved by that point (which might be none or a partial log).
     *                   If the timeout is set to 0, the request will not expire and completion will not be called until
     *                   the log is fully retrieved or an error occurs.
     * @param queue      The queue on which completion will be called.
     * @param completion The completion handler that is called after attempting to retrieve the requested log.
     *                   - In case of success, the completion handler is called with a non-nil URL and a nil error.
     *                   - If there is an error, a non-nil error is used and the url can be non-nil too if some logs
     *                   have already been downloaded.
     * 
     *                   API-Since: 17.6
     */
    @Generated
    @Selector("downloadLogOfType:timeout:queue:completion:")
    public native void downloadLogOfTypeTimeoutQueueCompletion(@NInt long type, double timeout,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_downloadLogOfTypeTimeoutQueueCompletion") @NotNull Block_downloadLogOfTypeTimeoutQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadLogOfTypeTimeoutQueueCompletion {
        @Generated
        void call_downloadLogOfTypeTimeoutQueueCompletion(@Nullable NSURL url, @Nullable NSError error);
    }

    /**
     * An estimate of how much time is likely to elapse between setDelegate being
     * called and the current device state (attributes, stored events) being known.
     * 
     * nil if no such estimate is available. Otherwise, the NSNumber stores an NSTimeInterval.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("estimatedSubscriptionLatency")
    @Nullable
    public native NSNumber estimatedSubscriptionLatency();

    /**
     * Invoke a command with a designated command path
     * 
     * @param commandFields         command fields object. If not nil, the object must be a data-value
     *                              NSDictionary object as described in the MTRDeviceResponseHandler
     *                              documentation. The value must be a Structure, i.e., the NSDictionary
     *                              MTRTypeKey key must have the value MTRStructureValueType.
     * 
     *                              If commandFields is nil, it will be treated as a Structure with no fields.
     * 
     * @param expectedValues        The expected values of attributes that will be affected by the command, if
     *                              any. If these are provided, the relevant attributes will have the provided
     *                              values when read until one of the following happens:
     * 
     *                              1. Something (another invoke or a write) sets different expected values.
     *                              2. expectedValueInterval elapses without the device reporting the
     *                              attributes changing their values to the expected values.
     *                              3. The command invoke fails.
     *                              4. The device reports some other values for these attributes.
     * 
     *                              The dictionaries in this array are expected to be response-value
     *                              dictionaries as documented in the documentation of
     *                              MTRDeviceResponseHandler, and each one must have an MTRAttributePathKey.
     * 
     *                              The expectedValues and expectedValueInterval arguments need to be both
     *                              nil or both non-nil, or both will be both ignored.
     * 
     * @param expectedValueInterval maximum interval in milliseconds during which reads of the
     *                              attributes that had expected values provided will return the
     *                              expected values. If the value is less than 1, both this value and
     *                              expectedValues will be ignored. If this value is greater than
     *                              UINT32_MAX, it will be clamped to UINT32_MAX.
     * 
     * @param completion            response handler will receive either values or error. A
     *                              path-specific error status from the command invocation
     *                              will result in an error being passed to the completion, so
     *                              values will only be passed in when the command succeeds.
     * 
     *                              If values are passed, the array length will always be 1 and the single
     *                              response-value in it will have an MTRCommandPathKey. If the command
     *                              response is just a success status, there will be no MTRDataKey. If the
     *                              command response has data fields, there will be an MTRDataKey, whose value
     *                              will be of type MTRStructureValueType and describe the response payload.
     * 
     *                              API-Since: 17.4
     */
    @Generated
    @Selector("invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:queue:completion:")
    public native void invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalQueueCompletion(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber commandID,
            @Nullable NSDictionary<String, ?> commandFields,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueInterval, @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalQueueCompletion") @NotNull Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalQueueCompletion {
        @Generated
        void call_invokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalQueueCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * The node ID of the node this device corresponds to.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("nodeID")
    @NotNull
    public native NSNumber nodeID();

    /**
     * Read the attributes identified by the provided attribute paths. The paths
     * can include wildcards.
     * 
     * Paths that do not correspond to any existing attributes, or that the
     * MTRDevice does not have attribute values for, will not be present in the
     * return value from this function.
     * 
     * @return an array of response-value dictionaries as described in the
     *         documentation for MTRDeviceResponseHandler. Each one will have an
     *         MTRAttributePathKey and an MTRDataKey.
     * 
     *         API-Since: 18.2
     */
    @Generated
    @Selector("readAttributePaths:")
    @NotNull
    public native NSArray<? extends NSDictionary<String, ?>> readAttributePaths(
            @NotNull NSArray<? extends MTRAttributeRequestPath> attributePaths);

    /**
     * Removes the delegate from receiving callbacks about the device.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeDelegate:")
    public native void removeDelegate(@Mapped(ObjCObjectMapper.class) @NotNull MTRDeviceDelegate delegate);
}
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
     * TODO: Document usage better
     * 
     * Directly instantiate a MTRDevice with a MTRDeviceController as a shim.
     * 
     * All device-specific information would be stored on the device controller, and
     * retrieved when performing actions using a combination of MTRBaseDevice
     * and MTRAsyncCallbackQueue.
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
     * * Invoke a command with a designated command path
     * *
     * * @param commandFields command fields object. The object must be a data-value NSDictionary object
     * * as described in the MTRDeviceResponseHandler.
     * * The attribute must be a Structure, i.e.,
     * * the NSDictionary MTRTypeKey key must have the value MTRStructureValueType.
     * *
     * * @param expectedValues array of dictionaries containing the expected values in the same format as
     * * attribute read completion handler. Requires MTRAttributePathKey values.
     * * See MTRDeviceResponseHandler definition for dictionary details.
     * * The expectedValues and expectedValueInterval arguments need to be both
     * * nil or both non-nil, or both will be both ignored.
     * *
     * * TODO: document better the expectedValues is how this command is expected to change attributes when read, and
     * that the next
     * * readAttribute will get these values
     * *
     * * @param expectedValueInterval maximum interval in milliseconds during which reads of the attribute will return
     * the value being
     * * written. If the value is less than 1, both this value and expectedValues will be ignored.
     * If this value is greater than UINT32_MAX, it will be clamped to UINT32_MAX.
     * *
     * * @param timeout timeout in milliseconds for timed invoke, or nil. This value must be within [1, UINT16_MAX], and
     * will be clamped
     * * to this range.
     * *
     * * @param completion response handler will receive either values or error. A
     * * path-specific error status from the command invocation
     * * will result in an error being passed to the completion, so
     * * values will only be passed in when the command succeeds.
     * 
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
     * Read attribute in a designated attribute path
     * 
     * TODO: Need to document that this returns "the system's best guess" of attribute values.
     * 
     * @return a data-value dictionary of the attribute as described in MTRDeviceResponseHandler
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
     */
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
     */
    @Generated
    @Selector("writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    public native void writeAttributeWithEndpointIDClusterIDAttributeIDValueExpectedValueIntervalTimedWriteTimeout(
            @NotNull NSNumber endpointID, @NotNull NSNumber clusterID, @NotNull NSNumber attributeID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @NotNull NSNumber expectedValueInterval,
            @Nullable NSNumber timeout);
}
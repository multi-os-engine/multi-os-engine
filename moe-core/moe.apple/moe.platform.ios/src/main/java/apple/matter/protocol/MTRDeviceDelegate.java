package apple.matter.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.matter.MTRDevice;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRDeviceDelegate")
public interface MTRDeviceDelegate {
    /**
     * Notifies delegate of attribute reports from the MTRDevice
     * 
     * @param attributeReport An array of response-value objects as described in MTRDeviceResponseHandler
     * 
     *                        In addition to MTRDataKey, each response-value dictionary in the array may also have this
     *                        key:
     * 
     *                        MTRPreviousDataKey : Same data-value dictionary format as the object for MTRDataKey. This
     *                        is included when the previous value is known for an attribute.
     * 
     *                        The data-value dictionary also contains this key:
     * 
     *                        MTRDataVersionKey : NSNumber-wrapped uin32_t.
     */
    @Generated
    @Selector("device:receivedAttributeReport:")
    void deviceReceivedAttributeReport(@NotNull MTRDevice device,
            @NotNull NSArray<? extends NSDictionary<String, ?>> attributeReport);

    /**
     * Notifies delegate of event reports from the MTRDevice
     * 
     * @param eventReport An array of response-value objects as described in MTRDeviceResponseHandler
     * 
     *                    In addition to the MTREventPathKey and MTRDataKey containing the path and event values,
     *                    eventReport also contains
     *                    these keys:
     * 
     *                    MTREventNumberKey : NSNumber-wrapped uint64_t value. Monotonically increasing, and consecutive
     *                    event reports
     *                    should have consecutive numbers unless device reboots, or if events are lost.
     *                    MTREventPriorityKey : NSNumber-wrapped MTREventPriority value.
     *                    MTREventTimeTypeKey : NSNumber-wrapped MTREventTimeType value.
     *                    MTREventSystemUpTimeKey : NSNumber-wrapped NSTimeInterval value.
     *                    MTREventTimestampDateKey : NSDate object.
     * 
     *                    Only one of MTREventTimestampDateKey and MTREventSystemUpTimeKey will be present, depending on
     *                    the value for
     *                    MTREventTimeTypeKey.
     */
    @Generated
    @Selector("device:receivedEventReport:")
    void deviceReceivedEventReport(@NotNull MTRDevice device,
            @NotNull NSArray<? extends NSDictionary<String, ?>> eventReport);

    /**
     * @param state The current state of the device
     */
    @Generated
    @Selector("device:stateChanged:")
    void deviceStateChanged(@NotNull MTRDevice device, @NUInt long state);

    /**
     * Notifies delegate the device is currently actively communicating.
     * 
     * This can be used as a hint that now is a good time to send commands to the
     * device, especially if the device is sleepy and might not be active very often.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("deviceBecameActive:")
    default void deviceBecameActive(@NotNull MTRDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies delegate when the device attribute cache has been primed with initial configuration data of the device
     * 
     * This is called when the MTRDevice object goes from not knowing the device to having cached the first attribute
     * reports that include basic mandatory information, e.g. Descriptor clusters.
     * 
     * The intention is that after this is called, the client should be able to call read for mandatory attributes and
     * likely expect non-nil values.
     * 
     * API-Since: 17.6
     */
    @Generated
    @IsOptional
    @Selector("deviceCachePrimed:")
    default void deviceCachePrimed(@NotNull MTRDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is called when the MTRDevice object detects a change in the device configuration.
     * 
     * Device configuration is the set of functionality implemented by the device.
     * 
     * 
     * API-Since: 17.6
     */
    @Generated
    @IsOptional
    @Selector("deviceConfigurationChanged:")
    default void deviceConfigurationChanged(@NotNull MTRDevice device) {
        throw new java.lang.UnsupportedOperationException();
    }
}
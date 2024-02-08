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
}
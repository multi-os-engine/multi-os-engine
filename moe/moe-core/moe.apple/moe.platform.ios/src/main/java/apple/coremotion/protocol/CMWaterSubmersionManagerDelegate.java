package apple.coremotion.protocol;

import apple.coremotion.CMWaterSubmersionEvent;
import apple.coremotion.CMWaterSubmersionManager;
import apple.coremotion.CMWaterSubmersionMeasurement;
import apple.coremotion.CMWaterTemperature;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * CMWaterSubmersionManagerDelegate
 * 
 * Discussion:
 * Delegate protocol to receive updates from the CMWaterSubmersionManager API. Methods will be invoked
 * on the main queue.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CMWaterSubmersionManagerDelegate")
public interface CMWaterSubmersionManagerDelegate {
    /**
     * manager:didUpdateEvent
     * 
     * Discussion:
     * Delegate method is called when there is a new event available.
     * When the delegate is first set, this method will invoked immediately so
     * that the client always has the current state.
     */
    @Generated
    @Selector("manager:didUpdateEvent:")
    void managerDidUpdateEvent(@NotNull CMWaterSubmersionManager manager, @NotNull CMWaterSubmersionEvent event);

    /**
     * manager:didUpdateMeasurement:
     * 
     * Discussion:
     * Delegate method is called when there is a new depth/pressure measurement available. When
     * the device is not in the Submerged state, the measurement will only include the surface
     * pressure and submersion state.
     */
    @Generated
    @Selector("manager:didUpdateMeasurement:")
    void managerDidUpdateMeasurement(@NotNull CMWaterSubmersionManager manager,
            @NotNull CMWaterSubmersionMeasurement measurement);

    /**
     * manager:didUpdateTemperature:
     * 
     * Discussion:
     * Delegate method is called when there is a new temperature measurement available.
     * New measurements will only be available while device is in the WaterSubmerged state.
     */
    @Generated
    @Selector("manager:didUpdateTemperature:")
    void managerDidUpdateTemperature(@NotNull CMWaterSubmersionManager manager,
            @NotNull CMWaterTemperature measurement);

    /**
     * manager:errorOccurred:
     * Discussion:
     * Delegate method is called when an error has occurred.
     */
    @Generated
    @Selector("manager:errorOccurred:")
    void managerErrorOccurred(@NotNull CMWaterSubmersionManager manager, @NotNull NSError error);
}
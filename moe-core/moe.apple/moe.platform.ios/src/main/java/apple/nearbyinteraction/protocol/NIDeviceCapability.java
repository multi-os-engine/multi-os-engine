package apple.nearbyinteraction.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NIDeviceCapability")
public interface NIDeviceCapability {
    /**
     * Whether or not this device is capable of participating in a nearby interaction session with camera assistance
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportsCameraAssistance")
    boolean supportsCameraAssistance();

    /**
     * Whether or not this device is capable of participating in a nearby interaction session with instantaneous
     * direction
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportsDirectionMeasurement")
    boolean supportsDirectionMeasurement();

    /**
     * Whether or not this device is capable of participating in a nearby interaction session with precise ranging
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("supportsPreciseDistanceMeasurement")
    boolean supportsPreciseDistanceMeasurement();

    /**
     * Whether or not this device is capable of extended distance measurement capabilities
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("supportsExtendedDistanceMeasurement")
    boolean supportsExtendedDistanceMeasurement();

    /**
     * Whether or not this device is capable of participating in a nearby interaction DL-TDOA ranging.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("supportsDLTDOAMeasurement")
    boolean supportsDLTDOAMeasurement();
}
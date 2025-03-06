package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueWiFiSatelliteStatus
 * 
 * [@constant] HMCharacteristicValueWiFiSatelliteStatusUnknown Unknown.
 * [@constant] HMCharacteristicValueWiFiSatelliteStatusConnected Connected.
 * [@constant] HMCharacteristicValueWiFiSatelliteStatusNotConnected Not Connected.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueWiFiSatelliteStatus {
    @Generated
    private HMCharacteristicValueWiFiSatelliteStatus() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Connected = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NotConnected = 0x0000000000000002L;
}
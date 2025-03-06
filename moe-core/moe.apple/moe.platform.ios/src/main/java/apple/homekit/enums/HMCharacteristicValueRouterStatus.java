package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueRouterStatus
 * 
 * [@constant] HMCharacteristicValueRouterStatusReady Router has deployed HomeKit configuration.
 * [@constant] HMCharacteristicValueRouterStatusNotReady Router has not deployed HomeKit configuration.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueRouterStatus {
    @Generated
    private HMCharacteristicValueRouterStatus() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Ready = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long NotReady = 0x0000000000000001L;
}
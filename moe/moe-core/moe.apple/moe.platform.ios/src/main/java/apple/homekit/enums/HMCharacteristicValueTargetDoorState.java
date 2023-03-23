package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueTargetDoorState
 * 
 * [@constant] HMCharacteristicValueTargetDoorStateOpen Open.
 * [@constant] HMCharacteristicValueTargetDoorStateClosed Closed.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HMCharacteristicValueTargetDoorState {
    @Generated
    private HMCharacteristicValueTargetDoorState() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Open = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Closed = 0x0000000000000001L;
}

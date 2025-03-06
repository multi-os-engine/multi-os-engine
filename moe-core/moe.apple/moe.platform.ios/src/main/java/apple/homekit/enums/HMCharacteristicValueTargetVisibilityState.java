package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueTargetVisibilityState
 * 
 * [@constant] HMCharacteristicValueTargetVisibilityStateShow Show.
 * [@constant] HMCharacteristicValueTargetVisibilityStateHide Hide.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueTargetVisibilityState {
    @Generated
    private HMCharacteristicValueTargetVisibilityState() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Show = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Hide = 0x0000000000000001L;
}
package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueUsageState
 * 
 * [@constant] HMCharacteristicValueUsageStateNotInUse Not in use.
 * [@constant] HMCharacteristicValueUsageStateInUse Currently in use.
 * 
 * API-Since: 11.2
 */
@Generated
public final class HMCharacteristicValueUsageState {
    @Generated
    private HMCharacteristicValueUsageState() {
    }

    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long NotInUse = 0x0000000000000000L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long InUse = 0x0000000000000001L;
}

package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueUsageState
 * <p>
 * [@constant]  HMCharacteristicValueUsageStateNotInUse        Not in use.
 * [@constant]  HMCharacteristicValueUsageStateInUse           Currently in use.
 */
@Generated
public final class HMCharacteristicValueUsageState {
    @Generated
    private HMCharacteristicValueUsageState() {
    }

    @Generated @NInt public static final long NotInUse = 0x0000000000000000L;
    @Generated @NInt public static final long InUse = 0x0000000000000001L;
}

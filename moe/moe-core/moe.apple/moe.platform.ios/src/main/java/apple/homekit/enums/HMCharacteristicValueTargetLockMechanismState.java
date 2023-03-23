package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueTargetLockMechanismState
 * 
 * [@constant] HMCharacteristicValueTargetLockMechanismStateUnsecured Unsecured.
 * [@constant] HMCharacteristicValueTargetLockMechanismStateSecured Secured.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HMCharacteristicValueTargetLockMechanismState {
    @Generated
    private HMCharacteristicValueTargetLockMechanismState() {
    }

    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Unsecured = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Secured = 0x0000000000000001L;
}

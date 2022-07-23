package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueTargetLockMechanismState
 * <p>
 * [@constant] HMCharacteristicValueTargetLockMechanismStateUnsecured Unsecured.
 * [@constant] HMCharacteristicValueTargetLockMechanismStateSecured Secured.
 */
@Generated
public final class HMCharacteristicValueTargetLockMechanismState {
    @Generated
    private HMCharacteristicValueTargetLockMechanismState() {
    }

    @Generated @NInt public static final long Unsecured = 0x0000000000000000L;
    @Generated @NInt public static final long Secured = 0x0000000000000001L;
}

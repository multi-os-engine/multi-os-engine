package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HKActivityMoveMode
 * <p>
 * This enumerated type is used to represent the activity mode for the user's move ring.
 * [@constant] HKActivityMoveModeActiveEnergy User's move ring is updated from Active Energy Burned
 * [@constant] HKActivityMoveModeAppleMoveTime User's move ring is updated from Apple Move Time
 */
@Generated
public final class HKActivityMoveMode {
    @Generated
    private HKActivityMoveMode() {
    }

    @Generated @NInt public static final long ActiveEnergy = 0x0000000000000001L;
    @Generated @NInt public static final long AppleMoveTime = 0x0000000000000002L;
}

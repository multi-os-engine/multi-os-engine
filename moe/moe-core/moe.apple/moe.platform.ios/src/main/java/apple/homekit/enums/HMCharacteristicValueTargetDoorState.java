package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueTargetDoorState
 * 
 * [@constant]  HMCharacteristicValueTargetDoorStateOpen    Open.
 * [@constant]  HMCharacteristicValueTargetDoorStateClosed  Closed.
 */
@Generated
public final class HMCharacteristicValueTargetDoorState {
    @Generated
    private HMCharacteristicValueTargetDoorState() {
    }

    @Generated @NInt public static final long Open = 0x0000000000000000L;
    @Generated @NInt public static final long Closed = 0x0000000000000001L;
}
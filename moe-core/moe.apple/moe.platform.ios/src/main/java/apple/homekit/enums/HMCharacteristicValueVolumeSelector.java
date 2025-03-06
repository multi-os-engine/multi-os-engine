package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueVolumeSelector
 * 
 * [@constant] HMCharacteristicValueVolumeSelectorVolumeIncrement Increment the volume.
 * [@constant] HMCharacteristicValueVolumeSelectorVolumeDecrement Decrement the volume.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueVolumeSelector {
    @Generated
    private HMCharacteristicValueVolumeSelector() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Increment = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Decrement = 0x0000000000000001L;
}
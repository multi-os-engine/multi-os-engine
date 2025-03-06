package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueVolumeControlType
 * 
 * [@constant] HMCharacteristicValueVolumeControlTypeNone Volume cannot be controlled.
 * [@constant] HMCharacteristicValueVolumeControlTypeRelative Relative control (changed by one step at a time).
 * [@constant] HMCharacteristicValueVolumeControlTypeRelativeWithCurrent Relative control (changed by one step at a
 * time), but has a current value.
 * [@constant] HMCharacteristicValueVolumeControlTypeAbsolute Absolute control (can be directly set to a specific
 * value).
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueVolumeControlType {
    @Generated
    private HMCharacteristicValueVolumeControlType() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Relative = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long RelativeWithCurrent = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Absolute = 0x0000000000000003L;
}
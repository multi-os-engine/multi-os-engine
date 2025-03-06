package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueTargetMediaState
 * 
 * [@constant] HMCharacteristicValueTargetMediaStatePlay Start playback.
 * [@constant] HMCharacteristicValueTargetMediaStatePause Pause playback.
 * [@constant] HMCharacteristicValueTargetMediaStateStop Stop playback.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueTargetMediaState {
    @Generated
    private HMCharacteristicValueTargetMediaState() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Play = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Pause = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Stop = 0x0000000000000002L;
}
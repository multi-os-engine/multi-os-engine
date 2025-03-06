package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueCurrentMediaState
 * 
 * [@constant] HMCharacteristicValueCurrentMediaStatePlaying Playing content.
 * [@constant] HMCharacteristicValueCurrentMediaStatePaused Paused playback of media content.
 * [@constant] HMCharacteristicValueCurrentMediaStateStopped Stopped playback.
 * [@constant] HMCharacteristicValueCurrentMediaStateUnknown Unknown playback state.
 * [@constant] HMCharacteristicValueCurrentMediaStateLoading Loading content.
 * [@constant] HMCharacteristicValueCurrentMediaStateInterrupted Playback interrupted.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueCurrentMediaState {
    @Generated
    private HMCharacteristicValueCurrentMediaState() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Playing = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Paused = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Stopped = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000003L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Loading = 0x0000000000000004L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Interrupted = 0x0000000000000005L;
}
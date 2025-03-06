package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueCurrentVisibilityState
 * 
 * [@constant] HMCharacteristicValueCurrentVisibilityStateShown The media source is displayed.
 * [@constant] HMCharacteristicValueCurrentVisibilityStateHidden The media source is not displayed.
 * [@constant] HMCharacteristicValueCurrentVisibilityStateConnected The media source is displayed since there is a
 * connected device.
 * [@constant] HMCharacteristicValueCurrentVisibilityStateAlwaysShown The media source is always displayed.
 * 
 * API-Since: 18.0
 */
@Generated
public final class HMCharacteristicValueCurrentVisibilityState {
    @Generated
    private HMCharacteristicValueCurrentVisibilityState() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Shown = 0x0000000000000000L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Hidden = 0x0000000000000001L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Connected = 0x0000000000000002L;
    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long AlwaysShown = 0x0000000000000003L;
}
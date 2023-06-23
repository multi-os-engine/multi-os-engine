package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueConfigurationState
 * 
 * [@constant] HMCharacteristicValueConfigurationStateNotConfigured Not Configured.
 * [@constant] HMCharacteristicValueConfigurationStateConfigured Configured.
 * 
 * API-Since: 11.2
 */
@Generated
public final class HMCharacteristicValueConfigurationState {
    @Generated
    private HMCharacteristicValueConfigurationState() {
    }

    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long NotConfigured = 0x0000000000000000L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long Configured = 0x0000000000000001L;
}

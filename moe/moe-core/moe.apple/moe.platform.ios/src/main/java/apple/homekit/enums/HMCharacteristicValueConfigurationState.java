package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum      HMCharacteristicValueConfigurationState
 * 
 * @constant  HMCharacteristicValueConfigurationStateNotConfigured  Not Configured.
 * @constant  HMCharacteristicValueConfigurationStateConfigured     Configured.
 */
@Generated
public final class HMCharacteristicValueConfigurationState {
    @Generated
    private HMCharacteristicValueConfigurationState() {
    }

    @Generated @NInt public static final long NotConfigured = 0x0000000000000000L;
    @Generated @NInt public static final long Configured = 0x0000000000000001L;
}
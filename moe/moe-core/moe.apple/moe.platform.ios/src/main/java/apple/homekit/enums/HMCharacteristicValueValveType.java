package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] HMCharacteristicValueValveType
 * 
 * [@constant] HMCharacteristicValueValveTypeGenericValve Generic Valve.
 * [@constant] HMCharacteristicValueValveTypeIrrigation Irrigation.
 * [@constant] HMCharacteristicValueValveTypeShowerHead Shower Head.
 * [@constant] HMCharacteristicValueValveTypeWaterFaucet Water Faucet.
 * 
 * API-Since: 11.2
 */
@Generated
public final class HMCharacteristicValueValveType {
    @Generated
    private HMCharacteristicValueValveType() {
    }

    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long GenericValve = 0x0000000000000000L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long Irrigation = 0x0000000000000001L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long ShowerHead = 0x0000000000000002L;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long WaterFaucet = 0x0000000000000003L;
}

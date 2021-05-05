package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HMCharacteristicValueValveType
 * 
 * [@constant]  HMCharacteristicValueValveTypeGenericValve    Generic Valve.
 * [@constant]  HMCharacteristicValueValveTypeIrrigation      Irrigation.
 * [@constant]  HMCharacteristicValueValveTypeShowerHead      Shower Head.
 * [@constant]  HMCharacteristicValueValveTypeWaterFaucet     Water Faucet.
 */
@Generated
public final class HMCharacteristicValueValveType {
    @Generated
    private HMCharacteristicValueValveType() {
    }

    @Generated @NInt public static final long GenericValve = 0x0000000000000000L;
    @Generated @NInt public static final long Irrigation = 0x0000000000000001L;
    @Generated @NInt public static final long ShowerHead = 0x0000000000000002L;
    @Generated @NInt public static final long WaterFaucet = 0x0000000000000003L;
}
package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum      HMCharacteristicValueCurrentHeatingCooling
 * 
 * @constant  HMCharacteristicValueCurrentHeatingCoolingOff   Off.
 * @constant  HMCharacteristicValueCurrentHeatingCoolingHeat  The Heater is currently on.
 * @constant  HMCharacteristicValueCurrentHeatingCoolingCool  Cooler is currently on.
 */
@Generated
public final class HMCharacteristicValueCurrentHeatingCooling {
    @Generated
    private HMCharacteristicValueCurrentHeatingCooling() {
    }

    @Generated @NInt public static final long Off = 0x0000000000000000L;
    @Generated @NInt public static final long Heat = 0x0000000000000001L;
    @Generated @NInt public static final long Cool = 0x0000000000000002L;
}
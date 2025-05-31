package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 18.4
 */
@Generated
public final class MTREnergyEVSEFaultState {
    @Generated
    private MTREnergyEVSEFaultState() {
    }

    /**
     * API-Since: 18.4
     */
    @Generated public static final byte NoError = 0;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte MeterFailure = 1;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte OverVoltage = 2;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte UnderVoltage = 3;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte OverCurrent = 4;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte ContactWetFailure = 5;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte ContactDryFailure = 6;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte GroundFault = 7;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PowerLoss = 8;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PowerQuality = 9;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PilotShortCircuit = 10;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte EmergencyStop = 11;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte EVDisconnected = 12;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte WrongPowerSupply = 13;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte LiveNeutralSwap = 14;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte OverTemperature = 15;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte Other = -1;
}
package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] SRElectrocardiogramDataFlags
 * 
 * Flags indicating sensor context or events that occurred during
 * the sample reading
 * 
 * These flags can provide some indication of data validity or other system conditions
 * that may influence how the recorded data should be treated.
 * 
 * 
 * API-Since: 17.4
 */
@Generated
public final class SRElectrocardiogramDataFlags {
    @Generated
    private SRElectrocardiogramDataFlags() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * [@const] SRElectrocardiogramDataFlagsSignalInvalid
     * 
     * Indicates an invalid sensor signal in the ECG data
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long SignalInvalid = 0x0000000000000001L;
    /**
     * [@const] SRElectrocardiogramDataFlagsCrownTouched
     * 
     * Indicates ECG data was recorded when the crown was being touched
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long CrownTouched = 0x0000000000000002L;
}
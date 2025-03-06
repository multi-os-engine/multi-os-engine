package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] SRElectrocardiogramSessionGuidance
 * 
 * The type of session used to record the ECG sample
 * 
 * [@const] SRElectrocardiogramSessionGuidanceGuided
 * 
 * A session, usually of fixed duration, where the user is provided coaching to guide the ECG readings
 * 
 * [@const] SRElectrocardiogramSessionGuidanceUnguided
 * 
 * A session, usually of undefined duration, where the user is not provided coaching to guide the ECG readings
 * 
 * 
 * API-Since: 17.4
 */
@Generated
public final class SRElectrocardiogramSessionGuidance {
    @Generated
    private SRElectrocardiogramSessionGuidance() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Guided = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Unguided = 0x0000000000000002L;
}
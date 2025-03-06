package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] SRElectrocardiogramSessionState
 * 
 * The state of the ECG session when this sample was taken
 * 
 * 
 * API-Since: 17.4
 */
@Generated
public final class SRElectrocardiogramSessionState {
    @Generated
    private SRElectrocardiogramSessionState() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Begin = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Active = 0x0000000000000002L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long End = 0x0000000000000003L;
}
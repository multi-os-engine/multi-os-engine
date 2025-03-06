package apple.sensorkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] SRElectrocardiogramLead
 * 
 * Which lead was used to record the ECG data
 * 
 * API-Since: 17.4
 */
@Generated
public final class SRElectrocardiogramLead {
    @Generated
    private SRElectrocardiogramLead() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long RightArmMinusLeftArm = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long LeftArmMinusRightArm = 0x0000000000000002L;
}
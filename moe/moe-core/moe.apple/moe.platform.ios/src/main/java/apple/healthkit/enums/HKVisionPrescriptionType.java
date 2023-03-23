package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] HKVisionPrescriptionType
 * 
 * Represents a vision prescription type
 * 
 * API-Since: 16.0
 */
@Generated
public final class HKVisionPrescriptionType {
    @Generated
    private HKVisionPrescriptionType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Glasses = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Contacts = 0x0000000000000002L;
}
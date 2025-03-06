package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVExternalContentProtectionStatus
 * 
 * The constants can be used to derive whether or not we have established sufficient protection to display content
 * protected by this AVContentKey on some set of attached displays.
 * 
 * [@constant] AVExternalContentProtectionStatusPending
 * Indicates that the current protection status has not yet been discovered for the attached display(s).
 * [@constant] AVExternalContentProtectionStatusSufficient
 * Indicates that sufficient protection with the attached display(s) has been established, content protected by the
 * associated AVContentKey will be eligible to be displayed on the display(s).
 * [@constant] AVExternalContentProtectionStatusInsufficient
 * Indicates that sufficient protection with the attached display(s) has failed to be established, content protected by
 * the associated AVContentKey will not be displayed.
 * 
 * API-Since: 17.4
 */
@Generated
public final class AVExternalContentProtectionStatus {
    @Generated
    private AVExternalContentProtectionStatus() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Pending = 0x0000000000000000L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Sufficient = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Insufficient = 0x0000000000000002L;
}
package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class CKSharingParticipantAccessOption {
    @Generated
    private CKSharingParticipantAccessOption() {
    }

    /**
     * If specified, the system sharing UI will allow the user to share publicly i.e. anyone with the link has access.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long AnyoneWithLink = 0x0000000000000001L;
    /**
     * If specified, the system sharing UI will allow the user to share privately to specified recipients.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long SpecifiedRecipientsOnly = 0x0000000000000002L;
    /**
     * Allow the user to configure the share with either access option.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Any = 0x0000000000000003L;
}
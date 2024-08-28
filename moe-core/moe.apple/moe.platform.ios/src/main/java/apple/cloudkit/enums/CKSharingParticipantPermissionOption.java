package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class CKSharingParticipantPermissionOption {
    @Generated
    private CKSharingParticipantPermissionOption() {
    }

    /**
     * If specified, the system sharing UI will allow the user to grant participants read-only permissions.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ReadOnly = 0x0000000000000001L;
    /**
     * If specified, the system sharing UI will allow the user to grant participants read/write permissions.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ReadWrite = 0x0000000000000002L;
    /**
     * Allow the user to configure added share participants with either permission option.
     * 
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Any = 0x0000000000000003L;
}
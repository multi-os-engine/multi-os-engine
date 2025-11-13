package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the participant role in a share:
 * - `owner`: Can add private users.
 * - `privateUser`: Can access the share.
 * - `publicUser`: Self-added when accessing the share URL (owners cannot add public users).
 * - `administrator`: Can add and remove participants and change their permissions.
 * 
 * Shares with ``CloudKit/CKShareParticipantRole/CKShareParticipantRoleAdministrator`` participants will be returned as
 * read-only to devices running OS versions prior to this role being introduced.
 * Administrator participants on these read-only shares will be returned as
 * ``CloudKit/CKShareParticipantRole/CKShareParticipantRolePrivateUser``.
 * 
 * API-Since: 12.0
 */
@Generated
public final class CKShareParticipantRole {
    @Generated
    private CKShareParticipantRole() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Owner = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long PrivateUser = 0x0000000000000003L;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long PublicUser = 0x0000000000000004L;
    /**
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Administrator = 0x0000000000000002L;
}

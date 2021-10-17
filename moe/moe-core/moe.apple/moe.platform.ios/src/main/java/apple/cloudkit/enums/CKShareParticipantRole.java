package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The participant type determines whether a participant can modify the list of participants on a share.
 * <p>
 * - Owners can add private users
 * - Private users can access the share
 * - Public users are "self-added" when the participant accesses the shareURL.  Owners cannot add public users.
 */
@Generated
public final class CKShareParticipantRole {
    @Generated
    private CKShareParticipantRole() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Owner = 0x0000000000000001L;
    @Generated @NInt public static final long PrivateUser = 0x0000000000000003L;
    @Generated @NInt public static final long PublicUser = 0x0000000000000004L;
}

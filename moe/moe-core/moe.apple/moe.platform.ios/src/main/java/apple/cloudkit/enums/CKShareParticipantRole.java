package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

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
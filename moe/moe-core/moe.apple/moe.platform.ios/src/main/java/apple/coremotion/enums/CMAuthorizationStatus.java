package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CMAuthorizationStatus {
    @Generated
    private CMAuthorizationStatus() {
    }

    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;
}
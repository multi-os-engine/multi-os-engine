package apple.apptrackingtransparency.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class ATTrackingManagerAuthorizationStatus {
    @Generated
    private ATTrackingManagerAuthorizationStatus() {
    }

    @Generated @NUInt public static final long NotDetermined = 0x0000000000000000L;
    @Generated @NUInt public static final long Restricted = 0x0000000000000001L;
    @Generated @NUInt public static final long Denied = 0x0000000000000002L;
    @Generated @NUInt public static final long Authorized = 0x0000000000000003L;
}

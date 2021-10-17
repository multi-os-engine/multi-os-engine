package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ASAuthorizationError {
    @Generated
    private ASAuthorizationError() {
    }

    @Generated @NInt public static final long Unknown = 0x00000000000003E8L;
    @Generated @NInt public static final long Canceled = 0x00000000000003E9L;
    @Generated @NInt public static final long InvalidResponse = 0x00000000000003EAL;
    @Generated @NInt public static final long NotHandled = 0x00000000000003EBL;
    @Generated @NInt public static final long Failed = 0x00000000000003ECL;
    @Generated @NInt public static final long NotInteractive = 0x00000000000003EDL;
}

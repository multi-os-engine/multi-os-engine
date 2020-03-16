package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ASAuthorizationAppleIDProviderCredentialState {
    @Generated
    private ASAuthorizationAppleIDProviderCredentialState() {
    }

    @Generated @NInt public static final long Revoked = 0x0000000000000000L;
    @Generated @NInt public static final long Authorized = 0x0000000000000001L;
    @Generated @NInt public static final long NotFound = 0x0000000000000002L;
    @Generated @NInt public static final long Transferred = 0x0000000000000003L;
}
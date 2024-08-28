package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ASAuthorizationAppleIDProviderCredentialState
 * 
 * Authorization state of an Apple ID credential.
 * [@constant] ASAuthorizationAppleIDProviderCredentialAuthorized The Opaque user ID is in good state.
 * [@constant] ASAuthorizationAppleIDProviderCredentialRevoked The Opaque user ID was revoked by the user.
 * [@constant] ASAuthorizationAppleIDProviderCredentialNotFound The Opaque user ID was not found.
 * 
 * API-Since: 13.0
 */
@Generated
public final class ASAuthorizationAppleIDProviderCredentialState {
    @Generated
    private ASAuthorizationAppleIDProviderCredentialState() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Revoked = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NotFound = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Transferred = 0x0000000000000003L;
}

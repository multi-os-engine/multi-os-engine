package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 18.0
 */
@Generated
public final class ASAuthorizationPlatformPublicKeyCredentialRegistrationRequestStyle {
    @Generated
    private ASAuthorizationPlatformPublicKeyCredentialRegistrationRequestStyle() {
    }

    /**
     * Perform a request using the standard presentation style. This is the default style.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000000L;
    /**
     * Perform a conditional request. This style of request is meant to opportunistically add passkeys to existing
     * password-based accounts, at the discretion of the user's credential manager. It should be performed
     * shortly after a user has signed in with a password. If the user is using a password and passkey manager,
     * and certain internal conditions of that credential manager are met (e.g. the user signed in recently with a
     * matching password-based account and does not yet have a passkey for this account), then this request
     * may proceed automatically, without further user interaction. If any of the internal conditions are not met,
     * this request will return an error without showing any UI to the user, and may be retried the next time they
     * sign in.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Conditional = 0x0000000000000001L;
}
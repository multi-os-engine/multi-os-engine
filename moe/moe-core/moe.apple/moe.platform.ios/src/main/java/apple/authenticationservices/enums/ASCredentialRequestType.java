package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ASCredentialRequestType
 * [@constant] ASCredentialRequestTypePassword Password credential type.
 * [@constant] ASCredentialRequestTypePasskeyAssertion Passkey assertion credential type.
 * 
 * API-Since: 17.0
 */
@Generated
public final class ASCredentialRequestType {
    @Generated
    private ASCredentialRequestType() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Password = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long PasskeyAssertion = 0x0000000000000001L;
}
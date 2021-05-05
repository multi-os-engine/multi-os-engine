package apple.safariservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SFAuthenticationError
 * 
 * Error code of the NSError object passed in by SFAuthenticationCompletionHandler.
 * [@constant] SFAuthenticationErrorCanceledLogin The user has canceled login by cancelling the alert asking for permission to log in to this app, or by dismissing the view controller for loading the authentication webpage.
 */
@Generated
public final class SFAuthenticationError {
    @Generated
    private SFAuthenticationError() {
    }

    @Generated @NInt public static final long SFAuthenticationErrorCanceledLogin = 0x0000000000000001L;
}
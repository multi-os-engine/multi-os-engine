package apple.authenticationservices.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum ASWebAuthenticationSessionErrorCode
 * @abstract Error code of the NSError object passed in by ASWebAuthenticationSessionCompletionHandler.
 * @constant ASWebAuthenticationSessionErrorCodeCanceledLogin The user has canceled login by cancelling the
 * alert asking for permission to log in to this app, or by dismissing the view controller for loading the
 * authentication webpage.
 * @constant ASWebAuthenticationSessionErrorCodePresentationContextNotProvided A valid presentationContextProvider
 * was not found when -start was called. Ensure this property was not nil when -start was called.
 * @constant ASWebAuthenticationSessionErrorCodePresentationContextInvalid The presentation context returned
 * was not elligible to show the authentication UI. For iOS, validate that the UIWindow is in a foreground scene.
 */
@Generated
public final class ASWebAuthenticationSessionErrorCode {
    @Generated
    private ASWebAuthenticationSessionErrorCode() {
    }

    @Generated @NInt public static final long CanceledLogin = 0x0000000000000001L;
    @Generated @NInt public static final long PresentationContextNotProvided = 0x0000000000000002L;
    @Generated @NInt public static final long PresentationContextInvalid = 0x0000000000000003L;
}
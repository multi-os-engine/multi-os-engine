package apple.intents.protocol;

import apple.intents.INAccountTypeResolutionResult;
import apple.intents.INBalanceTypeResolutionResult;
import apple.intents.INSearchForAccountsIntent;
import apple.intents.INSearchForAccountsIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSearchForAccountsIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForAccountsIntentHandling")
public interface INSearchForAccountsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSearchForAccountsIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * @see INSearchForAccountsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForAccounts:completion:")
    default void confirmSearchForAccountsCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_confirmSearchForAccountsCompletion") Block_confirmSearchForAccountsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForAccountsCompletion {
        @Generated
        void call_confirmSearchForAccountsCompletion(INSearchForAccountsIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSearchForAccountsIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSearchForAccountsIntentResponse containing the details of
     *                   the result of having executed the intent
     * @see INSearchForAccountsIntentResponse
     */
    @Generated
    @Selector("handleSearchForAccounts:completion:")
    void handleSearchForAccountsCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_handleSearchForAccountsCompletion") Block_handleSearchForAccountsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForAccountsCompletion {
        @Generated
        void call_handleSearchForAccountsCompletion(INSearchForAccountsIntentResponse response);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveAccountNicknameForSearchForAccounts:withCompletion:")
    default void resolveAccountNicknameForSearchForAccountsWithCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_resolveAccountNicknameForSearchForAccountsWithCompletion") Block_resolveAccountNicknameForSearchForAccountsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAccountNicknameForSearchForAccountsWithCompletion {
        @Generated
        void call_resolveAccountNicknameForSearchForAccountsWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveAccountTypeForSearchForAccounts:withCompletion:")
    default void resolveAccountTypeForSearchForAccountsWithCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_resolveAccountTypeForSearchForAccountsWithCompletion") Block_resolveAccountTypeForSearchForAccountsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAccountTypeForSearchForAccountsWithCompletion {
        @Generated
        void call_resolveAccountTypeForSearchForAccountsWithCompletion(INAccountTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveOrganizationNameForSearchForAccounts:withCompletion:")
    default void resolveOrganizationNameForSearchForAccountsWithCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_resolveOrganizationNameForSearchForAccountsWithCompletion") Block_resolveOrganizationNameForSearchForAccountsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveOrganizationNameForSearchForAccountsWithCompletion {
        @Generated
        void call_resolveOrganizationNameForSearchForAccountsWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveRequestedBalanceTypeForSearchForAccounts:withCompletion:")
    default void resolveRequestedBalanceTypeForSearchForAccountsWithCompletion(INSearchForAccountsIntent intent,
            @ObjCBlock(name = "call_resolveRequestedBalanceTypeForSearchForAccountsWithCompletion") Block_resolveRequestedBalanceTypeForSearchForAccountsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRequestedBalanceTypeForSearchForAccountsWithCompletion {
        @Generated
        void call_resolveRequestedBalanceTypeForSearchForAccountsWithCompletion(
                INBalanceTypeResolutionResult resolutionResult);
    }
}

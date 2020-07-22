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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForAccountsIntentHandling")
public interface INSearchForAccountsIntentHandling {
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
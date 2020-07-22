package apple.intents.protocol;

import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPaymentAccountResolutionResult;
import apple.intents.INPaymentAmountResolutionResult;
import apple.intents.INStringResolutionResult;
import apple.intents.INTransferMoneyIntent;
import apple.intents.INTransferMoneyIntentResponse;
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
@ObjCProtocolName("INTransferMoneyIntentHandling")
public interface INTransferMoneyIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmTransferMoney:completion:")
    default void confirmTransferMoneyCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_confirmTransferMoneyCompletion") Block_confirmTransferMoneyCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmTransferMoneyCompletion {
        @Generated
        void call_confirmTransferMoneyCompletion(INTransferMoneyIntentResponse response);
    }

    @Generated
    @Selector("handleTransferMoney:completion:")
    void handleTransferMoneyCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_handleTransferMoneyCompletion") Block_handleTransferMoneyCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleTransferMoneyCompletion {
        @Generated
        void call_handleTransferMoneyCompletion(INTransferMoneyIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveFromAccountForTransferMoney:withCompletion:")
    default void resolveFromAccountForTransferMoneyWithCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_resolveFromAccountForTransferMoneyWithCompletion") Block_resolveFromAccountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFromAccountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveFromAccountForTransferMoneyWithCompletion(INPaymentAccountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveToAccountForTransferMoney:withCompletion:")
    default void resolveToAccountForTransferMoneyWithCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_resolveToAccountForTransferMoneyWithCompletion") Block_resolveToAccountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveToAccountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveToAccountForTransferMoneyWithCompletion(INPaymentAccountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionAmountForTransferMoney:withCompletion:")
    default void resolveTransactionAmountForTransferMoneyWithCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_resolveTransactionAmountForTransferMoneyWithCompletion") Block_resolveTransactionAmountForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionAmountForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionAmountForTransferMoneyWithCompletion(
                INPaymentAmountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionNoteForTransferMoney:withCompletion:")
    default void resolveTransactionNoteForTransferMoneyWithCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_resolveTransactionNoteForTransferMoneyWithCompletion") Block_resolveTransactionNoteForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionNoteForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionNoteForTransferMoneyWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionScheduledDateForTransferMoney:withCompletion:")
    default void resolveTransactionScheduledDateForTransferMoneyWithCompletion(INTransferMoneyIntent intent,
            @ObjCBlock(name = "call_resolveTransactionScheduledDateForTransferMoneyWithCompletion") Block_resolveTransactionScheduledDateForTransferMoneyWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionScheduledDateForTransferMoneyWithCompletion {
        @Generated
        void call_resolveTransactionScheduledDateForTransferMoneyWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }
}
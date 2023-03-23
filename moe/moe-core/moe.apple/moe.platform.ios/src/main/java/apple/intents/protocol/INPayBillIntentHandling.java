package apple.intents.protocol;

import apple.intents.INBillPayeeResolutionResult;
import apple.intents.INBillTypeResolutionResult;
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPayBillIntent;
import apple.intents.INPayBillIntentResponse;
import apple.intents.INPaymentAccountResolutionResult;
import apple.intents.INPaymentAmountResolutionResult;
import apple.intents.INStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INPayBillIntent. By implementing this protocol, a class can provide logic
 * for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.3
 * Deprecated-Since: 15.0
 * Deprecated-Message: INPayBillIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INPayBillIntentHandling")
public interface INPayBillIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INPayBillIntentResponse containing additional details about the
     *                   intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INPayBillIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmPayBill:completion:")
    default void confirmPayBillCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_confirmPayBillCompletion") Block_confirmPayBillCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmPayBillCompletion {
        @Generated
        void call_confirmPayBillCompletion(INPayBillIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INPayBillIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INPayBillIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INPayBillIntentResponse
     */
    @Generated
    @Selector("handlePayBill:completion:")
    void handlePayBillCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_handlePayBillCompletion") Block_handlePayBillCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handlePayBillCompletion {
        @Generated
        void call_handlePayBillCompletion(INPayBillIntentResponse response);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveBillPayeeForPayBill:withCompletion:")
    default void resolveBillPayeeForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveBillPayeeForPayBillWithCompletion") Block_resolveBillPayeeForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillPayeeForPayBillWithCompletion {
        @Generated
        void call_resolveBillPayeeForPayBillWithCompletion(INBillPayeeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveBillTypeForPayBill:withCompletion:")
    default void resolveBillTypeForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveBillTypeForPayBillWithCompletion") Block_resolveBillTypeForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillTypeForPayBillWithCompletion {
        @Generated
        void call_resolveBillTypeForPayBillWithCompletion(INBillTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveDueDateForPayBill:withCompletion:")
    default void resolveDueDateForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveDueDateForPayBillWithCompletion") Block_resolveDueDateForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDueDateForPayBillWithCompletion {
        @Generated
        void call_resolveDueDateForPayBillWithCompletion(INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveFromAccountForPayBill:withCompletion:")
    default void resolveFromAccountForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveFromAccountForPayBillWithCompletion") Block_resolveFromAccountForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFromAccountForPayBillWithCompletion {
        @Generated
        void call_resolveFromAccountForPayBillWithCompletion(INPaymentAccountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionAmountForPayBill:withCompletion:")
    default void resolveTransactionAmountForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveTransactionAmountForPayBillWithCompletion") Block_resolveTransactionAmountForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionAmountForPayBillWithCompletion {
        @Generated
        void call_resolveTransactionAmountForPayBillWithCompletion(INPaymentAmountResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionNoteForPayBill:withCompletion:")
    default void resolveTransactionNoteForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveTransactionNoteForPayBillWithCompletion") Block_resolveTransactionNoteForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionNoteForPayBillWithCompletion {
        @Generated
        void call_resolveTransactionNoteForPayBillWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTransactionScheduledDateForPayBill:withCompletion:")
    default void resolveTransactionScheduledDateForPayBillWithCompletion(INPayBillIntent intent,
            @ObjCBlock(name = "call_resolveTransactionScheduledDateForPayBillWithCompletion") Block_resolveTransactionScheduledDateForPayBillWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTransactionScheduledDateForPayBillWithCompletion {
        @Generated
        void call_resolveTransactionScheduledDateForPayBillWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }
}

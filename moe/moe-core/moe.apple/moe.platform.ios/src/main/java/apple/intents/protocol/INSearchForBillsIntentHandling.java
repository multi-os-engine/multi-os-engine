package apple.intents.protocol;

import apple.intents.INBillPayeeResolutionResult;
import apple.intents.INBillTypeResolutionResult;
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INPaymentStatusResolutionResult;
import apple.intents.INSearchForBillsIntent;
import apple.intents.INSearchForBillsIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INSearchForBillsIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.3
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSearchForBillsIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForBillsIntentHandling")
public interface INSearchForBillsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSearchForBillsIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSearchForBillsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForBills:completion:")
    default void confirmSearchForBillsCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmSearchForBillsCompletion") Block_confirmSearchForBillsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForBillsCompletion {
        @Generated
        void call_confirmSearchForBillsCompletion(@NotNull INSearchForBillsIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSearchForBillsIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSearchForBillsIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INSearchForBillsIntentResponse
     */
    @Generated
    @Selector("handleSearchForBills:completion:")
    void handleSearchForBillsCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_handleSearchForBillsCompletion") Block_handleSearchForBillsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForBillsCompletion {
        @Generated
        void call_handleSearchForBillsCompletion(@NotNull INSearchForBillsIntentResponse response);
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
    @Selector("resolveBillPayeeForSearchForBills:withCompletion:")
    default void resolveBillPayeeForSearchForBillsWithCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveBillPayeeForSearchForBillsWithCompletion") Block_resolveBillPayeeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillPayeeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveBillPayeeForSearchForBillsWithCompletion(
                @NotNull INBillPayeeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveBillTypeForSearchForBills:withCompletion:")
    default void resolveBillTypeForSearchForBillsWithCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveBillTypeForSearchForBillsWithCompletion") Block_resolveBillTypeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillTypeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveBillTypeForSearchForBillsWithCompletion(@NotNull INBillTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveDueDateRangeForSearchForBills:withCompletion:")
    default void resolveDueDateRangeForSearchForBillsWithCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDueDateRangeForSearchForBillsWithCompletion") Block_resolveDueDateRangeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDueDateRangeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveDueDateRangeForSearchForBillsWithCompletion(
                @NotNull INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolvePaymentDateRangeForSearchForBills:withCompletion:")
    default void resolvePaymentDateRangeForSearchForBillsWithCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePaymentDateRangeForSearchForBillsWithCompletion") Block_resolvePaymentDateRangeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePaymentDateRangeForSearchForBillsWithCompletion {
        @Generated
        void call_resolvePaymentDateRangeForSearchForBillsWithCompletion(
                @NotNull INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveStatusForSearchForBills:withCompletion:")
    default void resolveStatusForSearchForBillsWithCompletion(@NotNull INSearchForBillsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveStatusForSearchForBillsWithCompletion") Block_resolveStatusForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStatusForSearchForBillsWithCompletion {
        @Generated
        void call_resolveStatusForSearchForBillsWithCompletion(
                @NotNull INPaymentStatusResolutionResult resolutionResult);
    }
}

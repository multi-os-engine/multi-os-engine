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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForBillsIntentHandling")
public interface INSearchForBillsIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSearchForBills:completion:")
    default void confirmSearchForBillsCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_confirmSearchForBillsCompletion") Block_confirmSearchForBillsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForBillsCompletion {
        @Generated
        void call_confirmSearchForBillsCompletion(INSearchForBillsIntentResponse arg0);
    }

    @Generated
    @Selector("handleSearchForBills:completion:")
    void handleSearchForBillsCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_handleSearchForBillsCompletion") Block_handleSearchForBillsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForBillsCompletion {
        @Generated
        void call_handleSearchForBillsCompletion(INSearchForBillsIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveBillPayeeForSearchForBills:withCompletion:")
    default void resolveBillPayeeForSearchForBillsWithCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_resolveBillPayeeForSearchForBillsWithCompletion") Block_resolveBillPayeeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillPayeeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveBillPayeeForSearchForBillsWithCompletion(INBillPayeeResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveBillTypeForSearchForBills:withCompletion:")
    default void resolveBillTypeForSearchForBillsWithCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_resolveBillTypeForSearchForBillsWithCompletion") Block_resolveBillTypeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBillTypeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveBillTypeForSearchForBillsWithCompletion(INBillTypeResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveDueDateRangeForSearchForBills:withCompletion:")
    default void resolveDueDateRangeForSearchForBillsWithCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_resolveDueDateRangeForSearchForBillsWithCompletion") Block_resolveDueDateRangeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDueDateRangeForSearchForBillsWithCompletion {
        @Generated
        void call_resolveDueDateRangeForSearchForBillsWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolvePaymentDateRangeForSearchForBills:withCompletion:")
    default void resolvePaymentDateRangeForSearchForBillsWithCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_resolvePaymentDateRangeForSearchForBillsWithCompletion") Block_resolvePaymentDateRangeForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePaymentDateRangeForSearchForBillsWithCompletion {
        @Generated
        void call_resolvePaymentDateRangeForSearchForBillsWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveStatusForSearchForBills:withCompletion:")
    default void resolveStatusForSearchForBillsWithCompletion(INSearchForBillsIntent intent,
            @ObjCBlock(name = "call_resolveStatusForSearchForBillsWithCompletion") Block_resolveStatusForSearchForBillsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStatusForSearchForBillsWithCompletion {
        @Generated
        void call_resolveStatusForSearchForBillsWithCompletion(INPaymentStatusResolutionResult arg0);
    }
}
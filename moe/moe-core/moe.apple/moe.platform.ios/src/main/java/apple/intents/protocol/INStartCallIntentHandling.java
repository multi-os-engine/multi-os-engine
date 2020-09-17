package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INCallDestinationTypeResolutionResult;
import apple.intents.INCallRecordResolutionResult;
import apple.intents.INStartCallCallCapabilityResolutionResult;
import apple.intents.INStartCallContactResolutionResult;
import apple.intents.INStartCallIntent;
import apple.intents.INStartCallIntentResponse;
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
@ObjCProtocolName("INStartCallIntentHandling")
public interface INStartCallIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmStartCall:completion:")
    default void confirmStartCallCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_confirmStartCallCompletion") Block_confirmStartCallCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartCallCompletion {
        @Generated
        void call_confirmStartCallCompletion(INStartCallIntentResponse response);
    }

    @Generated
    @Selector("handleStartCall:completion:")
    void handleStartCallCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_handleStartCallCompletion") Block_handleStartCallCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartCallCompletion {
        @Generated
        void call_handleStartCallCompletion(INStartCallIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveCallCapabilityForStartCall:withCompletion:")
    default void resolveCallCapabilityForStartCallWithCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_resolveCallCapabilityForStartCallWithCompletion") Block_resolveCallCapabilityForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallCapabilityForStartCallWithCompletion {
        @Generated
        void call_resolveCallCapabilityForStartCallWithCompletion(
                INStartCallCallCapabilityResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveContactsForStartCall:withCompletion:")
    default void resolveContactsForStartCallWithCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_resolveContactsForStartCallWithCompletion") Block_resolveContactsForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContactsForStartCallWithCompletion {
        @Generated
        void call_resolveContactsForStartCallWithCompletion(
                NSArray<? extends INStartCallContactResolutionResult> resolutionResults);
    }

    @Generated
    @IsOptional
    @Selector("resolveDestinationTypeForStartCall:withCompletion:")
    default void resolveDestinationTypeForStartCallWithCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_resolveDestinationTypeForStartCallWithCompletion") Block_resolveDestinationTypeForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDestinationTypeForStartCallWithCompletion {
        @Generated
        void call_resolveDestinationTypeForStartCallWithCompletion(
                INCallDestinationTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveCallRecordToCallBackForStartCall:withCompletion:")
    default void resolveCallRecordToCallBackForStartCallWithCompletion(INStartCallIntent intent,
            @ObjCBlock(name = "call_resolveCallRecordToCallBackForStartCallWithCompletion") Block_resolveCallRecordToCallBackForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallRecordToCallBackForStartCallWithCompletion {
        @Generated
        void call_resolveCallRecordToCallBackForStartCallWithCompletion(INCallRecordResolutionResult resolutionResult);
    }
}
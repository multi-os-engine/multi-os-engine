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
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INStartCallIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INStartCallIntentHandling")
public interface INStartCallIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INStartCallIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INStartCallIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmStartCall:completion:")
    default void confirmStartCallCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmStartCallCompletion") Block_confirmStartCallCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartCallCompletion {
        @Generated
        void call_confirmStartCallCompletion(@NotNull INStartCallIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INStartCallIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INStartCallIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INStartCallIntentResponse
     */
    @Generated
    @Selector("handleStartCall:completion:")
    void handleStartCallCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_handleStartCallCompletion") Block_handleStartCallCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartCallCompletion {
        @Generated
        void call_handleStartCallCompletion(@NotNull INStartCallIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveCallCapabilityForStartCall:withCompletion:")
    default void resolveCallCapabilityForStartCallWithCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCallCapabilityForStartCallWithCompletion") Block_resolveCallCapabilityForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallCapabilityForStartCallWithCompletion {
        @Generated
        void call_resolveCallCapabilityForStartCallWithCompletion(
                @NotNull INStartCallCallCapabilityResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveContactsForStartCall:withCompletion:")
    default void resolveContactsForStartCallWithCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveContactsForStartCallWithCompletion") Block_resolveContactsForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContactsForStartCallWithCompletion {
        @Generated
        void call_resolveContactsForStartCallWithCompletion(
                @NotNull NSArray<? extends INStartCallContactResolutionResult> resolutionResults);
    }

    @Generated
    @IsOptional
    @Selector("resolveDestinationTypeForStartCall:withCompletion:")
    default void resolveDestinationTypeForStartCallWithCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDestinationTypeForStartCallWithCompletion") Block_resolveDestinationTypeForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDestinationTypeForStartCallWithCompletion {
        @Generated
        void call_resolveDestinationTypeForStartCallWithCompletion(
                @NotNull INCallDestinationTypeResolutionResult resolutionResult);
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
     * 
     *      API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("resolveCallRecordToCallBackForStartCall:withCompletion:")
    default void resolveCallRecordToCallBackForStartCallWithCompletion(@NotNull INStartCallIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveCallRecordToCallBackForStartCallWithCompletion") Block_resolveCallRecordToCallBackForStartCallWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCallRecordToCallBackForStartCallWithCompletion {
        @Generated
        void call_resolveCallRecordToCallBackForStartCallWithCompletion(
                @NotNull INCallRecordResolutionResult resolutionResult);
    }
}

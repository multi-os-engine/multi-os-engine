package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INAddMediaIntent;
import apple.intents.INAddMediaIntentResponse;
import apple.intents.INAddMediaMediaDestinationResolutionResult;
import apple.intents.INAddMediaMediaItemResolutionResult;
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
 * Protocol to declare support for handling an INAddMediaIntent. By implementing this protocol, a class can provide
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
@ObjCProtocolName("INAddMediaIntentHandling")
public interface INAddMediaIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INAddMediaIntentResponse containing additional details about the
     *                   intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INAddMediaIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmAddMedia:completion:")
    default void confirmAddMediaCompletion(@NotNull INAddMediaIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmAddMediaCompletion") Block_confirmAddMediaCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAddMediaCompletion {
        @Generated
        void call_confirmAddMediaCompletion(@NotNull INAddMediaIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INAddMediaIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INAddMediaIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INAddMediaIntentResponse
     */
    @Generated
    @Selector("handleAddMedia:completion:")
    void handleAddMediaCompletion(@NotNull INAddMediaIntent intent,
            @NotNull @ObjCBlock(name = "call_handleAddMediaCompletion") Block_handleAddMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAddMediaCompletion {
        @Generated
        void call_handleAddMediaCompletion(@NotNull INAddMediaIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveMediaDestinationForAddMedia:withCompletion:")
    default void resolveMediaDestinationForAddMediaWithCompletion(@NotNull INAddMediaIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveMediaDestinationForAddMediaWithCompletion") Block_resolveMediaDestinationForAddMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaDestinationForAddMediaWithCompletion {
        @Generated
        void call_resolveMediaDestinationForAddMediaWithCompletion(
                @NotNull INAddMediaMediaDestinationResolutionResult resolutionResult);
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
    @Selector("resolveMediaItemsForAddMedia:withCompletion:")
    default void resolveMediaItemsForAddMediaWithCompletion(@NotNull INAddMediaIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveMediaItemsForAddMediaWithCompletion") Block_resolveMediaItemsForAddMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForAddMediaWithCompletion {
        @Generated
        void call_resolveMediaItemsForAddMediaWithCompletion(
                @NotNull NSArray<? extends INAddMediaMediaItemResolutionResult> resolutionResults);
    }
}

package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INSearchForMediaIntent;
import apple.intents.INSearchForMediaIntentResponse;
import apple.intents.INSearchForMediaMediaItemResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSearchForMediaIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
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
@ObjCProtocolName("INSearchForMediaIntentHandling")
public interface INSearchForMediaIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSearchForMediaIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSearchForMediaIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForMedia:completion:")
    default void confirmSearchForMediaCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_confirmSearchForMediaCompletion") Block_confirmSearchForMediaCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForMediaCompletion {
        @Generated
        void call_confirmSearchForMediaCompletion(INSearchForMediaIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSearchForMediaIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSearchForMediaIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INSearchForMediaIntentResponse
     */
    @Generated
    @Selector("handleSearchForMedia:completion:")
    void handleSearchForMediaCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_handleSearchForMediaCompletion") Block_handleSearchForMediaCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForMediaCompletion {
        @Generated
        void call_handleSearchForMediaCompletion(INSearchForMediaIntentResponse response);
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
    @Selector("resolveMediaItemsForSearchForMedia:withCompletion:")
    default void resolveMediaItemsForSearchForMediaWithCompletion(INSearchForMediaIntent intent,
            @ObjCBlock(name = "call_resolveMediaItemsForSearchForMediaWithCompletion") Block_resolveMediaItemsForSearchForMediaWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveMediaItemsForSearchForMediaWithCompletion {
        @Generated
        void call_resolveMediaItemsForSearchForMediaWithCompletion(
                NSArray<? extends INSearchForMediaMediaItemResolutionResult> resolutionResults);
    }
}

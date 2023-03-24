package apple.intents.protocol;

import apple.intents.INAppendToNoteIntent;
import apple.intents.INAppendToNoteIntentResponse;
import apple.intents.INNoteContentResolutionResult;
import apple.intents.INNoteResolutionResult;
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
 * Protocol to declare support for handling an INAppendToNoteIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 11.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INAppendToNoteIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INAppendToNoteIntentHandling")
public interface INAppendToNoteIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INAppendToNoteIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INAppendToNoteIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmAppendToNote:completion:")
    default void confirmAppendToNoteCompletion(@NotNull INAppendToNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmAppendToNoteCompletion") Block_confirmAppendToNoteCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAppendToNoteCompletion {
        @Generated
        void call_confirmAppendToNoteCompletion(@NotNull INAppendToNoteIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INAppendToNoteIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INAppendToNoteIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INAppendToNoteIntentResponse
     */
    @Generated
    @Selector("handleAppendToNote:completion:")
    void handleAppendToNoteCompletion(@NotNull INAppendToNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_handleAppendToNoteCompletion") Block_handleAppendToNoteCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAppendToNoteCompletion {
        @Generated
        void call_handleAppendToNoteCompletion(@NotNull INAppendToNoteIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveContentForAppendToNote:withCompletion:")
    default void resolveContentForAppendToNoteWithCompletion(@NotNull INAppendToNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveContentForAppendToNoteWithCompletion") Block_resolveContentForAppendToNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForAppendToNoteWithCompletion {
        @Generated
        void call_resolveContentForAppendToNoteWithCompletion(@NotNull INNoteContentResolutionResult resolutionResult);
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
    @Selector("resolveTargetNoteForAppendToNote:withCompletion:")
    default void resolveTargetNoteForAppendToNoteWithCompletion(@NotNull INAppendToNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTargetNoteForAppendToNoteWithCompletion") Block_resolveTargetNoteForAppendToNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetNoteForAppendToNoteWithCompletion {
        @Generated
        void call_resolveTargetNoteForAppendToNoteWithCompletion(@NotNull INNoteResolutionResult resolutionResult);
    }
}

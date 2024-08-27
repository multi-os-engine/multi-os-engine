package apple.intents.protocol;

import apple.intents.INCreateNoteIntent;
import apple.intents.INCreateNoteIntentResponse;
import apple.intents.INNoteContentResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
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
 * Protocol to declare support for handling an INCreateNoteIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCreateNoteIntentHandling")
public interface INCreateNoteIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INCreateNoteIntentResponse containing additional details about
     *                   the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INCreateNoteIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmCreateNote:completion:")
    default void confirmCreateNoteCompletion(@NotNull INCreateNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmCreateNoteCompletion") Block_confirmCreateNoteCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCreateNoteCompletion {
        @Generated
        void call_confirmCreateNoteCompletion(@NotNull INCreateNoteIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INCreateNoteIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INCreateNoteIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INCreateNoteIntentResponse
     */
    @Generated
    @Selector("handleCreateNote:completion:")
    void handleCreateNoteCompletion(@NotNull INCreateNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_handleCreateNoteCompletion") Block_handleCreateNoteCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCreateNoteCompletion {
        @Generated
        void call_handleCreateNoteCompletion(@NotNull INCreateNoteIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveContentForCreateNote:withCompletion:")
    default void resolveContentForCreateNoteWithCompletion(@NotNull INCreateNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveContentForCreateNoteWithCompletion") Block_resolveContentForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForCreateNoteWithCompletion {
        @Generated
        void call_resolveContentForCreateNoteWithCompletion(@NotNull INNoteContentResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNameForCreateNote:withCompletion:")
    default void resolveGroupNameForCreateNoteWithCompletion(@NotNull INCreateNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveGroupNameForCreateNoteWithCompletion") Block_resolveGroupNameForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForCreateNoteWithCompletion {
        @Generated
        void call_resolveGroupNameForCreateNoteWithCompletion(
                @NotNull INSpeakableStringResolutionResult resolutionResult);
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
    @Selector("resolveTitleForCreateNote:withCompletion:")
    default void resolveTitleForCreateNoteWithCompletion(@NotNull INCreateNoteIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveTitleForCreateNoteWithCompletion") Block_resolveTitleForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTitleForCreateNoteWithCompletion {
        @Generated
        void call_resolveTitleForCreateNoteWithCompletion(@NotNull INSpeakableStringResolutionResult resolutionResult);
    }
}

package apple.intents.protocol;

import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INDateSearchTypeResolutionResult;
import apple.intents.INLocationSearchTypeResolutionResult;
import apple.intents.INNotebookItemTypeResolutionResult;
import apple.intents.INPlacemarkResolutionResult;
import apple.intents.INSearchForNotebookItemsIntent;
import apple.intents.INSearchForNotebookItemsIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INStringResolutionResult;
import apple.intents.INTaskPriorityResolutionResult;
import apple.intents.INTaskStatusResolutionResult;
import apple.intents.INTemporalEventTriggerTypeOptionsResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSearchForNotebookItemsIntent. By implementing this protocol, a class
 * can provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSearchForNotebookItemsIntentHandling")
public interface INSearchForNotebookItemsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSearchForNotebookItemsIntentResponse containing additional
     *                   details about the intent that may be relevant for the system to show the user prior to
     *                   handling.
     * @see INSearchForNotebookItemsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSearchForNotebookItems:completion:")
    default void confirmSearchForNotebookItemsCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_confirmSearchForNotebookItemsCompletion") Block_confirmSearchForNotebookItemsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSearchForNotebookItemsCompletion {
        @Generated
        void call_confirmSearchForNotebookItemsCompletion(INSearchForNotebookItemsIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSearchForNotebookItemsIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSearchForNotebookItemsIntentResponse containing the
     *                   details of the result of having executed the intent
     * @see INSearchForNotebookItemsIntentResponse
     */
    @Generated
    @Selector("handleSearchForNotebookItems:completion:")
    void handleSearchForNotebookItemsCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_handleSearchForNotebookItemsCompletion") Block_handleSearchForNotebookItemsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSearchForNotebookItemsCompletion {
        @Generated
        void call_handleSearchForNotebookItemsCompletion(INSearchForNotebookItemsIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveContentForSearchForNotebookItems:withCompletion:")
    default void resolveContentForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveContentForSearchForNotebookItemsWithCompletion") Block_resolveContentForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveContentForSearchForNotebookItemsWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveDateSearchTypeForSearchForNotebookItems:withCompletion:")
    default void resolveDateSearchTypeForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveDateSearchTypeForSearchForNotebookItemsWithCompletion") Block_resolveDateSearchTypeForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateSearchTypeForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveDateSearchTypeForSearchForNotebookItemsWithCompletion(
                INDateSearchTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveDateTimeForSearchForNotebookItems:withCompletion:")
    default void resolveDateTimeForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveDateTimeForSearchForNotebookItemsWithCompletion") Block_resolveDateTimeForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDateTimeForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveDateTimeForSearchForNotebookItemsWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveItemTypeForSearchForNotebookItems:withCompletion:")
    default void resolveItemTypeForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveItemTypeForSearchForNotebookItemsWithCompletion") Block_resolveItemTypeForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveItemTypeForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveItemTypeForSearchForNotebookItemsWithCompletion(
                INNotebookItemTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationForSearchForNotebookItems:withCompletion:")
    default void resolveLocationForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveLocationForSearchForNotebookItemsWithCompletion") Block_resolveLocationForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveLocationForSearchForNotebookItemsWithCompletion(INPlacemarkResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveLocationSearchTypeForSearchForNotebookItems:withCompletion:")
    default void resolveLocationSearchTypeForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveLocationSearchTypeForSearchForNotebookItemsWithCompletion") Block_resolveLocationSearchTypeForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLocationSearchTypeForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveLocationSearchTypeForSearchForNotebookItemsWithCompletion(
                INLocationSearchTypeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveStatusForSearchForNotebookItems:withCompletion:")
    default void resolveStatusForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveStatusForSearchForNotebookItemsWithCompletion") Block_resolveStatusForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStatusForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveStatusForSearchForNotebookItemsWithCompletion(INTaskStatusResolutionResult resolutionResult);
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveTitleForSearchForNotebookItems:withCompletion:")
    default void resolveTitleForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveTitleForSearchForNotebookItemsWithCompletion") Block_resolveTitleForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTitleForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveTitleForSearchForNotebookItemsWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskPriorityForSearchForNotebookItems:withCompletion:")
    default void resolveTaskPriorityForSearchForNotebookItemsWithCompletion(INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveTaskPriorityForSearchForNotebookItemsWithCompletion") Block_resolveTaskPriorityForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskPriorityForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveTaskPriorityForSearchForNotebookItemsWithCompletion(
                INTaskPriorityResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerTypesForSearchForNotebookItems:withCompletion:")
    default void resolveTemporalEventTriggerTypesForSearchForNotebookItemsWithCompletion(
            INSearchForNotebookItemsIntent intent,
            @ObjCBlock(name = "call_resolveTemporalEventTriggerTypesForSearchForNotebookItemsWithCompletion") Block_resolveTemporalEventTriggerTypesForSearchForNotebookItemsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerTypesForSearchForNotebookItemsWithCompletion {
        @Generated
        void call_resolveTemporalEventTriggerTypesForSearchForNotebookItemsWithCompletion(
                INTemporalEventTriggerTypeOptionsResolutionResult resolutionResult);
    }
}

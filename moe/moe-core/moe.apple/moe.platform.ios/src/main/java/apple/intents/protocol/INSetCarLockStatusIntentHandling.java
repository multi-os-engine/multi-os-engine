package apple.intents.protocol;

import apple.intents.INBooleanResolutionResult;
import apple.intents.INSetCarLockStatusIntent;
import apple.intents.INSetCarLockStatusIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSetCarLockStatusIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetCarLockStatusIntentHandling")
public interface INSetCarLockStatusIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSetCarLockStatusIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * @see INSetCarLockStatusIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetCarLockStatus:completion:")
    default void confirmSetCarLockStatusCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_confirmSetCarLockStatusCompletion") Block_confirmSetCarLockStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetCarLockStatusCompletion {
        @Generated
        void call_confirmSetCarLockStatusCompletion(INSetCarLockStatusIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INSetCarLockStatusIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetCarLockStatusIntentResponse containing the details of
     *                   the result of having executed the intent
     * @see INSetCarLockStatusIntentResponse
     */
    @Generated
    @Selector("handleSetCarLockStatus:completion:")
    void handleSetCarLockStatusCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_handleSetCarLockStatusCompletion") Block_handleSetCarLockStatusCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetCarLockStatusCompletion {
        @Generated
        void call_handleSetCarLockStatusCompletion(INSetCarLockStatusIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveCarNameForSetCarLockStatus:withCompletion:")
    default void resolveCarNameForSetCarLockStatusWithCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForSetCarLockStatusWithCompletion") Block_resolveCarNameForSetCarLockStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForSetCarLockStatusWithCompletion {
        @Generated
        void call_resolveCarNameForSetCarLockStatusWithCompletion(INSpeakableStringResolutionResult resolutionResult);
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
    @Selector("resolveLockedForSetCarLockStatus:withCompletion:")
    default void resolveLockedForSetCarLockStatusWithCompletion(INSetCarLockStatusIntent intent,
            @ObjCBlock(name = "call_resolveLockedForSetCarLockStatusWithCompletion") Block_resolveLockedForSetCarLockStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveLockedForSetCarLockStatusWithCompletion {
        @Generated
        void call_resolveLockedForSetCarLockStatusWithCompletion(INBooleanResolutionResult resolutionResult);
    }
}

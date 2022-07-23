package apple.intents.protocol;

import apple.intents.INActivateCarSignalIntent;
import apple.intents.INActivateCarSignalIntentResponse;
import apple.intents.INCarSignalOptionsResolutionResult;
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
 * Protocol to declare support for handling an INActivateCarSignalIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INActivateCarSignalIntentHandling")
public interface INActivateCarSignalIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INActivateCarSignalIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * @see INActivateCarSignalIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmActivateCarSignal:completion:")
    default void confirmActivateCarSignalCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_confirmActivateCarSignalCompletion") Block_confirmActivateCarSignalCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmActivateCarSignalCompletion {
        @Generated
        void call_confirmActivateCarSignalCompletion(INActivateCarSignalIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INActivateCarSignalIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INActivateCarSignalIntentResponse containing the details of
     *                   the result of having executed the intent
     * @see INActivateCarSignalIntentResponse
     */
    @Generated
    @Selector("handleActivateCarSignal:completion:")
    void handleActivateCarSignalCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_handleActivateCarSignalCompletion") Block_handleActivateCarSignalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleActivateCarSignalCompletion {
        @Generated
        void call_handleActivateCarSignalCompletion(INActivateCarSignalIntentResponse response);
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
    @Selector("resolveCarNameForActivateCarSignal:withCompletion:")
    default void resolveCarNameForActivateCarSignalWithCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForActivateCarSignalWithCompletion") Block_resolveCarNameForActivateCarSignalWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForActivateCarSignalWithCompletion {
        @Generated
        void call_resolveCarNameForActivateCarSignalWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveSignalsForActivateCarSignal:withCompletion:")
    default void resolveSignalsForActivateCarSignalWithCompletion(INActivateCarSignalIntent intent,
            @ObjCBlock(name = "call_resolveSignalsForActivateCarSignalWithCompletion") Block_resolveSignalsForActivateCarSignalWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSignalsForActivateCarSignalWithCompletion {
        @Generated
        void call_resolveSignalsForActivateCarSignalWithCompletion(INCarSignalOptionsResolutionResult resolutionResult);
    }
}

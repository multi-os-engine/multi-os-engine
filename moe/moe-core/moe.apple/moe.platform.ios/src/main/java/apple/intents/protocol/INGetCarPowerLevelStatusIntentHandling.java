package apple.intents.protocol;

import apple.intents.INGetCarPowerLevelStatusIntent;
import apple.intents.INGetCarPowerLevelStatusIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol to declare support for handling an INGetCarPowerLevelStatusIntent. By implementing this protocol, a class
 * can provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetCarPowerLevelStatusIntentHandling")
public interface INGetCarPowerLevelStatusIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INGetCarPowerLevelStatusIntentResponse containing additional
     *                   details about the intent that may be relevant for the system to show the user prior to
     *                   handling.
     * @see INGetCarPowerLevelStatusIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetCarPowerLevelStatus:completion:")
    default void confirmGetCarPowerLevelStatusCompletion(INGetCarPowerLevelStatusIntent intent,
            @ObjCBlock(name = "call_confirmGetCarPowerLevelStatusCompletion") Block_confirmGetCarPowerLevelStatusCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetCarPowerLevelStatusCompletion {
        @Generated
        void call_confirmGetCarPowerLevelStatusCompletion(INGetCarPowerLevelStatusIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INGetCarPowerLevelStatusIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INGetCarPowerLevelStatusIntentResponse containing the
     *                   details of the result of having executed the intent
     * @see INGetCarPowerLevelStatusIntentResponse
     */
    @Generated
    @Selector("handleGetCarPowerLevelStatus:completion:")
    void handleGetCarPowerLevelStatusCompletion(INGetCarPowerLevelStatusIntent intent,
            @ObjCBlock(name = "call_handleGetCarPowerLevelStatusCompletion") Block_handleGetCarPowerLevelStatusCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetCarPowerLevelStatusCompletion {
        @Generated
        void call_handleGetCarPowerLevelStatusCompletion(INGetCarPowerLevelStatusIntentResponse response);
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
    @Selector("resolveCarNameForGetCarPowerLevelStatus:withCompletion:")
    default void resolveCarNameForGetCarPowerLevelStatusWithCompletion(INGetCarPowerLevelStatusIntent intent,
            @ObjCBlock(name = "call_resolveCarNameForGetCarPowerLevelStatusWithCompletion") Block_resolveCarNameForGetCarPowerLevelStatusWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveCarNameForGetCarPowerLevelStatusWithCompletion {
        @Generated
        void call_resolveCarNameForGetCarPowerLevelStatusWithCompletion(
                INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("startSendingUpdatesForGetCarPowerLevelStatus:toObserver:")
    default void startSendingUpdatesForGetCarPowerLevelStatusToObserver(INGetCarPowerLevelStatusIntent intent,
            @Mapped(ObjCObjectMapper.class) INGetCarPowerLevelStatusIntentResponseObserver observer) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("stopSendingUpdatesForGetCarPowerLevelStatus:")
    default void stopSendingUpdatesForGetCarPowerLevelStatus(INGetCarPowerLevelStatusIntent intent) {
        throw new java.lang.UnsupportedOperationException();
    }
}

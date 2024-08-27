package apple.intents.protocol;

import apple.intents.INListCarsIntent;
import apple.intents.INListCarsIntentResponse;
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
 * Protocol to declare support for handling an INListCarsIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INListCarsIntentHandling")
public interface INListCarsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INListCarsIntentResponse containing additional details about the
     *                   intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INListCarsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmListCars:completion:")
    default void confirmListCarsCompletion(@NotNull INListCarsIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmListCarsCompletion") Block_confirmListCarsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmListCarsCompletion {
        @Generated
        void call_confirmListCarsCompletion(@NotNull INListCarsIntentResponse response);
    }

    /**
     * Handling method - Execute the task represented by the INListCarsIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INListCarsIntentResponse containing the details of the
     *                   result of having executed the intent
     * 
     * @see INListCarsIntentResponse
     */
    @Generated
    @Selector("handleListCars:completion:")
    void handleListCarsCompletion(@NotNull INListCarsIntent intent,
            @NotNull @ObjCBlock(name = "call_handleListCarsCompletion") Block_handleListCarsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleListCarsCompletion {
        @Generated
        void call_handleListCarsCompletion(@NotNull INListCarsIntentResponse response);
    }
}

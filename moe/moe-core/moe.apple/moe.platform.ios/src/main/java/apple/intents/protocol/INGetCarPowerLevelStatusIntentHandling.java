package apple.intents.protocol;

import apple.intents.INGetCarPowerLevelStatusIntent;
import apple.intents.INGetCarPowerLevelStatusIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetCarPowerLevelStatusIntentHandling")
public interface INGetCarPowerLevelStatusIntentHandling {
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
}
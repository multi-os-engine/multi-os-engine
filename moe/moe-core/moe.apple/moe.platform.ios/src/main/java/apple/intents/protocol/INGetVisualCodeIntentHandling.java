package apple.intents.protocol;

import apple.intents.INGetVisualCodeIntent;
import apple.intents.INGetVisualCodeIntentResponse;
import apple.intents.INVisualCodeTypeResolutionResult;
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
@ObjCProtocolName("INGetVisualCodeIntentHandling")
public interface INGetVisualCodeIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmGetVisualCode:completion:")
    default void confirmGetVisualCodeCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_confirmGetVisualCodeCompletion") Block_confirmGetVisualCodeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetVisualCodeCompletion {
        @Generated
        void call_confirmGetVisualCodeCompletion(INGetVisualCodeIntentResponse response);
    }

    @Generated
    @Selector("handleGetVisualCode:completion:")
    void handleGetVisualCodeCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_handleGetVisualCodeCompletion") Block_handleGetVisualCodeCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetVisualCodeCompletion {
        @Generated
        void call_handleGetVisualCodeCompletion(INGetVisualCodeIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveVisualCodeTypeForGetVisualCode:withCompletion:")
    default void resolveVisualCodeTypeForGetVisualCodeWithCompletion(INGetVisualCodeIntent intent,
            @ObjCBlock(name = "call_resolveVisualCodeTypeForGetVisualCodeWithCompletion") Block_resolveVisualCodeTypeForGetVisualCodeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveVisualCodeTypeForGetVisualCodeWithCompletion {
        @Generated
        void call_resolveVisualCodeTypeForGetVisualCodeWithCompletion(
                INVisualCodeTypeResolutionResult resolutionResult);
    }
}
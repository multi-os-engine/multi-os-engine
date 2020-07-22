package apple.intents.protocol;

import apple.intents.INSendRideFeedbackIntent;
import apple.intents.INSendRideFeedbackIntentResponse;
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
@ObjCProtocolName("INSendRideFeedbackIntentHandling")
public interface INSendRideFeedbackIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSendRideFeedback:completion:")
    default void confirmSendRideFeedbackCompletion(INSendRideFeedbackIntent sendRideFeedbackIntent,
            @ObjCBlock(name = "call_confirmSendRideFeedbackCompletion") Block_confirmSendRideFeedbackCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSendRideFeedbackCompletion {
        @Generated
        void call_confirmSendRideFeedbackCompletion(INSendRideFeedbackIntentResponse response);
    }

    @Generated
    @Selector("handleSendRideFeedback:completion:")
    void handleSendRideFeedbackCompletion(INSendRideFeedbackIntent sendRideFeedbackintent,
            @ObjCBlock(name = "call_handleSendRideFeedbackCompletion") Block_handleSendRideFeedbackCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSendRideFeedbackCompletion {
        @Generated
        void call_handleSendRideFeedbackCompletion(INSendRideFeedbackIntentResponse response);
    }
}
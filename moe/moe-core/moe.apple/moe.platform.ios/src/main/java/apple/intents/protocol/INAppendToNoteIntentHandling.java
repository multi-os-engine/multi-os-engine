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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INAppendToNoteIntentHandling")
public interface INAppendToNoteIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmAppendToNote:completion:")
    default void confirmAppendToNoteCompletion(INAppendToNoteIntent intent,
            @ObjCBlock(name = "call_confirmAppendToNoteCompletion") Block_confirmAppendToNoteCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAppendToNoteCompletion {
        @Generated
        void call_confirmAppendToNoteCompletion(INAppendToNoteIntentResponse response);
    }

    @Generated
    @Selector("handleAppendToNote:completion:")
    void handleAppendToNoteCompletion(INAppendToNoteIntent intent,
            @ObjCBlock(name = "call_handleAppendToNoteCompletion") Block_handleAppendToNoteCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAppendToNoteCompletion {
        @Generated
        void call_handleAppendToNoteCompletion(INAppendToNoteIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveContentForAppendToNote:withCompletion:")
    default void resolveContentForAppendToNoteWithCompletion(INAppendToNoteIntent intent,
            @ObjCBlock(name = "call_resolveContentForAppendToNoteWithCompletion") Block_resolveContentForAppendToNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForAppendToNoteWithCompletion {
        @Generated
        void call_resolveContentForAppendToNoteWithCompletion(INNoteContentResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTargetNoteForAppendToNote:withCompletion:")
    default void resolveTargetNoteForAppendToNoteWithCompletion(INAppendToNoteIntent intent,
            @ObjCBlock(name = "call_resolveTargetNoteForAppendToNoteWithCompletion") Block_resolveTargetNoteForAppendToNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetNoteForAppendToNoteWithCompletion {
        @Generated
        void call_resolveTargetNoteForAppendToNoteWithCompletion(INNoteResolutionResult resolutionResult);
    }
}
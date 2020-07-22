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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCreateNoteIntentHandling")
public interface INCreateNoteIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmCreateNote:completion:")
    default void confirmCreateNoteCompletion(INCreateNoteIntent intent,
            @ObjCBlock(name = "call_confirmCreateNoteCompletion") Block_confirmCreateNoteCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCreateNoteCompletion {
        @Generated
        void call_confirmCreateNoteCompletion(INCreateNoteIntentResponse response);
    }

    @Generated
    @Selector("handleCreateNote:completion:")
    void handleCreateNoteCompletion(INCreateNoteIntent intent,
            @ObjCBlock(name = "call_handleCreateNoteCompletion") Block_handleCreateNoteCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCreateNoteCompletion {
        @Generated
        void call_handleCreateNoteCompletion(INCreateNoteIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveContentForCreateNote:withCompletion:")
    default void resolveContentForCreateNoteWithCompletion(INCreateNoteIntent intent,
            @ObjCBlock(name = "call_resolveContentForCreateNoteWithCompletion") Block_resolveContentForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveContentForCreateNoteWithCompletion {
        @Generated
        void call_resolveContentForCreateNoteWithCompletion(INNoteContentResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNameForCreateNote:withCompletion:")
    default void resolveGroupNameForCreateNoteWithCompletion(INCreateNoteIntent intent,
            @ObjCBlock(name = "call_resolveGroupNameForCreateNoteWithCompletion") Block_resolveGroupNameForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForCreateNoteWithCompletion {
        @Generated
        void call_resolveGroupNameForCreateNoteWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTitleForCreateNote:withCompletion:")
    default void resolveTitleForCreateNoteWithCompletion(INCreateNoteIntent intent,
            @ObjCBlock(name = "call_resolveTitleForCreateNoteWithCompletion") Block_resolveTitleForCreateNoteWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTitleForCreateNoteWithCompletion {
        @Generated
        void call_resolveTitleForCreateNoteWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}
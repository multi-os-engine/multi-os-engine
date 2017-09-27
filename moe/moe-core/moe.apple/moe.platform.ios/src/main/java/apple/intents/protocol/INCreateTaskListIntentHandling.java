package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INCreateTaskListIntent;
import apple.intents.INCreateTaskListIntentResponse;
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
@ObjCProtocolName("INCreateTaskListIntentHandling")
public interface INCreateTaskListIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmCreateTaskList:completion:")
    default void confirmCreateTaskListCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_confirmCreateTaskListCompletion") Block_confirmCreateTaskListCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCreateTaskListCompletion {
        @Generated
        void call_confirmCreateTaskListCompletion(INCreateTaskListIntentResponse arg0);
    }

    @Generated
    @Selector("handleCreateTaskList:completion:")
    void handleCreateTaskListCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_handleCreateTaskListCompletion") Block_handleCreateTaskListCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCreateTaskListCompletion {
        @Generated
        void call_handleCreateTaskListCompletion(INCreateTaskListIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveGroupNameForCreateTaskList:withCompletion:")
    default void resolveGroupNameForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveGroupNameForCreateTaskListWithCompletion") Block_resolveGroupNameForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGroupNameForCreateTaskListWithCompletion {
        @Generated
        void call_resolveGroupNameForCreateTaskListWithCompletion(INSpeakableStringResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskTitlesForCreateTaskList:withCompletion:")
    default void resolveTaskTitlesForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveTaskTitlesForCreateTaskListWithCompletion") Block_resolveTaskTitlesForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskTitlesForCreateTaskListWithCompletion {
        @Generated
        void call_resolveTaskTitlesForCreateTaskListWithCompletion(
                NSArray<? extends INSpeakableStringResolutionResult> arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTitleForCreateTaskList:withCompletion:")
    default void resolveTitleForCreateTaskListWithCompletion(INCreateTaskListIntent intent,
            @ObjCBlock(name = "call_resolveTitleForCreateTaskListWithCompletion") Block_resolveTitleForCreateTaskListWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTitleForCreateTaskListWithCompletion {
        @Generated
        void call_resolveTitleForCreateTaskListWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
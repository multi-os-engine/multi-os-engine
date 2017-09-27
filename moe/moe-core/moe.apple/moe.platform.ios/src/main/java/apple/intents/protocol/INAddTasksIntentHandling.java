package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INAddTasksIntent;
import apple.intents.INAddTasksIntentResponse;
import apple.intents.INSpatialEventTriggerResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INTaskListResolutionResult;
import apple.intents.INTemporalEventTriggerResolutionResult;
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
@ObjCProtocolName("INAddTasksIntentHandling")
public interface INAddTasksIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmAddTasks:completion:")
    default void confirmAddTasksCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_confirmAddTasksCompletion") Block_confirmAddTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmAddTasksCompletion {
        @Generated
        void call_confirmAddTasksCompletion(INAddTasksIntentResponse arg0);
    }

    @Generated
    @Selector("handleAddTasks:completion:")
    void handleAddTasksCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_handleAddTasksCompletion") Block_handleAddTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleAddTasksCompletion {
        @Generated
        void call_handleAddTasksCompletion(INAddTasksIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveSpatialEventTriggerForAddTasks:withCompletion:")
    default void resolveSpatialEventTriggerForAddTasksWithCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_resolveSpatialEventTriggerForAddTasksWithCompletion") Block_resolveSpatialEventTriggerForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveSpatialEventTriggerForAddTasksWithCompletion {
        @Generated
        void call_resolveSpatialEventTriggerForAddTasksWithCompletion(INSpatialEventTriggerResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTargetTaskListForAddTasks:withCompletion:")
    default void resolveTargetTaskListForAddTasksWithCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_resolveTargetTaskListForAddTasksWithCompletion") Block_resolveTargetTaskListForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTargetTaskListForAddTasksWithCompletion {
        @Generated
        void call_resolveTargetTaskListForAddTasksWithCompletion(INTaskListResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskTitlesForAddTasks:withCompletion:")
    default void resolveTaskTitlesForAddTasksWithCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_resolveTaskTitlesForAddTasksWithCompletion") Block_resolveTaskTitlesForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskTitlesForAddTasksWithCompletion {
        @Generated
        void call_resolveTaskTitlesForAddTasksWithCompletion(NSArray<? extends INSpeakableStringResolutionResult> arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTemporalEventTriggerForAddTasks:withCompletion:")
    default void resolveTemporalEventTriggerForAddTasksWithCompletion(INAddTasksIntent intent,
            @ObjCBlock(name = "call_resolveTemporalEventTriggerForAddTasksWithCompletion") Block_resolveTemporalEventTriggerForAddTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTemporalEventTriggerForAddTasksWithCompletion {
        @Generated
        void call_resolveTemporalEventTriggerForAddTasksWithCompletion(INTemporalEventTriggerResolutionResult arg0);
    }
}
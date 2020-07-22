package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INSnoozeTasksIntent;
import apple.intents.INSnoozeTasksIntentResponse;
import apple.intents.INSnoozeTasksTaskResolutionResult;
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
@ObjCProtocolName("INSnoozeTasksIntentHandling")
public interface INSnoozeTasksIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSnoozeTasks:completion:")
    default void confirmSnoozeTasksCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_confirmSnoozeTasksCompletion") Block_confirmSnoozeTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSnoozeTasksCompletion {
        @Generated
        void call_confirmSnoozeTasksCompletion(INSnoozeTasksIntentResponse response);
    }

    @Generated
    @Selector("handleSnoozeTasks:completion:")
    void handleSnoozeTasksCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_handleSnoozeTasksCompletion") Block_handleSnoozeTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSnoozeTasksCompletion {
        @Generated
        void call_handleSnoozeTasksCompletion(INSnoozeTasksIntentResponse response);
    }

    @Generated
    @IsOptional
    @Selector("resolveNextTriggerTimeForSnoozeTasks:withCompletion:")
    default void resolveNextTriggerTimeForSnoozeTasksWithCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_resolveNextTriggerTimeForSnoozeTasksWithCompletion") Block_resolveNextTriggerTimeForSnoozeTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveNextTriggerTimeForSnoozeTasksWithCompletion {
        @Generated
        void call_resolveNextTriggerTimeForSnoozeTasksWithCompletion(
                INDateComponentsRangeResolutionResult resolutionResult);
    }

    @Generated
    @IsOptional
    @Selector("resolveTasksForSnoozeTasks:withCompletion:")
    default void resolveTasksForSnoozeTasksWithCompletion(INSnoozeTasksIntent intent,
            @ObjCBlock(name = "call_resolveTasksForSnoozeTasksWithCompletion") Block_resolveTasksForSnoozeTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTasksForSnoozeTasksWithCompletion {
        @Generated
        void call_resolveTasksForSnoozeTasksWithCompletion(
                NSArray<? extends INSnoozeTasksTaskResolutionResult> resolutionResults);
    }
}
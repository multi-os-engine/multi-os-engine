package apple.intents.protocol;

import apple.foundation.NSArray;
import apple.intents.INDeleteTasksIntent;
import apple.intents.INDeleteTasksIntentResponse;
import apple.intents.INDeleteTasksTaskListResolutionResult;
import apple.intents.INDeleteTasksTaskResolutionResult;
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
@ObjCProtocolName("INDeleteTasksIntentHandling")
public interface INDeleteTasksIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmDeleteTasks:completion:")
    default void confirmDeleteTasksCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_confirmDeleteTasksCompletion") Block_confirmDeleteTasksCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmDeleteTasksCompletion {
        @Generated
        void call_confirmDeleteTasksCompletion(INDeleteTasksIntentResponse arg0);
    }

    @Generated
    @Selector("handleDeleteTasks:completion:")
    void handleDeleteTasksCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_handleDeleteTasksCompletion") Block_handleDeleteTasksCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleDeleteTasksCompletion {
        @Generated
        void call_handleDeleteTasksCompletion(INDeleteTasksIntentResponse arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTaskListForDeleteTasks:withCompletion:")
    default void resolveTaskListForDeleteTasksWithCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_resolveTaskListForDeleteTasksWithCompletion") Block_resolveTaskListForDeleteTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTaskListForDeleteTasksWithCompletion {
        @Generated
        void call_resolveTaskListForDeleteTasksWithCompletion(INDeleteTasksTaskListResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveTasksForDeleteTasks:withCompletion:")
    default void resolveTasksForDeleteTasksWithCompletion(INDeleteTasksIntent intent,
            @ObjCBlock(name = "call_resolveTasksForDeleteTasksWithCompletion") Block_resolveTasksForDeleteTasksWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveTasksForDeleteTasksWithCompletion {
        @Generated
        void call_resolveTasksForDeleteTasksWithCompletion(NSArray<? extends INDeleteTasksTaskResolutionResult> arg0);
    }
}
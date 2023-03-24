package apple.sharedwithyoucore.protocol;

import apple.sharedwithyoucore.SWCollaborationCoordinator;
import apple.sharedwithyoucore.SWStartCollaborationAction;
import apple.sharedwithyoucore.SWUpdateCollaborationParticipantsAction;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 16.0
 */
@Generated
@Library("SharedWithYouCore")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SWCollaborationActionHandler")
public interface SWCollaborationActionHandler {
    @Generated
    @Selector("collaborationCoordinator:handleStartCollaborationAction:")
    void collaborationCoordinatorHandleStartCollaborationAction(@NotNull SWCollaborationCoordinator coordinator,
            @NotNull SWStartCollaborationAction action);

    @Generated
    @Selector("collaborationCoordinator:handleUpdateCollaborationParticipantsAction:")
    void collaborationCoordinatorHandleUpdateCollaborationParticipantsAction(
            @NotNull SWCollaborationCoordinator coordinator, @NotNull SWUpdateCollaborationParticipantsAction action);
}
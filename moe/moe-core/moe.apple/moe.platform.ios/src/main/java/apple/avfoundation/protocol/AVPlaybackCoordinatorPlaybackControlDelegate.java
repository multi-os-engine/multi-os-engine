package apple.avfoundation.protocol;

import apple.avfoundation.AVDelegatingPlaybackCoordinator;
import apple.avfoundation.AVDelegatingPlaybackCoordinatorBufferingCommand;
import apple.avfoundation.AVDelegatingPlaybackCoordinatorPauseCommand;
import apple.avfoundation.AVDelegatingPlaybackCoordinatorPlayCommand;
import apple.avfoundation.AVDelegatingPlaybackCoordinatorSeekCommand;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]	AVPlaybackCoordinatorPlaybackControlDelegate
 * <p>
 * A custom player implementation
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlaybackCoordinatorPlaybackControlDelegate")
public interface AVPlaybackCoordinatorPlaybackControlDelegate {
    /**
     * playbackCoordinator:didIssueBufferingCommand:completionHandler:
     * <p>
     * Called by the coordinator to indicate that playback is expected to begin soon and the playback object should begin buffering.
     * <p>
     * The coordinator issues this command when playback is currently paused and the coordinator is expecting playback to start soon.
     * In response to this command, it is appropriate to update playback UI to indicate playback in a waiting state.
     * The expected start can be cancelled by calling -[AVDelegatingPlaybackCoordinator coordinateRateChangeTo:0].
     *
     * @param bufferingCommand A buffering command object. See AVDelegatingPlaybackCoordinatorBufferingCommand.
     *                         The receiver should verify that the command is still valid by inspecting the expectedCurrentItemIdentifier property before applying the command.
     * @param        coordinator The coordinator requesting buffering to begin.
     * @param        completionHandler The receiver must call the completion handler when done, either when the command has been handled succesfully or when the receiver has indicated its inability
     * to handle the command by beginning a suspension with an appropriate reason.
     * For buffering commands, the command should only be considered complete once the playback object is ready to receive a subsequent play command.
     */
    @Generated
    @Selector("playbackCoordinator:didIssueBufferingCommand:completionHandler:")
    void playbackCoordinatorDidIssueBufferingCommandCompletionHandler(AVDelegatingPlaybackCoordinator coordinator,
            AVDelegatingPlaybackCoordinatorBufferingCommand bufferingCommand,
            @ObjCBlock(name = "call_playbackCoordinatorDidIssueBufferingCommandCompletionHandler") Block_playbackCoordinatorDidIssueBufferingCommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playbackCoordinatorDidIssueBufferingCommandCompletionHandler {
        @Generated
        void call_playbackCoordinatorDidIssueBufferingCommandCompletionHandler();
    }

    /**
     * playbackCoordinator:didIssuePauseCommand:completionHandler:
     * <p>
     * Called by the coordinator to pause playback.
     *
     * @param pauseCommand A pause command object. See AVDelegatingPlaybackCoordinatorPauseCommand.
     *                     The receiver should verify that the command is still valid by inspecting the expectedCurrentItemIdentifier property before applying the command.
     * @param        coordinator The coordinator requesting playback to pause.
     * @param        completionHandler The receiver must call the completion handler when done, either when the command has been handled succesfully or when the receiver has indicated its inability
     * to handle the command by beginning a suspension with an appropriate reason.
     * If the command's shouldBufferInAnticipationOfPlayback is YES, the completion handler should also only be called once the playback object is ready to receive a subsequent play command.
     */
    @Generated
    @Selector("playbackCoordinator:didIssuePauseCommand:completionHandler:")
    void playbackCoordinatorDidIssuePauseCommandCompletionHandler(AVDelegatingPlaybackCoordinator coordinator,
            AVDelegatingPlaybackCoordinatorPauseCommand pauseCommand,
            @ObjCBlock(name = "call_playbackCoordinatorDidIssuePauseCommandCompletionHandler") Block_playbackCoordinatorDidIssuePauseCommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playbackCoordinatorDidIssuePauseCommandCompletionHandler {
        @Generated
        void call_playbackCoordinatorDidIssuePauseCommandCompletionHandler();
    }

    /**
     * playbackCoordinator:didIssuePlayCommand:completionHandler:
     * <p>
     * Called by the coordinator to match the playback rate of the control delegate to the group, when the target rate is non-zero.
     * <p>
     * The coordinator issues this command when the desired playback timeline has changed. This may mean that the rate has changed, but it can also mean that the anchor time has changed.
     * Play commands are only issued when the desired playback rate is non-zero.
     *
     * @param playCommand A play command object. See AVDelegatingPlaybackCoordinatorPlayCommand.
     *                    The receiver should verify that the command is still valid by inspecting the expectedCurrentItemIdentifier property before applying the command.
     * @param        coordinator The coordinator requesting a change in playback rate.
     * @param        completionHandler The receiver must call the completion handler when done, either when the command has been handled succesfully or when the receiver has indicated its inability
     * to handle the command by beginning a suspension with an appropriate reason.
     */
    @Generated
    @Selector("playbackCoordinator:didIssuePlayCommand:completionHandler:")
    void playbackCoordinatorDidIssuePlayCommandCompletionHandler(AVDelegatingPlaybackCoordinator coordinator,
            AVDelegatingPlaybackCoordinatorPlayCommand playCommand,
            @ObjCBlock(name = "call_playbackCoordinatorDidIssuePlayCommandCompletionHandler") Block_playbackCoordinatorDidIssuePlayCommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playbackCoordinatorDidIssuePlayCommandCompletionHandler {
        @Generated
        void call_playbackCoordinatorDidIssuePlayCommandCompletionHandler();
    }

    /**
     * playbackCoordinator:didIssueSeekCommand:completionHandler:
     * <p>
     * Called by the coordinator to seek to a new time.
     * <p>
     * The coordinator issues this command when the playback object current time changes, potentially also pausing playback.
     *
     * @param seekCommand A seek command object. See AVDelegatingPlaybackCoordinatorSeekCommand.
     *                    The receiver should verify that the command is still valid by inspecting the expectedCurrentItemIdentifier property before applying the command.
     * @param        coordinator The coordinator requesting the seek.
     * @param        completionHandler The receiver must call the completion handler when done, either when the command has been handled succesfully or when the receiver has indicated its inability
     * to handle the command by beginning a suspension with an appropriate reason.
     * If the command's shouldBufferInAnticipationOfPlayback is YES, the completion handler should also only be called once the playback object is ready to receive a subsequent play command.
     */
    @Generated
    @Selector("playbackCoordinator:didIssueSeekCommand:completionHandler:")
    void playbackCoordinatorDidIssueSeekCommandCompletionHandler(AVDelegatingPlaybackCoordinator coordinator,
            AVDelegatingPlaybackCoordinatorSeekCommand seekCommand,
            @ObjCBlock(name = "call_playbackCoordinatorDidIssueSeekCommandCompletionHandler") Block_playbackCoordinatorDidIssueSeekCommandCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_playbackCoordinatorDidIssueSeekCommandCompletionHandler {
        @Generated
        void call_playbackCoordinatorDidIssueSeekCommandCompletionHandler();
    }
}

package apple.avkit.protocol;

import apple.avkit.AVPictureInPictureController;
import apple.coremedia.struct.CMTime;
import apple.coremedia.struct.CMTimeRange;
import apple.coremedia.struct.CMVideoDimensions;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVPictureInPictureSampleBufferPlaybackDelegate
 * 
 * A protocol for controlling playback from an AVSampleBufferDisplayLayer in Picture in Picture.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPictureInPictureSampleBufferPlaybackDelegate")
public interface AVPictureInPictureSampleBufferPlaybackDelegate {
    /**
     * pictureInPictureController:didTransitionToRenderSize:
     * 
     * This method is called when the system Picture in Picture window changes size. Delegate take the new render size
     * and AVPictureInPictureController.isPictureInPictureActive into account when choosing media variants in order to
     * avoid uncessary decoding overhead.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     * @param newRenderSize
     *                                   The rendered size, in pixels, of Picture in Picture content.
     */
    @Generated
    @Selector("pictureInPictureController:didTransitionToRenderSize:")
    void pictureInPictureControllerDidTransitionToRenderSize(AVPictureInPictureController pictureInPictureController,
            @ByValue CMVideoDimensions newRenderSize);

    /**
     * pictureInPictureController:setPlaying:
     * 
     * Informs delegate that the user initiated a request to play or pause the content.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     * @param playing
     *                                   Whether the content should play or pause.
     */
    @Generated
    @Selector("pictureInPictureController:setPlaying:")
    void pictureInPictureControllerSetPlaying(AVPictureInPictureController pictureInPictureController, boolean playing);

    /**
     * pictureInPictureController:skipByInterval:completionHandler:
     * 
     * Informs delegate that the user has requested skipping forward or backward by the time indicated by the interval.
     * 
     * Clients may choose to seek by a different interval for efficiency reasons (for example, seeking to a keyframe) or
     * if the requested interval falls outside of the playable timeline. Clients must invoke the completion handler to
     * indicate the seek operation has finished or failed. By the time the completion handler has been invoked, the
     * timebase should reflect the current time and playback rate. Failure to invoke this completion handler is an
     * application error and will result in playback UI permanently stuck in a “seeking” state.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     * @param skipInterval
     *                                   The interval by which to skip playback.
     * @param completionHandler
     *                                   A closure that must be invoked to indicate that the skip operation has
     *                                   completed.
     */
    @Generated
    @Selector("pictureInPictureController:skipByInterval:completionHandler:")
    void pictureInPictureControllerSkipByIntervalCompletionHandler(
            AVPictureInPictureController pictureInPictureController, @ByValue CMTime skipInterval,
            @ObjCBlock(name = "call_pictureInPictureControllerSkipByIntervalCompletionHandler") Block_pictureInPictureControllerSkipByIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pictureInPictureControllerSkipByIntervalCompletionHandler {
        @Generated
        void call_pictureInPictureControllerSkipByIntervalCompletionHandler();
    }

    /**
     * pictureInPictureControllerIsPlaybackPaused:
     * 
     * Allows delegate to indicate whether the playback UI should reflect a playing or paused state, regardless of what
     * the current playback rate might be. May be called multiple times during playback.
     * 
     * This method will be called whenever -[AVPictureInPictureController invalidatePlaybackState] is called and at
     * other times as needed by the system.
     * [@returns] A boolean value indicating whether or not the playback UI should indicate playback has been paused or
     * is playing.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @Selector("pictureInPictureControllerIsPlaybackPaused:")
    boolean pictureInPictureControllerIsPlaybackPaused(AVPictureInPictureController pictureInPictureController);

    /**
     * pictureInPictureControllerShouldProhibitBackgroundAudioPlayback:
     * 
     * Allows the delegate to indicate whether background audio playback should always be prohibited.
     * 
     * If implemented, this optional method will be called once for each invocation of invalidatePlaybackState to allow
     * the delegate to indicate whether or not audio playback should be prohibited when the picture in picture window is
     * in the background.
     * 
     * Note that background in this context has a seperate meaning from application background used in UIKit. Here,
     * background defines the state of the picture in picture window itself rather than the application.
     * [@returns] A boolean value indicating whether or not background audio playback is always prohibited.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @IsOptional
    @Selector("pictureInPictureControllerShouldProhibitBackgroundAudioPlayback:")
    default boolean pictureInPictureControllerShouldProhibitBackgroundAudioPlayback(
            AVPictureInPictureController pictureInPictureController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pictureInPictureControllerTimeRangeForPlayback:
     * 
     * Allows delegate to inform Picture in Picture controller of the current playable time range. May be called
     * multiple times during playback. Time ranges with finite duration should always contain the current time of the
     * sample buffer display layer's timebase.
     * 
     * Clients should return a time range with a duration of kCMTimeInfinity to indicate live content. When there is no
     * content to play, they should return kCMTimeRangeInvalid. This method will be called whenever
     * -[AVPictureInPictureController invalidatePlaybackState] is called and at other times as needed by the system.
     * [@returns] A CMTimeRange indicating the content's time range.
     * 
     * @param pictureInPictureController
     *                                   The Picture in Picture controller.
     */
    @Generated
    @Selector("pictureInPictureControllerTimeRangeForPlayback:")
    @ByValue
    CMTimeRange pictureInPictureControllerTimeRangeForPlayback(AVPictureInPictureController pictureInPictureController);
}

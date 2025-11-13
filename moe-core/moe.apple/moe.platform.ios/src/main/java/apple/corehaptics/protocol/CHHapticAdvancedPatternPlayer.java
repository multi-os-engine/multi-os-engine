package apple.corehaptics.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] CHHapticAdvancedPatternPlayer
 * 
 * A protocol which defines operations for pausing, resuming, seeking, and sending parameters to a pattern player.
 * 
 * Instances of these objects are created via the factory methods such as
 * `CHHapticEngine(createAdvancedPlayerWithPattern:error)`.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("CoreHaptics")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CHHapticAdvancedPatternPlayer")
public interface CHHapticAdvancedPatternPlayer extends CHHapticPatternPlayer {
    /**
     * [@property] completionHandler
     * 
     * The block or enclosure that will be called when the player finishes.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("completionHandler")
    @ObjCBlock(name = "call_completionHandler_ret")
    Block_completionHandler_ret completionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_completionHandler_ret {
        @Generated
        void call_completionHandler_ret(@Nullable NSError error);
    }

    /**
     * [@property] isMuted
     * 
     * When set to YES, all audio and haptic output will be silenced.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isMuted")
    boolean isMuted();

    /**
     * [@property] loopEnabled
     * 
     * When set to YES, the player will loop back to the beginning of the pattern whenever playback
     * reaches the `loopEnd` time.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("loopEnabled")
    boolean loopEnabled();

    /**
     * [@property] loopEnd
     * 
     * The time in seconds at which the pattern will loop back if looping is enabled.
     * 
     * If set to 0.0, the loop length will be set to the end of the last event in the pattern.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("loopEnd")
    double loopEnd();

    /**
     * pauseAtTime:error
     * 
     * Pause playback of the pattern at the specified time (see `CHHapticEngine(currentTime)`).
     * 
     * If 'time' is set to `CHHapticTimeImmediate`, the pattern will be paused immediately.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("pauseAtTime:error:")
    boolean pauseAtTimeError(double time, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] playbackRate
     * 
     * Allows a pattern to be played back at any multiple of its normal rate. The rate can be adjusted
     * at any point before or during pattern playback.
     * 
     * This rate factor scales the relative times of all events and parameters as they are played, as well as the
     * durations of Continuous events and the `loopEnd` time. It does not affect the pitches of the events.
     * Any value greater than 0.0 is valid; all others are ignored.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("playbackRate")
    float playbackRate();

    /**
     * resumeAtTime:error
     * 
     * Resume playback on a previously-paused player at the specified time (see `CHHapticEngine(currentTime)`).
     * 
     * If 'time' is set to `CHHapticTimeImmediate`, the pattern is resumed as soon as possible.
     * Playback will resume at the time offset in the pattern at which it was paused.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("resumeAtTime:error:")
    boolean resumeAtTimeError(double time, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * seekToOffset:error
     * 
     * Set the playback position on an active player to the specified offset time.
     * 
     * If 'offsetTime' is set to 0.0, the pattern will start from the beginning. If
     * set to >= the duration of the pattern, playback will terminate as soon as possible
     * unless the player is looped, in which case playback will start at the beginning of
     * the loop.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("seekToOffset:error:")
    boolean seekToOffsetError(double offsetTime, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * [@property] completionHandler
     * 
     * The block or enclosure that will be called when the player finishes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCompletionHandler:")
    void setCompletionHandler(@NotNull @ObjCBlock(name = "call_setCompletionHandler") Block_setCompletionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCompletionHandler {
        @Generated
        void call_setCompletionHandler(@Nullable NSError error);
    }

    /**
     * [@property] isMuted
     * 
     * When set to YES, all audio and haptic output will be silenced.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setIsMuted:")
    void setIsMuted(boolean value);

    /**
     * [@property] loopEnabled
     * 
     * When set to YES, the player will loop back to the beginning of the pattern whenever playback
     * reaches the `loopEnd` time.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLoopEnabled:")
    void setLoopEnabled(boolean value);

    /**
     * [@property] loopEnd
     * 
     * The time in seconds at which the pattern will loop back if looping is enabled.
     * 
     * If set to 0.0, the loop length will be set to the end of the last event in the pattern.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLoopEnd:")
    void setLoopEnd(double value);

    /**
     * [@property] playbackRate
     * 
     * Allows a pattern to be played back at any multiple of its normal rate. The rate can be adjusted
     * at any point before or during pattern playback.
     * 
     * This rate factor scales the relative times of all events and parameters as they are played, as well as the
     * durations of Continuous events and the `loopEnd` time. It does not affect the pitches of the events.
     * Any value greater than 0.0 is valid; all others are ignored.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPlaybackRate:")
    void setPlaybackRate(float value);
}

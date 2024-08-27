package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.protocol.AVAudioMixing;
import apple.avfaudio.struct.AVAudio3DPoint;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioPlayerNode
 * 
 * Play buffers or segments of audio files.
 * 
 * AVAudioPlayerNode supports scheduling the playback of `AVAudioBuffer` instances,
 * or segments of audio files opened via `AVAudioFile`. Buffers and segments may be
 * scheduled at specific points in time, or to play immediately following preceding segments.
 * 
 * FORMATS
 * 
 * Normally, you will want to configure the node's output format with the same number of
 * channels as are in the files and buffers to be played. Otherwise, channels will be dropped
 * or added as required. It is usually better to use an `AVAudioMixerNode` to
 * do this.
 * 
 * Similarly, when playing file segments, the node will sample rate convert if necessary, but
 * it is often preferable to configure the node's output sample rate to match that of the file(s)
 * and use a mixer to perform the rate conversion.
 * 
 * When playing buffers, there is an implicit assumption that the buffers are at the same
 * sample rate as the node's output format.
 * 
 * TIMELINES
 * 
 * The usual `AVAudioNode` sample times (as observed by `lastRenderTime`)
 * have an arbitrary zero point. AVAudioPlayerNode superimposes a second "player timeline" on
 * top of this, to reflect when the player was started, and intervals during which it was
 * paused. The methods `nodeTimeForPlayerTime:` and `playerTimeForNodeTime:`
 * convert between the two.
 * 
 * This class' `stop` method unschedules all previously scheduled buffers and
 * file segments, and returns the player timeline to sample time 0.
 * 
 * TIMESTAMPS
 * 
 * The "schedule" methods all take an `AVAudioTime` "when" parameter. This is
 * interpreted as follows:
 * 
 * 1. nil:
 * - if there have been previous commands, the new one is played immediately following the
 * last one.
 * - otherwise, if the node is playing, the event is played in the very near future.
 * - otherwise, the command is played at sample time 0.
 * 2. sample time:
 * - relative to the node's start time (which begins at 0 when the node is started).
 * 3. host time:
 * - ignored unless the sample time is invalid when the engine is rendering to an audio
 * device.
 * - ignored in manual rendering mode.
 * 
 * ERRORS
 * 
 * The "schedule" methods can fail if:
 * 
 * 1. a buffer's channel count does not match that of the node's output format.
 * 2. a file can't be accessed.
 * 3. an AVAudioTime specifies neither a valid sample time or host time.
 * 4. a segment's start frame or frame count is negative.
 * 
 * BUFFER/FILE COMPLETION HANDLERS
 * 
 * The buffer or file completion handlers (see scheduling methods) are a means to schedule
 * more data if available on the player node. See `AVAudioPlayerNodeCompletionCallbackType`
 * for details on the different buffer/file completion callback types.
 * 
 * Note that a player should not be stopped from within a completion handler callback because
 * it can deadlock while trying to unschedule previously scheduled buffers.
 * 
 * OFFLINE RENDERING
 * 
 * When a player node is used with the engine operating in the manual rendering mode, the
 * buffer/file completion handlers, `lastRenderTime` and the latencies (`latency` and
 * `outputPresentationLatency`) can be used to track how much data the player has rendered and
 * how much more data is left to render.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioPlayerNode extends AVAudioNode implements AVAudioMixing {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioPlayerNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioPlayerNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioPlayerNode allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Nullable
    @Generated
    @Selector("destinationForMixer:bus:")
    public native AVAudioMixingDestination destinationForMixerBus(@NotNull AVAudioNode mixer, @NUInt long bus);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioPlayerNode init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * [@property] playing
     * 
     * Indicates whether or not the player is playing.
     */
    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioPlayerNode new_objc();

    /**
     * nodeTimeForPlayerTime:
     * 
     * Convert from player time to node time.
     * 
     * This method and its inverse `playerTimeForNodeTime:` are discussed in the
     * introduction to this class.
     * 
     * If the player is not playing when this method is called, nil is returned.
     * 
     * @param playerTime
     *                   a time relative to the player's start time
     * @return
     *         a node time
     */
    @Nullable
    @Generated
    @Selector("nodeTimeForPlayerTime:")
    public native AVAudioTime nodeTimeForPlayerTime(@NotNull AVAudioTime playerTime);

    @Generated
    @Selector("obstruction")
    public native float obstruction();

    @Generated
    @Selector("occlusion")
    public native float occlusion();

    @Generated
    @Selector("pan")
    public native float pan();

    /**
     * pause
     * 
     * Pause playback.
     * 
     * The player's sample time does not advance while the node is paused.
     * 
     * Note that pausing or stopping all the players connected to an engine does not pause or stop
     * the engine or the underlying hardware. The engine must be explicitly paused or stopped for
     * the hardware to stop.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    /**
     * play
     * 
     * Start or resume playback immediately.
     * 
     * equivalent to playAtTime:nil
     */
    @Generated
    @Selector("play")
    public native void play();

    /**
     * playAtTime:
     * 
     * Start or resume playback at a specific time.
     * 
     * This node is initially paused. Requests to play buffers or file segments are enqueued, and
     * any necessary decoding begins immediately. Playback does not begin, however, until the player
     * has started playing, via this method.
     * 
     * Note that providing an AVAudioTime which is past (before lastRenderTime) will cause the
     * player to begin playback immediately.
     * 
     * E.g. To start a player X seconds in future:
     * <pre>
     * // start engine and player
     * NSError *nsErr = nil;
     * [_engine startAndReturnError:&nsErr];
     * if (!nsErr) {
     * const float kStartDelayTime = 0.5; // sec
     * AVAudioFormat *outputFormat = [_player outputFormatForBus:0];
     * AVAudioFramePosition startSampleTime = _player.lastRenderTime.sampleTime + kStartDelayTime *
     * outputFormat.sampleRate;
     * AVAudioTime *startTime = [AVAudioTime timeWithSampleTime:startSampleTime atRate:outputFormat.sampleRate];
     * [_player playAtTime:startTime];
     * }
     * </pre>
     * 
     * @param when
     *             the node time at which to start or resume playback. nil signifies "now".
     */
    @Generated
    @Selector("playAtTime:")
    public native void playAtTime(@Nullable AVAudioTime when);

    /**
     * playerTimeForNodeTime:
     * 
     * Convert from node time to player time.
     * 
     * This method and its inverse `nodeTimeForPlayerTime:` are discussed in the
     * introduction to this class.
     * 
     * If the player is not playing when this method is called, nil is returned.
     * 
     * @param nodeTime
     *                 a node time
     * @return
     *         a time relative to the player's start time
     */
    @Nullable
    @Generated
    @Selector("playerTimeForNodeTime:")
    public native AVAudioTime playerTimeForNodeTime(@NotNull AVAudioTime nodeTime);

    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    public native long pointSourceInHeadMode();

    @Generated
    @Selector("position")
    @ByValue
    public native AVAudio3DPoint position();

    /**
     * prepareWithFrameCount:
     * 
     * Prepares previously scheduled file regions or buffers for playback.
     * 
     * @param frameCount
     *                   The number of sample frames of data to be prepared before returning.
     */
    @Generated
    @Selector("prepareWithFrameCount:")
    public native void prepareWithFrameCount(int frameCount);

    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    public native long renderingAlgorithm();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    /**
     * scheduleBuffer:atTime:options:completionCallbackType:completionHandler:
     * 
     * Schedule playing samples from an AVAudioBuffer.
     * 
     * @param buffer
     *                          the buffer to play
     * @param when
     *                          the time at which to play the buffer. see the discussion of timestamps, above.
     * @param options
     *                          options for looping, interrupting other buffers, etc.
     * @param callbackType
     *                          option to specify when the completion handler must be called
     * @param completionHandler
     *                          called after the buffer has been consumed by the player or has finished playing back or
     *                          the player is stopped. may be nil.
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("scheduleBuffer:atTime:options:completionCallbackType:completionHandler:")
    public native void scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(
            @NotNull AVAudioPCMBuffer buffer, @Nullable AVAudioTime when, @NUInt long options, @NInt long callbackType,
            @Nullable @ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferAtTimeOptionsCompletionCallbackTypeCompletionHandler(@NInt long callbackType);
    }

    /**
     * scheduleBuffer:atTime:options:completionHandler:
     * 
     * Schedule playing samples from an AVAudioBuffer.
     * 
     * It is possible for the completionHandler to be called before rendering begins
     * or before the buffer is played completely.
     * 
     * @param buffer
     *                          the buffer to play
     * @param when
     *                          the time at which to play the buffer. see the discussion of timestamps, above.
     * @param options
     *                          options for looping, interrupting other buffers, etc.
     * @param completionHandler
     *                          called after the buffer has been consumed by the player or the player is stopped. may be
     *                          nil.
     */
    @Generated
    @Selector("scheduleBuffer:atTime:options:completionHandler:")
    public native void scheduleBufferAtTimeOptionsCompletionHandler(@NotNull AVAudioPCMBuffer buffer,
            @Nullable AVAudioTime when, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_scheduleBufferAtTimeOptionsCompletionHandler") Block_scheduleBufferAtTimeOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferAtTimeOptionsCompletionHandler {
        @Generated
        void call_scheduleBufferAtTimeOptionsCompletionHandler();
    }

    /**
     * scheduleBuffer:completionCallbackType:completionHandler:
     * 
     * Schedule playing samples from an AVAudioBuffer.
     * 
     * Schedules the buffer to be played following any previously scheduled commands.
     * 
     * API-Since: 11.0
     * 
     * @param buffer
     *                          the buffer to play
     * @param callbackType
     *                          option to specify when the completion handler must be called
     * @param completionHandler
     *                          called after the buffer has been consumed by the player or has finished playing back or
     *                          the player is stopped. may be nil.
     */
    @Generated
    @Selector("scheduleBuffer:completionCallbackType:completionHandler:")
    public native void scheduleBufferCompletionCallbackTypeCompletionHandler(@NotNull AVAudioPCMBuffer buffer,
            @NInt long callbackType,
            @Nullable @ObjCBlock(name = "call_scheduleBufferCompletionCallbackTypeCompletionHandler") Block_scheduleBufferCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleBufferCompletionCallbackTypeCompletionHandler(@NInt long callbackType);
    }

    /**
     * scheduleBuffer:completionHandler:
     * 
     * Schedule playing samples from an AVAudioBuffer.
     * 
     * Schedules the buffer to be played following any previously scheduled commands.
     * 
     * It is possible for the completionHandler to be called before rendering begins
     * or before the buffer is played completely.
     * 
     * @param buffer
     *                          the buffer to play
     * @param completionHandler
     *                          called after the buffer has been consumed by the player or the player is stopped. may be
     *                          nil.
     */
    @Generated
    @Selector("scheduleBuffer:completionHandler:")
    public native void scheduleBufferCompletionHandler(@NotNull AVAudioPCMBuffer buffer,
            @Nullable @ObjCBlock(name = "call_scheduleBufferCompletionHandler") Block_scheduleBufferCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleBufferCompletionHandler {
        @Generated
        void call_scheduleBufferCompletionHandler();
    }

    /**
     * scheduleFile:atTime:completionCallbackType:completionHandler:
     * 
     * Schedule playing of an entire audio file.
     * 
     * @param file
     *                          the file to play
     * @param when
     *                          the time at which to play the file. see the discussion of timestamps, above.
     * @param callbackType
     *                          option to specify when the completion handler must be called
     * @param completionHandler
     *                          called after the file has been consumed by the player or has finished playing back or
     *                          the player is stopped. may be nil.
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("scheduleFile:atTime:completionCallbackType:completionHandler:")
    public native void scheduleFileAtTimeCompletionCallbackTypeCompletionHandler(@NotNull AVAudioFile file,
            @Nullable AVAudioTime when, @NInt long callbackType,
            @Nullable @ObjCBlock(name = "call_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler") Block_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleFileAtTimeCompletionCallbackTypeCompletionHandler(@NInt long callbackType);
    }

    /**
     * scheduleFile:atTime:completionHandler:
     * 
     * Schedule playing of an entire audio file.
     * 
     * It is possible for the completionHandler to be called before rendering begins
     * or before the file is played completely.
     * 
     * @param file
     *                          the file to play
     * @param when
     *                          the time at which to play the file. see the discussion of timestamps, above.
     * @param completionHandler
     *                          called after the file has been consumed by the player or the player is stopped. may be
     *                          nil.
     */
    @Generated
    @Selector("scheduleFile:atTime:completionHandler:")
    public native void scheduleFileAtTimeCompletionHandler(@NotNull AVAudioFile file, @Nullable AVAudioTime when,
            @Nullable @ObjCBlock(name = "call_scheduleFileAtTimeCompletionHandler") Block_scheduleFileAtTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleFileAtTimeCompletionHandler {
        @Generated
        void call_scheduleFileAtTimeCompletionHandler();
    }

    /**
     * scheduleSegment:startingFrame:frameCount:atTime:completionCallbackType:completionHandler:
     * 
     * Schedule playing a segment of an audio file.
     * 
     * @param file
     *                          the file to play
     * @param startFrame
     *                          the starting frame position in the stream
     * @param numberFrames
     *                          the number of frames to play
     * @param when
     *                          the time at which to play the region. see the discussion of timestamps, above.
     * @param callbackType
     *                          option to specify when the completion handler must be called
     * @param completionHandler
     *                          called after the segment has been consumed by the player or has finished playing back or
     *                          the player is stopped. may be nil.
     * 
     *                          API-Since: 11.0
     */
    @Generated
    @Selector("scheduleSegment:startingFrame:frameCount:atTime:completionCallbackType:completionHandler:")
    public native void scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler(
            @NotNull AVAudioFile file, long startFrame, int numberFrames, @Nullable AVAudioTime when,
            @NInt long callbackType,
            @Nullable @ObjCBlock(name = "call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler") Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler {
        @Generated
        void call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionCallbackTypeCompletionHandler(
                @NInt long callbackType);
    }

    /**
     * scheduleSegment:startingFrame:frameCount:atTime:completionHandler:
     * 
     * Schedule playing a segment of an audio file.
     * 
     * It is possible for the completionHandler to be called before rendering begins
     * or before the segment is played completely.
     * 
     * @param file
     *                          the file to play
     * @param startFrame
     *                          the starting frame position in the stream
     * @param numberFrames
     *                          the number of frames to play
     * @param when
     *                          the time at which to play the region. see the discussion of timestamps, above.
     * @param completionHandler
     *                          called after the segment has been consumed by the player or the player is stopped. may
     *                          be nil.
     */
    @Generated
    @Selector("scheduleSegment:startingFrame:frameCount:atTime:completionHandler:")
    public native void scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler(@NotNull AVAudioFile file,
            long startFrame, int numberFrames, @Nullable AVAudioTime when,
            @Nullable @ObjCBlock(name = "call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler") Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler {
        @Generated
        void call_scheduleSegmentStartingFrameFrameCountAtTimeCompletionHandler();
    }

    @Generated
    @Selector("setObstruction:")
    public native void setObstruction(float value);

    @Generated
    @Selector("setOcclusion:")
    public native void setOcclusion(float value);

    @Generated
    @Selector("setPan:")
    public native void setPan(float value);

    @Generated
    @Selector("setPointSourceInHeadMode:")
    public native void setPointSourceInHeadMode(@NInt long value);

    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue AVAudio3DPoint value);

    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setRenderingAlgorithm:")
    public native void setRenderingAlgorithm(@NInt long value);

    @Generated
    @Selector("setReverbBlend:")
    public native void setReverbBlend(float value);

    @Generated
    @Selector("setSourceMode:")
    public native void setSourceMode(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setVolume:")
    public native void setVolume(float value);

    @Generated
    @Selector("sourceMode")
    @NInt
    public native long sourceMode();

    /**
     * stop
     * 
     * Clear all of the node's previously scheduled events and stop playback.
     * 
     * All of the node's previously scheduled events are cleared, including any that are in the
     * middle of playing. The node's sample time (and therefore the times to which new events are
     * to be scheduled) is reset to 0, and will not proceed until the node is started again (via
     * play or playAtTime).
     * 
     * Note that pausing or stopping all the players connected to an engine does not pause or stop
     * the engine or the underlying hardware. The engine must be explicitly paused or stopped for
     * the hardware to stop.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("volume")
    public native float volume();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVAudioSequencer
 * 
 * A collection of MIDI events organized into AVMusicTracks, plus a player to play back the events.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioSequencer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioSequencer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioSequencer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioSequencer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * beatsForHostTime:error:
     * 
     * Returns the beat that will be (or was) played at the specified host time.
     * 
     * This call is only valid if the player is playing and will return 0 with an error if the
     * player is not playing or if the starting time of the player was after the specified host
     * time. The method uses the sequence's tempo map to retrieve a beat time from the starting
     * and specified host time.
     */
    @Generated
    @Selector("beatsForHostTime:error:")
    public native double beatsForHostTimeError(long inHostTime,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * beatsForSeconds:
     * 
     * Get the beat position (timestamp) for the given time in the AVMusicTrack
     */
    @Generated
    @Selector("beatsForSeconds:")
    public native double beatsForSeconds(double seconds);

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

    /**
     * [@property] currentPositionInBeats
     * 
     * The current playback position in beats
     * 
     * Setting this positions the sequencer's player to the specified beat. This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("currentPositionInBeats")
    public native double currentPositionInBeats();

    /**
     * [@property] currentPositionInSeconds
     * 
     * The current playback position in seconds
     * 
     * Setting this positions the sequencer's player to the specified time. This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("currentPositionInSeconds")
    public native double currentPositionInSeconds();

    /**
     * dataWithSMPTEResolution:error:
     * 
     * Return a data object containing the events from the sequence
     * 
     * All details regarding the SMPTE resolution apply here as well.
     * The returned NSData lifetime is controlled by the client.
     */
    @NotNull
    @Generated
    @Selector("dataWithSMPTEResolution:error:")
    public native NSData dataWithSMPTEResolutionError(@NInt long SMPTEResolution,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * hostTimeForBeats:error:
     * 
     * Returns the host time that will be (or was) played at the specified beat.
     * 
     * This call is only valid if the player is playing and will return 0 with an error if the
     * player is not playing or if the starting position of the player (its "starting beat") was
     * after the specified beat. The method uses the sequence's tempo map to translate a beat
     * time from the starting time and beat of the player.
     */
    @Generated
    @Selector("hostTimeForBeats:error:")
    public native long hostTimeForBeatsError(double inBeats,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * init
     * 
     * Initialize a new sequencer, which will not be connected to an audio engine.
     * 
     * This is used to create a sequencer whose tracks will only send events to external MIDI endpoints.
     */
    @Generated
    @Selector("init")
    public native AVAudioSequencer init();

    /**
     * initWithAudioEngine:
     * 
     * Initialize a new sequencer, handing it the audio engine.
     */
    @Generated
    @Selector("initWithAudioEngine:")
    public native AVAudioSequencer initWithAudioEngine(@NotNull AVAudioEngine engine);

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
     * Indicates whether or not the sequencer's player is playing
     * 
     * Returns TRUE if the sequencer's player has been started and not stopped. It may have
     * "played" past the end of the events in the sequence, but it is still considered to be
     * playing (and its time value increasing) until it is explicitly stopped.
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

    /**
     * loadFromData:options:error:
     * 
     * Parse the data and add the its events to the sequence
     * 
     * @param data
     *                 the data to load from
     * @param options
     *                 determines how the contents are mapped to tracks inside the sequence
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("loadFromData:options:error:")
    public native boolean loadFromDataOptionsError(@NotNull NSData data, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * loadFromURL:options:error:
     * 
     * Load the file referenced by the URL and add the events to the sequence
     * 
     * @param fileURL
     *                 the URL to the file
     * @param options
     *                 determines how the file's contents are mapped to tracks inside the sequence
     * @param outError
     *                 on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("loadFromURL:options:error:")
    public native boolean loadFromURLOptionsError(@NotNull NSURL fileURL, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioSequencer new_objc();

    /**
     * prepareToPlay
     * 
     * Get ready to play the sequence by prerolling all events
     * 
     * Happens automatically on play if it has not already been called, but may produce a delay in
     * startup.
     */
    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * [@property] rate
     * 
     * The playback rate of the sequencer's player
     * 
     * 1.0 is normal playback rate. Rate must be > 0.0.
     */
    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * secondsForBeats:
     * 
     * Get the time in seconds for the given beat position (timestamp) in the AVMusicTrack
     */
    @Generated
    @Selector("secondsForBeats:")
    public native double secondsForBeats(double beats);

    /**
     * [@property] currentPositionInBeats
     * 
     * The current playback position in beats
     * 
     * Setting this positions the sequencer's player to the specified beat. This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("setCurrentPositionInBeats:")
    public native void setCurrentPositionInBeats(double value);

    /**
     * [@property] currentPositionInSeconds
     * 
     * The current playback position in seconds
     * 
     * Setting this positions the sequencer's player to the specified time. This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("setCurrentPositionInSeconds:")
    public native void setCurrentPositionInSeconds(double value);

    /**
     * [@property] rate
     * 
     * The playback rate of the sequencer's player
     * 
     * 1.0 is normal playback rate. Rate must be > 0.0.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startAndReturnError:
     * 
     * Start the sequencer's player
     * 
     * If the AVAudioSequencer has not been prerolled, it will pre-roll itself and then start.
     * When the sequencer is associated with an audio engine, the sequencer's player will only
     * play if the audio engine is running.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * stop
     * 
     * Stop the sequencer's player
     * 
     * Stopping the player leaves it in an un-prerolled state, but stores the playback position so
     * that a subsequent call to startAndReturnError will resume where it left off. This action
     * will not stop an associated audio engine.
     */
    @Generated
    @Selector("stop")
    public native void stop();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] tempoTrack
     * 
     * The tempo track
     * 
     * Each AVMusicSequence has a single tempo track.
     * 
     * All tempo events read from external MIDI files are placed into this track (as well as other
     * appropriate events (e.g., the time signature meta event from the file).
     * 
     * The tempo track can be edited and iterated upon as any other track.
     * 
     * Non-tempo-related events will generate exceptions if added.
     */
    @NotNull
    @Generated
    @Selector("tempoTrack")
    public native AVMusicTrack tempoTrack();

    /**
     * [@property] tracks
     * 
     * An NSArray containing all the AVMusicTracks in the sequence
     * 
     * This list will not include the tempo track.
     */
    @NotNull
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMusicTrack> tracks();

    /**
     * [@property] userInfo
     * 
     * A dictionary containing meta-data derived from a sequence
     * 
     * The dictionary can contain one or more of the values accessible via the AVAudioSequencerInfoDictionaryKeys.
     */
    @NotNull
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * writeToURL:SMPTEResolution:replaceExisting:error:
     * 
     * Create and write a MIDI file containing the events and complete state of the sequence
     * 
     * A MIDI file saved via this method will contain not only the complete MIDI content of the sequence,
     * but also the state of all tracks, including muting, loop points and enablement, etc. It will also
     * contain all non-MIDI AVMusicEvent types which had been added to the sequence's track.
     * 
     * MIDI files are normally beat based, but can also have a SMPTE (or real-time rather than beat time)
     * representation.
     * The relationship between "tick" and quarter note for saving to Standard MIDI File
     * - pass in zero to use default - this will be the value that is currently set on the tempo track
     * 
     * @param fileURL
     *                   the path for the file to be created
     * @param resolution
     *                   the relationship between "tick" and quarter note for saving to a Standard MIDI File - pass in
     *                   zero to use default - this will be the value that is currently set on the tempo track
     * @param replace
     *                   if the file already exists, YES will cause it to be overwritten with the new data.
     *                   Otherwise the call will fail with a permission error.
     * @param outError
     *                   on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("writeToURL:SMPTEResolution:replaceExisting:error:")
    public native boolean writeToURLSMPTEResolutionReplaceExistingError(@NotNull NSURL fileURL, @NInt long resolution,
            boolean replace, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * createAndAppendTrack:
     * 
     * Create a new AVMusicTrack and append it to the AVMusicSequencer's list
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("createAndAppendTrack")
    public native AVMusicTrack createAndAppendTrack();

    /**
     * removeTrack:
     * 
     * Remove the given AVMusicTrack from the AVMusicSequencer.
     * 
     * This does not destroy the AVMusicTrack because it may be re-used.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("removeTrack:")
    public native boolean removeTrack(@NotNull AVMusicTrack track);

    /**
     * reverseEvents:
     * 
     * Reverse the order of all events in all AVMusicTracks, including the tempo track
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("reverseEvents")
    public native void reverseEvents();

    /**
     * setUserCallback:
     * 
     * Add a block which will be called each time the AVAudioSequencer encounters an AVMusicUserEvent during playback.
     * 
     * The same callback is called for events which occur on any track in the sequencer.
     * 
     * Set the block to nil to disable it.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setUserCallback:")
    public native void setUserCallback(
            @Nullable @ObjCBlock(name = "call_setUserCallback") Block_setUserCallback userCallback);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserCallback {
        @Generated
        void call_setUserCallback(@NotNull AVMusicTrack arg0, @NotNull NSData arg1, double arg2);
    }
}

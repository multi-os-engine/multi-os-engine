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

/**
 * AVAudioSequencer
 * <p>
 * A collection of MIDI events organized into AVMusicTracks, plus a player to play back the events.
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * beatsForHostTime:error:
     * <p>
     * Returns the beat that will be (or was) played at the specified host time.
     * <p>
     * This call is only valid if the player is playing and will return 0 with an error if the
     * player is not playing or if the starting time of the player was after the specified host
     * time.  The method uses the sequence's tempo map to retrieve a beat time from the starting
     * and specified host time.
     */
    @Generated
    @Selector("beatsForHostTime:error:")
    public native double beatsForHostTimeError(long inHostTime,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * beatsForSeconds:
     * <p>
     * Get the beat position (timestamp) for the given time in the track
     */
    @Generated
    @Selector("beatsForSeconds:")
    public native double beatsForSeconds(double seconds);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] currentPositionInBeats
     * <p>
     * The current playback position in beats
     * <p>
     * Setting this positions the sequencer's player to the specified beat.  This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("currentPositionInBeats")
    public native double currentPositionInBeats();

    /**
     * [@property] currentPositionInSeconds
     * <p>
     * The current playback position in seconds
     * <p>
     * Setting this positions the sequencer's player to the specified time.  This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("currentPositionInSeconds")
    public native double currentPositionInSeconds();

    /**
     * dataWithSMPTEResolution:error:
     * <p>
     * Return a data object containing the events from the sequence
     * <p>
     * All details regarding the SMPTE resolution apply here as well.
     * The returned NSData lifetime is controlled by the client.
     */
    @Generated
    @Selector("dataWithSMPTEResolution:error:")
    public native NSData dataWithSMPTEResolutionError(@NInt long SMPTEResolution,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

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
     * <p>
     * Returns the host time that will be (or was) played at the specified beat.
     * <p>
     * This call is only valid if the player is playing and will return 0 with an error if the
     * player is not playing or if the starting position of the player (its "starting beat") was
     * after the specified beat.  The method uses the sequence's tempo map to translate a beat
     * time from the starting time and beat of the player.
     */
    @Generated
    @Selector("hostTimeForBeats:error:")
    public native long hostTimeForBeatsError(double inBeats,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * init
     * <p>
     * Initialize a new sequencer, which will not be connected to an audio engine.
     * <p>
     * This is used to create a sequencer whose tracks will only send events to external MIDI endpoints.
     */
    @Generated
    @Selector("init")
    public native AVAudioSequencer init();

    /**
     * initWithAudioEngine:
     * <p>
     * Initialize a new sequencer, handing it the audio engine.
     */
    @Generated
    @Selector("initWithAudioEngine:")
    public native AVAudioSequencer initWithAudioEngine(AVAudioEngine engine);

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
     * <p>
     * Indicates whether or not the sequencer's player is playing
     * <p>
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * loadFromData:options:error:
     * <p>
     * Parse the data and add the its events to the sequence
     *
     * @param data     the data to load from
     * @param options  determines how the contents are mapped to tracks inside the sequence
     * @param outError on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("loadFromData:options:error:")
    public native boolean loadFromDataOptionsError(NSData data, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * loadFromURL:options:error:
     * <p>
     * Load the file referenced by the URL and add the events to the sequence
     *
     * @param fileURL  the URL to the file
     * @param options  determines how the file's contents are mapped to tracks inside the sequence
     * @param outError on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("loadFromURL:options:error:")
    public native boolean loadFromURLOptionsError(NSURL fileURL, @NUInt long options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @Owned
    @Selector("new")
    public static native AVAudioSequencer new_objc();

    /**
     * prepareToPlay
     * <p>
     * Get ready to play the sequence by prerolling all events
     * <p>
     * Happens automatically on play if it has not already been called, but may produce a delay in
     * startup.
     */
    @Generated
    @Selector("prepareToPlay")
    public native void prepareToPlay();

    /**
     * [@property] rate
     * <p>
     * The playback rate of the sequencer's player
     * <p>
     * 1.0 is normal playback rate.  Rate must be > 0.0.
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
     * <p>
     * Get the time in seconds for the given beat position (timestamp) in the track
     */
    @Generated
    @Selector("secondsForBeats:")
    public native double secondsForBeats(double beats);

    /**
     * [@property] currentPositionInBeats
     * <p>
     * The current playback position in beats
     * <p>
     * Setting this positions the sequencer's player to the specified beat.  This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("setCurrentPositionInBeats:")
    public native void setCurrentPositionInBeats(double value);

    /**
     * [@property] currentPositionInSeconds
     * <p>
     * The current playback position in seconds
     * <p>
     * Setting this positions the sequencer's player to the specified time.  This can be set while
     * the player is playing, in which case playback will resume at the new position.
     */
    @Generated
    @Selector("setCurrentPositionInSeconds:")
    public native void setCurrentPositionInSeconds(double value);

    /**
     * [@property] rate
     * <p>
     * The playback rate of the sequencer's player
     * <p>
     * 1.0 is normal playback rate.  Rate must be > 0.0.
     */
    @Generated
    @Selector("setRate:")
    public native void setRate(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * startAndReturnError:
     * <p>
     * Start the sequencer's player
     * <p>
     * If the AVAudioSequencer has not been prerolled, it will pre-roll itself and then start.
     * When the sequencer is associated with an audio engine, the sequencer's player will only
     * play if the audio engine is running.
     */
    @Generated
    @Selector("startAndReturnError:")
    public native boolean startAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    /**
     * stop
     * <p>
     * Stop the sequencer's player
     * <p>
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
     * <p>
     * The tempo track
     * <p>
     * Each sequence has a single tempo track. All tempo events are placed into this track (as well
     * as other appropriate events (for instance, the time signature from a MIDI file). The tempo
     * track can be edited and iterated upon as any other track. Non-tempo events in a tempo track
     * are ignored.
     */
    @Generated
    @Selector("tempoTrack")
    public native AVMusicTrack tempoTrack();

    /**
     * [@property] tracks
     * <p>
     * An NSArray containing all the tracks in the sequence
     * <p>
     * Track indices count from 0, and do not include the tempo track.
     */
    @Generated
    @Selector("tracks")
    public native NSArray<? extends AVMusicTrack> tracks();

    /**
     * [@property] userInfo
     * <p>
     * A dictionary containing meta-data derived from a sequence
     * <p>
     * The dictionary can contain one or more of the kAFInfoDictionary_* keys
     * specified in <AudioToolbox/AudioFile.h>
     */
    @Generated
    @Selector("userInfo")
    public native NSDictionary<String, ?> userInfo();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * writeToURL:SMPTEResolution:replaceExisting:error:
     * <p>
     * Create and write a MIDI file from the events in the sequence
     * <p>
     * Only MIDI events are written when writing to the MIDI file. MIDI files are normally beat
     * based, but can also have a SMPTE (or real-time rather than beat time) representation.
     * The relationship between "tick" and quarter note for saving to Standard MIDI File
     * - pass in zero to use default - this will be the value that is currently set on the tempo track
     *
     * @param fileURL    the path for the file to be created
     * @param resolution the relationship between "tick" and quarter note for saving to a Standard MIDI File - pass in
     *                   zero to use default - this will be the value that is currently set on the tempo track
     * @param replace    if the file already exists, YES will cause it to be overwritten with the new data.
     *                   Otherwise the call will fail with a permission error.
     * @param outError   on exit, if an error occurs, a description of the error
     */
    @Generated
    @Selector("writeToURL:SMPTEResolution:replaceExisting:error:")
    public native boolean writeToURLSMPTEResolutionReplaceExistingError(NSURL fileURL, @NInt long resolution,
            boolean replace, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);
}

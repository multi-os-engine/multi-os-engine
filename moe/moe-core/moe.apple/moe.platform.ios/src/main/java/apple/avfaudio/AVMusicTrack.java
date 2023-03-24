package apple.avfaudio;

import apple.NSObject;
import apple.avfaudio.struct.AVBeatRange;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.objc.ann.ObjCBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVMusicTrack
 * 
 * A collection of music events which will be sent to a given destination, and which can be
 * offset, muted, etc. independently of events in other tracks.
 * 
 * AVMusicTrack is not a container of AVMusicEvents - it will not hold references to
 * AVMusicEvents that are added, so an application should maintain its own if it is
 * desired.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVMusicTrack extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVMusicTrack(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVMusicTrack alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVMusicTrack allocWithZone(VoidPtr zone);

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

    /**
     * [@property] destinationAudioUnit
     * 
     * The AVAudioUnit which will receive the track's events
     * 
     * This is mutually exclusive with setting a destination MIDIEndpoint. The AU must already be
     * attached to an audio engine, and the track must be part of the AVAudioSequencer associated
     * with that engine. When playing, the track will send its events to that AVAudioUnit. The
     * destination AU cannot be changed while the track's sequence is playing.
     */
    @Nullable
    @Generated
    @Selector("destinationAudioUnit")
    public native AVAudioUnit destinationAudioUnit();

    @Generated
    @Selector("destinationMIDIEndpoint")
    public native int destinationMIDIEndpoint();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVMusicTrack init();

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
     * [@property] loopingEnabled
     * 
     * Determines whether or not the track is looped.
     * 
     * If loopRange has not been set, the full track will be looped.
     */
    @Generated
    @Selector("isLoopingEnabled")
    public native boolean isLoopingEnabled();

    /**
     * [@property] muted
     * 
     * Whether the track is muted
     */
    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    /**
     * [@property] soloed
     * 
     * Whether the track is soloed
     */
    @Generated
    @Selector("isSoloed")
    public native boolean isSoloed();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] lengthInBeats
     * 
     * The total duration of the track in beats
     * 
     * This will return the beat of the last event in the track plus any additional time that may
     * be needed for fading out of ending notes or round a loop point to musical bar, etc. If this
     * has not been set by the user, the track length will always be adjusted to the end of the
     * last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("lengthInBeats")
    public native double lengthInBeats();

    /**
     * [@property] lengthInSeconds
     * 
     * The total duration of the track in seconds
     * 
     * This will return time of the last event in the track plus any additional time that may be
     * needed for fading out of ending notes or round a loop point to musical bar, etc. If this
     * has not been set by the user, the track length will always be adjusted to the end of the
     * last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("lengthInSeconds")
    public native double lengthInSeconds();

    /**
     * [@property] loopRange
     * 
     * The timestamp range in beats for the loop
     * 
     * The loop is set by specifying its beat range.
     */
    @Generated
    @Selector("loopRange")
    @ByValue
    public native AVBeatRange loopRange();

    @Generated
    @Owned
    @Selector("new")
    public static native AVMusicTrack new_objc();

    /**
     * [@property] numberOfLoops
     * 
     * The number of times that the track's loop will repeat
     * 
     * If set to AVMusicTrackLoopCountForever, the track will loop forever.
     * Otherwise, legal values start with 1.
     */
    @Generated
    @Selector("numberOfLoops")
    @NInt
    public native long numberOfLoops();

    /**
     * [@property] offsetTime
     * 
     * Offset the track's start time to the specified time in beats
     * 
     * By default this value is zero.
     */
    @Generated
    @Selector("offsetTime")
    public native double offsetTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] destinationAudioUnit
     * 
     * The AVAudioUnit which will receive the track's events
     * 
     * This is mutually exclusive with setting a destination MIDIEndpoint. The AU must already be
     * attached to an audio engine, and the track must be part of the AVAudioSequencer associated
     * with that engine. When playing, the track will send its events to that AVAudioUnit. The
     * destination AU cannot be changed while the track's sequence is playing.
     */
    @Generated
    @Selector("setDestinationAudioUnit:")
    public native void setDestinationAudioUnit(@Nullable AVAudioUnit value);

    @Generated
    @Selector("setDestinationMIDIEndpoint:")
    public native void setDestinationMIDIEndpoint(int value);

    /**
     * [@property] lengthInBeats
     * 
     * The total duration of the track in beats
     * 
     * This will return the beat of the last event in the track plus any additional time that may
     * be needed for fading out of ending notes or round a loop point to musical bar, etc. If this
     * has not been set by the user, the track length will always be adjusted to the end of the
     * last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("setLengthInBeats:")
    public native void setLengthInBeats(double value);

    /**
     * [@property] lengthInSeconds
     * 
     * The total duration of the track in seconds
     * 
     * This will return time of the last event in the track plus any additional time that may be
     * needed for fading out of ending notes or round a loop point to musical bar, etc. If this
     * has not been set by the user, the track length will always be adjusted to the end of the
     * last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("setLengthInSeconds:")
    public native void setLengthInSeconds(double value);

    /**
     * [@property] loopRange
     * 
     * The timestamp range in beats for the loop
     * 
     * The loop is set by specifying its beat range.
     */
    @Generated
    @Selector("setLoopRange:")
    public native void setLoopRange(@ByValue AVBeatRange value);

    /**
     * [@property] loopingEnabled
     * 
     * Determines whether or not the track is looped.
     * 
     * If loopRange has not been set, the full track will be looped.
     */
    @Generated
    @Selector("setLoopingEnabled:")
    public native void setLoopingEnabled(boolean value);

    /**
     * [@property] muted
     * 
     * Whether the track is muted
     */
    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    /**
     * [@property] numberOfLoops
     * 
     * The number of times that the track's loop will repeat
     * 
     * If set to AVMusicTrackLoopCountForever, the track will loop forever.
     * Otherwise, legal values start with 1.
     */
    @Generated
    @Selector("setNumberOfLoops:")
    public native void setNumberOfLoops(@NInt long value);

    /**
     * [@property] offsetTime
     * 
     * Offset the track's start time to the specified time in beats
     * 
     * By default this value is zero.
     */
    @Generated
    @Selector("setOffsetTime:")
    public native void setOffsetTime(double value);

    /**
     * [@property] soloed
     * 
     * Whether the track is soloed
     */
    @Generated
    @Selector("setSoloed:")
    public native void setSoloed(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] timeResolution
     * 
     * The time resolution value for the sequence, in ticks (pulses) per quarter note (PPQN)
     * 
     * If a MIDI file was used to construct the containing sequence, the resolution will be what
     * was in the file. If you want to keep a time resolution when writing a new file, you can
     * retrieve this value and then specify it when calling -[AVAudioSequencer
     * writeToFile:flags:withResolution]. It has no direct bearing on the rendering or notion of
     * time of the sequence itself, just its representation in MIDI files. By default this is set
     * to either 480 if the sequence was created manually, or a value based on what was in a MIDI
     * file if the sequence was created from a MIDI file.
     * 
     * This can only be retrieved from the tempo track.
     */
    @Generated
    @Selector("timeResolution")
    @NUInt
    public native long timeResolution();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * addAvent:atBeat
     * 
     * Adds an AVMusicEvent's contents to a track at the specified AVMusicTimeStamp.
     * 
     * Because event contents are copied into the track, the same event may be added multiple
     * times at different timestamps.
     * 
     * There are restrictions on which AVMusicEvent subclasses may be added to different tracks:
     * 
     * - Only AVExtendedTempoEvents and AVMIDIMetaEvents with certain AVMIDIMetaEventTypes
     * can be added to an AVMusicSequence's tempo track (see AVMIDIMetaEvent).
     * 
     * - AVParameterEvents can only be added to automation tracks (see AVParameterEvent).
     * 
     * - All other event subclasses cannot be added to tempo or automation tracks.
     * 
     * @param event the event to be added
     * @param beat  the AVMusicTimeStamp
     */
    @Generated
    @Selector("addEvent:atBeat:")
    public native void addEventAtBeat(@NotNull AVMusicEvent event, double beat);

    /**
     * clearEventsInRange:
     * 
     * Removes all events in the given beat range, erasing that portion of the AVMusicTrack.
     * 
     * All events outside of the specified range left unmodified.
     * 
     * @param range the range of beats. Must be a valid AVBeatRange.
     */
    @Generated
    @Selector("clearEventsInRange:")
    public native void clearEventsInRange(@ByValue AVBeatRange range);

    /**
     * copyAndMergeEventsInRange:fromTrack:mergeAtBeat
     * 
     * Copies all events in the given beat range from the specified AVMusicTrack,
     * merging them into the current AVMusicTrack.
     * 
     * All events originally at or past mergeStartBeat will be left unmodified.
     * 
     * Copying events from track to track follows the same type-exclusion rules as adding
     * events: The operation will generate an exception.
     * 
     * @param range           the range of beats. Must be a valid AVBeatRange.
     * @param sourceTrack     the AVMusicTrack to copy the events from.
     * @param insertStartBeat the start beat at which the copied events should be merged.
     */
    @Generated
    @Selector("copyAndMergeEventsInRange:fromTrack:mergeAtBeat:")
    public native void copyAndMergeEventsInRangeFromTrackMergeAtBeat(@ByValue AVBeatRange range,
            @NotNull AVMusicTrack sourceTrack, double mergeStartBeat);

    /**
     * copyEventsInRange:fromTrack:insertAtBeat
     * 
     * Copies all events in the given beat range from the specified AVMusicTrack,
     * splicing them into the current AVMusicTrack.
     * 
     * All events originally at or past insertStartBeat will be shifted forward by the duration
     * of the copied-in range.
     * 
     * @param range           the range of beats. Must be a valid AVBeatRange.
     * @param sourceTrack     the AVMusicTrack to copy the events from.
     * @param insertStartBeat the start beat at which the copied events should be spliced in.
     */
    @Generated
    @Selector("copyEventsInRange:fromTrack:insertAtBeat:")
    public native void copyEventsInRangeFromTrackInsertAtBeat(@ByValue AVBeatRange range,
            @NotNull AVMusicTrack sourceTrack, double insertStartBeat);

    /**
     * cutEventsInRange:
     * 
     * Removes all events in the given beat range, splicing out that portion of the AVMusicTrack.
     * 
     * All events past the end of the specified range will be shifted backward by the duration of the range.
     * 
     * @param range the range of beats. Must be a valid AVBeatRange.
     */
    @Generated
    @Selector("cutEventsInRange:")
    public native void cutEventsInRange(@ByValue AVBeatRange range);

    /**
     * enumerateEventsInRange:usingBlock:
     * 
     * Iterates through the AVMusicEvents within the AVMusicTrack whose timestamps fit within the range,
     * calling the block for each.
     * 
     * Each event returned via the block should be examined using `NSObject(isKindOfClass:)`
     * to determine its subclass and then cast and accessed/edited accordingly.
     * 
     * The iteration may continue after removing an event.
     * 
     * The event objects returned via the block will not be the same instances
     * which were added to the AVMusicTrack, though their contents will be identical.
     * 
     * @param block the AVMusicEventEnumerationBlock to call for each event.
     */
    @Generated
    @Selector("enumerateEventsInRange:usingBlock:")
    public native void enumerateEventsInRangeUsingBlock(@ByValue AVBeatRange range,
            @NotNull @ObjCBlock(name = "call_enumerateEventsInRangeUsingBlock") Block_enumerateEventsInRangeUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEventsInRangeUsingBlock {
        @Generated
        void call_enumerateEventsInRangeUsingBlock(@NotNull AVMusicEvent event, @NotNull DoublePtr timeStamp,
                @NotNull BoolPtr removeEvent);
    }

    /**
     * moveEventsInRange:byAmount
     * 
     * Shift the beat location of all events in the given beat range by the amount specified.
     * 
     * @param range      the range of beats. Must be a valid AVBeatRange.
     * @param beatAmount the amount in beats to shift each event. The amount may be positive or negative.
     */
    @Generated
    @Selector("moveEventsInRange:byAmount:")
    public native void moveEventsInRangeByAmount(@ByValue AVBeatRange range, double beatAmount);

    /**
     * [@property] usesAutomatedParameters
     * 
     * Indicates whether the track is an automation track.
     * 
     * If set to YES, this can be used to contain, parameter automation events, exclusively.
     * Adding any other event types will generate exceptions.
     * 
     * If a track already contains non-parameter events, setting this to YES will
     * generate an exception.
     */
    @Generated
    @Selector("setUsesAutomatedParameters:")
    public native void setUsesAutomatedParameters(boolean value);

    /**
     * [@property] usesAutomatedParameters
     * 
     * Indicates whether the track is an automation track.
     * 
     * If set to YES, this can be used to contain, parameter automation events, exclusively.
     * Adding any other event types will generate exceptions.
     * 
     * If a track already contains non-parameter events, setting this to YES will
     * generate an exception.
     */
    @Generated
    @Selector("usesAutomatedParameters")
    public native boolean usesAutomatedParameters();
}

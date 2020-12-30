/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.avfoundation;

import apple.NSObject;
import apple.avfoundation.struct.AVBeatRange;
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
import org.moe.natj.general.ann.MappedReturn;
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

/**
 * @class AVMusicTrack
 * @abstract A collection of music events which will be sent to a given destination, and which can be 
 * 			offset, muted, etc. independently of events in other tracks.
 */
@Generated
@Library("AVFoundation")
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @property destinationAudioUnit
     * @abstract The AVAudioUnit which will receive the track's events
     * @discussion
     * 	This is mutually exclusive with setting a destination MIDIEndpoint.  The AU must already be
     * 	attached to an audio engine, and the track must be part of the AVAudioSequencer associated
     * 	with that engine. When playing, the track will send its events to that AVAudioUnit. The
     * 	destination AU cannot be changed while the track's sequence is playing.
     */
    @Generated
    @Selector("destinationAudioUnit")
    public native AVAudioUnit destinationAudioUnit();

    @Generated
    @Selector("destinationMIDIEndpoint")
    public native int destinationMIDIEndpoint();

    @Generated
    @Selector("init")
    public native AVMusicTrack init();

    /**
     * @property loopingEnabled
     * @abstract Determines whether or not the track is looped.
     * @discussion
     * 	If loopRange has not been set, the full track will be looped.
     */
    @Generated
    @Selector("isLoopingEnabled")
    public native boolean isLoopingEnabled();

    /**
     * @property loopingEnabled
     * @abstract Determines whether or not the track is looped.
     * @discussion
     * 	If loopRange has not been set, the full track will be looped.
     */
    @Generated
    @Selector("setLoopingEnabled:")
    public native void setLoopingEnabled(boolean value);

    /**
     * @property muted
     * @abstract Whether the track is muted
     */
    @Generated
    @Selector("isMuted")
    public native boolean isMuted();

    /**
     * @property muted
     * @abstract Whether the track is muted
     */
    @Generated
    @Selector("setMuted:")
    public native void setMuted(boolean value);

    /**
     * @property soloed
     * @abstract Whether the track is soloed
     */
    @Generated
    @Selector("isSoloed")
    public native boolean isSoloed();

    /**
     * @property soloed
     * @abstract Whether the track is soloed
     */
    @Generated
    @Selector("setSoloed:")
    public native void setSoloed(boolean value);

    /**
     * @property lengthInBeats
     * @abstract The total duration of the track in beats
     * @discussion
     * 	This will return the beat of the last event in the track plus any additional time that may
     * 	be needed for fading out of ending notes or round a loop point to musical bar, etc.  If this
     * 	has not been set by the user, the track length will always be adjusted to the end of the
     * 	last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * 	The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("lengthInBeats")
    public native double lengthInBeats();

    /**
     * @property lengthInSeconds
     * @abstract The total duration of the track in seconds
     * @discussion
     * 	This will return time of the last event in the track plus any additional time that may be
     * 	needed for fading out of ending notes or round a loop point to musical bar, etc.  If this
     * 	has not been set by the user, the track length will always be adjusted to the end of the
     * 	last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * 	The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("lengthInSeconds")
    public native double lengthInSeconds();

    /**
     * @property loopRange
     * @abstract The timestamp range in beats for the loop
     * @discussion
     * 	The loop is set by specifying its beat range.
     */
    @Generated
    @Selector("loopRange")
    @ByValue
    public native AVBeatRange loopRange();

    /**
     * @property numberOfLoops
     * @abstract The number of times that the track's loop will repeat
     * @discussion
     * 	If set to AVMusicTrackLoopCountForever, the track will loop forever.
     * 	Otherwise, legal values start with 1.
     */
    @Generated
    @Selector("numberOfLoops")
    @NInt
    public native long numberOfLoops();

    /**
     * @property offsetTime
     * @abstract Offset the track's start time to the specified time in beats
     * @discussion
     * 	By default this value is zero.
     */
    @Generated
    @Selector("offsetTime")
    public native double offsetTime();

    /**
     * @property destinationAudioUnit
     * @abstract The AVAudioUnit which will receive the track's events
     * @discussion
     * 	This is mutually exclusive with setting a destination MIDIEndpoint.  The AU must already be
     * 	attached to an audio engine, and the track must be part of the AVAudioSequencer associated
     * 	with that engine. When playing, the track will send its events to that AVAudioUnit. The
     * 	destination AU cannot be changed while the track's sequence is playing.
     */
    @Generated
    @Selector("setDestinationAudioUnit:")
    public native void setDestinationAudioUnit(AVAudioUnit value);

    @Generated
    @Selector("setDestinationMIDIEndpoint:")
    public native void setDestinationMIDIEndpoint(int value);

    /**
     * @property lengthInBeats
     * @abstract The total duration of the track in beats
     * @discussion
     * 	This will return the beat of the last event in the track plus any additional time that may
     * 	be needed for fading out of ending notes or round a loop point to musical bar, etc.  If this
     * 	has not been set by the user, the track length will always be adjusted to the end of the
     * 	last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * 	The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("setLengthInBeats:")
    public native void setLengthInBeats(double value);

    /**
     * @property lengthInSeconds
     * @abstract The total duration of the track in seconds
     * @discussion
     * 	This will return time of the last event in the track plus any additional time that may be
     * 	needed for fading out of ending notes or round a loop point to musical bar, etc.  If this
     * 	has not been set by the user, the track length will always be adjusted to the end of the
     * 	last active event in a track and is adjusted dynamically as events are added or removed.
     * 
     * 	The property will return the maximum of the user-set track length, or the calculated length.
     */
    @Generated
    @Selector("setLengthInSeconds:")
    public native void setLengthInSeconds(double value);

    /**
     * @property loopRange
     * @abstract The timestamp range in beats for the loop
     * @discussion
     * 	The loop is set by specifying its beat range.
     */
    @Generated
    @Selector("setLoopRange:")
    public native void setLoopRange(@ByValue AVBeatRange value);

    /**
     * @property numberOfLoops
     * @abstract The number of times that the track's loop will repeat
     * @discussion
     * 	If set to AVMusicTrackLoopCountForever, the track will loop forever.
     * 	Otherwise, legal values start with 1.
     */
    @Generated
    @Selector("setNumberOfLoops:")
    public native void setNumberOfLoops(@NInt long value);

    /**
     * @property offsetTime
     * @abstract Offset the track's start time to the specified time in beats
     * @discussion
     * 	By default this value is zero.
     */
    @Generated
    @Selector("setOffsetTime:")
    public native void setOffsetTime(double value);

    /**
     * @property timeResolution
     * @abstract The time resolution value for the sequence, in ticks (pulses) per quarter note (PPQN)
     * @discussion
     * 	If a MIDI file was used to construct the containing sequence, the resolution will be what
     * 	was in the file. If you want to keep a time resolution when writing a new file, you can
     * 	retrieve this value and then specify it when calling -[AVAudioSequencer
     * 	writeToFile:flags:withResolution]. It has no direct bearing on the rendering or notion of
     * 	time of the sequence itself, just its representation in MIDI files. By default this is set
     * 	to either 480 if the sequence was created manually, or a value based on what was in a MIDI
     * 	file if the sequence was created from a MIDI file.
     * 
     * 	This can only be retrieved from the tempo track.
     */
    @Generated
    @Selector("timeResolution")
    @NUInt
    public native long timeResolution();
}

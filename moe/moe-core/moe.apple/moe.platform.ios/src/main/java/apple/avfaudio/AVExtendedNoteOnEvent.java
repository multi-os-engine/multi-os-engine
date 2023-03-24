package apple.avfaudio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * AVExtendedNoteOnEvent
 * 
 * The event class representing a custom extension of a MIDI note-on.
 * 
 * Using an AVExtendedNoteOnEvent allows an application to trigger a specialized note-on event on one of several
 * Apple audio units which support it. The floating point note and velocity numbers allow optional fractional control
 * of the note's run-time properties which are modulated by those inputs. In addition, it supports the possibility
 * of an audio unit with more than the standard 16 MIDI channels.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVExtendedNoteOnEvent extends AVMusicEvent {
    static {
        NatJ.register();
    }

    @Generated
    protected AVExtendedNoteOnEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVExtendedNoteOnEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVExtendedNoteOnEvent allocWithZone(VoidPtr zone);

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
     * [@property] duration
     * The duration of this event in AVMusicTimeStamp beats. Range: Any nonnegative number.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    /**
     * [@property] groupID
     * This represents the audio unit channel (i.e., Group Scope) which should handle this event.
     * Range: normally between 0 and 15, but may be higher if the AVMusicTrack's destinationAudioUnit
     * supports more channels.
     */
    @Generated
    @Selector("groupID")
    public native int groupID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVExtendedNoteOnEvent init();

    /**
     * initWithMIDINote:velocity:groupID:duration
     * 
     * Initialize the event with a midi note, velocity, instrument and group ID, and a duration.
     * 
     * @param midiNote
     *                 The MIDI velocity represented as a floating point. Range: Destination-dependent, usually 0.0 -
     *                 127.0.
     * @param velocity
     *                 The MIDI velocity represented as a floating point. Range: Destination-dependent, usually 0.0 -
     *                 127.0.
     * @param groupID
     *                 An index indicating the AudioUnitElement within the Group Scope which should handle this event
     *                 (see AudioUnitElement).
     *                 This normally maps to a channel within the audio unit.
     *                 Range: normally between 0 and 15, but may be higher if the AVMusicTrack's destinationAudioUnit
     *                 supports more channels.
     * @param duration
     *                 The duration of this event in AVMusicTimeStamp beats. Range: Any nonnegative number.
     */
    @Generated
    @Selector("initWithMIDINote:velocity:groupID:duration:")
    public native AVExtendedNoteOnEvent initWithMIDINoteVelocityGroupIDDuration(float midiNote, float velocity,
            int groupID, double duration);

    /**
     * initWithMIDINote:velocity:instrumentID:groupID:duration
     * 
     * Initialize the event with a midi note, velocity, instrument and group ID, and a duration.
     * 
     * This initializer is identical to initWithMIDINote:velocity:groupID:duration with the addition of
     * an instrumentID parameter which will allow for the possibility of an externally-created custom instrument.
     * If this initializer is used, instrumentID should be set to AVExtendedNoteOnEventDefaultInstrument for now.
     */
    @Generated
    @Selector("initWithMIDINote:velocity:instrumentID:groupID:duration:")
    public native AVExtendedNoteOnEvent initWithMIDINoteVelocityInstrumentIDGroupIDDuration(float midiNote,
            float velocity, int instrumentID, int groupID, double duration);

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
     * [@property] instrumentID
     * This should be set to AVExtendedNoteOnEventDefaultInstrument.
     */
    @Generated
    @Selector("instrumentID")
    public native int instrumentID();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] midiNote
     * The MIDI note number represented as a floating point. If the instrument within the AVMusicTrack's
     * destinationAudioUnit supports fractional values, this may be used to generate arbitrary
     * macro- and micro-tunings. Range: Destination-dependent, usually 0.0 - 127.0.
     */
    @Generated
    @Selector("midiNote")
    public native float midiNote();

    @Generated
    @Owned
    @Selector("new")
    public static native AVExtendedNoteOnEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] duration
     * The duration of this event in AVMusicTimeStamp beats. Range: Any nonnegative number.
     */
    @Generated
    @Selector("setDuration:")
    public native void setDuration(double value);

    /**
     * [@property] groupID
     * This represents the audio unit channel (i.e., Group Scope) which should handle this event.
     * Range: normally between 0 and 15, but may be higher if the AVMusicTrack's destinationAudioUnit
     * supports more channels.
     */
    @Generated
    @Selector("setGroupID:")
    public native void setGroupID(int value);

    /**
     * [@property] instrumentID
     * This should be set to AVExtendedNoteOnEventDefaultInstrument.
     */
    @Generated
    @Selector("setInstrumentID:")
    public native void setInstrumentID(int value);

    /**
     * [@property] midiNote
     * The MIDI note number represented as a floating point. If the instrument within the AVMusicTrack's
     * destinationAudioUnit supports fractional values, this may be used to generate arbitrary
     * macro- and micro-tunings. Range: Destination-dependent, usually 0.0 - 127.0.
     */
    @Generated
    @Selector("setMidiNote:")
    public native void setMidiNote(float value);

    /**
     * [@property] velocity
     * The MIDI velocity represented as a floating point. If the instrument within the AVMusicTrack's
     * destinationAudioUnit supports fractional values, this may be used to generate very precise changes
     * in gain, etc. Range: Destination-dependent, usually 0.0 - 127.0.
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(float value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] velocity
     * The MIDI velocity represented as a floating point. If the instrument within the AVMusicTrack's
     * destinationAudioUnit supports fractional values, this may be used to generate very precise changes
     * in gain, etc. Range: Destination-dependent, usually 0.0 - 127.0.
     */
    @Generated
    @Selector("velocity")
    public native float velocity();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
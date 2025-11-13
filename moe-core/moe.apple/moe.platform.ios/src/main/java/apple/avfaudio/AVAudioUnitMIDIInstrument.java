package apple.avfaudio;

import apple.NSObject;
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
import apple.coremidi.struct.MIDIEventList;
import org.moe.natj.general.ann.UncertainArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Base class for MIDI instruments.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitMIDIInstrument extends AVAudioUnit {
    static {
        NatJ.register();
    }

    @Generated
    protected AVAudioUnitMIDIInstrument(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVAudioUnitMIDIInstrument alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native AVAudioUnitMIDIInstrument allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVAudioUnitMIDIInstrument init();

    /**
     * Initialize the node with the component description for an AUv2 Audio Unit.
     * 
     * - Parameter description: audio component description structure that describes the audio component of type
     * kAudioUnitType_MusicDevice
     * or kAudioUnitType_RemoteInstrument.
     * 
     * - note: To load AUv3 audio units (or any audio unit asynchronously), use the class
     * method ``AVAudioUnit/instantiateWithComponentDescription:options:completionHandler:`` instead.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitMIDIInstrument initWithAudioComponentDescription(
            @ByValue AudioComponentDescription description);

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
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @NotNull @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AVAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

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
    public static native AVAudioUnitMIDIInstrument new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sends a MIDI controller event to the instrument.
     * 
     * - Parameters:
     * - controller: a standard MIDI controller number. Range: 0 -> 127
     * - value: value for the controller. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendController:withValue:onChannel:")
    public native void sendControllerWithValueOnChannel(byte controller, byte value, byte channel);

    /**
     * Sends a MIDI event which contains one data byte to the instrument.
     * 
     * - Parameters:
     * - midiStatus: the STATUS value of the MIDI event
     * - data1: the first data byte of the MIDI event
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendMIDIEvent:data1:")
    public native void sendMIDIEventData1(byte midiStatus, byte data1);

    /**
     * Sends a MIDI event which contains two data bytes to the instrument.
     * 
     * - Parameters:
     * - midiStatus: the STATUS value of the MIDI event
     * - data1: the first data byte of the MIDI event
     * - data2: the second data byte of the MIDI event.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendMIDIEvent:data1:data2:")
    public native void sendMIDIEventData1Data2(byte midiStatus, byte data1, byte data2);

    /**
     * Sends a MIDI System Exclusive event to the instrument.
     * 
     * - Parameters:
     * - midiData: a NSData object containing the complete SysEx data including start(F0) and termination(F7) bytes.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendMIDISysExEvent:")
    public native void sendMIDISysExEvent(@NotNull NSData midiData);

    /**
     * Sends a MIDI controller event to the instrument.
     * 
     * - Parameters:
     * - controller: a standard MIDI controller number. Range: 0 -> 127
     * - value: value for the controller. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendPitchBend:onChannel:")
    public native void sendPitchBendOnChannel(char pitchbend, byte channel);

    /**
     * Sends MIDI channel pressure event to the instrument.
     * 
     * - Parameters:
     * - pressure: value of the pressure. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendPressure:onChannel:")
    public native void sendPressureOnChannel(byte pressure, byte channel);

    /**
     * Sends MIDI Polyphonic key pressure event to the instrument
     * 
     * - Parameters:
     * - key: the key (note) number to which the pressure event applies. Range: 0 -> 127
     * - value: value of the pressure. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15so
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendPressureForKey:withValue:onChannel:")
    public native void sendPressureForKeyWithValueOnChannel(byte key, byte value, byte channel);

    /**
     * Sends a MIDI Program Change and Bank Select events to the instrument
     * 
     * - Parameters:
     * - program: specifies the program (preset) number within the bank to load. Range: 0 -> 127
     * - bankMSB: specifies the most significant byte value for the bank to select. Range: 0 -> 127
     * - bankLSB: specifies the least significant byte value for the bank to select. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendProgramChange:bankMSB:bankLSB:onChannel:")
    public native void sendProgramChangeBankMSBBankLSBOnChannel(byte program, byte bankMSB, byte bankLSB, byte channel);

    /**
     * Sends MIDI Program Change event to the instrument
     * 
     * The instrument will be loaded from the bank that has been previous set by MIDI Bank Select
     * controller messages (0 and 31). If none has been set, bank 0 will be used.
     * - Parameters:
     * - program: the program number. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("sendProgramChange:onChannel:")
    public native void sendProgramChangeOnChannel(byte program, byte channel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Sends a MIDI Note On event to the instrument
     * 
     * - Parameters:
     * - note: the note number (key) to play. Range: 0 -> 127
     * - velocity: specifies the volume with which the note is played. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("startNote:withVelocity:onChannel:")
    public native void startNoteWithVelocityOnChannel(byte note, byte velocity, byte channel);

    /**
     * Sends a MIDI Note Off event to the instrument
     * 
     * - Parameters:
     * - note: the note number (key) to stop. Range: 0 -> 127
     * - channel: the channel number to which the event is sent. Range: 0 -> 15
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("stopNote:onChannel:")
    public native void stopNoteOnChannel(byte note, byte channel);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Sends a MIDI event list to the instrument.
     * 
     * - Parameters:
     * - eventList: the MIDIEventList
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("sendMIDIEventList:")
    public native void sendMIDIEventList(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIEventList eventList);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

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
import apple.audiotoolbox.struct.AudioComponentDescription;
import apple.avfoundation.protocol.AVAudioMixing;
import apple.avfoundation.struct.AVAudio3DPoint;
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
import org.moe.natj.general.ann.MappedReturn;
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

/**
 * AVAudioUnitMIDIInstrument
 * 
 * Base class for sample synthesizers.
 * 
 *    This base class represents audio units of type kAudioUnitType_MusicDevice or kAudioUnitType_RemoteInstrument. This can be used in a chain
 *    that processes realtime input (live) and has general concept of music events i.e. notes.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVAudioUnitMIDIInstrument extends AVAudioUnit implements AVAudioMixing {
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
    @Selector("instantiateWithComponentDescription:options:completionHandler:")
    public static native void instantiateWithComponentDescriptionOptionsCompletionHandler(
            @ByValue AudioComponentDescription audioComponentDescription, int options,
            @ObjCBlock(name = "call_instantiateWithComponentDescriptionOptionsCompletionHandler") AVAudioUnit.Block_instantiateWithComponentDescriptionOptionsCompletionHandler completionHandler);

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

    @Generated
    @Selector("destinationForMixer:bus:")
    public native AVAudioMixingDestination destinationForMixerBus(AVAudioNode mixer, @NUInt long bus);

    @Generated
    @Selector("init")
    public native AVAudioUnitMIDIInstrument init();

    /**
     * initWithAudioComponentDescription:
     * 
     * initialize the node with the component description
     * 
     * @param description
     *    audio component description structure that describes the audio component of type kAudioUnitType_MusicDevice
     *    or kAudioUnitType_RemoteInstrument.
     */
    @Generated
    @Selector("initWithAudioComponentDescription:")
    public native AVAudioUnitMIDIInstrument initWithAudioComponentDescription(
            @ByValue AudioComponentDescription description);

    @Generated
    @Selector("obstruction")
    public native float obstruction();

    @Generated
    @Selector("occlusion")
    public native float occlusion();

    @Generated
    @Selector("pan")
    public native float pan();

    @Generated
    @Selector("position")
    @ByValue
    public native AVAudio3DPoint position();

    @Generated
    @Selector("rate")
    public native float rate();

    @Generated
    @Selector("renderingAlgorithm")
    @NInt
    public native long renderingAlgorithm();

    @Generated
    @Selector("reverbBlend")
    public native float reverbBlend();

    /**
     * sendController:withValue:onChannel:
     * 
     * send a MIDI controller event to the instrument.
     * 
     * @param controller
     *    a standard MIDI controller number. 
     *    Range: 0 -> 127
     * @param  value
     *    value for the controller. 
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendController:withValue:onChannel:")
    public native void sendControllerWithValueOnChannel(byte controller, byte value, byte channel);

    /**
     * sendMIDIEvent:data1:
     * 
     * sends a MIDI event which contains one data byte to the instrument.
     * 
     * @param midiStatus
     *    the STATUS value of the MIDI event
     * @param data1
     *    the first data byte of the MIDI event
     */
    @Generated
    @Selector("sendMIDIEvent:data1:")
    public native void sendMIDIEventData1(byte midiStatus, byte data1);

    /**
     * sendMIDIEvent:data1:data2:
     * 
     * sends a MIDI event which contains two data bytes to the instrument.
     * 
     * @param midiStatus
     *    the STATUS value of the MIDI event
     * @param data1
     *    the first data byte of the MIDI event
     * @param data2
     *    the second data byte of the MIDI event.
     */
    @Generated
    @Selector("sendMIDIEvent:data1:data2:")
    public native void sendMIDIEventData1Data2(byte midiStatus, byte data1, byte data2);

    /**
     * sendMIDISysExEvent:
     * 
     * sends a MIDI System Exclusive event to the instrument.
     * 
     * @param midiData
     *    a NSData object containing the complete SysEx data including start(F0) and termination(F7) bytes.
     */
    @Generated
    @Selector("sendMIDISysExEvent:")
    public native void sendMIDISysExEvent(NSData midiData);

    /**
     * sendPitchBend:onChannel:
     * 
     * sends MIDI Pitch Bend event to the instrument.
     * 
     * @param pitchbend
     *    value of the pitchbend
     *    Range: 0 -> 16383
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendPitchBend:onChannel:")
    public native void sendPitchBendOnChannel(char pitchbend, byte channel);

    /**
     * sendPressure:onChannel:
     * 
     * sends MIDI channel pressure event to the instrument.
     * 
     * @param pressure 
     *    value of the pressure.
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendPressure:onChannel:")
    public native void sendPressureOnChannel(byte pressure, byte channel);

    /**
     * sendPressureForKey:withValue:onChannel:
     * 
     * sends MIDI Polyphonic key pressure event to the instrument
     * 
     * @param key
     *    the key (note) number to which the pressure event applies
     *    Range: 0 -> 127
     * @param value
     *    value of the pressure
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendPressureForKey:withValue:onChannel:")
    public native void sendPressureForKeyWithValueOnChannel(byte key, byte value, byte channel);

    /**
     * sendProgramChange:bankMSB:bankLSB:onChannel:
     * 
     * sends a MIDI Program Change and Bank Select events to the instrument
     * 
     * @param program
     *    specifies the program (preset) number within the bank to load.
     *    Range: 0 -> 127
     * @param bankMSB
     *    specifies the most significant byte value for the bank to select.
     *    Range: 0 -> 127
     * @param bankLSB
     *    specifies the least significant byte value for the bank to select.
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendProgramChange:bankMSB:bankLSB:onChannel:")
    public native void sendProgramChangeBankMSBBankLSBOnChannel(byte program, byte bankMSB, byte bankLSB, byte channel);

    /**
     * sendProgramChange:onChannel:
     * 
     * sends MIDI Program Change event to the instrument
     * 
     *    the instrument will be loaded from the bank that has been previous set by MIDI Bank Select
     *    controller messages (0 and 31). If none has been set, bank 0 will be used. 
     * 
     * @param program
     *    the program number.
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("sendProgramChange:onChannel:")
    public native void sendProgramChangeOnChannel(byte program, byte channel);

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
    @Selector("setVolume:")
    public native void setVolume(float value);

    /**
     * startNote:withVelocity:onChannel:
     * 
     * sends a MIDI Note On event to the instrument
     * 
     * @param note
     *    the note number (key) to play.
     *    Range: 0 -> 127
     * @param velocity
     *    specifies the volume with which the note is played.
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent
     * Range: 0 -> 15
     */
    @Generated
    @Selector("startNote:withVelocity:onChannel:")
    public native void startNoteWithVelocityOnChannel(byte note, byte velocity, byte channel);

    /**
     * stopNote:onChannel:
     * 
     * sends a MIDI Note Off event to the instrument
     * 
     * @param note
     *    the note number (key) to stop
     *    Range: 0 -> 127
     * @param channel
     *    the channel number to which the event is sent.
     * Range: 0 -> 15
     */
    @Generated
    @Selector("stopNote:onChannel:")
    public native void stopNoteOnChannel(byte note, byte channel);

    @Generated
    @Selector("volume")
    public native float volume();

    @Generated
    @Selector("pointSourceInHeadMode")
    @NInt
    public native long pointSourceInHeadMode();

    @Generated
    @Selector("setPointSourceInHeadMode:")
    public native void setPointSourceInHeadMode(@NInt long value);

    @Generated
    @Selector("setSourceMode:")
    public native void setSourceMode(@NInt long value);

    @Generated
    @Selector("sourceMode")
    @NInt
    public native long sourceMode();
}

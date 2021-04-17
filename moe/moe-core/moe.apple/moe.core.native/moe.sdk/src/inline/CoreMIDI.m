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
#import <CoreMIDI/MIDIMessages.h>
#import <CoreMIDI/MIDIServices.h>
#import <CoreMIDI/MIDIThruConnection.h>
#import <MacTypes.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

EXPORT MIDIEventPacket * _Nonnull __natj_inline_MIDIEventPacketNext(const MIDIEventPacket * _Nonnull pkt) {
	return MIDIEventPacketNext(pkt);
}

EXPORT MIDIPacket * _Nonnull __natj_inline_MIDIPacketNext(const MIDIPacket * _Nonnull pkt) {
	return MIDIPacketNext(pkt);
}

EXPORT size_t __natj_inline_MIDIThruConnectionParamsSize(const MIDIThruConnectionParams * _Nonnull ptr) {
	return MIDIThruConnectionParamsSize(ptr);
}

EXPORT MIDIMessageType __natj_inline_MIDIMessageTypeForUPWord(const UInt32 word) {
	return MIDIMessageTypeForUPWord(word);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPChannelVoiceMessage(UInt8 group, UInt8 status, UInt8 channel, UInt8 data1, UInt8 data2) {
	return MIDI1UPChannelVoiceMessage(group, status, channel, data1, data2);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPNoteOff(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 velocity) {
	return MIDI1UPNoteOff(group, channel, noteNumber, velocity);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPNoteOn(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 velocity) {
	return MIDI1UPNoteOn(group, channel, noteNumber, velocity);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPControlChange(UInt8 group, UInt8 channel, UInt8 index, UInt8 data) {
	return MIDI1UPControlChange(group, channel, index, data);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPPitchBend(UInt8 group, UInt8 channel, UInt8 lsb, UInt8 msb) {
	return MIDI1UPPitchBend(group, channel, lsb, msb);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPSystemCommon(UInt8 group, UInt8 status, UInt8 byte1, UInt8 byte2) {
	return MIDI1UPSystemCommon(group, status, byte1, byte2);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2ChannelVoiceMessage(UInt8 group, UInt8 status, UInt8 channel, UInt16 index, UInt32 value) {
	return MIDI2ChannelVoiceMessage(group, status, channel, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2NoteOn(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 attributeType, UInt16 attributeData, UInt16 velocity) {
	return MIDI2NoteOn(group, channel, noteNumber, attributeType, attributeData, velocity);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2NoteOff(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 attributeType, UInt16 attributeData, UInt16 velocity) {
	return MIDI2NoteOff(group, channel, noteNumber, attributeType, attributeData, velocity);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2PolyPressure(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt32 value) {
	return MIDI2PolyPressure(group, channel, noteNumber, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2RegisteredPNC(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 index, UInt32 value) {
	return MIDI2RegisteredPNC(group, channel, noteNumber, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2AssignablePNC(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 index, UInt32 value) {
	return MIDI2AssignablePNC(group, channel, noteNumber, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2PerNoteManagment(UInt8 group, UInt8 channel, UInt8 noteNumber, _Bool detachPNCs, _Bool resetPNCsToDefault) {
	return MIDI2PerNoteManagment(group, channel, noteNumber, detachPNCs, resetPNCsToDefault);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2ControlChange(UInt8 group, UInt8 channel, UInt8 index, UInt32 value) {
	return MIDI2ControlChange(group, channel, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2RegisteredControl(UInt8 group, UInt8 channel, UInt8 bank, UInt8 index, UInt32 value) {
	return MIDI2RegisteredControl(group, channel, bank, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2AssignableControl(UInt8 group, UInt8 channel, UInt8 bank, UInt8 index, UInt32 value) {
	return MIDI2AssignableControl(group, channel, bank, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2RelRegisteredControl(UInt8 group, UInt8 channel, UInt8 bank, UInt8 index, UInt32 value) {
	return MIDI2RelRegisteredControl(group, channel, bank, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2RelAssignableControl(UInt8 group, UInt8 channel, UInt8 bank, UInt8 index, UInt32 value) {
	return MIDI2RelAssignableControl(group, channel, bank, index, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2ProgramChange(UInt8 group, UInt8 channel, _Bool bankIsValid, UInt8 program, UInt8 bank_msb, UInt8 bank_lsb) {
	return MIDI2ProgramChange(group, channel, bankIsValid, program, bank_msb, bank_lsb);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2ChannelPressure(UInt8 group, UInt8 channel, UInt32 value) {
	return MIDI2ChannelPressure(group, channel, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2PitchBend(UInt8 group, UInt8 channel, UInt32 value) {
	return MIDI2PitchBend(group, channel, value);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI2PerNotePitchBend(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt32 value) {
	return MIDI2PerNotePitchBend(group, channel, noteNumber, value);
}



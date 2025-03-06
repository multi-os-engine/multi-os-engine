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


#define EXPORT __attribute__ ((visibility ("default")))

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

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPPolyPressure(UInt8 group, UInt8 channel, UInt8 noteNumber, UInt8 pressure) {
	return MIDI1UPPolyPressure(group, channel, noteNumber, pressure);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPControlChange(UInt8 group, UInt8 channel, UInt8 index, UInt8 data) {
	return MIDI1UPControlChange(group, channel, index, data);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPProgramChange(UInt8 group, UInt8 channel, UInt8 program) {
	return MIDI1UPProgramChange(group, channel, program);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPChannelPressure(UInt8 group, UInt8 channel, UInt8 value) {
	return MIDI1UPChannelPressure(group, channel, value);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPPitchBend(UInt8 group, UInt8 channel, UInt8 lsb, UInt8 msb) {
	return MIDI1UPPitchBend(group, channel, lsb, msb);
}

EXPORT MIDIMessage_32 __natj_inline_MIDI1UPSystemCommon(UInt8 group, UInt8 status, UInt8 byte1, UInt8 byte2) {
	return MIDI1UPSystemCommon(group, status, byte1, byte2);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI1UPSysEx(UInt8 group, UInt8 status, UInt8 bytesUsed, UInt8 byte1, UInt8 byte2, UInt8 byte3, UInt8 byte4, UInt8 byte5, UInt8 byte6) {
	return MIDI1UPSysEx(group, status, bytesUsed, byte1, byte2, byte3, byte4, byte5, byte6);
}

EXPORT MIDIMessage_64 __natj_inline_MIDI1UPSysExArray(UInt8 group, UInt8 status, const Byte * begin, const Byte * end) {
	return MIDI1UPSysExArray(group, status, begin, end);
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

EXPORT MIDIMessage_128 __natj_inline_MIDI2StreamMessage(UMPStreamMessageFormat format, UMPStreamMessageStatus status, UInt16 data1, UInt32 data2, UInt32 data3, UInt32 data4) {
	return MIDI2StreamMessage(format, status, data1, data2, data3, data4);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2StreamMessageFromData(UMPStreamMessageFormat format, UMPStreamMessageStatus status, const Byte * data, const size_t length) {
	return MIDI2StreamMessageFromData(format, status, data, length);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndpointDiscoveryMessage(UInt8 versionMajor, UInt8 versionMinor, _Bool endpointInfoRequest, _Bool deviceIdentityRequest, _Bool endpointNameRequest, _Bool productInstanceIDRequest, _Bool streamConfigurationRequest) {
	return MIDI2EndpointDiscoveryMessage(versionMajor, versionMinor, endpointInfoRequest, deviceIdentityRequest, endpointNameRequest, productInstanceIDRequest, streamConfigurationRequest);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndpointInfoNotificationMessage(UInt8 versionMajor, UInt8 versionMinor, _Bool staticFunctionBlocks, UInt8 numberOfFunctionBlocks, _Bool m1, _Bool m2, _Bool receiveJRTimestamp, _Bool transmitJRTimestamp) {
	return MIDI2EndpointInfoNotificationMessage(versionMajor, versionMinor, staticFunctionBlocks, numberOfFunctionBlocks, m1, m2, receiveJRTimestamp, transmitJRTimestamp);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndpointDeviceIdentityNotificationMessage(MIDIUInteger7 deviceManufacturer1, MIDIUInteger7 deviceManufacturer2, MIDIUInteger7 deviceManufacturer3, MIDIUInteger14 deviceFamily, MIDIUInteger14 deviceFamilyModel, MIDIUInteger28 revisionLevel) {
	return MIDI2EndpointDeviceIdentityNotificationMessage(deviceManufacturer1, deviceManufacturer2, deviceManufacturer3, deviceFamily, deviceFamilyModel, revisionLevel);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndpointNameNotificationMessage(UMPStreamMessageFormat format, const char * data, const size_t length) {
	return MIDI2EndpointNameNotificationMessage(format, data, length);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndpointProductInstanceIDNotificationMessage(UMPStreamMessageFormat format, const char * data, const size_t length) {
	return MIDI2EndpointProductInstanceIDNotificationMessage(format, data, length);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2StreamConfigurationRequestMessage(UInt8 protocol, _Bool receiveJRTimestamp, _Bool transmitJRTimestamp) {
	return MIDI2StreamConfigurationRequestMessage(protocol, receiveJRTimestamp, transmitJRTimestamp);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2StreamConfigurationNotificationMessage(UInt8 protocol, _Bool receiveJRTimestamp, _Bool transmitJRTimestamp) {
	return MIDI2StreamConfigurationNotificationMessage(protocol, receiveJRTimestamp, transmitJRTimestamp);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2FunctionBlockDiscoveryMessage(UInt8 functionBlockNumber, _Bool infoRequest, _Bool nameRequest) {
	return MIDI2FunctionBlockDiscoveryMessage(functionBlockNumber, infoRequest, nameRequest);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2FunctionBlockInfoNotificationMessage(_Bool active, MIDIUInteger7 blockNumber, MIDIUMPFunctionBlockUIHint UIHint, MIDIUMPFunctionBlockMIDI1Info MIDI1, MIDIUMPFunctionBlockDirection direction, UInt8 firstGroup, UInt8 numberOfGroupsSpanned, UInt8 CIVersion, UInt8 maxSysex8Streams) {
	return MIDI2FunctionBlockInfoNotificationMessage(active, blockNumber, UIHint, MIDI1, direction, firstGroup, numberOfGroupsSpanned, CIVersion, maxSysex8Streams);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2FunctionBlockNameNotificationMessage(UMPStreamMessageFormat format, UInt8 blockNumber, const char * data, size_t length) {
	return MIDI2FunctionBlockNameNotificationMessage(format, blockNumber, data, length);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2StartOfClipMessage() {
	return MIDI2StartOfClipMessage();
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2EndOfClipMessage() {
	return MIDI2EndOfClipMessage();
}

EXPORT MIDIMessage_32 __natj_inline_MIDINoOpMessage() {
	return MIDINoOpMessage();
}

EXPORT MIDIMessage_32 __natj_inline_MIDIJitterReductionClockMessage(UInt16 senderClockTime) {
	return MIDIJitterReductionClockMessage(senderClockTime);
}

EXPORT MIDIMessage_32 __natj_inline_MIDIJitterReductionTimestampMessage(UInt16 senderClockTimestamp) {
	return MIDIJitterReductionTimestampMessage(senderClockTimestamp);
}

EXPORT MIDIMessage_32 __natj_inline_MIDIDeltaClockstampTicksPerQuarterNoteMessage(UInt16 ticksPerQuarterNote) {
	return MIDIDeltaClockstampTicksPerQuarterNoteMessage(ticksPerQuarterNote);
}

EXPORT MIDIMessage_32 __natj_inline_MIDITicksSinceLastEventMessage(UInt32 ticksSinceLastEvent) {
	return MIDITicksSinceLastEventMessage(ticksSinceLastEvent);
}

EXPORT MIDIMessage_128 __natj_inline_MIDI2FlexDataMessage(MIDIUInteger4 group, MIDIUInteger2 format, MIDIUInteger2 address, MIDIUInteger4 channel, UInt8 statusBank, UInt8 status, UInt32 data1, UInt32 data2, UInt32 data3) {
	return MIDI2FlexDataMessage(group, format, address, channel, statusBank, status, data1, data2, data3);
}



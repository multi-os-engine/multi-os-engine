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

#import <CoreMIDI/MIDIServices.h>
#import <CoreMIDI/MIDIThruConnection.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT MIDIPacket * _Nonnull __natj_inline_MIDIPacketNext(const MIDIPacket * _Nonnull pkt) {
	return MIDIPacketNext(pkt);
}

EXPORT size_t __natj_inline_MIDIThruConnectionParamsSize(const MIDIThruConnectionParams * _Nonnull ptr) {
	return MIDIThruConnectionParamsSize(ptr);
}



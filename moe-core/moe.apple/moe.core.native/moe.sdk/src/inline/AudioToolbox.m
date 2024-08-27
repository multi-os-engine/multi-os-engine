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

#import <AudioToolbox/AudioFile.h>
#import <AudioToolbox/AudioUnitProperties.h>
#import <AudioToolbox/MusicPlayer.h>
#import <MacTypes.h>
#import <sys/_types/_size_t.h>


#define EXPORT __attribute__ ((visibility ("default")))

EXPORT AudioUnitParameterOptions __natj_inline_GetAudioUnitParameterDisplayType(AudioUnitParameterOptions flags) {
	return GetAudioUnitParameterDisplayType(flags);
}

EXPORT AudioUnitParameterOptions __natj_inline_SetAudioUnitParameterDisplayType(AudioUnitParameterOptions flags, AudioUnitParameterOptions displayType) {
	return SetAudioUnitParameterDisplayType(flags, displayType);
}

EXPORT size_t __natj_inline_NumBytesToNumAudioFileMarkers(size_t inNumBytes) {
	return NumBytesToNumAudioFileMarkers(inNumBytes);
}

EXPORT size_t __natj_inline_NumAudioFileMarkersToNumBytes(size_t inNumMarkers) {
	return NumAudioFileMarkersToNumBytes(inNumMarkers);
}

EXPORT AudioFileRegion * _Nonnull __natj_inline_NextAudioFileRegion(const AudioFileRegion * _Nonnull inAFRegionPtr) {
	return NextAudioFileRegion(inAFRegionPtr);
}

EXPORT SInt16 __natj_inline_MusicSequenceSetSMPTEResolution(SignedByte fps, Byte ticks) {
	return MusicSequenceSetSMPTEResolution(fps, ticks);
}

EXPORT void __natj_inline_MusicSequenceGetSMPTEResolution(SInt16 inRes, SignedByte * _Nonnull fps, Byte * _Nonnull ticks) {
	MusicSequenceGetSMPTEResolution(inRes, fps, ticks);
}



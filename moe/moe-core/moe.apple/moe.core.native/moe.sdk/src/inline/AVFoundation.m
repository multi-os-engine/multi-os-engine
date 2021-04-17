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

#import <AVFoundation/AVFoundation.h>


#define EXPORT extern __attribute__ ((visibility ("default")))

EXPORT AVAudio3DPoint __natj_inline_AVAudioMake3DPoint(float x, float y, float z) {
	return AVAudioMake3DPoint(x, y, z);
}

EXPORT AVAudio3DVector __natj_inline_AVAudioMake3DVector(float x, float y, float z) {
	return AVAudioMake3DVector(x, y, z);
}

EXPORT AVAudio3DVectorOrientation __natj_inline_AVAudioMake3DVectorOrientation(AVAudio3DVector forward, AVAudio3DVector up) {
	return AVAudioMake3DVectorOrientation(forward, up);
}

EXPORT AVAudio3DAngularOrientation __natj_inline_AVAudioMake3DAngularOrientation(float yaw, float pitch, float roll) {
	return AVAudioMake3DAngularOrientation(yaw, pitch, roll);
}

EXPORT AVBeatRange __natj_inline_AVMakeBeatRange(AVMusicTimeStamp startBeat, AVMusicTimeStamp lengthInBeats) {
	return AVMakeBeatRange(startBeat, lengthInBeats);
}



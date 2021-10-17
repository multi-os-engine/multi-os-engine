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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]		 AudioComponentValidationResult
 * <p>
 * Constants for describing the result of validating an AudioComponent
 * [@constant]	 kAudioComponentValidationResult_Passed
 * The AudioComponent passed validation.
 * [@constant]	 kAudioComponentValidationResult_Failed
 * The AudioComponent failed validation.
 * [@constant]	 kAudioComponentValidationResult_TimedOut
 * The validation operation timed out before completing.
 * [@constant]	 kAudioComponentValidationResult_UnauthorizedError_Open
 * The AudioComponent failed validation during open operation as it is not authorized.
 * [@constant]	 kAudioComponentValidationResult_UnauthorizedError_Init
 * The AudioComponent failed validation during initialization as it is not authorized.
 */
@Generated
public final class AudioComponentValidationResult {
    @Generated public static final int Unknown = 0x00000000;
    @Generated public static final int Passed = 0x00000001;
    @Generated public static final int Failed = 0x00000002;
    @Generated public static final int TimedOut = 0x00000003;
    @Generated public static final int UnauthorizedError_Open = 0x00000004;
    @Generated public static final int UnauthorizedError_Init = 0x00000005;

    @Generated
    private AudioComponentValidationResult() {
    }
}

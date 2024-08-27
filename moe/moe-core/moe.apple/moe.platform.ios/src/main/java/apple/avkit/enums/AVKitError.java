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

package apple.avkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@constant] AVKitErrorUnknown
 * Unknown error.
 * [@constant] AVKitErrorPictureInPictureStartFailed
 * Failed to start Picture in Picture.
 * 
 * [@constant] AVKitErrorContentRatingUnknown
 * Media content rating missing or unrecognized.
 * [@constant] AVKitErrorContentDisallowedByPasscode
 * Restriction settings disallow access to this content, but the user can override by entering the passcode.
 * [@constant] AVKitErrorContentDisallowedByProfile
 * An installed profile sets restriction settings that disallow access to this content; the user cannot override by
 * entering the passcode (they may be able to override in Settings).
 * 
 * [@constant] AVKitErrorRecordingFailed
 * The recording failed.
 * 
 * API-Since: 9.0
 */
@Generated
public final class AVKitError {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFC18L;
    @Generated @NInt public static final long PictureInPictureStartFailed = 0xFFFFFFFFFFFFFC17L;

    @Generated
    private AVKitError() {
    }
}

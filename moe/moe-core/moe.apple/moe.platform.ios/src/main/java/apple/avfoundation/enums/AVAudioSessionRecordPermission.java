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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @enum AVAudioSessionRecordPermission
 * @brief	These are the values returned by recordPermission.
 * @var	AVAudioSessionRecordPermissionUndetermined
 * The user has not yet been asked for permission.
 * @var	AVAudioSessionRecordPermissionDenied
 * The user has been asked and has denied permission.
 * @var	AVAudioSessionRecordPermissionGranted
 * The user has been asked and has granted permission.
 * 
 * Introduced: ios(8.0), watchos(4.0)
 */
@Generated
public final class AVAudioSessionRecordPermission {
    @Generated @NUInt public static final long Undetermined = 0x00000000756E6474L;
    @Generated @NUInt public static final long Denied = 0x0000000064656E79L;
    @Generated @NUInt public static final long Granted = 0x0000000067726E74L;

    @Generated
    private AVAudioSessionRecordPermission() {
    }
}

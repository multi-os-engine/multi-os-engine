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

package apple.replaykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class RPRecordingErrorCode {
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFE958L;
    @Generated @NInt public static final long UserDeclined = 0xFFFFFFFFFFFFE957L;
    @Generated @NInt public static final long Disabled = 0xFFFFFFFFFFFFE956L;
    @Generated @NInt public static final long FailedToStart = 0xFFFFFFFFFFFFE955L;
    @Generated @NInt public static final long Failed = 0xFFFFFFFFFFFFE954L;
    @Generated @NInt public static final long InsufficientStorage = 0xFFFFFFFFFFFFE953L;
    @Generated @NInt public static final long Interrupted = 0xFFFFFFFFFFFFE952L;
    @Generated @NInt public static final long ContentResize = 0xFFFFFFFFFFFFE951L;
    @Generated @NInt public static final long BroadcastInvalidSession = 0xFFFFFFFFFFFFE950L;
    @Generated @NInt public static final long SystemDormancy = 0xFFFFFFFFFFFFE94FL;

    @Generated
    private RPRecordingErrorCode() {
    }

    @Generated @NInt public static final long Entitlements = 0xFFFFFFFFFFFFE94EL;
    @Generated @NInt public static final long ActivePhoneCall = 0xFFFFFFFFFFFFE94DL;
    @Generated @NInt public static final long FailedToSave = 0xFFFFFFFFFFFFE94CL;
    @Generated @NInt public static final long CarPlay = 0xFFFFFFFFFFFFE94BL;
}

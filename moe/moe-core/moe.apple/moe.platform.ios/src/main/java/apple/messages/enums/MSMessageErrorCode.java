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

package apple.messages.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class MSMessageErrorCode {
    @Generated @NInt public static final long FileNotFound = 0x0000000000000001L;
    @Generated @NInt public static final long FileUnreadable = 0x0000000000000002L;
    @Generated @NInt public static final long ImproperFileType = 0x0000000000000003L;
    @Generated @NInt public static final long ImproperFileURL = 0x0000000000000004L;
    @Generated @NInt public static final long StickerFileImproperFileAttributes = 0x0000000000000005L;
    @Generated @NInt public static final long StickerFileImproperFileSize = 0x0000000000000006L;
    @Generated @NInt public static final long StickerFileImproperFileFormat = 0x0000000000000007L;
    @Generated @NInt public static final long URLExceedsMaxSize = 0x0000000000000008L;

    @Generated
    private MSMessageErrorCode() {
    }

    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
    @Generated @NInt public static final long SendWithoutRecentInteraction = 0x0000000000000009L;
    @Generated @NInt public static final long SendWhileNotVisible = 0x000000000000000AL;
}

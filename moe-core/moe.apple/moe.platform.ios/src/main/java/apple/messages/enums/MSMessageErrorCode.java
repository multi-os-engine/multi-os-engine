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

/**
 * API-Since: 10.0
 */
@Generated
public final class MSMessageErrorCode {
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FileNotFound = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FileUnreadable = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImproperFileType = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ImproperFileURL = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long StickerFileImproperFileAttributes = 0x0000000000000005L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long StickerFileImproperFileSize = 0x0000000000000006L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long StickerFileImproperFileFormat = 0x0000000000000007L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long URLExceedsMaxSize = 0x0000000000000008L;

    @Generated
    private MSMessageErrorCode() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long Unknown = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SendWithoutRecentInteraction = 0x0000000000000009L;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SendWhileNotVisible = 0x000000000000000AL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long APIUnavailableInPresentationContext = 0x000000000000000BL;
}

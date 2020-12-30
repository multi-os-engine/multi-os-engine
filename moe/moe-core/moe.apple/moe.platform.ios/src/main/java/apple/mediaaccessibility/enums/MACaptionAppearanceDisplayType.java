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

package apple.mediaaccessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum MACaptionAppearanceDisplayType
 * 
 * @discussion
 * MACaptionAppearanceDisplayType is used to specify the the type of captions that should be displayed
 * 
 * @constant kMACaptionAppearanceDisplayTypeForcedOnly
 *    Only forced captions for translation should be displayed.
 * @constant kMACaptionAppearanceDisplayTypeAutomatic
 *    If the language of the audio track differs from the system locale then captions matching the system locale should be displayed (if available).
 * @constant kMACaptionAppearanceDisplayTypeAlwaysOn
 *    The best available captioning track should always be displayed, whether it be CC, SDH, or subtitles.
 */
@Generated
public final class MACaptionAppearanceDisplayType {
    @Generated @NInt public static final long ForcedOnly = 0x0000000000000000L;
    @Generated @NInt public static final long Automatic = 0x0000000000000001L;
    @Generated @NInt public static final long AlwaysOn = 0x0000000000000002L;

    @Generated
    private MACaptionAppearanceDisplayType() {
    }
}

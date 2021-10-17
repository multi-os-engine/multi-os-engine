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
 * [@enum] MACaptionAppearanceFontStyle
 * <p>
 * MACaptionAppearanceFontStyle is used to specify a font style
 * <p>
 * [@constant] kMACaptionAppearanceFontStyleDefault
 * Default font style.
 * [@constant] kMACaptionAppearanceFontStyleMonospacedWithSerif
 * Font style for fonts similar to Courier.
 * [@constant] kMACaptionAppearanceFontStyleProportionalWithSerif
 * Font style for fonts similar to Times New Roman.
 * [@constant] kMACaptionAppearanceFontStyleMonospacedWithoutSerif
 * Font style for fonts similar to Helvetica Monospaced.
 * [@constant] kMACaptionAppearanceFontStyleProportionalWithoutSerif
 * Font style for fonts similar to Arial.
 * [@constant] kMACaptionAppearanceFontStyleCasual
 * Font style for fonts similar to Dom and Impress.
 * [@constant] kMACaptionAppearanceFontStyleCursive
 * Font style for fonts similar to Coronet and Marigold.
 * [@constant] kMACaptionAppearanceFontStyleSmallCapital
 * Font style for fonts similar to Engravers Gothic.
 */
@Generated
public final class MACaptionAppearanceFontStyle {
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    @Generated @NInt public static final long MonospacedWithSerif = 0x0000000000000001L;
    @Generated @NInt public static final long ProportionalWithSerif = 0x0000000000000002L;
    @Generated @NInt public static final long MonospacedWithoutSerif = 0x0000000000000003L;
    @Generated @NInt public static final long ProportionalWithoutSerif = 0x0000000000000004L;
    @Generated @NInt public static final long Casual = 0x0000000000000005L;
    @Generated @NInt public static final long Cursive = 0x0000000000000006L;
    @Generated @NInt public static final long SmallCapital = 0x0000000000000007L;

    @Generated
    private MACaptionAppearanceFontStyle() {
    }
}

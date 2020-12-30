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

package apple.coremedia.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum CMTimeRoundingMethod
 * @abstract Rounding method to use when computing time.value during timescale conversions.
 * @constant	kCMTimeRoundingMethod_RoundHalfAwayFromZero	Round towards zero if abs(fraction) is < 0.5,
 * 															away from 0 if abs(fraction) is >= 0.5.
 * @constant	kCMTimeRoundingMethod_Default					Synonym for kCMTimeRoundingMethod_RoundHalfAwayFromZero.
 * @constant	kCMTimeRoundingMethod_RoundTowardZero			Round towards zero if fraction is != 0.
 * @constant	kCMTimeRoundingMethod_RoundAwayFromZero		Round away from zero if abs(fraction) is > 0.
 * @constant	kCMTimeRoundingMethod_QuickTime				Use kCMTimeRoundingMethod_RoundTowardZero if converting
 * 															from larger to smaller scale (ie. from more precision to
 * 															less precision), but use
 * 															kCMTimeRoundingMethod_RoundAwayFromZero if converting
 * 															from smaller to larger scale (ie. from less precision to
 * 															more precision). Also, never round a negative number down
 * 															to 0; always return the smallest magnitude negative
 * 															CMTime in this case (-1/newTimescale).
 * @constant	kCMTimeRoundingMethod_RoundTowardPositiveInfinity	Round towards +inf if fraction is != 0.
 * @constant	kCMTimeRoundingMethod_RoundTowardNegativeInfinity	Round towards -inf if fraction is != 0.
 */
@Generated
public final class CMTimeRoundingMethod {
    @Generated public static final int RoundHalfAwayFromZero = 0x00000001;
    @Generated public static final int RoundTowardZero = 0x00000002;
    @Generated public static final int RoundAwayFromZero = 0x00000003;
    @Generated public static final int QuickTime = 0x00000004;
    @Generated public static final int RoundTowardPositiveInfinity = 0x00000005;
    @Generated public static final int RoundTowardNegativeInfinity = 0x00000006;
    @Generated public static final int Default = 0x00000001;

    @Generated
    private CMTimeRoundingMethod() {
    }
}

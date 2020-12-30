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
 * @enum		CMTimeFlags
 * @abstract	Flag bits for a CMTime.
 * @constant	kCMTimeFlags_Valid Must be set, or the CMTime is considered invalid.
 * 								Allows simple clearing (eg. with calloc or memset) for initialization
 * 								of arrays of CMTime structs to "invalid". This flag must be set, even
 * 								if other flags are set as well.
 * @constant	kCMTimeFlags_HasBeenRounded Set whenever a CMTime value is rounded, or is derived from another rounded CMTime.													
 * @constant	kCMTimeFlags_PositiveInfinity Set if the CMTime is +inf.	"Implied value" flag (other struct fields are ignored).													
 * @constant	kCMTimeFlags_NegativeInfinity Set if the CMTime is -inf.	"Implied value" flag (other struct fields are ignored).														
 * @constant	kCMTimeFlags_Indefinite Set if the CMTime is indefinite/unknown. Example of usage: duration of a live broadcast.
 * 									 "Implied value" flag (other struct fields are ignored).
 */
@Generated
public final class CMTimeFlags {
    @Generated public static final int Valid = 0x00000001;
    @Generated public static final int HasBeenRounded = 0x00000002;
    @Generated public static final int PositiveInfinity = 0x00000004;
    @Generated public static final int NegativeInfinity = 0x00000008;
    @Generated public static final int Indefinite = 0x00000010;
    @Generated public static final int ImpliedValueFlagsMask = 0x0000001C;

    @Generated
    private CMTimeFlags() {
    }
}

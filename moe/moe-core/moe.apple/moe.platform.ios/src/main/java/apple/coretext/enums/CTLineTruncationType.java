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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       CTLineTruncationType
 * 
 * Truncation types required by CTLineCreateTruncatedLine. These
 *             will tell truncation engine which type of truncation is being
 *             requested.
 * 
 * [@constant]   kCTLineTruncationStart
 *             Truncate at the beginning of the line, leaving the end portion
 *             visible.
 * 
 * [@constant]   kCTLineTruncationEnd
 *             Truncate at the end of the line, leaving the start portion
 *             visible.
 * 
 * [@constant]   kCTLineTruncationMiddle
 *             Truncate in the middle of the line, leaving both the start
 *             and the end portions visible.
 */
@Generated
public final class CTLineTruncationType {
    @Generated public static final int Start = 0x00000000;
    @Generated public static final int End = 0x00000001;
    @Generated public static final int Middle = 0x00000002;

    @Generated
    private CTLineTruncationType() {
    }
}

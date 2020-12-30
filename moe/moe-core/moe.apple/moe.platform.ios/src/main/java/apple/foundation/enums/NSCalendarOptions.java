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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSCalendarOptions {
    /**
     * option for arithmetic operations that do calendar addition
     */
    @Generated @NUInt public static final long WrapComponents = 0x0000000000000001L;
    @Generated @NUInt public static final long MatchStrictly = 0x0000000000000002L;
    @Generated @NUInt public static final long SearchBackwards = 0x0000000000000004L;
    @Generated @NUInt public static final long MatchPreviousTimePreservingSmallerUnits = 0x0000000000000100L;
    @Generated @NUInt public static final long MatchNextTimePreservingSmallerUnits = 0x0000000000000200L;
    @Generated @NUInt public static final long MatchNextTime = 0x0000000000000400L;
    @Generated @NUInt public static final long MatchFirst = 0x0000000000001000L;
    @Generated @NUInt public static final long MatchLast = 0x0000000000002000L;

    @Generated
    private NSCalendarOptions() {
    }
}

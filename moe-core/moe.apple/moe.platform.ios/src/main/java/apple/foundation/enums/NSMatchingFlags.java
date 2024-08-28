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
public final class NSMatchingFlags {
    /**
     * Set when the block is called to report progress during a long-running match operation.
     */
    @Generated @NUInt public static final long Progress = 0x0000000000000001L;
    /**
     * Set when the block is called after completion of any matching.
     */
    @Generated @NUInt public static final long Completed = 0x0000000000000002L;
    /**
     * Set when the current match operation reached the end of the search range.
     */
    @Generated @NUInt public static final long HitEnd = 0x0000000000000004L;
    /**
     * Set when the current match depended on the location of the end of the search range.
     */
    @Generated @NUInt public static final long RequiredEnd = 0x0000000000000008L;
    /**
     * Set when matching failed due to an internal error.
     */
    @Generated @NUInt public static final long InternalError = 0x0000000000000010L;

    @Generated
    private NSMatchingFlags() {
    }
}

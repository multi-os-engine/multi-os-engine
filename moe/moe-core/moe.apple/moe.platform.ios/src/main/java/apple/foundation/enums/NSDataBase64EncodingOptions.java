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

/**
 * Base 64 Options ***************
 * 
 * API-Since: 7.0
 */
@Generated
public final class NSDataBase64EncodingOptions {
    /**
     * Use zero or one of the following to control the maximum line length after which a line ending is inserted. No
     * line endings are inserted by default.
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long Encoding64CharacterLineLength = 0x0000000000000001L;
    /**
     * Use zero or one of the following to control the maximum line length after which a line ending is inserted. No
     * line endings are inserted by default.
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long Encoding76CharacterLineLength = 0x0000000000000002L;
    /**
     * Use zero or more of the following to specify which kind of line ending is inserted. The default line ending is CR
     * LF.
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long EncodingEndLineWithCarriageReturn = 0x0000000000000010L;
    /**
     * Use zero or more of the following to specify which kind of line ending is inserted. The default line ending is CR
     * LF.
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long EncodingEndLineWithLineFeed = 0x0000000000000020L;

    @Generated
    private NSDataBase64EncodingOptions() {
    }
}

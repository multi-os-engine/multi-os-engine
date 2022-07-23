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
 * NSRegularExpression is a class used to represent and apply regular expressions. An instance of this class is an
 * immutable representation of a compiled regular expression pattern and various option flags.
 */
@Generated
public final class NSRegularExpressionOptions {
    /**
     * Match letters in the pattern independent of case.
     */
    @Generated @NUInt public static final long CaseInsensitive = 0x0000000000000001L;
    /**
     * Ignore whitespace and #-prefixed comments in the pattern.
     */
    @Generated @NUInt public static final long AllowCommentsAndWhitespace = 0x0000000000000002L;
    /**
     * Treat the entire pattern as a literal string.
     */
    @Generated @NUInt public static final long IgnoreMetacharacters = 0x0000000000000004L;
    /**
     * Allow . to match any character, including line separators.
     */
    @Generated @NUInt public static final long DotMatchesLineSeparators = 0x0000000000000008L;
    /**
     * Allow ^ and $ to match the start and end of lines.
     */
    @Generated @NUInt public static final long AnchorsMatchLines = 0x0000000000000010L;
    /**
     * Treat only \n as a line separator (otherwise, all standard line separators are used).
     */
    @Generated @NUInt public static final long UseUnixLineSeparators = 0x0000000000000020L;
    /**
     * Use Unicode TR#29 to specify word boundaries (otherwise, traditional regular expression word boundaries are
     * used).
     */
    @Generated @NUInt public static final long UseUnicodeWordBoundaries = 0x0000000000000040L;

    @Generated
    private NSRegularExpressionOptions() {
    }
}

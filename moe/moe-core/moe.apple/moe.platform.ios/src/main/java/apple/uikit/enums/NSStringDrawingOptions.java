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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSStringDrawingOptions {
    /**
     * The specified origin is the line fragment origin, not the base line origin
     */
    @Generated @NInt public static final long UsesLineFragmentOrigin = 0x0000000000000001L;
    /**
     * Uses the font leading for calculating line heights
     */
    @Generated @NInt public static final long UsesFontLeading = 0x0000000000000002L;
    /**
     * Uses image glyph bounds instead of typographic bounds
     */
    @Generated @NInt public static final long UsesDeviceMetrics = 0x0000000000000008L;
    /**
     * Truncates and adds the ellipsis character to the last visible line if the text doesn't fit into the bounds
     * specified. Ignored if NSStringDrawingUsesLineFragmentOrigin is not also set.
     */
    @Generated @NInt public static final long TruncatesLastVisibleLine = 0x0000000000000020L;

    @Generated
    private NSStringDrawingOptions() {
    }
}

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
import org.moe.natj.general.ann.NInt;

/**
 * There are 3 widths: long, medium, and short.
 * For example, for English, when formatting "3 pounds"
 * Long is "3 pounds"; medium is "3 lb"; short is "3#";
 * 
 * API-Since: 8.0
 */
@Generated
public final class NSFormattingUnitStyle {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Short = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Medium = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Long = 0x0000000000000003L;

    @Generated
    private NSFormattingUnitStyle() {
    }
}

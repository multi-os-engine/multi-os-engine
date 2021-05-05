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

@Generated
public final class NSDateComponentsFormatterUnitsStyle {
    /**
     * "1:10; may fall back to abbreviated units in some cases, e.g. 3d"
     */
    @Generated @NInt public static final long Positional = 0x0000000000000000L;
    /**
     * "1h 10m"
     */
    @Generated @NInt public static final long Abbreviated = 0x0000000000000001L;
    /**
     * "1 hr, 10 min"
     */
    @Generated @NInt public static final long Short = 0x0000000000000002L;
    /**
     * "1 hour, 10 minutes"
     */
    @Generated @NInt public static final long Full = 0x0000000000000003L;
    /**
     * "One hour, ten minutes"
     */
    @Generated @NInt public static final long SpellOut = 0x0000000000000004L;
    /**
     * "1hr 10min" - Brief is shorter than Short (e.g. in English, it removes the comma)
     */
    @Generated @NInt public static final long Brief = 0x0000000000000005L;

    @Generated
    private NSDateComponentsFormatterUnitsStyle() {
    }
}

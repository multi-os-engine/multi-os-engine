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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum          HKSwimmingStrokeStyle
 * @abstract      Represents a style of stroke used during a swimming workout.
 */
@Generated
public final class HKSwimmingStrokeStyle {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Mixed = 0x0000000000000001L;
    @Generated @NInt public static final long Freestyle = 0x0000000000000002L;
    @Generated @NInt public static final long Backstroke = 0x0000000000000003L;
    @Generated @NInt public static final long Breaststroke = 0x0000000000000004L;
    @Generated @NInt public static final long Butterfly = 0x0000000000000005L;

    @Generated
    private HKSwimmingStrokeStyle() {
    }
}

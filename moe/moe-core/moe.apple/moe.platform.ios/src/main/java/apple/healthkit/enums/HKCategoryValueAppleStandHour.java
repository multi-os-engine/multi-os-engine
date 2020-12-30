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
 * @enum          HKCategoryValueAppleStandHour
 * @abstract      Set of values that may be used for HKCategorySamples with the HKCategoryTypeIdentifierAppleStandHour type.
 * 
 * @constant      HKCategoryValueAppleStandHourStood  The user stood up and moved a little for at least one minute during
 *                                                    the sample.
 * @constant      HKCategoryValueAppleStandHourIdle   The user did not stand up and move a little for at least one
 *                                                    continuous minute during the sample.
 */
@Generated
public final class HKCategoryValueAppleStandHour {
    @Generated @NInt public static final long Stood = 0x0000000000000000L;
    @Generated @NInt public static final long Idle = 0x0000000000000001L;

    @Generated
    private HKCategoryValueAppleStandHour() {
    }
}

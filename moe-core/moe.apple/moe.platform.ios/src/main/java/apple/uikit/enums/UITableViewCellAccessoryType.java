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
public final class UITableViewCellAccessoryType {
    /**
     * don't show any accessory view
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * regular chevron. doesn't track
     */
    @Generated @NInt public static final long DisclosureIndicator = 0x0000000000000001L;
    /**
     * info button w/ chevron. tracks
     */
    @Generated @NInt public static final long DetailDisclosureButton = 0x0000000000000002L;
    /**
     * checkmark. doesn't track
     */
    @Generated @NInt public static final long Checkmark = 0x0000000000000003L;
    /**
     * info button. tracks
     * 
     * API-Since: 7.0
     */
    @Generated @NInt public static final long DetailButton = 0x0000000000000004L;

    @Generated
    private UITableViewCellAccessoryType() {
    }
}

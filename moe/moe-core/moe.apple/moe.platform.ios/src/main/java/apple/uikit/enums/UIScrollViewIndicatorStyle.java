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
public final class UIScrollViewIndicatorStyle {
    /**
     * Automatically switches appearance based on the user interface style
     */
    @Generated @NInt public static final long Default = 0x0000000000000000L;
    /**
     * Dark indicator, for use on light backgrounds
     */
    @Generated @NInt public static final long Black = 0x0000000000000001L;
    /**
     * Light indicator, for use on dark backgrounds
     */
    @Generated @NInt public static final long White = 0x0000000000000002L;

    @Generated
    private UIScrollViewIndicatorStyle() {
    }
}

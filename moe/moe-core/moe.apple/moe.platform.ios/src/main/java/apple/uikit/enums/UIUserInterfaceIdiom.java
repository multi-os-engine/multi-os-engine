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
public final class UIUserInterfaceIdiom {
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    /**
     * iPhone and iPod touch style UI
     * 
     * API-Since: 3.2
     */
    @Generated @NInt public static final long Phone = 0x0000000000000000L;
    /**
     * iPad style UI
     * 
     * API-Since: 3.2
     */
    @Generated @NInt public static final long Pad = 0x0000000000000001L;
    /**
     * Apple TV style UI
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long TV = 0x0000000000000002L;
    /**
     * CarPlay style UI
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CarPlay = 0x0000000000000003L;

    @Generated
    private UIUserInterfaceIdiom() {
    }

    /**
     * Optimized for Mac UI
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Mac = 0x0000000000000005L;
}

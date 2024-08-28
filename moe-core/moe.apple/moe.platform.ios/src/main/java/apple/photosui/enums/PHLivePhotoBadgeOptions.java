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

package apple.photosui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 9.1
 */
@Generated
public final class PHLivePhotoBadgeOptions {
    /**
     * < Include treatments so this image can be shown directly over the content of the Live Photo
     * 
     * API-Since: 9.1
     */
    @Generated @NUInt public static final long OverContent = 0x0000000000000001L;
    /**
     * < To indicate that the Live Photo aspect is turned off and it will be treated as a still (e.g. for sharing)
     * 
     * API-Since: 9.1
     */
    @Generated @NUInt public static final long LiveOff = 0x0000000000000002L;

    @Generated
    private PHLivePhotoBadgeOptions() {
    }
}

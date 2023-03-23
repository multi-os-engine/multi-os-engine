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

package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class PHAssetResourceType {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Photo = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Video = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Audio = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlternatePhoto = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long FullSizePhoto = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long FullSizeVideo = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AdjustmentData = 0x0000000000000007L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AdjustmentBasePhoto = 0x0000000000000008L;
    /**
     * API-Since: 9.1
     */
    @Generated @NInt public static final long PairedVideo = 0x0000000000000009L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long FullSizePairedVideo = 0x000000000000000AL;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AdjustmentBasePairedVideo = 0x000000000000000BL;

    @Generated
    private PHAssetResourceType() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long AdjustmentBaseVideo = 0x000000000000000CL;
}

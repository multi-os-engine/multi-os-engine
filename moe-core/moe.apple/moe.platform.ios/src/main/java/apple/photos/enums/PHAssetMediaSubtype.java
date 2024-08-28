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
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 8.0
 */
@Generated
public final class PHAssetMediaSubtype {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Photo subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PhotoPanorama = 0x0000000000000001L;
    /**
     * Photo subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long PhotoHDR = 0x0000000000000002L;
    /**
     * Photo subtypes
     * 
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long PhotoScreenshot = 0x0000000000000004L;
    /**
     * Photo subtypes
     * 
     * API-Since: 9.1
     */
    @Generated @NUInt public static final long PhotoLive = 0x0000000000000008L;
    /**
     * Photo subtypes
     * 
     * API-Since: 10.2
     */
    @Generated @NUInt public static final long PhotoDepthEffect = 0x0000000000000010L;
    /**
     * Video subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long VideoStreamed = 0x0000000000010000L;
    /**
     * Video subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long VideoHighFrameRate = 0x0000000000020000L;
    /**
     * Video subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long VideoTimelapse = 0x0000000000040000L;

    @Generated
    private PHAssetMediaSubtype() {
    }

    /**
     * Video subtypes
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long VideoCinematic = 0x0000000000200000L;
}

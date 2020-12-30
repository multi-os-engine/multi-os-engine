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

@Generated
public final class PHImageRequestOptionsResizeMode {
    /**
     * no resize
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * use targetSize as a hint for optimal decoding when the source image is a compressed format (i.e. subsampling), the delivered image may be larger than targetSize
     */
    @Generated @NInt public static final long Fast = 0x0000000000000001L;
    /**
     * same as above but also guarantees the delivered image is exactly targetSize (must be set when a normalizedCropRect is specified)
     */
    @Generated @NInt public static final long Exact = 0x0000000000000002L;

    @Generated
    private PHImageRequestOptionsResizeMode() {
    }
}

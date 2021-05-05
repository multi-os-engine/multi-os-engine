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

package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * -----------------------------------------------------------------------------
 * Types
 */
@Generated
public final class MPMovieScalingMode {
    /**
     * No scaling
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Uniform scale until one dimension fits
     */
    @Generated @NInt public static final long AspectFit = 0x0000000000000001L;
    /**
     * Uniform scale until the movie fills the visible bounds. One dimension may have clipped contents
     */
    @Generated @NInt public static final long AspectFill = 0x0000000000000002L;
    /**
     * Non-uniform scale. Both render dimensions will exactly match the visible bounds
     */
    @Generated @NInt public static final long Fill = 0x0000000000000003L;

    @Generated
    private MPMovieScalingMode() {
    }
}

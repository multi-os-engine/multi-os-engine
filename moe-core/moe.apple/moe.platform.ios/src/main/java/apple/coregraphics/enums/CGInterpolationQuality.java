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

package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Interpolation quality.
 */
@Generated
public final class CGInterpolationQuality {
    /**
     * Let the context decide.
     */
    @Generated public static final int Default = 0x00000000;
    /**
     * Never interpolate.
     */
    @Generated public static final int None = 0x00000001;
    /**
     * Low quality, fast interpolation.
     */
    @Generated public static final int Low = 0x00000002;
    /**
     * Medium quality, slower than kCGInterpolationLow.
     */
    @Generated public static final int Medium = 0x00000004;
    /**
     * Highest quality, slower than kCGInterpolationMedium.
     */
    @Generated public static final int High = 0x00000003;

    @Generated
    private CGInterpolationQuality() {
    }
}

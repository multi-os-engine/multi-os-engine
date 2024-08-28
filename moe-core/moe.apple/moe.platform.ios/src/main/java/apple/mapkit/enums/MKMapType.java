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

package apple.mapkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 3.0
 */
@Generated
public final class MKMapType {
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Standard = 0x0000000000000000L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Satellite = 0x0000000000000001L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Hybrid = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long SatelliteFlyover = 0x0000000000000003L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long HybridFlyover = 0x0000000000000004L;

    @Generated
    private MKMapType() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long MutedStandard = 0x0000000000000005L;
}

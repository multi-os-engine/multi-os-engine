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
public final class MKErrorCode {
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long ServerFailure = 0x0000000000000002L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long LoadingThrottled = 0x0000000000000003L;
    /**
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long PlacemarkNotFound = 0x0000000000000004L;
    /**
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long DirectionsNotFound = 0x0000000000000005L;

    @Generated
    private MKErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long DecodingFailed = 0x0000000000000006L;
}

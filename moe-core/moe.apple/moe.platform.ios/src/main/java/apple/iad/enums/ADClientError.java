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

package apple.iad.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] ADClientError
 * 
 * [@const] ADClientErrorUnknown
 * This is not used and should never be returned.
 * 
 * [@const] ADClientErrorTrackingRestrictedOrDenied
 * The user is restricted or has denied tracking for the calling application.
 * 
 * [@const] ADClientErrorLimitAdTracking
 * This is deprecated, please use ADClientErrorTrackingRestrictedOrDenied.
 * 
 * [@const] ADClientErrorMissingData
 * The downloaded app received a payload lacking enough data to perform an attribution check.
 * 
 * [@const] ADClientErrorCorruptResponse
 * The response received from the Attribution Server was corrupt.
 * 
 * [@const] ADClientErrorRequestClientError
 * The response received from the Attribution Server had an HTTP 4xx status code.
 * 
 * [@const] ADClientErrorRequestServerError
 * The response received from the Attribution Server had an HTTP 5xx status code.
 * 
 * [@const] ADClientErrorRequestNetworkError
 * The communication with the Attribution Server had a network error. The underlying error will be provided in the user
 * info dictionary if available.
 * 
 * [@const] ADClientErrorUnsupportedPlatform
 * The attribution API was called on an unsupported platform. Only iOS and iPadOS are supported.
 * 
 * Error codes for NSErrors passed to the completionHandler block when calling the requestAttributionDetailsWithBlock:
 * method.
 * 
 * API-Since: 7.1
 * Deprecated-Since: 15.0
 */
@Deprecated
@Generated
public final class ADClientError {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long LimitAdTracking = 0x0000000000000001L;

    @Generated
    private ADClientError() {
    }

    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long MissingData = 0x0000000000000002L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long CorruptResponse = 0x0000000000000003L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long TrackingRestrictedOrDenied = 0x0000000000000001L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long RequestClientError = 0x0000000000000004L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long RequestServerError = 0x0000000000000005L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long RequestNetworkError = 0x0000000000000006L;
    /**
     * API-Since: 7.1
     * Deprecated-Since: 15.0
     */
    @Deprecated @Generated @NInt public static final long UnsupportedPlatform = 0x0000000000000007L;
}

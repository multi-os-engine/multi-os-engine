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
 * error codes for the MPErrorDomain
 * 
 * API-Since: 9.3
 */
@Generated
public final class MPErrorCode {
    /**
     * API-Since: 9.3
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * the user has not granted permission for this request.
     * 
     * API-Since: 9.3
     */
    @Generated @NInt public static final long PermissionDenied = 0x0000000000000001L;
    /**
     * the user has not enabled this capability
     * 
     * API-Since: 9.3
     */
    @Generated @NInt public static final long CloudServiceCapabilityMissing = 0x0000000000000002L;
    /**
     * the device could not connect to the network
     * 
     * API-Since: 9.3
     */
    @Generated @NInt public static final long NetworkConnectionFailed = 0x0000000000000003L;
    /**
     * the id could not be found in the current storefront
     * 
     * API-Since: 9.3
     */
    @Generated @NInt public static final long NotFound = 0x0000000000000004L;
    /**
     * the request is not supported (ex: trying to add items to a smart playlist)
     * 
     * API-Since: 9.3
     */
    @Generated @NInt public static final long NotSupported = 0x0000000000000005L;
    /**
     * the request was cancelled before it could complete
     * 
     * API-Since: 10.1
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000006L;

    @Generated
    private MPErrorCode() {
    }

    /**
     * the request was cancelled before it could complete
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long RequestTimedOut = 0x0000000000000007L;
}

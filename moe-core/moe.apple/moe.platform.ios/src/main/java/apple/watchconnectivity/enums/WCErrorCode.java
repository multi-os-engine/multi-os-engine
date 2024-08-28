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

package apple.watchconnectivity.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * These are the possible error codes that can be returned from the WatchConnectivity APIs.
 * 
 * API-Since: 9.0
 */
@Generated
public final class WCErrorCode {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long GenericError = 0x0000000000001B59L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SessionNotSupported = 0x0000000000001B5AL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SessionMissingDelegate = 0x0000000000001B5BL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SessionNotActivated = 0x0000000000001B5CL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long DeviceNotPaired = 0x0000000000001B5DL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long WatchAppNotInstalled = 0x0000000000001B5EL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long NotReachable = 0x0000000000001B5FL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InvalidParameter = 0x0000000000001B60L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long PayloadTooLarge = 0x0000000000001B61L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long PayloadUnsupportedTypes = 0x0000000000001B62L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long MessageReplyFailed = 0x0000000000001B63L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long MessageReplyTimedOut = 0x0000000000001B64L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long FileAccessDenied = 0x0000000000001B65L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long DeliveryFailed = 0x0000000000001B66L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InsufficientSpace = 0x0000000000001B67L;
    /**
     * API-Since: 9.3
     */
    @Generated @NInt public static final long SessionInactive = 0x0000000000001B68L;
    /**
     * API-Since: 9.3
     */
    @Generated @NInt public static final long TransferTimedOut = 0x0000000000001B69L;

    @Generated
    private WCErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CompanionAppNotInstalled = 0x0000000000001B6AL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long WatchOnlyApp = 0x0000000000001B6BL;
}

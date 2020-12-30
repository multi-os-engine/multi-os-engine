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
 */
@Generated
public final class WCErrorCode {
    @Generated @NInt public static final long GenericError = 0x0000000000001B59L;
    @Generated @NInt public static final long SessionNotSupported = 0x0000000000001B5AL;
    @Generated @NInt public static final long SessionMissingDelegate = 0x0000000000001B5BL;
    @Generated @NInt public static final long SessionNotActivated = 0x0000000000001B5CL;
    @Generated @NInt public static final long DeviceNotPaired = 0x0000000000001B5DL;
    @Generated @NInt public static final long WatchAppNotInstalled = 0x0000000000001B5EL;
    @Generated @NInt public static final long NotReachable = 0x0000000000001B5FL;
    @Generated @NInt public static final long InvalidParameter = 0x0000000000001B60L;
    @Generated @NInt public static final long PayloadTooLarge = 0x0000000000001B61L;
    @Generated @NInt public static final long PayloadUnsupportedTypes = 0x0000000000001B62L;
    @Generated @NInt public static final long MessageReplyFailed = 0x0000000000001B63L;
    @Generated @NInt public static final long MessageReplyTimedOut = 0x0000000000001B64L;
    @Generated @NInt public static final long FileAccessDenied = 0x0000000000001B65L;
    @Generated @NInt public static final long DeliveryFailed = 0x0000000000001B66L;
    @Generated @NInt public static final long InsufficientSpace = 0x0000000000001B67L;
    @Generated @NInt public static final long SessionInactive = 0x0000000000001B68L;
    @Generated @NInt public static final long TransferTimedOut = 0x0000000000001B69L;

    @Generated
    private WCErrorCode() {
    }

    @Generated @NInt public static final long CompanionAppNotInstalled = 0x0000000000001B6AL;
    @Generated @NInt public static final long WatchOnlyApp = 0x0000000000001B6BL;
}

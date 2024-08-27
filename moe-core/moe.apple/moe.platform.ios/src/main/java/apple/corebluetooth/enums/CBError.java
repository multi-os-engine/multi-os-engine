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

package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CBError
 * 
 * The possible errors returned during LE transactions.
 */
@Generated
public final class CBError {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long InvalidParameters = 0x0000000000000001L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long InvalidHandle = 0x0000000000000002L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long NotConnected = 0x0000000000000003L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long OutOfSpace = 0x0000000000000004L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000005L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long ConnectionTimeout = 0x0000000000000006L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long PeripheralDisconnected = 0x0000000000000007L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long UUIDNotAllowed = 0x0000000000000008L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long AlreadyAdvertising = 0x0000000000000009L;
    /**
     * API-Since: 7.1
     */
    @Generated @NInt public static final long ConnectionFailed = 0x000000000000000AL;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long ConnectionLimitReached = 0x000000000000000BL;

    @Generated
    private CBError() {
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use CBErrorUnknownDevice instead
     */
    @Deprecated @Generated @NInt public static final long UnkownDevice = 0x000000000000000CL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long UnknownDevice = 0x000000000000000CL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long OperationNotSupported = 0x000000000000000DL;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long PeerRemovedPairingInformation = 0x000000000000000EL;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long EncryptionTimedOut = 0x000000000000000FL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TooManyLEPairedDevices = 0x0000000000000010L;
}

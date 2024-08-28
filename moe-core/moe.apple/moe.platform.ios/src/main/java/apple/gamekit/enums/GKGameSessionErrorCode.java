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

package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 * Deprecated-Since: 12.0
 * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
 */
@Deprecated
@Generated
public final class GKGameSessionErrorCode {
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long NotAuthenticated = 0x0000000000000002L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SessionConflict = 0x0000000000000003L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SessionNotShared = 0x0000000000000004L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long ConnectionCancelledByUser = 0x0000000000000005L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long ConnectionFailed = 0x0000000000000006L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SessionHasMaxConnectedPlayers = 0x0000000000000007L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SendDataNotConnected = 0x0000000000000008L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SendDataNoRecipients = 0x0000000000000009L;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SendDataNotReachable = 0x000000000000000AL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long SendRateLimitReached = 0x000000000000000BL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long BadContainer = 0x000000000000000CL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long CloudQuotaExceeded = 0x000000000000000DL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long NetworkFailure = 0x000000000000000EL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long CloudDriveDisabled = 0x000000000000000FL;
    /**
     * API-Since: 10.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: GKGameSession is deprecated, use real-time and turn-based matchmaking APIs instead.
     */
    @Deprecated @Generated @NInt public static final long InvalidSession = 0x0000000000000010L;

    @Generated
    private GKGameSessionErrorCode() {
    }
}

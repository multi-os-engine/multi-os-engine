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
 * API-Since: 4.0
 */
@Generated
public final class GKErrorCode {
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000002L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long CommunicationsFailure = 0x0000000000000003L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long UserDenied = 0x0000000000000004L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long InvalidCredentials = 0x0000000000000005L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long NotAuthenticated = 0x0000000000000006L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long AuthenticationInProgress = 0x0000000000000007L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long InvalidPlayer = 0x0000000000000008L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long ScoreNotSet = 0x0000000000000009L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long ParentalControlsBlocked = 0x000000000000000AL;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long PlayerStatusExceedsMaximumLength = 0x000000000000000BL;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long PlayerStatusInvalid = 0x000000000000000CL;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long MatchRequestInvalid = 0x000000000000000DL;
    /**
     * API-Since: 4.1
     */
    @Generated @NInt public static final long Underage = 0x000000000000000EL;
    /**
     * API-Since: 4.1
     */
    @Generated @NInt public static final long GameUnrecognized = 0x000000000000000FL;
    /**
     * API-Since: 4.1
     */
    @Generated @NInt public static final long NotSupported = 0x0000000000000010L;
    /**
     * API-Since: 4.2
     */
    @Generated @NInt public static final long InvalidParameter = 0x0000000000000011L;
    /**
     * API-Since: 5.0
     */
    @Generated @NInt public static final long UnexpectedConnection = 0x0000000000000012L;
    /**
     * API-Since: 6.0
     * Deprecated-Since: 26.0
     */
    @Deprecated @Generated @NInt public static final long ChallengeInvalid = 0x0000000000000013L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long TurnBasedMatchDataTooLarge = 0x0000000000000014L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long TurnBasedTooManySessions = 0x0000000000000015L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long TurnBasedInvalidParticipant = 0x0000000000000016L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long TurnBasedInvalidTurn = 0x0000000000000017L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long TurnBasedInvalidState = 0x0000000000000018L;
    /**
     * API-Since: 7.0
     */
    @Generated @NInt public static final long InvitationsDisabled = 0x0000000000000019L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long PlayerPhotoFailure = 0x000000000000001AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UbiquityContainerUnavailable = 0x000000000000001BL;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long MatchNotConnected = 0x000000000000001CL;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long GameSessionRequestInvalid = 0x000000000000001DL;

    @Generated
    private GKErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long RestrictedToAutomatch = 0x000000000000001EL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long APINotAvailable = 0x000000000000001FL;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000020L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long ConnectionTimeout = 0x0000000000000021L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long APIObsolete = 0x0000000000000022L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long FriendListDescriptionMissing = 0x0000000000000064L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long FriendListRestricted = 0x0000000000000065L;
    /**
     * API-Since: 14.5
     */
    @Generated @NInt public static final long FriendListDenied = 0x0000000000000066L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long FriendRequestNotAvailable = 0x0000000000000067L;
    /**
     * API-Since: 17.2
     */
    @Generated @NInt public static final long ICloudUnavailable = 0x0000000000000023L;
    /**
     * API-Since: 17.2
     */
    @Generated @NInt public static final long LockdownMode = 0x0000000000000024L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long AppUnlisted = 0x0000000000000025L;
    /**
     * API-Since: 18.4
     */
    @Generated @NInt public static final long DebugMode = 0x0000000000000026L;
}

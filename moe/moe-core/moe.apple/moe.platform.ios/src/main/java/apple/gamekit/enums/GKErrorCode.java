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

@Generated
public final class GKErrorCode {
    @Generated @NInt public static final long Unknown = 0x0000000000000001L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000002L;
    @Generated @NInt public static final long CommunicationsFailure = 0x0000000000000003L;
    @Generated @NInt public static final long UserDenied = 0x0000000000000004L;
    @Generated @NInt public static final long InvalidCredentials = 0x0000000000000005L;
    @Generated @NInt public static final long NotAuthenticated = 0x0000000000000006L;
    @Generated @NInt public static final long AuthenticationInProgress = 0x0000000000000007L;
    @Generated @NInt public static final long InvalidPlayer = 0x0000000000000008L;
    @Generated @NInt public static final long ScoreNotSet = 0x0000000000000009L;
    @Generated @NInt public static final long ParentalControlsBlocked = 0x000000000000000AL;
    @Generated @NInt public static final long PlayerStatusExceedsMaximumLength = 0x000000000000000BL;
    @Generated @NInt public static final long PlayerStatusInvalid = 0x000000000000000CL;
    @Generated @NInt public static final long MatchRequestInvalid = 0x000000000000000DL;
    @Generated @NInt public static final long Underage = 0x000000000000000EL;
    @Generated @NInt public static final long GameUnrecognized = 0x000000000000000FL;
    @Generated @NInt public static final long NotSupported = 0x0000000000000010L;
    @Generated @NInt public static final long InvalidParameter = 0x0000000000000011L;
    @Generated @NInt public static final long UnexpectedConnection = 0x0000000000000012L;
    @Generated @NInt public static final long ChallengeInvalid = 0x0000000000000013L;
    @Generated @NInt public static final long TurnBasedMatchDataTooLarge = 0x0000000000000014L;
    @Generated @NInt public static final long TurnBasedTooManySessions = 0x0000000000000015L;
    @Generated @NInt public static final long TurnBasedInvalidParticipant = 0x0000000000000016L;
    @Generated @NInt public static final long TurnBasedInvalidTurn = 0x0000000000000017L;
    @Generated @NInt public static final long TurnBasedInvalidState = 0x0000000000000018L;
    @Generated @NInt public static final long InvitationsDisabled = 0x0000000000000019L;
    @Generated @NInt public static final long PlayerPhotoFailure = 0x000000000000001AL;
    @Generated @NInt public static final long UbiquityContainerUnavailable = 0x000000000000001BL;
    @Generated @NInt public static final long MatchNotConnected = 0x000000000000001CL;
    @Generated @NInt public static final long GameSessionRequestInvalid = 0x000000000000001DL;

    @Generated
    private GKErrorCode() {
    }

    @Generated @NInt public static final long RestrictedToAutomatch = 0x000000000000001EL;
    @Generated @NInt public static final long APINotAvailable = 0x000000000000001FL;
    @Generated @NInt public static final long NotAuthorized = 0x0000000000000020L;
    @Generated @NInt public static final long ConnectionTimeout = 0x0000000000000021L;
    @Generated @NInt public static final long APIObsolete = 0x0000000000000022L;
    @Generated @NInt public static final long FriendListDescriptionMissing = 0x0000000000000064L;
    @Generated @NInt public static final long FriendListRestricted = 0x0000000000000065L;
    @Generated @NInt public static final long FriendListDenied = 0x0000000000000066L;
    @Generated @NInt public static final long FriendRequestNotAvailable = 0x0000000000000067L;
}

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

package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This enumeration describes the possible error constants that can be
 * returned from the the HomeKit APIs.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HMErrorCode {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlreadyExists = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotFound = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidParameter = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryNotReachable = 0x0000000000000004L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ReadOnlyCharacteristic = 0x0000000000000005L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long WriteOnlyCharacteristic = 0x0000000000000006L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotificationNotSupported = 0x0000000000000007L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long OperationTimedOut = 0x0000000000000008L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryPoweredOff = 0x0000000000000009L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessDenied = 0x000000000000000AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ObjectAssociatedToAnotherHome = 0x000000000000000BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ObjectNotAssociatedToAnyHome = 0x000000000000000CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ObjectAlreadyAssociatedToHome = 0x000000000000000DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryIsBusy = 0x000000000000000EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long OperationInProgress = 0x000000000000000FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryOutOfResources = 0x0000000000000010L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InsufficientPrivileges = 0x0000000000000011L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryPairingFailed = 0x0000000000000012L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidDataFormatSpecified = 0x0000000000000013L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NilParameter = 0x0000000000000014L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UnconfiguredParameter = 0x0000000000000015L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidClass = 0x0000000000000016L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000017L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RoomForHomeCannotBeInZone = 0x0000000000000018L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NoActionsInActionSet = 0x0000000000000019L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NoRegisteredActionSets = 0x000000000000001AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long MissingParameter = 0x000000000000001BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long FireDateInPast = 0x000000000000001CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RoomForHomeCannotBeUpdated = 0x000000000000001DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ActionInAnotherActionSet = 0x000000000000001EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ObjectWithSimilarNameExistsInHome = 0x000000000000001FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long HomeWithSimilarNameExists = 0x0000000000000020L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RenameWithSimilarName = 0x0000000000000021L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CannotRemoveNonBridgeAccessory = 0x0000000000000022L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NameContainsProhibitedCharacters = 0x0000000000000023L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NameDoesNotStartWithValidCharacters = 0x0000000000000024L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserIDNotEmailAddress = 0x0000000000000025L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserDeclinedAddingUser = 0x0000000000000026L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserDeclinedRemovingUser = 0x0000000000000027L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserDeclinedInvite = 0x0000000000000028L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserManagementFailed = 0x0000000000000029L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RecurrenceTooSmall = 0x000000000000002AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidValueType = 0x000000000000002BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ValueLowerThanMinimum = 0x000000000000002CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ValueHigherThanMaximum = 0x000000000000002DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long StringLongerThanMaximum = 0x000000000000002EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long HomeAccessNotAuthorized = 0x000000000000002FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long OperationNotSupported = 0x0000000000000030L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long MaximumObjectLimitReached = 0x0000000000000031L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessorySentInvalidResponse = 0x0000000000000032L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long StringShorterThanMinimum = 0x0000000000000033L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long GenericError = 0x0000000000000034L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SecurityFailure = 0x0000000000000035L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CommunicationFailure = 0x0000000000000036L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long MessageAuthenticationFailed = 0x0000000000000037L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidMessageSize = 0x0000000000000038L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryDiscoveryFailed = 0x0000000000000039L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ClientRequestError = 0x000000000000003AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryResponseError = 0x000000000000003BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NameDoesNotEndWithValidCharacters = 0x000000000000003CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryIsBlocked = 0x000000000000003DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidAssociatedServiceType = 0x000000000000003EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ActionSetExecutionFailed = 0x000000000000003FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ActionSetExecutionPartialSuccess = 0x0000000000000040L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ActionSetExecutionInProgress = 0x0000000000000041L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AccessoryOutOfCompliance = 0x0000000000000042L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long DataResetFailure = 0x0000000000000043L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotificationAlreadyEnabled = 0x0000000000000044L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RecurrenceMustBeOnSpecifiedBoundaries = 0x0000000000000045L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long DateMustBeOnSpecifiedBoundaries = 0x0000000000000046L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CannotActivateTriggerTooFarInFuture = 0x0000000000000047L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RecurrenceTooLarge = 0x0000000000000048L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ReadWritePartialSuccess = 0x0000000000000049L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ReadWriteFailure = 0x000000000000004AL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotSignedIntoiCloud = 0x000000000000004BL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long KeychainSyncNotEnabled = 0x000000000000004CL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CloudDataSyncInProgress = 0x000000000000004DL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NetworkUnavailable = 0x000000000000004EL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AddAccessoryFailed = 0x000000000000004FL;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000050L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long CannotUnblockNonBridgeAccessory = 0x0000000000000051L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long DeviceLocked = 0x0000000000000052L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long CannotRemoveBuiltinActionSet = 0x0000000000000053L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long LocationForHomeDisabled = 0x0000000000000054L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long NotAuthorizedForLocationServices = 0x0000000000000055L;
    /**
     * API-Since: 9.3
     */
    @Generated @NInt public static final long ReferToUserManual = 0x0000000000000056L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long InvalidOrMissingAuthorizationData = 0x0000000000000057L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long BridgedAccessoryNotReachable = 0x0000000000000058L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotAuthorizedForMicrophoneAccess = 0x0000000000000059L;
    /**
     * API-Since: 10.2
     */
    @Generated @NInt public static final long IncompatibleNetwork = 0x000000000000005AL;

    @Generated
    private HMErrorCode() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NoHomeHub = 0x000000000000005BL;
    /**
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NoCompatibleHomeHub = 0x000000000000005CL;
    /**
     * API-Since: 11.0
     * Deprecated-Since: 11.0
     */
    @Deprecated @Generated @NInt public static final long IncompatibleHomeHub = 0x000000000000005CL;
    /**
     * API-Since: 11.2
     */
    @Generated @NInt public static final long UnexpectedError = 0xFFFFFFFFFFFFFFFFL;
    /**
     * API-Since: 11.3
     */
    @Generated @NInt public static final long IncompatibleAccessory = 0x000000000000005DL;
    /**
     * API-Since: 12.0
     */
    @Generated @NInt public static final long ObjectWithSimilarNameExists = 0x000000000000005FL;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long OwnershipFailure = 0x0000000000000060L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long MaximumAccessoriesOfTypeInHome = 0x0000000000000061L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long WiFiCredentialGenerationFailed = 0x0000000000000062L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long EnterpriseNetworkNotSupported = 0x0000000000000063L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TimedOutWaitingForAccessory = 0x0000000000000064L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long AccessoryCommunicationFailure = 0x0000000000000065L;
    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long FailedToJoinNetwork = 0x0000000000000066L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AccessoryIsSuspended = 0x0000000000000067L;
}

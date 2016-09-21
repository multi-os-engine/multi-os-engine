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

@Generated
public final class HMErrorCode {
    @Generated @NInt public static final long AlreadyExists = 0x0000000000000001L;
    @Generated @NInt public static final long NotFound = 0x0000000000000002L;
    @Generated @NInt public static final long InvalidParameter = 0x0000000000000003L;
    @Generated @NInt public static final long AccessoryNotReachable = 0x0000000000000004L;
    @Generated @NInt public static final long ReadOnlyCharacteristic = 0x0000000000000005L;
    @Generated @NInt public static final long WriteOnlyCharacteristic = 0x0000000000000006L;
    @Generated @NInt public static final long NotificationNotSupported = 0x0000000000000007L;
    @Generated @NInt public static final long OperationTimedOut = 0x0000000000000008L;
    @Generated @NInt public static final long AccessoryPoweredOff = 0x0000000000000009L;
    @Generated @NInt public static final long AccessDenied = 0x000000000000000AL;
    @Generated @NInt public static final long ObjectAssociatedToAnotherHome = 0x000000000000000BL;
    @Generated @NInt public static final long ObjectNotAssociatedToAnyHome = 0x000000000000000CL;
    @Generated @NInt public static final long ObjectAlreadyAssociatedToHome = 0x000000000000000DL;
    @Generated @NInt public static final long AccessoryIsBusy = 0x000000000000000EL;
    @Generated @NInt public static final long OperationInProgress = 0x000000000000000FL;
    @Generated @NInt public static final long AccessoryOutOfResources = 0x0000000000000010L;
    @Generated @NInt public static final long InsufficientPrivileges = 0x0000000000000011L;
    @Generated @NInt public static final long AccessoryPairingFailed = 0x0000000000000012L;
    @Generated @NInt public static final long InvalidDataFormatSpecified = 0x0000000000000013L;
    @Generated @NInt public static final long NilParameter = 0x0000000000000014L;
    @Generated @NInt public static final long UnconfiguredParameter = 0x0000000000000015L;
    @Generated @NInt public static final long InvalidClass = 0x0000000000000016L;
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000017L;
    @Generated @NInt public static final long RoomForHomeCannotBeInZone = 0x0000000000000018L;
    @Generated @NInt public static final long NoActionsInActionSet = 0x0000000000000019L;
    @Generated @NInt public static final long NoRegisteredActionSets = 0x000000000000001AL;
    @Generated @NInt public static final long MissingParameter = 0x000000000000001BL;
    @Generated @NInt public static final long FireDateInPast = 0x000000000000001CL;
    @Generated @NInt public static final long RoomForHomeCannotBeUpdated = 0x000000000000001DL;
    @Generated @NInt public static final long ActionInAnotherActionSet = 0x000000000000001EL;
    @Generated @NInt public static final long ObjectWithSimilarNameExistsInHome = 0x000000000000001FL;
    @Generated @NInt public static final long HomeWithSimilarNameExists = 0x0000000000000020L;
    @Generated @NInt public static final long RenameWithSimilarName = 0x0000000000000021L;
    @Generated @NInt public static final long CannotRemoveNonBridgeAccessory = 0x0000000000000022L;
    @Generated @NInt public static final long NameContainsProhibitedCharacters = 0x0000000000000023L;
    @Generated @NInt public static final long NameDoesNotStartWithValidCharacters = 0x0000000000000024L;
    @Generated @NInt public static final long UserIDNotEmailAddress = 0x0000000000000025L;
    @Generated @NInt public static final long UserDeclinedAddingUser = 0x0000000000000026L;
    @Generated @NInt public static final long UserDeclinedRemovingUser = 0x0000000000000027L;
    @Generated @NInt public static final long UserDeclinedInvite = 0x0000000000000028L;
    @Generated @NInt public static final long UserManagementFailed = 0x0000000000000029L;
    @Generated @NInt public static final long RecurrenceTooSmall = 0x000000000000002AL;
    @Generated @NInt public static final long InvalidValueType = 0x000000000000002BL;
    @Generated @NInt public static final long ValueLowerThanMinimum = 0x000000000000002CL;
    @Generated @NInt public static final long ValueHigherThanMaximum = 0x000000000000002DL;
    @Generated @NInt public static final long StringLongerThanMaximum = 0x000000000000002EL;
    @Generated @NInt public static final long HomeAccessNotAuthorized = 0x000000000000002FL;
    @Generated @NInt public static final long OperationNotSupported = 0x0000000000000030L;
    @Generated @NInt public static final long MaximumObjectLimitReached = 0x0000000000000031L;
    @Generated @NInt public static final long AccessorySentInvalidResponse = 0x0000000000000032L;
    @Generated @NInt public static final long StringShorterThanMinimum = 0x0000000000000033L;
    @Generated @NInt public static final long GenericError = 0x0000000000000034L;
    @Generated @NInt public static final long SecurityFailure = 0x0000000000000035L;
    @Generated @NInt public static final long CommunicationFailure = 0x0000000000000036L;
    @Generated @NInt public static final long MessageAuthenticationFailed = 0x0000000000000037L;
    @Generated @NInt public static final long InvalidMessageSize = 0x0000000000000038L;
    @Generated @NInt public static final long AccessoryDiscoveryFailed = 0x0000000000000039L;
    @Generated @NInt public static final long ClientRequestError = 0x000000000000003AL;
    @Generated @NInt public static final long AccessoryResponseError = 0x000000000000003BL;
    @Generated @NInt public static final long NameDoesNotEndWithValidCharacters = 0x000000000000003CL;
    @Generated @NInt public static final long AccessoryIsBlocked = 0x000000000000003DL;
    @Generated @NInt public static final long InvalidAssociatedServiceType = 0x000000000000003EL;
    @Generated @NInt public static final long ActionSetExecutionFailed = 0x000000000000003FL;
    @Generated @NInt public static final long ActionSetExecutionPartialSuccess = 0x0000000000000040L;
    @Generated @NInt public static final long ActionSetExecutionInProgress = 0x0000000000000041L;
    @Generated @NInt public static final long AccessoryOutOfCompliance = 0x0000000000000042L;
    @Generated @NInt public static final long DataResetFailure = 0x0000000000000043L;
    @Generated @NInt public static final long NotificationAlreadyEnabled = 0x0000000000000044L;
    @Generated @NInt public static final long RecurrenceMustBeOnSpecifiedBoundaries = 0x0000000000000045L;
    @Generated @NInt public static final long DateMustBeOnSpecifiedBoundaries = 0x0000000000000046L;
    @Generated @NInt public static final long CannotActivateTriggerTooFarInFuture = 0x0000000000000047L;
    @Generated @NInt public static final long RecurrenceTooLarge = 0x0000000000000048L;
    @Generated @NInt public static final long ReadWritePartialSuccess = 0x0000000000000049L;
    @Generated @NInt public static final long ReadWriteFailure = 0x000000000000004AL;
    @Generated @NInt public static final long NotSignedIntoiCloud = 0x000000000000004BL;
    @Generated @NInt public static final long KeychainSyncNotEnabled = 0x000000000000004CL;
    @Generated @NInt public static final long CloudDataSyncInProgress = 0x000000000000004DL;
    @Generated @NInt public static final long NetworkUnavailable = 0x000000000000004EL;
    @Generated @NInt public static final long AddAccessoryFailed = 0x000000000000004FL;
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000050L;
    @Generated @NInt public static final long CannotUnblockNonBridgeAccessory = 0x0000000000000051L;
    @Generated @NInt public static final long DeviceLocked = 0x0000000000000052L;
    @Generated @NInt public static final long CannotRemoveBuiltinActionSet = 0x0000000000000053L;
    @Generated @NInt public static final long LocationForHomeDisabled = 0x0000000000000054L;
    @Generated @NInt public static final long NotAuthorizedForLocationServices = 0x0000000000000055L;
    @Generated @NInt public static final long ReferToUserManual = 0x0000000000000056L;
    @Generated @NInt public static final long InvalidOrMissingAuthorizationData = 0x0000000000000057L;
    @Generated @NInt public static final long BridgedAccessoryNotReachable = 0x0000000000000058L;
    @Generated @NInt public static final long NotAuthorizedForMicrophoneAccess = 0x0000000000000059L;

    @Generated
    private HMErrorCode() {
    }
}

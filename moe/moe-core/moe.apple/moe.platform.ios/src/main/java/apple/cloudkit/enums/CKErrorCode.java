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

package apple.cloudkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CKErrorCode {
    @Generated @NInt public static final long InternalError = 0x0000000000000001L;
    @Generated @NInt public static final long PartialFailure = 0x0000000000000002L;
    @Generated @NInt public static final long NetworkUnavailable = 0x0000000000000003L;
    @Generated @NInt public static final long NetworkFailure = 0x0000000000000004L;
    @Generated @NInt public static final long BadContainer = 0x0000000000000005L;
    @Generated @NInt public static final long ServiceUnavailable = 0x0000000000000006L;
    @Generated @NInt public static final long RequestRateLimited = 0x0000000000000007L;
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000008L;
    @Generated @NInt public static final long NotAuthenticated = 0x0000000000000009L;
    @Generated @NInt public static final long PermissionFailure = 0x000000000000000AL;
    @Generated @NInt public static final long UnknownItem = 0x000000000000000BL;
    @Generated @NInt public static final long InvalidArguments = 0x000000000000000CL;
    @Generated @NInt public static final long ResultsTruncated = 0x000000000000000DL;
    @Generated @NInt public static final long ServerRecordChanged = 0x000000000000000EL;
    @Generated @NInt public static final long ServerRejectedRequest = 0x000000000000000FL;
    @Generated @NInt public static final long AssetFileNotFound = 0x0000000000000010L;
    @Generated @NInt public static final long AssetFileModified = 0x0000000000000011L;
    @Generated @NInt public static final long IncompatibleVersion = 0x0000000000000012L;
    @Generated @NInt public static final long ConstraintViolation = 0x0000000000000013L;
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000014L;
    @Generated @NInt public static final long ChangeTokenExpired = 0x0000000000000015L;
    @Generated @NInt public static final long BatchRequestFailed = 0x0000000000000016L;
    @Generated @NInt public static final long ZoneBusy = 0x0000000000000017L;
    @Generated @NInt public static final long BadDatabase = 0x0000000000000018L;
    @Generated @NInt public static final long QuotaExceeded = 0x0000000000000019L;
    @Generated @NInt public static final long ZoneNotFound = 0x000000000000001AL;
    @Generated @NInt public static final long LimitExceeded = 0x000000000000001BL;
    @Generated @NInt public static final long UserDeletedZone = 0x000000000000001CL;
    @Generated @NInt public static final long TooManyParticipants = 0x000000000000001DL;
    @Generated @NInt public static final long AlreadyShared = 0x000000000000001EL;
    @Generated @NInt public static final long ReferenceViolation = 0x000000000000001FL;
    @Generated @NInt public static final long ManagedAccountRestricted = 0x0000000000000020L;
    @Generated @NInt public static final long ParticipantMayNeedVerification = 0x0000000000000021L;

    @Generated
    private CKErrorCode() {
    }

    @Generated @NInt public static final long ServerResponseLost = 0x0000000000000022L;
}

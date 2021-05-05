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
    /**
     * CloudKit.framework encountered an error.  This is a non-recoverable error.
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000001L;
    /**
     * Some items failed, but the operation succeeded overall. Check CKPartialErrorsByItemIDKey in the userInfo dictionary for more details.
     */
    @Generated @NInt public static final long PartialFailure = 0x0000000000000002L;
    /**
     * Network not available
     */
    @Generated @NInt public static final long NetworkUnavailable = 0x0000000000000003L;
    /**
     * Network error (available but CFNetwork gave us an error)
     */
    @Generated @NInt public static final long NetworkFailure = 0x0000000000000004L;
    /**
     * Un-provisioned or unauthorized container. Try provisioning the container before retrying the operation.
     */
    @Generated @NInt public static final long BadContainer = 0x0000000000000005L;
    /**
     * Service unavailable
     */
    @Generated @NInt public static final long ServiceUnavailable = 0x0000000000000006L;
    /**
     * Client is being rate limited
     */
    @Generated @NInt public static final long RequestRateLimited = 0x0000000000000007L;
    /**
     * Missing entitlement
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000008L;
    /**
     * Not authenticated (writing without being logged in, no user record)
     */
    @Generated @NInt public static final long NotAuthenticated = 0x0000000000000009L;
    /**
     * Access failure (save, fetch, or shareAccept)
     */
    @Generated @NInt public static final long PermissionFailure = 0x000000000000000AL;
    /**
     * Record does not exist
     */
    @Generated @NInt public static final long UnknownItem = 0x000000000000000BL;
    /**
     * Bad client request (bad record graph, malformed predicate)
     */
    @Generated @NInt public static final long InvalidArguments = 0x000000000000000CL;
    /**
     * Bad client request (bad record graph, malformed predicate)
     */
    @Generated @NInt public static final long ResultsTruncated = 0x000000000000000DL;
    /**
     * The record was rejected because the version on the server was different
     */
    @Generated @NInt public static final long ServerRecordChanged = 0x000000000000000EL;
    /**
     * The server rejected this request. This is a non-recoverable error
     */
    @Generated @NInt public static final long ServerRejectedRequest = 0x000000000000000FL;
    /**
     * Asset file was not found
     */
    @Generated @NInt public static final long AssetFileNotFound = 0x0000000000000010L;
    /**
     * Asset file content was modified while being saved
     */
    @Generated @NInt public static final long AssetFileModified = 0x0000000000000011L;
    /**
     * App version is less than the minimum allowed version
     */
    @Generated @NInt public static final long IncompatibleVersion = 0x0000000000000012L;
    /**
     * The server rejected the request because there was a conflict with a unique field.
     */
    @Generated @NInt public static final long ConstraintViolation = 0x0000000000000013L;
    /**
     * A CKOperation was explicitly cancelled
     */
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000014L;
    /**
     * The previousServerChangeToken value is too old and the client must re-sync from scratch
     */
    @Generated @NInt public static final long ChangeTokenExpired = 0x0000000000000015L;
    /**
     * One of the items in this batch operation failed in a zone with atomic updates, so the entire batch was rejected.
     */
    @Generated @NInt public static final long BatchRequestFailed = 0x0000000000000016L;
    /**
     * The server is too busy to handle this zone operation. Try the operation again in a few seconds.
     */
    @Generated @NInt public static final long ZoneBusy = 0x0000000000000017L;
    /**
     * Operation could not be completed on the given database. Likely caused by attempting to modify zones in the public database.
     */
    @Generated @NInt public static final long BadDatabase = 0x0000000000000018L;
    /**
     * Saving a record would exceed quota
     */
    @Generated @NInt public static final long QuotaExceeded = 0x0000000000000019L;
    /**
     * The specified zone does not exist on the server
     */
    @Generated @NInt public static final long ZoneNotFound = 0x000000000000001AL;
    /**
     * The request to the server was too large. Retry this request as a smaller batch.
     */
    @Generated @NInt public static final long LimitExceeded = 0x000000000000001BL;
    /**
     * The user deleted this zone through the settings UI. Your client should either remove its local data or prompt the user before attempting to re-upload any data to this zone.
     */
    @Generated @NInt public static final long UserDeletedZone = 0x000000000000001CL;
    /**
     * A share cannot be saved because there are too many participants attached to the share
     */
    @Generated @NInt public static final long TooManyParticipants = 0x000000000000001DL;
    /**
     * A record/share cannot be saved, doing so would cause a hierarchy of records to exist in multiple shares
     */
    @Generated @NInt public static final long AlreadyShared = 0x000000000000001EL;
    /**
     * The target of a record's parent or share reference was not found
     */
    @Generated @NInt public static final long ReferenceViolation = 0x000000000000001FL;
    /**
     * Request was rejected due to a managed account restriction
     */
    @Generated @NInt public static final long ManagedAccountRestricted = 0x0000000000000020L;
    /**
     * Share Metadata cannot be determined, because the user is not a member of the share.  There are invited participants on the share with email addresses or phone numbers not associated with any iCloud account. The user may be able to join the share if they can associate one of those email addresses or phone numbers with their iCloud account via the system Share Accept UI. Call UIApplication's openURL on this share URL to have the user attempt to verify their information.
     */
    @Generated @NInt public static final long ParticipantMayNeedVerification = 0x0000000000000021L;

    @Generated
    private CKErrorCode() {
    }

    /**
     * The server received and processed this request, but the response was lost due to a network failure.  There is no guarantee that this request succeeded.  Your client should re-issue the request (if it is idempotent), or fetch data from the server to determine if the request succeeded.
     */
    @Generated @NInt public static final long ServerResponseLost = 0x0000000000000022L;
    /**
     * The file for this asset could not be accessed. It is likely your application does not have permission to open the file, or the file may be temporarily unavailable due to its data protection class. This operation can be retried after it is able to be opened in your process.
     */
    @Generated @NInt public static final long AssetNotAvailable = 0x0000000000000023L;
}

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

/**
 * API-Since: 8.0
 */
@Generated
public final class CKErrorCode {
    /**
     * CloudKit.framework encountered an error. This is a non-recoverable error.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InternalError = 0x0000000000000001L;
    /**
     * Some items failed, but the operation succeeded overall. Check CKPartialErrorsByItemIDKey in the userInfo
     * dictionary for more details.
     * This error is only returned from CKOperation completion blocks, which are deprecated in swift.
     * It will not be returned from (swift-only) CKOperation result blocks, which are their replacements
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long PartialFailure = 0x0000000000000002L;
    /**
     * Network not available
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NetworkUnavailable = 0x0000000000000003L;
    /**
     * Network error (available but CFNetwork gave us an error)
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NetworkFailure = 0x0000000000000004L;
    /**
     * Un-provisioned or unauthorized container. Try provisioning the container before retrying the operation.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BadContainer = 0x0000000000000005L;
    /**
     * Service unavailable
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ServiceUnavailable = 0x0000000000000006L;
    /**
     * Client is being rate limited
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long RequestRateLimited = 0x0000000000000007L;
    /**
     * Missing entitlement
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long MissingEntitlement = 0x0000000000000008L;
    /**
     * Not authenticated (writing without being logged in, no user record)
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotAuthenticated = 0x0000000000000009L;
    /**
     * Access failure (save, fetch, or shareAccept)
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long PermissionFailure = 0x000000000000000AL;
    /**
     * Record does not exist
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UnknownItem = 0x000000000000000BL;
    /**
     * Bad client request (bad record graph, malformed predicate)
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InvalidArguments = 0x000000000000000CL;
    /**
     * Bad client request (bad record graph, malformed predicate)
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Will not be returned
     */
    @Deprecated @Generated @NInt public static final long ResultsTruncated = 0x000000000000000DL;
    /**
     * The record was rejected because the version on the server was different
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ServerRecordChanged = 0x000000000000000EL;
    /**
     * The server rejected this request. This is a non-recoverable error
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ServerRejectedRequest = 0x000000000000000FL;
    /**
     * Asset file was not found
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AssetFileNotFound = 0x0000000000000010L;
    /**
     * Asset file content was modified while being saved
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AssetFileModified = 0x0000000000000011L;
    /**
     * App version is less than the minimum allowed version
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long IncompatibleVersion = 0x0000000000000012L;
    /**
     * The server rejected the request because there was a conflict with a unique field.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ConstraintViolation = 0x0000000000000013L;
    /**
     * A CKOperation was explicitly cancelled
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long OperationCancelled = 0x0000000000000014L;
    /**
     * The previousServerChangeToken value is too old and the client must re-sync from scratch
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ChangeTokenExpired = 0x0000000000000015L;
    /**
     * One of the items in this batch operation failed in a zone with atomic updates, so the entire batch was rejected.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BatchRequestFailed = 0x0000000000000016L;
    /**
     * The server is too busy to handle this zone operation. Try the operation again in a few seconds.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ZoneBusy = 0x0000000000000017L;
    /**
     * Operation could not be completed on the given database. Likely caused by attempting to modify zones in the public
     * database.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long BadDatabase = 0x0000000000000018L;
    /**
     * Saving a record would exceed quota
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long QuotaExceeded = 0x0000000000000019L;
    /**
     * The specified zone does not exist on the server
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long ZoneNotFound = 0x000000000000001AL;
    /**
     * The request to the server was too large. Retry this request as a smaller batch.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long LimitExceeded = 0x000000000000001BL;
    /**
     * The user deleted this zone through the settings UI. Your client should either remove its local data or prompt the
     * user before attempting to re-upload any data to this zone.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserDeletedZone = 0x000000000000001CL;
    /**
     * A share cannot be saved because there are too many participants attached to the share
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long TooManyParticipants = 0x000000000000001DL;
    /**
     * A record/share cannot be saved, doing so would cause a hierarchy of records to exist in multiple shares
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long AlreadyShared = 0x000000000000001EL;
    /**
     * The target of a record's parent or share reference was not found
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ReferenceViolation = 0x000000000000001FL;
    /**
     * Request was rejected due to a managed account restriction
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ManagedAccountRestricted = 0x0000000000000020L;
    /**
     * Share Metadata cannot be determined, because the user is not a member of the share. There are invited
     * participants on the share with email addresses or phone numbers not associated with any iCloud account. The user
     * may be able to join the share if they can associate one of those email addresses or phone numbers with their
     * iCloud account via the system Share Accept UI. Call UIApplication's openURL on this share URL to have the user
     * attempt to verify their information.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long ParticipantMayNeedVerification = 0x0000000000000021L;

    @Generated
    private CKErrorCode() {
    }

    /**
     * The server received and processed this request, but the response was lost due to a network failure. There is no
     * guarantee that this request succeeded. Your client should re-issue the request (if it is idempotent), or fetch
     * data from the server to determine if the request succeeded.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ServerResponseLost = 0x0000000000000022L;
    /**
     * The file for this asset could not be accessed. It is likely your application does not have permission to open the
     * file, or the file may be temporarily unavailable due to its data protection class. This operation can be retried
     * after it is able to be opened in your process.
     * 
     * API-Since: 11.3
     */
    @Generated @NInt public static final long AssetNotAvailable = 0x0000000000000023L;
    /**
     * The current account is in a state that may need user intervention to recover from. The user should be directed to
     * check the Settings app. Listen for CKAccountChangedNotifications to know when to re-check account status and
     * retry.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long AccountTemporarilyUnavailable = 0x0000000000000024L;
}

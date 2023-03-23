package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class NSFileProviderErrorCode {
    @Generated
    private NSFileProviderErrorCode() {
    }

    /**
     * The user credentials cannot be verified
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NotAuthenticated = 0xFFFFFFFFFFFFFC18L;
    /**
     * An item already exists with the same parentItemIdentifier and filename (or with a filename differing only in
     * case.)
     * 
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:] to build an error with
     * this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:]
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long FilenameCollision = 0xFFFFFFFFFFFFFC17L;
    /**
     * The value of the sync anchor is too old, and the system must re-sync from scratch
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SyncAnchorExpired = 0xFFFFFFFFFFFFFC16L;
    /**
     * The value of the page token is too old, and the system must re-sync from scratch
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long PageExpired = 0xFFFFFFFFFFFFFC16L;
    /**
     * The item has not been uploaded because it would push the account over quota
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long InsufficientQuota = 0xFFFFFFFFFFFFFC15L;
    /**
     * Connecting to the servers failed
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long ServerUnreachable = 0xFFFFFFFFFFFFFC14L;
    /**
     * The requested item doesn't exist
     * 
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:] to build an
     * error with this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:]
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long NoSuchItem = 0xFFFFFFFFFFFFFC13L;
    /**
     * Returned by NSFileProviderManager if directory eviction failed because the target contains non-evictable items.
     * 
     * -[NSError underlyingErrors] is set to an array of the underlying errors. Each one has NSURLErrorKey set
     * to identify the particular file or directory affected by this error. The number of reported failing items is
     * capped to an
     * implementation-defined number.
     * 
     * + domain: NSFileProviderErrorDomain errorCode: NSFileProviderErrorUnsyncedEdits error: if the item had unsynced
     * content.
     * + domain: NSFileProviderErrorDomain errorCode: NSFileProviderErrorNonEvictable error: if the item has been marked
     * as non-purgeable by the provider.
     * + domain: NSPOSIXErrorDomain errorCode: EBUSY - if the item had open file descriptors on it.
     * + domain: NSPOSIXErrorDomain errorCode: EMLINK : if the item had several hardlinks.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NonEvictableChildren = 0xFFFFFFFFFFFFF82AL;
    /**
     * Returned by NSFileProviderManager if item eviction is failing because the item has edits that have not been
     * synced yet
     * 
     * The NSURLErrorKey will be set to with the item URL that has unsynced content.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long UnsyncedEdits = 0xFFFFFFFFFFFFF829L;
    /**
     * Returned by NSFileProviderManager if item eviction is failing because the item has not been assigned the
     * evictable capability.
     * 
     * The NSURLErrorKey will be set to with the corresponding item URL.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long NonEvictable = 0xFFFFFFFFFFFFF828L;
    /**
     * The provider disallowed the deletion of the item.
     * 
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForRejectedDeletionOfItem:] to build an error
     * with this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForRejectedDeletionOfItem:]
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DeletionRejected = 0xFFFFFFFFFFFFFC12L;
    /**
     * We're trying to non-recursively delete a non-empty directory
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DirectoryNotEmpty = 0xFFFFFFFFFFFFFC11L;
    /**
     * Returned by NSFileProviderManager if no provider could be found in the application
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ProviderNotFound = 0xFFFFFFFFFFFFF82FL;
    /**
     * Indicates that synchronization cannot happen.
     * 
     * This error can be returned by the provider or the system.
     * 
     * This is returned by NSFileProviderManager if a barrier failed for a sync-related error.
     * 
     * If the failure is caused by a specific item, the NSFileProviderErrorItemKey will be set to the corresponding item
     * identifier
     * and the NSUnderlyingErrorKey will be set to the error encountered by that item.
     * 
     * When a provider returns that error, it means the syncing an item is definitively broken, and cannot be resolved
     * without an update of
     * either the provider or the system.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long CannotSynchronize = 0xFFFFFFFFFFFFF82BL;
    /**
     * Returned by createItemBasedOnTemplate or modifyItem if the provider does not wish to sync the item.
     * 
     * When a provider returns this error, it causes the item to be excluded from sync. The system will ensure that
     * the item (and any descendents, in case of a directory), are downloaded, and then issue a deleteItem call to the
     * provider for the item.
     * 
     * The system will call createItemBasedOnTemplate for the item, whenever the item's metadata changes on disk.
     * This ensures that the provider's rules for excluding from sync are re-evaluated whenever the
     * item's properties change.
     * 
     * Re-evaluating items
     * ------
     * 
     * If the provider wishes for previously excluded items to be re-sent as createItemBasedOnTemplate calls,
     * the provider may call -[NSFileProviderManager signalErrorResolved:completionHandler:] with this error code.
     * 
     * If the provider wishes to exclude items which had previously been synced, the provider may call
     * -[NSFileProviderManager requestModificationOfFields:forItemWithIdentifier:options:completionHandler:].
     * This will cause the system to send a new modifyItem call to the provider. At that time, the provider can choose
     * to
     * return this error code.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ExcludedFromSync = 0xFFFFFFFFFFFFF826L;
    /**
     * Returned by the system to indicate that the domain is disabled by the user, and therefore the operation cannot be
     * completed.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long DomainDisabled = 0xFFFFFFFFFFFFF825L;
}

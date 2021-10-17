package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSFileProviderErrorCode {
    @Generated
    private NSFileProviderErrorCode() {
    }

    /**
     * The user credentials cannot be verified
     */
    @Generated @NInt public static final long NotAuthenticated = 0xFFFFFFFFFFFFFC18L;
    /**
     * An item already exists with the same parentItemIdentifier and filename (or with a filename differing only in case.)
     * <p>
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:] to build an error with this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:]
     */
    @Generated @NInt public static final long FilenameCollision = 0xFFFFFFFFFFFFFC17L;
    /**
     * The value of the sync anchor is too old, and the system must re-sync from scratch
     */
    @Generated @NInt public static final long SyncAnchorExpired = 0xFFFFFFFFFFFFFC16L;
    /**
     * The value of the page token is too old, and the system must re-sync from scratch
     */
    @Generated @NInt public static final long PageExpired = 0xFFFFFFFFFFFFFC16L;
    /**
     * The item has not been uploaded because it would push the account over quota
     */
    @Generated @NInt public static final long InsufficientQuota = 0xFFFFFFFFFFFFFC15L;
    /**
     * Connecting to the servers failed
     */
    @Generated @NInt public static final long ServerUnreachable = 0xFFFFFFFFFFFFFC14L;
    /**
     * The requested item doesn't exist
     * <p>
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:] to build an error with this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:]
     */
    @Generated @NInt public static final long NoSuchItem = 0xFFFFFFFFFFFFFC13L;
    /**
     * Returned by NSFileProviderManager if directory eviction failed because the target contains non-evictable items.
     * <p>
     * -[NSError underlyingErrors] is set to an array of the underlying errors. Each one has NSURLErrorKey set
     * to identify the particular file or directory affected by this error. The number of reported failing items is capped to an
     * implementation-defined number.
     * <p>
     * + domain: NSFileProviderErrorDomain errorCode: NSFileProviderErrorUnsyncedEdits error: if the item had unsynced content.
     * + domain: NSFileProviderErrorDomain errorCode: NSFileProviderErrorNonEvictable error: if the item has been marked as non-purgeable by the provider.
     * + domain: NSPOSIXErrorDomain errorCode: EBUSY - if the item had open file descriptors on it.
     * + domain: NSPOSIXErrorDomain errorCode: EMLINK : if the item had several hardlinks.
     */
    @Generated @NInt public static final long NonEvictableChildren = 0xFFFFFFFFFFFFF82AL;
    /**
     * Returned by NSFileProviderManager if item eviction is failing because the item has edits that have not been synced yet
     * <p>
     * The NSURLErrorKey will be set to with the item URL that has unsynced content.
     */
    @Generated @NInt public static final long UnsyncedEdits = 0xFFFFFFFFFFFFF829L;
    /**
     * Returned by NSFileProviderManager if item eviction is failing because the item has not been assigned the evictable capability.
     * <p>
     * The NSURLErrorKey will be set to with the corresponding item URL.
     */
    @Generated @NInt public static final long NonEvictable = 0xFFFFFFFFFFFFF828L;
}

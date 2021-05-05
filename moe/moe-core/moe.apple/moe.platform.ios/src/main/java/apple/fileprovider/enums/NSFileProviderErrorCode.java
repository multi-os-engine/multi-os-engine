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
     * 
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
     * 
     * \note Please use -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:] to build an error with this code.
     * \see -[NSError (NSFileProviderError) fileProviderErrorForNonExistentItemWithIdentifier:]
     */
    @Generated @NInt public static final long NoSuchItem = 0xFFFFFFFFFFFFFC13L;
}
package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSFileProviderItemCapabilities {
    @Generated
    private NSFileProviderItemCapabilities() {
    }

    /**
     * Indicates that the file can be opened for reading. If set on a folder
     * this is equivalent to @c .allowsContentEnumerating.
     */
    @Generated @NUInt public static final long Reading = 0x0000000000000001L;
    /**
     * Indicates that the file can be opened for writing. If set on a folder,
     * this is equivalent to @c .allowsAddingSubItems.
     */
    @Generated @NUInt public static final long Writing = 0x0000000000000002L;
    /**
     * Indicates that the item can be moved to another folder
     */
    @Generated @NUInt public static final long Reparenting = 0x0000000000000004L;
    /**
     * Indicates that the item can be renamed
     */
    @Generated @NUInt public static final long Renaming = 0x0000000000000008L;
    /**
     * Indicates that the item can be moved to the trash
     */
    @Generated @NUInt public static final long Trashing = 0x0000000000000010L;
    /**
     * Indicates that the item can be deleted
     */
    @Generated @NUInt public static final long Deleting = 0x0000000000000020L;
    /**
     * Indicates that items can be imported to the folder. If set on a file,
     * this is equivalent to @c .allowsWriting.
     */
    @Generated @NUInt public static final long AddingSubItems = 0x0000000000000002L;
    /**
     * Indicates that the folder can be enumerated. If set on a file, this is
     * equivalent to @c .allowsReading.
     */
    @Generated @NUInt public static final long ContentEnumerating = 0x0000000000000001L;
    /**
     * Indicates that the folder can be enumerated. If set on a file, this is
     * equivalent to @c .allowsReading.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This capability is no longer supported, and does not contain all capabilities. Please migrate
     * to directly specifying each of the individual capabilities that should be allowed for the item.
     */
    @Deprecated @Generated @NUInt public static final long All = 0x000000000000003FL;
    /**
     * Indicates that the item can be evicted.
     * 
     * If this capability is set on an item, the item will become evictable when the item is fully uploaded
     * (-[NSFileProviderItem isUploaded] not implemented or set to YES), is not actively used and contains no
     * local changes. The eviction can happen either because the user selected the "Remove Download" option
     * in Finder, because the provider decided to evict the item using `-[NSFileProviderManager
     * evictItemWithIdentifier:completionHandler:]`,
     * or because the system ran into a low-disk space scenario.
     * 
     * If this capability is not present, the item will never be evicted.
     * If the provider wishes to only suppress the user's ability to evict the item in the UI (but retain the ability
     * of the OS or the provider's program to evict items), the provider can set the following key to false in
     * their Info.plist, in the NSExtension section: NSExtensionFileProviderAllowsUserControlledEviction
     */
    @Generated @NUInt public static final long Evicting = 0x0000000000000040L;
}
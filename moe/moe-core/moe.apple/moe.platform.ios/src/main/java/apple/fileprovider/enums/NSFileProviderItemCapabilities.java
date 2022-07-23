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
     */
    @Generated @NUInt public static final long All = 0x000000000000003FL;
}
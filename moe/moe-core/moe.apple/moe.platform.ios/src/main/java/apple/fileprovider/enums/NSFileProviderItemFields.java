package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * NSFileProviderItemContents corresponds to the item's contents.
 * 
 * Each subsequent field corresponds to a property on NSFileProviderItem that can
 * change.
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderItemFields {
    @Generated
    private NSFileProviderItemFields() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Contents = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Filename = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ParentItemIdentifier = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long LastUsedDate = 0x0000000000000008L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long TagData = 0x0000000000000010L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long FavoriteRank = 0x0000000000000020L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long CreationDate = 0x0000000000000040L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ContentModificationDate = 0x0000000000000080L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long FileSystemFlags = 0x0000000000000100L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long ExtendedAttributes = 0x0000000000000200L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long TypeAndCreator = 0x0000000000000400L;
}
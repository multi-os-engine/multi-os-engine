package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CTFontCollectionCopyOptions
 * 
 * Option bits for use with CTFontCollectionCopyFontAttribute(s).
 * 
 * [@constant] kCTFontCollectionCopyStandardSort
 * Passing this option indicates that the return values should be sorted in standard UI order, suitable for display to
 * the user. This is the same sorting behavior used by NSFontPanel and Font Book.
 * 
 * [@constant] kCTFontCollectionCopyUnique
 * Passing this option indicates that duplicate values should be removed from the results.
 * 
 * API-Since: 12.0
 */
@Generated
public final class CTFontCollectionCopyOptions {
    @Generated
    private CTFontCollectionCopyOptions() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated public static final int DefaultOptions = 0x00000000;
    /**
     * API-Since: 12.0
     */
    @Generated public static final int Unique = 0x00000001;
    /**
     * API-Since: 12.0
     */
    @Generated public static final int StandardSort = 0x00000002;
}

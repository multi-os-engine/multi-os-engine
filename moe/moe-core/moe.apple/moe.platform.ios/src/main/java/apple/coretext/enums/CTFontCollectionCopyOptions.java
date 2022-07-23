package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] CTFontCollectionCopyOptions
 * <p>
 * Option bits for use with CTFontCollectionCopyFontAttribute(s).
 * <p>
 * [@constant] kCTFontCollectionCopyStandardSort
 * Passing this option indicates that the return values should be sorted in standard UI order, suitable for display to
 * the user. This is the same sorting behavior used by NSFontPanel and Font Book.
 * <p>
 * [@constant] kCTFontCollectionCopyUnique
 * Passing this option indicates that duplicate values should be removed from the results.
 */
@Generated
public final class CTFontCollectionCopyOptions {
    @Generated
    private CTFontCollectionCopyOptions() {
    }

    @Generated public static final int DefaultOptions = 0x00000000;
    @Generated public static final int Unique = 0x00000001;
    @Generated public static final int StandardSort = 0x00000002;
}

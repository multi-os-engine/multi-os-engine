package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Types of glyphs that may appear in the trailing region of a message cell.
 */
@Generated
public final class CPMessageTrailingItem {
    @Generated
    private CPMessageTrailingItem() {
    }

    /**
     * The list item will render without a trailing glyph.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The list item will render with a mute glyph on the trailing side.
     */
    @Generated @NInt public static final long Mute = 0x0000000000000001L;
}
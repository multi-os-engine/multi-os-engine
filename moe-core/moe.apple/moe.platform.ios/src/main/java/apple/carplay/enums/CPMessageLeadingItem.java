package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Types of glyphs that may appear in the leading region of a message cell.
 */
@Generated
public final class CPMessageLeadingItem {
    @Generated
    private CPMessageLeadingItem() {
    }

    /**
     * The list item will render without a leading glyph.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The list item will render with a pin glyph on the leading side.
     */
    @Generated @NInt public static final long Pin = 0x0000000000000001L;
    /**
     * The list item will render with a star glyph on the leading side.
     */
    @Generated @NInt public static final long Star = 0x0000000000000002L;
}
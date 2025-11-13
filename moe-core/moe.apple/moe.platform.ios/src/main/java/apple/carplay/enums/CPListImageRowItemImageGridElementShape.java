package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Types of shape used to draw a list item.
 */
@Generated
public final class CPListImageRowItemImageGridElementShape {
    @Generated
    private CPListImageRowItemImageGridElementShape() {
    }

    /**
     * The list item will render a row of elements.
     */
    @Generated @NInt public static final long Circular = 0x0000000000000000L;
    /**
     * The list item will render a condensed list of rounded rectangle elements.
     */
    @Generated @NInt public static final long RoundedRectangle = 0x0000000000000001L;
}
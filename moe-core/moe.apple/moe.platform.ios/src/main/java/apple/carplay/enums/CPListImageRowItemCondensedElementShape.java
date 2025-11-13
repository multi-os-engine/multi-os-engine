package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Types of shape used to draw a condensed row element.
 */
@Generated
public final class CPListImageRowItemCondensedElementShape {
    @Generated
    private CPListImageRowItemCondensedElementShape() {
    }

    /**
     * The list item will render an element with a circular image.
     */
    @Generated @NInt public static final long Circular = 0x0000000000000000L;
    /**
     * The list item will render an element with a rounded rectangle image.
     */
    @Generated @NInt public static final long RoundedRectangle = 0x0000000000000001L;
}
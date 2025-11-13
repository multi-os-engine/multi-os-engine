package apple.touchcontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the role for a control label. This determines the type of control on
 * the touch controller's associated GCController.
 * 
 * API-Since: 26.0
 */
@Generated
public final class TCControlLabelRole {
    @Generated
    private TCControlLabelRole() {
    }

    /**
     * A label for a button input controller.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Button = 0x0000000000000000L;
    /**
     * A label for a direction pad controller.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long DirectionPad = 0x0000000000000001L;
}
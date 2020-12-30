package apple.gamecontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Represents the current state of a touch event on a touchpad.
 */
@Generated
public final class GCTouchState {
    @Generated
    private GCTouchState() {
    }

    @Generated @NInt public static final long Up = 0x0000000000000000L;
    @Generated @NInt public static final long Down = 0x0000000000000001L;
    @Generated @NInt public static final long Moving = 0x0000000000000002L;
}
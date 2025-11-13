package apple.touchcontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the shape of a control collider.
 * 
 * API-Since: 26.0
 */
@Generated
public final class TCColliderShape {
    @Generated
    private TCColliderShape() {
    }

    /**
     * A circular collider.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Circle = 0x0000000000000000L;
    /**
     * A rectangular collider.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Rect = 0x0000000000000001L;
    /**
     * A collider representing the left side of the view the touch controller is embedded in. Useful for thumbsticks and
     * delta controls, so the user can easily hit the control without looking closely.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long LeftSide = 0x0000000000000002L;
    /**
     * A collider representing the right side of the view the touch controller is embedded in. Useful for thumbsticks
     * and delta controls, so the user can easily hit the control without looking closely.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long RightSide = 0x0000000000000003L;
}
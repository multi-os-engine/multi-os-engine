package apple.scenekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] SCNNodeFocusBehavior
 * <p>
 * Control the focus (UIFocus) behavior.
 */
@Generated
public final class SCNNodeFocusBehavior {
    @Generated
    private SCNNodeFocusBehavior() {
    }

    /**
     * Not focusable and node has no impact on other nodes that have focus interaction enabled.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Not focusable, but will prevent other focusable nodes that this node visually obscures from being focusable.
     */
    @Generated @NInt public static final long Occluding = 0x0000000000000001L;
    /**
     * Focusable and will also prevent other focusable nodes that this node visually obscures from being focusable.
     */
    @Generated @NInt public static final long Focusable = 0x0000000000000002L;
}

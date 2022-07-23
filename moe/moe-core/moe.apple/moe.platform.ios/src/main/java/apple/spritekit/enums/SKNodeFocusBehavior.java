package apple.spritekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class SKNodeFocusBehavior {
    @Generated
    private SKNodeFocusBehavior() {
    }

    /**
     * Not focusable and node has no impact on other nodes that have focus interaction enabled. This is the default.
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
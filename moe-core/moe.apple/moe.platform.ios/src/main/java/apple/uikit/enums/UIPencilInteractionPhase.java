package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The phase of an interaction gesture performed on the pencil.
 * 
 * If the gesture is discrete, the phase will be ``UIPencilInteractionPhaseEnded``
 * 
 * API-Since: 17.5
 */
@Generated
public final class UIPencilInteractionPhase {
    @Generated
    private UIPencilInteractionPhase() {
    }

    /**
     * A continuous gesture on the pencil began
     * 
     * API-Since: 17.5
     */
    @Generated @NUInt public static final long Began = 0x0000000000000000L;
    /**
     * A continuous gesture on the pencil changed
     * 
     * API-Since: 17.5
     */
    @Generated @NUInt public static final long Changed = 0x0000000000000001L;
    /**
     * A continuous gesture on the pencil ended, or a discrete gesture on the pencil recognized
     * 
     * API-Since: 17.5
     */
    @Generated @NUInt public static final long Ended = 0x0000000000000002L;
    /**
     * A continuous gesture on the pencil was cancelled
     * 
     * API-Since: 17.5
     */
    @Generated @NUInt public static final long Cancelled = 0x0000000000000003L;
}
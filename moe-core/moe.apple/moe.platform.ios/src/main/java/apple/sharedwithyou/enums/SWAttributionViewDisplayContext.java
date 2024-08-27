package apple.sharedwithyou.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The context for the content being displayed; influences future ranking of this view's SWHighlight
 * 
 * Set the appropriate display context on SWAttributionView before it is added to a window. This informs the system
 * about how the user is consuming the attributed content, and influences future relevancy ranking of the SWHighlight
 * for this view.
 * 
 * API-Since: 16.0
 */
@Generated
public final class SWAttributionViewDisplayContext {
    @Generated
    private SWAttributionViewDisplayContext() {
    }

    /**
     * The default context. Indicates that the attributed content shown along with this view is being offered to the
     * user for consumption
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Summary = 0x0000000000000000L;
    /**
     * Indicates that the attributed content shown along with this view is being actively consumed by the user
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Detail = 0x0000000000000001L;
}
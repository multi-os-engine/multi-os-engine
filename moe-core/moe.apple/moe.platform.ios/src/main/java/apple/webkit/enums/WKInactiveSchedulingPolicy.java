package apple.webkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] WKInactiveSchedulingPolicy
 * 
 * An enum that represents the available options for scheduling behavior when a web view is idle and detached from all
 * windows.
 * 
 * The WKInactiveSchedulingSuspend case indicates that the web view should be fully suspended when idle. The
 * WKInactiveSchedulingThrottle case indicates that the web view should be CPU-throttled when idle, but not fully
 * suspended. The WKInactiveSchedulingNone case indicates that no special scheduling behavior should be applied, and the
 * web view should continue running normally even when idle.
 * 
 * API-Since: 17.0
 */
@Generated
public final class WKInactiveSchedulingPolicy {
    @Generated
    private WKInactiveSchedulingPolicy() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Suspend = 0x0000000000000000L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Throttle = 0x0000000000000001L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long None = 0x0000000000000002L;
}
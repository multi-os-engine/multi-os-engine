package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_browser_state_t
 * 
 * Browser states sent by nw_browser_set_state_changed_handler.
 */
@Generated
public final class nw_browser_state_t {
    @Generated
    private nw_browser_state_t() {
    }

    /**
     * [@const] nw_browser_state_invalid The state of the browser is not valid.
     * This state will never be delivered in the browser's state update
     * handler and can be treated as an unexpected value.
     */
    @Generated public static final int nw_browser_state_invalid = 0x00000000;
    /**
     * [@const] nw_browser_state_ready The browser is ready and able to receive
     * endpoint updates. All callbacks from the browse_results_changed_handler
     * occur when the browser is in this state.
     */
    @Generated public static final int nw_browser_state_ready = 0x00000001;
    /**
     * [@const] nw_browser_state_failed The browser has irrecoverably failed.
     * You should not try to call nw_browser_start() on the browser to restart
     * it. Instead, cancel the browser and create a new browser object.
     */
    @Generated public static final int nw_browser_state_failed = 0x00000002;
    /**
     * [@const] nw_browser_state_cancelled The browser has been cancelled by
     * the caller. You should not try to call nw_browser_start() on the
     * browser to restart it. Instead, create a new browser object.
     */
    @Generated public static final int nw_browser_state_cancelled = 0x00000003;
    /**
     * [@const] nw_browser_state_waiting The browser is waiting for connectivity.
     * Results will not be delivered until the browser moves into the ready
     * state. A browser can move from the ready state into the waiting state.
     * The associated error indicates why the browser is unable to browse.
     */
    @Generated public static final int nw_browser_state_waiting = 0x00000004;
}

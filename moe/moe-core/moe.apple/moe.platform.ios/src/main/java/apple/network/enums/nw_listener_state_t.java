package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_listener_state_t
 * <p>
 * Listener states sent by nw_listener_set_state_changed_handler.
 * States progress forward and do not move backwards.
 */
@Generated
public final class nw_listener_state_t {
    @Generated
    private nw_listener_state_t() {
    }

    /**
     * [@const] nw_listener_state_invalid The state of the listener is not valid. This state
     * will never be delivered in the listener's state update handler, and can be treated as
     * an unexpected value.
     */
    @Generated public static final int nw_listener_state_invalid = 0x00000000;
    /**
     * [@const] nw_listener_state_waiting The listener is waiting for a usable network before being able to receive connections
     */
    @Generated public static final int nw_listener_state_waiting = 0x00000001;
    /**
     * [@const] nw_listener_state_ready The listener is ready and able to accept incoming connections
     */
    @Generated public static final int nw_listener_state_ready = 0x00000002;
    /**
     * [@const] nw_listener_state_failed The listener has irrecoverably closed or failed
     */
    @Generated public static final int nw_listener_state_failed = 0x00000003;
    /**
     * [@const] nw_listener_state_cancelled The listener has been cancelled by the caller
     */
    @Generated public static final int nw_listener_state_cancelled = 0x00000004;
}

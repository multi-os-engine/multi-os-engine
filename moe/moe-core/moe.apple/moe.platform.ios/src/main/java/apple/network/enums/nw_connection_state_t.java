package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_connection_state_t
 * 
 * 	Connection states sent by nw_connection_set_state_changed_handler.
 * 	States generally progress forward and do not move backwards, with the
 * 	exception of preparing and waiting, which may alternate before the connection
 * 	becomes ready or failed.
 */
@Generated
public final class nw_connection_state_t {
    @Generated
    private nw_connection_state_t() {
    }

    /**
     * [@const] nw_connection_state_invalid The state of the connection is not valid. This state
     * 	will never be delivered in the connection's state update handler, and can be treated as
     * 	an unexpected value.
     */
    @Generated public static final int nw_connection_state_invalid = 0x00000000;
    /**
     * [@const] nw_connection_state_waiting The connection is waiting for a usable network before re-attempting
     */
    @Generated public static final int nw_connection_state_waiting = 0x00000001;
    /**
     * [@const] nw_connection_state_preparing The connection is in the process of establishing
     */
    @Generated public static final int nw_connection_state_preparing = 0x00000002;
    /**
     * [@const] nw_connection_state_ready The connection is established and ready to send and receive data upon
     */
    @Generated public static final int nw_connection_state_ready = 0x00000003;
    /**
     * [@const] nw_connection_state_failed The connection has irrecoverably closed or failed
     */
    @Generated public static final int nw_connection_state_failed = 0x00000004;
    /**
     * [@const] nw_connection_state_cancelled The connection has been cancelled by the caller
     */
    @Generated public static final int nw_connection_state_cancelled = 0x00000005;
}
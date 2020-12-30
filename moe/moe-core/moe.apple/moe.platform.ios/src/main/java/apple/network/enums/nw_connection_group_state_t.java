package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @typedef nw_connection_group_state_t
 * @abstract
 * 	Connection Group states sent by nw_connection_group_set_state_changed_handler.
 * 	States progress forward and do not move backwards.
 */
@Generated
public final class nw_connection_group_state_t {
    @Generated
    private nw_connection_group_state_t() {
    }

    /**
     * @const nw_connection_group_state_invalid The state of the connection group is not valid.
     * 	This state will never be delivered in the connection group's state update
     * 	handler and can be treated as an unexpected value.
     */
    @Generated public static final int nw_connection_group_state_invalid = 0x00000000;
    /**
     * @const nw_connection_group_state_waiting The connection group is waiting for a usable network
     * 	before being able to receive and process incoming messages.
     */
    @Generated public static final int nw_connection_group_state_waiting = 0x00000001;
    /**
     * @const nw_connection_group_state_ready The connection group is ready and able to receive and
     * 	process incoming messages.
     */
    @Generated public static final int nw_connection_group_state_ready = 0x00000002;
    /**
     * @const nw_connection_group_state_failed The connection group has irrecoverably failed.
     * 	You should cancel the connection group and create a new connection group object
     * 	if you wish to continue processing incoming messages.
     */
    @Generated public static final int nw_connection_group_state_failed = 0x00000003;
    /**
     * @const nw_connection_group_state_cancelled The connection group has been cancelled by
     * 	the user. You should create a new connection group object if you wish to continue
     * 	processing incoming messages.
     */
    @Generated public static final int nw_connection_group_state_cancelled = 0x00000004;
}
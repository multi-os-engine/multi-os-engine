package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ws_response_status_t
 * <p>
 * The status of a WebSocket server's response to a client's request to
 * connect.
 */
@Generated
public final class nw_ws_response_status_t {
    @Generated
    private nw_ws_response_status_t() {
    }

    /**
     * [@const] nw_ws_response_status_invalid The response is invalid. This should
     * be treated as an unexpected value.
     */
    @Generated public static final int nw_ws_response_status_invalid = 0x00000000;
    /**
     * [@const] nw_ws_response_status_accept Accept the request to connect. The
     * WebSocket connection will begin framing data.
     */
    @Generated public static final int nw_ws_response_status_accept = 0x00000001;
    /**
     * [@const] nw_ws_response_status_accept Reject the request to connect. The
     * WebSocket connection will be closed.
     */
    @Generated public static final int nw_ws_response_status_reject = 0x00000002;
}

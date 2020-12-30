package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @typedef nw_ws_close_code_t
 * @abstract
 * 	WebSocket close codes that describe the reason for closing a WebSocket
 * 	connection. Endpoints MAY use the following pre-defined status codes
 * 	when sending a Close frame.
 */
@Generated
public final class nw_ws_close_code_t {
    @Generated
    private nw_ws_close_code_t() {
    }

    /**
     * @const nw_ws_close_code_normal_closure Indicates a normal closure,
     * 	meaning that the purpose for which the connection was established
     * 	has been fulfilled.
     */
    @Generated public static final int nw_ws_close_code_normal_closure = 0x000003E8;
    /**
     * @const nw_ws_close_code_normal_going_away Indicates that an endpoint is
     * 	"going away", such as a server going down or a browser having
     * 	navigated away from a page.
     */
    @Generated public static final int nw_ws_close_code_going_away = 0x000003E9;
    /**
     * @const nw_ws_close_code_protocol_error Indicates that an endpoint is
     * 	terminating the connection due to a protocol error.
     */
    @Generated public static final int nw_ws_close_code_protocol_error = 0x000003EA;
    /**
     * @const nw_ws_close_code_normal_closure Indicates that an endpoint is
     * 	terminating the connection because it has received a type of data
     * 	it cannot accept (e.g., an endpoint that understands only text data
     * 	MAY send this if it receives a binary message).
     */
    @Generated public static final int nw_ws_close_code_unsupported_data = 0x000003EB;
    /**
     * @const nw_ws_close_code_no_status_received A reserved value and MUST NOT
     * 	be set as a status code in a Close control frame by an endpoint. It
     * 	is designated for use in applications expecting a status code to
     * 	indicate that no status code was actually present.
     */
    @Generated public static final int nw_ws_close_code_no_status_received = 0x000003ED;
    /**
     * @const nw_ws_close_code_abnormal_closure A reserved value and MUST NOT
     * 	be set as a status code in a Close control frame by an endpoint.
     * 	It is designated for use in applications expecting a status code to
     * 	indicate that the connection was closed abnormally, e.g., without
     * 	sending or receiving a Close control frame.
     */
    @Generated public static final int nw_ws_close_code_abnormal_closure = 0x000003EE;
    /**
     * @const nw_ws_close_code_invalid_frame_payload_data Indicates that an
     * 	endpoint is terminating the connection because it has received data
     * 	within a message that was not consistent with the type of the
     * 	message (e.g., non-UTF-8 [RFC3629] data within a text message).
     */
    @Generated public static final int nw_ws_close_code_invalid_frame_payload_data = 0x000003EF;
    /**
     * @const nw_ws_close_code_policy_violation Indicates that an endpoint is
     * 	terminating the connection because it has received a message that
     * 	violates its policy. This is a generic status code that can be
     * 	returned when there is no other more suitable status code (e.g.,
     * 	1003 or 1009) or if there is a need to hide specific details about
     * 	the policy.
     */
    @Generated public static final int nw_ws_close_code_policy_violation = 0x000003F0;
    /**
     * @const nw_ws_close_code_message_too_big Indicates that an endpoint is
     * 	terminating the connection because it has received a message that
     * 	is too big for it to process.
     */
    @Generated public static final int nw_ws_close_code_message_too_big = 0x000003F1;
    /**
     * @const nw_ws_close_code_mandatory_extension Indicates that an endpoint
     * 	(client) is terminating the connection because it has expected the
     * 	server to negotiate one or more extensions, but the server didn't
     * 	return them in the response message of the WebSocket handshake. The
     * 	list of extensions that are needed SHOULD appear in the /reason/
     * 	part of the Close frame. Note that this status code is not used by
     * 	the server, because it can fail the WebSocket handshake instead.
     */
    @Generated public static final int nw_ws_close_code_mandatory_extension = 0x000003F2;
    /**
     * @const nw_ws_close_code_internal_server_error Indicates that a server is
     * 	terminating the connection because it encountered an unexpected
     * 	condition that prevented it from fulfilling the request.
     */
    @Generated public static final int nw_ws_close_code_internal_server_error = 0x000003F3;
    /**
     * @const nw_ws_close_code_tls_handshake A reserved value and MUST NOT
     * 	be set as a status code in a Close control frame by an endpoint. It
     * 	is designated for use in applications expecting a status code to
     * 	indicate that the connection was closed due to a failure to perform
     * 	a TLS handshake (e.g., the server certificate can't be verified).
     */
    @Generated public static final int nw_ws_close_code_tls_handshake = 0x000003F7;
}
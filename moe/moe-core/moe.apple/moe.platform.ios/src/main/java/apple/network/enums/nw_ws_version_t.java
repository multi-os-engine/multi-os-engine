package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ws_version_t
 * <p>
 * The WebSocket Protocol version.
 */
@Generated
public final class nw_ws_version_t {
    @Generated
    private nw_ws_version_t() {
    }

    /**
     * [@const] nw_ws_version_invalid An invalid WebSocket version
     */
    @Generated public static final int nw_ws_version_invalid = 0x00000000;
    /**
     * [@const] nw_ws_version_13 WebSocket v13 as defined in RFC 6455
     */
    @Generated public static final int nw_ws_version_13 = 0x00000001;
}

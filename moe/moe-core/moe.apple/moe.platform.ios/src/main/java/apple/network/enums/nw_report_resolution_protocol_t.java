package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_report_resolution_protocol_t
 * 
 * The protocol used for endpoint resolution.
 */
@Generated
public final class nw_report_resolution_protocol_t {
    @Generated
    private nw_report_resolution_protocol_t() {
    }

    /**
     * [@const] nw_report_resolution_protocol_unknown The protocol used is not known, or not applicable
     */
    @Generated public static final int nw_report_resolution_protocol_unknown = 0x00000000;
    /**
     * [@const] nw_report_resolution_protocol_udp Resolution used DNS over UDP
     */
    @Generated public static final int nw_report_resolution_protocol_udp = 0x00000001;
    /**
     * [@const] nw_report_resolution_protocol_tcp Resolution used DNS over TCP
     */
    @Generated public static final int nw_report_resolution_protocol_tcp = 0x00000002;
    /**
     * [@const] nw_report_resolution_protocol_tls Resolution used DNS over TLS
     */
    @Generated public static final int nw_report_resolution_protocol_tls = 0x00000003;
    /**
     * [@const] nw_report_resolution_protocol_https Resolution used DNS over HTTPS
     */
    @Generated public static final int nw_report_resolution_protocol_https = 0x00000004;
}

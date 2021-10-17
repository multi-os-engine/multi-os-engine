package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_endpoint_type_t
 * <p>
 * Endpoint types represent a well-known form of endpoint. Values may be
 * added to this enumeration, and some custom endpoint types may use
 * values not defined in this enumeration.
 */
@Generated
public final class nw_endpoint_type_t {
    @Generated
    private nw_endpoint_type_t() {
    }

    /**
     * [@const] nw_endpoint_type_invalid An invalid endpoint
     */
    @Generated public static final int nw_endpoint_type_invalid = 0x00000000;
    /**
     * [@const] nw_endpoint_type_address An IP Address + Port
     */
    @Generated public static final int nw_endpoint_type_address = 0x00000001;
    /**
     * [@const] nw_endpoint_type_host A Hostname + Port
     */
    @Generated public static final int nw_endpoint_type_host = 0x00000002;
    /**
     * [@const] nw_endpoint_type_bonjour_service A Bonjour Service Name + Type + Domain
     */
    @Generated public static final int nw_endpoint_type_bonjour_service = 0x00000003;
    /**
     * [@const] nw_endpoint_type_url A URL endpoint
     */
    @Generated public static final int nw_endpoint_type_url = 0x00000004;
}

package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ip_version_t
 * <p>
 * A specific version of the Internet Protocol.
 */
@Generated
public final class nw_ip_version_t {
    @Generated
    private nw_ip_version_t() {
    }

    /**
     * [@const] nw_ip_version_any Allow any IP version
     */
    @Generated public static final int nw_ip_version_any = 0x00000000;
    /**
     * [@const] nw_ip_version_4 Use IP version 4 (IPv4)
     */
    @Generated public static final int nw_ip_version_4 = 0x00000004;
    /**
     * [@const] nw_ip_version_6 Use IP version 6 (IPv6)
     */
    @Generated public static final int nw_ip_version_6 = 0x00000006;
}

package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_error_domain_t
 * 
 * The enumeration of network error domains.
 */
@Generated
public final class nw_error_domain_t {
    @Generated
    private nw_error_domain_t() {
    }

    /**
     * [@const] nw_error_domain_invalid
     */
    @Generated public static final int nw_error_domain_invalid = 0x00000000;
    /**
     * [@const] nw_error_domain_posix The error code will be a POSIX error as defined in <sys/errno.h>
     */
    @Generated public static final int nw_error_domain_posix = 0x00000001;
    /**
     * [@const] nw_error_domain_dns The error code will be a DNSServiceErrorType error as defined in <dns_sd.h>
     */
    @Generated public static final int nw_error_domain_dns = 0x00000002;
    /**
     * [@const] nw_error_domain_tls The error code will be a TLS error as defined in <Security/SecBase.h>
     */
    @Generated public static final int nw_error_domain_tls = 0x00000003;
}

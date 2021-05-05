package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * DNS protocol used for domain resolution.
 */
@Generated
public final class NSURLSessionTaskMetricsDomainResolutionProtocol {
    @Generated
    private NSURLSessionTaskMetricsDomainResolutionProtocol() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Resolution used DNS over UDP.
     */
    @Generated @NInt public static final long UDP = 0x0000000000000001L;
    /**
     * Resolution used DNS over TCP.
     */
    @Generated @NInt public static final long TCP = 0x0000000000000002L;
    /**
     * Resolution used DNS over TLS.
     */
    @Generated @NInt public static final long TLS = 0x0000000000000003L;
    /**
     * Resolution used DNS over HTTPS.
     */
    @Generated @NInt public static final long HTTPS = 0x0000000000000004L;
}
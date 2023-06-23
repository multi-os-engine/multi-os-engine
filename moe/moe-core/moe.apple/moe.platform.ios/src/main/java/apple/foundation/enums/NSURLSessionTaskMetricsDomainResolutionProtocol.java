package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * DNS protocol used for domain resolution.
 * 
 * API-Since: 14.0
 */
@Generated
public final class NSURLSessionTaskMetricsDomainResolutionProtocol {
    @Generated
    private NSURLSessionTaskMetricsDomainResolutionProtocol() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * Resolution used DNS over UDP.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long UDP = 0x0000000000000001L;
    /**
     * Resolution used DNS over TCP.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TCP = 0x0000000000000002L;
    /**
     * Resolution used DNS over TLS.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long TLS = 0x0000000000000003L;
    /**
     * Resolution used DNS over HTTPS.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long HTTPS = 0x0000000000000004L;
}
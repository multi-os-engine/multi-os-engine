package apple.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 15.0
 */
@Generated
public final class DNSServiceAAAAPolicy {
    @Generated
    private DNSServiceAAAAPolicy() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated public static final int kDNSServiceAAAAPolicyNone = 0x00000000;
    /**
     * If AAAA record doesn't exist, query for A.
     * 
     * API-Since: 15.0
     */
    @Generated public static final int kDNSServiceAAAAPolicyFallback = 0x00000001;
}
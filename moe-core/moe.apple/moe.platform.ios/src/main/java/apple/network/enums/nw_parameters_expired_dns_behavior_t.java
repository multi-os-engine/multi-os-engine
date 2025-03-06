package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_parameters_expired_dns_behavior_t
 * 
 * Expired DNS behavior defines whether or not a connection will allow the use
 * of expired DNS answers during connection establishment.
 */
@Generated
public final class nw_parameters_expired_dns_behavior_t {
    @Generated
    private nw_parameters_expired_dns_behavior_t() {
    }

    /**
     * [@const] nw_parameters_expired_dns_behavior_default Let the system determine whether or not to allow expired DNS
     * answers
     */
    @Generated public static final int _default = 0x00000000;
    /**
     * [@const] nw_parameters_expired_dns_behavior_allow Explicitly allow the use of expired DNS answers
     */
    @Generated public static final int _allow = 0x00000001;
    /**
     * [@const] nw_parameters_expired_dns_behavior_allow Explicitly prohibit the use of expired DNS answers
     */
    @Generated public static final int _prohibit = 0x00000002;
    /**
     * [@const] nw_parameters_expired_dns_behavior_persistent Allow the use of expired DNS answers, and store answers in
     * a persistent per-process cache.
     * This should only be set for hostnames whose resolutions are not expected to change across networks.
     * 
     * API-Since: 18.0
     */
    @Generated public static final int _persistent = 0x00000003;
}

package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_multipath_service_t
 * 
 * 	Multipath services represent the modes of multipath usage that are
 * 	allowed for connections.
 */
@Generated
public final class nw_multipath_service_t {
    @Generated
    private nw_multipath_service_t() {
    }

    /**
     * [@const] nw_multipath_service_disabled No multipath transport will be attempted
     */
    @Generated public static final int nw_multipath_service_disabled = 0x00000000;
    /**
     * [@const] nw_multipath_service_handover Only use the expensive interface when the when the primary one is not available
     */
    @Generated public static final int nw_multipath_service_handover = 0x00000001;
    /**
     * [@const] nw_multipath_service_interactive Use the expensive interface more aggressively to reduce latency
     */
    @Generated public static final int nw_multipath_service_interactive = 0x00000002;
    /**
     * [@const] nw_multipath_service_aggregate Use all available interfaces to provide the highest throughput and lowest latency
     */
    @Generated public static final int nw_multipath_service_aggregate = 0x00000003;
}
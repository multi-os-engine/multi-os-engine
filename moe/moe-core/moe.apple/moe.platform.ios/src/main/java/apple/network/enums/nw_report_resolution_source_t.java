package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_report_resolution_source_t
 * 
 * The source of a resolution indicates if the set of endpoints was resolved
 * locally using a cache, or sent a query over the network.
 */
@Generated
public final class nw_report_resolution_source_t {
    @Generated
    private nw_report_resolution_source_t() {
    }

    /**
     * [@const] nw_report_resolution_source_query A query was sent over the network
     */
    @Generated public static final int nw_report_resolution_source_query = 0x00000001;
    /**
     * [@const] nw_report_resolution_source_cache The local cache was used
     */
    @Generated public static final int nw_report_resolution_source_cache = 0x00000002;
    /**
     * [@const] nw_report_resolution_source_expired_cache An expired entry in the local cache was used
     */
    @Generated public static final int nw_report_resolution_source_expired_cache = 0x00000003;
}

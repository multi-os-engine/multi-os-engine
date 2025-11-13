package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_link_quality_t
 * 
 * Link quality measurement is a representation of the expected capabilities of the link layer network
 * attachment. Use this value to tune initial values for algorithms that can scale with the
 * capabilities of the network. Do not use this value to gate connection attempts or to override
 * adjustments that would be made based on actual network performance.
 */
@Generated
public final class nw_link_quality_t {
    @Generated
    private nw_link_quality_t() {
    }

    /**
     * [@const] nw_link_quality_unknown No link quality measurement is available
     */
    @Generated public static final int _unknown = 0x00000000;
    /**
     * [@const] nw_link_quality_minimal Link quality is minimal
     */
    @Generated public static final int _minimal = 0x0000000A;
    /**
     * [@const] nw_link_quality_moderate Link quality is moderate
     */
    @Generated public static final int _moderate = 0x00000014;
    /**
     * [@const] nw_link_quality_good Link quality is good
     */
    @Generated public static final int _good = 0x0000001E;
}
package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ip_ecn_flag_t
 * 
 * ECN flags marked in IP headers to indicate congestion.
 */
@Generated
public final class nw_ip_ecn_flag_t {
    @Generated
    private nw_ip_ecn_flag_t() {
    }

    /**
     * [@const] nw_ip_ecn_flag_non_ect Non ECN-Capable Transport, value 0b00
     */
    @Generated public static final int nw_ip_ecn_flag_non_ect = 0x00000000;
    /**
     * [@const] nw_ip_ecn_flag_ect_0 ECN Capable Transport (0), value 0b10
     */
    @Generated public static final int nw_ip_ecn_flag_ect_0 = 0x00000002;
    /**
     * [@const] nw_ip_ecn_flag_ect_1 ECN Capable Transport (1), value 0b01
     */
    @Generated public static final int nw_ip_ecn_flag_ect_1 = 0x00000001;
    /**
     * [@const] nw_ip_ecn_flag_ce Congestion Experienced, value 0b11
     */
    @Generated public static final int nw_ip_ecn_flag_ce = 0x00000003;
}

package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_path_unsatisfied_reason_t
 * 
 * A network path unsatisfied reason may indicate the reason the path is currently unsatisfied for some conditions.
 */
@Generated
public final class nw_path_unsatisfied_reason_t {
    @Generated
    private nw_path_unsatisfied_reason_t() {
    }

    /**
     * [@const] nw_path_unsatisfied_reason_not_available No reason is given
     */
    @Generated public static final int nw_path_unsatisfied_reason_not_available = 0x00000000;
    /**
     * [@const] nw_path_unsatisfied_reason_not_available The user has disabled cellular
     */
    @Generated public static final int nw_path_unsatisfied_reason_cellular_denied = 0x00000001;
    /**
     * [@const] nw_path_unsatisfied_reason_not_available The user has disabled Wi-Fi
     */
    @Generated public static final int nw_path_unsatisfied_reason_wifi_denied = 0x00000002;
    /**
     * [@const] nw_path_unsatisfied_reason_not_available The user has disabled local network access
     */
    @Generated public static final int nw_path_unsatisfied_reason_local_network_denied = 0x00000003;
}

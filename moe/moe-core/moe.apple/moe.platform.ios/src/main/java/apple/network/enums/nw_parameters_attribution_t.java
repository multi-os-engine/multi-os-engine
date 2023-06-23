package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_parameters_attribution_t
 * 
 * Attribution values can be used to indicate who determined the network content being accessed.
 */
@Generated
public final class nw_parameters_attribution_t {
    @Generated
    private nw_parameters_attribution_t() {
    }

    /**
     * [@const] nw_parameters_attribution_developer Developer chosen content.
     */
    @Generated public static final byte _developer = 1;
    /**
     * [@const] nw_parameters_attribution_user User chosen content.
     */
    @Generated public static final byte _user = 2;
}

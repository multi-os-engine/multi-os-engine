package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ip_local_address_preference_t
 * 
 * 	Preference for local addresses selection.
 */
@Generated
public final class nw_ip_local_address_preference_t {
    @Generated
    private nw_ip_local_address_preference_t() {
    }

    /**
     * [@const] nw_ip_local_address_preference_default Use system default for address selection
     */
    @Generated public static final int nw_ip_local_address_preference_default = 0x00000000;
    /**
     * [@const] nw_ip_local_address_preference_temporary Prefer temporary (privacy) addresses
     */
    @Generated public static final int nw_ip_local_address_preference_temporary = 0x00000001;
    /**
     * [@const] nw_ip_local_address_preference_stable Prefer stable addresses
     */
    @Generated public static final int nw_ip_local_address_preference_stable = 0x00000002;
}
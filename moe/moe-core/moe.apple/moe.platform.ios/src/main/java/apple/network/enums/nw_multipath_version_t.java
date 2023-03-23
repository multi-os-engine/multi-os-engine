package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_multipath_version_t
 * 
 * Multipath versions represent the MPTCP standard versions
 */
@Generated
public final class nw_multipath_version_t {
    @Generated
    private nw_multipath_version_t() {
    }

    /**
     * [@const] nw_multipath_version_unspecified MPTCP unspecified version
     */
    @Generated public static final int nw_multipath_version_unspecified = 0xFFFFFFFF;
    /**
     * [@const] nw_multipath_version_0 MPTCP version 0
     */
    @Generated public static final int nw_multipath_version_0 = 0x00000000;
    /**
     * [@const] nw_multipath_version_1 MPTCP version 1
     */
    @Generated public static final int nw_multipath_version_1 = 0x00000001;
}

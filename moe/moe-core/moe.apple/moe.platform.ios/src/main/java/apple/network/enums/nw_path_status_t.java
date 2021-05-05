package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_path_status_t
 * 
 * 	A network path status indicates if there is a usable route available upon which to
 * 	send and receive data.
 */
@Generated
public final class nw_path_status_t {
    @Generated
    private nw_path_status_t() {
    }

    /**
     * [@const] nw_path_status_invalid The path is not valid
     */
    @Generated public static final int nw_path_status_invalid = 0x00000000;
    /**
     * [@const] nw_path_status_satisfied The path has a usable route upon which to send and receive data
     */
    @Generated public static final int nw_path_status_satisfied = 0x00000001;
    /**
     * [@const] nw_path_status_unsatisfied The path does not have a usable route. This may be due to a network interface being down, or due to system policy.
     */
    @Generated public static final int nw_path_status_unsatisfied = 0x00000002;
    /**
     * [@const] nw_path_status_satisfiable The path does not currently have a usable route, but a connection attempt will trigger network attachment
     */
    @Generated public static final int nw_path_status_satisfiable = 0x00000003;
}
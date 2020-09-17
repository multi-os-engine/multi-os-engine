package apple.network.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class nw_connection_group_state_t {
    @Generated
    private nw_connection_group_state_t() {
    }

    @Generated public static final int nw_connection_group_state_invalid = 0x00000000;
    @Generated public static final int nw_connection_group_state_waiting = 0x00000001;
    @Generated public static final int nw_connection_group_state_ready = 0x00000002;
    @Generated public static final int nw_connection_group_state_failed = 0x00000003;
    @Generated public static final int nw_connection_group_state_cancelled = 0x00000004;
}
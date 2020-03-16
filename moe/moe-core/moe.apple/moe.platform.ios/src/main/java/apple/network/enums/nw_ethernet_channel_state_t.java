package apple.network.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class nw_ethernet_channel_state_t {
    @Generated
    private nw_ethernet_channel_state_t() {
    }

    @Generated public static final int nw_ethernet_channel_state_invalid = 0x00000000;
    @Generated public static final int nw_ethernet_channel_state_waiting = 0x00000001;
    @Generated public static final int nw_ethernet_channel_state_preparing = 0x00000002;
    @Generated public static final int nw_ethernet_channel_state_ready = 0x00000003;
    @Generated public static final int nw_ethernet_channel_state_failed = 0x00000004;
    @Generated public static final int nw_ethernet_channel_state_cancelled = 0x00000005;
}
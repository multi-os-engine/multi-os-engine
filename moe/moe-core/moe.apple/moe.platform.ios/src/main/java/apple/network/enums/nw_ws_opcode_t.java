package apple.network.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class nw_ws_opcode_t {
    @Generated
    private nw_ws_opcode_t() {
    }

    @Generated public static final int nw_ws_opcode_invalid = 0xFFFFFFFF;
    @Generated public static final int nw_ws_opcode_cont = 0x00000000;
    @Generated public static final int nw_ws_opcode_text = 0x00000001;
    @Generated public static final int nw_ws_opcode_binary = 0x00000002;
    @Generated public static final int nw_ws_opcode_close = 0x00000008;
    @Generated public static final int nw_ws_opcode_ping = 0x00000009;
    @Generated public static final int nw_ws_opcode_pong = 0x0000000A;
}
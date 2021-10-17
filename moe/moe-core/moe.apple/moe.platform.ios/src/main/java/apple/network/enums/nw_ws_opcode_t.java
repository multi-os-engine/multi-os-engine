package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_ws_opcode_t
 * <p>
 * WebSocket opcodes that denote the type of frame sent or received by
 * a WebSocket endpoint. Opcodes define the interpretation of their
 * associated payload data.
 */
@Generated
public final class nw_ws_opcode_t {
    @Generated
    private nw_ws_opcode_t() {
    }

    /**
     * [@const] nw_ws_opcode_invalid Denotes an invalid frame.
     */
    @Generated public static final int nw_ws_opcode_invalid = 0xFFFFFFFF;
    /**
     * [@const] nw_ws_opcode_cont Denotes a continuation frame.
     */
    @Generated public static final int nw_ws_opcode_cont = 0x00000000;
    /**
     * [@const] nw_ws_opcode_text Denotes a text frame.
     */
    @Generated public static final int nw_ws_opcode_text = 0x00000001;
    /**
     * [@const] nw_ws_opcode_text Denotes a binary frame.
     */
    @Generated public static final int nw_ws_opcode_binary = 0x00000002;
    /**
     * [@const] nw_ws_opcode_text Denotes a close frame.
     */
    @Generated public static final int nw_ws_opcode_close = 0x00000008;
    /**
     * [@const] nw_ws_opcode_text Denotes a ping frame.
     */
    @Generated public static final int nw_ws_opcode_ping = 0x00000009;
    /**
     * [@const] nw_ws_opcode_text Denotes a pong frame.
     */
    @Generated public static final int nw_ws_opcode_pong = 0x0000000A;
}

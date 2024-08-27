package apple.network.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] nw_quic_stream_type_t
 * 
 * Represents the type of a QUIC stream.
 */
@Generated
public final class nw_quic_stream_type_t {
    @Generated
    private nw_quic_stream_type_t() {
    }

    /**
     * [@const] nw_quic_stream_type_unknown A QUIC stream whose direction can not be determined.
     */
    @Generated public static final int nw_quic_stream_type_unknown = 0x00000000;
    /**
     * [@const] nw_quic_stream_type_bidirectional A bidirectional QUIC stream.
     */
    @Generated public static final int nw_quic_stream_type_bidirectional = 0x00000001;
    /**
     * [@const] nw_quic_stream_type_unidirectional An unidirectional QUIC stream.
     */
    @Generated public static final int nw_quic_stream_type_unidirectional = 0x00000002;
    /**
     * [@const] nw_quic_stream_type_datagram A QUIC datagram stream.
     */
    @Generated public static final int nw_quic_stream_type_datagram = 0x00000003;
}

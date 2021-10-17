package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CBConnectionEvent
 * <p>
 * Represents the connection state of a peer.
 * <p>
 * [@constant] CBConnectionEventPeerDisconnected	Peer is disconnected.
 * [@constant] CBConnectionEventPeerConnected	Peer is connected.
 */
@Generated
public final class CBConnectionEvent {
    @Generated
    private CBConnectionEvent() {
    }

    @Generated @NInt public static final long Disconnected = 0x0000000000000000L;
    @Generated @NInt public static final long Connected = 0x0000000000000001L;
}

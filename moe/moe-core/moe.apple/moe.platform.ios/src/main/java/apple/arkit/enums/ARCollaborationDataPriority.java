package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the priority of the collaboration data.
 */
@Generated
public final class ARCollaborationDataPriority {
    @Generated
    private ARCollaborationDataPriority() {
    }

    /**
     * The data is important for establishing or continuing a collaborative session. For best results, use network
     * transmission mechanisms that ensure delivery, such as MCSessionSendDataModeReliable.
     */
    @Generated @NInt public static final long Critical = 0x0000000000000000L;
    /**
     * The data is time-sensitive but not important to collaborative session quality. Timely synchronization of this
     * data between participants produces a smoother shared session, but the session can continue if the data is not
     * received.
     * For best results, use network transmission mechanisms that prioritize speed over delivery guarantees, such as
     * MCSessionSendDataModeUnreliable.
     */
    @Generated @NInt public static final long Optional = 0x0000000000000001L;
}
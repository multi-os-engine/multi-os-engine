package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKVehicleConnectionSessionConnectionState {
    @Generated
    private PKVehicleConnectionSessionConnectionState() {
    }

    @Generated @NInt public static final long Disconnected = 0x0000000000000000L;
    @Generated @NInt public static final long Connected = 0x0000000000000001L;
    @Generated @NInt public static final long Connecting = 0x0000000000000002L;
    @Generated @NInt public static final long FailedToConnect = 0x0000000000000003L;
}
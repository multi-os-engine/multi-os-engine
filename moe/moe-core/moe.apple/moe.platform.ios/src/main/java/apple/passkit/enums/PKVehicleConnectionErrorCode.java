package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class PKVehicleConnectionErrorCode {
    @Generated
    private PKVehicleConnectionErrorCode() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long SessionUnableToStart = 0x0000000000000001L;
    @Generated @NInt public static final long SessionNotActive = 0x0000000000000002L;
}
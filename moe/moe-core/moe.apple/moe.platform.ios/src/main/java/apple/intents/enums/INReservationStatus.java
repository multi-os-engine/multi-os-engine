package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INReservationStatus {
    @Generated
    private INReservationStatus() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Canceled = 0x0000000000000001L;
    @Generated @NInt public static final long Pending = 0x0000000000000002L;
    @Generated @NInt public static final long Hold = 0x0000000000000003L;
    @Generated @NInt public static final long Confirmed = 0x0000000000000004L;
}
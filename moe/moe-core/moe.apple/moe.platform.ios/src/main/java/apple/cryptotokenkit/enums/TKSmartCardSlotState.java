package apple.cryptotokenkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class TKSmartCardSlotState {
    @Generated
    private TKSmartCardSlotState() {
    }

    @Generated @NInt public static final long Missing = 0x0000000000000000L;
    @Generated @NInt public static final long Empty = 0x0000000000000001L;
    @Generated @NInt public static final long Probing = 0x0000000000000002L;
    @Generated @NInt public static final long MuteCard = 0x0000000000000003L;
    @Generated @NInt public static final long ValidCard = 0x0000000000000004L;
}
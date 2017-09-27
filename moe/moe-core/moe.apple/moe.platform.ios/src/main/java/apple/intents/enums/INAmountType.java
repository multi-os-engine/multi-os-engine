package apple.intents.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class INAmountType {
    @Generated
    private INAmountType() {
    }

    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long MinimumDue = 0x0000000000000001L;
    @Generated @NInt public static final long AmountDue = 0x0000000000000002L;
    @Generated @NInt public static final long CurrentBalance = 0x0000000000000003L;
    @Generated @NInt public static final long MaximumTransferAmount = 0x0000000000000004L;
    @Generated @NInt public static final long MinimumTransferAmount = 0x0000000000000005L;
    @Generated @NInt public static final long StatementBalance = 0x0000000000000006L;
}
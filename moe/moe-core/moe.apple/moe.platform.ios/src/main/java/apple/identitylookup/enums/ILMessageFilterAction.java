package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ILMessageFilterAction {
    @Generated
    private ILMessageFilterAction() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
    @Generated @NInt public static final long Filter = 0x0000000000000002L;
    @Generated @NInt public static final long Junk = 0x0000000000000002L;
    @Generated @NInt public static final long Promotion = 0x0000000000000003L;
    @Generated @NInt public static final long Transaction = 0x0000000000000004L;
}
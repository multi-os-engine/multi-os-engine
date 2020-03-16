package apple.identitylookup.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class ILClassificationAction {
    @Generated
    private ILClassificationAction() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ReportNotJunk = 0x0000000000000001L;
    @Generated @NInt public static final long ReportJunk = 0x0000000000000002L;
    @Generated @NInt public static final long ReportJunkAndBlockSender = 0x0000000000000003L;
}
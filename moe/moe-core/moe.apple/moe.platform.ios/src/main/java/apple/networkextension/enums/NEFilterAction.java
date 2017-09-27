package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NEFilterAction {
    @Generated
    private NEFilterAction() {
    }

    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    @Generated @NInt public static final long Allow = 0x0000000000000001L;
    @Generated @NInt public static final long Drop = 0x0000000000000002L;
    @Generated @NInt public static final long Remediate = 0x0000000000000003L;
    @Generated @NInt public static final long FilterData = 0x0000000000000004L;
}
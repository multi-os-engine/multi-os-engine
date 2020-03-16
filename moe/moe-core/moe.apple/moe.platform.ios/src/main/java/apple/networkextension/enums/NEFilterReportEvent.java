package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NEFilterReportEvent {
    @Generated
    private NEFilterReportEvent() {
    }

    @Generated @NInt public static final long NewFlow = 0x0000000000000001L;
    @Generated @NInt public static final long DataDecision = 0x0000000000000002L;
    @Generated @NInt public static final long FlowClosed = 0x0000000000000003L;
}
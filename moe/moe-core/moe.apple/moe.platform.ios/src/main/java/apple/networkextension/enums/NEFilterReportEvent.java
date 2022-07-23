package apple.networkextension.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] NEFilterReportEvent
 * <p>
 * A NEFilterReportEvent represents the event that is being reported by the NEFilterReport.
 */
@Generated
public final class NEFilterReportEvent {
    @Generated
    private NEFilterReportEvent() {
    }

    /**
     * [@const] NEFilterReportEventNewFlow The report is reporting a new flow
     */
    @Generated @NInt public static final long NewFlow = 0x0000000000000001L;
    /**
     * [@const] NEFilterReportEventDataDecision The report is reporting a pass/block decision made after analyzing some
     * amount of a flow's data
     */
    @Generated @NInt public static final long DataDecision = 0x0000000000000002L;
    /**
     * [@const] NEFilterReportEventFlowClosed The report is reporting that a flow has been closed
     */
    @Generated @NInt public static final long FlowClosed = 0x0000000000000003L;
}

package apple.accessibility.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Describes the content direction of the chart (i.e. the direction in which the X axis is rendered).
 * For example, a bar chart might be leftToRight, while a pie chart might be radialClockwise.
 */
@Generated
public final class AXChartDescriptorContentDirection {
    @Generated
    private AXChartDescriptorContentDirection() {
    }

    @Generated @NInt public static final long LeftToRight = 0x0000000000000000L;
    @Generated @NInt public static final long RightToLeft = 0x0000000000000001L;
    @Generated @NInt public static final long TopToBottom = 0x0000000000000002L;
    @Generated @NInt public static final long BottomToTop = 0x0000000000000003L;
    @Generated @NInt public static final long RadialClockwise = 0x0000000000000004L;
    @Generated @NInt public static final long RadialCounterClockwise = 0x0000000000000005L;
}

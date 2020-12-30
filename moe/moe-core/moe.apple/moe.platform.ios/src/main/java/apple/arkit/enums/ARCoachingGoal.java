package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the context required for successful coaching
 */
@Generated
public final class ARCoachingGoal {
    @Generated
    private ARCoachingGoal() {
    }

    /**
     * Session requires normal tracking
     */
    @Generated @NInt public static final long Tracking = 0x0000000000000000L;
    /**
     * Session requires a horizontal plane
     */
    @Generated @NInt public static final long HorizontalPlane = 0x0000000000000001L;
    /**
     * Session requires a vertical plane
     */
    @Generated @NInt public static final long VerticalPlane = 0x0000000000000002L;
    /**
     * Session requires one plane of any type
     */
    @Generated @NInt public static final long AnyPlane = 0x0000000000000003L;
}
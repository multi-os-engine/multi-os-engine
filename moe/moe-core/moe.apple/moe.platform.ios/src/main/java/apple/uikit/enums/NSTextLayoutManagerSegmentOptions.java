package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSTextLayoutManagerSegmentOptions {
    @Generated
    private NSTextLayoutManagerSegmentOptions() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Does not allocate and pass to the enumerator
     */
    @Generated @NUInt public static final long RangeNotRequired = 0x0000000000000001L;
    /**
     * Only enumerates segments in the first and last line fragments.
     */
    @Generated @NUInt public static final long MiddleFragmentsExcluded = 0x0000000000000002L;
    /**
     * When specified, the segment is extended to the head edge
     */
    @Generated @NUInt public static final long HeadSegmentExtended = 0x0000000000000004L;
    /**
     * When specified, the segment is extended to the tail edge.
     */
    @Generated @NUInt public static final long TailSegmentExtended = 0x0000000000000008L;
    /**
     * When specified, the segment is placed based on the upstream affinity for an empty range.
     */
    @Generated @NUInt public static final long UpstreamAffinity = 0x0000000000000010L;
}

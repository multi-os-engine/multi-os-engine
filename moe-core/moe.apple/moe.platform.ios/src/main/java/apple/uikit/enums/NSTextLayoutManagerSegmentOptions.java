package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class NSTextLayoutManagerSegmentOptions {
    @Generated
    private NSTextLayoutManagerSegmentOptions() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Does not allocate and pass to the enumerator
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long RangeNotRequired = 0x0000000000000001L;
    /**
     * Only enumerates segments in the first and last line fragments.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long MiddleFragmentsExcluded = 0x0000000000000002L;
    /**
     * When specified, the segment is extended to the head edge
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long HeadSegmentExtended = 0x0000000000000004L;
    /**
     * When specified, the segment is extended to the tail edge.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long TailSegmentExtended = 0x0000000000000008L;
    /**
     * When specified, the segment is placed based on the upstream affinity for an empty range.
     * 
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long UpstreamAffinity = 0x0000000000000010L;
}

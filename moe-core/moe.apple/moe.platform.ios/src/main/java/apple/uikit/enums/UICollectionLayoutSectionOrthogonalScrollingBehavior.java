package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class UICollectionLayoutSectionOrthogonalScrollingBehavior {
    @Generated
    private UICollectionLayoutSectionOrthogonalScrollingBehavior() {
    }

    /**
     * The section will layout along the main layout axis.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The section allows users to scroll its content orthogonally with continuous scrolling.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Continuous = 0x0000000000000001L;
    /**
     * The section allows users to scroll its content orthogonally, coming to a natural stop at the leading boundary of
     * the visible group.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long ContinuousGroupLeadingBoundary = 0x0000000000000002L;
    /**
     * The section allows users to page its content orthogonally.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Paging = 0x0000000000000003L;
    /**
     * The section allows users to page its content orthogonally one group at a time.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long GroupPaging = 0x0000000000000004L;
    /**
     * The section allows users to page its content orthogonally one group at a time, centering each group.
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long GroupPagingCentered = 0x0000000000000005L;
}
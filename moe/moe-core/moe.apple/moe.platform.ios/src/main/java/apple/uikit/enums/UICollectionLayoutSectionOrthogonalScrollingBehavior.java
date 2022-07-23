package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICollectionLayoutSectionOrthogonalScrollingBehavior {
    @Generated
    private UICollectionLayoutSectionOrthogonalScrollingBehavior() {
    }

    /**
     * default behavior. Section will layout along main layout axis (i.e. configuration.scrollDirection)
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Standard scroll view behavior: UIScrollViewDecelerationRateNormal
     */
    @Generated @NInt public static final long Continuous = 0x0000000000000001L;
    /**
     * Scrolling will come to rest on the leading edge of a group boundary
     */
    @Generated @NInt public static final long ContinuousGroupLeadingBoundary = 0x0000000000000002L;
    /**
     * Standard scroll view paging behavior (UIScrollViewDecelerationRateFast) with page size == extent of the
     * collection view's bounds
     */
    @Generated @NInt public static final long Paging = 0x0000000000000003L;
    /**
     * Fractional size paging behavior determined by the sections layout group's dimension
     */
    @Generated @NInt public static final long GroupPaging = 0x0000000000000004L;
    /**
     * Same of group paging with additional leading and trailing content insets to center each group's contents along
     * the orthogonal axis
     */
    @Generated @NInt public static final long GroupPagingCentered = 0x0000000000000005L;
}
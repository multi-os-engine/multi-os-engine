package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 16.0
 */
@Generated
public final class UICollectionViewSelfSizingInvalidation {
    @Generated
    private UICollectionViewSelfSizingInvalidation() {
    }

    /**
     * No updates will take place when -invalidateIntrinsicContentSize is called on a self-sizing cell or its
     * contentView.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Calling -invalidateIntrinsicContentSize on a self-sizing cell or its contentView will cause it to be resized if
     * necessary.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Enabled = 0x0000000000000001L;
    /**
     * Calling -invalidateIntrinsicContentSize on a self-sizing cell or its contentView will cause it to be resized if
     * necessary, and
     * any Auto Layout changes within the contentView of a self-sizing cell will automatically trigger
     * -invalidateIntrinsicContentSize.
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long EnabledIncludingConstraints = 0x0000000000000002L;
}
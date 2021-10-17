package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICollectionLayoutListHeaderMode {
    @Generated
    private UICollectionLayoutListHeaderMode() {
    }

    /**
     * No headers are shown
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * Uses supplementary views of kind UICollectionElementKindSectionHeader to show headers
     */
    @Generated @NInt public static final long Supplementary = 0x0000000000000001L;
    /**
     * Styles the first item in a section as a header. This is especially useful when using hierarchical data sources to be able to expand and collapse the header.
     */
    @Generated @NInt public static final long FirstItemInSection = 0x0000000000000002L;
}
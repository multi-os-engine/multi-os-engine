package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UICollectionLayoutListHeaderMode {
    @Generated
    private UICollectionLayoutListHeaderMode() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * No headers are shown
     */
    @Generated @NInt public static final long Supplementary = 0x0000000000000001L;
    /**
     * Uses supplementary views of kind UICollectionElementKindSectionHeader to show headers
     */
    @Generated @NInt public static final long FirstItemInSection = 0x0000000000000002L;
}
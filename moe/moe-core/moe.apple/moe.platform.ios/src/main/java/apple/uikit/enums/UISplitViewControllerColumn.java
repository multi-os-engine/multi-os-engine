package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UISplitViewControllerColumn {
    @Generated
    private UISplitViewControllerColumn() {
    }

    @Generated @NInt public static final long Primary = 0x0000000000000000L;
    /**
     * Valid for UISplitViewControllerStyleTripleColumn only
     */
    @Generated @NInt public static final long Supplementary = 0x0000000000000001L;
    @Generated @NInt public static final long Secondary = 0x0000000000000002L;
    /**
     * If a vc is set for this column, it will be used when the UISVC is collapsed, instead of stacking the vc’s for the Primary, Supplementary, and Secondary columns
     */
    @Generated @NInt public static final long Compact = 0x0000000000000003L;
}
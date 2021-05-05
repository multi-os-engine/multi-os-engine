package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIAccessibilityContainerType {
    @Generated
    private UIAccessibilityContainerType() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * If using this container type, you must also implement the UIAccessibilityContainerDataTable protocol.
     */
    @Generated @NInt public static final long DataTable = 0x0000000000000001L;
    @Generated @NInt public static final long List = 0x0000000000000002L;
    @Generated @NInt public static final long Landmark = 0x0000000000000003L;
    /**
     * Assistive technologies might query the accessibility properties set on the container, such as the accessibilityLabel, in order to output appropriate information about the semantic group to the user
     */
    @Generated @NInt public static final long SemanticGroup = 0x0000000000000004L;
}
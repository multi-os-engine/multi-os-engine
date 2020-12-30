package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UITextDropEditability {
    @Generated
    private UITextDropEditability() {
    }

    /**
     * A non-editable control will remain non-editable and
     * the drop will not be allowed.
     */
    @Generated @NUInt public static final long No = 0x0000000000000000L;
    /**
     * A non-editable control will become editable for the drop
     * only, but will be restored to non-editable afterwards.
     */
    @Generated @NUInt public static final long Temporary = 0x0000000000000001L;
    /**
     * A non-editable control will become editable and remain
     * editable after the drop concludes.
     */
    @Generated @NUInt public static final long Yes = 0x0000000000000002L;
}
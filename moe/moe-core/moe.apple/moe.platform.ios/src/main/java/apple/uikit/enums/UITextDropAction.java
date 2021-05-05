package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class UITextDropAction {
    @Generated
    private UITextDropAction() {
    }

    /**
     * Inserts the text at the provided location. Other text is not affected.
     */
    @Generated @NUInt public static final long Insert = 0x0000000000000000L;
    /**
     * If the target has a selection, replaces the selection with the dropped text.
     * Otherwise, this behaves the same as UITextDropInsert.
     */
    @Generated @NUInt public static final long ReplaceSelection = 0x0000000000000001L;
    /**
     * Replaces all the text in the target with the dropped text,
     * via `setAttributedText:`.
     */
    @Generated @NUInt public static final long ReplaceAll = 0x0000000000000002L;
}
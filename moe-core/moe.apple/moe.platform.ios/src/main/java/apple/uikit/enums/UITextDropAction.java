package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 11.0
 */
@Generated
public final class UITextDropAction {
    @Generated
    private UITextDropAction() {
    }

    /**
     * Inserts the text at the provided location. Other text is not affected.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Insert = 0x0000000000000000L;
    /**
     * If the target has a selection, replaces the selection with the dropped text.
     * Otherwise, this behaves the same as UITextDropInsert.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ReplaceSelection = 0x0000000000000001L;
    /**
     * Replaces all the text in the target with the dropped text,
     * via `setAttributedText:`.
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long ReplaceAll = 0x0000000000000002L;
}
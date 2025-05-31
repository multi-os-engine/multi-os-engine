package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Options that indicate how much of your content Writing Tools requested.
 * 
 * At the start of any Writing Tools interaction, you provide the text for
 * the system to evaluate from your ``UIWritingToolsCoordinator/Delegate``
 * object. The request for your content comes with a scope constant that
 * indicates how much of your view’s text to provide.
 * 
 * API-Since: 18.2
 */
@Generated
public final class UIWritingToolsCoordinatorContextScope {
    @Generated
    private UIWritingToolsCoordinatorContextScope() {
    }

    /**
     * For best results return a context where attributedString is at least a full paragraph and range is the selected
     * range within that attributedText.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long UserSelection = 0x0000000000000000L;
    /**
     * For best results return a context where attributedString is the full text from the text storage.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long FullDocument = 0x0000000000000001L;
    /**
     * For best results return a context where attributedString includes all visible text.
     * 
     * API-Since: 18.2
     */
    @Generated @NInt public static final long VisibleArea = 0x0000000000000002L;
}
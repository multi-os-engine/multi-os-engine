package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSTextSelectionNavigationDestination {
    @Generated
    private NSTextSelectionNavigationDestination() {
    }

    /**
     * Moving to the next extended grapheme cluster boundary. Could result in a location inside a cluster depending on
     * operations. When the movement direction is not along the line (i.e. up and down for a horizontal line), it moves
     * to the adjacent line using the anchor point instead of resolving to the logical direction
     */
    @Generated @NInt public static final long Character = 0x0000000000000000L;
    /**
     * Moving to the next word boundary. Ignores punctuations, whitespaces, and format characters preceding the next
     * word
     */
    @Generated @NInt public static final long Word = 0x0000000000000001L;
    /**
     * Moving to the next line boundary. The boundary can be logical based on the line separator characters as well as
     * visual with soft line wrapping
     */
    @Generated @NInt public static final long Line = 0x0000000000000002L;
    /**
     * Moving to the next sentence boundary. Ignores punctuations, whitespaces, and format characters preceding the next
     * sentence
     */
    @Generated @NInt public static final long Sentence = 0x0000000000000003L;
    /**
     * Moving to the next paragraph boundary. Ignores the end of line elastic characters and paragraph separators
     */
    @Generated @NInt public static final long Paragraph = 0x0000000000000004L;
    /**
     * Moving to the next container/page boundary. Ignores the end of line elastic characters and container/page
     * separators
     */
    @Generated @NInt public static final long Container = 0x0000000000000005L;
    /**
     * Moving to the document boundary
     */
    @Generated @NInt public static final long Document = 0x0000000000000006L;
}

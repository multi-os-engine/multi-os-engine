package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSLineBreakStrategy {
    @Generated
    private NSLineBreakStrategy() {
    }

    /**
     * Don't use any line break strategies
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Use the push out line break strategy.
     * This strategy allows the text system to "push out" individual lines by some number of words to avoid an orphan word on the last line of the paragraph.
     * The current implementation usually pushes out the last line by a single word.
     */
    @Generated @NUInt public static final long PushOut = 0x0000000000000001L;
    /**
     * When specified, it prohibits breaking between Hangul characters. It is the preferable typesetting strategy for the modern Korean documents suitable for UI strings.
     */
    @Generated @NUInt public static final long HangulWordPriority = 0x0000000000000002L;
    /**
     * Use the same configuration of line break strategies that the system uses for standard UI labels. This set of line break strategies is optimized for displaying shorter strings that are common in UI labels and may not be suitable for large amounts of text.
     */
    @Generated @NUInt public static final long Standard = 0x000000000000FFFFL;
}
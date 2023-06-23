package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class NSAttributedStringMarkdownInterpretedSyntax {
    @Generated
    private NSAttributedStringMarkdownInterpretedSyntax() {
    }

    /**
     * Interpret the full Markdown syntax and produce all relevant attributes
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Full = 0x0000000000000000L;
    /**
     * Parse all Markdown text, but interpret only attributes that apply to inline spans. Attributes that differentiate
     * blocks (e.g. NSPresentationIntentAttributeName) will not be applied. (Extended attributes apply to inline spans,
     * if allowed, and will also be interpreted.)
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InlineOnly = 0x0000000000000001L;
    /**
     * Like …InlineOnly, but do not interpret multiple consecutive instances of whitespace as a single separator space.
     * All whitespace characters will appear in the result as they are specified in the source.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long InlineOnlyPreservingWhitespace = 0x0000000000000002L;
}

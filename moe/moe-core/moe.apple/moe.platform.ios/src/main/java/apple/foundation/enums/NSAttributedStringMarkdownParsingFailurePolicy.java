package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 15.0
 */
@Generated
public final class NSAttributedStringMarkdownParsingFailurePolicy {
    @Generated
    private NSAttributedStringMarkdownParsingFailurePolicy() {
    }

    /**
     * If parsing fails, return an error from the appropriate constructor.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Error = 0x0000000000000000L;
    /**
     * If parsing fails, and if possible, return a partial string. It may contain unparsed markup.
     * Note that if it isn't possible, an error may be returned anyway.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long PartiallyParsedIfPossible = 0x0000000000000001L;
}

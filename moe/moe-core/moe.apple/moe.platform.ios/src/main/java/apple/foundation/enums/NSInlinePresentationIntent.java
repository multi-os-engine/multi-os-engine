package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Inline presentation intents.
 * For use with NSInlinePresentationAttributeName.
 * 
 * API-Since: 15.0
 */
@Generated
public final class NSInlinePresentationIntent {
    @Generated
    private NSInlinePresentationIntent() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Emphasized = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long StronglyEmphasized = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Code = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Strikethrough = 0x0000000000000020L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long SoftBreak = 0x0000000000000040L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long LineBreak = 0x0000000000000080L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long InlineHTML = 0x0000000000000100L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long BlockHTML = 0x0000000000000200L;
}

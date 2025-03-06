package apple.browserenginekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class BETextDocumentRequestOptions {
    @Generated
    private BETextDocumentRequestOptions() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Text = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long AttributedText = 0x0000000000000002L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long TextRects = 0x0000000000000004L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long MarkedTextRects = 0x0000000000000020L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long AutocorrectedRanges = 0x0000000000000080L;
}
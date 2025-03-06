package apple.pdfkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Enum used to determine the granularity at which text selections are created. Mirrors CGPDFSelectionType.
 */
@Generated
public final class PDFSelectionGranularity {
    @Generated
    private PDFSelectionGranularity() {
    }

    @Generated @NUInt public static final long Character = 0x0000000000000000L;
    @Generated @NUInt public static final long Word = 0x0000000000000001L;
    @Generated @NUInt public static final long Line = 0x0000000000000002L;
}
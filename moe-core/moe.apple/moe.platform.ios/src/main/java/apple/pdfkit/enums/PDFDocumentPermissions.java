package apple.pdfkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Document permissions status. For encrypted PDF's, supplying the owner password will enable owner permission status.
 */
@Generated
public final class PDFDocumentPermissions {
    @Generated
    private PDFDocumentPermissions() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long User = 0x0000000000000001L;
    @Generated @NInt public static final long Owner = 0x0000000000000002L;
}
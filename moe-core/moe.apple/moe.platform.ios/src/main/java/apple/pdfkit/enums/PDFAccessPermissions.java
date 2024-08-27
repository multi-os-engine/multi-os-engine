package apple.pdfkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Some PDF access permissions are non-strict supersets of other permissions. Granting access to a superset
 * permission also grants access to permission(s) it is a superset of. These permissions are as follows:
 * 
 * * Granting PDFAllowsHighQualityPrinting also grants PDFAllowsLowQualityPrinting
 * * Granting PDFAllowsDocumentChanges also grants PDFAllowsCommenting and PDFAllowsFormFieldEntry
 * * Granting PDFAllowsContentCopying also grants PDFAllowsContentAccessibility
 * * Granting PDFAllowsCommenting also grants PDFAllowsFormFieldEntry
 */
@Generated
public final class PDFAccessPermissions {
    @Generated
    private PDFAccessPermissions() {
    }

    /**
     * Print at up to 150 DPI
     */
    @Generated @NUInt public static final long LowQualityPrinting = 0x0000000000000001L;
    /**
     * Print at any DPI
     */
    @Generated @NUInt public static final long HighQualityPrinting = 0x0000000000000002L;
    /**
     * Modify the document contents except for page management
     */
    @Generated @NUInt public static final long DocumentChanges = 0x0000000000000004L;
    /**
     * Page management: insert, delete, and rotate pages
     */
    @Generated @NUInt public static final long DocumentAssembly = 0x0000000000000008L;
    /**
     * Extract content (text, images, etc.)
     */
    @Generated @NUInt public static final long ContentCopying = 0x0000000000000010L;
    /**
     * Extract content, but only for the purpose of accessibility
     */
    @Generated @NUInt public static final long ContentAccessibility = 0x0000000000000020L;
    /**
     * Create or modify annotations, including form field entries
     */
    @Generated @NUInt public static final long Commenting = 0x0000000000000040L;
    /**
     * Modify form field entries
     */
    @Generated @NUInt public static final long FormFieldEntry = 0x0000000000000080L;
}

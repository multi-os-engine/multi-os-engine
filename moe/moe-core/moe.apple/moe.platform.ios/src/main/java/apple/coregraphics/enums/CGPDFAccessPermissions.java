package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * To get access permissions from a CGPDFDocument, call CGPDFDocumentGetAccessPermissions. Setting permissions
 * can only be done using the kCGPDFContextAccessPermissions property in the auxiliary info dictionary passed
 * in to CGPDFContextCreate.
 * 
 * Some PDF access permissions are non-strict supersets of other permissions. Granting access to a superset
 * permission also grants access to permission(s) it is a superset of. These permissions are as follows:
 * 
 * * Granting kCGPDFAllowsHighQualityPrinting also grants kCGPDFAllowsLowQualityPrinting
 * * Granting kCGPDFAllowsDocumentChanges also grants kCGPDFAllowsCommenting and kCGPDFAllowsFormFieldEntry
 * * Granting kCGPDFAllowsContentCopying also grants kCGPDFAllowsContentAccessibility
 * * Granting kCGPDFAllowsCommenting also grants kCGPDFAllowsFormFieldEntry
 * 
 * These relationships don't come from the PDF spec. There is nothing in the spec that says you always get
 * low-quality printing if you've already got high-quality printing. They are just two different bits with
 * no explicit dependencies. However, in practice, the software that most people use to edit PDF permissions
 * only allows creation of PDFs that follow these conventions.
 * 
 * In the interest of consistency with how these bits are used in practice, kCGPDFContextAccessPermissions
 * enforces the superset model of PDF permissions. For example, if you try to grant high-quality printing but
 * not low-quality printing, the low-quality bit will get turned on anyway. This does not apply to how permissions
 * are read, however. It's very likely that there exist PDFs that don't follow these conventions. For that reason,
 * when checking permissions, always check for the narrowest one that applies. For example, if you're interested
 * in form field entry, always test for kCGPDFAllowsFormFieldEntry specifically. You can't assume that you have it
 * just because you also have kCGPDFAllowsCommenting or kCGPDFAllowsDocumentChanges.
 */
@Generated
public final class CGPDFAccessPermissions {
    @Generated
    private CGPDFAccessPermissions() {
    }

    /**
     * Print at up to 150 DPI
     */
    @Generated public static final int LowQualityPrinting = 0x00000001;
    /**
     * Print at any DPI
     */
    @Generated public static final int HighQualityPrinting = 0x00000002;
    /**
     * Modify the document contents except for page management
     */
    @Generated public static final int DocumentChanges = 0x00000004;
    /**
     * Page management: insert, delete, and rotate pages
     */
    @Generated public static final int DocumentAssembly = 0x00000008;
    /**
     * Extract content (text, images, etc.)
     */
    @Generated public static final int ContentCopying = 0x00000010;
    /**
     * Extract content, but only for the purpose of accessibility
     */
    @Generated public static final int ContentAccessibility = 0x00000020;
    /**
     * Create or modify annotations, including form field entries
     */
    @Generated public static final int Commenting = 0x00000040;
    /**
     * Modify form field entries
     */
    @Generated public static final int FormFieldEntry = 0x00000080;
}
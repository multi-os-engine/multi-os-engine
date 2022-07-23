package apple.pdfkit.protocol;

import apple.foundation.NSNotification;
import apple.pdfkit.PDFSelection;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Document delegate
 */
@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PDFDocumentDelegate")
public interface PDFDocumentDelegate {
    /**
     * If implemented by the delegate, will be called when a PDFAnnotation is instantiated by a page. PDFPage by default
     * will instantiate object of class. This allows you to instead return your own PDFAnnotation subclass.
     * Return nil for annotation types you do not subclass.
     */
    @Generated
    @IsOptional
    @Selector("classForAnnotationType:")
    default Class classForAnnotationType(String annotationType) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented by the delegate, will be called when a PDFPage is instantiated. PDFDocument's implementation calls
     * -[PDFDocument pageClass] (see above).
     */
    @Generated
    @IsOptional
    @Selector("classForPage")
    default Class classForPage() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If implemented by the delegate, called for every search instance found during a find. PDFDocument's
     * implementation
     * accumulates each PDFSelection (instance) in an NSArray.
     */
    @Generated
    @IsOptional
    @Selector("didMatchString:")
    default void didMatchString(PDFSelection instance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentDidBeginDocumentFind:")
    default void documentDidBeginDocumentFind(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentDidBeginPageFind:")
    default void documentDidBeginPageFind(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentDidEndDocumentFind:")
    default void documentDidEndDocumentFind(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentDidEndPageFind:")
    default void documentDidEndPageFind(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentDidFindMatch:")
    default void documentDidFindMatch(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notification delegate methods. If implemented by the delegate, these are called. See notification comments above.
     */
    @Generated
    @IsOptional
    @Selector("documentDidUnlock:")
    default void documentDidUnlock(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }
}
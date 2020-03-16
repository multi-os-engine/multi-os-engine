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

@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PDFDocumentDelegate")
public interface PDFDocumentDelegate {
    @Generated
    @IsOptional
    @Selector("classForAnnotationType:")
    default Class classForAnnotationType(String annotationType) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("classForPage")
    default Class classForPage() {
        throw new java.lang.UnsupportedOperationException();
    }

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

    @Generated
    @IsOptional
    @Selector("documentDidUnlock:")
    default void documentDidUnlock(NSNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }
}
package apple.pdfkit.protocol;

import apple.foundation.NSURL;
import apple.pdfkit.PDFActionRemoteGoTo;
import apple.pdfkit.PDFView;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("PDFKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PDFViewDelegate")
public interface PDFViewDelegate {
    @Generated
    @IsOptional
    @Selector("PDFViewOpenPDF:forRemoteGoToAction:")
    default void PDFViewOpenPDFForRemoteGoToAction(PDFView sender, PDFActionRemoteGoTo action) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("PDFViewParentViewController")
    default UIViewController PDFViewParentViewController() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("PDFViewPerformFind:")
    default void PDFViewPerformFind(PDFView sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("PDFViewPerformGoToPage:")
    default void PDFViewPerformGoToPage(PDFView sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("PDFViewWillClickOnLink:withURL:")
    default void PDFViewWillClickOnLinkWithURL(PDFView sender, NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }
}
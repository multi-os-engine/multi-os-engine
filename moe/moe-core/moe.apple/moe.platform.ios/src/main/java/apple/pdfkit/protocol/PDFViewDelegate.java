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
    /**
     * Delegates implementing the following method will be called to handle clicks on annotations containing a
     * PDFActionRemoteGoTo action. The action contains a URL and a page index and point. The delegate should open the PDF
     * indicated by the URL and go to the page and point indicated. The easiest way to do the latter is to create a
     * PDFDestination with the page index and point once a PDFDocument from the URL is created - then you can call:
     * -[PDFView goToDestination:]. The default implementation simply beeps.
     */
    @Generated
    @IsOptional
    @Selector("PDFViewOpenPDF:forRemoteGoToAction:")
    default void PDFViewOpenPDFForRemoteGoToAction(PDFView sender, PDFActionRemoteGoTo action) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A delegate that should return the main view controller the PDFView resides in. This is to add additional
     * support to one's view such as 'Lookup' from the text selection menu, along with support of entering text for notes.
     */
    @Generated
    @IsOptional
    @Selector("PDFViewParentViewController")
    default UIViewController PDFViewParentViewController() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Certain PDFAction's may request that the PDF viewer application perform a Find. Delegates responding to the below
     * method will be called when the user clicks on an annotation with such an action.
     */
    @Generated
    @IsOptional
    @Selector("PDFViewPerformFind:")
    default void PDFViewPerformFind(PDFView sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Certain PDFAction's may request that the PDF viewer application bring up a panel allowing the user to enter a
     * specific page number. Delegates responding to the below method will be called when the user clicks on an annotation
     * with such an action.
     */
    @Generated
    @IsOptional
    @Selector("PDFViewPerformGoToPage:")
    default void PDFViewPerformGoToPage(PDFView sender) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Delegates implementing the following method will be called to handle clicks on URL links within the PDFView. The
     * default implementation calls [[NSWorkspace sharedWorkspace] openURL: url].
     */
    @Generated
    @IsOptional
    @Selector("PDFViewWillClickOnLink:withURL:")
    default void PDFViewWillClickOnLinkWithURL(PDFView sender, NSURL url) {
        throw new java.lang.UnsupportedOperationException();
    }
}
package apple.uikit.protocol;

import apple.coregraphics.struct.CGRect;
import apple.foundation.NSData;
import apple.uikit.UIScreenshotService;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIScreenshotServiceDelegate")
public interface UIScreenshotServiceDelegate {
    /**
     * The delegate method to send the PDF data to screenshots
     * <p>
     * The delegate is required to send the data via the completion handler
     *
     * @param screenshotService The screenshot service object associated per scene
     * @param completionHandler The block to execute when the PDF data is ready.
     *                          If no PDF data is available, data can be nil. The indexOfCurrentPage is zero-based, and
     *                          is the index of the current page of the snapshotted PDF. The rectInCurrentPage is the
     *                          rect in PDF coordinates with respect to the current page. If the receiver cannot provide
     *                          the visible area, pass CGRectZero for rectInCurrentPage.
     */
    @Generated
    @IsOptional
    @Selector("screenshotService:generatePDFRepresentationWithCompletion:")
    default void screenshotServiceGeneratePDFRepresentationWithCompletion(UIScreenshotService screenshotService,
            @ObjCBlock(name = "call_screenshotServiceGeneratePDFRepresentationWithCompletion") Block_screenshotServiceGeneratePDFRepresentationWithCompletion completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_screenshotServiceGeneratePDFRepresentationWithCompletion {
        @Generated
        void call_screenshotServiceGeneratePDFRepresentationWithCompletion(NSData PDFData,
                @NInt long indexOfCurrentPage, @ByValue CGRect rectInCurrentPage);
    }
}

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
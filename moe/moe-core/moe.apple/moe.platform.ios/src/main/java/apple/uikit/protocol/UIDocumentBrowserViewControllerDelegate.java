package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.uikit.UIActivity;
import apple.uikit.UIActivityViewController;
import apple.uikit.UIDocumentBrowserViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDocumentBrowserViewControllerDelegate")
public interface UIDocumentBrowserViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("documentBrowser:applicationActivitiesForDocumentURLs:")
    default NSArray<? extends UIActivity> documentBrowserApplicationActivitiesForDocumentURLs(
            UIDocumentBrowserViewController controller, NSArray<? extends NSURL> documentURLs) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:didImportDocumentAtURL:toDestinationURL:")
    default void documentBrowserDidImportDocumentAtURLToDestinationURL(UIDocumentBrowserViewController controller,
            NSURL sourceURL, NSURL destinationURL) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:didPickDocumentURLs:")
    default void documentBrowserDidPickDocumentURLs(UIDocumentBrowserViewController controller,
            NSArray<? extends NSURL> documentURLs) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:didRequestDocumentCreationWithHandler:")
    default void documentBrowserDidRequestDocumentCreationWithHandler(UIDocumentBrowserViewController controller,
            @ObjCBlock(name = "call_documentBrowserDidRequestDocumentCreationWithHandler") Block_documentBrowserDidRequestDocumentCreationWithHandler importHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_documentBrowserDidRequestDocumentCreationWithHandler {
        @Generated
        void call_documentBrowserDidRequestDocumentCreationWithHandler(NSURL urlToImport, @NUInt long importMode);
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:failedToImportDocumentAtURL:error:")
    default void documentBrowserFailedToImportDocumentAtURLError(UIDocumentBrowserViewController controller,
            NSURL documentURL, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:willPresentActivityViewController:")
    default void documentBrowserWillPresentActivityViewController(UIDocumentBrowserViewController controller,
            UIActivityViewController activityViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("documentBrowser:didPickDocumentsAtURLs:")
    default void documentBrowserDidPickDocumentsAtURLs(UIDocumentBrowserViewController controller,
            NSArray<? extends NSURL> documentURLs) {
        throw new java.lang.UnsupportedOperationException();
    }
}
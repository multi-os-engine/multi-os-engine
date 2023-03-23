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

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDocumentBrowserViewControllerDelegate")
public interface UIDocumentBrowserViewControllerDelegate {
    /**
     * Allows clients to add application specific UIActivity instances
     */
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

    /**
     * Called when the user validates a selection of items to open or pick.
     * If you have created this document manager to open files, you should then open the document, potentially using
     * a @c UIDocumentBrowserTransitionController for the transition.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 12.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("documentBrowser:didPickDocumentURLs:")
    default void documentBrowserDidPickDocumentURLs(UIDocumentBrowserViewController controller,
            NSArray<? extends NSURL> documentURLs) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * When the user requests the creation of a new document, this method will be called. The application can then,
     * optionally, present UI
     * it deems appropriate to let the user configure the new document (for example, it could show a list of templates).
     * When done, create an empty document or a copy of your template to a temporary location.
     * Then use the importHandler to pass the document URL to be imported.
     * If the user cancels the document creation, it's still expetected to call importHandler(nil,
     * UIDocumentBrowserImportModeNone).
     * The Document Browser will asynchronously move the document to its final destination and call back one of the
     * following delegate methods:
     * -documentBrowser:didImportDocumentURL:toDestinationURL:
     * -documentBrowser:failedToImportDocumentAtURL:error:
     * The app should wait for the delegate callbacks before presenting the imported document at the destination URL.
     * Usage of UIDocument is recommended.
     * If you do not implement this method, document creation will not be available.
     */
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

    /**
     * Implement this to customize the UIActivityViewController before it's presented.
     */
    @Generated
    @IsOptional
    @Selector("documentBrowser:willPresentActivityViewController:")
    default void documentBrowserWillPresentActivityViewController(UIDocumentBrowserViewController controller,
            UIActivityViewController activityViewController) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("documentBrowser:didPickDocumentsAtURLs:")
    default void documentBrowserDidPickDocumentsAtURLs(UIDocumentBrowserViewController controller,
            NSArray<? extends NSURL> documentURLs) {
        throw new java.lang.UnsupportedOperationException();
    }
}
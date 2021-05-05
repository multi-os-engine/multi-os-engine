package apple.quicklook.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 *  The controller that implements the QLPreviewingController protocol must at least implement one of the two following methods:
 *  -[QLPreviewingController preparePreviewOfSearchableItemWithIdentifier:queryString:completionHandler:], to generate previews for Spotlight searchable items.
 *  -[QLPreviewingController preparePreviewOfFileAtURL:completionHandler:], to generate previews for file URLs.
 * 
 * The main preview should be presented by the view controller implementing QLPreviewingController. Avoid presenting additional view controllers over your QLPreviewingController. For Catalyst compatibility, avoid using gesture recognizers that take interactions over large portions of the view to avoid collisions with standard macOS preview behaviors.
 */
@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewingController")
public interface QLPreviewingController {
    /**
     * Use this method to prepare the content of the view controller with the given file URL.
     * 
     * This method will be called only once. It will be called in the main thread before presenting the view controller.
     * Heavy work potentially blocking the main thread should be avoided in this method.
     * 
     * @param url The URL of the file the user is about to preview.
     * @param handler The completion handler should be called whenever the view is ready to be displayed. A loading spinner will be shown until the handler is called.
     * It can be called asynchronously after the method has returned.
     */
    @Generated
    @IsOptional
    @Selector("preparePreviewOfFileAtURL:completionHandler:")
    default void preparePreviewOfFileAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_preparePreviewOfFileAtURLCompletionHandler") Block_preparePreviewOfFileAtURLCompletionHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preparePreviewOfFileAtURLCompletionHandler {
        @Generated
        void call_preparePreviewOfFileAtURLCompletionHandler(NSError arg0);
    }

    /**
     * Use this method to prepare the content of the view controller with the data that the searchable item represents.
     * 
     * This method will be called only once. It will be called in the main thread before presenting the view controller.
     * Heavy work potentially blocking the main thread should be avoided in this method.
     * 
     * @param identifier The identifier of the CSSearchableItem the user interacted with in Spotlight.
     * @param queryString The query string the user entered in Spotlight before interacting with the CSSearchableItem.
     * @param handler The completion handler should be called whenever the view is ready to be displayed. A loading spinner will be shown until the handler is called.
     * It can be called asynchronously after the method has returned.
     */
    @Generated
    @IsOptional
    @Selector("preparePreviewOfSearchableItemWithIdentifier:queryString:completionHandler:")
    default void preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler(String identifier,
            String queryString,
            @ObjCBlock(name = "call_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler") Block_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler {
        @Generated
        void call_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler(NSError arg0);
    }
}
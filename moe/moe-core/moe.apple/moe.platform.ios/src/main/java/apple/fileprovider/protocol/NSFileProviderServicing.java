package apple.fileprovider.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderServicing")
public interface NSFileProviderServicing {
    /**
     * A file provider can implemement this method to return service sources that provide custom
     * communication channels to client applications.
     * 
     * The service sources must be tied to the item identified by @c itemIdentifier.
     * Client applications can retrieve the list of supported services by calling
     * [@c] -[NSFileManager getFileProviderServicesForItemAtURL:] for a specific item URL.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (nil, NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * Execution time:
     * ---------------
     * This method is not expected to take more than a few seconds to complete the retrieval of the
     * thumbnails. The system will call `cancel` on the progress if the
     * operation takes too much time. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("supportedServiceSourcesForItemIdentifier:completionHandler:")
    NSProgress supportedServiceSourcesForItemIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_supportedServiceSourcesForItemIdentifierCompletionHandler") Block_supportedServiceSourcesForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_supportedServiceSourcesForItemIdentifierCompletionHandler {
        @Generated
        void call_supportedServiceSourcesForItemIdentifierCompletionHandler(NSArray<?> arg0, NSError arg1);
    }
}
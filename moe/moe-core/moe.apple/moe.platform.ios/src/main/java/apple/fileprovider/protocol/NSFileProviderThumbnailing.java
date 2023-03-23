package apple.fileprovider.protocol;

import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to implement if the provider supports fetching thumbnails for its items.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderThumbnailing")
public interface NSFileProviderThumbnailing {
    /**
     * The system calls this method to fetch thumbnails.
     * 
     * The @p perThumbnailCompletionHandler should be called for each thumbnail, and
     * [@p] completionHandler only after all the per thumbnail completion blocks.
     * 
     * In the event of a global error, the implementation is allowed to skip calling
     * the @p perThumbnailCompletionHandler for individual thumbnails. In that case,
     * the @p completionHandler's error parameter would apply to all item identifiers
     * for which @p perThumbnailCompletionHandler had not been called.
     * 
     * If there is no thumbnail for a given item, the @p perThumbnailCompletionHandler
     * should be called with its @p imageData and @p error parameters both
     * set to nil.
     * 
     * If the system decides that an in-flight thumbnail request is not needed anymore,
     * it will call the returned @p NSProgress object's @p -cancel method,
     * at which time the implementation should clean up any held resources.
     * 
     * The system will cache the thumbnail for the item, and the cache will be
     * invalidated when itemVersion.contentVersion changes.
     * 
     * Thread safety:
     * ------------
     * 
     * The @p perThumbnailCompletionHandler may be called from multiple threads
     * concurrently.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * Execution time:
     * ---------------
     * This method is not expected to take more than a few tens seconds to complete the retrieval of the
     * services exposed on the item. The system will call `cancel` on the progress if the
     * operation takes too much time. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("fetchThumbnailsForItemIdentifiers:requestedSize:perThumbnailCompletionHandler:completionHandler:")
    NSProgress fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler(
            NSArray<String> itemIdentifiers, @ByValue CGSize size,
            @ObjCBlock(name = "call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2") Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2 perThumbnailCompletionHandler,
            @ObjCBlock(name = "call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3") Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3 completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2 {
        @Generated
        void call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_2(
                String identifier, NSData imageData, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3 {
        @Generated
        void call_fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler_3(
                NSError error);
    }
}
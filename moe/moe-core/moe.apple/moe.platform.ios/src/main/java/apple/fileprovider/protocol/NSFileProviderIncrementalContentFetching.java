package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderItemVersion;
import apple.fileprovider.NSFileProviderRequest;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Protocol to implement if the provider instance supports fetching incremental content changes.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderIncrementalContentFetching")
public interface NSFileProviderIncrementalContentFetching {
    /**
     * Update a previously provided item to a new version.
     * 
     * If the system already has a version of an item and learns that a new version is
     * available, it may call this method to update the existing version to a new
     * version.
     * 
     * The semantics of the requestedVersion parameter are the same as for the non-delta update method above.
     */
    @Generated
    @Selector("fetchContentsForItemWithIdentifier:version:usingExistingContentsAtURL:existingVersion:request:completionHandler:")
    NSProgress fetchContentsForItemWithIdentifierVersionUsingExistingContentsAtURLExistingVersionRequestCompletionHandler(
            String itemIdentifier, NSFileProviderItemVersion requestedVersion, NSURL existingContents,
            NSFileProviderItemVersion existingVersion, NSFileProviderRequest request,
            @ObjCBlock(name = "call_fetchContentsForItemWithIdentifierVersionUsingExistingContentsAtURLExistingVersionRequestCompletionHandler") Block_fetchContentsForItemWithIdentifierVersionUsingExistingContentsAtURLExistingVersionRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchContentsForItemWithIdentifierVersionUsingExistingContentsAtURLExistingVersionRequestCompletionHandler {
        @Generated
        void call_fetchContentsForItemWithIdentifierVersionUsingExistingContentsAtURLExistingVersionRequestCompletionHandler(
                NSURL fileContents, @Mapped(ObjCObjectMapper.class) Object item, NSError error);
    }
}
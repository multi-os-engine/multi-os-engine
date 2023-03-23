package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderDomain;
import apple.fileprovider.NSFileProviderItemVersion;
import apple.fileprovider.NSFileProviderRequest;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * FileProvider extension for which the system replicates the content on disk.
 * 
 * The extension exposes a hierarchy of NSFileProviderItem instances that the system
 * will replicate on disk as a file hierarchy. The file hierarchy reflects the filename,
 * parent, content, and metadata described by the NSFileProviderItem. In case two items
 * are at the same disk location (same parent and filename), the system may choose to
 * "bounce" an item.
 * 
 * The system lazily replicates the item hierarchy: items are created "dataless" on disk
 * and the content (for files) or list of children (for folders) is fetched on first
 * access by calling fetchContentsForItemWithIdentifier, or enumeratorForContainerItemIdentifier.
 * 
 * The provider can notify the system of changes on the items by publishing those on the
 * enumerator for the working set. The system notifies the extension of changes made by the
 * user on disk by calling createItemBasedOnTemplate, modifyItem, or deleteItemWithIdentifier.
 * 
 * Concurrency:
 * ------------
 * A replicated extension class must be prepared to handle multiple concurrent calls since the
 * system may perform several concurrent operations (for instance, modifying an item, while enumerating
 * the working set, creating another item, and fetching the contents of yet another item).
 * 
 * The system has limits to the number of concurrent operations.When the number of concurrent
 * operations is reached, the system will not schedule additional operations falling in that category
 * until at least one of the running operation has completed by calling its completion handler.
 * 
 * The system currently separates the operations into the following categories:
 * - enumeration of the working set. At most 1 enumeration of the working set can happen at a given time
 * - downloads. The system has a per-domain limit on the number of concurrent calls to fetchContents and similar calls.
 * That limit is configurable by setting the NSExtensionFileProviderDownloadPipelineDepth key to an integer
 * value (between 1 and 128) in the Info.plist of the extension.
 * - uploads. The system has a per-domain limit on the number of concurrent calls to createItemBasedOnTemplate and
 * modifyItem when the call includes new content to be uploaded. That limit is configurable by setting the
 * NSExtensionFileProviderUploadPipelineDepth key to an integer value (between 1 and 128) in the Info.plist
 * of the extension.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderReplicatedExtension")
public interface NSFileProviderReplicatedExtension extends NSFileProviderEnumerating {
    /**
     * Create a new item.
     * 
     * The itemTemplate object describes the expected state of the newly created item,
     * including its location provided by parentItemIdentifier and filename. The list
     * of fields to conside in that object is defined by the fields parameter. Fields
     * not listed should be considered as not being defined.
     * 
     * The url is used to transfer the content of the file from the system to the
     * extension. It can be nil if the item has no content. This will be the case if
     * the item is a folder or if the item is being reimported (flag
     * NSFileProviderCreateItemMayAlreadyExist set) and the file is dataless on disk.
     * If the item is a symbolic link, the target path is provided by the symlinkTargetPath
     * of the itemTemplate.
     * 
     * The system is setting the itemIdentifier of the itemTemplate to a unique value that
     * is guaranteed to stay the same for a given item in case the creation is replayed
     * after a crash. That itemIdentifier is not intended to be the identifier assigned
     * to the item by the provider.
     * 
     * In the completion block, the createdItem is expected to reflect the properties of the
     * newly created item, which usually means matching the properties passed in by the
     * template. An exception is the itemIdentifier which should be the identifier assigned
     * to that item by the provider rather than the identifier passed in through the template.
     * If the provider reuses an existing identifier, the item that used that identifier will
     * be removed from disk, replaced by the createdItem. If the item is a directory, the two
     * directories will be merged and the items from the existing one will be modified with
     * the NSFileProviderModifyItemMayAlreadyExist option set.
     * 
     * If the provider is not able to apply all the fields at once, it should return a
     * set of stillPendingFields in its completion handler. In that case, the system will
     * attempt to modify the item later by calling modifyItem with those fields.
     * 
     * The filename and contents fields should be synced together.
     * If synced independently, files may appear corrupted on other devices, due to
     * a mismatch between the file extension and the actual file data.
     * 
     * If a field in the returned createdItem does not match the itemTemplate, and is
     * not in the list of stillPendingFields, the value from the createdItem will be
     * propagated to the disk. If the content of the item as described by createdItem
     * does not match the content from url, the provider should set shouldFetchContent
     * in the completion handler. The content from the provider will then be fetched
     * and propagated to disk.
     * 
     * In case the deletion of an item from the working set could not be applied to the
     * disk by the system because it conflicted with a local edit of the file, the system
     * will attempt to create the edited item. In that case the creation call will receive
     * the NSFileProviderCreateItemDeletionConflicted option and the itemIdentifier in the
     * template will be set to the itemIdentifier of the item deleted from the working set.
     * The itemVersion will also be set to the last itemVersion of the item that was made
     * available on disk before the item was edited locally. If such a conflict happens
     * on a dataless item on disk, the item will be immediately deleted from the disk instead
     * of issuing a new creation.
     * 
     * In case the NSFileProviderCreateItemMayAlreadyExist option
     * is passed, the content may be nil if the item is found by the system without any
     * associated content. In that case, you should return a nil item if you are not
     * able to match the created item with an existing item from the provider.
     * 
     * In case of path collision with an already existing item, the provider
     * can either fail using -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:]
     * or resolve the collision by itself (e.g. by returning an item with a different name).
     * If the error is returned, the system will try to resolve the collision by itself by bouncing
     * away one of the items (renaming the item).
     * 
     * If the imported item is refused by the extension, it should return nil for the
     * createdItem without any error. In that case, the source item will be deleted
     * from disk. In case the item represents a directory, the content will be deleted
     * recursively. If the extension does not wish to synchronise the item, while still
     * keeping it on disk, it should still import it locally, but not sync it to its
     * server, and return a valid createItem object.
     * 
     * The progress returned by createItemBasedOnTemplate is expected to include the
     * upload progress of the item and will be presented in the user interface until
     * the completion handler is called.
     * 
     * Creation is gated by the NSFileProviderItemCapabilitiesAllowsAddingSubItems
     * capability on the parent folder on a UI level, but direct file system changes
     * (e.g. from Terminal) can still result in changes that must be handled.
     * 
     * Structural consistency:
     * -----------------------
     * The system guarantees that the creation is called after the creation of the
     * parent completed.
     * 
     * File ownership:
     * ---------------
     * The file at `url` is owned by the system and is unlinked after the completion
     * handler is called. If the extension wishes to keep access to the content of
     * file after calling the completion handler, it should clone the file in its
     * container.
     * 
     * Atomicity:
     * ----------
     * By default, the system assumes all the changes are applied non-atomically, which
     * means that the change or an intermediary state from the change can be observed
     * (for instance while enumerating the working set) while the call is in progress
     * (before the completion handler is called). The provider can indicate to the system
     * that it applies changes atomically (that is, the change cannot be observed before
     * the completion handler is called) by setting the key NSExtensionFileProviderAppliesChangesAtomically
     * in the Info.plist of the extension to YES.
     * 
     * The atomicity declaration only describes the visibility of the changes, not
     * the ability of the provider to apply all the fields at once: a provider that applies
     * changes atomically might still apply a subset of the changedFields communicated
     * by the system and defer the remaining fields by setting the stillPendingFields
     * parameter in the completion handler.
     * 
     * Error cases:
     * ------------
     * If the creation fails because the target directory does not exist, the extension
     * must fail the creation using the NSFileProviderErrorNoSuchItem error code. In
     * that case, the system will attempt the re-create the parent directory.
     * 
     * In case the location of the new item is already in use by another item, the extension
     * can chose to either resolve the collision by moving one of the items
     * away, or reject the creation with the NSFileProviderErrorFilenameCollision
     * error code. In that error case, the system will be responsible for resolving the
     * collision, by renaming one of the colliding items. When the collision is resolved,
     * the system will call createItemBasedOnTemplate again.
     * 
     * The extension can also report the NSFileProviderErrorNotAuthenticated,
     * NSFileProviderErrorServerUnreachable, NSFileProviderErrorInsufficientQuota
     * or NSFileProviderErrorCannotSynchronize in case the modification cannot be applied
     * because of the current state of the system / domain. In that case, the system will
     * present an appropriate error message and back off until the next time it is signalled.
     * The provider can signal the error resolution by calling signalErrorResolved:completionHandler:.
     * 
     * Any other error, including crashes of the extension process, will be considered to be transient
     * and will cause the creation to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (nil, [], NO, NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * Execution time:
     * ---------------
     * The system will grant enough time to the extension to upload the file if content is passed to the call,
     * otherwise the call is expected to completed within a few seconds. The system will interrupt the
     * call if it stops making progress or if upload takes an unexpectedly long time. In that case, the system
     * will call `cancel` on the progress. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("createItemBasedOnTemplate:fields:contents:options:request:completionHandler:")
    NSProgress createItemBasedOnTemplateFieldsContentsOptionsRequestCompletionHandler(
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem itemTemplate, @NUInt long fields, NSURL url,
            @NUInt long options, NSFileProviderRequest request,
            @ObjCBlock(name = "call_createItemBasedOnTemplateFieldsContentsOptionsRequestCompletionHandler") Block_createItemBasedOnTemplateFieldsContentsOptionsRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createItemBasedOnTemplateFieldsContentsOptionsRequestCompletionHandler {
        @Generated
        void call_createItemBasedOnTemplateFieldsContentsOptionsRequestCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object createdItem, @NUInt long stillPendingFields,
                boolean shouldFetchContent, NSError error);
    }

    /**
     * Delete an item forever.
     * 
     * This is called when the user deletes an item that was already in the Trash and
     * the item should no longer appear there after this call. This call should
     * remove the item from the working set.
     * 
     * This call receives an optional baseVersion which represent the version of the
     * item we are trying to delete.
     * 
     * Unless the NSFileProviderDeleteItemRecursive options is passed, the
     * deletion of a directory should be non-recursive. If the deletion is recursive
     * the provider should take care of reporting the deletion of all the deleted
     * items through the working set.
     * 
     * Delete is gated by the capabilities of the removed item with
     * NSFileProviderItemCapabilitiesAllowsDeleting.
     * 
     * Modifications are gated by NSFileProviderItemCapabilitiesAllowsDeleting
     * of the item on a UI level, but direct file system changes (e.g. from Terminal)
     * can still result in changes that must be handled.
     * 
     * Atomicity:
     * ----------
     * By default, the system assumes all the changes are applied non-atomically, which
     * means that the change or an intermediary state from the change can be observed
     * (for instance while enumerating the working set) while the call is in progress
     * (before the completion handler is called). The provider can indicate to the system
     * that it applies changes atomically (that is, the change cannot be observed before
     * the completion handler is called) by setting the key NSExtensionFileProviderAppliesChangesAtomically
     * in the Info.plist of the extension to YES.
     * 
     * Error cases:
     * ------------
     * The extension may fail the deletion in different scenarios, for instance because
     * the baseVersion is out of date or because the user does not have permissions to
     * delete the item. In that case the extension should fail the call with the
     * NSFileProviderErrorDeletionRejected error code which will cause the system to
     * re-create the deleted item on disk based on the latest metadata available from
     * the extension.
     * 
     * If the options don't include NSFileProviderDeleteItemRecursive and the
     * deletion targets a non-empty directory, the extension must reject the deletion
     * with the NSFileProviderErrorDirectoryNotEmpty error code. This error can also
     * be reported in case some children of the directory cannot be deleted when
     * receiving the NSFileProviderDeleteItemRecursive option. In both cases,
     * the system will re-create the deleted item on disk based on the latest metadata
     * available from the extension.
     * 
     * If the deletion targets an item that is unknown from the extension because
     * that item may have already been deleted remotely, then the extension should
     * report a success.
     * 
     * The extension can also report the NSFileProviderErrorNotAuthenticated,
     * NSFileProviderErrorServerUnreachable, or NSFileProviderErrorCannotSynchronize
     * in case the deletion cannot be applied because of the current state of the
     * system / domain. In that case, the system will present an appropriate error
     * message and back off until the next time it is signalled.
     * 
     * Any other error, including crashes of the extension process, will be considered to be transient
     * and will cause the deletion to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * Execution time:
     * ---------------
     * This call is not expected to take more than a few seconds to complete. The system will interrupt the
     * call if it stops making progress or if the deletion takes an unexpectedly long time. In that case,the system
     * will call `cancel` on the progress. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("deleteItemWithIdentifier:baseVersion:options:request:completionHandler:")
    NSProgress deleteItemWithIdentifierBaseVersionOptionsRequestCompletionHandler(String identifier,
            NSFileProviderItemVersion version, @NUInt long options, NSFileProviderRequest request,
            @ObjCBlock(name = "call_deleteItemWithIdentifierBaseVersionOptionsRequestCompletionHandler") Block_deleteItemWithIdentifierBaseVersionOptionsRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteItemWithIdentifierBaseVersionOptionsRequestCompletionHandler {
        @Generated
        void call_deleteItemWithIdentifierBaseVersionOptionsRequestCompletionHandler(NSError arg0);
    }

    /**
     * Download the item for the given identifier and return it via the completion handler.
     * 
     * The system learns of items through enumerations. Initially, this means that the
     * system is aware that an item (with a specific version) exists on the device.
     * 
     * When the user accesses the item, the system makes a request for the contents of
     * the item. The provider can then fulfill the request by providing the item.
     * 
     * The system takes ownership of the item and will move it out of the sandbox of
     * the provider.
     * 
     * If the provider wishes to force materialization of a given item, the provider should use the NSFileCoordinator
     * API to coordinate a read on the user visible URL of the item, retrieved using
     * -[NSFileProviderManager getUserVisibleURLForItemIdentifier:completionHandler:]
     * 
     * The requestedVersion parameter specifies which version should be returned. A nil value
     * means that the latest known version should be returned. Except for the error case, the
     * version of the returned item is assumed to be identical to what was requested.
     * 
     * requestedVersion is currently always set to nil.
     * 
     * Concurrent Downloads:
     * ----------
     * The system will call fetchContents concurrently if there are multiple outstanding file download requests.
     * The provider can control the concurrency by setting the key NSExtensionFileProviderDownloadPipelineDepth
     * in the Info.plist of the extension to the number of concurrent downloads that the system should create
     * per domain. This number must be between 1 and 128, inclusive.
     * 
     * File ownership:
     * ---------------
     * The retrieved content at `fileContents` URL must be a regular file on the same volume as the user-visible URL.
     * A suitable location can be retrieved using -[NSFileProviderManager temporaryDirectoryURLWithError:].
     * The system clones and unlinks the received fileContents. The extension should not mutate the corresponding
     * file after calling the completion handler. If the extension wishes to keep a copy of the content, it must
     * provide a clone of the that content as the URL passed to the completion handler.
     * 
     * In case the extension or the system crashes between the moment the completion handler is called and the
     * moment the system unlinks the file, the file may unexpectedly still be on disk the next time an instance
     * of the extension is created. The extension is then responsible for deleting that file.
     * 
     * Disallowing processes from fetching items:
     * ---------------
     * 
     * The system automatically downloads files on POSIX accesses. The extension may wish to disallow this class of
     * downloads for specific applications.
     * 
     * The extension can set an array of strings into the UserDefault key
     * "NSFileProviderExtensionNonMaterializingProcessNames". A process whose executable's filename on disk is an
     * exact match for an entry in this array will not be allowed to fetch items in the extension's domains. The
     * comparison
     * is case sensitive.
     * 
     * In macOS 11.0 and later, this list will be checked when a download is initiated through a POSIX filesystem call.
     * In macOS 11.4 and later, this list will also be checked for downloads initiated through file coordination.
     * 
     * Error cases:
     * ------------
     * If the download fails because the item was deleted on the server, the call should
     * fail with the NSFileProviderErrorNoSuchItem error. In that case, the system
     * will consider the item has been removed from the domain and will attempt to
     * delete it from disk. In case that deletion fails because there are local
     * changes on this item, the system will re-create the item using createItemBasedOnTemplate,
     * passing the NSFileProviderCreateItemDeletionConflicted flag.
     * 
     * If the user does not have access to the content of the file, the provider
     * can fail the call with NSCocoaErrorDomain and code NSFileReadNoPermissionError.
     * That error will then be presented to the user. The extension can also report
     * the NSFileProviderErrorNotAuthenticated, NSFileProviderErrorServerUnreachable
     * in case the item cannot be fetched because of the current state of the system / domain.
     * In those cases, the system will present an appropriate error message and back off
     * until the next time it is signalled.
     * 
     * Any other error, including crashes of the extension process, will be considered to be transient
     * and will cause the download to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (nil, nil, NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * The returned NSProgress is used to show progress to the user. If the user cancels the
     * fetch, the extension should stop fetching the item, as it is no longer required.
     * 
     * Execution time:
     * ---------------
     * The system will grant enough time to the extension to download the file. The system will interrupt the
     * call if it stops making progress or if download takes an unexpectedly long time. In that case, the system
     * will call `cancel` on the progress. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("fetchContentsForItemWithIdentifier:version:request:completionHandler:")
    NSProgress fetchContentsForItemWithIdentifierVersionRequestCompletionHandler(String itemIdentifier,
            NSFileProviderItemVersion requestedVersion, NSFileProviderRequest request,
            @ObjCBlock(name = "call_fetchContentsForItemWithIdentifierVersionRequestCompletionHandler") Block_fetchContentsForItemWithIdentifierVersionRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fetchContentsForItemWithIdentifierVersionRequestCompletionHandler {
        @Generated
        void call_fetchContentsForItemWithIdentifierVersionRequestCompletionHandler(NSURL fileContents,
                @Mapped(ObjCObjectMapper.class) Object item, NSError error);
    }

    /**
     * Signal the end of import of on-disk items.
     * 
     * This is called after a reimport of on-disk items has been triggered by either
     * `-[NSFileProviderManager reimportItemsBelowItemWithIdentifier:completionHandler:]`
     * or after a new domain is created using
     * `+[NSFileProviderManager importDomain:fromDirectoryAtURL:completionHandler:]` or
     * `+[NSFileProviderManager addDomain:completionHandler:]`.
     * 
     * `reimport` can also be started by the system independently from any request by the
     * provider. The provider can detect those events by monitoring
     * `-[NSFileProviderDomain backingStoreIdentity]`.
     * 
     * During import, found items will be created via the
     * -[NSFileProviderExtension createItemBasedOnTemplate:fields:contents:options:completionHandler:]
     * call with the NSFileProviderCreateItemMayAlreadyExist flag set.
     * At the end of an import the -[NSFileProviderExtension importDidFinishWithCompletionHandler:]
     * is called.
     * 
     * The system will attempt to import items as they are accessed by the user or applications. Import
     * of the other items is scheduled by the system as a background task. That task may be delayed,
     * for instance in low-power situations, or when the system is under heavy load. The provider can
     * force the system to process a folder and its direct children by issuing a coordination request
     * on that folder.
     * 
     * Execution time:
     * ---------------
     * This call is not expected to take more than a few seconds to complete.
     */
    @Generated
    @IsOptional
    @Selector("importDidFinishWithCompletionHandler:")
    default void importDidFinishWithCompletionHandler(
            @ObjCBlock(name = "call_importDidFinishWithCompletionHandler") Block_importDidFinishWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDidFinishWithCompletionHandler {
        @Generated
        void call_importDidFinishWithCompletionHandler();
    }

    /**
     * Create a new instance of the replicated provider for the specified domain.
     */
    @Generated
    @Selector("initWithDomain:")
    NSFileProviderReplicatedExtension initWithDomain(NSFileProviderDomain domain);

    /**
     * Called before the instance is discarded.
     * 
     * Several instances of a replicated provider can be hosted by the same process, either because
     * the user has several active domains, or because an instance got discarded and a new one
     * is created by the system. This method is called before an instance is discarded and should
     * make sure that all references to the instance are released so that the instance can be
     * deallocated.
     */
    @Generated
    @Selector("invalidate")
    void invalidate();

    /**
     * Fetch the metadata for the item with the provider identifier.
     * 
     * Error cases:
     * ------------
     * If the metadata lookup fails because the item is unknown, the call should
     * fail with the NSFileProviderErrorNoSuchItem error. In that case, the system
     * will consider the item has been removed from the domain and will attempt to
     * delete it from disk. In case that deletion fails because there are local
     * changes on this item, the system will re-create the item using createItemBasedOnTemplate.
     * 
     * The extension can also report the NSFileProviderErrorNotAuthenticated,
     * NSFileProviderErrorServerUnreachable in case the item cannot be fetched
     * because of the current state of the system / domain. In that case, the
     * system will present an appropriate error message and back off until the
     * next time it is signalled.
     * 
     * Any other error, including crashes of the extension process, will be considered to be
     * transient and will cause the lookup to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
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
     * metadata of the item. If the operation may not complete in a reasonable amount of time because,
     * for instance, of bad network conditions, it is recommended to report an error (for instance
     * NSFileProviderErrorServerUnreachable). The system will call `cancel` on the progress if the
     * operation takes too much time. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("itemForIdentifier:request:completionHandler:")
    NSProgress itemForIdentifierRequestCompletionHandler(String identifier, NSFileProviderRequest request,
            @ObjCBlock(name = "call_itemForIdentifierRequestCompletionHandler") Block_itemForIdentifierRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_itemForIdentifierRequestCompletionHandler {
        @Generated
        void call_itemForIdentifierRequestCompletionHandler(@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
    }

    /**
     * Called by the system if the set of materialized items changes.
     * 
     * Materialized items are items that have synced to disk and are not
     * dataless. They may contain a mix of dataless and materialized files and
     * directories, but in any case, all their children are represented on disk.
     * Traversals of dataless directories by applications trigger an enumeration
     * against the file provider extension; traversals of materialized directories
     * do not. It is the responsability of the file provider extension to notify
     * the system on remote changes of these files: there is no alternative cache
     * invalidation mechanism.
     * 
     * If the extension doesn't keep track of the materialized set, it will have to
     * notify the system of all remote changes. In that case the working set is the
     * entire dataset. The system may drop items whose parent isn't materialized, to
     * avoid unnecessary disk usage. This saves some I/O, but isn't optimal. The
     * filtering by parentItemIdentifier is better done in the extension; ideally,
     * it would even be done server-side. A hybrid model is possible, where some
     * filtering is done server-side, and some finer filtering is done client-side.
     * 
     * The file provider extension should therefore keep a list of the identifiers of
     * the materialized directories. This method is called when a new directory is
     * materialized or when a materialized directory is rendered dataless.
     * 
     * To enumerate the set of materialized containers,
     * - Call -enumeratorForMaterializedItems on the instance of
     * NSFileProviderManager corresponding to your domain;
     * - Implement the NSFileProviderEnumerationObserver and
     * NSFileProviderChangeObserver on an object;
     * - Pass that object to the enumerator;
     * - Use the identifiers of items or changes you receive to note the
     * materialization status in your database.
     * 
     * When an item is created, modified or deleted remotely, the file provider
     * extension should check whether its parentItemIdentifier is in the materialized
     * set. If it is, the extension needs to inform the system so the system may
     * create, modify or delete the file or directory (initially dataless) on disk.
     * In the case when an item is reparented, the test should be that either the new
     * or the old parentItemIdentifier is in the materialized set. No need to pretend
     * that the iten was deleted if the new parentItemIdentifier is no longer in the
     * materialized set: the system will know what to do with an unknown parent
     * identifier.
     * 
     * To notify the system of this created, modified or deleted item,
     * - Call -signalEnumeratorForContainerItemIdentifier: on the working set, i.e the
     * container identified by NSFileProviderWorkingSetContainerItemIdentifier;
     * - Include this item in the next enumeration of the working set.
     * 
     * Since this method is called on every change of the set of materialized items,
     * it is advisable to use it to set a flag and perform any resulting work as a
     * timed task rather than performing any work directly.
     * 
     * Execution time:
     * ---------------
     * This call is not expected to take more than a few seconds to complete.
     */
    @Generated
    @IsOptional
    @Selector("materializedItemsDidChangeWithCompletionHandler:")
    default void materializedItemsDidChangeWithCompletionHandler(
            @ObjCBlock(name = "call_materializedItemsDidChangeWithCompletionHandler") Block_materializedItemsDidChangeWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_materializedItemsDidChangeWithCompletionHandler {
        @Generated
        void call_materializedItemsDidChangeWithCompletionHandler();
    }

    /**
     * Informs the provider that an item or its metadata have changed. More than one
     * property may have changed, e.g. an item may have been renamed, moved and also
     * changed contents, in which case changedFields might contain [.contents,
     * .filename, .parentItemIdentifier, .contentModificationDate].
     * 
     * If the provider is not able to apply all the fields at once, it should return a
     * set of stillPendingFields in its completion handler. In that case, the system will
     * attempt to modify the item later by calling modifyItem with those fields.
     * 
     * The filename and contents fields should be synced together.
     * If synced independently, files may appear corrupted on other devices, due to
     * a mismatch between the file extension and the actual file data.
     * 
     * Starting in macOS 12.0, if the set of stillPendingFields returned by the provider is
     * identical to the set of fields passed to modifyItem, then the system will consider that these fields
     * are not supported by the provider. The system will not send these fields to the provider again,
     * until the item is modified.
     * 
     * If a field in the returned item does not match the itemTemplate, and is
     * not in the list of stillPendingFields, the value from the item will be
     * propagated to the disk. In case there is a content change and the content of
     * the returned item as described by item does not match the content from url,
     * the provider should set shouldFetchContent in the completion handler. The
     * content from the provider will then be fetched and propagated to disk.
     * 
     * If the item modification results from the parent directory being merged into another
     * directory, the NSFileProviderModifyItemMayAlreadyExist flag will be passed
     * to the call.
     * 
     * The provider can chose to merge two existing items when receiving modifyItem. In that
     * case, the item returned should carry the itemIdentifier of the item with which the
     * item will be merged and well as the resulting state of that item. The system will then
     * keep one of the items (the one whose itemIdentifier was returned) and remove
     * the other one from disk. In case of directories, the content of the two directories
     * is merged and sub-items will be modified with the
     * NSFileProviderModifyItemMayAlreadyExist flag set.
     * 
     * If the extension wishes the modify item to cause the deletion of the item on disk,
     * it can call the completion handler with nil in place of the resulting item. If the
     * item is directory, the item will be kept on disk until all its children has been deleted
     * from the working set. The system will only apply the deletion on the disk if this
     * does not conflict with local edits. Otherwise, the system will attempt to re-create
     * the item with the NSFileProviderCreateItemDeletionConflicted option set.
     * 
     * The progress returned by modifyItem is expected to include the upload progress if any,
     * even if the provider chose to call the completion handler before the upload finishes.
     * For example, the provider might decide to call the completion handler as soon as the
     * metadata have been stored in a local database.
     * 
     * Modifications are gated by the corresponding capabilities of the item on a UI level,
     * but direct file system changes (e.g. from Terminal) can still result in changes that
     * must be handled.
     * 
     * Conflict resolution:
     * -------------------
     * The system passes a `baseVersion` parameter to the modifyItem call. This
     * baseVersion describes the latest version of the file which was reflected on disk.
     * This parameter can be used to detect conflicts with remote edits.
     * 
     * For instance, if content version A of the file was downloaded to the local system, and
     * the content was modified locally, the modifyItem call will receive baseVersion of A. If the server
     * has in the meantime received another content edit of the same file, the server may
     * have content version C. In this case, the extension can detect the mismatching baseVersion,
     * and decide how to resolve the conflict. The extension informs the system of how it
     * wishes to resolve the conflict by returning the resolved metadata on the completion handler.
     * As an example resolution, if the extension informs that it wishes for the remote version
     * of the item to be on disk (and to ignore the local edits), it should return the new
     * contentVersion in the completion handler's item. The system will subsequently call
     * fetchContents to retrieve the new contents and replace them on disk.
     * 
     * The `baseVersion` might contain one or both component set to
     * `NSFileProviderItemVersionComponentZero` in case there has never been a version for
     * which the item on disk and the item in the provider were known to be in sync.
     * 
     * Structural consistency and Cycle handling:
     * ------------------------------------------
     * In case the parentItemIdentifier is modified, the system guarantees that the new
     * parent has been created and the creation completed before the call to modifyItem
     * is issued.
     * 
     * The system guarantees that modifyItem called after local changes from the user will
     * never create a cycle: that is all items will always be a descendent of either the
     * root item or the trash item.
     * 
     * However, cycles that are caused by concurrent local changes by the user and changes
     * on the remote server can also create cycles. This is handled by the system as a
     * conflict. This means the provider must validate that the call of modifyItem is not
     * creating a cycle with a change it observed from the server. If such a cycle is
     * detected, the provider must fix the conflict by breaking the cycle, and return the
     * state of the item after resolving that conflict. If the resolution affects other
     * items as well, updates for those other items must be published on the working set.
     * 
     * File ownership:
     * ---------------
     * The file at `url` is owned by the system and is unlinked after the completion
     * handler is called. If the extension wishes to keep access to the content of
     * file after calling the completion handler, it should clone the file in its
     * container.
     * 
     * Atomicity:
     * ----------
     * By default, the system assumes all the changes are applied non-atomically, which
     * means that the change or an intermediary state from the change can be observed
     * (for instance while enumerating the working set) while the call is in progress
     * (before the completion handler is called). The provider can indicate to the system
     * that it applies changes atomically (that is, the change cannot be observed before
     * the completion handler is called) by setting the key NSExtensionFileProviderAppliesChangesAtomically
     * in the Info.plist of the extension to YES.
     * 
     * The atomicity declaration only describes the visibility of the changes, not
     * the ability of the provider to apply all the fields at once: a provider that applies
     * changes atomically might still apply a subset of the changedFields communicated
     * by the system and defer the remaining fields by setting the stillPendingFields
     * parameter in the completion handler.
     * 
     * Error cases:
     * ------------
     * The extension may fail the modification if the modified item does not exist
     * anymore. In that case, the extension should fail the call the
     * NSFileProviderErrorNoSuchItem error code. The system will attempt to delete
     * the item on disk. If the item on disk actually has changes since this call
     * to modifyItem, then it will be re-created by a call to createItemBasedOnTemplate.
     * Likewise, if the item is reparented to a parent that no longer exists, the extension
     * may return a NSFileProviderErrorNoSuchItem error with the parent item.
     * 
     * In case the modification updates the location of the item and another item is
     * already known at this location, the extension can chose to either resolve the
     * collision by moving one of the items away, or reject the modification with
     * the NSFileProviderErrorFilenameCollision error code. In that error case,
     * the system will be responsible for resolving the collision, by renaming one of
     * the colliding items. When the collision is resolved, the system will call
     * modifyItem again.
     * 
     * The extension can also report the NSFileProviderErrorNotAuthenticated,
     * NSFileProviderErrorServerUnreachable, NSFileProviderErrorInsufficientQuota
     * or NSFileProviderErrorCannotSynchronize in case the modification cannot be applied
     * because of the current state of the system / domain. In that case, the system will
     * present an appropriate error message and back off until the next time it is signalled.
     * The provider can signal the error resolution by calling signalErrorResolved:completionHandler:.
     * 
     * Any other error, including crashes of the extension process, will be considered to be transient
     * and will cause the modification to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (nil, [], NO, NSUserCancelledError) in the NSProgress
     * cancellation handler.
     * 
     * Execution time:
     * ---------------
     * The system will grant enough time to the extension to upload the file if content is passed to the call,
     * otherwise the call is expected to completed within a few seconds. The system will interrupt the
     * call if it stops making progress or if upload takes an unexpectedly long time. In that case, the system
     * will call `cancel` on the progress. The extension is then expected to quickly call the completion
     * handler.
     */
    @Generated
    @Selector("modifyItem:baseVersion:changedFields:contents:options:request:completionHandler:")
    NSProgress modifyItemBaseVersionChangedFieldsContentsOptionsRequestCompletionHandler(
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem item, NSFileProviderItemVersion version,
            @NUInt long changedFields, NSURL newContents, @NUInt long options, NSFileProviderRequest request,
            @ObjCBlock(name = "call_modifyItemBaseVersionChangedFieldsContentsOptionsRequestCompletionHandler") Block_modifyItemBaseVersionChangedFieldsContentsOptionsRequestCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyItemBaseVersionChangedFieldsContentsOptionsRequestCompletionHandler {
        @Generated
        void call_modifyItemBaseVersionChangedFieldsContentsOptionsRequestCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object item, @NUInt long stillPendingFields, boolean shouldFetchContent,
                NSError error);
    }

    /**
     * Called by the system when the set of pending items is refreshed.
     * 
     * The pending enumerator lists all the items for which a change has been observed either
     * on the disk or in the working set more than one second ago and that change hasn't been
     * applied on the other side yet. An item can appear in the pending set for various reasons:
     * - the system is under load and cannot process all the events in a timely fashion
     * - a long running operation is scheduled or running for the item to be in sync (for instance,
     * the download or the upload of a new content)
     * - an error occurred, in which case the error will be set on the item as `downloadError` if
     * it occurred when applying a change to the disk, or `uploadError` in the other way around.
     * 
     * The pending set will only include items that comply to the following rules:
     * - They have been queued for changes for more time than the refresh interval;
     * - The items are already known by the provider.
     * 
     * These constraints imply that initial transfer of a file from the disk to the provider will not
     * be listed in the pending set, even though the transfer could take several minutes to complete
     * 
     * Furthermore, the pending set can only contain a limited number of items.
     * The pending set provides an easy way to design an "in progress" UI containing a few items
     * and to detect whether there's any activity pending on the system.
     * In case the pending set reached its maximum size items, newly pending items won't be included
     * in it. Already present items in the pending set will remain until they no longer are pending.
     * 
     * The pending set is refreshed regurlary but only if there are meaningful changes:
     * new pending items, items that were pending but are not anymore (deletions from the set),
     * or domain version changed and set is not empty
     * 
     * To enumerate the set of pending items,
     * - Call -enumeratorForPendingItems on the instance of
     * NSFileProviderManager corresponding to your domain;
     * - Implement the NSFileProviderEnumerationObserver and
     * NSFileProviderChangeObserver on an object;
     * - Pass that object to the enumerator;
     * - It will get called upon change to the set.
     * 
     * This method is regularly called when changes happen to the pending set.
     * implementeers are advised that this call will not happen as soon as an item is pending.
     * Thus, implementeers should not use the pending set to detect when a change happens.
     * The pending set will only contain items that were pending for a least one second before the
     * last refresh date.
     * 
     * Execution time:
     * ---------------
     * This call is not expected to take more than a few seconds to complete.
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("pendingItemsDidChangeWithCompletionHandler:")
    default void pendingItemsDidChangeWithCompletionHandler(
            @ObjCBlock(name = "call_pendingItemsDidChangeWithCompletionHandler") Block_pendingItemsDidChangeWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pendingItemsDidChangeWithCompletionHandler {
        @Generated
        void call_pendingItemsDidChangeWithCompletionHandler();
    }
}
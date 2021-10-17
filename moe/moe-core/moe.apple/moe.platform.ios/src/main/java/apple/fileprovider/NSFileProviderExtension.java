package apple.fileprovider;

import apple.NSObject;
import apple.coregraphics.struct.CGSize;
import apple.fileprovider.protocol.NSFileProviderEnumerator;
import apple.fileprovider.protocol.NSFileProviderItem;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderExtension extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderExtension(Pointer peer) {
        super(peer);
    }

    /**
     * Should return the URL corresponding to a specific identifier. Fail if it's not
     * a subpath of documentStorageURL.
     * <p>
     * This is a static mapping; each identifier must always return a path
     * corresponding to the same file. By default, this returns the path relative to
     * the path returned by documentStorageURL.
     */
    @Generated
    @Selector("URLForItemWithPersistentIdentifier:")
    public native NSURL URLForItemWithPersistentIdentifier(String identifier);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderExtension alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native NSFileProviderExtension allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The root URL for provided documents. This URL is derived by consulting the
     * NSExtensionFileProviderDocumentGroup property on your extension. The document
     * storage URL is the folder "File Provider Storage" in the corresponding
     * container.
     */
    @Generated
    @Selector("documentStorageURL")
    public native NSURL documentStorageURL();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSFileProviderExtension init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Called at some point after the file has changed; the provider may then trigger
     * an upload.
     */
    @Generated
    @Selector("itemChangedAtURL:")
    public native void itemChangedAtURL(NSURL url);

    @Generated
    @Selector("itemForIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderItem itemForIdentifierError(String identifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileProviderExtension new_objc();

    @Generated
    @Selector("persistentIdentifierForItemAtURL:")
    public native String persistentIdentifierForItemAtURL(NSURL url);

    /**
     * Returns the designated placeholder URL for a given URL. This placeholder will
     * be consulted before falling back to your app extension to enhance
     * performance. To write out a placeholder, use the writePlaceHolderAtURL: method
     * above.
     */
    @Generated
    @Selector("placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);

    /**
     * This method is called when a placeholder URL should be provided for the item at
     * the given URL.
     * <p>
     * The implementation of this method should call +[NSFileProviderManager
     * writePlaceholderAtURL:withMetadata:error:] with the URL returned by
     * +[NSFileProviderManager placeholderURLForURL:], then call the completion
     * handler.
     */
    @Generated
    @Selector("providePlaceholderAtURL:completionHandler:")
    public native void providePlaceholderAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_providePlaceholderAtURLCompletionHandler") Block_providePlaceholderAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_providePlaceholderAtURLCompletionHandler {
        @Generated
        void call_providePlaceholderAtURLCompletionHandler(NSError error);
    }

    /**
     * An identifier unique to this provider.
     * <p>
     * When modifying the files stored in the directory returned by
     * documentStorageURL, you should pass this identifier to your file coordinator's
     * setPurposeIdentifier: method.
     */
    @Generated
    @Selector("providerIdentifier")
    public native String providerIdentifier();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Should ensure that the actual file is in the position returned by
     * URLForItemWithPersistentIdentifier:, then call the completion handler.
     */
    @Generated
    @Selector("startProvidingItemAtURL:completionHandler:")
    public native void startProvidingItemAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_startProvidingItemAtURLCompletionHandler") Block_startProvidingItemAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startProvidingItemAtURLCompletionHandler {
        @Generated
        void call_startProvidingItemAtURLCompletionHandler(NSError error);
    }

    /**
     * Called after the last claim to the file has been released. At this point, it is
     * safe for the file provider to remove the content file.
     * <p>
     * Care should be taken that the corresponding placeholder file stays behind after
     * the content file has been deleted.
     */
    @Generated
    @Selector("stopProvidingItemAtURL:")
    public native void stopProvidingItemAtURL(NSURL url);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Writes out a placeholder at the specified URL. The URL should be one returned
     * by placeholderURLForURL:; if URL resource values are requested, the system will
     * consult the placeholder before consulting your app extension.
     * <p>
     * Metadata contains NSURLNameKey, NSURLFileSizeKey, NSURLIsPackageKey.
     */
    @Generated
    @Selector("writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURLWithMetadataError(NSURL placeholderURL,
            NSDictionary<String, ?> metadata, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Create a directory.
     * <p>
     * This is expected to complete before doing any network.
     * <p>
     * In the completion block, createdDirectoryItem should have these properties set:
     * - itemIdentifier
     * - parentItemIdentifier (to the value passed in to this method)
     * - filename (to directoryName)
     * - creationDate (to the current date and time)
     * - contentType (to "public.folder" - UTTypeFolder)
     * - childItemCount (to 0)
     * - capabilities
     * <p>
     * Errors (including collision errors) are handled as documented for the import
     * method above.  Directory creation is gated by the capabilities of the
     * destination directory, with NSFileProviderItemCapabilitiesAllowsAddingSubItems.
     */
    @Generated
    @Selector("createDirectoryWithName:inParentItemIdentifier:completionHandler:")
    public native void createDirectoryWithNameInParentItemIdentifierCompletionHandler(String directoryName,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_createDirectoryWithNameInParentItemIdentifierCompletionHandler") Block_createDirectoryWithNameInParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_createDirectoryWithNameInParentItemIdentifierCompletionHandler {
        @Generated
        void call_createDirectoryWithNameInParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object createdDirectoryItem, NSError error);
    }

    /**
     * Delete an item forever.
     * <p>
     * This is called when the user deletes an item that was already in the Trash and
     * the item should no longer appear there after this call.  This call should
     * remove the item from the working set.
     * <p>
     * Delete is gated by the capabilities of the removed item with
     * NSFileProviderItemCapabilitiesAllowsDeleting.
     */
    @Generated
    @Selector("deleteItemWithIdentifier:completionHandler:")
    public native void deleteItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_deleteItemWithIdentifierCompletionHandler") Block_deleteItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deleteItemWithIdentifierCompletionHandler {
        @Generated
        void call_deleteItemWithIdentifierCompletionHandler(NSError error);
    }

    @Generated
    @Selector("domain")
    public native NSFileProviderDomain domain();

    /**
     * Create an enumerator for an item.
     * <p>
     * When the user opens the browse tab of the UIDocumentsBrowserViewController and
     * selects a file provider, this is called with
     * NSFileProviderRootContainerItemIdentifier, and -[NSFileProviderEnumerator
     * enumerateItemsForObserver:startingAtPage:] is immediately called to list the
     * first items available under at the root level of the file provider.
     * <p>
     * As the user navigates down into directories, new enumerators are created with
     * this method, passing in the itemIdentifier of those directories.  Past
     * enumerators are then invalidated.
     * <p>
     * This method is also called with
     * NSFileProviderWorkingSetContainerItemIdentifier, which is enumerated with
     * -[NSFileProviderEnumerator enumerateChangesForObserver:fromSyncAnchor:].  That
     * enumeration is special in that it isn't driven by the
     * UIDocumentsBrowserViewController.  It happens in the background to sync the
     * working set down to the device.
     * <p>
     * This is also used to subscribe to live updates for a single document.  In that
     * case, -[NSFileProviderEnumerator enumerateChangesToObserver:fromSyncAnchor:]
     * will be called and the enumeration results shouldn't include items other than
     * the very item that the enumeration was started on.
     * <p>
     * If returning nil, you must set the error out parameter.
     */
    @Generated
    @Selector("enumeratorForContainerItemIdentifier:error:")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderEnumerator enumeratorForContainerItemIdentifierError(String containerItemIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The system calls this method to fetch thumbnails.
     * <p>
     * The @p perThumbnailCompletionHandler should be called for each thumbnail, and
     * [@p] completionHandler only after all the per thumbnail completion blocks.
     * <p>
     * In the event of a global error, the implementation is allowed to skip calling
     * the @p perThumbnailCompletionHandler for individual thumbnails. In that case,
     * the @p completionHandler's error parameter would apply to all item identifiers
     * for which @p perThumbnailCompletionHandler had not been called.
     * <p>
     * If there is no thumbnail for a given item, the @p perThumbnailCompletionHandler
     * should be called with its @p imageData and @p error parameters both
     * set to nil.
     * <p>
     * If the system decides that an in-flight thumbnail request is not needed anymore,
     * it will call the returned @p NSProgress object's @p -cancel method,
     * at which time the implementation should clean up any held resources.
     * <p>
     * The system will cache the thumbnail for the item, and the cache will be
     * invalidated when itemVersion.contentVersion changes.
     */
    @Generated
    @Selector("fetchThumbnailsForItemIdentifiers:requestedSize:perThumbnailCompletionHandler:completionHandler:")
    public native NSProgress fetchThumbnailsForItemIdentifiersRequestedSizePerThumbnailCompletionHandlerCompletionHandler(
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

    /**
     * Import a document.
     * <p>
     * The file or package at fileURL should be moved on disk into the file provider's
     * own storage, where it will later be uploaded.  The completion block should be
     * executed after the move on disk, but before the upload.  Before doing any
     * network, actually.
     * <p>
     * In the completion block, importedDocumentItem should have these properties set:
     * - itemIdentifier
     * - parentItemIdentifier (to the value passed in to this method)
     * - filename (to fileURL's resource value for key NSURLNameKey)
     * - creationDate (to NSURLCreationDateKey)
     * - contentModificationDate (to NSURLContentModificationDateKey)
     * - contentType (to NSURLContentTypeKey)
     * - documentSize (to NSURLTotalFileSizeKey on a flat file, or to the sum of the
     * files sizes for a package)
     * - capabilities
     * <p>
     * [fileURL startAccessingSecurityScopedResource] needs to be called prior to
     * accessing this security scoped URL, and stopAccessingSecurityScopedResource
     * needs to be called when done.
     * <p>
     * Note that itemIdentifier should be set with no network call.  It doesn't have
     * to be the final identifier.  If the identifier changes after talking to the
     * server then the file provider should send a delete for the temporary, local
     * identifier immediately followed by an add with the final identifier.
     * <p>
     * A reasonable way of organizing files in the file provider storage is:
     * <file provider storage path>/<itemIdentifier>/<filename>.<extension>
     * If the item identifier was to change, you should move the file on disk to
     * update its path, under coordination with NSFileCoordinatorWritingForMoving.
     * <p>
     * This is expected to work offline even if there might be a collision (another
     * item with the same filename and parentItemIdentifier) only detected when later
     * syncing up this change to the server.  In that case, it is suggested that a
     * follow up update to the item change its filename to something unique.  This
     * wouldn't be considered an error to import.
     * <p>
     * If however you can tell right away, with no communication to your server, that
     * there is a collision then this call should fail with error code
     * NSFileProviderErrorFilenameCollision generated with this method:
     * -[NSError (NSFileProviderError) fileProviderErrorForCollisionWithItem:].
     * <p>
     * The existing item set in this error will be used to handle the collision, and
     * ask the user if she or he would like to replace the existing item.  This takes
     * into account the existing item's capabilities (particularly
     * NSFileProviderItemCapabilitiesAllowsTrashing and AllowsDeleting.)
     * <p>
     * Collision checks should be case insensitive even if the filesystem or file
     * provider might allow two coexisting filenames differing only by their case.
     * <p>
     * Upload errors (such as NSFileProviderErrorInsufficientQuota) should be handled
     * with a subsequent update to the item, setting its uploadingError property.
     * Upload errors should not prevent creating or importing a document, because they
     * can be resolved at a later date (for example, when the user has quota again.)
     * <p>
     * Other errors will be presented to the user, but are unexpected.  If you want to
     * prevent imports in a given directory, then the directory item's capacities
     * should exclude NSFileProviderItemCapabilitiesAllowsAddingSubItems.
     */
    @Generated
    @Selector("importDocumentAtURL:toParentItemIdentifier:completionHandler:")
    public native void importDocumentAtURLToParentItemIdentifierCompletionHandler(NSURL fileURL,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_importDocumentAtURLToParentItemIdentifierCompletionHandler") Block_importDocumentAtURLToParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDocumentAtURLToParentItemIdentifierCompletionHandler {
        @Generated
        void call_importDocumentAtURLToParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object importedDocumentItem, NSError error);
    }

    /**
     * Rename a document or a directory.
     * <p>
     * This is expected to complete before doing any network.
     * <p>
     * itemName is the full file or directory name, complete with its file extension.
     * In the completion block, property renamedItem.filename should change to
     * itemName.  Property renamedItem.displayName should also be updated if you
     * chose to overwrite that method.
     * <p>
     * Errors (including collision errors) are handled as documented for the import
     * method above.  Renames are gated by the capabilities of the renamed item, with
     * NSFileProviderItemCapabilitiesAllowsRenaming.
     */
    @Generated
    @Selector("renameItemWithIdentifier:toName:completionHandler:")
    public native void renameItemWithIdentifierToNameCompletionHandler(String itemIdentifier, String itemName,
            @ObjCBlock(name = "call_renameItemWithIdentifierToNameCompletionHandler") Block_renameItemWithIdentifierToNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_renameItemWithIdentifierToNameCompletionHandler {
        @Generated
        void call_renameItemWithIdentifierToNameCompletionHandler(@Mapped(ObjCObjectMapper.class) Object renamedItem,
                NSError error);
    }

    /**
     * Move an item to a new directory.
     * <p>
     * This is expected to complete before doing any network.
     * <p>
     * If newName is non null, the moved item should be renamed to newName.
     * <p>
     * Errors (including collision errors) are handled as documented for the import
     * method above.  Moves are gated by the capabilities of both the moved item with
     * NSFileProviderItemCapabilitiesAllowsReparenting, and the destination directory
     * with NSFileProviderItemCapabilitiesAllowsAddingSubItems.
     */
    @Generated
    @Selector("reparentItemWithIdentifier:toParentItemWithIdentifier:newName:completionHandler:")
    public native void reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler(
            String itemIdentifier, String parentItemIdentifier, String newName,
            @ObjCBlock(name = "call_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler") Block_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler {
        @Generated
        void call_reparentItemWithIdentifierToParentItemWithIdentifierNewNameCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object reparentedItem, NSError error);
    }

    /**
     * Mark a directory as favorite (or no longer favorite if favoriteRank is nil.)
     * <p>
     * The favorite rank is used to represent the relative order of two favorite
     * directories in the UI.  It is a 64 bit unsigned integer.  It needs to be synced.
     * <p>
     * Favorite directories are relevant to the user and should be in the working set
     * even if they haven't been used recently.  The documents and directories in the
     * favorite directory however don't all have to be in the working set, and don't
     * all have to be made accessible offline.
     * <p>
     * The file provider is asked to persist the new favorite rank on disk, then call
     * the completion callback with the updated favorite rank.  At a later point, the
     * file provider should sync the new favorite rank to their server.
     */
    @Generated
    @Selector("setFavoriteRank:forItemIdentifier:completionHandler:")
    public native void setFavoriteRankForItemIdentifierCompletionHandler(NSNumber favoriteRank, String itemIdentifier,
            @ObjCBlock(name = "call_setFavoriteRankForItemIdentifierCompletionHandler") Block_setFavoriteRankForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setFavoriteRankForItemIdentifierCompletionHandler {
        @Generated
        void call_setFavoriteRankForItemIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object favoriteItem,
                NSError error);
    }

    /**
     * Mark an item as recently used, or clear its lastUsedDate if nil.
     * <p>
     * This last used date is the sort key for the recent lists.  It is the primary
     * hint that an item must belong to the working set cached and indexed on the
     * user's device.
     * <p>
     * The file provider is asked to persist the new last used date on disk, then call
     * the completion callback with the updated last used date.  At a later point, the
     * file provider should sync the new last used date to their server.
     * <p>
     * The error parameter is here for debugging purposes alone; it won't be presented
     * to the user or otherwise handled, but it will be logged.
     */
    @Generated
    @Selector("setLastUsedDate:forItemIdentifier:completionHandler:")
    public native void setLastUsedDateForItemIdentifierCompletionHandler(NSDate lastUsedDate, String itemIdentifier,
            @ObjCBlock(name = "call_setLastUsedDateForItemIdentifierCompletionHandler") Block_setLastUsedDateForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setLastUsedDateForItemIdentifierCompletionHandler {
        @Generated
        void call_setLastUsedDateForItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object recentlyUsedItem, NSError error);
    }

    /**
     * Tag an item, or untag it if tagData is nil.
     * <p>
     * The file provider is asked to persist the new tag data on disk, then call the
     * completion callback with the updated tagged data.  At a later point, the file
     * provider should sync the new tag data to their server.
     * <p>
     * Tagged items are relevant to the user and should be in the working set even if
     * they haven't been used recently.
     * <p>
     * If set, the error will be immediately presented to the user and the item just
     * won't be tagged.
     * <p>
     * On shared items, tags should sync across the devices of any one participant but
     * shouldn't sync across users.
     */
    @Generated
    @Selector("setTagData:forItemIdentifier:completionHandler:")
    public native void setTagDataForItemIdentifierCompletionHandler(NSData tagData, String itemIdentifier,
            @ObjCBlock(name = "call_setTagDataForItemIdentifierCompletionHandler") Block_setTagDataForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTagDataForItemIdentifierCompletionHandler {
        @Generated
        void call_setTagDataForItemIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object taggedItem,
                NSError error);
    }

    @Generated
    @Selector("supportedServiceSourcesForItemIdentifier:error:")
    public native NSArray<?> supportedServiceSourcesForItemIdentifierError(String itemIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Move an item to the trash.
     * <p>
     * In the completion block, property trashedItem.isTrashed should be set to YES.
     * You should keep track of the original parentItemIdentifier of the item before
     * it was moved to trash, so you can move the item back where it used to be in the
     * untrash method.  You could use the trashedItem.parentItemIdentifier property
     * for that.
     * <p>
     * The trashed item should continue to belong to the working set of documents
     * cached on the device and visible offline to the user.  But if it is a
     * directory, then all of its children should be removed from the working set and
     * the file provider extension should send deletion events to make sure that they
     * no longer appear in the recent lists.
     * <p>
     * It is also suggested that shared documents be unshared when trashed.
     * <p>
     * Trash is gated by the capabilities of the trashed item with
     * NSFileProviderItemCapabilitiesAllowsTrashing.
     */
    @Generated
    @Selector("trashItemWithIdentifier:completionHandler:")
    public native void trashItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_trashItemWithIdentifierCompletionHandler") Block_trashItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_trashItemWithIdentifierCompletionHandler {
        @Generated
        void call_trashItemWithIdentifierCompletionHandler(@Mapped(ObjCObjectMapper.class) Object trashedItem,
                NSError error);
    }

    /**
     * Move an item out of the trash.
     * <p>
     * If parentItemIdentifier is nil, the file provider should attempt to put the
     * item back where it was when it was moved to the trash; otherwise it should move
     * it to this new parent.
     * <p>
     * If the item is a directory, then the file provider extension should enumerate
     * the children and send addition events in the working set so that the documents
     * in the now untrashed directory may be reindexed.
     * <p>
     * Untrash is gated by the capabilities of the destination directory, with
     * NSFileProviderItemCapabilitiesAllowsAddingSubItems.
     */
    @Generated
    @Selector("untrashItemWithIdentifier:toParentItemIdentifier:completionHandler:")
    public native void untrashItemWithIdentifierToParentItemIdentifierCompletionHandler(String itemIdentifier,
            String parentItemIdentifier,
            @ObjCBlock(name = "call_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler") Block_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler {
        @Generated
        void call_untrashItemWithIdentifierToParentItemIdentifierCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object untrashedItem, NSError error);
    }
}

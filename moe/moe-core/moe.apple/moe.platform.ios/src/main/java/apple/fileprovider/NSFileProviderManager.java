package apple.fileprovider;

import apple.NSObject;
import apple.fileprovider.protocol.NSFileProviderItem;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSURLSessionTask;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import apple.fileprovider.protocol.NSFileProviderEnumerator;
import apple.fileprovider.protocol.NSFileProviderPendingSetEnumerator;
import apple.foundation.NSDictionary;
import apple.foundation.NSFileProviderService;
import apple.foundation.NSProgress;
import org.moe.natj.general.ann.MappedReturn;

/**
 * The file provider manager allows you to communicate with the file provider
 * framework from both the extension and related processes.
 * 
 * NSFileProviderManager can be used from the following processes:
 * - the extension
 * - the main app containing the extension
 * - sibling extensions to the extension
 * - executables contained in the main app bundle (on macOS only)
 * 
 * Executables contained in the main app bundle need to have a bundle identifier that is
 * prefixed by the bundle identifier of the main app (note that this is generally required
 * for extensions). They must also have access to the document group defined for the provider
 * (via its `NSExtensionFileProviderDocumentGroup` key).
 * 
 * The file provider framework will invoke your file provider extension in response
 * to those calls if appropriate.
 * 
 * The class also provides methods to manage provider domains. Each domain has a
 * corresponding manager.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Register a domain in which items can be stored.
     * 
     * If a domain with the same identifier already exists, `addDomain` will update the display name
     * and hidden state of the domain and succeed.
     * 
     * When the domain is backed by a NSFileProviderReplicatedExtension, the system will create
     * a disk location where the domain will be replicated. If that location already exists on disk
     * this call will fail with the code NSFileWriteFileExistsError.
     */
    @Generated
    @Selector("addDomain:completionHandler:")
    public static native void addDomainCompletionHandler(NSFileProviderDomain domain,
            @ObjCBlock(name = "call_addDomainCompletionHandler") Block_addDomainCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addDomainCompletionHandler {
        @Generated
        void call_addDomainCompletionHandler(NSError error);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFileProviderManager allocWithZone(VoidPtr zone);

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

    /**
     * Return the manager responsible for the default domain.
     */
    @Generated
    @Selector("defaultManager")
    public static native NSFileProviderManager defaultManager();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * The root URL for provided documents. This URL is derived by consulting the
     * NSExtensionFileProviderDocumentGroup property on your extension. The document
     * storage URL is the folder "File Provider Storage" in the corresponding
     * container.
     * 
     * If the NSExtensionFileProviderDocumentGroup property is not set, calling this
     * method will result in an error.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("documentStorageURL")
    public native NSURL documentStorageURL();

    /**
     * Get all registered domains.
     */
    @Generated
    @Selector("getDomainsWithCompletionHandler:")
    public static native void getDomainsWithCompletionHandler(
            @ObjCBlock(name = "call_getDomainsWithCompletionHandler") Block_getDomainsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getDomainsWithCompletionHandler {
        @Generated
        void call_getDomainsWithCompletionHandler(NSArray<? extends NSFileProviderDomain> domains, NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSFileProviderManager init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Return the manager for the specified domain.
     */
    @Generated
    @Selector("managerForDomain:")
    public static native NSFileProviderManager managerForDomain(NSFileProviderDomain domain);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileProviderManager new_objc();

    /**
     * Returns the designated placeholder URL for a given file URL. Used in
     * conjunction with writePlaceholderAtURL.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);

    /**
     * The purpose identifier of your file provider extension. A coordination using a
     * file coordinator with this purpose identifier set will not trigger your file
     * provider extension. You can use this to e.g. perform speculative work on behalf
     * of the file provider from the main app.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("providerIdentifier")
    public native String providerIdentifier();

    /**
     * Registers the given NSURLSessionTask to be responsible for the specified item.
     * A given item can only have one task registered at a time. The task must be
     * suspended at the time of calling.
     * The task's progress is displayed on the item when the task is executed.
     */
    @Generated
    @Selector("registerURLSessionTask:forItemWithIdentifier:completionHandler:")
    public native void registerURLSessionTaskForItemWithIdentifierCompletionHandler(NSURLSessionTask task,
            String identifier,
            @ObjCBlock(name = "call_registerURLSessionTaskForItemWithIdentifierCompletionHandler") Block_registerURLSessionTaskForItemWithIdentifierCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerURLSessionTaskForItemWithIdentifierCompletionHandler {
        @Generated
        void call_registerURLSessionTaskForItemWithIdentifierCompletionHandler(NSError error);
    }

    /**
     * Remove all registered domains.
     */
    @Generated
    @Selector("removeAllDomainsWithCompletionHandler:")
    public static native void removeAllDomainsWithCompletionHandler(
            @ObjCBlock(name = "call_removeAllDomainsWithCompletionHandler") Block_removeAllDomainsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeAllDomainsWithCompletionHandler {
        @Generated
        void call_removeAllDomainsWithCompletionHandler(NSError error);
    }

    /**
     * Remove a domain.
     */
    @Generated
    @Selector("removeDomain:completionHandler:")
    public static native void removeDomainCompletionHandler(NSFileProviderDomain domain,
            @ObjCBlock(name = "call_removeDomainCompletionHandler") Block_removeDomainCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDomainCompletionHandler {
        @Generated
        void call_removeDomainCompletionHandler(NSError error);
    }

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
     * Call this method either in the app or in the extension to trigger an
     * enumeration, typically in response to a push.
     * 
     * When using NSFileProviderExtension, the system will enumerate containers
     * while the user is viewing them in the UI. If there are changes to the container
     * while an enumerator is open, call this method with the identifier of that
     * container. This will trigger another call to
     * -[NSFileProviderEnumerator enumerateChangesForObserver:fromSyncAnchor:] on
     * that enumerator, and the UI will be refreshed, giving the user live updates on
     * the presented enumeration.
     * 
     * If there are changes in the working set, call this method with
     * containerItemIdentifier set to NSFileProviderWorkingSetContainerItemIdentifier,
     * even if there is no live enumeration for the working set container.
     * 
     * When using NSFileProviderReplicatedExtension, only call this
     * method with NSFileProviderWorkingSetContainerItemIdentifier. Other container
     * identifiers are ignored. The system will automatically propagate
     * working set changes to the UI, without explicitly signaling the
     * containers currently being viewed in the UI.
     * 
     * In addition to using this method, your application/extension can register for
     * pushes using the PKPushTypeFileProvider push type. Pushes of the form
     * {
     * container-identifier = "<identifier>"
     * domain = "<domain identifier>"
     * }
     * with a topic of "<your application identifier>.pushkit.fileprovider" will be
     * translated into a call to signalEnumeratorForContainerItemIdentifier:completionHandler:.
     */
    @Generated
    @Selector("signalEnumeratorForContainerItemIdentifier:completionHandler:")
    public native void signalEnumeratorForContainerItemIdentifierCompletionHandler(String containerItemIdentifier,
            @ObjCBlock(name = "call_signalEnumeratorForContainerItemIdentifierCompletionHandler") Block_signalEnumeratorForContainerItemIdentifierCompletionHandler completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_signalEnumeratorForContainerItemIdentifierCompletionHandler {
        @Generated
        void call_signalEnumeratorForContainerItemIdentifierCompletionHandler(NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Writes out a placeholder at the specified URL. The placeholder is used in place
     * of the actual file for operations that do not require the file's actual data to
     * be on disk:
     * - if attributes are requested by an application via the
     * getPromisedItemResourceValue: method on NSURL
     * - or via a coordination with the
     * NSFileCoordinatorReadingImmediatelyAvailableMetadataOnly flag set
     * - to verify whether an application has access to a file
     * 
     * Your extension should provide placeholders by implementing the
     * providePlaceholderAtURL: method, but your application may choose to proactively
     * write out placeholders to facilitate access to files. This is especially useful
     * if your application wants to actively hand out a file URL, e.g. using
     * UIActivityViewController, in which case it should ensure that either the file
     * or a placeholder is present on disk first.
     * 
     * The path of the placeholder is fixed and must be determined in advance by
     * calling the placeholderURLForURL: method.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURLWithMetadataError(NSURL placeholderURL,
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem metadata,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Returns an enumerator for the set of materialized items.
     * 
     * When calling -[NSFileProviderEnumerator enumerateItemsForObserver:startingAtPage:] on the returned
     * enumerator, pass the result of [NSData new] as the starting page. The sorting page constants
     * (NSFileProviderInitialPageSortedByName and NSFileProviderInitialPageSortedByDate) will not influence
     * the order of the items enumerated from the materialized set.
     * 
     * This enumerator is unlike other enumerators because the roles of the system
     * and the app/extension are reversed:
     * - The system enumerates the working set after the extension calls
     * 'signalEnumeratorForContainerItemIdentifier';
     * - The app/extension enumerates the materialized set after the system calls
     * 'materializedItemsDidChangeWithCompletionHandler'.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("enumeratorForMaterializedItems")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderEnumerator enumeratorForMaterializedItems();

    /**
     * Returns an enumerator for the set of pending items.
     * 
     * This enumerator behaves like the materialized set enumerator.
     * On later modifications in the set, the system will call
     * 'pendingItemsDidChangeWithCompletionHandler'.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("enumeratorForPendingItems")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSFileProviderPendingSetEnumerator enumeratorForPendingItems();

    /**
     * Request that the system remove an item from its cache.
     * 
     * When called on a file, the file will be made dataless.
     * 
     * When called on a directory, first each of the directory's children will be evicted (child files are made
     * dataless, child directories are recursively evicted). Then the directory itself will be made dataless.
     * If a non-evictable child is encountered, eviction will stop immediately and the completionHandler will be called
     * with
     * the NSFileProviderErrorNonEvictableChildren error. The error will include information on why and which
     * children could not be evicted in -[NSError underlyingErrors].
     * 
     * The materialization state of the remaining items may be either materialized or evicted, depending on the
     * traversal order.
     * 
     * The completion handler is called after the items have been evicted from disk or immediately when an error occurs.
     * 
     * Eviction might fail with the following errors :
     * - NSFileProviderErrorDomain.NSFileProviderErrorUnsyncedEdits if the item had non-uploaded changes.
     * - NSFileProviderErrorDomain.NSFileProviderErrorNonEvictable if the item has been marked as non-purgeable by the
     * provider.
     * - NSPOSIXErrorDomain.EBUSY : if the item has open file descriptors on it.
     * - NSPOSIXErrorDomain.EMLINK : if the item has several hardlinks.
     * - other NSPOSIXErrorDomain error codes if the system was unable to access or manipulate the corresponding file.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("evictItemWithIdentifier:completionHandler:")
    public native void evictItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_evictItemWithIdentifierCompletionHandler") Block_evictItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_evictItemWithIdentifierCompletionHandler {
        @Generated
        void call_evictItemWithIdentifierCompletionHandler(NSError error);
    }

    /**
     * Return the identifier and domain for a user visible URL.
     * 
     * This method returns the identifier and domain of a user visible URL if
     * applicable. Calling this method on a file which doesn't reside in your
     * provider/domain, or which hasn't yet been assigned an identifier by
     * the provider will return the Cocoa error NSFileNoSuchFileError.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("getIdentifierForUserVisibleFileAtURL:completionHandler:")
    public static native void getIdentifierForUserVisibleFileAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_getIdentifierForUserVisibleFileAtURLCompletionHandler") Block_getIdentifierForUserVisibleFileAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getIdentifierForUserVisibleFileAtURLCompletionHandler {
        @Generated
        void call_getIdentifierForUserVisibleFileAtURLCompletionHandler(String itemIdentifier, String domainIdentifier,
                NSError error);
    }

    /**
     * Retrieve the service with the specified named for the specified item.
     */
    @Generated
    @Selector("getServiceWithName:itemIdentifier:completionHandler:")
    public native void getServiceWithNameItemIdentifierCompletionHandler(String serviceName, String itemIdentifier,
            @ObjCBlock(name = "call_getServiceWithNameItemIdentifierCompletionHandler") Block_getServiceWithNameItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getServiceWithNameItemIdentifierCompletionHandler {
        @Generated
        void call_getServiceWithNameItemIdentifierCompletionHandler(NSFileProviderService arg0, NSError arg1);
    }

    /**
     * Return the security scoped URL to the user visible location for an item identifier.
     * 
     * The caller must use file coordination (see NSFileCoordinator) if it wishes to read the
     * content or list the children of the URL. The caller should not try to manipulate files
     * in the user visible location. All changes coming from the provider should go through
     * updates in the working set that will be applied to the user visible items by the
     * system.
     * 
     * The location may differ from the logical parentURL/filename.
     * If an item on disk cannot be assigned the requested name (e.g. because the local
     * file system has different case collision rules from the provider), one of the items can be assigned
     * a different local name. In that case, the "com.apple.fileprovider.before-bounce#P" extended
     * attribute will contain the filename before collision resolution.
     * This attribute is only set if the item has been assigned a different local name following
     * a collision. Such local names are not synced up to the provider; the purpose of the attribute is
     * to enable consistency checkers to detect this case.
     * 
     * Before accessing the content of the returned URL, the caller must call `-[NSURL
     * startAccessingSecurityScopedResource]
     * on the returned URL and call `-[NSURL stopAccessingSecurityScopedResource]` when done accessing the content.
     * 
     * The returned URL grants read-write access to the user visible location for the corresponding item.
     * 
     * On iOS, for replicated domains, the extension process will never be granted access to the user
     * visible location, this function will always fail with `NSFileReadNoPermissionError`.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("getUserVisibleURLForItemIdentifier:completionHandler:")
    public native void getUserVisibleURLForItemIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_getUserVisibleURLForItemIdentifierCompletionHandler") Block_getUserVisibleURLForItemIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserVisibleURLForItemIdentifierCompletionHandler {
        @Generated
        void call_getUserVisibleURLForItemIdentifierCompletionHandler(NSURL userVisibleFile, NSError error);
    }

    /**
     * Returns the global progress for the specified kind of operations
     * 
     * This progress tracks all the ongoing kind of operations (from disk to the provider).
     * Uploading operations are the operations from disk to the provider.
     * Downloading operations are the operations from the provider to the disk.
     * 
     * The global progress exposes the two following data:
     * - Number of items with an ongoing matching kind operation along with the grand total;
     * - Number of bytes already transfered along with the total amount of bytes to transfer.
     * 
     * The grand total will only be reset to 0 when there are no operations left. If new operations of the matching kind
     * arrive while
     * the global progress is already ongoing, they will just be summed to the existing global progress.
     * 
     * By default, when no matching kind operations are active, the progress has its values set to 1 and its state set
     * to finished.
     * 
     * The progress will be updated on the main queue. It is to be retained by the caller and to be observed through
     * KVO.
     * 
     * The two only supported values for kind are:
     * - NSProgressFileOperationKindUploading
     * - NSProgressFileOperationKindDownloading
     * 
     * The returned progress will have its fileOperationKind property set.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("globalProgressForKind:")
    public native NSProgress globalProgressForKind(String kind);

    /**
     * Request the creation of a new domain that will take ownership of on-disk data that
     * were previously managed without a file provider.
     * 
     * You can use this method in order to migrate from a software that managed a file hierarchy
     * on disk to a NSFileProviderExtension without having to redownload the data that was
     * already on disk.
     * 
     * The URL is expected to point to a directory. That directory will be moved away, its
     * ownership being taken by the system. From this point, your extension's
     * createItemFromTemplate method will be called for every item found in the directory
     * with the special NSFileProviderCreateItemMayAlreadyExist option.
     * 
     * In case a domain with the same name already exists in the file provider manager, the
     * call will fail with the code NSFileWriteFileExistsError. The URL will remain untouched.
     * In case the system does not allow the extension to request a migration, the call will
     * fail with NSFeatureUnsupportedError.
     * 
     * In case of success, the URL will become invalid and the domain will be created. The
     * completion handler is called as soon as the domain is created. Your provider will
     * receive calls to createItemBasedOnTemplate afterward.
     * 
     * When the import of the file hierarchy is finished, the system calls
     * -[NSFileProviderExtension signalDidFinishImportingItemsFromDiskWithCompletionHandler:].
     * In case -[NSFileProviderManager reimportItemsBelowItemWithIdentifier:completionHandler:]
     * is called before the end of the import, a single call to importDidFinishWithCompletionHandler
     * will be received for both the import and the scan.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("importDomain:fromDirectoryAtURL:completionHandler:")
    public static native void importDomainFromDirectoryAtURLCompletionHandler(NSFileProviderDomain domain, NSURL url,
            @ObjCBlock(name = "call_importDomainFromDirectoryAtURLCompletionHandler") Block_importDomainFromDirectoryAtURLCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_importDomainFromDirectoryAtURLCompletionHandler {
        @Generated
        void call_importDomainFromDirectoryAtURLCompletionHandler(NSError error);
    }

    /**
     * List the available operations.
     * 
     * This lists all of the operations that are ready to be scheduled by the system. The system waits
     * for all the pending disk and working set updates to be known before returning.
     * 
     * The operations that are returned may become invalid if the system receives new disk or working
     * set events, or if some operation are scheduled using -runTestingOperations:error:.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("listAvailableTestingOperationsWithError:")
    public native NSArray<?> listAvailableTestingOperationsWithError(
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Notify the system that the itemIdentifiers known by the system are not valid anymore.
     * 
     * This can be called by an extension in case it has lost track of its synchronisation state
     * and as a consequence is not able to guarantee the stability of the itemIdentifiers anymore.
     * In that case, the system will trigger a scan of any data that is cached on disk and call
     * createItemBasedOnTemplate with the special NSFileProviderCreateItemMayAlreadyExist
     * option so that the extension can specify the new itemIdentifier for those items. The provided
     * item identifier is inclusive, meaning the specified item will be re-import as well as any
     * children in case it is a container.
     * 
     * In case the extension has lost its synchronisation state but is still able to guarantee the
     * stability of the itemIdentifiers, it should make sure that querying the working set
     * enumerator with an anchor that predates the synchronisation loss will cause a
     * NSFileProviderErrorSyncAnchorExpired error.
     * 
     * In case the extension has lost its synchronisation state and is not interested in preserving
     * the data cached on disk, it can remove and re-add the affected domain.
     * 
     * The completion handler is called immediately and does not reflect the end of the import.
     * When the import of the file hierarchy is finished, the system calls
     * -[NSFileProviderExtension importDidFinishWithCompletionHandler:].
     * 
     * In some circumstances, in particular in case the requested item is the root item, calling
     * reimport will cause the system to stop the extension process. If the call is initiated
     * from the extension, the system does not guarantee that the completion handler will be called
     * before the extension is stopped. When called on the root item, reimport will cause the system
     * to rebuild its backing store for the domain. See `-[NSFileProviderDomain backingStoreIdentity]`.
     * 
     * If this method succeeds, the system will reimport at least the requested sub-tree, but may
     * import more.
     * 
     * If the requested item has no on-disk representation, the completion handler will be called with
     * a NSFileProviderErrorNoSuchItem error. The same error will be reported if the reimport request
     * happens quickly after a previous import / reimport and the corresponding item hasn't been
     * reimported yet.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("reimportItemsBelowItemWithIdentifier:completionHandler:")
    public native void reimportItemsBelowItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_reimportItemsBelowItemWithIdentifierCompletionHandler") Block_reimportItemsBelowItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_reimportItemsBelowItemWithIdentifierCompletionHandler {
        @Generated
        void call_reimportItemsBelowItemWithIdentifierCompletionHandler(NSError error);
    }

    /**
     * Remove a domain with options
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("removeDomain:mode:completionHandler:")
    public static native void removeDomainModeCompletionHandler(NSFileProviderDomain domain, @NInt long mode,
            @ObjCBlock(name = "call_removeDomainModeCompletionHandler") Block_removeDomainModeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_removeDomainModeCompletionHandler {
        @Generated
        void call_removeDomainModeCompletionHandler(NSURL preservedLocation, NSError error);
    }

    /**
     * Request that the system schedules a call to -[NSFileProviderReplicatedExtension modifyItem:] for the given item
     * identifier.
     * The fields passed to modifyItem will contain at least the set requested via the `fields` parameter.
     * The completion handler is called when the system has persisted the request. There is no guarantee as to when the
     * modifyItem call will be scheduled.
     * The completion handler may be called with an error. If the provider passes the `.content` field when the item
     * is not downloaded, or when the item is a folder, then the system will return
     * CocoaError(.ubiquitousFileUnavailable).
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("requestModificationOfFields:forItemWithIdentifier:options:completionHandler:")
    public native void requestModificationOfFieldsForItemWithIdentifierOptionsCompletionHandler(@NUInt long fields,
            String itemIdentifier, @NUInt long options,
            @ObjCBlock(name = "call_requestModificationOfFieldsForItemWithIdentifierOptionsCompletionHandler") Block_requestModificationOfFieldsForItemWithIdentifierOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestModificationOfFieldsForItemWithIdentifierOptionsCompletionHandler {
        @Generated
        void call_requestModificationOfFieldsForItemWithIdentifierOptionsCompletionHandler(NSError error);
    }

    /**
     * Run a set of operations.
     * 
     * Ask the system to schedule the execution of the listed operations. The system will wait until all
     * those operations have completed and report a per-operation error in case an operation fails.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("runTestingOperations:error:")
    public native NSDictionary<?, ? extends NSError> runTestingOperationsError(NSArray<?> operations,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Calling this method will cause the system to cancel throttling on every item which has been throttled due to the
     * given error.
     * 
     * This call supports 4 types of errors:
     * - NSFileProviderErrorNotAuthenticated
     * - NSFileProviderErrorInsufficientQuota
     * - NSFileProviderErrorServerUnreachable
     * - NSFileProviderErrorCannotSynchronize
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("signalErrorResolved:completionHandler:")
    public native void signalErrorResolvedCompletionHandler(NSError error,
            @ObjCBlock(name = "call_signalErrorResolvedCompletionHandler") Block_signalErrorResolvedCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_signalErrorResolvedCompletionHandler {
        @Generated
        void call_signalErrorResolvedCompletionHandler(NSError error);
    }

    /**
     * A temporary directory suitable to store files that will be exchanged with the system.
     * 
     * The returned URL is guaranteed to be on the same volume as the user visible URL, making sure the system
     * can atomatically clone/move files from that location to the user visible URL. The provider can also use
     * that directory as a target for moves and clones of content URL passed to createItemBasedOnTemplate
     * or modifyItem.
     * 
     * If the system cannot find a suitable directory, this calls will fail. This could happen e.g. if the domain
     * does not exist.
     * 
     * This call will not fail when called from the extension process with an active instance of the extension
     * for that domain.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("temporaryDirectoryURLWithError:")
    public native NSURL temporaryDirectoryURLWithError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * Wait for all changes on disk in the sub-hierarchy of the item to be acknowledged by the extension.
     * 
     * This call can be used to guarantee operation ordering in a sub-hierarchy of the provider. The completion
     * handler is called when all the changes for descendents of the item have been acknowledged by the extension.
     * If any error is met during that process, an error will be raised, in which case the caller should not
     * assume all the changes have been received.
     * 
     * This call will only wait for changes affecting items that were already descendents of the requested item
     * in the provider, or items that have been newly created on disk. It will not wait for items that are already
     * known from the provider and are being moved in the directory. As a consequence, that call can be used from within
     * a call
     * to -[NSFileProviderReplicatedExtension modifyItem:baseVersion:changedFields:contents:options:completionHandler:].
     * Also note that the call will return immediately on items that are not directories.
     * 
     * In case a change cannot be applied to the provider, the call will fail with NSFileProviderErrorCannotSynchronize
     * including the NSFileProviderErrorItemKey with the identifier of the item that could not be synced if that item
     * is known by the provider.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("waitForChangesOnItemsBelowItemWithIdentifier:completionHandler:")
    public native void waitForChangesOnItemsBelowItemWithIdentifierCompletionHandler(String itemIdentifier,
            @ObjCBlock(name = "call_waitForChangesOnItemsBelowItemWithIdentifierCompletionHandler") Block_waitForChangesOnItemsBelowItemWithIdentifierCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_waitForChangesOnItemsBelowItemWithIdentifierCompletionHandler {
        @Generated
        void call_waitForChangesOnItemsBelowItemWithIdentifierCompletionHandler(NSError error);
    }

    /**
     * Wait for stabilization of the domain.
     * 
     * The system will wait until it is caught up with the file system's changes up to
     * the time of the call, then wait until it is caught up with the provider's changes up to
     * the time of the call.
     * 
     * The completion handler is called when both sets of changes are caught up to at least the time
     * of the call. This is useful to enforce a consistent state for testing.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("waitForStabilizationWithCompletionHandler:")
    public native void waitForStabilizationWithCompletionHandler(
            @ObjCBlock(name = "call_waitForStabilizationWithCompletionHandler") Block_waitForStabilizationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_waitForStabilizationWithCompletionHandler {
        @Generated
        void call_waitForStabilizationWithCompletionHandler(NSError error);
    }
}

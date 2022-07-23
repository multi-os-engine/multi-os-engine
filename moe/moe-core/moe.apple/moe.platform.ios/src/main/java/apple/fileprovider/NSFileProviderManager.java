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

/**
 * The file provider manager allows you to communicate with the file provider
 * framework from both the extension and related processes.
 * <p>
 * NSFileProviderManager can be used from the following processes:
 * - the extension
 * - the main app containing the extension
 * - sibling extensions to the extension
 * - executables contained in the main app bundle (on macOS only)
 * <p>
 * Executables contained in the main app bundle need to have a bundle identifier that is
 * prefixed by the bundle identifier of the main app (note that this is generally required
 * for extensions). They must also have access to the document group defined for the provider
 * (via its `NSExtensionFileProviderDocumentGroup` key).
 * <p>
 * The file provider framework will invoke your file provider extension in response
 * to those calls if appropriate.
 * <p>
 * The class also provides methods to manage provider domains. Each domain has a
 * corresponding manager.
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
     * <p>
     * If a domain with the same identifier already exists, `addDomain` will update the display name
     * and hidden state of the domain and succeed.
     * <p>
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
     * <p>
     * If the NSExtensionFileProviderDocumentGroup property is not set, calling this
     * method will result in an error.
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
     */
    @Generated
    @Selector("placeholderURLForURL:")
    public static native NSURL placeholderURLForURL(NSURL url);

    /**
     * The purpose identifier of your file provider extension. A coordination using a
     * file coordinator with this purpose identifier set will not trigger your file
     * provider extension. You can use this to e.g. perform speculative work on behalf
     * of the file provider from the main app.
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
     * <p>
     * Set the containerItemIdentifier to the identifier of the enumerated container
     * that was specified in
     * -[NSFileProviderExtension enumeratorForContainerItemIdentifier:error:]
     * <p>
     * This will trigger another call to
     * -[NSFileProviderEnumerator enumerateChangesForObserver:fromSyncAnchor:]
     * and the UI will be refreshed, giving the user live updates on the presented
     * enumeration.
     * <p>
     * If you have a change in the working set, call this method with
     * containerItemIdentifier set to NSFileProviderWorkingSetContainerItemIdentifier,
     * even if there is no live enumeration for this item. The working set is cached
     * on the device and it's important to keep the cache in sync.
     * <p>
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
     * <p>
     * Your extension should provide placeholders by implementing the
     * providePlaceholderAtURL: method, but your application may choose to proactively
     * write out placeholders to facilitate access to files. This is especially useful
     * if your application wants to actively hand out a file URL, e.g. using
     * UIActivityViewController, in which case it should ensure that either the file
     * or a placeholder is present on disk first.
     * <p>
     * The path of the placeholder is fixed and must be determined in advance by
     * calling the placeholderURLForURL: method.
     */
    @Generated
    @Selector("writePlaceholderAtURL:withMetadata:error:")
    public static native boolean writePlaceholderAtURLWithMetadataError(NSURL placeholderURL,
            @Mapped(ObjCObjectMapper.class) NSFileProviderItem metadata,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

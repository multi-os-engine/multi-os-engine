package apple.fileprovider;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * File provider domain.
 * 
 * A file provider domain can be used to represent accounts or different locations
 * exposed within a given file provider.
 * 
 * Domains can be registered to the system using
 * [@c] -[NSFileProviderMananger addDomain:completionHandler:]
 * 
 * By default, a file provider extension does not have any domain.
 * 
 * On the extension side, a separate instance of NSFileProviderExtension will be
 * created for each @c NSFileProviderDomain registered. In that case, the
 * [@c] NSFileProviderExtension.domain properties will indicate which domain the
 * NSFileProviderExtension belongs to (or nil if none).
 * 
 * All the files on disk belonging to the same domain must be grouped inside a
 * common directory. That directory path is indicated by the
 * [@p] pathRelativeToDocumentStorage property.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSFileProviderDomain extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSFileProviderDomain(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSFileProviderDomain alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSFileProviderDomain allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
     * The display name shown by the system to represent this domain.
     */
    @NotNull
    @Generated
    @Selector("displayName")
    public native String displayName();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The identifier - as provided by the file provider extension.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native NSFileProviderDomain init();

    /**
     * Initialize a new non-replicated NSFileProviderDomain
     * 
     * The extension will be implementing NSFileProviderExtension.
     * 
     * The file provider extension implementation can pick any @c identifier as it sees
     * fit to identify the group of items. The identifier must not contain any characters from this set: [/:]
     * 
     * [@c] NSFileProviderExtension.documentStorageURL.
     * 
     * API-Since: 11.0
     * 
     * @param displayName                   a user visible string representing the group of items the
     *                                      file provider extension is using.
     * 
     * @param pathRelativeToDocumentStorage a path relative to
     */
    @Generated
    @Selector("initWithIdentifier:displayName:pathRelativeToDocumentStorage:")
    public native NSFileProviderDomain initWithIdentifierDisplayNamePathRelativeToDocumentStorage(
            @NotNull String identifier, @NotNull String displayName, @NotNull String pathRelativeToDocumentStorage);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSFileProviderDomain new_objc();

    /**
     * The path relative to the document storage of the file provider extension.
     * Files belonging to this domains should be stored under this path.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("pathRelativeToDocumentStorage")
    public native String pathRelativeToDocumentStorage();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Identity of the backing store of the domain on the system.
     * 
     * This property only applies for extensions that implement NSFileProviderReplicatedExtension.
     * 
     * This provides an identifier that uniquely identifies the backing store used by the system for
     * the domain. When this identifier has changed, the system has dropped its backing store and is
     * building a new one.
     * 
     * The system may decide to rebuild its backing store if it got corrupted. The backing store can also
     * be rebuilt as a response to the provider calling `-[NSFileProviderManager
     * reimportItemsBelowItemWithIdentifier:completionHandler:]`.
     * It is guaranteed that calling reimport on the root item will cause the backing store to be rebuilt,
     * but the system can also decide to do so when reimport is called on other items.
     * 
     * When rebuilding the backing store, the system will invalidate any extension instance associated
     * to that domain. As a consequence, the identity of the backing store associated with that domain
     * is guaranteed to be stable for the lifetime of the NSFileProviderReplicatedExtension instance.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("backingStoreIdentity")
    public native NSData backingStoreIdentity();

    /**
     * Initialize a new replicated NSFileProviderDomain
     * 
     * The extension will be implementing NSFileProviderReplicatedExtension.
     * 
     * The file provider extension implementation can pick any @c identifier as it sees
     * fit to identify the group of items. The identifier must not contain any characters from this set: [/:]
     * 
     * In order to migrate a non-replicated domain to a replicated one, implementers have to make sure that they do not
     * use the default domain, and then call +[NSFileProviderManager addDomain:completionHandler:] using
     * the NSFileProviderDomain object returned by that init method.
     * 
     * A domain with a specific identifier can be added multiple times; subsequent adds will update the properties
     * of the existing domain.
     * If a replicated domain is added "on top" of a non-replicated domain, the domain will be migrated to be
     * replicated;
     * existing bookmarks will remain valid, but the (externally visible) location of items will change to reflect the
     * replicated location.
     * 
     * It is not possible to migrate the default domain in this manner (since the default domain can not be added).
     * It is recommended to migrate usage of the default domain to a domain with an explicit identifier instead.
     * 
     * @param displayName a user visible string representing the group of items the
     *                    file provider extension is using.
     * 
     *                    API-Since: 16.0
     */
    @Generated
    @Selector("initWithIdentifier:displayName:")
    public native NSFileProviderDomain initWithIdentifierDisplayName(@NotNull String identifier,
            @NotNull String displayName);

    /**
     * If the domain is a replicated domain.
     * 
     * If set to YES, it means the domain is replicated. By default, on macOS, the value will always be YES.
     * 
     * On iOS, it will depend on the way the NSFileProviderDomain object is contructed. Calling
     * -[NSFileProviderDomain initWithIdentifier:displayName:] will initialize a replicated domain.
     * -[NSFileProviderDomain initWithIdentifier:displayName:pathRelativeToDocumentStorage:] will
     * initialize a non-replicated domain.
     * 
     * To know whether a domain is replicated or not, users are advised to rely on the output of
     * +[NSFileProviderManager getDomainsForProviderIdentifier:completionHandler:]
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isReplicated")
    public native boolean isReplicated();

    /**
     * Testing modes.
     * 
     * Testing modes are exposed as a means for the provider to have more control over the system in
     * a testing environment. Enabling a testing mode alters the behavior of the system and enables
     * some APIs for that mode.
     * 
     * A process must have the com.apple.developer.fileprovider.testing-mode entitlement in order to
     * configure a domain with non-empty testing modes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setTestingModes:")
    public native void setTestingModes(@NUInt long value);

    /**
     * Testing modes.
     * 
     * Testing modes are exposed as a means for the provider to have more control over the system in
     * a testing environment. Enabling a testing mode alters the behavior of the system and enables
     * some APIs for that mode.
     * 
     * A process must have the com.apple.developer.fileprovider.testing-mode entitlement in order to
     * configure a domain with non-empty testing modes.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("testingModes")
    @NUInt
    public native long testingModes();

    /**
     * If user has disabled this domain from Files.app on iOS or System Settings on macOS, this will be set
     * to NO.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("userEnabled")
    public native boolean userEnabled();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

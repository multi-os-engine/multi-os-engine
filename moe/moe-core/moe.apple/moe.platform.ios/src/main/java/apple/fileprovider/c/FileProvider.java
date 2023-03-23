package apple.fileprovider.c;

import apple.foundation.NSData;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("FileProvider")
@Runtime(CRuntime.class)
public final class FileProvider {
    static {
        NatJ.register();
    }

    @Generated
    private FileProvider() {
    }

    /**
     * The root of the hierarchical enumeration, i.e the container enumerated when the
     * user starts browsing your file provider.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderRootContainerItemIdentifier();

    /**
     * The item identifier of the working set, a synthetic container used by the
     * extension to communicate changes to the system even when the parent directories
     * of these items aren't actively being enumerated. Items in this set should have
     * their parentItemIdentifier set to the identifier of their parent directory.
     * 
     * The working set is the set of files and directories that should be made
     * available to the system regardless of the local browsing history. Files listed
     * in the working set are indexed in the local Spotlight index and appear in
     * offline search results. They contribute to the Recents view of the Files app,
     * sorted by lastUsedDate, and it is therefore important to provide a consistent
     * experience across devices by including in the working set all the documents
     * recently used, trashed, favorited, shared or tagged.
     * 
     * The Spotlight index and the Recents view will show outdated information unless
     * the file provider extension keeps the working set up to date with local and
     * remote changes. When an item in the working set is remotely modified, the
     * extension calls -signalEnumeratorForContainerItemIdentifier: on the identifier
     * of the working set; the system will then enumerate changes and update its caches.
     * 
     * Starting in iOS 12 and macOS 10.15, the system maintains a cache on the local
     * file system of files and directories previously enumerated. The working set
     * is the container used to update that set of files. The extension may know
     * whether an item is in that set by checking whether its parentItemIdentifier
     * is listed in the materialized containers, see the documentation on
     * -materializedItemsDidChangeWithCompletionHandler:.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderWorkingSetContainerItemIdentifier();

    /**
     * A special value for favorite ranks, to use when no rank was set when the item
     * was favorited.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native long NSFileProviderFavoriteRankUnranked();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native NSData NSFileProviderInitialPageSortedByDate();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    public static native NSData NSFileProviderInitialPageSortedByName();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderErrorDomain();

    /**
     * API-Since: 8.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: NSFileProviderErrorItemKey
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderErrorCollidingItemKey();

    /**
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderErrorNonExistentItemIdentifierKey();

    /**
     * API-Since: 13.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderErrorItemKey();

    /**
     * The container containing all the trashed items.
     * 
     * When an item is trashed, its `parentItemIdentifier` becomes `NSFileProviderTrashContainerItemIdentifier`.
     * 
     * Extension should be able to return all trashed items by supporting the creation of a NSFileProviderEnumerator
     * for the trashed items.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderTrashContainerItemIdentifier();

    /**
     * Posted when any domain changed.
     * 
     * Interested client should then call `+[NSFileProviderManager getDomainsWithCompletionHandler:]` and see
     * what changed.
     * 
     * Note, this notification starts to be posted only after `+[NSFileProviderManager
     * getDomainsWithCompletionHandler:]` is
     * called.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderDomainDidChange();

    /**
     * Posted when the materialized set has changed.
     * 
     * Interested clients can then use the materialized set enumerator returned by -enumeratorForMaterializedItems to
     * enumerate changes on the materialized set.
     * 
     * Note, this notification starts to be posted only after `+[NSFileProviderManager
     * getDomainsWithCompletionHandler:]` is called.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderMaterializedSetDidChange();

    /**
     * Posted when the pending set has changed.
     * 
     * Interested clients can then use the pending set enumerator returned by -enumeratorForPendingItems to enumerate
     * changes on the pending set.
     * 
     * Note, this notification starts to be posted only after `+[NSFileProviderManager
     * getDomainsWithCompletionHandler:]` is called.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String NSFileProviderPendingSetDidChange();
}

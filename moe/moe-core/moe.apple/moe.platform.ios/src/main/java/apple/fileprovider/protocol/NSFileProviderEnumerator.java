package apple.fileprovider.protocol;

import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderEnumerator")
public interface NSFileProviderEnumerator {
    /**
     * Request the current sync anchor.
     * <p>
     * To keep an enumeration updated, the system will typically
     * - request the current sync anchor (1)
     * - enumerate items starting with an initial page
     * - continue enumerating pages, each time from the page returned in the previous
     * enumeration, until finishEnumeratingUpToPage: is called with nextPage set to
     * nil
     * - enumerate changes starting from the sync anchor returned in (1), until
     * finishEnumeratingChangesUpToSyncAnchor: is called with the latest sync anchor.
     * If moreComing is YES, continue enumerating changes, using the latest sync anchor returned.
     * If moreComing is NO, stop enumerating.
     * - When the extension calls -[NSFileProviderManager signalEnumeratorForContainerItemIdentifier:
     * completionHandler:] to signal more changes, the system will again enumerate changes,
     * starting at the latest known sync anchor from finishEnumeratingChangesUpToSyncAnchor.
     * <p>
     * NOTE that the change-based observation methods are marked optional for historical
     * reasons, but are really required. System performance will be severely degraded if
     * they are not implemented.
     */
    @Generated
    @IsOptional
    @Selector("currentSyncAnchorWithCompletionHandler:")
    default void currentSyncAnchorWithCompletionHandler(
            @ObjCBlock(name = "call_currentSyncAnchorWithCompletionHandler") Block_currentSyncAnchorWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_currentSyncAnchorWithCompletionHandler {
        @Generated
        void call_currentSyncAnchorWithCompletionHandler(NSData currentAnchor);
    }

    /**
     * Enumerate changes starting from a sync anchor. This should enumerate /all/
     * changes (not restricted to a specific page) since the given sync anchor.
     * <p>
     * Until the enumeration update is invalidated, a call to -[NSFileProviderManager
     * signalEnumeratorForContainerItemIdentifier:completionHandler:] will trigger a
     * call to enumerateFromSyncAnchor with the latest known sync anchor, giving the
     * file provider (app or extension) a chance to notify about changes.
     * <p>
     * The anchor data should contain whatever information is needed to resume
     * enumerating changes from the previous synchronization point.  A naive sync
     * anchor might for example be the date of the last change that was sent from the
     * server to the client, meaning that at that date, the client was in sync with
     * all the server changes.  A request to enumerate changes from that sync anchor
     * would only return the changes that happened after that date, which are
     * therefore changes that the client doesn't yet know about.
     * <p>
     * NOTE that the change-based observation methods are marked optional for historical
     * reasons, but are really required. System performance will be severely degraded if
     * they are not implemented.
     */
    @Generated
    @IsOptional
    @Selector("enumerateChangesForObserver:fromSyncAnchor:")
    default void enumerateChangesForObserverFromSyncAnchor(
            @Mapped(ObjCObjectMapper.class) NSFileProviderChangeObserver observer, NSData syncAnchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Enumerate items starting from the specified page, typically
     * NSFileProviderInitialPageSortedByDate or NSFileProviderInitialPageSortedByName.
     * <p>
     * Pagination allows large collections to be enumerated in multiple batches.  The
     * sort order specified in the initial page is important even if the enumeration
     * results will actually be sorted again before display.  If results are sorted
     * correctly across pages, then the new results will be appended at the bottom of
     * the list, probably not on screen, which is the best user experience.  Otherwise
     * results from the second page might be inserted in the results from the first
     * page, causing bizarre animations.
     * <p>
     * The page data should contain whatever information is needed to resume the
     * enumeration after the previous page.  If a file provider sends batches of 200
     * items to -[NSFileProviderEnumerationObserver didEnumerateItems:] for example,
     * then successive pages might contain offsets in increments of 200.
     */
    @Generated
    @Selector("enumerateItemsForObserver:startingAtPage:")
    void enumerateItemsForObserverStartingAtPage(
            @Mapped(ObjCObjectMapper.class) NSFileProviderEnumerationObserver observer, NSData page);

    @Generated
    @Selector("invalidate")
    void invalidate();
}

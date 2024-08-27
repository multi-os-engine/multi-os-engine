package apple.fileprovider.protocol;

import apple.fileprovider.NSFileProviderRequest;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderEnumerating")
public interface NSFileProviderEnumerating {
    /**
     * Create an enumerator for an item.
     * 
     * This method is called when the user lists the content of folder it never accessed
     * before. This can happen either when using Finder or when listing the content of
     * the directory from a Terminal (for instance using the `ls` command line tool). The
     * system will use the enumerator to list the children of the directory by calling
     * -[NSFileProviderEnumerator enumerateItemsForObserver:startingAtPage:] until nil
     * is passed to -[NSFileProviderEnumerationObserver finishEnumeratingUpToPage:].
     * Once this has been called, the directory and its children should be included in the
     * working set.
     * 
     * This is also used to subscribe to live updates for a single document.
     * 
     * The system will keep an enumerator open in the extension on directories that are
     * presented to the user (for instance, in Finder), and on document on which an application
     * has a NSFilePresenter. The provider can use the existence of that enumerator as a hint
     * that the user is actively seeing / using the item in question, and prioritize the delivery
     * of updates on the item or its children in the working set.
     * 
     * If returning nil, you must set the error out parameter.
     * 
     * Working set enumerator:
     * -----------------------
     * The working set enumerator is a special enumerator (NSFileProviderWorkingSetContainerItemIdentifier)
     * the system uses to detect changes that should be synced to the disk and/or searchable
     * in Spotlight. Because that enumerator is by definition used for change detection, the
     * working set enumerator must implement
     * -[NSFileProviderEnumerator enumerateChangesForObserver:fromSyncAnchor:] and
     * -[NSFileProviderEnumerator currentSyncAnchorWithCompletionHandler:].
     * 
     * The system guarantees that it has a single consumer for the working set. This means there
     * will never be two concurrent enumerations of the working set and will always do forward
     * progress: the system will only ask for changes from the last requested sync anchor or
     * the last returned sync anchor and the extension should be prepared for it.
     * 
     * The expiration of the sync anchor of the working set will cause a very expensive scan
     * of all the items known by the system.
     * 
     * The system ingests the changes from the working set and applies the changes to the
     * disk replicate and the spotlight index. Before ingesting the update for an item,
     * the system will check if the enumeration of the item races against a call to
     * createItemBasedOnTemplate, modifyItem, ... that may affect the item. If a potential race
     * is detected, the system will call itemForItemIdentifier in order to resolve the race.
     * 
     * If the provider exposes the key NSExtensionFileProviderAppliesChangesAtomically with value
     * YES in its Info.plist, it is considered to apply the changes atomically, in which case the
     * system does not need to check for potential races.
     * 
     * Execution time:
     * ---------------
     * The system expects this call to complete quickly, it should build the object that will be
     * used for enumeration and return it. The enumeration logic should happen when the system
     * calls `-[NSFileProviderEnumerator enumerateItemsForObserver:startingAtPage:]` or
     * `-[NSFileProviderEnumerator enumerateChangesForObserver:fromSyncAnchor:]`.
     * 
     * Error cases:
     * ------------
     * If containerItemIdentifier is NSFileProviderTrashContainerItemIdentifier and
     * the extension does not support trashing items, then it should fail the call
     * with the NSFeatureUnsupportedError error code from the NSCocoaErrorDomain
     * domain.
     * 
     * If the item requested containerItemIdentifier does not exist in the provider,
     * the extension should fail with NSFileProviderErrorNoSuchItem. In that case,
     * the system will consider the item has been deleted and attempt to delete the
     * item from disk.
     * 
     * The extension can also report the NSFileProviderErrorNotAuthenticated,
     * NSFileProviderErrorServerUnreachable in case the item cannot be fetched
     * because of the current state of the system / domain. In that case, the
     * system will present an appropriate error message and back off until the
     * next time it is signalled.
     * 
     * Any other error, including crashes of the extension process, will be considered to be transient
     * and will cause the enumeration to be retried.
     * 
     * Errors must be in one of the following domains: NSCocoaErrorDomain, NSFileProviderErrorDomain.
     * 
     * For errors which can not be represented using an existing error code in one of these domains, the extension
     * should construct an NSError with domain NSCocoaErrorDomain and code NSXPCConnectionReplyInvalid.
     * The extension should set the NSUnderlyingErrorKey in the NSError's userInfo to the error which could not
     * be represented.
     */
    @Nullable
    @Generated
    @Selector("enumeratorForContainerItemIdentifier:request:error:")
    @MappedReturn(ObjCObjectMapper.class)
    NSFileProviderEnumerator enumeratorForContainerItemIdentifierRequestError(@NotNull String containerItemIdentifier,
            @NotNull NSFileProviderRequest request, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
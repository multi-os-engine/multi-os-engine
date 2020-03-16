package apple.fileprovider.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderChangeObserver")
public interface NSFileProviderChangeObserver {
    @Generated
    @Selector("didDeleteItemsWithIdentifiers:")
    void didDeleteItemsWithIdentifiers(NSArray<String> deletedItemIdentifiers);

    @Generated
    @Selector("didUpdateItems:")
    void didUpdateItems(NSArray<?> updatedItems);

    @Generated
    @Selector("finishEnumeratingChangesUpToSyncAnchor:moreComing:")
    void finishEnumeratingChangesUpToSyncAnchorMoreComing(NSData anchor, boolean moreComing);

    @Generated
    @Selector("finishEnumeratingWithError:")
    void finishEnumeratingWithError(NSError error);
}
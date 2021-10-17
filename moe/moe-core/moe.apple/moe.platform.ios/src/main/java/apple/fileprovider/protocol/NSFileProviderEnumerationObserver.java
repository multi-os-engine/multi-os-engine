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
@ObjCProtocolName("NSFileProviderEnumerationObserver")
public interface NSFileProviderEnumerationObserver {
    @Generated
    @Selector("didEnumerateItems:")
    void didEnumerateItems(NSArray<?> updatedItems);

    /**
     * Call this method after enumerating a full page of items.  If you set a non-nil
     * nextPage, -[NSFileProviderEnumerator enumerateItemsToObserver:startingAtPage:]
     * might be called with nextPage to enumerate more items.  This is typically
     * driven by the user scrolling a UIDocumentBrowserViewController presenting a
     * directory containing more child items that would fit in the view.
     * <p>
     * Page data is limited to 500 bytes.  Setting a larger nextPage interrupts the
     * enumeration.
     */
    @Generated
    @Selector("finishEnumeratingUpToPage:")
    void finishEnumeratingUpToPage(NSData nextPage);

    @Generated
    @Selector("finishEnumeratingWithError:")
    void finishEnumeratingWithError(NSError error);
}

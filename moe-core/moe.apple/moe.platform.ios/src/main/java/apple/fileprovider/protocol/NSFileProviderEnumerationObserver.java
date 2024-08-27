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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.ann.IsOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderEnumerationObserver")
public interface NSFileProviderEnumerationObserver {
    @Generated
    @Selector("didEnumerateItems:")
    void didEnumerateItems(@NotNull NSArray<?> updatedItems);

    /**
     * Call this method after enumerating a full page of items. If you set a non-nil
     * nextPage, -[NSFileProviderEnumerator enumerateItemsToObserver:startingAtPage:]
     * might be called with nextPage to enumerate more items. This is typically
     * driven by the user scrolling a UIDocumentBrowserViewController presenting a
     * directory containing more child items that would fit in the view.
     * 
     * Page data is limited to 500 bytes. Setting a larger nextPage interrupts the
     * enumeration.
     */
    @Generated
    @Selector("finishEnumeratingUpToPage:")
    void finishEnumeratingUpToPage(@Nullable NSData nextPage);

    @Generated
    @Selector("finishEnumeratingWithError:")
    void finishEnumeratingWithError(@NotNull NSError error);

    /**
     * Size of the page suggested by the system for better performance.
     * 
     * The system will set that property to the value it considers is best suited for the current enumeration. The
     * system can enumerate a container in various cases (container presenter in the UI, file opened in an application,
     * materialization of the folder by the system, ...). Each case has its own performance profile.
     * 
     * By taking into account the suggested size, the enumeration will guarantee the best user experience possible. The
     * system enforces a maximum of 100 times the suggested size.
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("suggestedPageSize")
    @NInt
    default long suggestedPageSize() {
        throw new java.lang.UnsupportedOperationException();
    }
}

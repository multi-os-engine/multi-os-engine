package apple.fileprovider.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderCustomAction")
public interface NSFileProviderCustomAction {
    /**
     * Perform a custom action identified by `actionIdentifier`, on items identified by
     * `itemIdentifiers`.
     * 
     * Custom actions are defined in the File Provider Extension's Info.plist, under the
     * `NSExtensionFileProviderActions` key. The format of this key is identical to actions
     * defined in a FileProviderUI extension.
     * 
     * Cancellations:
     * ------------
     * If the NSProgress returned by this method is cancelled, the extension should
     * call the completion handler with (NSUserCancelledError) in the NSProgress
     * cancellation handler.
     */
    @NotNull
    @Generated
    @Selector("performActionWithIdentifier:onItemsWithIdentifiers:completionHandler:")
    NSProgress performActionWithIdentifierOnItemsWithIdentifiersCompletionHandler(@NotNull String actionIdentifier,
            @NotNull NSArray<String> itemIdentifiers,
            @NotNull @ObjCBlock(name = "call_performActionWithIdentifierOnItemsWithIdentifiersCompletionHandler") Block_performActionWithIdentifierOnItemsWithIdentifiersCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performActionWithIdentifierOnItemsWithIdentifiersCompletionHandler {
        @Generated
        void call_performActionWithIdentifierOnItemsWithIdentifiersCompletionHandler(@Nullable NSError error);
    }
}
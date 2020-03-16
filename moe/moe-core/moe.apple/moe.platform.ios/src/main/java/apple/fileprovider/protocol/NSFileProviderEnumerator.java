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
        void call_currentSyncAnchorWithCompletionHandler(NSData arg0);
    }

    @Generated
    @IsOptional
    @Selector("enumerateChangesForObserver:fromSyncAnchor:")
    default void enumerateChangesForObserverFromSyncAnchor(@Mapped(ObjCObjectMapper.class) Object observer,
            NSData syncAnchor) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("enumerateItemsForObserver:startingAtPage:")
    void enumerateItemsForObserverStartingAtPage(@Mapped(ObjCObjectMapper.class) Object observer, NSData page);

    @Generated
    @Selector("invalidate")
    void invalidate();
}
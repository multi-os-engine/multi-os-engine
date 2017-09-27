package apple.quicklook.protocol;

import apple.foundation.NSError;
import apple.foundation.NSURL;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("QuickLook")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("QLPreviewingController")
public interface QLPreviewingController {
    @Generated
    @IsOptional
    @Selector("preparePreviewOfFileAtURL:completionHandler:")
    default void preparePreviewOfFileAtURLCompletionHandler(NSURL url,
            @ObjCBlock(name = "call_preparePreviewOfFileAtURLCompletionHandler") Block_preparePreviewOfFileAtURLCompletionHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preparePreviewOfFileAtURLCompletionHandler {
        @Generated
        void call_preparePreviewOfFileAtURLCompletionHandler(NSError arg0);
    }

    @Generated
    @IsOptional
    @Selector("preparePreviewOfSearchableItemWithIdentifier:queryString:completionHandler:")
    default void preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler(String identifier,
            String queryString,
            @ObjCBlock(name = "call_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler") Block_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler {
        @Generated
        void call_preparePreviewOfSearchableItemWithIdentifierQueryStringCompletionHandler(NSError arg0);
    }
}
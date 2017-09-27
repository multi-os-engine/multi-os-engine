package apple.foundation.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSProgress;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSItemProviderWriting")
public interface NSItemProviderWriting {
    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    default long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler {
        @Generated
        void call_loadDataWithTypeIdentifierForItemProviderCompletionHandler(NSData arg0, NSError arg1);
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    NSArray<String> _writableTypeIdentifiersForItemProvider_static();
}
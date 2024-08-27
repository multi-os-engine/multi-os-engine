package apple.foundation.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This protocol allows a class to be constructed from a variety of binary representations.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSItemProviderReading")
public interface NSItemProviderReading {
    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    NSItemProviderReading _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @NotNull
    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    NSArray<String> _readableTypeIdentifiersForItemProvider();
}

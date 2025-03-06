package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIItemProviderReadingAugmentationProviding")
public interface UIItemProviderReadingAugmentationProviding {
    /**
     * Conforming classes should not fall through to -readableTypeIdentifiersForItemProvider of the original
     * NSItemProviderReading clas.
     * UIItemProvider does this on your behalf.
     */
    @Generated
    @Selector("additionalLeadingReadableTypeIdentifiersForItemProvider")
    @ProtocolClassMethod("additionalLeadingReadableTypeIdentifiersForItemProvider")
    @NotNull
    NSArray<String> _additionalLeadingReadableTypeIdentifiersForItemProvider();

    @Generated
    @Selector("additionalTrailingReadableTypeIdentifiersForItemProvider")
    @ProtocolClassMethod("additionalTrailingReadableTypeIdentifiersForItemProvider")
    @NotNull
    NSArray<String> _additionalTrailingReadableTypeIdentifiersForItemProvider();

    /**
     * Conforming classes should not fall through to [requestedClass objectWithItemProviderData:typeIdentifier:error:.
     * UIItemProvider does this on your behalf.
     */
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:requestedClass:error:")
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierRequestedClassError")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    Object _objectWithItemProviderDataTypeIdentifierRequestedClassError(@NotNull NSData data,
            @NotNull String typeIdentifier, @NotNull Class requestedClass,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> outError);
}
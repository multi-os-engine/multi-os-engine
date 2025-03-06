package apple.uikit.protocol;

import apple.foundation.protocol.NSItemProviderReading;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIItemProviderReadingAugmentationDesignating")
public interface UIItemProviderReadingAugmentationDesignating extends NSItemProviderReading {
    @Generated
    @Selector("_ui_augmentingNSItemProviderReadingClass")
    @ProtocolClassMethod("_ui_augmentingNSItemProviderReadingClass")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    UIItemProviderReadingAugmentationProviding __ui_augmentingNSItemProviderReadingClass();
}
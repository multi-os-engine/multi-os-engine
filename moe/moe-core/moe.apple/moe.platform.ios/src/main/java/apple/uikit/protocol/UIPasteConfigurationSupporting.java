package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSItemProvider;
import apple.uikit.UIPasteConfiguration;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPasteConfigurationSupporting")
public interface UIPasteConfigurationSupporting {
    @Generated
    @IsOptional
    @Selector("canPasteItemProviders:")
    default boolean canPasteItemProviders(NSArray<? extends NSItemProvider> itemProviders) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("pasteConfiguration")
    UIPasteConfiguration pasteConfiguration();

    @Generated
    @IsOptional
    @Selector("pasteItemProviders:")
    default void pasteItemProviders(NSArray<? extends NSItemProvider> itemProviders) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("setPasteConfiguration:")
    void setPasteConfiguration(UIPasteConfiguration value);
}
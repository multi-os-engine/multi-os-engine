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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIPasteConfigurationSupporting")
public interface UIPasteConfigurationSupporting {
    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("canPasteItemProviders:")
    default boolean canPasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("pasteConfiguration")
    UIPasteConfiguration pasteConfiguration();

    /**
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("pasteItemProviders:")
    default void pasteItemProviders(@NotNull NSArray<? extends NSItemProvider> itemProviders) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPasteConfiguration:")
    void setPasteConfiguration(@Nullable UIPasteConfiguration value);
}
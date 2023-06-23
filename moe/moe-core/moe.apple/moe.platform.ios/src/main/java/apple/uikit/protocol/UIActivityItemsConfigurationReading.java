package apple.uikit.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSItemProvider;
import apple.uikit.UIActivity;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIActivityItemsConfigurationReading")
public interface UIActivityItemsConfigurationReading {
    @Nullable
    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationMetadataForItemAtIndex:key:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object activityItemsConfigurationMetadataForItemAtIndexKey(@NInt long index, @NotNull String key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationMetadataForKey:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object activityItemsConfigurationMetadataForKey(@NotNull String key) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationPreviewForItemAtIndex:intent:suggestedSize:")
    default NSItemProvider activityItemsConfigurationPreviewForItemAtIndexIntentSuggestedSize(@NInt long index,
            @NotNull String intent, @ByValue CGSize suggestedSize) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If not implemented, defaults to YES.
     */
    @Generated
    @IsOptional
    @Selector("activityItemsConfigurationSupportsInteraction:")
    default boolean activityItemsConfigurationSupportsInteraction(@NotNull String interaction) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("applicationActivitiesForActivityItemsConfiguration")
    default NSArray<? extends UIActivity> applicationActivitiesForActivityItemsConfiguration() {
        throw new java.lang.UnsupportedOperationException();
    }

    @NotNull
    @Generated
    @Selector("itemProvidersForActivityItemsConfiguration")
    NSArray<? extends NSItemProvider> itemProvidersForActivityItemsConfiguration();
}
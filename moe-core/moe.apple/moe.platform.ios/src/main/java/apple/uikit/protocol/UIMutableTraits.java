package apple.uikit.protocol;

import apple.protocol.NSObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIMutableTraits")
public interface UIMutableTraits {
    @Generated
    @Selector("accessibilityContrast")
    @NInt
    long accessibilityContrast();

    @Generated
    @Selector("activeAppearance")
    @NInt
    long activeAppearance();

    @Generated
    @Selector("displayGamut")
    @NInt
    long displayGamut();

    @Generated
    @Selector("displayScale")
    @NFloat
    double displayScale();

    @Generated
    @Selector("forceTouchCapability")
    @NInt
    long forceTouchCapability();

    @Generated
    @Selector("horizontalSizeClass")
    @NInt
    long horizontalSizeClass();

    @Generated
    @Selector("imageDynamicRange")
    @NInt
    long imageDynamicRange();

    @Generated
    @Selector("layoutDirection")
    @NInt
    long layoutDirection();

    @Generated
    @Selector("legibilityWeight")
    @NInt
    long legibilityWeight();

    @Generated
    @Selector("objectForTrait:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    NSObject objectForTrait(@Mapped(ObjCObjectMapper.class) @NotNull UIObjectTraitDefinition trait);

    @Generated
    @Selector("preferredContentSizeCategory")
    @NotNull
    String preferredContentSizeCategory();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("sceneCaptureState")
    @NInt
    long sceneCaptureState();

    @Generated
    @Selector("setAccessibilityContrast:")
    void setAccessibilityContrast(@NInt long value);

    @Generated
    @Selector("setActiveAppearance:")
    void setActiveAppearance(@NInt long value);

    @Generated
    @Selector("setCGFloatValue:forTrait:")
    void setCGFloatValueForTrait(@NFloat double value,
            @Mapped(ObjCObjectMapper.class) @NotNull UICGFloatTraitDefinition trait);

    @Generated
    @Selector("setDisplayGamut:")
    void setDisplayGamut(@NInt long value);

    @Generated
    @Selector("setDisplayScale:")
    void setDisplayScale(@NFloat double value);

    @Generated
    @Selector("setForceTouchCapability:")
    void setForceTouchCapability(@NInt long value);

    @Generated
    @Selector("setHorizontalSizeClass:")
    void setHorizontalSizeClass(@NInt long value);

    @Generated
    @Selector("setImageDynamicRange:")
    void setImageDynamicRange(@NInt long value);

    @Generated
    @Selector("setLayoutDirection:")
    void setLayoutDirection(@NInt long value);

    @Generated
    @Selector("setLegibilityWeight:")
    void setLegibilityWeight(@NInt long value);

    @Generated
    @Selector("setNSIntegerValue:forTrait:")
    void setNSIntegerValueForTrait(@NInt long value,
            @Mapped(ObjCObjectMapper.class) @NotNull UINSIntegerTraitDefinition trait);

    @Generated
    @Selector("setObject:forTrait:")
    void setObjectForTrait(@Mapped(ObjCObjectMapper.class) @Nullable NSObject object,
            @Mapped(ObjCObjectMapper.class) @NotNull UIObjectTraitDefinition trait);

    @Generated
    @Selector("setPreferredContentSizeCategory:")
    void setPreferredContentSizeCategory(@NotNull String value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setSceneCaptureState:")
    void setSceneCaptureState(@NInt long value);

    @Generated
    @Selector("setToolbarItemPresentationSize:")
    void setToolbarItemPresentationSize(@NInt long value);

    @Generated
    @Selector("setTypesettingLanguage:")
    void setTypesettingLanguage(@NotNull String value);

    @Generated
    @Selector("setUserInterfaceIdiom:")
    void setUserInterfaceIdiom(@NInt long value);

    @Generated
    @Selector("setUserInterfaceLevel:")
    void setUserInterfaceLevel(@NInt long value);

    @Generated
    @Selector("setUserInterfaceStyle:")
    void setUserInterfaceStyle(@NInt long value);

    @Generated
    @Selector("setVerticalSizeClass:")
    void setVerticalSizeClass(@NInt long value);

    @Generated
    @Selector("toolbarItemPresentationSize")
    @NInt
    long toolbarItemPresentationSize();

    @Generated
    @Selector("typesettingLanguage")
    @NotNull
    String typesettingLanguage();

    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    long userInterfaceIdiom();

    @Generated
    @Selector("userInterfaceLevel")
    @NInt
    long userInterfaceLevel();

    @Generated
    @Selector("userInterfaceStyle")
    @NInt
    long userInterfaceStyle();

    @Generated
    @Selector("valueForCGFloatTrait:")
    @NFloat
    double valueForCGFloatTrait(@Mapped(ObjCObjectMapper.class) @NotNull UICGFloatTraitDefinition trait);

    @Generated
    @Selector("valueForNSIntegerTrait:")
    @NInt
    long valueForNSIntegerTrait(@Mapped(ObjCObjectMapper.class) @NotNull UINSIntegerTraitDefinition trait);

    @Generated
    @Selector("verticalSizeClass")
    @NInt
    long verticalSizeClass();
}
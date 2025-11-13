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
import org.moe.natj.objc.Class;

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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("activeAppearance")
    @NInt
    long activeAppearance();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("displayGamut")
    @NInt
    long displayGamut();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("displayScale")
    @NFloat
    double displayScale();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("forceTouchCapability")
    @NInt
    long forceTouchCapability();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("horizontalSizeClass")
    @NInt
    long horizontalSizeClass();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("imageDynamicRange")
    @NInt
    long imageDynamicRange();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("layoutDirection")
    @NInt
    long layoutDirection();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("legibilityWeight")
    @NInt
    long legibilityWeight();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("objectForTrait:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    NSObject objectForTrait(@NotNull Class trait);

    /**
     * API-Since: 17.0
     */
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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setActiveAppearance:")
    void setActiveAppearance(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setCGFloatValue:forTrait:")
    void setCGFloatValueForTrait(@NFloat double value, @NotNull Class trait);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setDisplayGamut:")
    void setDisplayGamut(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setDisplayScale:")
    void setDisplayScale(@NFloat double value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setForceTouchCapability:")
    void setForceTouchCapability(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setHorizontalSizeClass:")
    void setHorizontalSizeClass(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setImageDynamicRange:")
    void setImageDynamicRange(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLayoutDirection:")
    void setLayoutDirection(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLegibilityWeight:")
    void setLegibilityWeight(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setNSIntegerValue:forTrait:")
    void setNSIntegerValueForTrait(@NInt long value, @NotNull Class trait);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setObject:forTrait:")
    void setObjectForTrait(@Mapped(ObjCObjectMapper.class) @Nullable NSObject object, @NotNull Class trait);

    /**
     * API-Since: 17.0
     */
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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setTypesettingLanguage:")
    void setTypesettingLanguage(@NotNull String value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setUserInterfaceIdiom:")
    void setUserInterfaceIdiom(@NInt long value);

    @Generated
    @Selector("setUserInterfaceLevel:")
    void setUserInterfaceLevel(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setUserInterfaceStyle:")
    void setUserInterfaceStyle(@NInt long value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVerticalSizeClass:")
    void setVerticalSizeClass(@NInt long value);

    @Generated
    @Selector("toolbarItemPresentationSize")
    @NInt
    long toolbarItemPresentationSize();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("typesettingLanguage")
    @NotNull
    String typesettingLanguage();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    long userInterfaceIdiom();

    @Generated
    @Selector("userInterfaceLevel")
    @NInt
    long userInterfaceLevel();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("userInterfaceStyle")
    @NInt
    long userInterfaceStyle();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("valueForCGFloatTrait:")
    @NFloat
    double valueForCGFloatTrait(@NotNull Class trait);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("valueForNSIntegerTrait:")
    @NInt
    long valueForNSIntegerTrait(@NotNull Class trait);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("verticalSizeClass")
    @NInt
    long verticalSizeClass();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("listEnvironment")
    @NInt
    long listEnvironment();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("setListEnvironment:")
    void setListEnvironment(@NInt long value);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("resolvesNaturalAlignmentWithBaseWritingDirection")
    boolean resolvesNaturalAlignmentWithBaseWritingDirection();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("setResolvesNaturalAlignmentWithBaseWritingDirection:")
    void setResolvesNaturalAlignmentWithBaseWritingDirection(boolean value);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSplitViewControllerLayoutEnvironment:")
    void setSplitViewControllerLayoutEnvironment(@NInt long value);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTabAccessoryEnvironment:")
    void setTabAccessoryEnvironment(@NInt long value);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("splitViewControllerLayoutEnvironment")
    @NInt
    long splitViewControllerLayoutEnvironment();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("tabAccessoryEnvironment")
    @NInt
    long tabAccessoryEnvironment();
}
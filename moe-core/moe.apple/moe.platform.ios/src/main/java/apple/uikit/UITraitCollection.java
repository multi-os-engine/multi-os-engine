/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.uikit.protocol.UICGFloatTraitDefinition;
import apple.uikit.protocol.UINSIntegerTraitDefinition;
import apple.uikit.protocol.UIObjectTraitDefinition;

/**
 * A trait collection encapsulates the system traits of an interface's environment.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITraitCollection extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UITraitCollection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITraitCollection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITraitCollection allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UITraitCollection new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithDisplayGamut:")
    public static native UITraitCollection traitCollectionWithDisplayGamut(@NInt long displayGamut);

    @NotNull
    @Generated
    @Selector("traitCollectionWithDisplayScale:")
    public static native UITraitCollection traitCollectionWithDisplayScale(@NFloat double scale);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithForceTouchCapability:")
    public static native UITraitCollection traitCollectionWithForceTouchCapability(@NInt long capability);

    @NotNull
    @Generated
    @Selector("traitCollectionWithHorizontalSizeClass:")
    public static native UITraitCollection traitCollectionWithHorizontalSizeClass(@NInt long horizontalSizeClass);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithLayoutDirection:")
    public static native UITraitCollection traitCollectionWithLayoutDirection(@NInt long layoutDirection);

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithPreferredContentSizeCategory:")
    public static native UITraitCollection traitCollectionWithPreferredContentSizeCategory(
            @NotNull String preferredContentSizeCategory);

    /**
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Use +[UITraitCollection traitCollectionWithTraits:] and -[UITraitCollection
     * traitCollectionByModifyingTraits:] to create and modify trait collections
     */
    @Deprecated
    @NotNull
    @Generated
    @Selector("traitCollectionWithTraitsFromCollections:")
    public static native UITraitCollection traitCollectionWithTraitsFromCollections(
            @NotNull NSArray<? extends UITraitCollection> traitCollections);

    @NotNull
    @Generated
    @Selector("traitCollectionWithUserInterfaceIdiom:")
    public static native UITraitCollection traitCollectionWithUserInterfaceIdiom(@NInt long idiom);

    @NotNull
    @Generated
    @Selector("traitCollectionWithVerticalSizeClass:")
    public static native UITraitCollection traitCollectionWithVerticalSizeClass(@NInt long verticalSizeClass);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * This deprecated method considers system traits only.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Compare values for specific traits in the trait collections instead
     */
    @Deprecated
    @Generated
    @Selector("containsTraitsInCollection:")
    public native boolean containsTraitsInCollection(@Nullable UITraitCollection trait);

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * unspecified: UIDisplayGamutUnspecified
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("displayGamut")
    @NInt
    public native long displayGamut();

    /**
     * unspecified: 0.0
     */
    @Generated
    @Selector("displayScale")
    @NFloat
    public native double displayScale();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * unspecified: UIForceTouchCapabilityUnknown
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("forceTouchCapability")
    @NInt
    public native long forceTouchCapability();

    /**
     * unspecified: UIUserInterfaceSizeClassUnspecified
     */
    @Generated
    @Selector("horizontalSizeClass")
    @NInt
    public native long horizontalSizeClass();

    @Generated
    @Selector("init")
    public native UITraitCollection init();

    @Generated
    @Selector("initWithCoder:")
    public native UITraitCollection initWithCoder(@NotNull NSCoder coder);

    /**
     * unspecified: UITraitEnvironmentLayoutDirectionUnspecified
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("layoutDirection")
    @NInt
    public native long layoutDirection();

    /**
     * unspecified: UIContentSizeCategoryUnspecified
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("preferredContentSizeCategory")
    public native String preferredContentSizeCategory();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * unspecified: UIUserInterfaceIdiomUnspecified
     */
    @Generated
    @Selector("userInterfaceIdiom")
    @NInt
    public native long userInterfaceIdiom();

    /**
     * unspecified: UIUserInterfaceSizeClassUnspecified
     */
    @Generated
    @Selector("verticalSizeClass")
    @NInt
    public native long verticalSizeClass();

    /**
     * unspecified: UIAccessibilityContrastUnspecified
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("accessibilityContrast")
    @NInt
    public native long accessibilityContrast();

    /**
     * The current trait collection, used when resolving the appearance of dynamic UIColors and similar objects.
     * This is a thread-local property, so it may be changed on non-main threads without affecting the main thread.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("currentTraitCollection")
    public static native UITraitCollection currentTraitCollection();

    /**
     * Return whether this trait collection, compared to a different trait collection, could show a different appearance
     * for dynamic colors that are provided by UIKit or are in an asset catalog.
     * If you need to be aware of when dynamic colors might change, override `traitCollectionDidChange` in your view or
     * view controller,
     * and use this method to compare `self.traitCollection` with `previousTraitCollection`.
     * 
     * Currently, a change in any of these traits could affect dynamic colors:
     * userInterfaceIdiom, userInterfaceStyle, displayGamut, accessibilityContrast, userInterfaceLevel
     * and more could be added in the future.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hasDifferentColorAppearanceComparedToTraitCollection:")
    public native boolean hasDifferentColorAppearanceComparedToTraitCollection(
            @Nullable UITraitCollection traitCollection);

    /**
     * Returns an image configuration compatible with this trait collection.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("imageConfiguration")
    public native UIImageConfiguration imageConfiguration();

    /**
     * unspecified: UILegibilityWeightUnspecified
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("legibilityWeight")
    @NInt
    public native long legibilityWeight();

    /**
     * Sets `UITraitCollection.currentTraitCollection` to this trait collection, performs the given actions,
     * then restores `UITraitCollection.currentTraitCollection` to its original value.
     * Just like `currentTraitCollection`, this only affects the current thread, and may be used on non-main threads
     * without affecting the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("performAsCurrentTraitCollection:")
    public native void performAsCurrentTraitCollection(
            @NotNull @ObjCBlock(name = "call_performAsCurrentTraitCollection") Block_performAsCurrentTraitCollection actions);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performAsCurrentTraitCollection {
        @Generated
        void call_performAsCurrentTraitCollection();
    }

    /**
     * The current trait collection, used when resolving the appearance of dynamic UIColors and similar objects.
     * This is a thread-local property, so it may be changed on non-main threads without affecting the main thread.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCurrentTraitCollection:")
    public static native void setCurrentTraitCollection(@NotNull UITraitCollection value);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithAccessibilityContrast:")
    public static native UITraitCollection traitCollectionWithAccessibilityContrast(@NInt long accessibilityContrast);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithLegibilityWeight:")
    public static native UITraitCollection traitCollectionWithLegibilityWeight(@NInt long legibilityWeight);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithUserInterfaceLevel:")
    public static native UITraitCollection traitCollectionWithUserInterfaceLevel(@NInt long userInterfaceLevel);

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithUserInterfaceStyle:")
    public static native UITraitCollection traitCollectionWithUserInterfaceStyle(@NInt long userInterfaceStyle);

    /**
     * unspecified: UIUserInterfaceLevelUnspecified
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("userInterfaceLevel")
    @NInt
    public native long userInterfaceLevel();

    /**
     * unspecified: UIUserInterfaceStyleUnspecified
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("userInterfaceStyle")
    @NInt
    public native long userInterfaceStyle();

    /**
     * unspecified: UIUserInterfaceActiveAppearanceUnspecified
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("activeAppearance")
    @NInt
    public native long activeAppearance();

    /**
     * This trait indicates whether the UI should have an 'active' appearance.
     * On macOS, this varies based on window activation state.
     * On other platforms, this is always .active.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("traitCollectionWithActiveAppearance:")
    public static native UITraitCollection traitCollectionWithActiveAppearance(
            @NInt long userInterfaceActiveAppearance);

    @Generated
    @Selector("toolbarItemPresentationSize")
    @NInt
    public native long toolbarItemPresentationSize();

    @NotNull
    @Generated
    @Selector("traitCollectionWithToolbarItemPresentationSize:")
    public static native UITraitCollection traitCollectionWithToolbarItemPresentationSize(
            @NInt long toolbarItemPresentationSize);

    @Generated
    @Selector("changedTraitsFromTraitCollection:")
    @NotNull
    public native NSSet<?> changedTraitsFromTraitCollection(@Nullable UITraitCollection traitCollection);

    /**
     * The imageDynamicRange determines how HDR images will render in the given trait environment. SDR images are
     * unaffected.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("imageDynamicRange")
    @NInt
    public native long imageDynamicRange();

    @Generated
    @Selector("objectForTrait:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native apple.protocol.NSObject objectForTrait(
            @Mapped(ObjCObjectMapper.class) @NotNull UIObjectTraitDefinition trait);

    /**
     * Scene capture state represents whether a scene is currently being mirrored or recorded.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("sceneCaptureState")
    @NInt
    public native long sceneCaptureState();

    @Generated
    @Selector("systemTraitsAffectingColorAppearance")
    @NotNull
    public static native NSArray<?> systemTraitsAffectingColorAppearance();

    @Generated
    @Selector("systemTraitsAffectingImageLookup")
    @NotNull
    public static native NSArray<?> systemTraitsAffectingImageLookup();

    @Generated
    @Selector("traitCollectionByModifyingTraits:")
    @NotNull
    public native UITraitCollection traitCollectionByModifyingTraits(
            @ObjCBlock(name = "call_traitCollectionByModifyingTraits") @NotNull Block_traitCollectionByModifyingTraits mutations);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_traitCollectionByModifyingTraits {
        @Generated
        void call_traitCollectionByModifyingTraits(@Mapped(ObjCObjectMapper.class) @NotNull Object mutableTraits);
    }

    @Generated
    @Selector("traitCollectionByReplacingCGFloatValue:forTrait:")
    @NotNull
    public native UITraitCollection traitCollectionByReplacingCGFloatValueForTrait(@NFloat double value,
            @Mapped(ObjCObjectMapper.class) @NotNull UICGFloatTraitDefinition trait);

    @Generated
    @Selector("traitCollectionByReplacingNSIntegerValue:forTrait:")
    @NotNull
    public native UITraitCollection traitCollectionByReplacingNSIntegerValueForTrait(@NInt long value,
            @Mapped(ObjCObjectMapper.class) @NotNull UINSIntegerTraitDefinition trait);

    @Generated
    @Selector("traitCollectionByReplacingObject:forTrait:")
    @NotNull
    public native UITraitCollection traitCollectionByReplacingObjectForTrait(
            @Mapped(ObjCObjectMapper.class) @Nullable apple.protocol.NSObject object,
            @Mapped(ObjCObjectMapper.class) @NotNull UIObjectTraitDefinition trait);

    @Generated
    @Selector("traitCollectionWithCGFloatValue:forTrait:")
    @NotNull
    public static native UITraitCollection traitCollectionWithCGFloatValueForTrait(@NFloat double value,
            @Mapped(ObjCObjectMapper.class) @NotNull UICGFloatTraitDefinition trait);

    /**
     * Construct a new trait collection with the given image content dynamic range.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("traitCollectionWithImageDynamicRange:")
    @NotNull
    public static native UITraitCollection traitCollectionWithImageDynamicRange(@NInt long imageDynamicRange);

    @Generated
    @Selector("traitCollectionWithNSIntegerValue:forTrait:")
    @NotNull
    public static native UITraitCollection traitCollectionWithNSIntegerValueForTrait(@NInt long value,
            @Mapped(ObjCObjectMapper.class) @NotNull UINSIntegerTraitDefinition trait);

    @Generated
    @Selector("traitCollectionWithObject:forTrait:")
    @NotNull
    public static native UITraitCollection traitCollectionWithObjectForTrait(
            @Mapped(ObjCObjectMapper.class) @Nullable apple.protocol.NSObject object,
            @Mapped(ObjCObjectMapper.class) @NotNull UIObjectTraitDefinition trait);

    /**
     * Construct a new trait collection with the given scene capture state.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("traitCollectionWithSceneCaptureState:")
    @NotNull
    public static native UITraitCollection traitCollectionWithSceneCaptureState(@NInt long sceneCaptureState);

    @Generated
    @Selector("traitCollectionWithTraits:")
    @NotNull
    public static native UITraitCollection traitCollectionWithTraits(
            @ObjCBlock(name = "call_traitCollectionWithTraits") @NotNull Block_traitCollectionWithTraits mutations);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_traitCollectionWithTraits {
        @Generated
        void call_traitCollectionWithTraits(@Mapped(ObjCObjectMapper.class) @NotNull Object mutableTraits);
    }

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("traitCollectionWithTypesettingLanguage:")
    @NotNull
    public static native UITraitCollection traitCollectionWithTypesettingLanguage(@NotNull String language);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("typesettingLanguage")
    @NotNull
    public native String typesettingLanguage();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("valueForCGFloatTrait:")
    @NFloat
    public native double valueForCGFloatTrait(@Mapped(ObjCObjectMapper.class) @NotNull UICGFloatTraitDefinition trait);

    @Generated
    @Selector("valueForNSIntegerTrait:")
    @NInt
    public native long valueForNSIntegerTrait(
            @Mapped(ObjCObjectMapper.class) @NotNull UINSIntegerTraitDefinition trait);
}

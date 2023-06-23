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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import apple.uikit.struct.UIOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarItem extends UIBarItem implements UISpringLoadedInteractionSupporting,
        UIPopoverPresentationControllerSourceItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITabBarItem allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UITabBarItem appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITabBarItem appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITabBarItem appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITabBarItem appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITabBarItem appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITabBarItem appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UITabBarItem new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UITabBarItem _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITabBarItem _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITabBarItem _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITabBarItem _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITabBarItem _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITabBarItem _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * If this item displays a badge, this color will be used for the badge's background. If set to nil, the default
     * background color will be used instead.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("badgeColor")
    public native UIColor badgeColor();

    /**
     * Returns attributes previously set via -setBadgeTextAttributes:forState:.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("badgeTextAttributesForState:")
    public native NSDictionary<String, ?> badgeTextAttributesForState(@NUInt long state);

    /**
     * default is nil
     */
    @Nullable
    @Generated
    @Selector("badgeValue")
    public native String badgeValue();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("finishedSelectedImage")
    public native UIImage finishedSelectedImage();

    /**
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     */
    @Nullable
    @Generated
    @Deprecated
    @Selector("finishedUnselectedImage")
    public native UIImage finishedUnselectedImage();

    @Generated
    @Selector("init")
    public native UITabBarItem init();

    @Generated
    @Selector("initWithCoder:")
    public native UITabBarItem initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithTabBarSystemItem:tag:")
    public native UITabBarItem initWithTabBarSystemItemTag(@NInt long systemItem, @NInt long tag);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("initWithTitle:image:selectedImage:")
    public native UITabBarItem initWithTitleImageSelectedImage(@Nullable String title, @Nullable UIImage image,
            @Nullable UIImage selectedImage);

    /**
     * The unselected image is autogenerated from the image argument. The selected image
     * is autogenerated from the selectedImage if provided and the image argument otherwise.
     * To prevent system coloring, provide images with UIImageRenderingModeAlwaysOriginal (see UIImage.h)
     */
    @Generated
    @Selector("initWithTitle:image:tag:")
    public native UITabBarItem initWithTitleImageTag(@Nullable String title, @Nullable UIImage image, @NInt long tag);

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("selectedImage")
    public native UIImage selectedImage();

    /**
     * If this item displays a badge, this color will be used for the badge's background. If set to nil, the default
     * background color will be used instead.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setBadgeColor:")
    public native void setBadgeColor(@Nullable UIColor value);

    /**
     * Provide text attributes to use to draw the badge text for the given singular control state (Normal, Disabled,
     * Focused, Selected, or Highlighted). Default values will be supplied for keys that are not provided by this
     * dictionary. See NSAttributedString.h for details on what keys are available.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setBadgeTextAttributes:forState:")
    public native void setBadgeTextAttributesForState(@Nullable NSDictionary<String, ?> textAttributes,
            @NUInt long state);

    /**
     * default is nil
     */
    @Generated
    @Selector("setBadgeValue:")
    public native void setBadgeValue(@Nullable String value);

    /**
     * These methods are now deprecated. Please use -initWithTitle:image:selectedImage:.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: Use initWithTitle:image:selectedImage: or the image and selectedImage properties along with
     * UIImageRenderingModeAlwaysOriginal
     */
    @Generated
    @Deprecated
    @Selector("setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedSelectedImageWithFinishedUnselectedImage(@Nullable UIImage selectedImage,
            @Nullable UIImage unselectedImage);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setSelectedImage:")
    public native void setSelectedImage(@Nullable UIImage value);

    /**
     * To set item label text attributes use the appearance selectors available on the superclass, UIBarItem.
     * 
     * Use the following to tweak the relative position of the label within the tab button (for handling visual
     * centering corrections if needed because of custom text attributes)
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * To set item label text attributes use the appearance selectors available on the superclass, UIBarItem.
     * 
     * Use the following to tweak the relative position of the label within the tab button (for handling visual
     * centering corrections if needed because of custom text attributes)
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("titlePositionAdjustment")
    @ByValue
    public native UIOffset titlePositionAdjustment();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    /**
     * When set and this item is selected, overrides the hosting tab bar's standardAppearance.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(@Nullable UITabBarAppearance value);

    /**
     * When set and this item is selected, overrides the hosting tab bar's standardAppearance.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("standardAppearance")
    public native UITabBarAppearance standardAppearance();

    /**
     * When set and this item is selected, overrides the hosting tab bar's scrollEdgeAppearance.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UITabBarAppearance scrollEdgeAppearance();

    /**
     * When set and this item is selected, overrides the hosting tab bar's scrollEdgeAppearance.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(@Nullable UITabBarAppearance value);
}

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
import org.moe.natj.general.ann.MappedReturn;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarItem extends UIBarItem implements UISpringLoadedInteractionSupporting {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @ProtocolClassMethod("appearance")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * If this item displays a badge, this color will be used for the badge's background. If set to nil, the default background color will be used instead.
     */
    @Generated
    @Selector("badgeColor")
    public native UIColor badgeColor();

    /**
     * Returns attributes previously set via -setBadgeTextAttributes:forState:.
     */
    @Generated
    @Selector("badgeTextAttributesForState:")
    public native NSDictionary<String, ?> badgeTextAttributesForState(@NUInt long state);

    /**
     * default is nil
     */
    @Generated
    @Selector("badgeValue")
    public native String badgeValue();

    @Generated
    @Deprecated
    @Selector("finishedSelectedImage")
    public native UIImage finishedSelectedImage();

    @Generated
    @Deprecated
    @Selector("finishedUnselectedImage")
    public native UIImage finishedUnselectedImage();

    @Generated
    @Selector("init")
    public native UITabBarItem init();

    @Generated
    @Selector("initWithCoder:")
    public native UITabBarItem initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithTabBarSystemItem:tag:")
    public native UITabBarItem initWithTabBarSystemItemTag(@NInt long systemItem, @NInt long tag);

    @Generated
    @Selector("initWithTitle:image:selectedImage:")
    public native UITabBarItem initWithTitleImageSelectedImage(String title, UIImage image, UIImage selectedImage);

    /**
     * The unselected image is autogenerated from the image argument. The selected image
     * is autogenerated from the selectedImage if provided and the image argument otherwise.
     * To prevent system coloring, provide images with UIImageRenderingModeAlwaysOriginal (see UIImage.h)
     */
    @Generated
    @Selector("initWithTitle:image:tag:")
    public native UITabBarItem initWithTitleImageTag(String title, UIImage image, @NInt long tag);

    @Generated
    @Selector("selectedImage")
    public native UIImage selectedImage();

    /**
     * If this item displays a badge, this color will be used for the badge's background. If set to nil, the default background color will be used instead.
     */
    @Generated
    @Selector("setBadgeColor:")
    public native void setBadgeColor(UIColor value);

    /**
     * Provide text attributes to use to draw the badge text for the given singular control state (Normal, Disabled, Focused, Selected, or Highlighted). Default values will be supplied for keys that are not provided by this dictionary. See NSAttributedString.h for details on what keys are available.
     */
    @Generated
    @Selector("setBadgeTextAttributes:forState:")
    public native void setBadgeTextAttributesForState(NSDictionary<String, ?> textAttributes, @NUInt long state);

    /**
     * default is nil
     */
    @Generated
    @Selector("setBadgeValue:")
    public native void setBadgeValue(String value);

    /**
     * These methods are now deprecated. Please use -initWithTitle:image:selectedImage:.
     */
    @Generated
    @Deprecated
    @Selector("setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedSelectedImageWithFinishedUnselectedImage(UIImage selectedImage,
            UIImage unselectedImage);

    @Generated
    @Selector("setSelectedImage:")
    public native void setSelectedImage(UIImage value);

    /**
     * To set item label text attributes use the appearance selectors available on the superclass, UIBarItem.
     * <p>
     * Use the following to tweak the relative position of the label within the tab button (for handling visual centering corrections if needed because of custom text attributes)
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * To set item label text attributes use the appearance selectors available on the superclass, UIBarItem.
     * <p>
     * Use the following to tweak the relative position of the label within the tab button (for handling visual centering corrections if needed because of custom text attributes)
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
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(UITabBarAppearance value);

    /**
     * When set and this item is selected, overrides the hosting tab bar's standardAppearance.
     */
    @Generated
    @Selector("standardAppearance")
    public native UITabBarAppearance standardAppearance();

    /**
     * When set and this item is selected, overrides the hosting tab bar's scrollEdgeAppearance.
     */
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UITabBarAppearance scrollEdgeAppearance();

    /**
     * When set and this item is selected, overrides the hosting tab bar's scrollEdgeAppearance.
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UITabBarAppearance value);
}

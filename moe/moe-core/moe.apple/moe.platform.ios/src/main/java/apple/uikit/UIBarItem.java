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
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAccessibilityIdentification;
import apple.uikit.protocol.UIAppearance;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.struct.UIEdgeInsets;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarItem extends NSObject implements NSCoding, UIAppearance, UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBarItem allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UIBarItem appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIBarItem appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIBarItem appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIBarItem appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIBarItem appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIBarItem appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UIBarItem new_objc();

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

    @Nullable
    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UIBarItem _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIBarItem _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIBarItem _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIBarItem _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIBarItem _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIBarItem _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * default is nil
     */
    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    /**
     * default is UIEdgeInsetsZero
     */
    @Generated
    @Selector("imageInsets")
    @ByValue
    public native UIEdgeInsets imageInsets();

    @Generated
    @Selector("init")
    public native UIBarItem init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBarItem initWithCoder(@NotNull NSCoder coder);

    /**
     * default is YES
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * default is YES
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * default is nil
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("landscapeImagePhone")
    public native UIImage landscapeImagePhone();

    /**
     * default is UIEdgeInsetsZero. These insets apply only when the landscapeImagePhone property is set.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("landscapeImagePhoneInsets")
    @ByValue
    public native UIEdgeInsets landscapeImagePhoneInsets();

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(@Nullable String value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    /**
     * default is UIEdgeInsetsZero
     */
    @Generated
    @Selector("setImageInsets:")
    public native void setImageInsets(@ByValue UIEdgeInsets value);

    /**
     * default is nil
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setLandscapeImagePhone:")
    public native void setLandscapeImagePhone(@Nullable UIImage value);

    /**
     * default is UIEdgeInsetsZero. These insets apply only when the landscapeImagePhone property is set.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setLandscapeImagePhoneInsets:")
    public native void setLandscapeImagePhoneInsets(@ByValue UIEdgeInsets value);

    /**
     * default is 0
     */
    @Generated
    @Selector("setTag:")
    public native void setTag(@NInt long value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setTitle:")
    public native void setTitle(@Nullable String value);

    /**
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitleTextAttributes:forState:")
    public native void setTitleTextAttributesForState(@Nullable NSDictionary<String, ?> attributes, @NUInt long state);

    /**
     * default is 0
     */
    @Generated
    @Selector("tag")
    @NInt
    public native long tag();

    /**
     * default is nil
     */
    @Nullable
    @Generated
    @Selector("title")
    public native String title();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("titleTextAttributesForState:")
    public native NSDictionary<String, ?> titleTextAttributesForState(@NUInt long state);

    /**
     * Higher-resolution version of the standard image. Default is nil. Used for rendering assistive UI (e.g. for users
     * with visual impairments who need large text). If not provided, the system may attempt to generate an image based
     * on the standard image (for instance, by rasterizing matching PDF representations at a higher resolution).
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("largeContentSizeImage")
    public native UIImage largeContentSizeImage();

    /**
     * default is UIEdgeInsetsZero. These insets apply only when the largeContentSizeImage property is set.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("largeContentSizeImageInsets")
    @ByValue
    public native UIEdgeInsets largeContentSizeImageInsets();

    /**
     * Higher-resolution version of the standard image. Default is nil. Used for rendering assistive UI (e.g. for users
     * with visual impairments who need large text). If not provided, the system may attempt to generate an image based
     * on the standard image (for instance, by rasterizing matching PDF representations at a higher resolution).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLargeContentSizeImage:")
    public native void setLargeContentSizeImage(@Nullable UIImage value);

    /**
     * default is UIEdgeInsetsZero. These insets apply only when the largeContentSizeImage property is set.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLargeContentSizeImageInsets:")
    public native void setLargeContentSizeImageInsets(@ByValue UIEdgeInsets value);
}

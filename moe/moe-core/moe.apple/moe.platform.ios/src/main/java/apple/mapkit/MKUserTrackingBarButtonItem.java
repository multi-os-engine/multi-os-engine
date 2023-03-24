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

package apple.mapkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIAction;
import apple.uikit.UIBarButtonItem;
import apple.uikit.UIImage;
import apple.uikit.UIMenu;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
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
 * API-Since: 5.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKUserTrackingBarButtonItem extends UIBarButtonItem {
    static {
        NatJ.register();
    }

    @Generated
    protected MKUserTrackingBarButtonItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKUserTrackingBarButtonItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKUserTrackingBarButtonItem allocWithZone(VoidPtr zone);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native MKUserTrackingBarButtonItem appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native MKUserTrackingBarButtonItem appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native MKUserTrackingBarButtonItem appearanceForTraitCollectionWhenContainedIn(
            @NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native MKUserTrackingBarButtonItem appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native MKUserTrackingBarButtonItem appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native MKUserTrackingBarButtonItem appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

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
    public static native MKUserTrackingBarButtonItem new_objc();

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
    public MKUserTrackingBarButtonItem _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public MKUserTrackingBarButtonItem _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public MKUserTrackingBarButtonItem _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public MKUserTrackingBarButtonItem _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public MKUserTrackingBarButtonItem _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public MKUserTrackingBarButtonItem _appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("init")
    public native MKUserTrackingBarButtonItem init();

    @Generated
    @Selector("initWithBarButtonSystemItem:target:action:")
    public native MKUserTrackingBarButtonItem initWithBarButtonSystemItemTargetAction(@NInt long systemItem,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action);

    @Generated
    @Selector("initWithCoder:")
    public native MKUserTrackingBarButtonItem initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithCustomView:")
    public native MKUserTrackingBarButtonItem initWithCustomView(@NotNull UIView customView);

    @Generated
    @Selector("initWithImage:landscapeImagePhone:style:target:action:")
    public native MKUserTrackingBarButtonItem initWithImageLandscapeImagePhoneStyleTargetAction(@Nullable UIImage image,
            @Nullable UIImage landscapeImagePhone, @NInt long style,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action);

    @Generated
    @Selector("initWithImage:style:target:action:")
    public native MKUserTrackingBarButtonItem initWithImageStyleTargetAction(@Nullable UIImage image, @NInt long style,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action);

    @Generated
    @Selector("initWithMapView:")
    public native MKUserTrackingBarButtonItem initWithMapView(@Nullable MKMapView mapView);

    @Generated
    @Selector("initWithTitle:style:target:action:")
    public native MKUserTrackingBarButtonItem initWithTitleStyleTargetAction(@Nullable String title, @NInt long style,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action);

    @Nullable
    @Generated
    @Selector("mapView")
    public native MKMapView mapView();

    @Generated
    @Selector("setMapView:")
    public native void setMapView(@Nullable MKMapView value);

    @NotNull
    @Generated
    @Selector("fixedSpaceItemOfWidth:")
    public static native MKUserTrackingBarButtonItem fixedSpaceItemOfWidth(@NFloat double width);

    @NotNull
    @Generated
    @Selector("flexibleSpaceItem")
    public static native MKUserTrackingBarButtonItem flexibleSpaceItem();

    @Generated
    @Selector("initWithBarButtonSystemItem:menu:")
    public native MKUserTrackingBarButtonItem initWithBarButtonSystemItemMenu(@NInt long systemItem,
            @Nullable UIMenu menu);

    @Generated
    @Selector("initWithBarButtonSystemItem:primaryAction:")
    public native MKUserTrackingBarButtonItem initWithBarButtonSystemItemPrimaryAction(@NInt long systemItem,
            @Nullable UIAction primaryAction);

    @Generated
    @Selector("initWithImage:menu:")
    public native MKUserTrackingBarButtonItem initWithImageMenu(@Nullable UIImage image, @Nullable UIMenu menu);

    @Generated
    @Selector("initWithPrimaryAction:")
    public native MKUserTrackingBarButtonItem initWithPrimaryAction(@Nullable UIAction primaryAction);

    @Generated
    @Selector("initWithTitle:menu:")
    public native MKUserTrackingBarButtonItem initWithTitleMenu(@Nullable String title, @Nullable UIMenu menu);

    @Generated
    @Selector("initWithBarButtonSystemItem:primaryAction:menu:")
    public native MKUserTrackingBarButtonItem initWithBarButtonSystemItemPrimaryActionMenu(@NInt long systemItem,
            @Nullable UIAction primaryAction, @Nullable UIMenu menu);

    @Generated
    @Selector("initWithPrimaryAction:menu:")
    public native MKUserTrackingBarButtonItem initWithPrimaryActionMenu(@Nullable UIAction primaryAction,
            @Nullable UIMenu menu);

    @Generated
    @Selector("initWithTitle:image:target:action:menu:")
    public native MKUserTrackingBarButtonItem initWithTitleImageTargetActionMenu(@Nullable String title,
            @Nullable UIImage image, @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action,
            @Nullable UIMenu menu);
}

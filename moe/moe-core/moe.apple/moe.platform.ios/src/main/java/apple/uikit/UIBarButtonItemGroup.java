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
import apple.foundation.protocol.NSCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 9.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarButtonItemGroup extends NSObject implements NSCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarButtonItemGroup(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarButtonItemGroup alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBarButtonItemGroup allocWithZone(VoidPtr zone);

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
    public static native UIBarButtonItemGroup new_objc();

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

    /**
     * The bar button items associated with this group. Changing these items will affect the bar displaying these items
     * without needing to re-set the groups that are in that bar. Any UIBarButtonItems that are already in group will be
     * removed from that group.
     */
    @NotNull
    @Generated
    @Selector("barButtonItems")
    public native NSArray<? extends UIBarButtonItem> barButtonItems();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native UIBarButtonItemGroup init();

    /**
     * Create a new bar button item group with the given items. When bar button item layout is done, either the group's
     * barButtonItems or its representativeItem is displayed (if it exists).
     */
    @Generated
    @Selector("initWithBarButtonItems:representativeItem:")
    public native UIBarButtonItemGroup initWithBarButtonItemsRepresentativeItem(
            @NotNull NSArray<? extends UIBarButtonItem> barButtonItems, @Nullable UIBarButtonItem representativeItem);

    @Generated
    @Selector("initWithCoder:")
    public native UIBarButtonItemGroup initWithCoder(@NotNull NSCoder coder);

    /**
     * Returns YES if the representativeItem of this group is currently being displayed, rather than its barButtonItems.
     */
    @Generated
    @Selector("isDisplayingRepresentativeItem")
    public native boolean isDisplayingRepresentativeItem();

    /**
     * In order to display as many items as possible, bars that support UIBarButtonItemGroup may choose to collapse
     * items associated with groups to the representativeItem specified by the group.
     * A bar will only collapse groups that have a representativeItem set, but may still choose to use an alternate
     * presentation of these items.
     * A UIBarButtonItem may only be either the representativeItem or a member of the barButtonItems of a single
     * UIBarButtonItemGroup and may only represent a single group.
     * If the representativeItem has an action, then that action will be invoked, otherwise the bar will present a
     * standard UI to allow selection of the barButtonItems in the representedItem's group.
     */
    @Nullable
    @Generated
    @Selector("representativeItem")
    public native UIBarButtonItem representativeItem();

    /**
     * The bar button items associated with this group. Changing these items will affect the bar displaying these items
     * without needing to re-set the groups that are in that bar. Any UIBarButtonItems that are already in group will be
     * removed from that group.
     */
    @Generated
    @Selector("setBarButtonItems:")
    public native void setBarButtonItems(@NotNull NSArray<? extends UIBarButtonItem> value);

    /**
     * In order to display as many items as possible, bars that support UIBarButtonItemGroup may choose to collapse
     * items associated with groups to the representativeItem specified by the group.
     * A bar will only collapse groups that have a representativeItem set, but may still choose to use an alternate
     * presentation of these items.
     * A UIBarButtonItem may only be either the representativeItem or a member of the barButtonItems of a single
     * UIBarButtonItemGroup and may only represent a single group.
     * If the representativeItem has an action, then that action will be invoked, otherwise the bar will present a
     * standard UI to allow selection of the barButtonItems in the representedItem's group.
     */
    @Generated
    @Selector("setRepresentativeItem:")
    public native void setRepresentativeItem(@Nullable UIBarButtonItem value);

    /**
     * Instructs UIKit to ensure that the functionality in this group is made available to the user regardless of
     * customization status. On iPhone and iPad idioms, UIKit currently places these items in the overflow menu; this
     * property has no effect on macOS idiom.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("alwaysAvailable")
    public native boolean alwaysAvailable();

    /**
     * Construct a UIBarButtonItemGroup that cannot be moved or removed under UINavigationBar customization.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("fixedGroupWithRepresentativeItem:items:")
    public static native UIBarButtonItemGroup fixedGroupWithRepresentativeItemItems(
            @Nullable UIBarButtonItem representativeItem, @NotNull NSArray<? extends UIBarButtonItem> items);

    /**
     * If the group should be hidden from display.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * A UIMenuElement that should substitute for the UIBarButtonItemGroup when displayed in a menu.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("menuRepresentation")
    public native UIMenuElement menuRepresentation();

    /**
     * Construct a UIBarButtonItemGroup that can be moved but cannot be removed under UINavigationBar customization.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("movableGroupWithCustomizationIdentifier:representativeItem:items:")
    public static native UIBarButtonItemGroup movableGroupWithCustomizationIdentifierRepresentativeItemItems(
            @NotNull String customizationIdentifier, @Nullable UIBarButtonItem representativeItem,
            @NotNull NSArray<? extends UIBarButtonItem> items);

    /**
     * Construct a UIBarButtonItemGroup that can be moved or added/removed under UINavigationBar customization.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("optionalGroupWithCustomizationIdentifier:inDefaultCustomization:representativeItem:items:")
    public static native UIBarButtonItemGroup optionalGroupWithCustomizationIdentifierInDefaultCustomizationRepresentativeItemItems(
            @NotNull String customizationIdentifier, boolean inDefaultCustomization,
            @Nullable UIBarButtonItem representativeItem, @NotNull NSArray<? extends UIBarButtonItem> items);

    /**
     * Instructs UIKit to ensure that the functionality in this group is made available to the user regardless of
     * customization status. On iPhone and iPad idioms, UIKit currently places these items in the overflow menu; this
     * property has no effect on macOS idiom.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAlwaysAvailable:")
    public native void setAlwaysAvailable(boolean value);

    /**
     * If the group should be hidden from display.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * A UIMenuElement that should substitute for the UIBarButtonItemGroup when displayed in a menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMenuRepresentation:")
    public native void setMenuRepresentation(@Nullable UIMenuElement value);
}

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
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarButtonItem extends UIBarItem implements NSCoding, UISpringLoadedInteractionSupporting,
        UIPopoverPresentationControllerSourceItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarButtonItem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarButtonItem alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIBarButtonItem allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appearance")
    public static native UIBarButtonItem appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIBarButtonItem appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIBarButtonItem appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIBarButtonItem appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIBarButtonItem appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIBarButtonItem appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    public static native UIBarButtonItem new_objc();

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
     * default is NULL
     */
    @Generated
    @Selector("action")
    public native SEL action();

    @Generated
    @ProtocolClassMethod("appearance")
    public UIBarButtonItem _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIBarButtonItem _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIBarButtonItem _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIBarButtonItem _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIBarButtonItem _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIBarButtonItem _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("backButtonBackgroundImageForState:barMetrics:")
    public native UIImage backButtonBackgroundImageForStateBarMetrics(@NUInt long state, @NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double backButtonBackgroundVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("backButtonTitlePositionAdjustmentForBarMetrics:")
    @ByValue
    public native UIOffset backButtonTitlePositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("backgroundImageForState:barMetrics:")
    public native UIImage backgroundImageForStateBarMetrics(@NUInt long state, @NInt long barMetrics);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("backgroundImageForState:style:barMetrics:")
    public native UIImage backgroundImageForStateStyleBarMetrics(@NUInt long state, @NInt long style,
            @NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("backgroundVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double backgroundVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * The group that the UIBarButtonItem is currently associated with, either as a member of the barButtonItems array
     * or as that group's representativeItem.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("buttonGroup")
    public native UIBarButtonItemGroup buttonGroup();

    /**
     * default is nil
     */
    @Generated
    @Selector("customView")
    public native UIView customView();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native UIBarButtonItem init();

    @Generated
    @Selector("initWithBarButtonSystemItem:target:action:")
    public native UIBarButtonItem initWithBarButtonSystemItemTargetAction(@NInt long systemItem,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    @Generated
    @Selector("initWithCoder:")
    public native UIBarButtonItem initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCustomView:")
    public native UIBarButtonItem initWithCustomView(UIView customView);

    /**
     * landscapeImagePhone will be used for the bar button image when the bar has Compact or Condensed bar metrics.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("initWithImage:landscapeImagePhone:style:target:action:")
    public native UIBarButtonItem initWithImageLandscapeImagePhoneStyleTargetAction(UIImage image,
            UIImage landscapeImagePhone, @NInt long style, @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    @Generated
    @Selector("initWithImage:style:target:action:")
    public native UIBarButtonItem initWithImageStyleTargetAction(UIImage image, @NInt long style,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    @Generated
    @Selector("initWithTitle:style:target:action:")
    public native UIBarButtonItem initWithTitleStyleTargetAction(String title, @NInt long style,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action);

    /**
     * default is nil
     */
    @Generated
    @Selector("possibleTitles")
    public native NSSet<String> possibleTitles();

    /**
     * default is NULL
     */
    @Generated
    @Selector("setAction:")
    public native void setAction(SEL value);

    /**
     * The remaining appearance modifiers apply solely to UINavigationBar back buttons and are ignored by other buttons.
     * backgroundImage must be a resizable image for good results.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackButtonBackgroundImage:forState:barMetrics:")
    public native void setBackButtonBackgroundImageForStateBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long barMetrics);

    /**
     * For adjusting the vertical centering of bordered bar buttons within the bar
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackButtonBackgroundVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackButtonTitlePositionAdjustment:forBarMetrics:")
    public native void setBackButtonTitlePositionAdjustmentForBarMetrics(@ByValue UIOffset adjustment,
            @NInt long barMetrics);

    /**
     * In general, you should specify a value for the normal state to be used by other states which don't have a custom
     * value set.
     * 
     * Similarly, when a property is dependent on the bar metrics (on the iPhone in landscape orientation, bars have a
     * different height from standard), be sure to specify a value for UIBarMetricsDefault.
     * 
     * This sets the background image for buttons of any style.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImageForStateBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long barMetrics);

    /**
     * This sets the background image for buttons with a specific style. When calling this on a UIBarButtonItem
     * instance, the style argument must match the button's style; when calling on the UIAppearance proxy, any style may
     * be passed.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setBackgroundImage:forState:style:barMetrics:")
    public native void setBackgroundImageForStateStyleBarMetrics(UIImage backgroundImage, @NUInt long state,
            @NInt long style, @NInt long barMetrics);

    /**
     * For adjusting the vertical centering of bordered bar buttons within the bar
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackgroundVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * default is nil
     */
    @Generated
    @Selector("setCustomView:")
    public native void setCustomView(UIView value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setPossibleTitles:")
    public native void setPossibleTitles(NSSet<String> value);

    /**
     * default is UIBarButtonItemStylePlain
     */
    @Generated
    @Selector("setStyle:")
    public native void setStyle(@NInt long value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setTarget:")
    public native void setTarget_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * default is nil
     */
    @Generated
    public void setTarget(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = target();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTarget_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * For adjusting the position of a title (if any) within a bordered bar button
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitlePositionAdjustment:forBarMetrics:")
    public native void setTitlePositionAdjustmentForBarMetrics(@ByValue UIOffset adjustment, @NInt long barMetrics);

    /**
     * default is 0.0
     */
    @Generated
    @Selector("setWidth:")
    public native void setWidth(@NFloat double value);

    /**
     * default is UIBarButtonItemStylePlain
     */
    @Generated
    @Selector("style")
    @NInt
    public native long style();

    /**
     * default is nil
     */
    @Generated
    @Selector("target")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object target();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("titlePositionAdjustmentForBarMetrics:")
    @ByValue
    public native UIOffset titlePositionAdjustmentForBarMetrics(@NInt long barMetrics);

    /**
     * default is 0.0
     */
    @Generated
    @Selector("width")
    @NFloat
    public native double width();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    /**
     * Construct a new fixed space item with the given width.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("fixedSpaceItemOfWidth:")
    public static native UIBarButtonItem fixedSpaceItemOfWidth(@NFloat double width);

    /**
     * Construct a new flexible space item.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("flexibleSpaceItem")
    public static native UIBarButtonItem flexibleSpaceItem();

    /**
     * Creates a bar button item for the given systemItem. The constructed item will present the menu immediately when
     * touched.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithBarButtonSystemItem:menu:")
    public native UIBarButtonItem initWithBarButtonSystemItemMenu(@NInt long systemItem, UIMenu menu);

    /**
     * Creates a bar button item for the given systemItem. The primaryAction is copied, and its title & image are
     * ignored.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithBarButtonSystemItem:primaryAction:")
    public native UIBarButtonItem initWithBarButtonSystemItemPrimaryAction(@NInt long systemItem,
            UIAction primaryAction);

    /**
     * Creates a plain-style bar button item with the given image. The constructed item will present the menu
     * immediately when touched.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithImage:menu:")
    public native UIBarButtonItem initWithImageMenu(UIImage image, UIMenu menu);

    /**
     * Creates a plain-style bar button item from the properties of primaryAction. primaryAction is copied.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithPrimaryAction:")
    public native UIBarButtonItem initWithPrimaryAction(UIAction primaryAction);

    /**
     * Creates a plain-style bar button item with the given title. The constructed item will present the menu
     * immediately when touched.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithTitle:menu:")
    public native UIBarButtonItem initWithTitleMenu(String title, UIMenu menu);

    /**
     * When non-nil the menu is presented, the gesture used to trigger the menu is based on if the bar button item would
     * normally trigger an action when tapped.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("menu")
    public native UIMenu menu();

    /**
     * Set the primaryAction on this item, updating the title & image of the item if appropriate (primaryAction is
     * non-nil, and this is not a system item). When primaryAction is non-nil, the target & action properties are
     * ignored. If primaryAction is set to nil, the title & image properties are left unchanged.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("primaryAction")
    public native UIAction primaryAction();

    /**
     * When non-nil the menu is presented, the gesture used to trigger the menu is based on if the bar button item would
     * normally trigger an action when tapped.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMenu:")
    public native void setMenu(UIMenu value);

    /**
     * Set the primaryAction on this item, updating the title & image of the item if appropriate (primaryAction is
     * non-nil, and this is not a system item). When primaryAction is non-nil, the target & action properties are
     * ignored. If primaryAction is set to nil, the title & image properties are left unchanged.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPrimaryAction:")
    public native void setPrimaryAction(UIAction value);

    /**
     * Indicates if the button changes selection as its primary action.
     * This shows the menu as options for selection if a menu is populated and no action when tapped is enabled.
     * If no menu is provided and no action is enabled when tapped, the item is toggled on and off for the primary
     * action.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("changesSelectionAsPrimaryAction")
    public native boolean changesSelectionAsPrimaryAction();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * Indicates if the button changes selection as its primary action.
     * This shows the menu as options for selection if a menu is populated and no action when tapped is enabled.
     * If no menu is provided and no action is enabled when tapped, the item is toggled on and off for the primary
     * action.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setChangesSelectionAsPrimaryAction:")
    public native void setChangesSelectionAsPrimaryAction(boolean value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    /**
     * Create a fixed group containing this bar button item. UIBarButtonItems may only be in a single
     * UIBarButtonItemGroup at a time, adding a bar button item to a group removes it from any previous group.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("creatingFixedGroup")
    public native UIBarButtonItemGroup creatingFixedGroup();

    /**
     * Create a movable group containing this bar button item. UIBarButtonItems may only be in a single
     * UIBarButtonItemGroup at a time, adding a bar button item to a group removes it from any previous group.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("creatingMovableGroupWithCustomizationIdentifier:")
    public native UIBarButtonItemGroup creatingMovableGroupWithCustomizationIdentifier(String customizationIdentifier);

    /**
     * Create an optional group containing this bar button item. UIBarButtonItems may only be in a single
     * UIBarButtonItemGroup at a time, adding a bar button item to a group removes it from any previous group.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("creatingOptionalGroupWithCustomizationIdentifier:inDefaultCustomization:")
    public native UIBarButtonItemGroup creatingOptionalGroupWithCustomizationIdentifierInDefaultCustomization(
            String customizationIdentifier, boolean inDefaultCustomization);

    /**
     * Creates a bar button item for the given systemItem. The primaryAction is copied, and its title & image are
     * ignored.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithBarButtonSystemItem:primaryAction:menu:")
    public native UIBarButtonItem initWithBarButtonSystemItemPrimaryActionMenu(@NInt long systemItem,
            UIAction primaryAction, UIMenu menu);

    /**
     * Creates a plain-style bar button item from the properties of primaryAction. primaryAction is copied.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithPrimaryAction:menu:")
    public native UIBarButtonItem initWithPrimaryActionMenu(UIAction primaryAction, UIMenu menu);

    /**
     * Creates a plain-style bar button item with the given title and image.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("initWithTitle:image:target:action:menu:")
    public native UIBarButtonItem initWithTitleImageTargetActionMenu(String title, UIImage image,
            @Mapped(ObjCObjectMapper.class) Object target, SEL action, UIMenu menu);

    /**
     * If the item should be hidden from display.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * A UIMenuElement that should substitute for the UIBarButtonItem when displayed in a menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("menuRepresentation")
    public native UIMenuElement menuRepresentation();

    /**
     * Preferred menu element ordering strategy for menus displayed by this button.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preferredMenuElementOrder")
    @NInt
    public native long preferredMenuElementOrder();

    /**
     * If the item should be hidden from display.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * A UIMenuElement that should substitute for the UIBarButtonItem when displayed in a menu.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMenuRepresentation:")
    public native void setMenuRepresentation(UIMenuElement value);

    /**
     * Preferred menu element ordering strategy for menus displayed by this button.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredMenuElementOrder:")
    public native void setPreferredMenuElementOrder(@NInt long value);
}

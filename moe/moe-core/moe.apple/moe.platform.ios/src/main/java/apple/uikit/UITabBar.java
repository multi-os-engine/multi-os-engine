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
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import apple.uikit.protocol.UITabBarDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBar extends UIView implements UISpringLoadedInteractionSupporting {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBar alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITabBar allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    public static native UITabBar appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITabBar appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITabBar appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITabBar appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITabBar appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITabBar appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

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
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

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
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UITabBar new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttributeRelativeToLayoutDirection(
            @NInt long semanticContentAttribute, @NInt long layoutDirection);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @ProtocolClassMethod("appearance")
    public UITabBar _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITabBar _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITabBar _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITabBar _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITabBar _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITabBar _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * The background image will be tiled to fit, even if it was not created via the UIImage resizableImage methods.
     */
    @Generated
    @Selector("backgroundImage")
    public native UIImage backgroundImage();

    /**
     * Valid bar styles are UIBarStyleDefault (default) and UIBarStyleBlack.
     */
    @Generated
    @Selector("barStyle")
    @NInt
    public native long barStyle();

    /**
     * default is nil
     */
    @Generated
    @Selector("barTintColor")
    public native UIColor barTintColor();

    /**
     * list all items that can be reordered. always animates a sheet up. visible items not listed are fixed in place
     */
    @Generated
    @Selector("beginCustomizingItems:")
    public native void beginCustomizingItems(NSArray<? extends UITabBarItem> items);

    /**
     * weak reference. default is nil
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UITabBarDelegate delegate();

    /**
     * hide customization sheet. normally you should let the user do it. check list of items to see new layout. returns
     * YES if layout changed
     */
    @Generated
    @Selector("endCustomizingAnimated:")
    public native boolean endCustomizingAnimated(boolean animated);

    @Generated
    @Selector("init")
    public native UITabBar init();

    @Generated
    @Selector("initWithCoder:")
    public native UITabBar initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UITabBar initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("isCustomizing")
    public native boolean isCustomizing();

    /**
     * Default is YES.
     * You may force an opaque background by setting the property to NO.
     * If the tab bar has a custom background image, the default is inferred from the alpha
     * values of the image—YES if it has any pixel with alpha < 1.0
     * If you send setTranslucent:YES to a tab bar with an opaque custom background image
     * the tab bar will apply a system opacity less than 1.0 to the image.
     * If you send setTranslucent:NO to a tab bar with a translucent custom background image
     * the tab bar will provide an opaque background for the image using the bar's barTintColor if defined, or black
     * for UIBarStyleBlack or white for UIBarStyleDefault if barTintColor is nil.
     */
    @Generated
    @Selector("isTranslucent")
    public native boolean isTranslucent();

    /**
     * Default is YES.
     * You may force an opaque background by setting the property to NO.
     * If the tab bar has a custom background image, the default is inferred from the alpha
     * values of the image—YES if it has any pixel with alpha < 1.0
     * If you send setTranslucent:YES to a tab bar with an opaque custom background image
     * the tab bar will apply a system opacity less than 1.0 to the image.
     * If you send setTranslucent:NO to a tab bar with a translucent custom background image
     * the tab bar will provide an opaque background for the image using the bar's barTintColor if defined, or black
     * for UIBarStyleBlack or white for UIBarStyleDefault if barTintColor is nil.
     */
    @Generated
    @Selector("setTranslucent:")
    public native void setTranslucent(boolean value);

    /**
     * Default is UITabBarItemPositioningAutomatic. The tab bar items fill horizontally
     * for the iPhone user interface idiom, and are centered with a default width and
     * inter-item spacing (customizable with the itemWidth and itemSpacing
     * properties) for the iPad idiom. When the tab bar is owned by a UITabBarController
     * further heuristics may determine the positioning for UITabBarItemPositioningAutomatic.
     * Use UITabBarItemPositioningFill to force the items to fill horizontally.
     * Use UITabBarItemPositioningCenter to force the items to center with a default
     * width (or the itemWidth, if set).
     */
    @Generated
    @Selector("itemPositioning")
    @NInt
    public native long itemPositioning();

    /**
     * Set the itemSpacing to a positive value to be used between tab bar items
     * when they are positioned as a centered group.
     * Default of 0 or values less than 0 will be interpreted as a system-defined spacing.
     */
    @Generated
    @Selector("itemSpacing")
    @NFloat
    public native double itemSpacing();

    /**
     * Set the itemWidth to a positive value to be used as the width for tab bar items
     * when they are positioned as a centered group (as opposed to filling the tab bar).
     * Default of 0 or values less than 0 will be interpreted as a system-defined width.
     */
    @Generated
    @Selector("itemWidth")
    @NFloat
    public native double itemWidth();

    /**
     * get/set visible UITabBarItems. default is nil. changes not animated. shown in order
     */
    @Generated
    @Selector("items")
    public native NSArray<? extends UITabBarItem> items();

    /**
     * selectedImageTintColor will be applied to the gradient image used when creating the
     * selected image. Default is nil and will result in the system bright blue for selected
     * tab item images. If you wish to also customize the unselected image appearance, you must
     * use the image and selectedImage properties on UITabBarItem along with UIImageRenderingModeAlways
     * <p>
     * Deprecated in iOS 8.0. On iOS 7.0 and later the selected image takes its color from the
     * inherited tintColor of the UITabBar, which may be set separately if necessary.
     */
    @Generated
    @Deprecated
    @Selector("selectedImageTintColor")
    public native UIColor selectedImageTintColor();

    /**
     * will show feedback based on mode. default is nil
     */
    @Generated
    @Selector("selectedItem")
    public native UITabBarItem selectedItem();

    /**
     * The selection indicator image is drawn on top of the tab bar, behind the bar item icon.
     */
    @Generated
    @Selector("selectionIndicatorImage")
    public native UIImage selectionIndicatorImage();

    /**
     * The background image will be tiled to fit, even if it was not created via the UIImage resizableImage methods.
     */
    @Generated
    @Selector("setBackgroundImage:")
    public native void setBackgroundImage(UIImage value);

    /**
     * Valid bar styles are UIBarStyleDefault (default) and UIBarStyleBlack.
     */
    @Generated
    @Selector("setBarStyle:")
    public native void setBarStyle(@NInt long value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setBarTintColor:")
    public native void setBarTintColor(UIColor value);

    /**
     * weak reference. default is nil
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UITabBarDelegate value);

    /**
     * weak reference. default is nil
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UITabBarDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Default is UITabBarItemPositioningAutomatic. The tab bar items fill horizontally
     * for the iPhone user interface idiom, and are centered with a default width and
     * inter-item spacing (customizable with the itemWidth and itemSpacing
     * properties) for the iPad idiom. When the tab bar is owned by a UITabBarController
     * further heuristics may determine the positioning for UITabBarItemPositioningAutomatic.
     * Use UITabBarItemPositioningFill to force the items to fill horizontally.
     * Use UITabBarItemPositioningCenter to force the items to center with a default
     * width (or the itemWidth, if set).
     */
    @Generated
    @Selector("setItemPositioning:")
    public native void setItemPositioning(@NInt long value);

    /**
     * Set the itemSpacing to a positive value to be used between tab bar items
     * when they are positioned as a centered group.
     * Default of 0 or values less than 0 will be interpreted as a system-defined spacing.
     */
    @Generated
    @Selector("setItemSpacing:")
    public native void setItemSpacing(@NFloat double value);

    /**
     * Set the itemWidth to a positive value to be used as the width for tab bar items
     * when they are positioned as a centered group (as opposed to filling the tab bar).
     * Default of 0 or values less than 0 will be interpreted as a system-defined width.
     */
    @Generated
    @Selector("setItemWidth:")
    public native void setItemWidth(@NFloat double value);

    /**
     * get/set visible UITabBarItems. default is nil. changes not animated. shown in order
     */
    @Generated
    @Selector("setItems:")
    public native void setItems(NSArray<? extends UITabBarItem> value);

    /**
     * will fade in or out or reorder and adjust spacing
     */
    @Generated
    @Selector("setItems:animated:")
    public native void setItemsAnimated(NSArray<? extends UITabBarItem> items, boolean animated);

    /**
     * selectedImageTintColor will be applied to the gradient image used when creating the
     * selected image. Default is nil and will result in the system bright blue for selected
     * tab item images. If you wish to also customize the unselected image appearance, you must
     * use the image and selectedImage properties on UITabBarItem along with UIImageRenderingModeAlways
     * <p>
     * Deprecated in iOS 8.0. On iOS 7.0 and later the selected image takes its color from the
     * inherited tintColor of the UITabBar, which may be set separately if necessary.
     */
    @Generated
    @Deprecated
    @Selector("setSelectedImageTintColor:")
    public native void setSelectedImageTintColor(UIColor value);

    /**
     * will show feedback based on mode. default is nil
     */
    @Generated
    @Selector("setSelectedItem:")
    public native void setSelectedItem_unsafe(UITabBarItem value);

    /**
     * will show feedback based on mode. default is nil
     */
    @Generated
    public void setSelectedItem(UITabBarItem value) {
        Object __old = selectedItem();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setSelectedItem_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The selection indicator image is drawn on top of the tab bar, behind the bar item icon.
     */
    @Generated
    @Selector("setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage value);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage: (if the default
     * background image is used, the default shadow image will be used).
     */
    @Generated
    @Selector("setShadowImage:")
    public native void setShadowImage(UIImage value);

    /**
     * The behavior of tintColor for bars has changed on iOS 7.0. It no longer affects the bar's background
     * and behaves as described for the tintColor property added to UIView.
     * To tint the bar's background, please use -barTintColor.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * Unselected items in this tab bar will be tinted with this color. Setting this value to nil indicates that
     * UITabBar should use its default value instead.
     */
    @Generated
    @Selector("setUnselectedItemTintColor:")
    public native void setUnselectedItemTintColor(UIColor value);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage: (if the default
     * background image is used, the default shadow image will be used).
     */
    @Generated
    @Selector("shadowImage")
    public native UIImage shadowImage();

    /**
     * The behavior of tintColor for bars has changed on iOS 7.0. It no longer affects the bar's background
     * and behaves as described for the tintColor property added to UIView.
     * To tint the bar's background, please use -barTintColor.
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * Unselected items in this tab bar will be tinted with this color. Setting this value to nil indicates that
     * UITabBar should use its default value instead.
     */
    @Generated
    @Selector("unselectedItemTintColor")
    public native UIColor unselectedItemTintColor();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Describes the appearance attributes for the tab bar to use.
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(UITabBarAppearance value);

    /**
     * Describes the appearance attributes for the tab bar to use.
     */
    @Generated
    @Selector("standardAppearance")
    public native UITabBarAppearance standardAppearance();

    /**
     * Describes the appearance attributes for the tabBar to use when an observable scroll view is scrolled to the
     * bottom. If not set, standardAppearance will be used instead.
     */
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UITabBarAppearance scrollEdgeAppearance();

    /**
     * Describes the appearance attributes for the tabBar to use when an observable scroll view is scrolled to the
     * bottom. If not set, standardAppearance will be used instead.
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UITabBarAppearance value);
}

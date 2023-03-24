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
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIBarPositioning;
import apple.uikit.protocol.UINavigationBarDelegate;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UINavigationBar extends UIView implements NSCoding, UIBarPositioning {
    static {
        NatJ.register();
    }

    @Generated
    protected UINavigationBar(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @NotNull @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UINavigationBar alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UINavigationBar allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimations") UIView.Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @NotNull @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") UIView.Block_animateWithDurationAnimationsCompletion_1 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") UIView.Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") UIView.Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @Nullable @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") UIView.Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @NotNull
    @Generated
    @Selector("appearance")
    public static native UINavigationBar appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UINavigationBar appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UINavigationBar appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UINavigationBar appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UINavigationBar appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UINavigationBar appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(@Nullable String animationID, @Nullable VoidPtr context);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Deprecated
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UINavigationBar new_objc();

    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            @NotNull NSArray<? extends UIView> views, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @Nullable @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") UIView.Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @NotNull @ObjCBlock(name = "call_performWithoutAnimation") UIView.Block_performWithoutAnimation actionsWithoutAnimation);

    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(@Nullable SEL selector);

    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(@NotNull NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, @NotNull UIView view,
            boolean cache);

    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(@Nullable SEL selector);

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
    public static native void transitionFromViewToViewDurationOptionsCompletion(@NotNull UIView fromView,
            @NotNull UIView toView, double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") UIView.Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(@NotNull UIView view,
            double duration, @NUInt long options,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @Nullable @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") UIView.Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

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

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UINavigationBar _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UINavigationBar _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UINavigationBar _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UINavigationBar _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UINavigationBar _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UINavigationBar _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * The back indicator image is shown beside the back button.
     * The back indicator transition mask image is used as a mask for content during push and pop transitions
     * Note: These properties must both be set if you want to customize the back indicator image.
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("backIndicatorImage")
    public native UIImage backIndicatorImage();

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("backIndicatorTransitionMaskImage")
    public native UIImage backIndicatorTransitionMaskImage();

    @Nullable
    @Generated
    @Selector("backItem")
    public native UINavigationItem backItem();

    /**
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("backgroundImageForBarMetrics:")
    public native UIImage backgroundImageForBarMetrics(@NInt long barMetrics);

    /**
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("backgroundImageForBarPosition:barMetrics:")
    public native UIImage backgroundImageForBarPositionBarMetrics(@NInt long barPosition, @NInt long barMetrics);

    @Generated
    @Selector("barPosition")
    @NInt
    public native long barPosition();

    @Generated
    @Selector("barStyle")
    @NInt
    public native long barStyle();

    /**
     * default is nil
     * 
     * API-Since: 7.0
     */
    @Nullable
    @Generated
    @Selector("barTintColor")
    public native UIColor barTintColor();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UINavigationBarDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native UINavigationBar init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationBar initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UINavigationBar initWithFrame(@ByValue CGRect frame);

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("isTranslucent")
    public native boolean isTranslucent();

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setTranslucent:")
    public native void setTranslucent(boolean value);

    @Nullable
    @Generated
    @Selector("items")
    public native NSArray<? extends UINavigationItem> items();

    /**
     * Returns the item that was popped.
     */
    @Nullable
    @Generated
    @Selector("popNavigationItemAnimated:")
    public native UINavigationItem popNavigationItemAnimated(boolean animated);

    /**
     * Pushing a navigation item displays the item's title in the center of the navigation bar.
     * The previous top navigation item (if it exists) is displayed as a "back" button on the left.
     */
    @Generated
    @Selector("pushNavigationItem:animated:")
    public native void pushNavigationItemAnimated(@NotNull UINavigationItem item, boolean animated);

    /**
     * The back indicator image is shown beside the back button.
     * The back indicator transition mask image is used as a mask for content during push and pop transitions
     * Note: These properties must both be set if you want to customize the back indicator image.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBackIndicatorImage:")
    public native void setBackIndicatorImage(@Nullable UIImage value);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBackIndicatorTransitionMaskImage:")
    public native void setBackIndicatorTransitionMaskImage(@Nullable UIImage value);

    /**
     * Same as using UIBarPositionAny in -setBackgroundImage:forBarPosition:barMetrics. Resizable images will be
     * stretched
     * vertically if necessary when the navigation bar is in the position UIBarPositionTopAttached.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setBackgroundImage:forBarMetrics:")
    public native void setBackgroundImageForBarMetrics(@Nullable UIImage backgroundImage, @NInt long barMetrics);

    /**
     * In general, you should specify a value for the normal state to be used by other states which don't have a custom
     * value set.
     * 
     * Similarly, when a property is dependent on the bar metrics (on the iPhone in landscape orientation, bars have a
     * different height from standard), be sure to specify a value for UIBarMetricsDefault.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImageForBarPositionBarMetrics(@Nullable UIImage backgroundImage,
            @NInt long barPosition, @NInt long barMetrics);

    @Generated
    @Selector("setBarStyle:")
    public native void setBarStyle(@NInt long value);

    /**
     * default is nil
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setBarTintColor:")
    public native void setBarTintColor(@Nullable UIColor value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setItems:")
    public native void setItems(@Nullable NSArray<? extends UINavigationItem> value);

    /**
     * If animated is YES, then simulate a push or pop depending on whether the new top item was previously in the
     * stack.
     */
    @Generated
    @Selector("setItems:animated:")
    public native void setItemsAnimated(@Nullable NSArray<? extends UINavigationItem> items, boolean animated);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage:forBarMetrics: (if the
     * default background image is used, the default shadow image will be used).
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setShadowImage:")
    public native void setShadowImage(@Nullable UIImage value);

    /**
     * The behavior of tintColor for bars has changed on iOS 7.0. It no longer affects the bar's background
     * and behaves as described for the tintColor property added to UIView.
     * To tint the bar's background, please use -barTintColor.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitleTextAttributes:")
    public native void setTitleTextAttributes(@Nullable NSDictionary<String, ?> value);

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTitleVerticalPositionAdjustment:forBarMetrics:")
    public native void setTitleVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage:forBarMetrics: (if the
     * default background image is used, the default shadow image will be used).
     * 
     * API-Since: 6.0
     */
    @Nullable
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
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @Selector("titleTextAttributes")
    public native NSDictionary<String, ?> titleTextAttributes();

    /**
     * API-Since: 5.0
     */
    @Generated
    @Selector("titleVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double titleVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    @Nullable
    @Generated
    @Selector("topItem")
    public native UINavigationItem topItem();

    /**
     * You may specify the font, text color, and shadow properties for the large title in the text attributes
     * dictionary, using the keys found in NSAttributedString.h.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("largeTitleTextAttributes")
    public native NSDictionary<String, ?> largeTitleTextAttributes();

    /**
     * When set to YES, the navigation bar will use a larger out-of-line title view when requested by the current
     * navigation item. To specify when the large out-of-line title view appears, see
     * UINavigationItem.largeTitleDisplayMode. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("prefersLargeTitles")
    public native boolean prefersLargeTitles();

    /**
     * You may specify the font, text color, and shadow properties for the large title in the text attributes
     * dictionary, using the keys found in NSAttributedString.h.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setLargeTitleTextAttributes:")
    public native void setLargeTitleTextAttributes(@Nullable NSDictionary<String, ?> value);

    /**
     * When set to YES, the navigation bar will use a larger out-of-line title view when requested by the current
     * navigation item. To specify when the large out-of-line title view appears, see
     * UINavigationItem.largeTitleDisplayMode. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setPrefersLargeTitles:")
    public native void setPrefersLargeTitles(boolean value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact height.
     * If not set, the standardAppearance will be used instead.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("compactAppearance")
    public native UINavigationBarAppearance compactAppearance();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Describes the appearance attributes for the navigation bar to use when an associated UIScrollView has reached the
     * edge abutting the bar (the top edge for the navigation bar). If not set, a modified standardAppearance will be
     * used instead.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UINavigationBarAppearance scrollEdgeAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact height.
     * If not set, the standardAppearance will be used instead.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setCompactAppearance:")
    public native void setCompactAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when an associated UIScrollView has reached the
     * edge abutting the bar (the top edge for the navigation bar). If not set, a modified standardAppearance will be
     * used instead.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its standard height.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(@NotNull UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its standard height.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("standardAppearance")
    public native UINavigationBarAppearance standardAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact heights,
     * and an associated UIScrollView has reached the edge abutting the bar. If not set, first the scrollEdgeAppearance
     * will be tried, and if that is nil then compactAppearance followed by a modified standardAppearance.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("compactScrollEdgeAppearance")
    public native UINavigationBarAppearance compactScrollEdgeAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact heights,
     * and an associated UIScrollView has reached the edge abutting the bar. If not set, first the scrollEdgeAppearance
     * will be tried, and if that is nil then compactAppearance followed by a modified standardAppearance.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setCompactScrollEdgeAppearance:")
    public native void setCompactScrollEdgeAppearance(@Nullable UINavigationBarAppearance value);

    /**
     * The concrete behavioral style chosen for the navigation bar. When this resolves to .mac, the navigation bar's
     * contents are placed in the NSToolbar.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("behavioralStyle")
    @NUInt
    public native long behavioralStyle();

    /**
     * The toolbar section that this navigation bar is currently using.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("currentNSToolbarSection")
    @NInt
    public native long currentNSToolbarSection();

    /**
     * The requested behavioral style for the navigation bar.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preferredBehavioralStyle")
    @NUInt
    public native long preferredBehavioralStyle();

    /**
     * The requested behavioral style for the navigation bar.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredBehavioralStyle:")
    public native void setPreferredBehavioralStyle(@NUInt long value);
}

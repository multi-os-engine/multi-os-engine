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
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") UIView.Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

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
    public static native UINavigationBar appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UINavigationBar appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UINavigationBar appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UINavigationBar appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UINavigationBar appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UINavigationBar appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    public static native UINavigationBar new_objc();

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
    public UINavigationBar _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UINavigationBar _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UINavigationBar _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UINavigationBar _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UINavigationBar _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UINavigationBar _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * The back indicator image is shown beside the back button.
     * The back indicator transition mask image is used as a mask for content during push and pop transitions
     * Note: These properties must both be set if you want to customize the back indicator image.
     */
    @Generated
    @Selector("backIndicatorImage")
    public native UIImage backIndicatorImage();

    @Generated
    @Selector("backIndicatorTransitionMaskImage")
    public native UIImage backIndicatorTransitionMaskImage();

    @Generated
    @Selector("backItem")
    public native UINavigationItem backItem();

    @Generated
    @Selector("backgroundImageForBarMetrics:")
    public native UIImage backgroundImageForBarMetrics(@NInt long barMetrics);

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
     */
    @Generated
    @Selector("barTintColor")
    public native UIColor barTintColor();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native UINavigationBarDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native UINavigationBar init();

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationBar initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UINavigationBar initWithFrame(@ByValue CGRect frame);

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     */
    @Generated
    @Selector("isTranslucent")
    public native boolean isTranslucent();

    /**
     * Default is NO on iOS 6 and earlier. Always YES if barStyle is set to UIBarStyleBlackTranslucent
     */
    @Generated
    @Selector("setTranslucent:")
    public native void setTranslucent(boolean value);

    @Generated
    @Selector("items")
    public native NSArray<? extends UINavigationItem> items();

    /**
     * Returns the item that was popped.
     */
    @Generated
    @Selector("popNavigationItemAnimated:")
    public native UINavigationItem popNavigationItemAnimated(boolean animated);

    /**
     * Pushing a navigation item displays the item's title in the center of the navigation bar.
     * The previous top navigation item (if it exists) is displayed as a "back" button on the left.
     */
    @Generated
    @Selector("pushNavigationItem:animated:")
    public native void pushNavigationItemAnimated(UINavigationItem item, boolean animated);

    /**
     * The back indicator image is shown beside the back button.
     * The back indicator transition mask image is used as a mask for content during push and pop transitions
     * Note: These properties must both be set if you want to customize the back indicator image.
     */
    @Generated
    @Selector("setBackIndicatorImage:")
    public native void setBackIndicatorImage(UIImage value);

    @Generated
    @Selector("setBackIndicatorTransitionMaskImage:")
    public native void setBackIndicatorTransitionMaskImage(UIImage value);

    /**
     * Same as using UIBarPositionAny in -setBackgroundImage:forBarPosition:barMetrics. Resizable images will be
     * stretched
     * vertically if necessary when the navigation bar is in the position UIBarPositionTopAttached.
     */
    @Generated
    @Selector("setBackgroundImage:forBarMetrics:")
    public native void setBackgroundImageForBarMetrics(UIImage backgroundImage, @NInt long barMetrics);

    /**
     * In general, you should specify a value for the normal state to be used by other states which don't have a custom
     * value set.
     * <p>
     * Similarly, when a property is dependent on the bar metrics (on the iPhone in landscape orientation, bars have a
     * different height from standard), be sure to specify a value for UIBarMetricsDefault.
     */
    @Generated
    @Selector("setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImageForBarPositionBarMetrics(UIImage backgroundImage, @NInt long barPosition,
            @NInt long barMetrics);

    @Generated
    @Selector("setBarStyle:")
    public native void setBarStyle(@NInt long value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setBarTintColor:")
    public native void setBarTintColor(UIColor value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) UINavigationBarDelegate value) {
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
    public native void setItems(NSArray<? extends UINavigationItem> value);

    /**
     * If animated is YES, then simulate a push or pop depending on whether the new top item was previously in the
     * stack.
     */
    @Generated
    @Selector("setItems:animated:")
    public native void setItemsAnimated(NSArray<? extends UINavigationItem> items, boolean animated);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage:forBarMetrics: (if the
     * default background image is used, the default shadow image will be used).
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
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     */
    @Generated
    @Selector("setTitleTextAttributes:")
    public native void setTitleTextAttributes(NSDictionary<String, ?> value);

    @Generated
    @Selector("setTitleVerticalPositionAdjustment:forBarMetrics:")
    public native void setTitleVerticalPositionAdjustmentForBarMetrics(@NFloat double adjustment,
            @NInt long barMetrics);

    /**
     * Default is nil. When non-nil, a custom shadow image to show instead of the default shadow image. For a custom
     * shadow to be shown, a custom background image must also be set with -setBackgroundImage:forBarMetrics: (if the
     * default background image is used, the default shadow image will be used).
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
     * You may specify the font, text color, and shadow properties for the title in the text attributes dictionary,
     * using the keys found in NSAttributedString.h.
     */
    @Generated
    @Selector("titleTextAttributes")
    public native NSDictionary<String, ?> titleTextAttributes();

    @Generated
    @Selector("titleVerticalPositionAdjustmentForBarMetrics:")
    @NFloat
    public native double titleVerticalPositionAdjustmentForBarMetrics(@NInt long barMetrics);

    @Generated
    @Selector("topItem")
    public native UINavigationItem topItem();

    /**
     * You may specify the font, text color, and shadow properties for the large title in the text attributes
     * dictionary, using the keys found in NSAttributedString.h.
     */
    @Generated
    @Selector("largeTitleTextAttributes")
    public native NSDictionary<String, ?> largeTitleTextAttributes();

    /**
     * When set to YES, the navigation bar will use a larger out-of-line title view when requested by the current
     * navigation item. To specify when the large out-of-line title view appears, see
     * UINavigationItem.largeTitleDisplayMode. Defaults to NO.
     */
    @Generated
    @Selector("prefersLargeTitles")
    public native boolean prefersLargeTitles();

    /**
     * You may specify the font, text color, and shadow properties for the large title in the text attributes
     * dictionary, using the keys found in NSAttributedString.h.
     */
    @Generated
    @Selector("setLargeTitleTextAttributes:")
    public native void setLargeTitleTextAttributes(NSDictionary<String, ?> value);

    /**
     * When set to YES, the navigation bar will use a larger out-of-line title view when requested by the current
     * navigation item. To specify when the large out-of-line title view appears, see
     * UINavigationItem.largeTitleDisplayMode. Defaults to NO.
     */
    @Generated
    @Selector("setPrefersLargeTitles:")
    public native void setPrefersLargeTitles(boolean value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact height.
     * If not set, the standardAppearance will be used instead.
     */
    @Generated
    @Selector("compactAppearance")
    public native UINavigationBarAppearance compactAppearance();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Describes the appearance attributes for the navigation bar to use when an associated UIScrollView has reached the
     * edge abutting the bar (the top edge for the navigation bar). If not set, a modified standardAppearance will be
     * used instead.
     */
    @Generated
    @Selector("scrollEdgeAppearance")
    public native UINavigationBarAppearance scrollEdgeAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact height.
     * If not set, the standardAppearance will be used instead.
     */
    @Generated
    @Selector("setCompactAppearance:")
    public native void setCompactAppearance(UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when an associated UIScrollView has reached the
     * edge abutting the bar (the top edge for the navigation bar). If not set, a modified standardAppearance will be
     * used instead.
     */
    @Generated
    @Selector("setScrollEdgeAppearance:")
    public native void setScrollEdgeAppearance(UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its standard height.
     */
    @Generated
    @Selector("setStandardAppearance:")
    public native void setStandardAppearance(UINavigationBarAppearance value);

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its standard height.
     */
    @Generated
    @Selector("standardAppearance")
    public native UINavigationBarAppearance standardAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact heights,
     * and an associated UIScrollView has reached the edge abutting the bar. If not set, first the scrollEdgeAppearance
     * will be tried, and if that is nil then compactAppearance followed by a modified standardAppearance.
     */
    @Generated
    @Selector("compactScrollEdgeAppearance")
    public native UINavigationBarAppearance compactScrollEdgeAppearance();

    /**
     * Describes the appearance attributes for the navigation bar to use when it is displayed with its compact heights,
     * and an associated UIScrollView has reached the edge abutting the bar. If not set, first the scrollEdgeAppearance
     * will be tried, and if that is nil then compactAppearance followed by a modified standardAppearance.
     */
    @Generated
    @Selector("setCompactScrollEdgeAppearance:")
    public native void setCompactScrollEdgeAppearance(UINavigationBarAppearance value);
}

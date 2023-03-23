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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UICoordinateSpace;
import apple.uikit.protocol.UIFocusItemScrollableContainer;
import apple.uikit.struct.UIEdgeInsets;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIScrollView extends UIView implements NSCoding, UIFocusItemScrollableContainer {
    static {
        NatJ.register();
    }

    @Generated
    protected UIScrollView(Pointer peer) {
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
    public static native UIScrollView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIScrollView allocWithZone(VoidPtr zone);

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
    public static native UIScrollView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIScrollView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIScrollView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIScrollView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIScrollView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIScrollView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Deprecated
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UIScrollView new_objc();

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
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

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
    public static native void setAnimationStartDate(NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Deprecated
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

    /**
     * default NO. if YES and bounces is YES, even if content is smaller than bounds, allow drag horizontally
     */
    @Generated
    @Selector("alwaysBounceHorizontal")
    public native boolean alwaysBounceHorizontal();

    /**
     * default NO. if YES and bounces is YES, even if content is smaller than bounds, allow drag vertically
     */
    @Generated
    @Selector("alwaysBounceVertical")
    public native boolean alwaysBounceVertical();

    @Generated
    @ProtocolClassMethod("appearance")
    public UIScrollView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIScrollView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIScrollView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIScrollView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIScrollView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIScrollView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * default YES. if YES, bounces past edge of content and back again
     */
    @Generated
    @Selector("bounces")
    public native boolean bounces();

    /**
     * default is YES. if set, user can go past min/max zoom while gesturing and the zoom will animate to the min/max
     * value at gesture end
     */
    @Generated
    @Selector("bouncesZoom")
    public native boolean bouncesZoom();

    /**
     * default is YES. if NO, then once we start tracking, we don't try to drag if the touch moves. this has no effect
     * on presses
     */
    @Generated
    @Selector("canCancelContentTouches")
    public native boolean canCancelContentTouches();

    /**
     * default UIEdgeInsetsZero. add additional scroll area around content
     */
    @Generated
    @Selector("contentInset")
    @ByValue
    public native UIEdgeInsets contentInset();

    @Generated
    @Selector("contentOffset")
    @ByValue
    public native CGPoint contentOffset();

    @Generated
    @Selector("contentSize")
    @ByValue
    public native CGSize contentSize();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("decelerationRate")
    @NFloat
    public native double decelerationRate();

    /**
     * default is YES. if NO, we immediately call -touchesShouldBegin:withEvent:inContentView:. this has no effect on
     * presses
     */
    @Generated
    @Selector("delaysContentTouches")
    public native boolean delaysContentTouches();

    /**
     * default nil. weak reference
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * displays the scroll indicators for a short time. This should be done whenever you bring the scroll view to front.
     */
    @Generated
    @Selector("flashScrollIndicators")
    public native void flashScrollIndicators();

    /**
     * default is UIScrollViewIndicatorStyleDefault
     */
    @Generated
    @Selector("indicatorStyle")
    @NInt
    public native long indicatorStyle();

    @Generated
    @Selector("init")
    public native UIScrollView init();

    @Generated
    @Selector("initWithCoder:")
    public native UIScrollView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIScrollView initWithFrame(@ByValue CGRect frame);

    /**
     * returns YES if user isn't dragging (touch up) but scroll view is still moving
     */
    @Generated
    @Selector("isDecelerating")
    public native boolean isDecelerating();

    /**
     * default NO. if YES, try to lock vertical or horizontal scrolling while dragging
     */
    @Generated
    @Selector("isDirectionalLockEnabled")
    public native boolean isDirectionalLockEnabled();

    /**
     * default NO. if YES, try to lock vertical or horizontal scrolling while dragging
     */
    @Generated
    @Selector("setDirectionalLockEnabled:")
    public native void setDirectionalLockEnabled(boolean value);

    /**
     * returns YES if user has started scrolling. this may require some time and or distance to move to initiate
     * dragging
     */
    @Generated
    @Selector("isDragging")
    public native boolean isDragging();

    /**
     * default NO. if YES, stop on multiples of view bounds
     */
    @Generated
    @Selector("isPagingEnabled")
    public native boolean isPagingEnabled();

    /**
     * default NO. if YES, stop on multiples of view bounds
     */
    @Generated
    @Selector("setPagingEnabled:")
    public native void setPagingEnabled(boolean value);

    /**
     * default YES. turn off any dragging temporarily
     */
    @Generated
    @Selector("isScrollEnabled")
    public native boolean isScrollEnabled();

    /**
     * default YES. turn off any dragging temporarily
     */
    @Generated
    @Selector("setScrollEnabled:")
    public native void setScrollEnabled(boolean value);

    /**
     * returns YES if user has touched. may not yet have started dragging
     */
    @Generated
    @Selector("isTracking")
    public native boolean isTracking();

    /**
     * returns YES if we are in the middle of zooming back to the min/max value
     */
    @Generated
    @Selector("isZoomBouncing")
    public native boolean isZoomBouncing();

    /**
     * returns YES if user in zoom gesture
     */
    @Generated
    @Selector("isZooming")
    public native boolean isZooming();

    /**
     * default is UIScrollViewKeyboardDismissModeNone
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("keyboardDismissMode")
    @NInt
    public native long keyboardDismissMode();

    /**
     * default is 1.0. must be > minimum zoom scale to enable zooming
     */
    @Generated
    @Selector("maximumZoomScale")
    @NFloat
    public native double maximumZoomScale();

    /**
     * default is 1.0
     */
    @Generated
    @Selector("minimumZoomScale")
    @NFloat
    public native double minimumZoomScale();

    /**
     * Change `panGestureRecognizer.allowedTouchTypes` to limit scrolling to a particular set of touch types.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("panGestureRecognizer")
    public native UIPanGestureRecognizer panGestureRecognizer();

    /**
     * `pinchGestureRecognizer` will return nil when zooming is disabled.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("pinchGestureRecognizer")
    public native UIPinchGestureRecognizer pinchGestureRecognizer();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("refreshControl")
    public native UIRefreshControl refreshControl();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: The scrollIndicatorInsets getter is deprecated, use the verticalScrollIndicatorInsets and
     * horizontalScrollIndicatorInsets getters instead.
     */
    @Deprecated
    @Generated
    @Selector("scrollIndicatorInsets")
    @ByValue
    public native UIEdgeInsets scrollIndicatorInsets();

    /**
     * scroll so rect is just visible (nearest edges). nothing if rect completely visible
     */
    @Generated
    @Selector("scrollRectToVisible:animated:")
    public native void scrollRectToVisibleAnimated(@ByValue CGRect rect, boolean animated);

    /**
     * default is YES.
     */
    @Generated
    @Selector("scrollsToTop")
    public native boolean scrollsToTop();

    /**
     * default NO. if YES and bounces is YES, even if content is smaller than bounds, allow drag horizontally
     */
    @Generated
    @Selector("setAlwaysBounceHorizontal:")
    public native void setAlwaysBounceHorizontal(boolean value);

    /**
     * default NO. if YES and bounces is YES, even if content is smaller than bounds, allow drag vertically
     */
    @Generated
    @Selector("setAlwaysBounceVertical:")
    public native void setAlwaysBounceVertical(boolean value);

    /**
     * default YES. if YES, bounces past edge of content and back again
     */
    @Generated
    @Selector("setBounces:")
    public native void setBounces(boolean value);

    /**
     * default is YES. if set, user can go past min/max zoom while gesturing and the zoom will animate to the min/max
     * value at gesture end
     */
    @Generated
    @Selector("setBouncesZoom:")
    public native void setBouncesZoom(boolean value);

    /**
     * default is YES. if NO, then once we start tracking, we don't try to drag if the touch moves. this has no effect
     * on presses
     */
    @Generated
    @Selector("setCanCancelContentTouches:")
    public native void setCanCancelContentTouches(boolean value);

    /**
     * default UIEdgeInsetsZero. add additional scroll area around content
     */
    @Generated
    @Selector("setContentInset:")
    public native void setContentInset(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setContentOffset:")
    public native void setContentOffset(@ByValue CGPoint value);

    /**
     * animate at constant velocity to new offset
     */
    @Generated
    @Selector("setContentOffset:animated:")
    public native void setContentOffsetAnimated(@ByValue CGPoint contentOffset, boolean animated);

    /**
     * default CGSizeZero
     */
    @Generated
    @Selector("setContentSize:")
    public native void setContentSize(@ByValue CGSize value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setDecelerationRate:")
    public native void setDecelerationRate(@NFloat double value);

    /**
     * default is YES. if NO, we immediately call -touchesShouldBegin:withEvent:inContentView:. this has no effect on
     * presses
     */
    @Generated
    @Selector("setDelaysContentTouches:")
    public native void setDelaysContentTouches(boolean value);

    /**
     * default nil. weak reference
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * default nil. weak reference
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
     * default is UIScrollViewIndicatorStyleDefault
     */
    @Generated
    @Selector("setIndicatorStyle:")
    public native void setIndicatorStyle(@NInt long value);

    /**
     * default is UIScrollViewKeyboardDismissModeNone
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setKeyboardDismissMode:")
    public native void setKeyboardDismissMode(@NInt long value);

    /**
     * default is 1.0. must be > minimum zoom scale to enable zooming
     */
    @Generated
    @Selector("setMaximumZoomScale:")
    public native void setMaximumZoomScale(@NFloat double value);

    /**
     * default is 1.0
     */
    @Generated
    @Selector("setMinimumZoomScale:")
    public native void setMinimumZoomScale(@NFloat double value);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl value);

    /**
     * use the setter only, as a convenience for setting both verticalScrollIndicatorInsets and
     * horizontalScrollIndicatorInsets to the same value. if those properties have been set to different values, the
     * return value of this getter (deprecated) is undefined.
     */
    @Generated
    @Selector("setScrollIndicatorInsets:")
    public native void setScrollIndicatorInsets(@ByValue UIEdgeInsets value);

    /**
     * default is YES.
     */
    @Generated
    @Selector("setScrollsToTop:")
    public native void setScrollsToTop(boolean value);

    /**
     * default YES. show indicator while we are tracking. fades out after tracking
     */
    @Generated
    @Selector("setShowsHorizontalScrollIndicator:")
    public native void setShowsHorizontalScrollIndicator(boolean value);

    /**
     * default YES. show indicator while we are tracking. fades out after tracking
     */
    @Generated
    @Selector("setShowsVerticalScrollIndicator:")
    public native void setShowsVerticalScrollIndicator(boolean value);

    /**
     * default is 1.0
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setZoomScale:")
    public native void setZoomScale(@NFloat double value);

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("setZoomScale:animated:")
    public native void setZoomScaleAnimated(@NFloat double scale, boolean animated);

    /**
     * default YES. show indicator while we are tracking. fades out after tracking
     */
    @Generated
    @Selector("showsHorizontalScrollIndicator")
    public native boolean showsHorizontalScrollIndicator();

    /**
     * default YES. show indicator while we are tracking. fades out after tracking
     */
    @Generated
    @Selector("showsVerticalScrollIndicator")
    public native boolean showsVerticalScrollIndicator();

    /**
     * override points for subclasses to control delivery of touch events to subviews of the scroll view
     * called before touches are delivered to a subview of the scroll view. if it returns NO the touches will not be
     * delivered to the subview
     * this has no effect on presses
     * default returns YES
     */
    @Generated
    @Selector("touchesShouldBegin:withEvent:inContentView:")
    public native boolean touchesShouldBeginWithEventInContentView(NSSet<? extends UITouch> touches, UIEvent event,
            UIView view);

    /**
     * called before scrolling begins if touches have already been delivered to a subview of the scroll view. if it
     * returns NO the touches will continue to be delivered to the subview and scrolling will not occur
     * not called if canCancelContentTouches is NO. default returns YES if view isn't a UIControl
     * this has no effect on presses
     */
    @Generated
    @Selector("touchesShouldCancelInContentView:")
    public native boolean touchesShouldCancelInContentView(UIView view);

    /**
     * default is 1.0
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("zoomScale")
    @NFloat
    public native double zoomScale();

    /**
     * API-Since: 3.0
     */
    @Generated
    @Selector("zoomToRect:animated:")
    public native void zoomToRectAnimated(@ByValue CGRect rect, boolean animated);

    /**
     * When contentInsetAdjustmentBehavior allows, UIScrollView may incorporate
     * its safeAreaInsets into the adjustedContentInset.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("adjustedContentInset")
    @ByValue
    public native UIEdgeInsets adjustedContentInset();

    /**
     * Also see -scrollViewDidChangeAdjustedContentInset: in the UIScrollViewDelegate protocol.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("adjustedContentInsetDidChange")
    public native void adjustedContentInsetDidChange();

    /**
     * Configure the behavior of adjustedContentInset.
     * Default is UIScrollViewContentInsetAdjustmentAutomatic.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("contentInsetAdjustmentBehavior")
    @NInt
    public native long contentInsetAdjustmentBehavior();

    /**
     * contentLayoutGuide anchors (e.g., contentLayoutGuide.centerXAnchor, etc.) refer to
     * the untranslated content area of the scroll view.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("contentLayoutGuide")
    public native UILayoutGuide contentLayoutGuide();

    /**
     * `directionalPressGestureRecognizer` is disabled by default, but can be enabled to perform scrolling in response
     * to up / down / left / right arrow button presses directly, instead of scrolling indirectly in response to focus
     * updates.
     */
    @Generated
    @Selector("directionalPressGestureRecognizer")
    public native UIGestureRecognizer directionalPressGestureRecognizer();

    /**
     * frameLayoutGuide anchors (e.g., frameLayoutGuide.centerXAnchor) refer to
     * the untransformed frame of the scroll view.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("frameLayoutGuide")
    public native UILayoutGuide frameLayoutGuide();

    @Generated
    @Selector("indexDisplayMode")
    @NInt
    public native long indexDisplayMode();

    /**
     * Configure the behavior of adjustedContentInset.
     * Default is UIScrollViewContentInsetAdjustmentAutomatic.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setContentInsetAdjustmentBehavior:")
    public native void setContentInsetAdjustmentBehavior(@NInt long value);

    @Generated
    @Selector("setIndexDisplayMode:")
    public native void setIndexDisplayMode(@NInt long value);

    /**
     * Configures whether the scroll indicator insets are automatically adjusted by the system.
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("automaticallyAdjustsScrollIndicatorInsets")
    public native boolean automaticallyAdjustsScrollIndicatorInsets();

    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace coordinateSpace();

    @Generated
    @Selector("focusItemsInRect:")
    public native NSArray<?> focusItemsInRect(@ByValue CGRect rect);

    /**
     * default is UIEdgeInsetsZero.
     * 
     * API-Since: 11.1
     */
    @Generated
    @Selector("horizontalScrollIndicatorInsets")
    @ByValue
    public native UIEdgeInsets horizontalScrollIndicatorInsets();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Configures whether the scroll indicator insets are automatically adjusted by the system.
     * Default is YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAutomaticallyAdjustsScrollIndicatorInsets:")
    public native void setAutomaticallyAdjustsScrollIndicatorInsets(boolean value);

    /**
     * default is UIEdgeInsetsZero.
     * 
     * API-Since: 11.1
     */
    @Generated
    @Selector("setHorizontalScrollIndicatorInsets:")
    public native void setHorizontalScrollIndicatorInsets(@ByValue UIEdgeInsets value);

    /**
     * default is UIEdgeInsetsZero.
     * 
     * API-Since: 11.1
     */
    @Generated
    @Selector("setVerticalScrollIndicatorInsets:")
    public native void setVerticalScrollIndicatorInsets(@ByValue UIEdgeInsets value);

    /**
     * default is UIEdgeInsetsZero.
     * 
     * API-Since: 11.1
     */
    @Generated
    @Selector("verticalScrollIndicatorInsets")
    @ByValue
    public native UIEdgeInsets verticalScrollIndicatorInsets();

    @Generated
    @Selector("visibleSize")
    @ByValue
    public native CGSize visibleSize();
}

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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIScrollView extends UIView implements NSCoding {
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

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
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @Selector("alwaysBounceHorizontal")
    public native boolean alwaysBounceHorizontal();

    @Generated
    @Selector("alwaysBounceVertical")
    public native boolean alwaysBounceVertical();

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
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
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
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("bounces")
    public native boolean bounces();

    @Generated
    @Selector("bouncesZoom")
    public native boolean bouncesZoom();

    @Generated
    @Selector("canCancelContentTouches")
    public native boolean canCancelContentTouches();

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

    @Generated
    @Selector("decelerationRate")
    @NFloat
    public native double decelerationRate();

    @Generated
    @Selector("delaysContentTouches")
    public native boolean delaysContentTouches();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("flashScrollIndicators")
    public native void flashScrollIndicators();

    @Generated
    @Selector("indicatorStyle")
    @NInt
    public native long indicatorStyle();

    @Generated
    @Selector("init")
    public native UIScrollView init();

    @Generated
    @Selector("initWithCoder:")
    public native UIScrollView initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native UIScrollView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("isDecelerating")
    public native boolean isDecelerating();

    @Generated
    @Selector("isDirectionalLockEnabled")
    public native boolean isDirectionalLockEnabled();

    @Generated
    @Selector("setDirectionalLockEnabled:")
    public native void setDirectionalLockEnabled(boolean value);

    @Generated
    @Selector("isDragging")
    public native boolean isDragging();

    @Generated
    @Selector("isPagingEnabled")
    public native boolean isPagingEnabled();

    @Generated
    @Selector("setPagingEnabled:")
    public native void setPagingEnabled(boolean value);

    @Generated
    @Selector("isScrollEnabled")
    public native boolean isScrollEnabled();

    @Generated
    @Selector("setScrollEnabled:")
    public native void setScrollEnabled(boolean value);

    @Generated
    @Selector("isTracking")
    public native boolean isTracking();

    @Generated
    @Selector("isZoomBouncing")
    public native boolean isZoomBouncing();

    @Generated
    @Selector("isZooming")
    public native boolean isZooming();

    @Generated
    @Selector("keyboardDismissMode")
    @NInt
    public native long keyboardDismissMode();

    @Generated
    @Selector("maximumZoomScale")
    @NFloat
    public native double maximumZoomScale();

    @Generated
    @Selector("minimumZoomScale")
    @NFloat
    public native double minimumZoomScale();

    @Generated
    @Selector("panGestureRecognizer")
    public native UIPanGestureRecognizer panGestureRecognizer();

    @Generated
    @Selector("pinchGestureRecognizer")
    public native UIPinchGestureRecognizer pinchGestureRecognizer();

    @Generated
    @Selector("refreshControl")
    public native UIRefreshControl refreshControl();

    @Generated
    @Selector("scrollIndicatorInsets")
    @ByValue
    public native UIEdgeInsets scrollIndicatorInsets();

    @Generated
    @Selector("scrollRectToVisible:animated:")
    public native void scrollRectToVisibleAnimated(@ByValue CGRect rect, boolean animated);

    @Generated
    @Selector("scrollsToTop")
    public native boolean scrollsToTop();

    @Generated
    @Selector("setAlwaysBounceHorizontal:")
    public native void setAlwaysBounceHorizontal(boolean value);

    @Generated
    @Selector("setAlwaysBounceVertical:")
    public native void setAlwaysBounceVertical(boolean value);

    @Generated
    @Selector("setBounces:")
    public native void setBounces(boolean value);

    @Generated
    @Selector("setBouncesZoom:")
    public native void setBouncesZoom(boolean value);

    @Generated
    @Selector("setCanCancelContentTouches:")
    public native void setCanCancelContentTouches(boolean value);

    @Generated
    @Selector("setContentInset:")
    public native void setContentInset(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setContentOffset:")
    public native void setContentOffset(@ByValue CGPoint value);

    @Generated
    @Selector("setContentOffset:animated:")
    public native void setContentOffsetAnimated(@ByValue CGPoint contentOffset, boolean animated);

    @Generated
    @Selector("setContentSize:")
    public native void setContentSize(@ByValue CGSize value);

    @Generated
    @Selector("setDecelerationRate:")
    public native void setDecelerationRate(@NFloat double value);

    @Generated
    @Selector("setDelaysContentTouches:")
    public native void setDelaysContentTouches(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

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

    @Generated
    @Selector("setIndicatorStyle:")
    public native void setIndicatorStyle(@NInt long value);

    @Generated
    @Selector("setKeyboardDismissMode:")
    public native void setKeyboardDismissMode(@NInt long value);

    @Generated
    @Selector("setMaximumZoomScale:")
    public native void setMaximumZoomScale(@NFloat double value);

    @Generated
    @Selector("setMinimumZoomScale:")
    public native void setMinimumZoomScale(@NFloat double value);

    @Generated
    @Selector("setRefreshControl:")
    public native void setRefreshControl(UIRefreshControl value);

    @Generated
    @Selector("setScrollIndicatorInsets:")
    public native void setScrollIndicatorInsets(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setScrollsToTop:")
    public native void setScrollsToTop(boolean value);

    @Generated
    @Selector("setShowsHorizontalScrollIndicator:")
    public native void setShowsHorizontalScrollIndicator(boolean value);

    @Generated
    @Selector("setShowsVerticalScrollIndicator:")
    public native void setShowsVerticalScrollIndicator(boolean value);

    @Generated
    @Selector("setZoomScale:")
    public native void setZoomScale(@NFloat double value);

    @Generated
    @Selector("setZoomScale:animated:")
    public native void setZoomScaleAnimated(@NFloat double scale, boolean animated);

    @Generated
    @Selector("showsHorizontalScrollIndicator")
    public native boolean showsHorizontalScrollIndicator();

    @Generated
    @Selector("showsVerticalScrollIndicator")
    public native boolean showsVerticalScrollIndicator();

    @Generated
    @Selector("touchesShouldBegin:withEvent:inContentView:")
    public native boolean touchesShouldBeginWithEventInContentView(NSSet<? extends UITouch> touches, UIEvent event,
            UIView view);

    @Generated
    @Selector("touchesShouldCancelInContentView:")
    public native boolean touchesShouldCancelInContentView(UIView view);

    @Generated
    @Selector("zoomScale")
    @NFloat
    public native double zoomScale();

    @Generated
    @Selector("zoomToRect:animated:")
    public native void zoomToRectAnimated(@ByValue CGRect rect, boolean animated);

    @Generated
    @Selector("adjustedContentInset")
    @ByValue
    public native UIEdgeInsets adjustedContentInset();

    @Generated
    @Selector("adjustedContentInsetDidChange")
    public native void adjustedContentInsetDidChange();

    @Generated
    @Selector("contentInsetAdjustmentBehavior")
    @NInt
    public native long contentInsetAdjustmentBehavior();

    @Generated
    @Selector("contentLayoutGuide")
    public native UILayoutGuide contentLayoutGuide();

    @Generated
    @Selector("directionalPressGestureRecognizer")
    public native UIGestureRecognizer directionalPressGestureRecognizer();

    @Generated
    @Selector("frameLayoutGuide")
    public native UILayoutGuide frameLayoutGuide();

    @Generated
    @Selector("indexDisplayMode")
    @NInt
    public native long indexDisplayMode();

    @Generated
    @Selector("setContentInsetAdjustmentBehavior:")
    public native void setContentInsetAdjustmentBehavior(@NInt long value);

    @Generated
    @Selector("setIndexDisplayMode:")
    public native void setIndexDisplayMode(@NInt long value);
}

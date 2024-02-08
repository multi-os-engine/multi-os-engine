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
import apple.uikit.protocol.UIAppearanceContainer;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
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
public class UIWindow extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected UIWindow(Pointer peer) {
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
    public static native UIWindow alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIWindow allocWithZone(VoidPtr zone);

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
    public static native UIWindow appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIWindow appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIWindow appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIWindow appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIWindow appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIWindow appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UIWindow new_objc();

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
    public UIWindow _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIWindow _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIWindow _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIWindow _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIWindow _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIWindow _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * Override point for subclasses. Do not call directly. Informs the window it has become the
     * key window. In apps built against the iOS 15 or tvOS 15 SDK (or later), this method will
     * be called when the window becomes its scene's key window. For apps built against earlier
     * SDKs, this method will be called when the window becomes the application's key window.
     */
    @Generated
    @Selector("becomeKeyWindow")
    public native void becomeKeyWindow();

    /**
     * pass in nil to mean screen
     */
    @Generated
    @Selector("convertPoint:fromWindow:")
    @ByValue
    public native CGPoint convertPointFromWindow(@ByValue CGPoint point, @Nullable UIWindow window);

    /**
     * can be used to convert to another window
     */
    @Generated
    @Selector("convertPoint:toWindow:")
    @ByValue
    public native CGPoint convertPointToWindow(@ByValue CGPoint point, @Nullable UIWindow window);

    @Generated
    @Selector("convertRect:fromWindow:")
    @ByValue
    public native CGRect convertRectFromWindow(@ByValue CGRect rect, @Nullable UIWindow window);

    @Generated
    @Selector("convertRect:toWindow:")
    @ByValue
    public native CGRect convertRectToWindow(@ByValue CGRect rect, @Nullable UIWindow window);

    @Generated
    @Selector("init")
    public native UIWindow init();

    @Generated
    @Selector("initWithCoder:")
    public native UIWindow initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIWindow initWithFrame(@ByValue CGRect frame);

    /**
     * In apps built against the iOS 15 or tvOS 15 SDK (or later), this property returns YES if
     * the window is its scene's key window. For apps built against earlier SDKs, this property
     * returns YES if the window is the application's key window.
     */
    @Generated
    @Selector("isKeyWindow")
    public native boolean isKeyWindow();

    /**
     * Convenience. Most apps call this to show a window and also make it key.
     * To make the window visible without becoming key, just use UIView's hidden property.
     */
    @Generated
    @Selector("makeKeyAndVisible")
    public native void makeKeyAndVisible();

    /**
     * Make the window key without changing visibility.
     */
    @Generated
    @Selector("makeKeyWindow")
    public native void makeKeyWindow();

    /**
     * Override point for subclasses. Do not call directly. Informs the window it has resigned key
     * window status. In apps built against the iOS 15 or tvOS 15 SDK (or later), this method will
     * be called when the window resigns key in its scene. For apps built against earlier SDKs,
     * this method will be called when the window resigns key in the application.
     */
    @Generated
    @Selector("resignKeyWindow")
    public native void resignKeyWindow();

    /**
     * default is nil
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @Selector("rootViewController")
    public native UIViewController rootViewController();

    /**
     * default is [UIScreen mainScreen]. changing the screen may be an expensive operation and should not be done in
     * performance-sensitive code
     * 
     * API-Since: 3.2
     */
    @NotNull
    @Generated
    @Selector("screen")
    public native UIScreen screen();

    /**
     * called by UIApplication to dispatch events to views inside the window
     */
    @Generated
    @Selector("sendEvent:")
    public native void sendEvent(@NotNull UIEvent event);

    /**
     * default is nil
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setRootViewController:")
    public native void setRootViewController(@Nullable UIViewController value);

    /**
     * API-Since: 3.2
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("setScreen:")
    public native void setScreen(@NotNull UIScreen screen);

    /**
     * default = 0.0
     */
    @Generated
    @Selector("setWindowLevel:")
    public native void setWindowLevel(@NFloat double value);

    /**
     * default = 0.0
     */
    @Generated
    @Selector("windowLevel")
    @NFloat
    public native double windowLevel();

    /**
     * Indicates whether content should drive the size of arbitrarily resizable windows (which are currently present
     * only on macOS).
     */
    @Generated
    @Selector("canResizeToFitContent")
    public native boolean canResizeToFitContent();

    /**
     * instantiate a UIWindow already associated with a given UIWindowScene instance, with matching frame & interface
     * orientations.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("initWithWindowScene:")
    public native UIWindow initWithWindowScene(@NotNull UIWindowScene windowScene);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Indicates whether content should drive the size of arbitrarily resizable windows (which are currently present
     * only on macOS).
     */
    @Generated
    @Selector("setCanResizeToFitContent:")
    public native void setCanResizeToFitContent(boolean value);

    /**
     * If nil, window will not appear on any screen.
     * changing the UIWindowScene may be an expensive operation and should not be done in performance-sensitive code
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setWindowScene:")
    public native void setWindowScene_unsafe(@Nullable UIWindowScene value);

    /**
     * If nil, window will not appear on any screen.
     * changing the UIWindowScene may be an expensive operation and should not be done in performance-sensitive code
     * 
     * API-Since: 13.0
     */
    @Generated
    public void setWindowScene(@Nullable UIWindowScene value) {
        Object __old = windowScene();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setWindowScene_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * If nil, window will not appear on any screen.
     * changing the UIWindowScene may be an expensive operation and should not be done in performance-sensitive code
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("windowScene")
    public native UIWindowScene windowScene();

    /**
     * Default is YES. Return NO to indicate the window cannot become the key window.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("canBecomeKeyWindow")
    public native boolean canBecomeKeyWindow();

    /**
     * This layout guide is designed specifically for full-screen media content, and attaching constraints from deep in
     * the window's view hierarchy will raise an exception.
     * 
     * This guide provides a layout area for placing media content of a given aspect ratio (width over height) such that
     * the content will be completely visible within the window.
     * Compared to the standard `safeAreaLayoutGuide` on a view, this guide takes into account the aspect ratio of the
     * content, allowing it the maximum size within the window's
     * true safe area, including the actual shape of the screen when that is the only factor contributing to the safe
     * area. The rect defined by this guide will be centered within the
     * window.
     * 
     * This layout guide should only be used for fixed aspect ratio content that is intended to fill the window (such as
     * image or video content) and is not a replacement for the
     * standard `safeAreaLayoutGuide` on each UIView which should be used for most content layout. The
     * `safeAreaAspectFitLayoutGuide` should only be used with views
     * that are direct subviews of, or very close descendants of, the guide's window. Creating constraints from this
     * layout guide to views deeper in the view hierarchy or across
     * views owned by child view controllers can significantly degrade performance and possibly raise an exception.
     * Additionally, the safe area insets added by child view
     * controllers will not be reflected in these cases. For anything other than full-screen/window media content, the
     * standard `safeAreaLayoutGuide` on UIView should be used.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("safeAreaAspectFitLayoutGuide")
    public native UILayoutGuide safeAreaAspectFitLayoutGuide();

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

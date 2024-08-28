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
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPageControl extends UIControl {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPageControl(Pointer peer) {
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
    public static native UIPageControl alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIPageControl allocWithZone(VoidPtr zone);

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
    public static native UIPageControl appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIPageControl appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIPageControl appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIPageControl appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIPageControl appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIPageControl appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UIPageControl new_objc();

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
    public UIPageControl _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIPageControl _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIPageControl _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIPageControl _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIPageControl _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIPageControl _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * default is 0. Value is pinned to 0..numberOfPages-1
     */
    @Generated
    @Selector("currentPage")
    @NInt
    public native long currentPage();

    /**
     * The tint color for the currently-selected indicators. Default is nil.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("currentPageIndicatorTintColor")
    public native UIColor currentPageIndicatorTintColor();

    /**
     * if set, tapping to a new page won't update the currently displayed page until -updateCurrentPageDisplay is
     * called. default is NO
     * 
     * API-Since: 2.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: defersCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Generated
    @Selector("defersCurrentPageDisplay")
    public native boolean defersCurrentPageDisplay();

    /**
     * hides the indicator if there is only one page, default is NO
     */
    @Generated
    @Selector("hidesForSinglePage")
    public native boolean hidesForSinglePage();

    @Generated
    @Selector("init")
    public native UIPageControl init();

    @Generated
    @Selector("initWithCoder:")
    public native UIPageControl initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIPageControl initWithFrame(@ByValue CGRect frame);

    /**
     * default is 0
     */
    @Generated
    @Selector("numberOfPages")
    @NInt
    public native long numberOfPages();

    /**
     * The tint color for non-selected indicators. Default is nil.
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("pageIndicatorTintColor")
    public native UIColor pageIndicatorTintColor();

    /**
     * default is 0. Value is pinned to 0..numberOfPages-1
     */
    @Generated
    @Selector("setCurrentPage:")
    public native void setCurrentPage(@NInt long value);

    /**
     * The tint color for the currently-selected indicators. Default is nil.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setCurrentPageIndicatorTintColor:")
    public native void setCurrentPageIndicatorTintColor(@Nullable UIColor value);

    /**
     * if set, tapping to a new page won't update the currently displayed page until -updateCurrentPageDisplay is
     * called. default is NO
     * 
     * API-Since: 2.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: defersCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Generated
    @Selector("setDefersCurrentPageDisplay:")
    public native void setDefersCurrentPageDisplay(boolean value);

    /**
     * hides the indicator if there is only one page, default is NO
     */
    @Generated
    @Selector("setHidesForSinglePage:")
    public native void setHidesForSinglePage(boolean value);

    /**
     * default is 0
     */
    @Generated
    @Selector("setNumberOfPages:")
    public native void setNumberOfPages(@NInt long value);

    /**
     * The tint color for non-selected indicators. Default is nil.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setPageIndicatorTintColor:")
    public native void setPageIndicatorTintColor(@Nullable UIColor value);

    /**
     * Returns the minimum size required to display indicators for the given page count. Can be used to size the control
     * if the page count could change.
     */
    @Generated
    @Selector("sizeForNumberOfPages:")
    @ByValue
    public native CGSize sizeForNumberOfPages(@NInt long pageCount);

    /**
     * update page display to match the currentPage. ignored if defersCurrentPageDisplay is NO. setting the page value
     * directly will update immediately
     * 
     * API-Since: 2.0
     * Deprecated-Since: 14.0
     * Deprecated-Message: updateCurrentPageDisplay no longer does anything reasonable with the new interaction mode.
     */
    @Deprecated
    @Generated
    @Selector("updateCurrentPageDisplay")
    public native void updateCurrentPageDisplay();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Returns YES if continuous interaction is supported and enabled, NO otherwise. Default is YES for platforms that
     * support it.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("allowsContinuousInteraction")
    public native boolean allowsContinuousInteraction();

    /**
     * The preferred background style. Default is UIPageControlBackgroundStyleAutomatic on iOS, and
     * UIPageControlBackgroundStyleProminent on tvOS.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("backgroundStyle")
    @NInt
    public native long backgroundStyle();

    /**
     * Returns the override indicator image for the specific page, nil if no override image was set.
     * 
     * @param page Must be in the range of 0..numberOfPages
     * 
     *             API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("indicatorImageForPage:")
    public native UIImage indicatorImageForPage(@NInt long page);

    @Generated
    @Selector("initWithFrame:primaryAction:")
    public native UIPageControl initWithFramePrimaryAction(@ByValue CGRect frame, @Nullable UIAction primaryAction);

    /**
     * The current interaction state for when the current page changes. Default is UIPageControlInteractionStateNone
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("interactionState")
    @NInt
    public native long interactionState();

    /**
     * The preferred image for indicators. Symbol images are recommended. Default is nil.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("preferredIndicatorImage")
    public native UIImage preferredIndicatorImage();

    /**
     * Returns YES if continuous interaction is supported and enabled, NO otherwise. Default is YES for platforms that
     * support it.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAllowsContinuousInteraction:")
    public native void setAllowsContinuousInteraction(boolean value);

    /**
     * The preferred background style. Default is UIPageControlBackgroundStyleAutomatic on iOS, and
     * UIPageControlBackgroundStyleProminent on tvOS.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundStyle:")
    public native void setBackgroundStyle(@NInt long value);

    /**
     * Override the indicator image for a specific page. Symbol images are recommended.
     * 
     * @param image The image for the indicator. Resets to the default if image is nil.
     * @param page  Must be in the range of 0..numberOfPages
     * 
     *              API-Since: 14.0
     */
    @Generated
    @Selector("setIndicatorImage:forPage:")
    public native void setIndicatorImageForPage(@Nullable UIImage image, @NInt long page);

    /**
     * The preferred image for indicators. Symbol images are recommended. Default is nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setPreferredIndicatorImage:")
    public native void setPreferredIndicatorImage(@Nullable UIImage value);

    /**
     * Returns the override current page indicator image for the specific page, nil if no override image was set.
     * 
     * @param page Must be in the range of 0..numberOfPages
     * 
     *             API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("currentPageIndicatorImageForPage:")
    public native UIImage currentPageIndicatorImageForPage(@NInt long page);

    /**
     * The layout direction of the page indicators. The default value is \c UIPageControlDirectionNatural.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("direction")
    @NInt
    public native long direction();

    /**
     * The preferred image for the current page indicator. Symbol images are recommended. Default is nil.
     * If this value is nil, then UIPageControl will use \c preferredPageIndicatorImage (or its per-page variant) as
     * the indicator image.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("preferredCurrentPageIndicatorImage")
    public native UIImage preferredCurrentPageIndicatorImage();

    /**
     * Override the current page indicator image for a specific page. Symbol images are recommended.
     * 
     * @param image The image for the indicator. Resets to the default if image is nil.
     * @param page  Must be in the range of 0..numberOfPages
     * 
     *              API-Since: 16.0
     */
    @Generated
    @Selector("setCurrentPageIndicatorImage:forPage:")
    public native void setCurrentPageIndicatorImageForPage(@Nullable UIImage image, @NInt long page);

    /**
     * The layout direction of the page indicators. The default value is \c UIPageControlDirectionNatural.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@NInt long value);

    /**
     * The preferred image for the current page indicator. Symbol images are recommended. Default is nil.
     * If this value is nil, then UIPageControl will use \c preferredPageIndicatorImage (or its per-page variant) as
     * the indicator image.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredCurrentPageIndicatorImage:")
    public native void setPreferredCurrentPageIndicatorImage(@Nullable UIImage value);

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    /**
     * An object that defines the progress of the page control. Default is nil.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("progress")
    @Nullable
    public native UIPageControlProgress progress();

    /**
     * An object that defines the progress of the page control. Default is nil.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setProgress:")
    public native void setProgress(@Nullable UIPageControlProgress value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

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
import apple.foundation.NSAttributedString;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.uikit.protocol.UIAccessibilityContentSizeCategoryImageAdjusting;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UISpringLoadedInteractionSupporting;
import apple.uikit.struct.UIEdgeInsets;
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
public class UIButton extends UIControl implements NSCoding, UISpringLoadedInteractionSupporting,
        UIAccessibilityContentSizeCategoryImageAdjusting {
    static {
        NatJ.register();
    }

    @Generated
    protected UIButton(Pointer peer) {
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
    public static native UIButton alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIButton allocWithZone(VoidPtr zone);

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
    public static native UIButton appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIButton appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIButton appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIButton appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIButton appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIButton appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    @Selector("buttonWithType:")
    public static native UIButton buttonWithType(@NInt long buttonType);

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
    public static native UIButton new_objc();

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

    /**
     * default is YES. if YES, image is drawn lighter when disabled
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("adjustsImageWhenDisabled")
    public native boolean adjustsImageWhenDisabled();

    /**
     * default is YES. if YES, image is drawn darker when highlighted(pressed)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("adjustsImageWhenHighlighted")
    public native boolean adjustsImageWhenHighlighted();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UIButton _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIButton _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIButton _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIButton _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIButton _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIButton _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("attributedTitleForState:")
    public native NSAttributedString attributedTitleForState(@NUInt long state);

    @Nullable
    @Generated
    @Selector("backgroundImageForState:")
    public native UIImage backgroundImageForState(@NUInt long state);

    /**
     * These methods will not be called when using a configuration.
     * To change the layout of button content, override -layoutSubviews, call super, and then position views as you see
     * fit.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Override layoutSubviews, call super, and position views as you desire.
     */
    @Deprecated
    @Generated
    @Selector("backgroundRectForBounds:")
    @ByValue
    public native CGRect backgroundRectForBounds(@ByValue CGRect bounds);

    @Generated
    @Selector("buttonType")
    @NInt
    public native long buttonType();

    /**
     * default is UIEdgeInsetsZero. On tvOS 10 or later, default is nonzero except for custom buttons.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("contentEdgeInsets")
    @ByValue
    public native UIEdgeInsets contentEdgeInsets();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Override layoutSubviews, call super, and position views as you desire.
     */
    @Deprecated
    @Generated
    @Selector("contentRectForBounds:")
    @ByValue
    public native CGRect contentRectForBounds(@ByValue CGRect bounds);

    /**
     * normal/highlighted/selected/disabled. can return nil
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("currentAttributedTitle")
    public native NSAttributedString currentAttributedTitle();

    /**
     * normal/highlighted/selected/disabled. can return nil
     */
    @Nullable
    @Generated
    @Selector("currentBackgroundImage")
    public native UIImage currentBackgroundImage();

    /**
     * normal/highlighted/selected/disabled. can return nil
     */
    @Nullable
    @Generated
    @Selector("currentImage")
    public native UIImage currentImage();

    /**
     * normal/highlighted/selected/disabled. can return nil
     */
    @Nullable
    @Generated
    @Selector("currentTitle")
    public native String currentTitle();

    /**
     * normal/highlighted/selected/disabled. always returns non-nil. default is white(1,1)
     */
    @NotNull
    @Generated
    @Selector("currentTitleColor")
    public native UIColor currentTitleColor();

    /**
     * normal/highlighted/selected/disabled.
     */
    @Nullable
    @Generated
    @Selector("currentTitleShadowColor")
    public native UIColor currentTitleShadowColor();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a custom font
     */
    @NotNull
    @Generated
    @Deprecated
    @Selector("font")
    public native UIFont font();

    /**
     * default is UIEdgeInsetsZero
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("imageEdgeInsets")
    @ByValue
    public native UIEdgeInsets imageEdgeInsets();

    @Nullable
    @Generated
    @Selector("imageForState:")
    public native UIImage imageForState(@NUInt long state);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Override layoutSubviews, call super, and position views as you desire.
     */
    @Deprecated
    @Generated
    @Selector("imageRectForContentRect:")
    @ByValue
    public native CGRect imageRectForContentRect(@ByValue CGRect contentRect);

    /**
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("imageView")
    public native UIImageView imageView();

    @Generated
    @Selector("init")
    public native UIButton init();

    @Generated
    @Selector("initWithCoder:")
    public native UIButton initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIButton initWithFrame(@ByValue CGRect frame);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a customized paragraph style
     */
    @Generated
    @Deprecated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * default is NO. if YES, shadow reverses to shift between engrave and emboss appearance
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("reversesTitleShadowWhenHighlighted")
    public native boolean reversesTitleShadowWhenHighlighted();

    /**
     * default is YES. if YES, image is drawn lighter when disabled
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("setAdjustsImageWhenDisabled:")
    public native void setAdjustsImageWhenDisabled(boolean value);

    /**
     * default is YES. if YES, image is drawn darker when highlighted(pressed)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("setAdjustsImageWhenHighlighted:")
    public native void setAdjustsImageWhenHighlighted(boolean value);

    /**
     * default is nil. title is assumed to be single line
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAttributedTitle:forState:")
    public native void setAttributedTitleForState(@Nullable NSAttributedString title, @NUInt long state);

    /**
     * default is nil
     */
    @Generated
    @Selector("setBackgroundImage:forState:")
    public native void setBackgroundImageForState(@Nullable UIImage image, @NUInt long state);

    /**
     * default is UIEdgeInsetsZero. On tvOS 10 or later, default is nonzero except for custom buttons.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("setContentEdgeInsets:")
    public native void setContentEdgeInsets(@ByValue UIEdgeInsets value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a custom font
     */
    @Generated
    @Deprecated
    @Selector("setFont:")
    public native void setFont(@NotNull UIFont value);

    /**
     * default is nil. should be same size if different for different states
     */
    @Generated
    @Selector("setImage:forState:")
    public native void setImageForState(@Nullable UIImage image, @NUInt long state);

    /**
     * default is UIEdgeInsetsZero
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("setImageEdgeInsets:")
    public native void setImageEdgeInsets(@ByValue UIEdgeInsets value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a customized paragraph style
     */
    @Generated
    @Deprecated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * default is NO. if YES, shadow reverses to shift between engrave and emboss appearance
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration, you may customize to replicate
     * this behavior via a configurationUpdateHandler
     */
    @Deprecated
    @Generated
    @Selector("setReversesTitleShadowWhenHighlighted:")
    public native void setReversesTitleShadowWhenHighlighted(boolean value);

    /**
     * These properties are ignored when a configuration is set and have no replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("setShowsTouchWhenHighlighted:")
    public native void setShowsTouchWhenHighlighted(boolean value);

    /**
     * The tintColor is inherited through the superview hierarchy. See UIView for more information.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    /**
     * default is nil. title is assumed to be single line
     */
    @Generated
    @Selector("setTitle:forState:")
    public native void setTitleForState(@Nullable String title, @NUInt long state);

    /**
     * default is nil. use opaque white
     */
    @Generated
    @Selector("setTitleColor:forState:")
    public native void setTitleColorForState(@Nullable UIColor color, @NUInt long state);

    /**
     * default is UIEdgeInsetsZero
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("setTitleEdgeInsets:")
    public native void setTitleEdgeInsets(@ByValue UIEdgeInsets value);

    /**
     * default is nil. use 50% black
     */
    @Generated
    @Selector("setTitleShadowColor:forState:")
    public native void setTitleShadowColorForState(@Nullable UIColor color, @NUInt long state);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a customized shadow style
     */
    @Generated
    @Deprecated
    @Selector("setTitleShadowOffset:")
    public native void setTitleShadowOffset(@ByValue CGSize value);

    /**
     * These properties are ignored when a configuration is set and have no replacement.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("showsTouchWhenHighlighted")
    public native boolean showsTouchWhenHighlighted();

    /**
     * The tintColor is inherited through the superview hierarchy. See UIView for more information.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    @Nullable
    @Generated
    @Selector("titleColorForState:")
    public native UIColor titleColorForState(@NUInt long state);

    /**
     * default is UIEdgeInsetsZero
     * 
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: This property is ignored when using UIButtonConfiguration
     */
    @Deprecated
    @Generated
    @Selector("titleEdgeInsets")
    @ByValue
    public native UIEdgeInsets titleEdgeInsets();

    /**
     * these getters only take a single state value
     */
    @Nullable
    @Generated
    @Selector("titleForState:")
    public native String titleForState(@NUInt long state);

    /**
     * return title and image views. will always create them if necessary. always returns nil for system buttons
     * 
     * API-Since: 3.0
     */
    @Nullable
    @Generated
    @Selector("titleLabel")
    public native UILabel titleLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: Override layoutSubviews, call super, and position views as you desire.
     */
    @Deprecated
    @Generated
    @Selector("titleRectForContentRect:")
    @ByValue
    public native CGRect titleRectForContentRect(@ByValue CGRect contentRect);

    @Nullable
    @Generated
    @Selector("titleShadowColorForState:")
    public native UIColor titleShadowColorForState(@NUInt long state);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 3.0
     * Deprecated-Message: Specify an attributed title with a customized shadow style
     */
    @Generated
    @Deprecated
    @Selector("titleShadowOffset")
    @ByValue
    public native CGSize titleShadowOffset();

    @Generated
    @Selector("adjustsImageSizeForAccessibilityContentSizeCategory")
    public native boolean adjustsImageSizeForAccessibilityContentSizeCategory();

    @Generated
    @Selector("isSpringLoaded")
    public native boolean isSpringLoaded();

    @Generated
    @Selector("setAdjustsImageSizeForAccessibilityContentSizeCategory:")
    public native void setAdjustsImageSizeForAccessibilityContentSizeCategory(boolean value);

    @Generated
    @Selector("setSpringLoaded:")
    public native void setSpringLoaded(boolean value);

    /**
     * normal/highlighted/selected/disabled. can return nil
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("currentPreferredSymbolConfiguration")
    public native UIImageSymbolConfiguration currentPreferredSymbolConfiguration();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("preferredSymbolConfigurationForImageInState:")
    public native UIImageSymbolConfiguration preferredSymbolConfigurationForImageInState(@NUInt long state);

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("setPreferredSymbolConfiguration:forImageInState:")
    public native void setPreferredSymbolConfigurationForImageInState(
            @Nullable UIImageSymbolConfiguration configuration, @NUInt long state);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("systemButtonWithImage:target:action:")
    public static native UIButton systemButtonWithImageTargetAction(@NotNull UIImage image,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action);

    /**
     * Enables this button's built-in pointer interaction.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("isPointerInteractionEnabled")
    public native boolean isPointerInteractionEnabled();

    /**
     * Called when the system pointer hovers over this button if its pointer interaction is enabled. The
     * system calls this block with a proposed UIPointerEffect and UIPointerShape. You may use them to construct
     * a customized version of the system provided style or return an entirely custom one.
     * Setting this property automatically enables the button's pointer interaction and sets @c
     * pointerInteractionEnabled to true.
     * 
     * API-Since: 13.4
     */
    @Nullable
    @Generated
    @Selector("pointerStyleProvider")
    @ObjCBlock(name = "call_pointerStyleProvider_ret")
    public native Block_pointerStyleProvider_ret pointerStyleProvider();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pointerStyleProvider_ret {
        @Nullable
        @Generated
        UIPointerStyle call_pointerStyleProvider_ret(@NotNull UIButton button, @NotNull UIPointerEffect proposedEffect,
                @NotNull UIPointerShape proposedShape);
    }

    /**
     * Enables this button's built-in pointer interaction.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("setPointerInteractionEnabled:")
    public native void setPointerInteractionEnabled(boolean value);

    /**
     * Called when the system pointer hovers over this button if its pointer interaction is enabled. The
     * system calls this block with a proposed UIPointerEffect and UIPointerShape. You may use them to construct
     * a customized version of the system provided style or return an entirely custom one.
     * Setting this property automatically enables the button's pointer interaction and sets @c
     * pointerInteractionEnabled to true.
     * 
     * API-Since: 13.4
     */
    @Generated
    @Selector("setPointerStyleProvider:")
    public native void setPointerStyleProvider(
            @Nullable @ObjCBlock(name = "call_setPointerStyleProvider") Block_setPointerStyleProvider value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPointerStyleProvider {
        @Nullable
        @Generated
        UIPointerStyle call_setPointerStyleProvider(@NotNull UIButton button, @NotNull UIPointerEffect proposedEffect,
                @NotNull UIPointerShape proposedShape);
    }

    /**
     * Creates a button of the given type, registers primaryAction for the UIControlEventPrimaryActionTriggered control
     * event, and if appropriate uses primaryAction's title & image as the button's title & image.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("buttonWithType:primaryAction:")
    public static native UIButton buttonWithTypePrimaryAction(@NInt long buttonType, @Nullable UIAction primaryAction);

    /**
     * Initializes a custom button, registers primaryAction for the UIControlEventPrimaryActionTriggered control event,
     * and uses primaryAction's title & image as the button's title & image.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithFrame:primaryAction:")
    public native UIButton initWithFramePrimaryAction(@ByValue CGRect frame, @Nullable UIAction primaryAction);

    /**
     * An optional menu for the button to display. The button will automatically enable or disable its
     * contextMenuInteraction when a non-nil or nil menu is set. Defaults to nil.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("menu")
    public native UIMenu menu();

    /**
     * default is UIButtonRoleNormal.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("role")
    @NInt
    public native long role();

    /**
     * An optional menu for the button to display. The button will automatically enable or disable its
     * contextMenuInteraction when a non-nil or nil menu is set. Defaults to nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setMenu:")
    public native void setMenu(@Nullable UIMenu value);

    /**
     * default is UIButtonRoleNormal.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setRole:")
    public native void setRole(@NInt long value);

    /**
     * Creates a system button, registers primaryAction for the UIControlEventPrimaryActionTriggered control event, and
     * uses primaryAction's title & image as the button's title & image.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("systemButtonWithPrimaryAction:")
    public static native UIButton systemButtonWithPrimaryAction(@Nullable UIAction primaryAction);

    /**
     * When YES, the button will automatically call -updatedConfigurationForButton: on its `configuration ` when the
     * button's state changes, and apply the updated configuration to the button. The default value is YES.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("automaticallyUpdatesConfiguration")
    public native boolean automaticallyUpdatesConfiguration();

    /**
     * The button's behavioral style. This property always returns a concrete, resolved style (never
     * UIBehavioralStyleAutomatic).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("behavioralStyle")
    @NUInt
    public native long behavioralStyle();

    /**
     * Construct a new UIButton. `configuration` will be installed on the created button, and `primaryAction` added to
     * handle the .primaryActionTriggered control event. If `primaryAction` has a title or image, they will be copied to
     * `configuration`
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("buttonWithConfiguration:primaryAction:")
    public static native UIButton buttonWithConfigurationPrimaryAction(@NotNull UIButtonConfiguration configuration,
            @Nullable UIAction primaryAction);

    /**
     * Indicates if the button changes selection as its primary action.
     * This shows the menu as options for selection if a menu is populated and showsMenuAsPrimaryAction is enabled.
     * If no menu is provided or it is not the primary action, UIControlStateSelected is toggled on and off for the
     * primary action.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("changesSelectionAsPrimaryAction")
    public native boolean changesSelectionAsPrimaryAction();

    /**
     * Setting a non-nil value for `configuration` will opt into configuration-based behavior on UIButton, update the
     * button in a platform specific manner, and enable/disable some API.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("configuration")
    public native UIButtonConfiguration configuration();

    /**
     * Block-based equivalent to overriding -updateConfiguration in a subclass. Setting this handler will force the
     * button into configuration-based behavior (see the `configuration` property). This block is called after
     * `-updateConfiguration`
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("configurationUpdateHandler")
    @ObjCBlock(name = "call_configurationUpdateHandler_ret")
    public native Block_configurationUpdateHandler_ret configurationUpdateHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationUpdateHandler_ret {
        @Generated
        void call_configurationUpdateHandler_ret(@NotNull UIButton button);
    }

    /**
     * Returns true while the button is presenting a menu.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isHeld")
    public native boolean isHeld();

    /**
     * If pointer effects are enabled for the button, this will return true when an effect is active.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("isHovered")
    public native boolean isHovered();

    /**
     * Request a style for the button. If the style changed, the button will redraw and its metrics may change.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("preferredBehavioralStyle")
    @NUInt
    public native long preferredBehavioralStyle();

    /**
     * When YES, the button will automatically call -updatedConfigurationForButton: on its `configuration ` when the
     * button's state changes, and apply the updated configuration to the button. The default value is YES.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setAutomaticallyUpdatesConfiguration:")
    public native void setAutomaticallyUpdatesConfiguration(boolean value);

    /**
     * Indicates if the button changes selection as its primary action.
     * This shows the menu as options for selection if a menu is populated and showsMenuAsPrimaryAction is enabled.
     * If no menu is provided or it is not the primary action, UIControlStateSelected is toggled on and off for the
     * primary action.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setChangesSelectionAsPrimaryAction:")
    public native void setChangesSelectionAsPrimaryAction(boolean value);

    /**
     * Setting a non-nil value for `configuration` will opt into configuration-based behavior on UIButton, update the
     * button in a platform specific manner, and enable/disable some API.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setConfiguration:")
    public native void setConfiguration(@Nullable UIButtonConfiguration value);

    /**
     * Block-based equivalent to overriding -updateConfiguration in a subclass. Setting this handler will force the
     * button into configuration-based behavior (see the `configuration` property). This block is called after
     * `-updateConfiguration`
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(
            @Nullable @ObjCBlock(name = "call_setConfigurationUpdateHandler") Block_setConfigurationUpdateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConfigurationUpdateHandler {
        @Generated
        void call_setConfigurationUpdateHandler(@NotNull UIButton button);
    }

    /**
     * Requests the view update its configuration for its current state. This method is called automatically when the
     * button's state may have changed, as well as in other circumstances where an update may be required. Multiple
     * requests may be coalesced into a single update at the appropriate time.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();

    /**
     * Request a style for the button. If the style changed, the button will redraw and its metrics may change.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setPreferredBehavioralStyle:")
    public native void setPreferredBehavioralStyle(@NUInt long value);

    /**
     * The label used to display the subtitle, when present.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("subtitleLabel")
    public native UILabel subtitleLabel();

    /**
     * Subclasses should override this method and update the button's `configuration`. This method should not be called
     * directly, use `setNeedsUpdateConfiguration` to request an update.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("updateConfiguration")
    public native void updateConfiguration();

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
     * Preferred menu element ordering strategy for menus displayed by this button.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreferredMenuElementOrder:")
    public native void setPreferredMenuElementOrder(@NInt long value);

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

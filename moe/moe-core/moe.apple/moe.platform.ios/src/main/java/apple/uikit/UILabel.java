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
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UIContentSizeCategoryAdjusting;
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
import apple.uikit.protocol.UILetterformAwareAdjusting;

/**
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UILabel extends UIView implements NSCoding, UIContentSizeCategoryAdjusting, UILetterformAwareAdjusting {
    static {
        NatJ.register();
    }

    @Generated
    protected UILabel(Pointer peer) {
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
    public static native UILabel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UILabel allocWithZone(VoidPtr zone);

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
    public static native UILabel appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UILabel appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UILabel appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UILabel appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UILabel appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UILabel appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UILabel new_objc();

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

    @Generated
    @Selector("adjustsFontForContentSizeCategory")
    public native boolean adjustsFontForContentSizeCategory();

    /**
     * default is NO
     */
    @Generated
    @Selector("adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();

    /**
     * Non-functional. Hand tune by using NSKernAttributeName to affect tracking, or consider using the
     * allowsDefaultTighteningForTruncation property.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("adjustsLetterSpacingToFitWidth")
    public native boolean adjustsLetterSpacingToFitWidth();

    /**
     * default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UILabel _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UILabel _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UILabel _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UILabel _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UILabel _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UILabel _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * default is nil
     * 
     * API-Since: 6.0
     */
    @Nullable
    @Generated
    @Selector("attributedText")
    public native NSAttributedString attributedText();

    /**
     * default is UIBaselineAdjustmentAlignBaselines
     */
    @Generated
    @Selector("baselineAdjustment")
    @NInt
    public native long baselineAdjustment();

    @Generated
    @Selector("drawTextInRect:")
    public native void drawTextInRect(@ByValue CGRect rect);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * default is nil (system font 17 plain)
     */
    @Generated
    @Selector("font")
    public native UIFont font();

    /**
     * default is nil
     */
    @Nullable
    @Generated
    @Selector("highlightedTextColor")
    public native UIColor highlightedTextColor();

    @Generated
    @Selector("init")
    public native UILabel init();

    @Generated
    @Selector("initWithCoder:")
    public native UILabel initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UILabel initWithFrame(@ByValue CGRect frame);

    /**
     * default is YES. changes how the label is drawn
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * default is YES. changes how the label is drawn
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * default is NO
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    /**
     * default is NO
     */
    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    /**
     * default is NSLineBreakByTruncatingTail. used for single and multiple lines of text
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * deprecated - use minimumScaleFactor. default is 0.0
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("minimumFontSize")
    @NFloat
    public native double minimumFontSize();

    /**
     * default is 0.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("minimumScaleFactor")
    @NFloat
    public native double minimumScaleFactor();

    /**
     * this determines the number of lines to draw and what to do when sizeToFit is called. default value is 1 (single
     * line). A value of 0 means no limit
     * if the height of the text reaches the # of lines or the height of the view is less than the # of lines allowed,
     * the text will be
     * truncated using the line break mode.
     */
    @Generated
    @Selector("numberOfLines")
    @NInt
    public native long numberOfLines();

    /**
     * Support for constraint-based layout (auto layout)
     * If nonzero, this is used when determining -intrinsicContentSize for multiline labels
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("preferredMaxLayoutWidth")
    @NFloat
    public native double preferredMaxLayoutWidth();

    @Generated
    @Selector("setAdjustsFontForContentSizeCategory:")
    public native void setAdjustsFontForContentSizeCategory(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean value);

    /**
     * Non-functional. Hand tune by using NSKernAttributeName to affect tracking, or consider using the
     * allowsDefaultTighteningForTruncation property.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("setAdjustsLetterSpacingToFitWidth:")
    public native void setAdjustsLetterSpacingToFitWidth(boolean value);

    /**
     * default is NO
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean value);

    /**
     * default is nil
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setAttributedText:")
    public native void setAttributedText(@Nullable NSAttributedString value);

    /**
     * default is UIBaselineAdjustmentAlignBaselines
     */
    @Generated
    @Selector("setBaselineAdjustment:")
    public native void setBaselineAdjustment(@NInt long value);

    /**
     * default is nil (system font 17 plain)
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(UIFont value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setHighlightedTextColor:")
    public native void setHighlightedTextColor(@Nullable UIColor value);

    /**
     * default is NSLineBreakByTruncatingTail. used for single and multiple lines of text
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * deprecated - use minimumScaleFactor. default is 0.0
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("setMinimumFontSize:")
    public native void setMinimumFontSize(@NFloat double value);

    /**
     * default is 0.0
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@NFloat double value);

    /**
     * this determines the number of lines to draw and what to do when sizeToFit is called. default value is 1 (single
     * line). A value of 0 means no limit
     * if the height of the text reaches the # of lines or the height of the view is less than the # of lines allowed,
     * the text will be
     * truncated using the line break mode.
     */
    @Generated
    @Selector("setNumberOfLines:")
    public native void setNumberOfLines(@NInt long value);

    /**
     * Support for constraint-based layout (auto layout)
     * If nonzero, this is used when determining -intrinsicContentSize for multiline labels
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@NFloat double value);

    /**
     * default is nil (no shadow)
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Nullable UIColor value);

    /**
     * default is CGSizeMake(0, -1) -- a top shadow
     */
    @Generated
    @Selector("setShadowOffset:")
    public native void setShadowOffset(@ByValue CGSize value);

    /**
     * default is nil
     */
    @Generated
    @Selector("setText:")
    public native void setText(@Nullable String value);

    /**
     * default is NSTextAlignmentNatural (before iOS 9, the default was NSTextAlignmentLeft)
     */
    @Generated
    @Selector("setTextAlignment:")
    public native void setTextAlignment(@NInt long value);

    /**
     * default is labelColor
     */
    @Generated
    @Selector("setTextColor:")
    public native void setTextColor(UIColor value);

    /**
     * default is nil (no shadow)
     */
    @Nullable
    @Generated
    @Selector("shadowColor")
    public native UIColor shadowColor();

    /**
     * default is CGSizeMake(0, -1) -- a top shadow
     */
    @Generated
    @Selector("shadowOffset")
    @ByValue
    public native CGSize shadowOffset();

    /**
     * default is nil
     */
    @Nullable
    @Generated
    @Selector("text")
    public native String text();

    /**
     * default is NSTextAlignmentNatural (before iOS 9, the default was NSTextAlignmentLeft)
     */
    @Generated
    @Selector("textAlignment")
    @NInt
    public native long textAlignment();

    /**
     * default is labelColor
     */
    @Generated
    @Selector("textColor")
    public native UIColor textColor();

    /**
     * override points. can adjust rect before calling super.
     * label has default content mode of UIViewContentModeRedraw
     */
    @Generated
    @Selector("textRectForBounds:limitedToNumberOfLines:")
    @ByValue
    public native CGRect textRectForBoundsLimitedToNumberOfLines(@ByValue CGRect bounds, @NInt long numberOfLines);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Specifies the line break strategies that may be used for laying out the text in this label.
     * If this property is not set, the default value is NSLineBreakStrategyStandard.
     * If the label contains an attributed text with paragraph style(s) that specify a set of line break strategies, the
     * set of strategies in the paragraph style(s) will be used instead of the set of strategies defined by this
     * property.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("lineBreakStrategy")
    @NUInt
    public native long lineBreakStrategy();

    /**
     * Specifies the line break strategies that may be used for laying out the text in this label.
     * If this property is not set, the default value is NSLineBreakStrategyStandard.
     * If the label contains an attributed text with paragraph style(s) that specify a set of line break strategies, the
     * set of strategies in the paragraph style(s) will be used instead of the set of strategies defined by this
     * property.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setLineBreakStrategy:")
    public native void setLineBreakStrategy(@NUInt long value);

    /**
     * Indicates whether expansion text will be shown when the view is too small to show all the contents. Defaults to
     * NO.
     */
    @Generated
    @Selector("setShowsExpansionTextWhenTruncated:")
    public native void setShowsExpansionTextWhenTruncated(boolean value);

    /**
     * Indicates whether expansion text will be shown when the view is too small to show all the contents. Defaults to
     * NO.
     */
    @Generated
    @Selector("showsExpansionTextWhenTruncated")
    public native boolean showsExpansionTextWhenTruncated();

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    /**
     * Controls whether a label becomes vibrant automatically.
     * 
     * If a label has a vibrancy mode other than `None` set, the system tries
     * to apply vibrancy automatically to that label. This will only succeed if
     * the label is in a context that allows vibrancy, which in general means the
     * the label needs to be on top of a blurred material.
     * 
     * This property can only be used to opt-in to automatic vibrancy. It is not
     * a way to opt-out of vibrancy that is enabled by other means. A label
     * placed in a vibrant `UIVisualEffectView` with preferred vibrancy `None` will
     * still be vibrant.
     * 
     * The default is `automatic` on xrOS and `none` on all other platforms.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("preferredVibrancy")
    @NInt
    public native long preferredVibrancy();

    /**
     * Controls whether a label becomes vibrant automatically.
     * 
     * If a label has a vibrancy mode other than `None` set, the system tries
     * to apply vibrancy automatically to that label. This will only succeed if
     * the label is in a context that allows vibrancy, which in general means the
     * the label needs to be on top of a blurred material.
     * 
     * This property can only be used to opt-in to automatic vibrancy. It is not
     * a way to opt-out of vibrancy that is enabled by other means. A label
     * placed in a vibrant `UIVisualEffectView` with preferred vibrancy `None` will
     * still be vibrant.
     * 
     * The default is `automatic` on xrOS and `none` on all other platforms.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setPreferredVibrancy:")
    public native void setPreferredVibrancy(@NInt long value);

    @Generated
    @Selector("setSizingRule:")
    public native void setSizingRule(@NInt long value);

    @Generated
    @Selector("sizingRule")
    @NInt
    public native long sizingRule();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

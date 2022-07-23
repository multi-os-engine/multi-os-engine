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

/**
 * UIStackView is a non-rendering subclass of UIView, intended for managing layout of its subviews.
 * You may not override +[UIStackView layerClass], and -drawLayer:inContext: will not be sent to
 * UIStackView.
 * <p>
 * UIStackView arranges its subviews in its arrangedSubviews list in the order of
 * that list along a vertical or horizontal axis, with exact arrangement determined
 * by the distribution, alignment, and spacing properties.
 * <p>
 * The layout will update automatically when arrangedSubviews list changes
 * due to adding, removing, or inserting arrangedSubviews, and also when
 * views in the arrangedSubviews list change their hidden property.
 * <p>
 * A horizontal UIStackView will return its tallest view for -viewForFirst/LastBaselineLayout,
 * or if that is another stack view, then the relevant viewForFirst/LastBaselineLayout from that
 * stack view.
 * <p>
 * A vertical UIStackView will return its first view for -viewForFirstBaselineLayout and its
 * last view for -viewForLastBaselineLayout, or if that is another stack view, then the relevant
 * viewForFirst/LastBaselineLayout from that stack view.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIStackView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected UIStackView(Pointer peer) {
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
    public static native UIStackView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIStackView allocWithZone(VoidPtr zone);

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
    public static native UIStackView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIStackView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIStackView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIStackView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIStackView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIStackView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    public static native UIStackView new_objc();

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

    /**
     * Add a view to the end of the arrangedSubviews list.
     * Maintains the rule that the arrangedSubviews list is a subset of the
     * subviews list by adding the view as a subview of the receiver if
     * necessary.
     * Does not affect the subview ordering if view is already a subview
     * of the receiver.
     */
    @Generated
    @Selector("addArrangedSubview:")
    public native void addArrangedSubview(UIView view);

    /**
     * The layout of the arrangedSubviews transverse to the axis;
     * e.g., leading/trailing edges in a vertical stack
     */
    @Generated
    @Selector("alignment")
    @NInt
    public native long alignment();

    @Generated
    @ProtocolClassMethod("appearance")
    public UIStackView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIStackView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIStackView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIStackView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIStackView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIStackView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("arrangedSubviews")
    public native NSArray<? extends UIView> arrangedSubviews();

    /**
     * A stack with a horizontal axis is a row of arrangedSubviews,
     * and a stack with a vertical axis is a column of arrangedSubviews.
     */
    @Generated
    @Selector("axis")
    @NInt
    public native long axis();

    /**
     * The layout of the arrangedSubviews along the axis
     */
    @Generated
    @Selector("distribution")
    @NInt
    public native long distribution();

    @Generated
    @Selector("init")
    public native UIStackView init();

    /**
     * Adds views as subviews of the receiver.
     */
    @Generated
    @Selector("initWithArrangedSubviews:")
    public native UIStackView initWithArrangedSubviews(NSArray<? extends UIView> views);

    @Generated
    @Selector("initWithCoder:")
    public native UIStackView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIStackView initWithFrame(@ByValue CGRect frame);

    /**
     * Adds the view as a subview of the container if it isn't already.
     * Updates the stack index (but not the subview index) of the
     * arranged subview if it's already in the arrangedSubviews list.
     */
    @Generated
    @Selector("insertArrangedSubview:atIndex:")
    public native void insertArrangedSubviewAtIndex(UIView view, @NUInt long stackIndex);

    /**
     * Baseline-to-baseline spacing in vertical stacks.
     * The baselineRelativeArrangement property supports specifications of vertical
     * space from the last baseline of one text-based view to the first baseline of a
     * text-based view below, or from the top (or bottom) of a container to the first
     * (or last) baseline of a contained text-based view.
     * This property is ignored in horizontal stacks. Use the alignment property
     * to specify baseline alignment in horizontal stacks.
     * Defaults to NO.
     */
    @Generated
    @Selector("isBaselineRelativeArrangement")
    public native boolean isBaselineRelativeArrangement();

    /**
     * Baseline-to-baseline spacing in vertical stacks.
     * The baselineRelativeArrangement property supports specifications of vertical
     * space from the last baseline of one text-based view to the first baseline of a
     * text-based view below, or from the top (or bottom) of a container to the first
     * (or last) baseline of a contained text-based view.
     * This property is ignored in horizontal stacks. Use the alignment property
     * to specify baseline alignment in horizontal stacks.
     * Defaults to NO.
     */
    @Generated
    @Selector("setBaselineRelativeArrangement:")
    public native void setBaselineRelativeArrangement(boolean value);

    /**
     * Uses margin layout attributes for edge constraints where applicable.
     * Defaults to NO.
     */
    @Generated
    @Selector("isLayoutMarginsRelativeArrangement")
    public native boolean isLayoutMarginsRelativeArrangement();

    /**
     * Uses margin layout attributes for edge constraints where applicable.
     * Defaults to NO.
     */
    @Generated
    @Selector("setLayoutMarginsRelativeArrangement:")
    public native void setLayoutMarginsRelativeArrangement(boolean value);

    /**
     * Removes a subview from the list of arranged subviews without removing it as
     * a subview of the receiver.
     * To remove the view as a subview, send it -removeFromSuperview as usual;
     * the relevant UIStackView will remove it from its arrangedSubviews list
     * automatically.
     */
    @Generated
    @Selector("removeArrangedSubview:")
    public native void removeArrangedSubview(UIView view);

    /**
     * The layout of the arrangedSubviews transverse to the axis;
     * e.g., leading/trailing edges in a vertical stack
     */
    @Generated
    @Selector("setAlignment:")
    public native void setAlignment(@NInt long value);

    /**
     * A stack with a horizontal axis is a row of arrangedSubviews,
     * and a stack with a vertical axis is a column of arrangedSubviews.
     */
    @Generated
    @Selector("setAxis:")
    public native void setAxis(@NInt long value);

    /**
     * The layout of the arrangedSubviews along the axis
     */
    @Generated
    @Selector("setDistribution:")
    public native void setDistribution(@NInt long value);

    /**
     * Spacing between adjacent edges of arrangedSubviews.
     * Used as a strict spacing for the Fill distributions, and
     * as a minimum spacing for the EqualCentering and EqualSpacing
     * distributions. Use negative values to allow overlap.
     * <p>
     * On iOS 11.0 or later, use UIStackViewSpacingUseSystem (Swift: UIStackView.spacingUseSystem)
     * to get a system standard spacing value. Setting spacing to UIStackViewSpacingUseDefault
     * (Swift: UIStackView.spacingUseDefault) will result in a spacing of 0.
     * <p>
     * System spacing between views depends on the views involved, and may vary across the
     * stack view.
     * <p>
     * In vertical stack views with baselineRelativeArrangement == YES, the spacing between
     * text-containing views (such as UILabels) will depend on the fonts involved.
     */
    @Generated
    @Selector("setSpacing:")
    public native void setSpacing(@NFloat double value);

    /**
     * Spacing between adjacent edges of arrangedSubviews.
     * Used as a strict spacing for the Fill distributions, and
     * as a minimum spacing for the EqualCentering and EqualSpacing
     * distributions. Use negative values to allow overlap.
     * <p>
     * On iOS 11.0 or later, use UIStackViewSpacingUseSystem (Swift: UIStackView.spacingUseSystem)
     * to get a system standard spacing value. Setting spacing to UIStackViewSpacingUseDefault
     * (Swift: UIStackView.spacingUseDefault) will result in a spacing of 0.
     * <p>
     * System spacing between views depends on the views involved, and may vary across the
     * stack view.
     * <p>
     * In vertical stack views with baselineRelativeArrangement == YES, the spacing between
     * text-containing views (such as UILabels) will depend on the fonts involved.
     */
    @Generated
    @Selector("spacing")
    @NFloat
    public native double spacing();

    @Generated
    @Selector("customSpacingAfterView:")
    @NFloat
    public native double customSpacingAfterView(UIView arrangedSubview);

    /**
     * Set and get custom spacing after a view.
     * <p>
     * This custom spacing takes precedence over any other value that might otherwise be used
     * for the space following the arranged subview.
     * <p>
     * Defaults to UIStackViewSpacingUseDefault (Swift: UIStackView.spacingUseDefault), where
     * resolved value will match the spacing property.
     * <p>
     * You may also set the custom spacing to UIStackViewSpacingUseSystem (Swift: UIStackView.spacingUseSystem),
     * where the resolved value will match the system-defined value for the space to the neighboring view,
     * independent of the spacing property.
     * <p>
     * Maintained when the arranged subview changes position in the stack view, but not after it
     * is removed from the arrangedSubviews list.
     * <p>
     * Ignored if arrangedSubview is not actually an arranged subview.
     */
    @Generated
    @Selector("setCustomSpacing:afterView:")
    public native void setCustomSpacingAfterView(@NFloat double spacing, UIView arrangedSubview);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);
}

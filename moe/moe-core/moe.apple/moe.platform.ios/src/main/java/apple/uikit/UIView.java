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
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCoding;
import apple.quartzcore.CALayer;
import apple.quartzcore.protocol.CAAction;
import apple.quartzcore.protocol.CALayerDelegate;
import apple.quartzcore.struct.CATransform3D;
import apple.uikit.protocol.UIAccessibilityIdentification;
import apple.uikit.protocol.UIAppearance;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UICoordinateSpace;
import apple.uikit.protocol.UIDynamicItem;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UIFocusItem;
import apple.uikit.protocol.UIFocusItemContainer;
import apple.uikit.protocol.UIInteraction;
import apple.uikit.protocol.UILargeContentViewerItem;
import apple.uikit.protocol.UITraitEnvironment;
import apple.uikit.struct.NSDirectionalEdgeInsets;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIView extends UIResponder
        implements NSCoding, UIAppearance, UIAppearanceContainer, UIDynamicItem, UITraitEnvironment, UICoordinateSpace,
        UIFocusItem, UIFocusItemContainer, CALayerDelegate, UIAccessibilityIdentification, UILargeContentViewerItem {
    static {
        NatJ.register();
    }

    @Generated
    protected UIView(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIView alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") Block_animateWithDurationAnimations animations);

    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") Block_animateWithDurationAnimationsCompletion_2 completion);

    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

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
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

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
    public static native Object appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

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
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") Block_performWithoutAnimation actionsWithoutAnimation);

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
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") Block_transitionFromViewToViewDurationOptionsCompletion completion);

    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

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
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    @Generated
    @IsOptional
    @Selector("actionForLayer:forKey:")
    @MappedReturn(ObjCObjectMapper.class)
    public native CAAction actionForLayerForKey(CALayer layer, String event);

    @Generated
    @Selector("addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);

    @Generated
    @Selector("addConstraints:")
    public native void addConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    @Generated
    @Selector("addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    @Generated
    @Selector("addLayoutGuide:")
    public native void addLayoutGuide(UILayoutGuide layoutGuide);

    @Generated
    @Selector("addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);

    @Generated
    @Selector("addSubview:")
    public native void addSubview(UIView view);

    @Generated
    @Selector("alignmentRectForFrame:")
    @ByValue
    public native CGRect alignmentRectForFrame(@ByValue CGRect frame);

    @Generated
    @Selector("alignmentRectInsets")
    @ByValue
    public native UIEdgeInsets alignmentRectInsets();

    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

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
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
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
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("autoresizesSubviews")
    public native boolean autoresizesSubviews();

    @Generated
    @Selector("autoresizingMask")
    @NUInt
    public native long autoresizingMask();

    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("bottomAnchor")
    public native NSLayoutYAxisAnchor bottomAnchor();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    @Generated
    @Selector("bringSubviewToFront:")
    public native void bringSubviewToFront(UIView view);

    @Generated
    @Selector("canBecomeFocused")
    public native boolean canBecomeFocused();

    @Generated
    @Selector("center")
    @ByValue
    public native CGPoint center();

    @Generated
    @Selector("centerXAnchor")
    public native NSLayoutXAxisAnchor centerXAnchor();

    @Generated
    @Selector("centerYAnchor")
    public native NSLayoutYAxisAnchor centerYAnchor();

    @Generated
    @Selector("clearsContextBeforeDrawing")
    public native boolean clearsContextBeforeDrawing();

    @Generated
    @Selector("clipsToBounds")
    public native boolean clipsToBounds();

    @Generated
    @IsOptional
    @Selector("collisionBoundingPath")
    public native UIBezierPath collisionBoundingPath();

    @Generated
    @IsOptional
    @Selector("collisionBoundsType")
    @NUInt
    public native long collisionBoundsType();

    @Generated
    @Selector("constraints")
    public native NSArray<? extends NSLayoutConstraint> constraints();

    @Generated
    @Selector("constraintsAffectingLayoutForAxis:")
    public native NSArray<? extends NSLayoutConstraint> constraintsAffectingLayoutForAxis(@NInt long axis);

    @Generated
    @Selector("contentCompressionResistancePriorityForAxis:")
    public native float contentCompressionResistancePriorityForAxis(@NInt long axis);

    @Generated
    @Selector("contentHuggingPriorityForAxis:")
    public native float contentHuggingPriorityForAxis(@NInt long axis);

    @Generated
    @Selector("contentMode")
    @NInt
    public native long contentMode();

    @Generated
    @Selector("contentScaleFactor")
    @NFloat
    public native double contentScaleFactor();

    @Generated
    @Deprecated
    @Selector("contentStretch")
    @ByValue
    public native CGRect contentStretch();

    @Generated
    @Selector("convertPoint:fromCoordinateSpace:")
    @ByValue
    public native CGPoint convertPointFromCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    @Generated
    @Selector("convertPoint:fromView:")
    @ByValue
    public native CGPoint convertPointFromView(@ByValue CGPoint point, UIView view);

    @Generated
    @Selector("convertPoint:toCoordinateSpace:")
    @ByValue
    public native CGPoint convertPointToCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    @Generated
    @Selector("convertPoint:toView:")
    @ByValue
    public native CGPoint convertPointToView(@ByValue CGPoint point, UIView view);

    @Generated
    @Selector("convertRect:fromCoordinateSpace:")
    @ByValue
    public native CGRect convertRectFromCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    @Generated
    @Selector("convertRect:fromView:")
    @ByValue
    public native CGRect convertRectFromView(@ByValue CGRect rect, UIView view);

    @Generated
    @Selector("convertRect:toCoordinateSpace:")
    @ByValue
    public native CGRect convertRectToCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) UICoordinateSpace coordinateSpace);

    @Generated
    @Selector("convertRect:toView:")
    @ByValue
    public native CGRect convertRectToView(@ByValue CGRect rect, UIView view);

    @Generated
    @Selector("decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("didAddSubview:")
    public native void didAddSubview(UIView subview);

    @Generated
    @Selector("didMoveToSuperview")
    public native void didMoveToSuperview();

    @Generated
    @Selector("didMoveToWindow")
    public native void didMoveToWindow();

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    @Generated
    @IsOptional
    @Selector("displayLayer:")
    public native void displayLayer(CALayer layer);

    @Generated
    @IsOptional
    @Selector("drawLayer:inContext:")
    public native void drawLayerInContext(CALayer layer, CGContextRef ctx);

    @Generated
    @Selector("drawRect:")
    public native void drawRect(@ByValue CGRect rect);

    @Generated
    @Selector("drawRect:forViewPrintFormatter:")
    public native void drawRectForViewPrintFormatter(@ByValue CGRect rect, UIViewPrintFormatter formatter);

    @Generated
    @Selector("drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchyInRectAfterScreenUpdates(@ByValue CGRect rect, boolean afterUpdates);

    @Generated
    @Selector("effectiveUserInterfaceLayoutDirection")
    @NInt
    public native long effectiveUserInterfaceLayoutDirection();

    @Generated
    @Selector("encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("endEditing:")
    public native boolean endEditing(boolean force);

    @Generated
    @Selector("exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubviewAtIndexWithSubviewAtIndex(@NInt long index1, @NInt long index2);

    @Generated
    @Selector("exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();

    @Generated
    @Selector("firstBaselineAnchor")
    public native NSLayoutYAxisAnchor firstBaselineAnchor();

    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    @Generated
    @Selector("frameForAlignmentRect:")
    @ByValue
    public native CGRect frameForAlignmentRect(@ByValue CGRect alignmentRect);

    @Generated
    @Selector("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);

    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    @Generated
    @Selector("hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();

    @Generated
    @Selector("heightAnchor")
    public native NSLayoutDimension heightAnchor();

    @Generated
    @Selector("hitTest:withEvent:")
    public native UIView hitTestWithEvent(@ByValue CGPoint point, UIEvent event);

    @Generated
    @Selector("init")
    public native UIView init();

    @Generated
    @Selector("initWithCoder:")
    public native UIView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("insertSubview:aboveSubview:")
    public native void insertSubviewAboveSubview(UIView view, UIView siblingSubview);

    @Generated
    @Selector("insertSubview:atIndex:")
    public native void insertSubviewAtIndex(UIView view, @NInt long index);

    @Generated
    @Selector("insertSubview:belowSubview:")
    public native void insertSubviewBelowSubview(UIView view, UIView siblingSubview);

    @Generated
    @Selector("intrinsicContentSize")
    @ByValue
    public native CGSize intrinsicContentSize();

    @Generated
    @Selector("invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();

    @Generated
    @Selector("isDescendantOfView:")
    public native boolean isDescendantOfView(UIView view);

    @Generated
    @Selector("isExclusiveTouch")
    public native boolean isExclusiveTouch();

    @Generated
    @Selector("setExclusiveTouch:")
    public native void setExclusiveTouch(boolean value);

    @Generated
    @Selector("isFocused")
    public native boolean isFocused();

    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    @Generated
    @Selector("isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();

    @Generated
    @Selector("setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean value);

    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    @Generated
    @Selector("lastBaselineAnchor")
    public native NSLayoutYAxisAnchor lastBaselineAnchor();

    @Generated
    @Selector("layer")
    public native CALayer layer();

    @Generated
    @IsOptional
    @Selector("layerWillDraw:")
    public native void layerWillDraw(CALayer layer);

    @Generated
    @Selector("layoutGuides")
    public native NSArray<? extends UILayoutGuide> layoutGuides();

    @Generated
    @Selector("layoutIfNeeded")
    public native void layoutIfNeeded();

    @Generated
    @Selector("layoutMargins")
    @ByValue
    public native UIEdgeInsets layoutMargins();

    @Generated
    @Selector("layoutMarginsDidChange")
    public native void layoutMarginsDidChange();

    @Generated
    @Selector("layoutMarginsGuide")
    public native UILayoutGuide layoutMarginsGuide();

    @Generated
    @IsOptional
    @Selector("layoutSublayersOfLayer:")
    public native void layoutSublayersOfLayer(CALayer layer);

    @Generated
    @Selector("layoutSubviews")
    public native void layoutSubviews();

    @Generated
    @Selector("leadingAnchor")
    public native NSLayoutXAxisAnchor leadingAnchor();

    @Generated
    @Selector("leftAnchor")
    public native NSLayoutXAxisAnchor leftAnchor();

    @Generated
    @Selector("maskView")
    public native UIView maskView();

    @Generated
    @Selector("motionEffects")
    public native NSArray<? extends UIMotionEffect> motionEffects();

    @Generated
    @Selector("needsUpdateConstraints")
    public native boolean needsUpdateConstraints();

    @Generated
    @Selector("pointInside:withEvent:")
    public native boolean pointInsideWithEvent(@ByValue CGPoint point, UIEvent event);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("preservesSuperviewLayoutMargins")
    public native boolean preservesSuperviewLayoutMargins();

    @Generated
    @Selector("readableContentGuide")
    public native UILayoutGuide readableContentGuide();

    @Generated
    @Selector("removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);

    @Generated
    @Selector("removeConstraints:")
    public native void removeConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    @Generated
    @Selector("removeFromSuperview")
    public native void removeFromSuperview();

    @Generated
    @Selector("removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    @Generated
    @Selector("removeLayoutGuide:")
    public native void removeLayoutGuide(UILayoutGuide layoutGuide);

    @Generated
    @Selector("removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);

    @Generated
    @Selector("resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView resizableSnapshotViewFromRectAfterScreenUpdatesWithCapInsets(@ByValue CGRect rect,
            boolean afterUpdates, @ByValue UIEdgeInsets capInsets);

    @Generated
    @Selector("restorationIdentifier")
    public native String restorationIdentifier();

    @Generated
    @Selector("rightAnchor")
    public native NSLayoutXAxisAnchor rightAnchor();

    @Generated
    @Selector("semanticContentAttribute")
    @NInt
    public native long semanticContentAttribute();

    @Generated
    @Selector("sendSubviewToBack:")
    public native void sendSubviewToBack(UIView view);

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String value);

    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    @Generated
    @Selector("setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean value);

    @Generated
    @Selector("setAutoresizingMask:")
    public native void setAutoresizingMask(@NUInt long value);

    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    @Generated
    @Selector("setCenter:")
    public native void setCenter(@ByValue CGPoint value);

    @Generated
    @Selector("setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean value);

    @Generated
    @Selector("setClipsToBounds:")
    public native void setClipsToBounds(boolean value);

    @Generated
    @Selector("setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriorityForAxis(float priority, @NInt long axis);

    @Generated
    @Selector("setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriorityForAxis(float priority, @NInt long axis);

    @Generated
    @Selector("setContentMode:")
    public native void setContentMode(@NInt long value);

    @Generated
    @Selector("setContentScaleFactor:")
    public native void setContentScaleFactor(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("setContentStretch:")
    public native void setContentStretch(@ByValue CGRect value);

    @Generated
    @Selector("setFrame:")
    public native void setFrame(@ByValue CGRect value);

    @Generated
    @Selector("setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<? extends UIGestureRecognizer> value);

    @Generated
    @Selector("setLayoutMargins:")
    public native void setLayoutMargins(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setMaskView:")
    public native void setMaskView(UIView value);

    @Generated
    @Selector("setMotionEffects:")
    public native void setMotionEffects(NSArray<? extends UIMotionEffect> value);

    @Generated
    @Selector("setNeedsDisplay")
    public native void setNeedsDisplay();

    @Generated
    @Selector("setNeedsDisplayInRect:")
    public native void setNeedsDisplayInRect(@ByValue CGRect rect);

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    @Generated
    @Selector("setNeedsLayout")
    public native void setNeedsLayout();

    @Generated
    @Selector("setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();

    @Generated
    @Selector("setPreservesSuperviewLayoutMargins:")
    public native void setPreservesSuperviewLayoutMargins(boolean value);

    @Generated
    @Selector("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String value);

    @Generated
    @Selector("setSemanticContentAttribute:")
    public native void setSemanticContentAttribute(@NInt long value);

    @Generated
    @Selector("setTag:")
    public native void setTag(@NInt long value);

    @Generated
    @Selector("setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(@NInt long value);

    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean value);

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("sizeThatFits:")
    @ByValue
    public native CGSize sizeThatFits(@ByValue CGSize size);

    @Generated
    @Selector("sizeToFit")
    public native void sizeToFit();

    @Generated
    @Selector("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates(boolean afterUpdates);

    @Generated
    @Selector("subviews")
    public native NSArray<? extends UIView> subviews();

    @Generated
    @Selector("superview")
    public native UIView superview();

    @Generated
    @Selector("systemLayoutSizeFittingSize:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSize(@ByValue CGSize targetSize);

    @Generated
    @Selector("systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSizeWithHorizontalFittingPriorityVerticalFittingPriority(
            @ByValue CGSize targetSize, float horizontalFittingPriority, float verticalFittingPriority);

    @Generated
    @Selector("tag")
    @NInt
    public native long tag();

    @Generated
    @Selector("tintAdjustmentMode")
    @NInt
    public native long tintAdjustmentMode();

    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    @Generated
    @Selector("tintColorDidChange")
    public native void tintColorDidChange();

    @Generated
    @Selector("topAnchor")
    public native NSLayoutYAxisAnchor topAnchor();

    @Generated
    @Selector("trailingAnchor")
    public native NSLayoutXAxisAnchor trailingAnchor();

    @Generated
    @Selector("traitCollection")
    public native UITraitCollection traitCollection();

    @Generated
    @Selector("traitCollectionDidChange:")
    public native void traitCollectionDidChange(UITraitCollection previousTraitCollection);

    @Generated
    @Selector("transform")
    @ByValue
    public native CGAffineTransform transform();

    @Generated
    @Selector("translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();

    @Generated
    @Selector("updateConstraints")
    public native void updateConstraints();

    @Generated
    @Selector("updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    @Generated
    @Deprecated
    @Selector("viewForBaselineLayout")
    public native UIView viewForBaselineLayout();

    @Generated
    @Selector("viewForFirstBaselineLayout")
    public native UIView viewForFirstBaselineLayout();

    @Generated
    @Selector("viewForLastBaselineLayout")
    public native UIView viewForLastBaselineLayout();

    @Generated
    @Selector("viewPrintFormatter")
    public native UIViewPrintFormatter viewPrintFormatter();

    @Generated
    @Selector("viewWithTag:")
    public native UIView viewWithTag(@NInt long tag);

    @Generated
    @Selector("widthAnchor")
    public native NSLayoutDimension widthAnchor();

    @Generated
    @Selector("willMoveToSuperview:")
    public native void willMoveToSuperview(UIView newSuperview);

    @Generated
    @Selector("willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);

    @Generated
    @Selector("willRemoveSubview:")
    public native void willRemoveSubview(UIView subview);

    @Generated
    @Selector("window")
    public native UIWindow window();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations {
        @Generated
        void call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 {
        @Generated
        void call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 {
        @Generated
        void call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationAnimations {
        @Generated
        void call_animateWithDurationAnimations();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationAnimationsCompletion_1 {
        @Generated
        void call_animateWithDurationAnimationsCompletion_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationAnimationsCompletion_2 {
        @Generated
        void call_animateWithDurationAnimationsCompletion_2(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationDelayOptionsAnimationsCompletion_3 {
        @Generated
        void call_animateWithDurationDelayOptionsAnimationsCompletion_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationDelayOptionsAnimationsCompletion_4 {
        @Generated
        void call_animateWithDurationDelayOptionsAnimationsCompletion_4(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 {
        @Generated
        void call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 {
        @Generated
        void call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6(
                boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 {
        @Generated
        void call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 {
        @Generated
        void call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_performWithoutAnimation {
        @Generated
        void call_performWithoutAnimation();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transitionFromViewToViewDurationOptionsCompletion {
        @Generated
        void call_transitionFromViewToViewDurationOptionsCompletion(boolean arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transitionWithViewDurationOptionsAnimationsCompletion_3 {
        @Generated
        void call_transitionWithViewDurationOptionsAnimationsCompletion_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_transitionWithViewDurationOptionsAnimationsCompletion_4 {
        @Generated
        void call_transitionWithViewDurationOptionsAnimationsCompletion_4(boolean arg0);
    }

    @Generated
    @Selector("accessibilityIgnoresInvertColors")
    public native boolean accessibilityIgnoresInvertColors();

    @Generated
    @Selector("addInteraction:")
    public native void addInteraction(@Mapped(ObjCObjectMapper.class) UIInteraction interaction);

    @Generated
    @Selector("directionalLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets directionalLayoutMargins();

    @Generated
    @Selector("insetsLayoutMarginsFromSafeArea")
    public native boolean insetsLayoutMarginsFromSafeArea();

    @Generated
    @Selector("interactions")
    public native NSArray<?> interactions();

    @Generated
    @Selector("removeInteraction:")
    public native void removeInteraction(@Mapped(ObjCObjectMapper.class) UIInteraction interaction);

    @Generated
    @Selector("safeAreaInsets")
    @ByValue
    public native UIEdgeInsets safeAreaInsets();

    @Generated
    @Selector("safeAreaInsetsDidChange")
    public native void safeAreaInsetsDidChange();

    @Generated
    @Selector("safeAreaLayoutGuide")
    public native UILayoutGuide safeAreaLayoutGuide();

    @Generated
    @Selector("setAccessibilityIgnoresInvertColors:")
    public native void setAccessibilityIgnoresInvertColors(boolean value);

    @Generated
    @Selector("setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByValue NSDirectionalEdgeInsets value);

    @Generated
    @Selector("setInsetsLayoutMarginsFromSafeArea:")
    public native void setInsetsLayoutMarginsFromSafeArea(boolean value);

    @Generated
    @Selector("setInteractions:")
    public native void setInteractions(NSArray<?> value);

    @Generated
    @Selector("coordinateSpace")
    @MappedReturn(ObjCObjectMapper.class)
    public native UICoordinateSpace coordinateSpace();

    @Generated
    @IsOptional
    @Selector("didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);

    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusItemContainer focusItemContainer();

    @Generated
    @Selector("focusItemsInRect:")
    public native NSArray<?> focusItemsInRect(@ByValue CGRect rect);

    @Generated
    @Selector("largeContentImage")
    public native UIImage largeContentImage();

    @Generated
    @Selector("largeContentImageInsets")
    @ByValue
    public native UIEdgeInsets largeContentImageInsets();

    @Generated
    @Selector("largeContentTitle")
    public native String largeContentTitle();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyAnimationsWithRepeatCountAutoreversesAnimations {
        @Generated
        void call_modifyAnimationsWithRepeatCountAutoreversesAnimations();
    }

    @Generated
    @Selector("overrideUserInterfaceStyle")
    @NInt
    public native long overrideUserInterfaceStyle();

    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIFocusEnvironment parentFocusEnvironment();

    @Generated
    @Selector("scalesLargeContentImage")
    public native boolean scalesLargeContentImage();

    @Generated
    @Selector("setLargeContentImage:")
    public native void setLargeContentImage(UIImage value);

    @Generated
    @Selector("setLargeContentImageInsets:")
    public native void setLargeContentImageInsets(@ByValue UIEdgeInsets value);

    @Generated
    @Selector("setLargeContentTitle:")
    public native void setLargeContentTitle(String value);

    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);

    @Generated
    @Selector("setScalesLargeContentImage:")
    public native void setScalesLargeContentImage(boolean value);

    @Generated
    @Selector("setShowsLargeContentViewer:")
    public native void setShowsLargeContentViewer(boolean value);

    @Generated
    @Selector("setTransform3D:")
    public native void setTransform3D(@ByValue CATransform3D value);

    @Generated
    @Selector("showsLargeContentViewer")
    public native boolean showsLargeContentViewer();

    @Generated
    @Selector("transform3D")
    @ByValue
    public native CATransform3D transform3D();
}

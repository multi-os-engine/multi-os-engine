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
import apple.uikit.protocol.UIPopoverPresentationControllerSourceItem;
import apple.corefoundation.struct.CGAffineTransform;
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
public class UIView extends UIResponder implements NSCoding, UIAppearance, UIAppearanceContainer, UIDynamicItem,
        UITraitEnvironment, UICoordinateSpace, UIFocusItem, UIFocusItemContainer, CALayerDelegate,
        UIAccessibilityIdentification, UILargeContentViewerItem, UIPopoverPresentationControllerSourceItem {
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

    /**
     * start time and duration are values between 0.0 and 1.0 specifying time and duration relative to the overall time
     * of the keyframe animation
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTimeRelativeDurationAnimations(double frameStartTime,
            double frameDuration,
            @ObjCBlock(name = "call_addKeyframeWithRelativeStartTimeRelativeDurationAnimations") Block_addKeyframeWithRelativeStartTimeRelativeDurationAnimations animations);

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIView allocWithZone(VoidPtr zone);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    /**
     * delay = 0.0, options = 0, completion = NULL
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") Block_animateWithDurationAnimations animations);

    /**
     * delay = 0.0, options = 0
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") Block_animateWithDurationAnimationsCompletion_2 completion);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    /**
     * Performs `animations` using a timing curve described by the motion of a spring. When `dampingRatio` is 1, the
     * animation will smoothly decelerate to its final model values without oscillating. Damping ratios less than 1 will
     * oscillate more and more before coming to a complete stop. You can use the initial spring velocity to specify how
     * fast the object at the end of the simulated spring was moving before it was attached. It's a unit coordinate
     * system, where 1 is defined as traveling the total animation distance in a second. So if you're changing an
     * object's position by 200pt in this animation, and you want the animation to behave as if the object was moving at
     * 100pt/s before the animation started, you'd pass 0.5. You'll typically want to pass 0 for the velocity.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion(
            double duration, double delay, @NFloat double dampingRatio, @NFloat double velocity, @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5") Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6") Block_animateWithDurationDelayUsingSpringWithDampingInitialSpringVelocityOptionsAnimationsCompletion_6 completion);

    @Generated
    @Selector("appearance")
    public static native UIView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Deprecated in iOS 13.0. Please use the block-based animation API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
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

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
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

    /**
     * API-Since: 9.0
     */
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

    /**
     * default is [CALayer class]. Used when creating the underlying layer for the view.
     */
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UIView new_objc();

    /**
     * Performs the requested system-provided animation on one or more views. Specify additional animations in the
     * parallelAnimations block. These additional animations will run alongside the system animation with the same
     * timing and duration that the system animation defines/inherits. Additional animations should not modify
     * properties of the view on which the system animation is being performed. Not all system animations honor all
     * available options.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") Block_performWithoutAnimation actionsWithoutAnimation);

    /**
     * constraint-based layout engages lazily when someone tries to use it (e.g., adds a constraint to a view). If you
     * do all of your constraint set up in -updateConstraints, you might never even receive updateConstraints if no one
     * makes a constraint. To fix this chicken and egg problem, override this method to return YES if your view needs
     * the window to use constraint-based layout.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use the block-based animation API instead
     */
    @Deprecated
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    /**
     * ignore any attribute changes while set.
     */
    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * toView added to fromView.superview, fromView removed from its superview
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") Block_transitionFromViewToViewDurationOptionsCompletion completion);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    /**
     * This method returns the layout direction implied by the provided semantic content attribute relative to the
     * application-wide layout direction (as returned by UIApplication.sharedApplication.userInterfaceLayoutDirection).
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    /**
     * This method returns the layout direction implied by the provided semantic content attribute relative to the
     * provided layout direction. For example, when provided a layout direction of RightToLeft and a semantic content
     * attribute of Playback, this method returns LeftToRight. Layout and drawing code can use this method to determine
     * how to arrange elements, but might find it easier to query the container view’s
     * effectiveUserInterfaceLayoutDirection property instead.
     * 
     * API-Since: 10.0
     */
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

    /**
     * This method will be deprecated in a future release and should be avoided.  Instead, set NSLayoutConstraint's
     * active property to YES.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);

    /**
     * This method will be deprecated in a future release and should be avoided.  Instead use +[NSLayoutConstraint
     * activateConstraints:].
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("addConstraints:")
    public native void addConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    /**
     * Adds layoutGuide to the receiver, passing the receiver in -setOwningView: to layoutGuide.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("addLayoutGuide:")
    public native void addLayoutGuide(UILayoutGuide layoutGuide);

    /**
     * Begins applying `effect` to the receiver. The effect's emitted keyPath/value pairs will be
     * applied to the view's presentation layer.
     * 
     * Animates the transition to the motion effect's values using the present UIView animation
     * context.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);

    @Generated
    @Selector("addSubview:")
    public native void addSubview(UIView view);

    /**
     * These two methods should be inverses of each other. UIKit will call both as part of layout computation.
     * They may be overridden to provide arbitrary transforms between frame and alignment rect, though the two methods
     * must be inverses of each other.
     * However, the default implementation uses -alignmentRectInsets, so just override that if it's applicable. It's
     * easier to get right.
     * A view that displayed an image with some ornament would typically override these, because the ornamental part of
     * an image would scale up with the size of the frame.
     * Set the NSUserDefault UIViewShowAlignmentRects to YES to see alignment rects drawn.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("alignmentRectForFrame:")
    @ByValue
    public native CGRect alignmentRectForFrame(@ByValue CGRect frame);

    /**
     * override this if the alignment rect is obtained from the frame by insetting each edge by a fixed amount. This is
     * only called by alignmentRectForFrame: and frameForAlignmentRect:.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("alignmentRectInsets")
    @ByValue
    public native UIEdgeInsets alignmentRectInsets();

    /**
     * animatable. default is 1.0
     */
    @Generated
    @Selector("alpha")
    @NFloat
    public native double alpha();

    @Generated
    @ProtocolClassMethod("appearance")
    public UIView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * default is YES. if set, subviews are adjusted according to their autoresizingMask if self.bounds changes
     */
    @Generated
    @Selector("autoresizesSubviews")
    public native boolean autoresizesSubviews();

    /**
     * simple resize. default is UIViewAutoresizingNone
     */
    @Generated
    @Selector("autoresizingMask")
    @NUInt
    public native long autoresizingMask();

    /**
     * default is nil. Can be useful with the appearance proxy on custom UIView subclasses.
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    /**
     * API-Since: 9.0
     */
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

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("centerXAnchor")
    public native NSLayoutXAxisAnchor centerXAnchor();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("centerYAnchor")
    public native NSLayoutYAxisAnchor centerYAnchor();

    /**
     * default is YES. ignored for opaque views. for non-opaque views causes the active CGContext in drawRect: to be
     * pre-filled with transparent pixels
     */
    @Generated
    @Selector("clearsContextBeforeDrawing")
    public native boolean clearsContextBeforeDrawing();

    /**
     * When YES, content and subviews are clipped to the bounds of the view. Default is NO.
     */
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

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("constraints")
    public native NSArray<? extends NSLayoutConstraint> constraints();

    /**
     * This returns a list of all the constraints that are affecting the current location of the receiver. The
     * constraints do not necessarily involve the receiver, they may affect the frame indirectly.
     * Pass UILayoutConstraintAxisHorizontal for the constraints affecting [self center].x and CGRectGetWidth([self
     * bounds]), and UILayoutConstraintAxisVertical for the constraints affecting[self center].y and
     * CGRectGetHeight([self bounds]).
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("constraintsAffectingLayoutForAxis:")
    public native NSArray<? extends NSLayoutConstraint> constraintsAffectingLayoutForAxis(@NInt long axis);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("contentCompressionResistancePriorityForAxis:")
    public native float contentCompressionResistancePriorityForAxis(@NInt long axis);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("contentHuggingPriorityForAxis:")
    public native float contentHuggingPriorityForAxis(@NInt long axis);

    /**
     * default is UIViewContentModeScaleToFill
     */
    @Generated
    @Selector("contentMode")
    @NInt
    public native long contentMode();

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("contentScaleFactor")
    @NFloat
    public native double contentScaleFactor();

    /**
     * animatable. default is unit rectangle {{0,0} {1,1}}. Now deprecated: please use -[UIImage
     * resizableImageWithCapInsets:] to achieve the same effect.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 6.0
     */
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

    /**
     * API-Since: 6.0
     */
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

    /**
     * default calls -drawRect:
     */
    @Generated
    @Selector("drawRect:forViewPrintFormatter:")
    public native void drawRectForViewPrintFormatter(@ByValue CGRect rect, UIViewPrintFormatter formatter);

    /**
     * Use this method to render a snapshot of the view hierarchy into the current context. Returns NO if the snapshot
     * is missing image data, YES if the snapshot is complete. Calling this method from layoutSubviews while the current
     * transaction is committing will capture what is currently displayed regardless if afterUpdates is YES.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchyInRectAfterScreenUpdates(@ByValue CGRect rect, boolean afterUpdates);

    /**
     * Returns the user interface layout direction appropriate for arranging the immediate content of this view. Always
     * consult the effectiveUserInterfaceLayoutDirection of the view whose immediate content is being arranged or drawn.
     * Do not assume that the value propagates through the view’s subtree.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("effectiveUserInterfaceLayoutDirection")
    @NInt
    public native long effectiveUserInterfaceLayoutDirection();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * use to make the view or any subview that is the first responder resign (optionally force)
     */
    @Generated
    @Selector("endEditing:")
    public native boolean endEditing(boolean force);

    @Generated
    @Selector("exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubviewAtIndexWithSubviewAtIndex(@NInt long index1, @NInt long index2);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("firstBaselineAnchor")
    public native NSLayoutYAxisAnchor firstBaselineAnchor();

    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("frameForAlignmentRect:")
    @ByValue
    public native CGRect frameForAlignmentRect(@ByValue CGRect alignmentRect);

    /**
     * called when the recognizer attempts to transition out of UIGestureRecognizerStatePossible if a touch hit-tested
     * to this view will be cancelled as a result of gesture recognition
     * returns YES by default. return NO to cause the gesture recognizer to transition to UIGestureRecognizerStateFailed
     * subclasses may override to prevent recognition of particular gestures. for example, UISlider prevents swipes
     * parallel to the slider that start in the thumb
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    /**
     * If there aren't enough constraints in the system to uniquely determine layout, we say the layout is ambiguous.
     * For example, if the only constraint in the system was x = y + 100, then there are lots of different possible
     * values for x and y. This situation is not automatically detected by UIKit, due to performance considerations and
     * details of the algorithm used for layout.
     * The symptom of ambiguity is that views sometimes jump from place to place, or possibly are just in the wrong
     * place.
     * -hasAmbiguousLayout runs a check for whether there is another center and bounds the receiver could have that
     * could also satisfy the constraints.
     * -exerciseAmbiguousLayout does more. It randomly changes the view layout to a different valid layout. Making the
     * UI jump back and forth can be helpful for figuring out where you're missing a constraint.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("heightAnchor")
    public native NSLayoutDimension heightAnchor();

    /**
     * recursively calls -pointInside:withEvent:. point is in the receiver's coordinate system
     */
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

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("intrinsicContentSize")
    @ByValue
    public native CGSize intrinsicContentSize();

    /**
     * call this when something changes that affects the intrinsicContentSize. Otherwise UIKit won't notice that it
     * changed.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();

    /**
     * returns YES for self.
     */
    @Generated
    @Selector("isDescendantOfView:")
    public native boolean isDescendantOfView(UIView view);

    /**
     * default is NO
     */
    @Generated
    @Selector("isExclusiveTouch")
    public native boolean isExclusiveTouch();

    /**
     * default is NO
     */
    @Generated
    @Selector("setExclusiveTouch:")
    public native void setExclusiveTouch(boolean value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("isFocused")
    public native boolean isFocused();

    /**
     * default is NO. doesn't check superviews
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * default is NO. doesn't check superviews
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * default is NO
     */
    @Generated
    @Selector("isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();

    /**
     * default is NO
     */
    @Generated
    @Selector("setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean value);

    /**
     * default is YES. opaque views must fill their entire bounds or the results are undefined. the active CGContext in
     * drawRect: will not have been cleared and may have non-zeroed pixels
     */
    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    /**
     * default is YES. opaque views must fill their entire bounds or the results are undefined. the active CGContext in
     * drawRect: will not have been cleared and may have non-zeroed pixels
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * default is YES. if set to NO, user events (touch, keys) are ignored and removed from the event queue.
     */
    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    /**
     * default is YES. if set to NO, user events (touch, keys) are ignored and removed from the event queue.
     */
    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("lastBaselineAnchor")
    public native NSLayoutYAxisAnchor lastBaselineAnchor();

    /**
     * returns view's layer. Will always return a non-nil value. view is layer's delegate
     */
    @Generated
    @Selector("layer")
    public native CALayer layer();

    @Generated
    @IsOptional
    @Selector("layerWillDraw:")
    public native void layerWillDraw(CALayer layer);

    /**
     * UILayoutGuide objects owned by the receiver.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("layoutGuides")
    public native NSArray<? extends UILayoutGuide> layoutGuides();

    @Generated
    @Selector("layoutIfNeeded")
    public native void layoutIfNeeded();

    /**
     * -layoutMargins returns a set of insets from the edge of the view's bounds that denote a default spacing for
     * laying out content.
     * If preservesSuperviewLayoutMargins is YES, margins cascade down the view tree, adjusting for geometry offsets, so
     * that setting
     * the left value of layoutMargins on a superview will affect the left value of layoutMargins for subviews
     * positioned close to the
     * left edge of their superview's bounds
     * If your view subclass uses layoutMargins in its layout or drawing, override -layoutMarginsDidChange in order to
     * refresh your
     * view if the margins change.
     * On iOS 11.0 and later, please support both user interface layout directions by setting the
     * directionalLayoutMargins property
     * instead of the layoutMargins property. After setting the directionalLayoutMargins property, the values in the
     * left and right
     * fields of the layoutMargins property will depend on the user interface layout direction.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("layoutMargins")
    @ByValue
    public native UIEdgeInsets layoutMargins();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("layoutMarginsDidChange")
    public native void layoutMarginsDidChange();

    /**
     * The edges of this guide are constrained to equal the edges of the view inset by the layoutMargins
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("layoutMarginsGuide")
    public native UILayoutGuide layoutMarginsGuide();

    @Generated
    @IsOptional
    @Selector("layoutSublayersOfLayer:")
    public native void layoutSublayersOfLayer(CALayer layer);

    /**
     * override point. called by layoutIfNeeded automatically. As of iOS 6.0, when constraints-based layout is used the
     * base implementation applies the constraints-based layout, otherwise it does nothing.
     */
    @Generated
    @Selector("layoutSubviews")
    public native void layoutSubviews();

    /**
     * Constraint creation conveniences. See NSLayoutAnchor.h for details.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("leadingAnchor")
    public native NSLayoutXAxisAnchor leadingAnchor();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("leftAnchor")
    public native NSLayoutXAxisAnchor leftAnchor();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("maskView")
    public native UIView maskView();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("motionEffects")
    public native NSArray<? extends UIMotionEffect> motionEffects();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("needsUpdateConstraints")
    public native boolean needsUpdateConstraints();

    /**
     * default returns YES if point is in bounds
     */
    @Generated
    @Selector("pointInside:withEvent:")
    public native boolean pointInsideWithEvent(@ByValue CGPoint point, UIEvent event);

    @Generated
    @Selector("preferredFocusEnvironments")
    public native NSArray<?> preferredFocusEnvironments();

    @Deprecated
    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    /**
     * default is NO - set to enable pass-through or cascading behavior of margins from this view’s parent to its
     * children
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("preservesSuperviewLayoutMargins")
    public native boolean preservesSuperviewLayoutMargins();

    /**
     * This content guide provides a layout area that you can use to place text and related content whose width should
     * generally be constrained to a size that is easy for the user to read. This guide provides a centered region that
     * you can place content within to get this behavior for this view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("readableContentGuide")
    public native UILayoutGuide readableContentGuide();

    /**
     * This method will be deprecated in a future release and should be avoided.  Instead set NSLayoutConstraint's
     * active property to NO.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);

    /**
     * This method will be deprecated in a future release and should be avoided.  Instead use +[NSLayoutConstraint
     * deactivateConstraints:].
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("removeConstraints:")
    public native void removeConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    @Generated
    @Selector("removeFromSuperview")
    public native void removeFromSuperview();

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    /**
     * Removes layoutGuide from the receiver, passing nil in -setOwningView: to layoutGuide.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("removeLayoutGuide:")
    public native void removeLayoutGuide(UILayoutGuide layoutGuide);

    /**
     * Stops applying `effect` to the receiver. Any affected presentation values will animate to
     * their post-removal values using the present UIView animation context.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);

    /**
     * Resizable snapshots will default to stretching the center
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView resizableSnapshotViewFromRectAfterScreenUpdatesWithCapInsets(@ByValue CGRect rect,
            boolean afterUpdates, @ByValue UIEdgeInsets capInsets);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("restorationIdentifier")
    public native String restorationIdentifier();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("rightAnchor")
    public native NSLayoutXAxisAnchor rightAnchor();

    /**
     * API-Since: 9.0
     */
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

    /**
     * animatable. default is 1.0
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    /**
     * default is YES. if set, subviews are adjusted according to their autoresizingMask if self.bounds changes
     */
    @Generated
    @Selector("setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean value);

    /**
     * simple resize. default is UIViewAutoresizingNone
     */
    @Generated
    @Selector("setAutoresizingMask:")
    public native void setAutoresizingMask(@NUInt long value);

    /**
     * default is nil. Can be useful with the appearance proxy on custom UIView subclasses.
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * default bounds is zero origin, frame size. animatable
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    @Generated
    @Selector("setCenter:")
    public native void setCenter(@ByValue CGPoint value);

    /**
     * default is YES. ignored for opaque views. for non-opaque views causes the active CGContext in drawRect: to be
     * pre-filled with transparent pixels
     */
    @Generated
    @Selector("setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean value);

    /**
     * When YES, content and subviews are clipped to the bounds of the view. Default is NO.
     */
    @Generated
    @Selector("setClipsToBounds:")
    public native void setClipsToBounds(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriorityForAxis(float priority, @NInt long axis);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriorityForAxis(float priority, @NInt long axis);

    /**
     * default is UIViewContentModeScaleToFill
     */
    @Generated
    @Selector("setContentMode:")
    public native void setContentMode(@NInt long value);

    /**
     * API-Since: 4.0
     */
    @Generated
    @Selector("setContentScaleFactor:")
    public native void setContentScaleFactor(@NFloat double value);

    /**
     * animatable. default is unit rectangle {{0,0} {1,1}}. Now deprecated: please use -[UIImage
     * resizableImageWithCapInsets:] to achieve the same effect.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("setContentStretch:")
    public native void setContentStretch(@ByValue CGRect value);

    /**
     * animatable. do not use frame if view is transformed since it will not correctly reflect the actual location of
     * the view. use bounds + center instead.
     */
    @Generated
    @Selector("setFrame:")
    public native void setFrame(@ByValue CGRect value);

    /**
     * API-Since: 3.2
     */
    @Generated
    @Selector("setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<? extends UIGestureRecognizer> value);

    /**
     * -layoutMargins returns a set of insets from the edge of the view's bounds that denote a default spacing for
     * laying out content.
     * If preservesSuperviewLayoutMargins is YES, margins cascade down the view tree, adjusting for geometry offsets, so
     * that setting
     * the left value of layoutMargins on a superview will affect the left value of layoutMargins for subviews
     * positioned close to the
     * left edge of their superview's bounds
     * If your view subclass uses layoutMargins in its layout or drawing, override -layoutMarginsDidChange in order to
     * refresh your
     * view if the margins change.
     * On iOS 11.0 and later, please support both user interface layout directions by setting the
     * directionalLayoutMargins property
     * instead of the layoutMargins property. After setting the directionalLayoutMargins property, the values in the
     * left and right
     * fields of the layoutMargins property will depend on the user interface layout direction.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLayoutMargins:")
    public native void setLayoutMargins(@ByValue UIEdgeInsets value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setMaskView:")
    public native void setMaskView(UIView value);

    /**
     * API-Since: 7.0
     */
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

    /**
     * Allows you to perform layout before the drawing cycle happens. -layoutIfNeeded forces layout early
     */
    @Generated
    @Selector("setNeedsLayout")
    public native void setNeedsLayout();

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();

    /**
     * default is NO - set to enable pass-through or cascading behavior of margins from this view’s parent to its
     * children
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setPreservesSuperviewLayoutMargins:")
    public native void setPreservesSuperviewLayoutMargins(boolean value);

    /**
     * API-Since: 6.0
     */
    @Generated
    @Selector("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setSemanticContentAttribute:")
    public native void setSemanticContentAttribute(@NInt long value);

    /**
     * default is 0
     */
    @Generated
    @Selector("setTag:")
    public native void setTag(@NInt long value);

    /**
     * -tintAdjustmentMode always returns either UIViewTintAdjustmentModeNormal or UIViewTintAdjustmentModeDimmed. The
     * value returned is the first non-default value in the receiver's superview chain (starting with itself).
     * If no non-default value is found, UIViewTintAdjustmentModeNormal is returned.
     * When tintAdjustmentMode has a value of UIViewTintAdjustmentModeDimmed for a view, the color it returns from
     * tintColor will be modified to give a dimmed appearance.
     * When the tintAdjustmentMode of a view changes (either the view's value changing or by one of its superview's
     * values changing), -tintColorDidChange will be called to allow the view to refresh its rendering.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(@NInt long value);

    /**
     * -tintColor always returns a color. The color returned is the first non-default value in the receiver's superview
     * chain (starting with itself).
     * If no non-default value is found, a system-defined color is returned.
     * If this view's -tintAdjustmentMode returns Dimmed, then the color that is returned for -tintColor will
     * automatically be dimmed.
     * If your view subclass uses tintColor in its rendering, override -tintColorDidChange in order to refresh the
     * rendering if the color changes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    /**
     * Default YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean value);

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    /**
     * return 'best' size to fit given size. does not actually resize view. Default is return existing view size
     */
    @Generated
    @Selector("sizeThatFits:")
    @ByValue
    public native CGSize sizeThatFits(@ByValue CGSize size);

    /**
     * calls sizeThatFits: with current view bounds and changes bounds size.
     */
    @Generated
    @Selector("sizeToFit")
    public native void sizeToFit();

    /**
     * * When requesting a snapshot, 'afterUpdates' defines whether the snapshot is representative of what's currently
     * on screen or if you wish to include any recent changes before taking the snapshot.
     * 
     * If called during layout from a committing transaction, snapshots occurring after the screen updates will include
     * all changes made, regardless of when the snapshot is taken and the changes are made. For example:
     * 
     * - (void)layoutSubviews {
     * UIView *snapshot = [self snapshotViewAfterScreenUpdates:YES];
     * self.alpha = 0.0;
     * }
     * 
     * The snapshot will appear to be empty since the change in alpha will be captured by the snapshot. If you need to
     * animate the view during layout, animate the snapshot instead.
     * 
     * * Creating snapshots from existing snapshots (as a method to duplicate, crop or create a resizable variant) is
     * supported. In cases where many snapshots are needed, creating a snapshot from a common superview and making
     * subsequent snapshots from it can be more performant. Please keep in mind that if 'afterUpdates' is YES, the
     * original snapshot is committed and any changes made to it, not the view originally snapshotted, will be included.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates(boolean afterUpdates);

    @Generated
    @Selector("subviews")
    public native NSArray<? extends UIView> subviews();

    @Generated
    @Selector("superview")
    public native UIView superview();

    /**
     * Equivalent to sending -systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority: with
     * UILayoutPriorityFittingSizeLevel for both priorities.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("systemLayoutSizeFittingSize:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSize(@ByValue CGSize targetSize);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSizeWithHorizontalFittingPriorityVerticalFittingPriority(
            @ByValue CGSize targetSize, float horizontalFittingPriority, float verticalFittingPriority);

    /**
     * default is 0
     */
    @Generated
    @Selector("tag")
    @NInt
    public native long tag();

    /**
     * -tintAdjustmentMode always returns either UIViewTintAdjustmentModeNormal or UIViewTintAdjustmentModeDimmed. The
     * value returned is the first non-default value in the receiver's superview chain (starting with itself).
     * If no non-default value is found, UIViewTintAdjustmentModeNormal is returned.
     * When tintAdjustmentMode has a value of UIViewTintAdjustmentModeDimmed for a view, the color it returns from
     * tintColor will be modified to give a dimmed appearance.
     * When the tintAdjustmentMode of a view changes (either the view's value changing or by one of its superview's
     * values changing), -tintColorDidChange will be called to allow the view to refresh its rendering.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("tintAdjustmentMode")
    @NInt
    public native long tintAdjustmentMode();

    /**
     * -tintColor always returns a color. The color returned is the first non-default value in the receiver's superview
     * chain (starting with itself).
     * If no non-default value is found, a system-defined color is returned.
     * If this view's -tintAdjustmentMode returns Dimmed, then the color that is returned for -tintColor will
     * automatically be dimmed.
     * If your view subclass uses tintColor in its rendering, override -tintColorDidChange in order to refresh the
     * rendering if the color changes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * The -tintColorDidChange message is sent to appropriate subviews of a view when its tintColor is changed by client
     * code or to subviews in the view hierarchy of a view whose tintColor is implicitly changed when its superview or
     * tintAdjustmentMode changes.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("tintColorDidChange")
    public native void tintColorDidChange();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("topAnchor")
    public native NSLayoutYAxisAnchor topAnchor();

    /**
     * API-Since: 9.0
     */
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

    /**
     * Default YES
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();

    /**
     * Override this to adjust your special constraints during a constraints update pass
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("updateConstraints")
    public native void updateConstraints();

    /**
     * Updates the constraints from the bottom up for the view hierarchy rooted at the receiver. UIWindow's
     * implementation creates a layout engine if necessary first.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Override -viewForFirstBaselineLayout or -viewForLastBaselineLayout as appropriate, instead
     */
    @Generated
    @Deprecated
    @Selector("viewForBaselineLayout")
    public native UIView viewForBaselineLayout();

    /**
     * -viewForFirstBaselineLayout is called by the constraints system when interpreting
     * the firstBaseline attribute for a view.
     * For complex custom UIView subclasses, override this method to return the text-based
     * (i.e., UILabel or non-scrollable UITextView) descendant of the receiver whose first baseline
     * is appropriate for alignment.
     * UIView's implementation returns [self viewForLastBaselineLayout], so if the same
     * descendant is appropriate for both first- and last-baseline layout you may override
     * just -viewForLastBaselineLayout.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("viewForFirstBaselineLayout")
    public native UIView viewForFirstBaselineLayout();

    /**
     * -viewForLastBaselineLayout is called by the constraints system when interpreting
     * the lastBaseline attribute for a view.
     * For complex custom UIView subclasses, override this method to return the text-based
     * (i.e., UILabel or non-scrollable UITextView) descendant of the receiver whose last baseline
     * is appropriate for alignment.
     * UIView's implementation returns self.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("viewForLastBaselineLayout")
    public native UIView viewForLastBaselineLayout();

    /**
     * returns a new print formatter each time
     */
    @Generated
    @Selector("viewPrintFormatter")
    public native UIViewPrintFormatter viewPrintFormatter();

    /**
     * recursive search. includes self
     */
    @Generated
    @Selector("viewWithTag:")
    public native UIView viewWithTag(@NInt long tag);

    /**
     * API-Since: 9.0
     */
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
        void call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4(boolean finished);
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
        void call_animateWithDurationAnimationsCompletion_2(boolean finished);
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
        void call_animateWithDurationDelayOptionsAnimationsCompletion_4(boolean finished);
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
                boolean finished);
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
        void call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4(boolean finished);
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
        void call_transitionFromViewToViewDurationOptionsCompletion(boolean finished);
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
        void call_transitionWithViewDurationOptionsAnimationsCompletion_4(boolean finished);
    }

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("accessibilityIgnoresInvertColors")
    public native boolean accessibilityIgnoresInvertColors();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("addInteraction:")
    public native void addInteraction(@Mapped(ObjCObjectMapper.class) UIInteraction interaction);

    /**
     * directionalLayoutMargins.leading is used on the left when the user interface direction is LTR and on the right
     * for RTL.
     * Vice versa for directionalLayoutMargins.trailing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("directionalLayoutMargins")
    @ByValue
    public native NSDirectionalEdgeInsets directionalLayoutMargins();

    /**
     * Default: YES
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("insetsLayoutMarginsFromSafeArea")
    public native boolean insetsLayoutMarginsFromSafeArea();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("interactions")
    public native NSArray<?> interactions();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("removeInteraction:")
    public native void removeInteraction(@Mapped(ObjCObjectMapper.class) UIInteraction interaction);

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("safeAreaInsets")
    @ByValue
    public native UIEdgeInsets safeAreaInsets();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("safeAreaInsetsDidChange")
    public native void safeAreaInsetsDidChange();

    /**
     * The top of the safeAreaLayoutGuide indicates the unobscured top edge of the view (e.g, not behind
     * the status bar or navigation bar, if present). Similarly for the other edges.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("safeAreaLayoutGuide")
    public native UILayoutGuide safeAreaLayoutGuide();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAccessibilityIgnoresInvertColors:")
    public native void setAccessibilityIgnoresInvertColors(boolean value);

    /**
     * directionalLayoutMargins.leading is used on the left when the user interface direction is LTR and on the right
     * for RTL.
     * Vice versa for directionalLayoutMargins.trailing.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDirectionalLayoutMargins:")
    public native void setDirectionalLayoutMargins(@ByValue NSDirectionalEdgeInsets value);

    /**
     * Default: YES
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setInsetsLayoutMarginsFromSafeArea:")
    public native void setInsetsLayoutMarginsFromSafeArea(boolean value);

    /**
     * API-Since: 11.0
     */
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

    /**
     * Call this method from within an animation block to repeat animations, otherwise has no effect. The total duration
     * of a repeating animation can be computed via (outerAnimationDuration * repeatCount * autoreverses ? 2 : 1).
     * 
     * API-Since: 13.0
     */
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

    /**
     * Set `overrideUserInterfaceStyle` to cause this view and its subviews to have a specific `UIUserInterfaceStyle`.
     * Reading this property does not return the current `UIUserInterfaceStyle`. Use
     * `traitCollection.userInterfaceStyle` instead.
     * 
     * Whenever possible, use the `overrideUserInterfaceStyle` property on `UIViewController` instead.
     * 
     * Use this property only when:
     * - You want a particular style on a single view or small view hierarchy.
     * - You want a particular style on an entire `UIWindow` and its view controllers and presentations,
     * but don't want to force your entire application to have that style.
     * 
     * (If you do want your entire application to have a certain style, don't use this, but instead
     * set the `UIUserInterfaceStyle" key in your Info.plist.)
     * 
     * When set on an ordinary `UIView`:
     * - This property affects only the traits of this view and its subviews.
     * - It does not affect any view controllers, or any subviews that are owned by different view controllers.
     * 
     * When set on a `UIWindow`:
     * - This property affects the `rootViewController` and thus the entire view controller and view hierarchy.
     * - It also affects presentations that happen inside the window.
     * 
     * API-Since: 13.0
     */
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

    /**
     * Defaults to nil, or an appropriate default value for UIKit classes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLargeContentImage:")
    public native void setLargeContentImage(UIImage value);

    /**
     * Defaults to UIEdgeInsetsZero.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLargeContentImageInsets:")
    public native void setLargeContentImageInsets(@ByValue UIEdgeInsets value);

    /**
     * Defaults to nil, or an appropriate default value for UIKit classes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setLargeContentTitle:")
    public native void setLargeContentTitle(String value);

    /**
     * Set `overrideUserInterfaceStyle` to cause this view and its subviews to have a specific `UIUserInterfaceStyle`.
     * Reading this property does not return the current `UIUserInterfaceStyle`. Use
     * `traitCollection.userInterfaceStyle` instead.
     * 
     * Whenever possible, use the `overrideUserInterfaceStyle` property on `UIViewController` instead.
     * 
     * Use this property only when:
     * - You want a particular style on a single view or small view hierarchy.
     * - You want a particular style on an entire `UIWindow` and its view controllers and presentations,
     * but don't want to force your entire application to have that style.
     * 
     * (If you do want your entire application to have a certain style, don't use this, but instead
     * set the `UIUserInterfaceStyle" key in your Info.plist.)
     * 
     * When set on an ordinary `UIView`:
     * - This property affects only the traits of this view and its subviews.
     * - It does not affect any view controllers, or any subviews that are owned by different view controllers.
     * 
     * When set on a `UIWindow`:
     * - This property affects the `rootViewController` and thus the entire view controller and view hierarchy.
     * - It also affects presentations that happen inside the window.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setOverrideUserInterfaceStyle:")
    public native void setOverrideUserInterfaceStyle(@NInt long value);

    /**
     * Defaults to NO, or an appropriate default value for UIKit classes.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setScalesLargeContentImage:")
    public native void setScalesLargeContentImage(boolean value);

    /**
     * Defaults to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setShowsLargeContentViewer:")
    public native void setShowsLargeContentViewer(boolean value);

    /**
     * default is CATransform3DIdentity. animatable. Please use this property instead of the transform property on the
     * layer
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setTransform3D:")
    public native void setTransform3D(@ByValue CATransform3D value);

    @Generated
    @Selector("showsLargeContentViewer")
    public native boolean showsLargeContentViewer();

    /**
     * default is CATransform3DIdentity. animatable. Please use this property instead of the transform property on the
     * layer
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("transform3D")
    @ByValue
    public native CATransform3D transform3D();

    @Generated
    @Selector("focusGroupIdentifier")
    public native String focusGroupIdentifier();

    /**
     * The identifier of the focus group that this view belongs to. If this is nil, subviews inherit their superview's
     * focus group.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setFocusGroupIdentifier:")
    public native void setFocusGroupIdentifier(String value);

    /**
     * Will return a string with a log of all the superviews of this view, alongside with what
     * content size category each view has and if that view has limits applied.
     * This is for debugging purposes only.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("appliedContentSizeCategoryLimitsDescription")
    public native String appliedContentSizeCategoryLimitsDescription();

    @Generated
    @Selector("focusEffect")
    public native UIFocusEffect focusEffect();

    @Generated
    @Selector("focusGroupPriority")
    @NInt
    public native long focusGroupPriority();

    @Generated
    @IsOptional
    @Selector("isTransparentFocusItem")
    public native boolean isTransparentFocusItem();

    /**
     * Follows the keyboard when on screen and docked. When the keyboard is offscreen or undocked,
     * keyboardLayoutGuide.topAnchor matches the view's safeAreaLayoutGuide.bottomAnchor.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("keyboardLayoutGuide")
    public native UIKeyboardLayoutGuide keyboardLayoutGuide();

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("maximumContentSizeCategory")
    public native String maximumContentSizeCategory();

    /**
     * Specify content size category limits. Setting one or both of these properties will limit the
     * content size category for this view (and its subviews) to a minimum or a maximum value.
     * You can use this to limit the support content size categories on part of your view hierarchy.
     * Setting this to nil removes the limit on the minimum or maximum.
     * Limits will be applied immediately and when future content size category updates occur.
     * 
     * Specifying a minimum limit that is greater than the maximum limit (or vice versa) will effectively
     * only use the maximum limit.
     * 
     * Example:
     * 
     * // limit the support content size categories between .medium and .accessibilityExtraLarge (included).
     * view.minimumContentSizeCategory = UIContentSizeCategoryMedium;
     * view.maximumContentSizeCategory = UIContentSizeCategoryAccessibilityExtraLarge;
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("minimumContentSizeCategory")
    public native String minimumContentSizeCategory();

    /**
     * Describes a visual effect to apply when this item is focused. If this property is nil no effect will be applied
     * when this view becomes focused.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFocusEffect:")
    public native void setFocusEffect(UIFocusEffect value);

    /**
     * The priority this item has in its focus group. The higher the priority, the more likely it is to get picked when
     * focus moves into this group.
     * Note: this method can only be used to increase an item's priority, not decrease it. For example if an item is
     * currently selected, the actual priority of this item will be determined by MAX(focusGroupPriority,
     * UIFocusGroupPrioritySelected).
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFocusGroupPriority:")
    public native void setFocusGroupPriority(@NInt long value);

    /**
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMaximumContentSizeCategory:")
    public native void setMaximumContentSizeCategory(String value);

    /**
     * Specify content size category limits. Setting one or both of these properties will limit the
     * content size category for this view (and its subviews) to a minimum or a maximum value.
     * You can use this to limit the support content size categories on part of your view hierarchy.
     * Setting this to nil removes the limit on the minimum or maximum.
     * Limits will be applied immediately and when future content size category updates occur.
     * 
     * Specifying a minimum limit that is greater than the maximum limit (or vice versa) will effectively
     * only use the maximum limit.
     * 
     * Example:
     * 
     * // limit the support content size categories between .medium and .accessibilityExtraLarge (included).
     * view.minimumContentSizeCategory = UIContentSizeCategoryMedium;
     * view.maximumContentSizeCategory = UIContentSizeCategoryAccessibilityExtraLarge;
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setMinimumContentSizeCategory:")
    public native void setMinimumContentSizeCategory(String value);

    /**
     * Defines the anchor point of the layer's bounds rect, as a point in
     * normalized layer coordinates - '(0, 0)' is the bottom left corner of
     * the bounds rect, '(1, 1)' is the top right corner. Defaults to
     * '(0.5, 0.5)', i.e. the center of the bounds rect.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("anchorPoint")
    @ByValue
    public native CGPoint anchorPoint();

    /**
     * Defines the anchor point of the layer's bounds rect, as a point in
     * normalized layer coordinates - '(0, 0)' is the bottom left corner of
     * the bounds rect, '(1, 1)' is the top right corner. Defaults to
     * '(0.5, 0.5)', i.e. the center of the bounds rect.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setAnchorPoint:")
    public native void setAnchorPoint(@ByValue CGPoint value);
}

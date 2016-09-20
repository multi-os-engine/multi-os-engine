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
import apple.uikit.protocol.UIAccessibilityIdentification;
import apple.uikit.protocol.UIAppearance;
import apple.uikit.protocol.UIAppearanceContainer;
import apple.uikit.protocol.UICoordinateSpace;
import apple.uikit.protocol.UIDynamicItem;
import apple.uikit.protocol.UIFocusEnvironment;
import apple.uikit.protocol.UITraitEnvironment;
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
        UIFocusEnvironment, UIAccessibilityIdentification {
    static {
        NatJ.register();
    }

    @Generated
    protected UIView(Pointer peer) {
        super(peer);
    }

    /**
     * addKeyframeWithRelativeStartTime:relativeDuration:animations:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/addKeyframeWithRelativeStartTime:relativeDuration:animations:">iOS Dev Center</a>
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

    /**
     * animateKeyframesWithDuration:delay:options:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/animateKeyframesWithDuration:delay:options:animations:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDurationDelayOptionsAnimationsCompletion(double duration,
            double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4") Block_animateKeyframesWithDurationDelayOptionsAnimationsCompletion_4 completion);

    /**
     * animateWithDuration:animations:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/animateWithDuration:animations:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithDuration:animations:")
    public static native void animateWithDurationAnimations(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimations") Block_animateWithDurationAnimations animations);

    /**
     * animateWithDuration:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/animateWithDuration:animations:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithDuration:animations:completion:")
    public static native void animateWithDurationAnimationsCompletion(double duration,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_1") Block_animateWithDurationAnimationsCompletion_1 animations,
            @ObjCBlock(name = "call_animateWithDurationAnimationsCompletion_2") Block_animateWithDurationAnimationsCompletion_2 completion);

    /**
     * animateWithDuration:delay:options:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/animateWithDuration:delay:options:animations:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDurationDelayOptionsAnimationsCompletion(double duration, double delay,
            @NUInt long options,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_3") Block_animateWithDurationDelayOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_animateWithDurationDelayOptionsAnimationsCompletion_4") Block_animateWithDurationDelayOptionsAnimationsCompletion_4 completion);

    /**
     * animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:">iOS Dev Center</a>
     */
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

    @Deprecated
    @Generated
    @Variadic()
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs);

    @Deprecated
    @Generated
    @Variadic()
    @Selector("appearanceWhenContainedIn:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass,
            Object... varargs);

    /**
     * areAnimationsEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/areAnimationsEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    /**
     * beginAnimations:context:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/beginAnimations:context:">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginAnimations:context:")
    public static native void beginAnimationsContext(String animationID, VoidPtr context);

    /**
     * commitAnimations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/commitAnimations">iOS Dev Center</a>
     */
    @Generated
    @Selector("commitAnimations")
    public static native void commitAnimations();

    /**
     * layerClass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/layerClass">iOS Dev Center</a>
     */
    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    /**
     * performSystemAnimation:onViews:options:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/performSystemAnimation:onViews:options:animations:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimationOnViewsOptionsAnimationsCompletion(@NUInt long animation,
            NSArray<? extends UIView> views, @NUInt long options,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_3") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_3 parallelAnimations,
            @ObjCBlock(name = "call_performSystemAnimationOnViewsOptionsAnimationsCompletion_4") Block_performSystemAnimationOnViewsOptionsAnimationsCompletion_4 completion);

    /**
     * performWithoutAnimation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/performWithoutAnimation:">iOS Dev Center</a>
     */
    @Generated
    @Selector("performWithoutAnimation:")
    public static native void performWithoutAnimation(
            @ObjCBlock(name = "call_performWithoutAnimation") Block_performWithoutAnimation actionsWithoutAnimation);

    /**
     * requiresConstraintBasedLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/requiresConstraintBasedLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    /**
     * setAnimationBeginsFromCurrentState:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationBeginsFromCurrentState:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    /**
     * setAnimationCurve:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationCurve:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationCurve:")
    public static native void setAnimationCurve(@NInt long curve);

    /**
     * setAnimationDelay:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationDelay:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    /**
     * setAnimationDelegate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationDelegate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationDelegate:")
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    /**
     * setAnimationDidStopSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationDidStopSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

    /**
     * setAnimationDuration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationDuration:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationDuration:")
    public static native void setAnimationDuration_static(double duration);

    /**
     * setAnimationRepeatAutoreverses:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationRepeatAutoreverses:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    /**
     * setAnimationRepeatCount:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationRepeatCount:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount_static(float repeatCount);

    /**
     * setAnimationStartDate:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationStartDate:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    /**
     * setAnimationTransition:forView:cache:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationTransition:forView:cache:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    /**
     * setAnimationWillStartSelector:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationWillStartSelector:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(SEL selector);

    /**
     * setAnimationsEnabled:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/setAnimationsEnabled:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    /**
     * transitionFromView:toView:duration:options:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/transitionFromView:toView:duration:options:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromViewToViewDurationOptionsCompletion(UIView fromView, UIView toView,
            double duration, @NUInt long options,
            @ObjCBlock(name = "call_transitionFromViewToViewDurationOptionsCompletion") Block_transitionFromViewToViewDurationOptionsCompletion completion);

    /**
     * transitionWithView:duration:options:animations:completion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/transitionWithView:duration:options:animations:completion:">iOS Dev Center</a>
     */
    @Generated
    @Selector("transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithViewDurationOptionsAnimationsCompletion(UIView view, double duration,
            @NUInt long options,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_3") Block_transitionWithViewDurationOptionsAnimationsCompletion_3 animations,
            @ObjCBlock(name = "call_transitionWithViewDurationOptionsAnimationsCompletion_4") Block_transitionWithViewDurationOptionsAnimationsCompletion_4 completion);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

    /**
     * inheritedAnimationDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/inheritedAnimationDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("inheritedAnimationDuration")
    public static native double inheritedAnimationDuration();

    /**
     * userInterfaceLayoutDirectionForSemanticContentAttribute:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/clm/UIView/userInterfaceLayoutDirectionForSemanticContentAttribute:">iOS Dev Center</a>
     */
    @Generated
    @Selector("userInterfaceLayoutDirectionForSemanticContentAttribute:")
    @NInt
    public static native long userInterfaceLayoutDirectionForSemanticContentAttribute(@NInt long attribute);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version();

    @Generated
    @Selector("accessibilityIdentifier")
    public native String accessibilityIdentifier();

    /**
     * addConstraint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addConstraint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addConstraint:")
    public native void addConstraint(NSLayoutConstraint constraint);

    /**
     * addConstraints:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addConstraints:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addConstraints:")
    public native void addConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    /**
     * addGestureRecognizer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addGestureRecognizer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addGestureRecognizer:")
    public native void addGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    /**
     * addMotionEffect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addMotionEffect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addMotionEffect:")
    public native void addMotionEffect(UIMotionEffect effect);

    /**
     * addSubview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addSubview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addSubview:")
    public native void addSubview(UIView view);

    /**
     * alignmentRectForFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/alignmentRectForFrame:">iOS Dev Center</a>
     */
    @Generated
    @Selector("alignmentRectForFrame:")
    @ByValue
    public native CGRect alignmentRectForFrame(@ByValue CGRect frame);

    /**
     * alignmentRectInsets</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/alignmentRectInsets">iOS Dev Center</a>
     */
    @Generated
    @Selector("alignmentRectInsets")
    @ByValue
    public native UIEdgeInsets alignmentRectInsets();

    /**
     * alpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/alpha">iOS Dev Center</a>
     */
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

    @Deprecated
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Deprecated
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) Object ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    /**
     * autoresizesSubviews</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/autoresizesSubviews">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoresizesSubviews")
    public native boolean autoresizesSubviews();

    /**
     * autoresizingMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/autoresizingMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("autoresizingMask")
    @NUInt
    public native long autoresizingMask();

    /**
     * backgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/backgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("backgroundColor")
    public native UIColor backgroundColor();

    @Generated
    @Selector("bounds")
    @ByValue
    public native CGRect bounds();

    /**
     * bringSubviewToFront:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/bringSubviewToFront:">iOS Dev Center</a>
     */
    @Generated
    @Selector("bringSubviewToFront:")
    public native void bringSubviewToFront(UIView view);

    @Generated
    @Selector("center")
    @ByValue
    public native CGPoint center();

    /**
     * clearsContextBeforeDrawing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/clearsContextBeforeDrawing">iOS Dev Center</a>
     */
    @Generated
    @Selector("clearsContextBeforeDrawing")
    public native boolean clearsContextBeforeDrawing();

    /**
     * clipsToBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/clipsToBounds">iOS Dev Center</a>
     */
    @Generated
    @Selector("clipsToBounds")
    public native boolean clipsToBounds();

    /**
     * constraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/constraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraints")
    public native NSArray<? extends NSLayoutConstraint> constraints();

    /**
     * constraintsAffectingLayoutForAxis:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/constraintsAffectingLayoutForAxis:">iOS Dev Center</a>
     */
    @Generated
    @Selector("constraintsAffectingLayoutForAxis:")
    public native NSArray<? extends NSLayoutConstraint> constraintsAffectingLayoutForAxis(@NInt long axis);

    /**
     * contentCompressionResistancePriorityForAxis:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/contentCompressionResistancePriorityForAxis:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentCompressionResistancePriorityForAxis:")
    public native float contentCompressionResistancePriorityForAxis(@NInt long axis);

    /**
     * contentHuggingPriorityForAxis:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/contentHuggingPriorityForAxis:">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentHuggingPriorityForAxis:")
    public native float contentHuggingPriorityForAxis(@NInt long axis);

    /**
     * contentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentMode")
    @NInt
    public native long contentMode();

    /**
     * contentScaleFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentScaleFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("contentScaleFactor")
    @NFloat
    public native double contentScaleFactor();

    /**
     * contentStretch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentStretch">iOS Dev Center</a>
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
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertPoint:fromView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/convertPoint:fromView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:fromView:")
    @ByValue
    public native CGPoint convertPointFromView(@ByValue CGPoint point, UIView view);

    @Generated
    @Selector("convertPoint:toCoordinateSpace:")
    @ByValue
    public native CGPoint convertPointToCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertPoint:toView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/convertPoint:toView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:toView:")
    @ByValue
    public native CGPoint convertPointToView(@ByValue CGPoint point, UIView view);

    @Generated
    @Selector("convertRect:fromCoordinateSpace:")
    @ByValue
    public native CGRect convertRectFromCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertRect:fromView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/convertRect:fromView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertRect:fromView:")
    @ByValue
    public native CGRect convertRectFromView(@ByValue CGRect rect, UIView view);

    @Generated
    @Selector("convertRect:toCoordinateSpace:")
    @ByValue
    public native CGRect convertRectToCoordinateSpace(@ByValue CGRect rect,
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertRect:toView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/convertRect:toView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertRect:toView:")
    @ByValue
    public native CGRect convertRectToView(@ByValue CGRect rect, UIView view);

    /**
     * decodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/decodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder(NSCoder coder);

    /**
     * didAddSubview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/didAddSubview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("didAddSubview:")
    public native void didAddSubview(UIView subview);

    /**
     * didMoveToSuperview</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/didMoveToSuperview">iOS Dev Center</a>
     */
    @Generated
    @Selector("didMoveToSuperview")
    public native void didMoveToSuperview();

    /**
     * didMoveToWindow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/didMoveToWindow">iOS Dev Center</a>
     */
    @Generated
    @Selector("didMoveToWindow")
    public native void didMoveToWindow();

    /**
     * drawRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/drawRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawRect:")
    public native void drawRect(@ByValue CGRect rect);

    /**
     * drawRect:forViewPrintFormatter:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/drawRect:forViewPrintFormatter:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawRect:forViewPrintFormatter:")
    public native void drawRectForViewPrintFormatter(@ByValue CGRect rect, UIViewPrintFormatter formatter);

    /**
     * drawViewHierarchyInRect:afterScreenUpdates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/drawViewHierarchyInRect:afterScreenUpdates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchyInRectAfterScreenUpdates(@ByValue CGRect rect, boolean afterUpdates);

    /**
     * encodeRestorableStateWithCoder:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/encodeRestorableStateWithCoder:">iOS Dev Center</a>
     */
    @Generated
    @Selector("encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder(NSCoder coder);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * endEditing:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/endEditing:">iOS Dev Center</a>
     */
    @Generated
    @Selector("endEditing:")
    public native boolean endEditing(boolean force);

    /**
     * exchangeSubviewAtIndex:withSubviewAtIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/exchangeSubviewAtIndex:withSubviewAtIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubviewAtIndexWithSubviewAtIndex(@NInt long index1, @NInt long index2);

    /**
     * exerciseAmbiguityInLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/exerciseAmbiguityInLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();

    /**
     * frame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/frame">iOS Dev Center</a>
     */
    @Generated
    @Selector("frame")
    @ByValue
    public native CGRect frame();

    /**
     * frameForAlignmentRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/frameForAlignmentRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("frameForAlignmentRect:")
    @ByValue
    public native CGRect frameForAlignmentRect(@ByValue CGRect alignmentRect);

    /**
     * gestureRecognizerShouldBegin:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/gestureRecognizerShouldBegin:">iOS Dev Center</a>
     */
    @Generated
    @Selector("gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin(UIGestureRecognizer gestureRecognizer);

    /**
     * gestureRecognizers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/gestureRecognizers">iOS Dev Center</a>
     */
    @Generated
    @Selector("gestureRecognizers")
    public native NSArray<? extends UIGestureRecognizer> gestureRecognizers();

    /**
     * hasAmbiguousLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/hasAmbiguousLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();

    /**
     * hitTest:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/hitTest:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("hitTest:withEvent:")
    public native UIView hitTestWithEvent(@ByValue CGPoint point, UIEvent event);

    @Generated
    @Selector("init")
    public native UIView init();

    @Generated
    @Selector("initWithCoder:")
    public native UIView initWithCoder(NSCoder aDecoder);

    /**
     * initWithFrame:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/initWithFrame:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithFrame:")
    public native UIView initWithFrame(@ByValue CGRect frame);

    /**
     * insertSubview:aboveSubview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/insertSubview:aboveSubview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertSubview:aboveSubview:")
    public native void insertSubviewAboveSubview(UIView view, UIView siblingSubview);

    /**
     * insertSubview:atIndex:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/insertSubview:atIndex:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertSubview:atIndex:")
    public native void insertSubviewAtIndex(UIView view, @NInt long index);

    /**
     * insertSubview:belowSubview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/insertSubview:belowSubview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("insertSubview:belowSubview:")
    public native void insertSubviewBelowSubview(UIView view, UIView siblingSubview);

    /**
     * intrinsicContentSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/intrinsicContentSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("intrinsicContentSize")
    @ByValue
    public native CGSize intrinsicContentSize();

    /**
     * invalidateIntrinsicContentSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/invalidateIntrinsicContentSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();

    /**
     * isDescendantOfView:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/isDescendantOfView:">iOS Dev Center</a>
     */
    @Generated
    @Selector("isDescendantOfView:")
    public native boolean isDescendantOfView(UIView view);

    /**
     * exclusiveTouch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/exclusiveTouch">iOS Dev Center</a>
     */
    @Generated
    @Selector("isExclusiveTouch")
    public native boolean isExclusiveTouch();

    /**
     * exclusiveTouch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/exclusiveTouch">iOS Dev Center</a>
     */
    @Generated
    @Selector("setExclusiveTouch:")
    public native void setExclusiveTouch(boolean value);

    /**
     * hidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/hidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("isHidden")
    public native boolean isHidden();

    /**
     * hidden</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/hidden">iOS Dev Center</a>
     */
    @Generated
    @Selector("setHidden:")
    public native void setHidden(boolean value);

    /**
     * multipleTouchEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/multipleTouchEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();

    /**
     * multipleTouchEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/multipleTouchEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean value);

    /**
     * opaque</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/opaque">iOS Dev Center</a>
     */
    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    /**
     * opaque</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/opaque">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * userInteractionEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/userInteractionEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();

    /**
     * userInteractionEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/userInteractionEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean value);

    /**
     * layer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/layer">iOS Dev Center</a>
     */
    @Generated
    @Selector("layer")
    public native CALayer layer();

    /**
     * layoutIfNeeded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/layoutIfNeeded">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutIfNeeded")
    public native void layoutIfNeeded();

    /**
     * layoutMargins</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/layoutMargins">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutMargins")
    @ByValue
    public native UIEdgeInsets layoutMargins();

    /**
     * layoutMarginsDidChange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/layoutMarginsDidChange">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutMarginsDidChange")
    public native void layoutMarginsDidChange();

    /**
     * layoutSubviews</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/layoutSubviews">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutSubviews")
    public native void layoutSubviews();

    /**
     * maskView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/maskView">iOS Dev Center</a>
     */
    @Generated
    @Selector("maskView")
    public native UIView maskView();

    /**
     * motionEffects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/motionEffects">iOS Dev Center</a>
     */
    @Generated
    @Selector("motionEffects")
    public native NSArray<? extends UIMotionEffect> motionEffects();

    /**
     * needsUpdateConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/needsUpdateConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("needsUpdateConstraints")
    public native boolean needsUpdateConstraints();

    /**
     * pointInside:withEvent:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/pointInside:withEvent:">iOS Dev Center</a>
     */
    @Generated
    @Selector("pointInside:withEvent:")
    public native boolean pointInsideWithEvent(@ByValue CGPoint point, UIEvent event);

    /**
     * preservesSuperviewLayoutMargins</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/preservesSuperviewLayoutMargins">iOS Dev Center</a>
     */
    @Generated
    @Selector("preservesSuperviewLayoutMargins")
    public native boolean preservesSuperviewLayoutMargins();

    /**
     * removeConstraint:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeConstraint:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeConstraint:")
    public native void removeConstraint(NSLayoutConstraint constraint);

    /**
     * removeConstraints:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeConstraints:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeConstraints:")
    public native void removeConstraints(NSArray<? extends NSLayoutConstraint> constraints);

    /**
     * removeFromSuperview</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeFromSuperview">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeFromSuperview")
    public native void removeFromSuperview();

    /**
     * removeGestureRecognizer:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeGestureRecognizer:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeGestureRecognizer:")
    public native void removeGestureRecognizer(UIGestureRecognizer gestureRecognizer);

    /**
     * removeMotionEffect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeMotionEffect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeMotionEffect:")
    public native void removeMotionEffect(UIMotionEffect effect);

    /**
     * resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:">iOS Dev Center</a>
     */
    @Generated
    @Selector("resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView resizableSnapshotViewFromRectAfterScreenUpdatesWithCapInsets(@ByValue CGRect rect,
            boolean afterUpdates, @ByValue UIEdgeInsets capInsets);

    /**
     * restorationIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/restorationIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("restorationIdentifier")
    public native String restorationIdentifier();

    /**
     * sendSubviewToBack:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/sendSubviewToBack:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sendSubviewToBack:")
    public native void sendSubviewToBack(UIView view);

    @Generated
    @Selector("setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(String value);

    /**
     * alpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/alpha">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(@NFloat double value);

    /**
     * autoresizesSubviews</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/autoresizesSubviews">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean value);

    /**
     * autoresizingMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/autoresizingMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAutoresizingMask:")
    public native void setAutoresizingMask(@NUInt long value);

    /**
     * backgroundColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/backgroundColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(UIColor value);

    /**
     * bounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/bounds">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBounds:")
    public native void setBounds(@ByValue CGRect value);

    @Generated
    @Selector("setCenter:")
    public native void setCenter(@ByValue CGPoint value);

    /**
     * clearsContextBeforeDrawing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/clearsContextBeforeDrawing">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean value);

    /**
     * clipsToBounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/clipsToBounds">iOS Dev Center</a>
     */
    @Generated
    @Selector("setClipsToBounds:")
    public native void setClipsToBounds(boolean value);

    /**
     * setContentCompressionResistancePriority:forAxis:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setContentCompressionResistancePriority:forAxis:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriorityForAxis(float priority, @NInt long axis);

    /**
     * setContentHuggingPriority:forAxis:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setContentHuggingPriority:forAxis:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriorityForAxis(float priority, @NInt long axis);

    /**
     * contentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentMode:")
    public native void setContentMode(@NInt long value);

    /**
     * contentScaleFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentScaleFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setContentScaleFactor:")
    public native void setContentScaleFactor(@NFloat double value);

    /**
     * contentStretch</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/contentStretch">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @Selector("setContentStretch:")
    public native void setContentStretch(@ByValue CGRect value);

    /**
     * frame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/frame">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFrame:")
    public native void setFrame(@ByValue CGRect value);

    /**
     * gestureRecognizers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/gestureRecognizers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray<? extends UIGestureRecognizer> value);

    /**
     * layoutMargins</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/layoutMargins">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLayoutMargins:")
    public native void setLayoutMargins(@ByValue UIEdgeInsets value);

    /**
     * maskView</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/maskView">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaskView:")
    public native void setMaskView(UIView value);

    /**
     * motionEffects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/motionEffects">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMotionEffects:")
    public native void setMotionEffects(NSArray<? extends UIMotionEffect> value);

    /**
     * setNeedsDisplay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setNeedsDisplay">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsDisplay")
    public native void setNeedsDisplay();

    /**
     * setNeedsDisplayInRect:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setNeedsDisplayInRect:">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsDisplayInRect:")
    public native void setNeedsDisplayInRect(@ByValue CGRect rect);

    /**
     * setNeedsLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setNeedsLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsLayout")
    public native void setNeedsLayout();

    /**
     * setNeedsUpdateConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/setNeedsUpdateConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();

    /**
     * preservesSuperviewLayoutMargins</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/preservesSuperviewLayoutMargins">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPreservesSuperviewLayoutMargins:")
    public native void setPreservesSuperviewLayoutMargins(boolean value);

    /**
     * restorationIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/restorationIdentifier">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRestorationIdentifier:")
    public native void setRestorationIdentifier(String value);

    /**
     * tag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tag">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTag:")
    public native void setTag(@NInt long value);

    /**
     * tintAdjustmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tintAdjustmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(@NInt long value);

    /**
     * tintColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tintColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(UIColor value);

    @Generated
    @Selector("setTransform:")
    public native void setTransform(@ByValue CGAffineTransform value);

    /**
     * translatesAutoresizingMaskIntoConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/translatesAutoresizingMaskIntoConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean value);

    /**
     * sizeThatFits:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/sizeThatFits:">iOS Dev Center</a>
     */
    @Generated
    @Selector("sizeThatFits:")
    @ByValue
    public native CGSize sizeThatFits(@ByValue CGSize size);

    /**
     * sizeToFit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/sizeToFit">iOS Dev Center</a>
     */
    @Generated
    @Selector("sizeToFit")
    public native void sizeToFit();

    /**
     * snapshotViewAfterScreenUpdates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/snapshotViewAfterScreenUpdates:">iOS Dev Center</a>
     */
    @Generated
    @Selector("snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates(boolean afterUpdates);

    /**
     * subviews</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/subviews">iOS Dev Center</a>
     */
    @Generated
    @Selector("subviews")
    public native NSArray<? extends UIView> subviews();

    /**
     * superview</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/superview">iOS Dev Center</a>
     */
    @Generated
    @Selector("superview")
    public native UIView superview();

    /**
     * systemLayoutSizeFittingSize:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/systemLayoutSizeFittingSize:">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemLayoutSizeFittingSize:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSize(@ByValue CGSize targetSize);

    /**
     * systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemLayoutSizeFittingSize:withHorizontalFittingPriority:verticalFittingPriority:")
    @ByValue
    public native CGSize systemLayoutSizeFittingSizeWithHorizontalFittingPriorityVerticalFittingPriority(
            @ByValue CGSize targetSize, float horizontalFittingPriority, float verticalFittingPriority);

    /**
     * tag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tag">iOS Dev Center</a>
     */
    @Generated
    @Selector("tag")
    @NInt
    public native long tag();

    /**
     * tintAdjustmentMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tintAdjustmentMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("tintAdjustmentMode")
    @NInt
    public native long tintAdjustmentMode();

    /**
     * tintColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/tintColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * tintColorDidChange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/tintColorDidChange">iOS Dev Center</a>
     */
    @Generated
    @Selector("tintColorDidChange")
    public native void tintColorDidChange();

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
     * translatesAutoresizingMaskIntoConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/translatesAutoresizingMaskIntoConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();

    /**
     * updateConstraints</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/updateConstraints">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateConstraints")
    public native void updateConstraints();

    /**
     * updateConstraintsIfNeeded</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/updateConstraintsIfNeeded">iOS Dev Center</a>
     */
    @Generated
    @Selector("updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();

    /**
     * viewForBaselineLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/viewForBaselineLayout">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("viewForBaselineLayout")
    public native UIView viewForBaselineLayout();

    /**
     * viewPrintFormatter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/viewPrintFormatter">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewPrintFormatter")
    public native UIViewPrintFormatter viewPrintFormatter();

    /**
     * viewWithTag:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/viewWithTag:">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewWithTag:")
    public native UIView viewWithTag(@NInt long tag);

    /**
     * willMoveToSuperview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/willMoveToSuperview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willMoveToSuperview:")
    public native void willMoveToSuperview(UIView newSuperview);

    /**
     * willMoveToWindow:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/willMoveToWindow:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willMoveToWindow:")
    public native void willMoveToWindow(UIWindow newWindow);

    /**
     * willRemoveSubview:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/willRemoveSubview:">iOS Dev Center</a>
     */
    @Generated
    @Selector("willRemoveSubview:")
    public native void willRemoveSubview(UIView subview);

    /**
     * window</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/window">iOS Dev Center</a>
     */
    @Generated
    @Selector("window")
    public native UIWindow window();

    /**
     * addLayoutGuide:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/addLayoutGuide:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addLayoutGuide:")
    public native void addLayoutGuide(UILayoutGuide layoutGuide);

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    @MappedReturn(ObjCObjectMapper.class)
    public Object _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * bottomAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/bottomAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("bottomAnchor")
    public native NSLayoutYAxisAnchor bottomAnchor();

    /**
     * centerXAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/centerXAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("centerXAnchor")
    public native NSLayoutXAxisAnchor centerXAnchor();

    /**
     * centerYAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/centerYAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("centerYAnchor")
    public native NSLayoutYAxisAnchor centerYAnchor();

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
     * firstBaselineAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/firstBaselineAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("firstBaselineAnchor")
    public native NSLayoutYAxisAnchor firstBaselineAnchor();

    /**
     * heightAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/heightAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("heightAnchor")
    public native NSLayoutDimension heightAnchor();

    /**
     * lastBaselineAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/lastBaselineAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("lastBaselineAnchor")
    public native NSLayoutYAxisAnchor lastBaselineAnchor();

    /**
     * layoutGuides</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/layoutGuides">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutGuides")
    public native NSArray<? extends UILayoutGuide> layoutGuides();

    /**
     * layoutMarginsGuide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/layoutMarginsGuide">iOS Dev Center</a>
     */
    @Generated
    @Selector("layoutMarginsGuide")
    public native UILayoutGuide layoutMarginsGuide();

    /**
     * leadingAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/leadingAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("leadingAnchor")
    public native NSLayoutXAxisAnchor leadingAnchor();

    /**
     * leftAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/leftAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("leftAnchor")
    public native NSLayoutXAxisAnchor leftAnchor();

    /**
     * readableContentGuide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/readableContentGuide">iOS Dev Center</a>
     */
    @Generated
    @Selector("readableContentGuide")
    public native UILayoutGuide readableContentGuide();

    /**
     * removeLayoutGuide:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/removeLayoutGuide:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeLayoutGuide:")
    public native void removeLayoutGuide(UILayoutGuide layoutGuide);

    /**
     * rightAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/rightAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("rightAnchor")
    public native NSLayoutXAxisAnchor rightAnchor();

    /**
     * semanticContentAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/semanticContentAttribute">iOS Dev Center</a>
     */
    @Generated
    @Selector("semanticContentAttribute")
    @NInt
    public native long semanticContentAttribute();

    /**
     * semanticContentAttribute</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/semanticContentAttribute">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSemanticContentAttribute:")
    public native void setSemanticContentAttribute(@NInt long value);

    /**
     * topAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/topAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("topAnchor")
    public native NSLayoutYAxisAnchor topAnchor();

    /**
     * trailingAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/trailingAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("trailingAnchor")
    public native NSLayoutXAxisAnchor trailingAnchor();

    /**
     * viewForFirstBaselineLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/viewForFirstBaselineLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewForFirstBaselineLayout")
    public native UIView viewForFirstBaselineLayout();

    /**
     * viewForLastBaselineLayout</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/viewForLastBaselineLayout">iOS Dev Center</a>
     */
    @Generated
    @Selector("viewForLastBaselineLayout")
    public native UIView viewForLastBaselineLayout();

    /**
     * widthAnchor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/widthAnchor">iOS Dev Center</a>
     */
    @Generated
    @Selector("widthAnchor")
    public native NSLayoutDimension widthAnchor();

    /**
     * canBecomeFocused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instm/UIView/canBecomeFocused">iOS Dev Center</a>
     */
    @Generated
    @Selector("canBecomeFocused")
    public native boolean canBecomeFocused();

    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    /**
     * focused</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIView_Class/index.html#//apple_ref/occ/instp/UIView/focused">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFocused")
    public native boolean isFocused();

    @Generated
    @Selector("preferredFocusedView")
    public native UIView preferredFocusedView();

    @Generated
    @Selector("setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();

    @Generated
    @Selector("shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    @Generated
    @Selector("updateFocusIfNeeded")
    public native void updateFocusIfNeeded();

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
}

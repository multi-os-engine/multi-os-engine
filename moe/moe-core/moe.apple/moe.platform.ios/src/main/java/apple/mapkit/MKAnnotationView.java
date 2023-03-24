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

package apple.mapkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mapkit.protocol.MKAnnotation;
import apple.uikit.UIImage;
import apple.uikit.UITraitCollection;
import apple.uikit.UIView;
import apple.uikit.protocol.UIAppearanceContainer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 3.0
 */
@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKAnnotationView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected MKAnnotationView(Pointer peer) {
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
    public static native MKAnnotationView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKAnnotationView allocWithZone(VoidPtr zone);

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
    public static native MKAnnotationView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native MKAnnotationView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native MKAnnotationView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native MKAnnotationView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native MKAnnotationView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native MKAnnotationView appearanceWhenContainedInInstancesOfClasses(
            @NotNull NSArray<?> containerTypes);

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
    public static native MKAnnotationView new_objc();

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

    @Nullable
    @Generated
    @Selector("annotation")
    @MappedReturn(ObjCObjectMapper.class)
    public native MKAnnotation annotation();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public MKAnnotationView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public MKAnnotationView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public MKAnnotationView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public MKAnnotationView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public MKAnnotationView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public MKAnnotationView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * calloutOffset is the offset in screen points from the top-middle of the annotation view, where the anchor of the
     * callout should be shown.
     */
    @Generated
    @Selector("calloutOffset")
    @ByValue
    public native CGPoint calloutOffset();

    /**
     * If YES, a standard callout bubble will be shown when the annotation is selected.
     * The annotation must have a title for the callout to be shown.
     */
    @Generated
    @Selector("canShowCallout")
    public native boolean canShowCallout();

    /**
     * By default, the center of annotation view is placed over the coordinate of the annotation.
     * centerOffset is the offset in screen points from the center of the annotion view.
     */
    @Generated
    @Selector("centerOffset")
    @ByValue
    public native CGPoint centerOffset();

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("detailCalloutAccessoryView")
    public native UIView detailCalloutAccessoryView();

    /**
     * Automatically set to MKAnnotationViewDragStateStarting, Canceling, and Ending when necessary.
     * Implementer is responsible for transitioning to Dragging and None states as appropriate.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("dragState")
    @NUInt
    public native long dragState();

    @Nullable
    @Generated
    @Selector("image")
    public native UIImage image();

    @Generated
    @Selector("init")
    public native MKAnnotationView init();

    @Generated
    @Selector("initWithAnnotation:reuseIdentifier:")
    public native MKAnnotationView initWithAnnotationReuseIdentifier(
            @Nullable @Mapped(ObjCObjectMapper.class) MKAnnotation annotation, @Nullable String reuseIdentifier);

    @Generated
    @Selector("initWithCoder:")
    public native MKAnnotationView initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithFrame:")
    public native MKAnnotationView initWithFrame(@ByValue CGRect frame);

    /**
     * If YES and the underlying id<MKAnnotation> responds to setCoordinate:,
     * the user will be able to drag this annotation view around the map.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("isDraggable")
    public native boolean isDraggable();

    /**
     * If YES and the underlying id<MKAnnotation> responds to setCoordinate:,
     * the user will be able to drag this annotation view around the map.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setDraggable:")
    public native void setDraggable(boolean value);

    /**
     * Defaults to YES. If NO, ignores touch events and subclasses may draw differently.
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * Defaults to YES. If NO, ignores touch events and subclasses may draw differently.
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * Defaults to NO. This gets set/cleared automatically when touch enters/exits during tracking and cleared on up.
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * Defaults to NO. This gets set/cleared automatically when touch enters/exits during tracking and cleared on up.
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * Defaults to NO. Becomes YES when tapped/clicked on in the map view.
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * Defaults to NO. Becomes YES when tapped/clicked on in the map view.
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    @Nullable
    @Generated
    @Selector("leftCalloutAccessoryView")
    public native UIView leftCalloutAccessoryView();

    /**
     * Classes that override must call super.
     */
    @Generated
    @Selector("prepareForReuse")
    public native void prepareForReuse();

    @Nullable
    @Generated
    @Selector("reuseIdentifier")
    public native String reuseIdentifier();

    @Nullable
    @Generated
    @Selector("rightCalloutAccessoryView")
    public native UIView rightCalloutAccessoryView();

    @Generated
    @Selector("setAnnotation:")
    public native void setAnnotation(@Nullable @Mapped(ObjCObjectMapper.class) MKAnnotation value);

    /**
     * calloutOffset is the offset in screen points from the top-middle of the annotation view, where the anchor of the
     * callout should be shown.
     */
    @Generated
    @Selector("setCalloutOffset:")
    public native void setCalloutOffset(@ByValue CGPoint value);

    /**
     * If YES, a standard callout bubble will be shown when the annotation is selected.
     * The annotation must have a title for the callout to be shown.
     */
    @Generated
    @Selector("setCanShowCallout:")
    public native void setCanShowCallout(boolean value);

    /**
     * By default, the center of annotation view is placed over the coordinate of the annotation.
     * centerOffset is the offset in screen points from the center of the annotion view.
     */
    @Generated
    @Selector("setCenterOffset:")
    public native void setCenterOffset(@ByValue CGPoint value);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setDetailCalloutAccessoryView:")
    public native void setDetailCalloutAccessoryView(@Nullable UIView value);

    /**
     * Automatically set to MKAnnotationViewDragStateStarting, Canceling, and Ending when necessary.
     * Implementer is responsible for transitioning to Dragging and None states as appropriate.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setDragState:")
    public native void setDragState(@NUInt long value);

    /**
     * Developers targeting iOS 4.2 and after must use setDragState:animated: instead of setDragState:.
     * 
     * API-Since: 4.2
     */
    @Generated
    @Selector("setDragState:animated:")
    public native void setDragStateAnimated(@NUInt long newDragState, boolean animated);

    @Generated
    @Selector("setImage:")
    public native void setImage(@Nullable UIImage value);

    @Generated
    @Selector("setLeftCalloutAccessoryView:")
    public native void setLeftCalloutAccessoryView(@Nullable UIView value);

    @Generated
    @Selector("setRightCalloutAccessoryView:")
    public native void setRightCalloutAccessoryView(@Nullable UIView value);

    @Generated
    @Selector("setSelected:animated:")
    public native void setSelectedAnimated(boolean selected, boolean animated);

    /**
     * If non-nil this is the annotation view this view is clustered into.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("clusterAnnotationView")
    public native MKAnnotationView clusterAnnotationView();

    /**
     * Annotation views with equal non-nil identifiers can cluster together.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("clusteringIdentifier")
    public native String clusteringIdentifier();

    /**
     * Default collision mode is rectangle.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("collisionMode")
    @NInt
    public native long collisionMode();

    /**
     * Default is MKFeatureDisplayPriorityRequired, other values opts into collision occlusion by priority.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("displayPriority")
    public native float displayPriority();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("prepareForDisplay")
    public native void prepareForDisplay();

    /**
     * Annotation views with equal non-nil identifiers can cluster together.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setClusteringIdentifier:")
    public native void setClusteringIdentifier(@Nullable String value);

    /**
     * Default collision mode is rectangle.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setCollisionMode:")
    public native void setCollisionMode(@NInt long value);

    /**
     * Default is MKFeatureDisplayPriorityRequired, other values opts into collision occlusion by priority.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDisplayPriority:")
    public native void setDisplayPriority(float value);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("selectedZPriority")
    public native float selectedZPriority();

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSelectedZPriority:")
    public native void setSelectedZPriority(float value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("setZPriority:")
    public native void setZPriority(float value);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("zPriority")
    public native float zPriority();
}

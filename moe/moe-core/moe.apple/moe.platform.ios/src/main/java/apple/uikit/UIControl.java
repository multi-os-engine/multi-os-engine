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
import apple.uikit.protocol.UIContextMenuInteractionAnimating;
import apple.uikit.protocol.UIContextMenuInteractionCommitAnimating;
import apple.uikit.protocol.UIContextMenuInteractionDelegate;
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
import org.moe.natj.general.ptr.BoolPtr;
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
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * ______________________________________________________
 * 
 * API-Since: 2.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIControl extends UIView implements UIContextMenuInteractionDelegate {
    static {
        NatJ.register();
    }

    @Generated
    protected UIControl(Pointer peer) {
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
    public static native UIControl alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIControl allocWithZone(VoidPtr zone);

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
    public static native UIControl appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UIControl appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UIControl appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UIControl appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UIControl appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UIControl appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native UIControl new_objc();

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
     * single event. returns NSArray of NSString selector names. returns nil if none
     */
    @Nullable
    @Generated
    @Selector("actionsForTarget:forControlEvent:")
    public native NSArray<String> actionsForTargetForControlEvent(
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @NUInt long controlEvent);

    /**
     * add target/action for particular event. you can call this multiple times and you can specify multiple
     * target/actions for a particular event.
     * passing in nil as the target goes up the responder chain. The action may optionally include the sender and the
     * event in that order
     * the action cannot be NULL. Note that the target is not retained.
     */
    @Generated
    @Selector("addTarget:action:forControlEvents:")
    public native void addTargetActionForControlEvents(@Nullable @Mapped(ObjCObjectMapper.class) Object target,
            @NotNull SEL action, @NUInt long controlEvents);

    /**
     * list of all events that have at least one action
     */
    @Generated
    @Selector("allControlEvents")
    @NUInt
    public native long allControlEvents();

    /**
     * set may include NSNull to indicate at least one nil target
     */
    @NotNull
    @Generated
    @Selector("allTargets")
    public native NSSet<?> allTargets();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public UIControl _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UIControl _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UIControl _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UIControl _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UIControl _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UIControl _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @Generated
    @Selector("beginTrackingWithTouch:withEvent:")
    public native boolean beginTrackingWithTouchWithEvent(@NotNull UITouch touch, @Nullable UIEvent event);

    /**
     * event may be nil if cancelled for non-event reasons, e.g. removed from window
     */
    @Generated
    @Selector("cancelTrackingWithEvent:")
    public native void cancelTrackingWithEvent(@Nullable UIEvent event);

    /**
     * how to position content horizontally inside control. default is center
     */
    @Generated
    @Selector("contentHorizontalAlignment")
    @NInt
    public native long contentHorizontalAlignment();

    /**
     * how to position content vertically inside control. default is center
     */
    @Generated
    @Selector("contentVerticalAlignment")
    @NInt
    public native long contentVerticalAlignment();

    @Generated
    @Selector("continueTrackingWithTouch:withEvent:")
    public native boolean continueTrackingWithTouchWithEvent(@NotNull UITouch touch, @Nullable UIEvent event);

    /**
     * touch is sometimes nil if cancelTracking calls through to this.
     */
    @Generated
    @Selector("endTrackingWithTouch:withEvent:")
    public native void endTrackingWithTouchWithEvent(@Nullable UITouch touch, @Nullable UIEvent event);

    @Generated
    @Selector("init")
    public native UIControl init();

    @Generated
    @Selector("initWithCoder:")
    public native UIControl initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UIControl initWithFrame(@ByValue CGRect frame);

    /**
     * default is YES. if NO, ignores touch events and subclasses may draw differently
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * default is YES. if NO, ignores touch events and subclasses may draw differently
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * default is NO. this gets set/cleared automatically when touch enters/exits during tracking and cleared on up
     */
    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    /**
     * default is NO. this gets set/cleared automatically when touch enters/exits during tracking and cleared on up
     */
    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * default is NO may be used by some subclasses or by application
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * default is NO may be used by some subclasses or by application
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    /**
     * valid during tracking only
     */
    @Generated
    @Selector("isTouchInside")
    public native boolean isTouchInside();

    @Generated
    @Selector("isTracking")
    public native boolean isTracking();

    /**
     * remove the target/action for a set of events. pass in NULL for the action to remove all actions for that target
     */
    @Generated
    @Selector("removeTarget:action:forControlEvents:")
    public native void removeTargetActionForControlEvents(@Nullable @Mapped(ObjCObjectMapper.class) Object target,
            @Nullable SEL action, @NUInt long controlEvents);

    /**
     * Dispatch the target-action pair. This method is called repeatedly by -sendActionsForControlEvents: and is a point
     * at which you can observe or override behavior.
     */
    @Generated
    @Selector("sendAction:to:forEvent:")
    public native void sendActionToForEvent(@NotNull SEL action,
            @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable UIEvent event);

    /**
     * send all actions associated with the given control events
     */
    @Generated
    @Selector("sendActionsForControlEvents:")
    public native void sendActionsForControlEvents(@NUInt long controlEvents);

    /**
     * how to position content horizontally inside control. default is center
     */
    @Generated
    @Selector("setContentHorizontalAlignment:")
    public native void setContentHorizontalAlignment(@NInt long value);

    /**
     * how to position content vertically inside control. default is center
     */
    @Generated
    @Selector("setContentVerticalAlignment:")
    public native void setContentVerticalAlignment(@NInt long value);

    /**
     * could be more than one state (e.g. disabled|selected). synthesized from other flags.
     */
    @Generated
    @Selector("state")
    @NUInt
    public native long state();

    /**
     * <h1>Abstract:</h1>
     * <p>Adds a action for a particular event (or events) to an internal dispatch
     * table.</p>
     *
     * @param targetAction  <p>The targetAction object&mdash;that is, the object to which the action message is
     *                      sent.</p>
     * @param controlEvents <p>A bitmask specifying the control events for which the action message is sent. See
     *                      &ldquo;Control Events&rdquo; for bitmask constants.</p>
     * @see ITargetAction
     */
    public <T> void addTargetActionForControlEvents(ITargetAction<T> targetAction, @NUInt long controlEvents) {
        if (targetAction != null) {
            TargetActionProxy<T> proxy = new TargetActionProxy<T>(targetAction, controlEvents);
            ObjCRuntime.associateObjCObject(this, proxy);
            addTargetActionForControlEvents(proxy, new SEL("proxySelector::"), controlEvents);
        }
    }

    /**
     * <h1>Abstract:</h1>
     * <p>Removes a targetAction for a particular event (or events) from an internal dispatch
     * table.</p>
     *
     * @param targetAction  <p>The targetAction object&mdash;that is, the object to which the action message is
     *                      sent.</p>
     * @param controlEvents <p>A bitmask specifying the control events associated with
     *                      <i>target</i> and
     *                      <i>action</i>. See &ldquo;Control Events&rdquo;
     *                      for bitmask constants.</p>
     * @see ITargetAction
     */
    public void removeTargetActionForControlEvents(ITargetAction<?> targetAction, @NUInt long controlEvents) {
        NSSet<?> targets = allTargets();
        for (Object o : targets.allObjects()) {
            if (o instanceof TargetActionProxy<?>) {
                TargetActionProxy<?> proxy = (TargetActionProxy<?>)o;
                if (proxy.targetAction != null && proxy.targetAction.equals(targetAction) && proxy.controlEvents
                        == controlEvents) {
                    removeTargetActionForControlEvents(proxy, new SEL("proxySelector::"), controlEvents);
                    ObjCRuntime.dissociateObjCObject(this, proxy);
                }
            }
        }
    }

    /**
     * how to position content horizontally inside control, guaranteed to return 'left' or 'right' for any 'leading' or
     * 'trailing'
     */
    @Generated
    @Selector("effectiveContentHorizontalAlignment")
    @NInt
    public native long effectiveContentHorizontalAlignment();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * Adds the UIAction to a given event. UIActions are uniqued based on their identifier, and subsequent actions with
     * the same identifier replace previously added actions. You may add multiple UIActions for corresponding
     * controlEvents, and you may add the same action to multiple controlEvents.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("addAction:forControlEvents:")
    public native void addActionForControlEvents(@NotNull UIAction action, @NUInt long controlEvents);

    /**
     * Returns a UIContextMenuInteraction with this control set as its delegate. Before constructing the
     * UIContextMenuInteraction, UIControl verifies 'self' is a viable delegate. See 'Implementing UIControl Menus'
     * below for more details.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("contextMenuInteraction")
    public native UIContextMenuInteraction contextMenuInteraction();

    @Nullable
    @Generated
    @Selector("contextMenuInteraction:configurationForMenuAtLocation:")
    public native UIContextMenuConfiguration contextMenuInteractionConfigurationForMenuAtLocation(
            @NotNull UIContextMenuInteraction interaction, @ByValue CGPoint location);

    @Nullable
    @Generated
    @Selector("contextMenuInteraction:previewForDismissingMenuWithConfiguration:")
    public native UITargetedPreview contextMenuInteractionPreviewForDismissingMenuWithConfiguration(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration);

    @Nullable
    @Generated
    @Selector("contextMenuInteraction:previewForHighlightingMenuWithConfiguration:")
    public native UITargetedPreview contextMenuInteractionPreviewForHighlightingMenuWithConfiguration(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration);

    @Generated
    @Selector("contextMenuInteraction:willDisplayMenuForConfiguration:animator:")
    public native void contextMenuInteractionWillDisplayMenuForConfigurationAnimator(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @Selector("contextMenuInteraction:willEndForConfiguration:animator:")
    public native void contextMenuInteractionWillEndForConfigurationAnimator(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration,
            @Nullable @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionAnimating animator);

    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:willPerformPreviewActionForMenuWithConfiguration:animator:")
    public native void contextMenuInteractionWillPerformPreviewActionForMenuWithConfigurationAnimator(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) UIContextMenuInteractionCommitAnimating animator);

    /**
     * Iterate over the event handlers installed on this control at the time this method is called. For each call,
     * either actionHandler or action will be non-nil. controlEvents is always non-zero. Setting *stop to YES will
     * terminate the enumeration early. It is legal to manipulate the control's event handlers within the block.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("enumerateEventHandlers:")
    public native void enumerateEventHandlers(
            @NotNull @ObjCBlock(name = "call_enumerateEventHandlers") Block_enumerateEventHandlers iterator);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEventHandlers {
        @Generated
        void call_enumerateEventHandlers(@Nullable UIAction actionHandler,
                @Nullable @Mapped(ObjCObjectMapper.class) Object target, @Nullable SEL action,
                @NUInt long controlEvents, @NotNull BoolPtr stop);
    }

    /**
     * Initializes the control and adds primaryAction for the UIControlEventPrimaryActionTriggered control event.
     * Subclasses of UIControl may alter or add behaviors around the usage of primaryAction, see subclass documentation
     * of this initializer for additional information.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("initWithFrame:primaryAction:")
    public native UIControl initWithFramePrimaryAction(@ByValue CGRect frame, @Nullable UIAction primaryAction);

    /**
     * Specifies if the context menu interaction is enabled. NO by default.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isContextMenuInteractionEnabled")
    public native boolean isContextMenuInteractionEnabled();

    /**
     * Return a point in this control's coordinate space to which to attach the given configuration's menu.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("menuAttachmentPointForConfiguration:")
    @ByValue
    public native CGPoint menuAttachmentPointForConfiguration(@NotNull UIContextMenuConfiguration configuration);

    /**
     * Removes the action from the set of passed control events.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("removeAction:forControlEvents:")
    public native void removeActionForControlEvents(@NotNull UIAction action, @NUInt long controlEvents);

    /**
     * Removes the action with the provided identifier from the set of passed control events.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("removeActionForIdentifier:forControlEvents:")
    public native void removeActionForIdentifierForControlEvents(@NotNull String actionIdentifier,
            @NUInt long controlEvents);

    /**
     * Like -sendAction:to:forEvent:, this method is called by -sendActionsForControlEvents:. You may override this
     * method to observe or modify behavior. If you override this method, you should call super precisely once to
     * dispatch the action, or not call super to suppress sending that action.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("sendAction:")
    public native void sendAction(@NotNull UIAction action);

    /**
     * Specifies if the context menu interaction is enabled. NO by default.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setContextMenuInteractionEnabled:")
    public native void setContextMenuInteractionEnabled(boolean value);

    /**
     * If the contextMenuInteraction is the primary action of the control, invoked on touch-down. NO by default.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setShowsMenuAsPrimaryAction:")
    public native void setShowsMenuAsPrimaryAction(boolean value);

    /**
     * If the contextMenuInteraction is the primary action of the control, invoked on touch-down. NO by default.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("showsMenuAsPrimaryAction")
    public native boolean showsMenuAsPrimaryAction();

    /**
     * Assigning a value to this property causes the tool tip to be displayed for the view. Setting the property to nil
     * cancels the display of the tool tip for the view.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setToolTip:")
    public native void setToolTip(@Nullable String value);

    /**
     * Assigning a value to this property causes the tool tip to be displayed for the view. Setting the property to nil
     * cancels the display of the tool tip for the view.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("toolTip")
    public native String toolTip();

    /**
     * Returns the control's default UIToolTipInteraction.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("toolTipInteraction")
    public native UIToolTipInteraction toolTipInteraction();

    @Nullable
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:configuration:dismissalPreviewForItemWithIdentifier:")
    public native UITargetedPreview contextMenuInteractionConfigurationDismissalPreviewForItemWithIdentifier(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) Object identifier);

    @Nullable
    @Generated
    @IsOptional
    @Selector("contextMenuInteraction:configuration:highlightPreviewForItemWithIdentifier:")
    public native UITargetedPreview contextMenuInteractionConfigurationHighlightPreviewForItemWithIdentifier(
            @NotNull UIContextMenuInteraction interaction, @NotNull UIContextMenuConfiguration configuration,
            @NotNull @Mapped(ObjCObjectMapper.class) Object identifier);

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    /**
     * Whether or not symbol animations are enabled for this control.
     * The default value varies depending on the control.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("isSymbolAnimationEnabled")
    public native boolean isSymbolAnimationEnabled();

    /**
     * Whether or not symbol animations are enabled for this control.
     * The default value varies depending on the control.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setSymbolAnimationEnabled:")
    public native void setSymbolAnimationEnabled(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

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
import apple.uikit.protocol.UIContentConfiguration;
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
import apple.corefoundation.struct.CGRect;

/**
 * API-Since: 6.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITableViewHeaderFooterView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected UITableViewHeaderFooterView(Pointer peer) {
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
    public static native UITableViewHeaderFooterView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITableViewHeaderFooterView allocWithZone(VoidPtr zone);

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
    public static native UITableViewHeaderFooterView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UITableViewHeaderFooterView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UITableViewHeaderFooterView appearanceForTraitCollectionWhenContainedIn(
            UITraitCollection trait, @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UITableViewHeaderFooterView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UITableViewHeaderFooterView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UITableViewHeaderFooterView appearanceWhenContainedInInstancesOfClasses(
            NSArray<?> containerTypes);

    @Generated
    @Selector("areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("layerClass")
    public static native Class layerClass();

    @Generated
    @Owned
    @Selector("new")
    public static native UITableViewHeaderFooterView new_objc();

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
    public static native void setAnimationDelegate(@Mapped(ObjCObjectMapper.class) Object delegate);

    @Deprecated
    @Generated
    @Selector("setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(SEL selector);

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
    public static native void setAnimationStartDate(NSDate startDate);

    @Deprecated
    @Generated
    @Selector("setAnimationTransition:forView:cache:")
    public static native void setAnimationTransitionForViewCache(@NInt long transition, UIView view, boolean cache);

    @Deprecated
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

    @Generated
    @ProtocolClassMethod("appearance")
    public UITableViewHeaderFooterView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UITableViewHeaderFooterView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UITableViewHeaderFooterView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UITableViewHeaderFooterView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            UITraitCollection trait, NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UITableViewHeaderFooterView _appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UITableViewHeaderFooterView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * This property is always nil when a non-nil `backgroundConfiguration` is set.
     */
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    @Generated
    @Selector("contentView")
    public native UIView contentView();

    /**
     * only supported for headers in grouped style
     * 
     * API-Since: 6.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use UIListContentConfiguration instead, this property will be deprecated in a future release.
     */
    @Deprecated
    @Generated
    @Selector("detailTextLabel")
    public native UILabel detailTextLabel();

    @Generated
    @Selector("init")
    public native UITableViewHeaderFooterView init();

    @Generated
    @Selector("initWithCoder:")
    public native UITableViewHeaderFooterView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UITableViewHeaderFooterView initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("initWithReuseIdentifier:")
    public native UITableViewHeaderFooterView initWithReuseIdentifier(String reuseIdentifier);

    /**
     * if the view is reusable (has a reuse identifier), this is called just before the view is returned from the table
     * view method dequeueReusableHeaderFooterViewWithIdentifier:. If you override, you MUST call super.
     */
    @Generated
    @Selector("prepareForReuse")
    public native void prepareForReuse();

    @Generated
    @Selector("reuseIdentifier")
    public native String reuseIdentifier();

    /**
     * This property is always nil when a non-nil `backgroundConfiguration` is set.
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(UIView value);

    /**
     * These properties will always return nil when a non-nil `contentConfiguration` is set.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 100000.0
     * Deprecated-Message: Use UIListContentConfiguration instead, this property will be deprecated in a future release.
     */
    @Deprecated
    @Generated
    @Selector("textLabel")
    public native UILabel textLabel();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * When YES, the header/footer will automatically call -updatedConfigurationForState: on its
     * `backgroundConfiguration` when the header/footer's
     * configuration state changes, and apply the updated configuration back to the header/footer. The default value is
     * YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("automaticallyUpdatesBackgroundConfiguration")
    public native boolean automaticallyUpdatesBackgroundConfiguration();

    /**
     * When YES, the header/footer will automatically call -updatedConfigurationForState: on its `contentConfiguration`
     * when the header/footer's
     * configuration state changes, and apply the updated configuration back to the header/footer. The default value is
     * YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("automaticallyUpdatesContentConfiguration")
    public native boolean automaticallyUpdatesContentConfiguration();

    /**
     * Setting a background configuration supersedes the header/footer's backgroundView. The default value is nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("backgroundConfiguration")
    public native UIBackgroundConfiguration backgroundConfiguration();

    /**
     * Returns the current configuration state for the header/footer.
     * To add your own custom state(s), override the getter and call super to obtain an instance with the
     * system properties set, then set your own custom states as desired.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("configurationState")
    public native UIViewConfigurationState configurationState();

    /**
     * Setting a content configuration replaces the existing contentView of the header/footer with a new content view
     * instance from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the
     * existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the
     * current content view with a new content view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("contentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIContentConfiguration contentConfiguration();

    /**
     * Returns a default list content configuration for the header/footer view's style.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("defaultContentConfiguration")
    public native UIListContentConfiguration defaultContentConfiguration();

    /**
     * When YES, the header/footer will automatically call -updatedConfigurationForState: on its
     * `backgroundConfiguration` when the header/footer's
     * configuration state changes, and apply the updated configuration back to the header/footer. The default value is
     * YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAutomaticallyUpdatesBackgroundConfiguration:")
    public native void setAutomaticallyUpdatesBackgroundConfiguration(boolean value);

    /**
     * When YES, the header/footer will automatically call -updatedConfigurationForState: on its `contentConfiguration`
     * when the header/footer's
     * configuration state changes, and apply the updated configuration back to the header/footer. The default value is
     * YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAutomaticallyUpdatesContentConfiguration:")
    public native void setAutomaticallyUpdatesContentConfiguration(boolean value);

    /**
     * Setting a background configuration supersedes the header/footer's backgroundView. The default value is nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(UIBackgroundConfiguration value);

    /**
     * Setting a content configuration replaces the existing contentView of the header/footer with a new content view
     * instance from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the
     * existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the
     * current content view with a new content view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setContentConfiguration:")
    public native void setContentConfiguration(@Mapped(ObjCObjectMapper.class) UIContentConfiguration value);

    /**
     * Requests the view update its configuration for its current state. This method is called automatically
     * when the view's `configurationState` may have changed, as well as in other circumstances where an
     * update may be required. Multiple requests may be coalesced into a single update at the appropriate time.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();

    /**
     * Subclasses should override this method and update the view's configuration using the state provided.
     * This method should not be called directly, use `setNeedsUpdateConfiguration` to request an update.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("updateConfigurationUsingState:")
    public native void updateConfigurationUsingState(UIViewConfigurationState state);

    /**
     * Optional block-based alternative to overriding `-updateConfigurationUsingState:` in a subclass. This handler
     * is called after `-updateConfigurationUsingState:`. Setting a new handler triggers `setNeedsUpdateConfiguration`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("configurationUpdateHandler")
    @ObjCBlock(name = "call_configurationUpdateHandler_ret")
    public native Block_configurationUpdateHandler_ret configurationUpdateHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configurationUpdateHandler_ret {
        @Generated
        void call_configurationUpdateHandler_ret(UITableViewHeaderFooterView headerFooterView,
                UIViewConfigurationState state);
    }

    /**
     * Optional block-based alternative to overriding `-updateConfigurationUsingState:` in a subclass. This handler
     * is called after `-updateConfigurationUsingState:`. Setting a new handler triggers `setNeedsUpdateConfiguration`.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setConfigurationUpdateHandler:")
    public native void setConfigurationUpdateHandler(
            @ObjCBlock(name = "call_setConfigurationUpdateHandler") Block_setConfigurationUpdateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConfigurationUpdateHandler {
        @Generated
        void call_setConfigurationUpdateHandler(UITableViewHeaderFooterView headerFooterView,
                UIViewConfigurationState state);
    }

    /**
     * Returns a default background configuration for the header/footer's style.
     * This background configuration represents the default appearance that the header/footer will use.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("defaultBackgroundConfiguration")
    public native UIBackgroundConfiguration defaultBackgroundConfiguration();
}

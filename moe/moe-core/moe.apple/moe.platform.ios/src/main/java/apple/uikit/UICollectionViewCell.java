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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 6.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UICollectionViewCell extends UICollectionReusableView {
    static {
        NatJ.register();
    }

    @Generated
    protected UICollectionViewCell(Pointer peer) {
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
    public static native UICollectionViewCell alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UICollectionViewCell allocWithZone(VoidPtr zone);

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
    public static native UICollectionViewCell appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native UICollectionViewCell appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native UICollectionViewCell appearanceForTraitCollectionWhenContainedIn(
            @NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native UICollectionViewCell appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native UICollectionViewCell appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native UICollectionViewCell appearanceWhenContainedInInstancesOfClasses(
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
    public static native UICollectionViewCell new_objc();

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
    public UICollectionViewCell _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public UICollectionViewCell _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public UICollectionViewCell _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public UICollectionViewCell _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public UICollectionViewCell _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public UICollectionViewCell _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * These properties are always nil when a non-nil `backgroundConfiguration` is set.
     * The background view is a subview behind all other views.
     * If selectedBackgroundView is different than backgroundView, it will be placed above the background view and
     * animated in on selection.
     */
    @Nullable
    @Generated
    @Selector("backgroundView")
    public native UIView backgroundView();

    /**
     * add custom subviews to the cell's contentView
     */
    @NotNull
    @Generated
    @Selector("contentView")
    public native UIView contentView();

    @Generated
    @Selector("init")
    public native UICollectionViewCell init();

    @Generated
    @Selector("initWithCoder:")
    public native UICollectionViewCell initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native UICollectionViewCell initWithFrame(@ByValue CGRect frame);

    @Generated
    @Selector("isHighlighted")
    public native boolean isHighlighted();

    @Generated
    @Selector("setHighlighted:")
    public native void setHighlighted(boolean value);

    /**
     * Cells become highlighted when the user touches them.
     * The selected state is toggled when the user lifts up from a highlighted cell.
     * Override these methods to provide custom UI for a selected or highlighted state.
     * The collection view may call the setters inside an animation block.
     */
    @Generated
    @Selector("isSelected")
    public native boolean isSelected();

    /**
     * Cells become highlighted when the user touches them.
     * The selected state is toggled when the user lifts up from a highlighted cell.
     * Override these methods to provide custom UI for a selected or highlighted state.
     * The collection view may call the setters inside an animation block.
     */
    @Generated
    @Selector("setSelected:")
    public native void setSelected(boolean value);

    @Nullable
    @Generated
    @Selector("selectedBackgroundView")
    public native UIView selectedBackgroundView();

    /**
     * These properties are always nil when a non-nil `backgroundConfiguration` is set.
     * The background view is a subview behind all other views.
     * If selectedBackgroundView is different than backgroundView, it will be placed above the background view and
     * animated in on selection.
     */
    @Generated
    @Selector("setBackgroundView:")
    public native void setBackgroundView(@Nullable UIView value);

    @Generated
    @Selector("setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(@Nullable UIView value);

    /**
     * Override this method to modify the visual appearance for a particular
     * dragState.
     * 
     * Call super if you want to add to the existing default implementation.
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("dragStateDidChange:")
    public native void dragStateDidChange(@NInt long dragState);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `backgroundConfiguration` when
     * the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("automaticallyUpdatesBackgroundConfiguration")
    public native boolean automaticallyUpdatesBackgroundConfiguration();

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `contentConfiguration` when the
     * cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("automaticallyUpdatesContentConfiguration")
    public native boolean automaticallyUpdatesContentConfiguration();

    /**
     * Setting a background configuration supersedes the cell's backgroundView and selectedBackgroundView. The default
     * value is nil.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("backgroundConfiguration")
    public native UIBackgroundConfiguration backgroundConfiguration();

    /**
     * Returns the current configuration state for the cell.
     * To add your own custom state(s), override the getter and call super to obtain an instance with the
     * system properties set, then set your own custom states as desired.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("configurationState")
    public native UICellConfigurationState configurationState();

    /**
     * Setting a content configuration replaces the existing contentView of the cell with a new content view instance
     * from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the
     * existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the
     * current content view with a new content view.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("contentConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native UIContentConfiguration contentConfiguration();

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `backgroundConfiguration` when
     * the cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAutomaticallyUpdatesBackgroundConfiguration:")
    public native void setAutomaticallyUpdatesBackgroundConfiguration(boolean value);

    /**
     * When YES, the cell will automatically call -updatedConfigurationForState: on its `contentConfiguration` when the
     * cell's
     * configuration state changes, and apply the updated configuration back to the cell. The default value is YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setAutomaticallyUpdatesContentConfiguration:")
    public native void setAutomaticallyUpdatesContentConfiguration(boolean value);

    /**
     * Setting a background configuration supersedes the cell's backgroundView and selectedBackgroundView. The default
     * value is nil.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setBackgroundConfiguration:")
    public native void setBackgroundConfiguration(@Nullable UIBackgroundConfiguration value);

    /**
     * Setting a content configuration replaces the existing contentView of the cell with a new content view instance
     * from the configuration,
     * or directly applies the configuration to the existing content view if the configuration is compatible with the
     * existing content view type.
     * The default value is nil. After a configuration has been set, setting this property to nil will replace the
     * current content view with a new content view.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setContentConfiguration:")
    public native void setContentConfiguration(@Nullable @Mapped(ObjCObjectMapper.class) UIContentConfiguration value);

    /**
     * Requests the cell update its configuration for its current state. This method is called automatically
     * when the cell's `configurationState` may have changed, as well as in other circumstances where an
     * update may be required. Multiple requests may be coalesced into a single update at the appropriate time.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setNeedsUpdateConfiguration")
    public native void setNeedsUpdateConfiguration();

    /**
     * Subclasses should override this method and update the cell's configuration using the state provided.
     * This method should not be called directly, use `setNeedsUpdateConfiguration` to request an update.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("updateConfigurationUsingState:")
    public native void updateConfigurationUsingState(@NotNull UICellConfigurationState state);

    /**
     * Optional block-based alternative to overriding `-updateConfigurationUsingState:` in a subclass. This handler
     * is called after `-updateConfigurationUsingState:`. Setting a new handler triggers `setNeedsUpdateConfiguration`.
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
        void call_configurationUpdateHandler_ret(@NotNull UICollectionViewCell cell,
                @NotNull UICellConfigurationState state);
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
            @Nullable @ObjCBlock(name = "call_setConfigurationUpdateHandler") Block_setConfigurationUpdateHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setConfigurationUpdateHandler {
        @Generated
        void call_setConfigurationUpdateHandler(@NotNull UICollectionViewCell cell,
                @NotNull UICellConfigurationState state);
    }

    /**
     * Returns a default background configuration for the cell's style.
     * This background configuration represents the default appearance that the cell will use.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("defaultBackgroundConfiguration")
    public native UIBackgroundConfiguration defaultBackgroundConfiguration();
}

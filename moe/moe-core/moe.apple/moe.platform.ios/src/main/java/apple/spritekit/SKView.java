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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKView extends UIView {
    static {
        NatJ.register();
    }

    @Generated
    protected SKView(Pointer peer) {
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
    public static native SKView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKView allocWithZone(VoidPtr zone);

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
    public static native SKView appearance();

    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native SKView appearanceForTraitCollection(UITraitCollection trait);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native SKView appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native SKView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes);

    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native SKView appearanceWhenContainedIn(
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native SKView appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes);

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
    public static native SKView new_objc();

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

    /**
     * Toggles whether the view allows transparent rendering. This allows content under the view to show through if
     * a non-opaque backgroundColor is set on the scene. Defaults to NO.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("allowsTransparency")
    public native boolean allowsTransparency();

    @Generated
    @ProtocolClassMethod("appearance")
    public SKView _appearance() {
        return appearance();
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public SKView _appearanceForTraitCollection(UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public SKView _appearanceForTraitCollectionWhenContainedIn(UITraitCollection trait,
            @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public SKView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(UITraitCollection trait,
            NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public SKView _appearanceWhenContainedIn(@Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass,
            Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public SKView _appearanceWhenContainedInInstancesOfClasses(NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    /**
     * Converts a point from scene space to view space.
     * 
     * @param point the point to convert.
     * @param scene the scene to convert the point into.
     */
    @Generated
    @Selector("convertPoint:fromScene:")
    @ByValue
    public native CGPoint convertPointFromScene(@ByValue CGPoint point, SKScene scene);

    /**
     * Converts a point from view space to scene space.
     * 
     * @param point the point to convert.
     * @param scene the scene to convert the point into.
     */
    @Generated
    @Selector("convertPoint:toScene:")
    @ByValue
    public native CGPoint convertPointToScene(@ByValue CGPoint point, SKScene scene);

    /**
     * Optional view delegate, see SKViewDelegate.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("delegate")
    public native NSObject delegate();

    /**
     * Deprecated, please use preferredFramesPerSecond.
     * Number of frames to skip between renders, defaults to 1 (render every frame)
     * Actual requested rate will be preferredFramesPerSecond / frameInterval.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("frameInterval")
    @NInt
    public native long frameInterval();

    /**
     * Ignores sibling and traversal order to sort the rendered contents of a scene into the most efficient batching
     * possible.
     * This will require zPosition to be used in the scenes to properly guarantee elements are in front or behind each
     * other.
     * 
     * This defaults to NO, meaning that sibling order overrides efficiency heuristics in the rendering of the scenes in
     * the view.
     * 
     * Setting this to YES for a complex scene may substantially increase performance, but care must be taken as only
     * zPosition
     * determines render order before the efficiency heuristics are used.
     */
    @Generated
    @Selector("ignoresSiblingOrder")
    public native boolean ignoresSiblingOrder();

    @Generated
    @Selector("init")
    public native SKView init();

    @Generated
    @Selector("initWithCoder:")
    public native SKView initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native SKView initWithFrame(@ByValue CGRect frame);

    /**
     * Toggles whether the view updates is rendered asynchronously or aligned with Core Animation updates. Defaults to
     * YES.
     */
    @Generated
    @Selector("isAsynchronous")
    public native boolean isAsynchronous();

    /**
     * Toggles whether the view updates is rendered asynchronously or aligned with Core Animation updates. Defaults to
     * YES.
     */
    @Generated
    @Selector("setAsynchronous:")
    public native void setAsynchronous(boolean value);

    /**
     * Pause the entire view
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

    /**
     * Pause the entire view
     */
    @Generated
    @Selector("setPaused:")
    public native void setPaused(boolean value);

    /**
     * Deprecated, please use preferredFramesPerSecond.
     * FIXME: remove from public headers once all clinets adopt preferredFramesPerSecond.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("preferredFrameRate")
    public native float preferredFrameRate();

    /**
     * Defines the desired rate for this SKView to it's content.
     * Actual rate maybe be limited by hardware or other software.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    /**
     * Present an SKScene in the view, replacing the current scene.
     * 
     * @param scene the scene to present.
     */
    @Generated
    @Selector("presentScene:")
    public native void presentScene(SKScene scene);

    /**
     * Present an SKScene in the view, replacing the current scene.
     * 
     * If there is currently a scene being presented in the view, the transition is used to swap between them.
     * 
     * @param scene      the scene to present.
     * @param transition the transition to use when presenting the scene.
     */
    @Generated
    @Selector("presentScene:transition:")
    public native void presentSceneTransition(SKScene scene, SKTransition transition);

    /**
     * The currently presented scene, otherwise nil. If in a transition, the 'incoming' scene is returned.
     */
    @Generated
    @Selector("scene")
    public native SKScene scene();

    /**
     * Toggles whether the view allows transparent rendering. This allows content under the view to show through if
     * a non-opaque backgroundColor is set on the scene. Defaults to NO.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setAllowsTransparency:")
    public native void setAllowsTransparency(boolean value);

    /**
     * Optional view delegate, see SKViewDelegate.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(NSObject value);

    /**
     * Optional view delegate, see SKViewDelegate.
     * 
     * API-Since: 10.0
     */
    @Generated
    public void setDelegate(NSObject value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Deprecated, please use preferredFramesPerSecond.
     * Number of frames to skip between renders, defaults to 1 (render every frame)
     * Actual requested rate will be preferredFramesPerSecond / frameInterval.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("setFrameInterval:")
    public native void setFrameInterval(@NInt long value);

    /**
     * Ignores sibling and traversal order to sort the rendered contents of a scene into the most efficient batching
     * possible.
     * This will require zPosition to be used in the scenes to properly guarantee elements are in front or behind each
     * other.
     * 
     * This defaults to NO, meaning that sibling order overrides efficiency heuristics in the rendering of the scenes in
     * the view.
     * 
     * Setting this to YES for a complex scene may substantially increase performance, but care must be taken as only
     * zPosition
     * determines render order before the efficiency heuristics are used.
     */
    @Generated
    @Selector("setIgnoresSiblingOrder:")
    public native void setIgnoresSiblingOrder(boolean value);

    /**
     * Deprecated, please use preferredFramesPerSecond.
     * FIXME: remove from public headers once all clinets adopt preferredFramesPerSecond.
     * 
     * API-Since: 10.0
     * Deprecated-Since: 10.0
     */
    @Deprecated
    @Generated
    @Selector("setPreferredFrameRate:")
    public native void setPreferredFrameRate(float value);

    /**
     * Defines the desired rate for this SKView to it's content.
     * Actual rate maybe be limited by hardware or other software.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShouldCullNonVisibleNodes:")
    public native void setShouldCullNonVisibleNodes(boolean value);

    @Generated
    @Selector("setShowsDrawCount:")
    public native void setShowsDrawCount(boolean value);

    /**
     * Toggles display of performance stats in the view. All default to false.
     */
    @Generated
    @Selector("setShowsFPS:")
    public native void setShowsFPS(boolean value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShowsFields:")
    public native void setShowsFields(boolean value);

    @Generated
    @Selector("setShowsNodeCount:")
    public native void setShowsNodeCount(boolean value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShowsPhysics:")
    public native void setShowsPhysics(boolean value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("setShowsQuadCount:")
    public native void setShowsQuadCount(boolean value);

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("shouldCullNonVisibleNodes")
    public native boolean shouldCullNonVisibleNodes();

    @Generated
    @Selector("showsDrawCount")
    public native boolean showsDrawCount();

    /**
     * Toggles display of performance stats in the view. All default to false.
     */
    @Generated
    @Selector("showsFPS")
    public native boolean showsFPS();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("showsFields")
    public native boolean showsFields();

    @Generated
    @Selector("showsNodeCount")
    public native boolean showsNodeCount();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("showsPhysics")
    public native boolean showsPhysics();

    /**
     * API-Since: 8.0
     */
    @Generated
    @Selector("showsQuadCount")
    public native boolean showsQuadCount();

    /**
     * Create an SKTexture containing a snapshot of how it would have been rendered in this view.
     * The texture is tightly cropped to the size of the node.
     * 
     * @param node the node subtree to render to the texture.
     */
    @Generated
    @Selector("textureFromNode:")
    public native SKTexture textureFromNode(SKNode node);

    /**
     * Create an SKTexture containing a snapshot of how it would have been rendered in this view.
     * The texture is cropped to the specified rectangle
     * 
     * @param node the node subtree to render to the texture.
     * @param crop the crop
     */
    @Generated
    @Selector("textureFromNode:crop:")
    public native SKTexture textureFromNodeCrop(SKNode node, @ByValue CGRect crop);

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    /**
     * If true SKView will not allocate a depth/stencil buffer
     */
    @Generated
    @Selector("disableDepthStencilBuffer")
    public native boolean disableDepthStencilBuffer();

    /**
     * If true SKView will not allocate a depth/stencil buffer
     */
    @Generated
    @Selector("setDisableDepthStencilBuffer:")
    public native void setDisableDepthStencilBuffer(boolean value);
}

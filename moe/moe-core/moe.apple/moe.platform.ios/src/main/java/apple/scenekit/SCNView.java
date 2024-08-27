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

package apple.scenekit;

import apple.NSObject;
import apple.avfaudio.AVAudioEngine;
import apple.avfaudio.AVAudioEnvironmentNode;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
import apple.opengles.EAGLContext;
import apple.scenekit.protocol.SCNCameraControlConfiguration;
import apple.scenekit.protocol.SCNSceneRenderer;
import apple.scenekit.protocol.SCNTechniqueSupport;
import apple.scenekit.struct.SCNVector3;
import apple.spritekit.SKScene;
import apple.spritekit.SKTransition;
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
import apple.coregraphics.opaque.CGColorSpaceRef;

/**
 * SCNView
 * 
 * A SCNView is a subclass of NSView that can display a SCNScene
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNView extends UIView implements SCNSceneRenderer, SCNTechniqueSupport {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNView(Pointer peer) {
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
    public static native SCNView alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNView allocWithZone(VoidPtr zone);

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
    public static native SCNView appearance();

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:")
    public static native SCNView appearanceForTraitCollection(@NotNull UITraitCollection trait);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceForTraitCollection:whenContainedIn:")
    public static native SCNView appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceForTraitCollection:whenContainedInInstancesOfClasses:")
    public static native SCNView appearanceForTraitCollectionWhenContainedInInstancesOfClasses(
            @NotNull UITraitCollection trait, @NotNull NSArray<?> containerTypes);

    @NotNull
    @Generated
    @Variadic()
    @Deprecated
    @Selector("appearanceWhenContainedIn:")
    public static native SCNView appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs);

    @NotNull
    @Generated
    @Selector("appearanceWhenContainedInInstancesOfClasses:")
    public static native SCNView appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes);

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
    public static native SCNView new_objc();

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
     * [@property] allowsCameraControl
     * 
     * A Boolean value that determines whether the user can manipulate the point of view used to render the scene.
     * 
     * When set to YES, a `defaultCameraController` is created and the view will handle UI events to pilot it so the
     * user can manipulate the current point of view with the mouse or the trackpad. The scene graph and existing
     * cameras won't be modified by this action. The default value of this property is NO.
     * Note that the default event handling provided by the view may not suit your needs. You may want to implement your
     * own event handler.
     * The built-in camera controller let you:
     * - pan with 1 finger to rotate the camera around the scene
     * - pan with 2 fingers to translate the camera on its local X,Y plan
     * - pan with 3 fingers vertically to move the the camera forward/backward
     * - double tap to switch to the next camera in the scene
     * - rotate with two fingers to roll the camera (rotation around the Z axis)
     * - pinch to zoom-in / zoom-out (change the field of view of the camera)
     */
    @Generated
    @Selector("allowsCameraControl")
    public native boolean allowsCameraControl();

    /**
     * [@property] antialiasingMode
     * 
     * Defaults to SCNAntialiasingModeMultisampling4X on macOS and SCNAntialiasingModeNone on iOS.
     */
    @Generated
    @Selector("antialiasingMode")
    @NUInt
    public native long antialiasingMode();

    @NotNull
    @Generated
    @ProtocolClassMethod("appearance")
    public SCNView _appearance() {
        return appearance();
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollection")
    public SCNView _appearanceForTraitCollection(@NotNull UITraitCollection trait) {
        return appearanceForTraitCollection(trait);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedIn")
    public SCNView _appearanceForTraitCollectionWhenContainedIn(@NotNull UITraitCollection trait,
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceForTraitCollectionWhenContainedIn(trait, ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceForTraitCollectionWhenContainedInInstancesOfClasses")
    public SCNView _appearanceForTraitCollectionWhenContainedInInstancesOfClasses(@NotNull UITraitCollection trait,
            @NotNull NSArray<?> containerTypes) {
        return appearanceForTraitCollectionWhenContainedInInstancesOfClasses(trait, containerTypes);
    }

    @NotNull
    @Generated
    @Deprecated
    @ProtocolClassMethod("appearanceWhenContainedIn")
    public SCNView _appearanceWhenContainedIn(
            @Nullable @Mapped(ObjCObjectMapper.class) UIAppearanceContainer ContainerClass, Object... varargs) {
        return appearanceWhenContainedIn(ContainerClass, varargs);
    }

    @NotNull
    @Generated
    @ProtocolClassMethod("appearanceWhenContainedInInstancesOfClasses")
    public SCNView _appearanceWhenContainedInInstancesOfClasses(@NotNull NSArray<?> containerTypes) {
        return appearanceWhenContainedInInstancesOfClasses(containerTypes);
    }

    @NotNull
    @Generated
    @Selector("audioEngine")
    public native AVAudioEngine audioEngine();

    @NotNull
    @Generated
    @Selector("audioEnvironmentNode")
    public native AVAudioEnvironmentNode audioEnvironmentNode();

    @Nullable
    @Generated
    @Selector("audioListener")
    public native SCNNode audioListener();

    @Generated
    @Selector("autoenablesDefaultLighting")
    public native boolean autoenablesDefaultLighting();

    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    public native long colorPixelFormat();

    @Nullable
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandQueue commandQueue();

    @Nullable
    @Generated
    @Selector("context")
    public native VoidPtr context();

    @Nullable
    @Generated
    @Selector("currentRenderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLRenderCommandEncoder currentRenderCommandEncoder();

    @Generated
    @Selector("debugOptions")
    @NUInt
    public native long debugOptions();

    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("depthPixelFormat")
    @NUInt
    public native long depthPixelFormat();

    @Nullable
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    /**
     * SCN_GL_DEPRECATED(ios(8.0, 12.0), tvos(9.0, 12.0));
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL API deprecated, please use Metal instead. (Define SCN_SILENCE_GL_DEPRECATION to
     * silence these warnings)
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("eaglContext")
    public native EAGLContext eaglContext();

    @NotNull
    @Generated
    @Selector("hitTest:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point,
            @Nullable NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SCNView init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNView initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithFrame:")
    public native SCNView initWithFrame(@ByValue CGRect frame);

    /**
     * initWithFrame:options:
     * 
     * Initializes and returns a newly allocated SCNView object with a specified frame rectangle.
     * 
     * @param frame   The frame rectangle for the created view object.
     * @param options An optional dictionary. See "View initialization options" above.
     */
    @Generated
    @Selector("initWithFrame:options:")
    public native SCNView initWithFrameOptions(@ByValue CGRect frame, @Nullable NSDictionary<String, ?> options);

    @Generated
    @Selector("isJitteringEnabled")
    public native boolean isJitteringEnabled();

    @Generated
    @Selector("setJitteringEnabled:")
    public native void setJitteringEnabled(boolean value);

    @Generated
    @Selector("isNodeInsideFrustum:withPointOfView:")
    public native boolean isNodeInsideFrustumWithPointOfView(@NotNull SCNNode node, @NotNull SCNNode pointOfView);

    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    @Generated
    @Selector("loops")
    public native boolean loops();

    @NotNull
    @Generated
    @Selector("nodesInsideFrustumWithPointOfView:")
    public native NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(@NotNull SCNNode pointOfView);

    @Nullable
    @Generated
    @Selector("overlaySKScene")
    public native SKScene overlaySKScene();

    /**
     * pause:
     * 
     * This action method pauses the scene playback.
     * 
     * This method does not do anything if the scene is already paused.
     * 
     * @param sender The object (such as a button or menu item) sending the message to pause the scene.
     */
    @Generated
    @Selector("pause:")
    public native void pause(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    /**
     * play:
     * 
     * This action method begins playing the scene at its current location.
     * 
     * This method does not do anything if the scene is already playing.
     * 
     * @param sender The object (such as a button or menu item) sending the message to play the scene.
     */
    @Generated
    @Selector("play:")
    public native void play(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Nullable
    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    /**
     * [@property] preferredFramesPerSecond
     * 
     * The rate you want the view to redraw its contents.
     * 
     * When your application sets its preferred frame rate, the view chooses a frame rate as close to that as possible
     * based on the capabilities of the screen the view is displayed on. The actual frame rate chosen is usually a
     * factor of the maximum refresh rate of the screen to provide a consistent frame rate. For example, if the maximum
     * refresh rate of the screen is 60 frames per second, that is also the highest frame rate the view sets as the
     * actual frame rate. However, if you ask for a lower frame rate, it might choose 30, 20, 15 or some other factor to
     * be the actual frame rate. Your application should choose a frame rate that it can consistently maintain.
     * The default value is 0 which means the display link will fire at the native cadence of the display hardware.
     */
    @Generated
    @Selector("preferredFramesPerSecond")
    @NInt
    public native long preferredFramesPerSecond();

    @Generated
    @Selector("prepareObject:shouldAbortBlock:")
    public native boolean prepareObjectShouldAbortBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object object,
            @Nullable @ObjCBlock(name = "call_prepareObjectShouldAbortBlock") SCNSceneRenderer.Block_prepareObjectShouldAbortBlock block);

    @Generated
    @Selector("prepareObjects:withCompletionHandler:")
    public native void prepareObjectsWithCompletionHandler(@NotNull NSArray<?> objects,
            @Nullable @ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") SCNSceneRenderer.Block_prepareObjectsWithCompletionHandler completionHandler);

    @Generated
    @Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
    public native void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(@NotNull SCNScene scene,
            @NotNull SKTransition transition, @Nullable SCNNode pointOfView,
            @Nullable @ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") SCNSceneRenderer.Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

    @Generated
    @Selector("projectPoint:")
    @ByValue
    public native SCNVector3 projectPoint(@ByValue SCNVector3 point);

    @Generated
    @Selector("renderingAPI")
    @NUInt
    public native long renderingAPI();

    @Nullable
    @Generated
    @Selector("scene")
    public native SCNScene scene();

    @Generated
    @Selector("sceneTime")
    public native double sceneTime();

    /**
     * [@property] allowsCameraControl
     * 
     * A Boolean value that determines whether the user can manipulate the point of view used to render the scene.
     * 
     * When set to YES, a `defaultCameraController` is created and the view will handle UI events to pilot it so the
     * user can manipulate the current point of view with the mouse or the trackpad. The scene graph and existing
     * cameras won't be modified by this action. The default value of this property is NO.
     * Note that the default event handling provided by the view may not suit your needs. You may want to implement your
     * own event handler.
     * The built-in camera controller let you:
     * - pan with 1 finger to rotate the camera around the scene
     * - pan with 2 fingers to translate the camera on its local X,Y plan
     * - pan with 3 fingers vertically to move the the camera forward/backward
     * - double tap to switch to the next camera in the scene
     * - rotate with two fingers to roll the camera (rotation around the Z axis)
     * - pinch to zoom-in / zoom-out (change the field of view of the camera)
     */
    @Generated
    @Selector("setAllowsCameraControl:")
    public native void setAllowsCameraControl(boolean value);

    /**
     * [@property] antialiasingMode
     * 
     * Defaults to SCNAntialiasingModeMultisampling4X on macOS and SCNAntialiasingModeNone on iOS.
     */
    @Generated
    @Selector("setAntialiasingMode:")
    public native void setAntialiasingMode(@NUInt long value);

    @Generated
    @Selector("setAudioListener:")
    public native void setAudioListener(@Nullable SCNNode value);

    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean value);

    @Generated
    @Selector("setDebugOptions:")
    public native void setDebugOptions(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) Object value) {
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
     * SCN_GL_DEPRECATED(ios(8.0, 12.0), tvos(9.0, 12.0));
     * 
     * API-Since: 8.0
     * Deprecated-Since: 12.0
     * Deprecated-Message: OpenGL API deprecated, please use Metal instead. (Define SCN_SILENCE_GL_DEPRECATION to
     * silence these warnings)
     */
    @Deprecated
    @Generated
    @Selector("setEaglContext:")
    public native void setEaglContext(@Nullable EAGLContext value);

    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    @Generated
    @Selector("setOverlaySKScene:")
    public native void setOverlaySKScene(@Nullable SKScene value);

    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(@Nullable SCNNode value);

    /**
     * [@property] preferredFramesPerSecond
     * 
     * The rate you want the view to redraw its contents.
     * 
     * When your application sets its preferred frame rate, the view chooses a frame rate as close to that as possible
     * based on the capabilities of the screen the view is displayed on. The actual frame rate chosen is usually a
     * factor of the maximum refresh rate of the screen to provide a consistent frame rate. For example, if the maximum
     * refresh rate of the screen is 60 frames per second, that is also the highest frame rate the view sets as the
     * actual frame rate. However, if you ask for a lower frame rate, it might choose 30, 20, 15 or some other factor to
     * be the actual frame rate. Your application should choose a frame rate that it can consistently maintain.
     * The default value is 0 which means the display link will fire at the native cadence of the display hardware.
     */
    @Generated
    @Selector("setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@NInt long value);

    @Generated
    @Selector("setScene:")
    public native void setScene(@Nullable SCNScene value);

    @Generated
    @Selector("setSceneTime:")
    public native void setSceneTime(double value);

    @Generated
    @Selector("setShowsStatistics:")
    public native void setShowsStatistics(boolean value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(@Nullable SCNTechnique value);

    @Generated
    @Selector("showsStatistics")
    public native boolean showsStatistics();

    /**
     * [@property] snapshot
     * 
     * Draws the contents of the view and returns them as a new image object
     * 
     * This method is thread-safe and may be called at any time.
     */
    @NotNull
    @Generated
    @Selector("snapshot")
    public native UIImage snapshot();

    @Generated
    @Selector("stencilPixelFormat")
    @NUInt
    public native long stencilPixelFormat();

    /**
     * stop:
     * 
     * This action method stops the scene playback and resets the current time to the start time of the scene.
     * 
     * @param sender The object (such as a button or menu item) sending the message to stop playing the scene.
     */
    @Generated
    @Selector("stop:")
    public native void stop(@Nullable @Mapped(ObjCObjectMapper.class) Object sender);

    @Nullable
    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    @Generated
    @Selector("unprojectPoint:")
    @ByValue
    public native SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

    /**
     * [@property] cameraControlConfiguration
     * 
     * An object describing the current configuration of the event handler which pilot the default camera controller.
     * 
     * This object will be used to configure the event handler when allowCameraControl is set to YES.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("cameraControlConfiguration")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNCameraControlConfiguration cameraControlConfiguration();

    /**
     * [@property] defaultCameraController
     * 
     * Returns the default SCNCameraController used to drive the current point of view when allowCameraController is set
     * to YES.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("defaultCameraController")
    public native SCNCameraController defaultCameraController();

    /**
     * [@property] rendersContinuously
     * 
     * When set to YES, the view continously redraw at the display link frame rate. When set to NO the view will only
     * redraw when something change or animates in the receiver's scene. Defaults to NO.
     */
    @Generated
    @Selector("rendersContinuously")
    public native boolean rendersContinuously();

    /**
     * [@property] rendersContinuously
     * 
     * When set to YES, the view continously redraw at the display link frame rate. When set to NO the view will only
     * redraw when something change or animates in the receiver's scene. Defaults to NO.
     */
    @Generated
    @Selector("setRendersContinuously:")
    public native void setRendersContinuously(boolean value);

    @Generated
    @Selector("currentViewport")
    @ByValue
    public native CGRect currentViewport();

    @Generated
    @Selector("isTemporalAntialiasingEnabled")
    public native boolean isTemporalAntialiasingEnabled();

    @Generated
    @Selector("modifyAnimationsWithRepeatCount:autoreverses:animations:")
    public static native void modifyAnimationsWithRepeatCountAutoreversesAnimations(@NFloat double count,
            boolean autoreverses,
            @NotNull @ObjCBlock(name = "call_modifyAnimationsWithRepeatCountAutoreversesAnimations") UIView.Block_modifyAnimationsWithRepeatCountAutoreversesAnimations animations);

    @Generated
    @Selector("setTemporalAntialiasingEnabled:")
    public native void setTemporalAntialiasingEnabled(boolean value);

    @Generated
    @Selector("setUsesReverseZ:")
    public native void setUsesReverseZ(boolean value);

    @Generated
    @Selector("usesReverseZ")
    public native boolean usesReverseZ();

    @NotNull
    @Generated
    @Selector("currentRenderPassDescriptor")
    public native MTLRenderPassDescriptor currentRenderPassDescriptor();

    @Generated
    @Selector("animateWithSpringDuration:bounce:initialSpringVelocity:delay:options:animations:completion:")
    public static native void animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion(
            double duration, @NFloat double bounce, @NFloat double velocity, double delay, @NUInt long options,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5") @NotNull UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_5 animations,
            @ObjCBlock(name = "call_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6") @Nullable UIView.Block_animateWithSpringDurationBounceInitialSpringVelocityDelayOptionsAnimationsCompletion_6 completion);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("workingColorSpace")
    @NotNull
    public native CGColorSpaceRef workingColorSpace();
}

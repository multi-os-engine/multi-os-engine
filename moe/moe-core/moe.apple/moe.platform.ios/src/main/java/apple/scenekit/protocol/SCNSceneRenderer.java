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

package apple.scenekit.protocol;

import apple.avfaudio.AVAudioEngine;
import apple.avfaudio.AVAudioEnvironmentNode;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
import apple.scenekit.SCNHitTestResult;
import apple.scenekit.SCNNode;
import apple.scenekit.SCNScene;
import apple.scenekit.struct.SCNVector3;
import apple.spritekit.SKScene;
import apple.spritekit.SKTransition;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] SCNSceneRenderer
 * <p>
 * Protocol adopted by the various renderers (SCNView, SCNLayer, SCNRenderer)
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneRenderer")
public interface SCNSceneRenderer {
    /**
     * [@property] audioEngine
     * <p>
     * Contains the instance of audio engine used by the scene.
     * <p>
     * The audio engine can be used to add custom nodes to the audio graph.
     */
    @Generated
    @Selector("audioEngine")
    AVAudioEngine audioEngine();

    /**
     * [@property] audioEnvironmentNode
     * <p>
     * Contains the instance of audio environment node used by the scene to spacialize sounds.
     */
    @Generated
    @Selector("audioEnvironmentNode")
    AVAudioEnvironmentNode audioEnvironmentNode();

    /**
     * [@property] audioListener
     * <p>
     * Use this property to set the audio node to use as the listener position and orientation when rendering positional audio for this scene. The default is nil which means that the current point of view will be used dynamically.
     */
    @Generated
    @Selector("audioListener")
    SCNNode audioListener();

    /**
     * [@property] autoenablesDefaultLighting
     * <p>
     * Specifies whether the receiver should automatically light up scenes that have no light source. The default is NO.
     * <p>
     * When enabled, a diffuse light is automatically added and placed while rendering scenes that have no light or only ambient lights.
     */
    @Generated
    @Selector("autoenablesDefaultLighting")
    boolean autoenablesDefaultLighting();

    /**
     * [@property] colorPixelFormat
     * <p>
     * The pixel format of the color attachment 0 of the renderer. This property is only valid on a renderer created with a Metal device.
     */
    @Generated
    @Selector("colorPixelFormat")
    @NUInt
    long colorPixelFormat();

    /**
     * [@property] commandQueue
     * <p>
     * The command queue of the renderer. This property is only valid on a renderer created with a Metal device. Otherwise it is set to nil.
     */
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue commandQueue();

    /**
     * [@property] context
     * <p>
     * A Core OpenGL render context that is used as the render target (a CGLContextObj on macOS, an EAGLContext on iOS).
     */
    @Generated
    @Selector("context")
    VoidPtr context();

    /**
     * [@property] currentRenderCommandEncoder
     * <p>
     * The current render command encoder if any. This property is only valid within the SCNSceneRendererDelegate methods and when rendering with Metal. Otherwise it is set to nil.
     */
    @Generated
    @Selector("currentRenderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderCommandEncoder currentRenderCommandEncoder();

    /**
     * [@property] debugOptions
     * <p>
     * Specifies the debug options of the receiver. Defaults to SCNDebugOptionNone.
     */
    @Generated
    @Selector("debugOptions")
    @NUInt
    long debugOptions();

    /**
     * [@property] delegate
     * <p>
     * Specifies the renderer delegate.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    Object delegate();

    /**
     * [@property] depthPixelFormat
     * <p>
     * The pixel format of the depth attachment of the renderer. This property is only valid on a renderer created with a Metal device.
     */
    @Generated
    @Selector("depthPixelFormat")
    @NUInt
    long depthPixelFormat();

    /**
     * [@property] device
     * <p>
     * The metal device of the renderer. This property is only valid on a renderer created with a Metal device. Otherwise it is set to nil.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * hitTest:options:
     * <p>
     * Returns an array of SCNHitTestResult for each node that contains a specified point.
     *
     * @param point   A point in the coordinate system of the receiver.
     * @param options Optional parameters (see the "Hit test options" group for the available options).
     */
    @Generated
    @Selector("hitTest:options:")
    NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point, NSDictionary<String, ?> options);

    /**
     * [@property] jitteringEnabled
     * <p>
     * Specifies whether the receiver should jitter the rendered scene to reduce aliasing artifacts.
     * <p>
     * When enabled, the jittering is performed asynchronously and automatically by SCNView and SCNLayer. It is done synchronously by SCNRenderer.
     */
    @Generated
    @Selector("isJitteringEnabled")
    boolean isJitteringEnabled();

    /**
     * [@property] jitteringEnabled
     * <p>
     * Specifies whether the receiver should jitter the rendered scene to reduce aliasing artifacts.
     * <p>
     * When enabled, the jittering is performed asynchronously and automatically by SCNView and SCNLayer. It is done synchronously by SCNRenderer.
     */
    @Generated
    @Selector("setJitteringEnabled:")
    void setJitteringEnabled(boolean value);

    /**
     * isNodeInsideFrustum:withPointOfView:
     * <p>
     * Test whether node is visible from the specified point of view.
     * <p>
     * Return YES if the node is inside or intersects the clipping planes of the point of view. This method doesn't test if 'node' is occluded by another node.
     *
     * @param node        The node to test the visibility of.
     * @param pointOfView The point of view used to test the visibility.
     */
    @Generated
    @Selector("isNodeInsideFrustum:withPointOfView:")
    boolean isNodeInsideFrustumWithPointOfView(SCNNode node, SCNNode pointOfView);

    /**
     * [@property] playing
     * <p>
     * Returns YES if the scene is playing, NO otherwise.
     */
    @Generated
    @Selector("isPlaying")
    boolean isPlaying();

    /**
     * [@property] playing
     * <p>
     * Returns YES if the scene is playing, NO otherwise.
     */
    @Generated
    @Selector("setPlaying:")
    void setPlaying(boolean value);

    /**
     * [@property] loops
     * <p>
     * Indicates whether the receiver restarts playback when it reaches the end of its content. Default: YES.
     * <p>
     * YES when the receiver restarts playback when it finishes, NO otherwise.
     */
    @Generated
    @Selector("loops")
    boolean loops();

    /**
     * nodesInsideFrustumWithPointOfView:
     * <p>
     * Returns an array containing the nodes visible from the specified point of view.
     * <p>
     * Returns an array of all the nodes that are inside or intersects the clipping planes of the point of view. Starting in macOS10.13/iOS11 this method work with the presentation tree.
     *
     * @param pointOfView The point of view used to test the visibility.
     */
    @Generated
    @Selector("nodesInsideFrustumWithPointOfView:")
    NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(SCNNode pointOfView);

    /**
     * [@property] overlaySKScene
     * <p>
     * Specifies the overlay of the receiver as a SpriteKit scene instance. Defaults to nil.
     */
    @Generated
    @Selector("overlaySKScene")
    SKScene overlaySKScene();

    /**
     * [@property] pointOfView
     * <p>
     * Specifies the point of view used to render the scene.
     * <p>
     * A point of view must have either a camera or a spot light attached.
     */
    @Generated
    @Selector("pointOfView")
    SCNNode pointOfView();

    /**
     * prepareObject:shouldAbortBlock:
     * <p>
     * Prepare the specified object for drawing.
     * <p>
     * Returns YES if the object was prepared successfully, NO if it was canceled. This method may be triggered from a secondary thread. This method is observable using NSProgress.
     *
     * @param object The object to prepare. It can be an instance of SCNScene, SCNNode, SCNGeometry, or SCNMaterial
     * @param block  This block will be called repeatedly while the object is prepared. Return YES if you want the operation to abort.
     */
    @Generated
    @Selector("prepareObject:shouldAbortBlock:")
    boolean prepareObjectShouldAbortBlock(@Mapped(ObjCObjectMapper.class) Object object,
            @ObjCBlock(name = "call_prepareObjectShouldAbortBlock") Block_prepareObjectShouldAbortBlock block);

    /**
     * prepareObjects:withCompletionHandler:
     * <p>
     * Prepare the specified objects for drawing on the background.
     * <p>
     * This method is observable using NSProgress.
     *
     * @param objects           The objects to prepare. It can be one or more instances of SCNScene, SCNNode, SCNGeometry, or SCNMaterial
     * @param completionHandler This block will be called when all objects has been prepared, or on failure.
     */
    @Generated
    @Selector("prepareObjects:withCompletionHandler:")
    void prepareObjectsWithCompletionHandler(NSArray<?> objects,
            @ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") Block_prepareObjectsWithCompletionHandler completionHandler);

    /**
     * presentScene:withTransition:incomingPointOfView:
     * <p>
     * Present a SCNScene in the receiver, replacing the current scene.
     *
     * @param scene             The new scene to present.
     * @param transition        the transition to use when presenting the scene.
     * @param pointOfView       the point of view to use to render the new scene.
     * @param completionHandler the block invoked on completion.
     */
    @Generated
    @Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
    void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(SCNScene scene, SKTransition transition,
            SCNNode pointOfView,
            @ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

    /**
     * projectPoint
     * <p>
     * Projects a point in the world coordinate system using the receiver's current point of view and viewport.
     * <p>
     * A point projected from the near (resp. far) clip plane will have a z component of 0 (resp. 1). Starting in macOS 11.0, iOS 14, tvOS 14 and watchOS 7 the range of z component will be reversed (from 1 to 0) if the receiver uses 'reverseZ'.
     *
     * @param point The world position to be projected.
     */
    @Generated
    @Selector("projectPoint:")
    @ByValue
    SCNVector3 projectPoint(@ByValue SCNVector3 point);

    /**
     * [@property] renderingAPI
     * <p>
     * Specifies the rendering API associated to the receiver.
     * <p>
     * This is the rendering API effectively used by the receiver. You can specify a preferred rendering API when initializing a view programmatically (see SCNPreferredRenderingAPI in SCNSceneRenderer.h) or using Interface Builder's SCNView inspector.
     */
    @Generated
    @Selector("renderingAPI")
    @NUInt
    long renderingAPI();

    /**
     * [@property] scene
     * <p>
     * Specifies the scene of the receiver.
     */
    @Generated
    @Selector("scene")
    SCNScene scene();

    /**
     * [@property] sceneTime
     * <p>
     * Specifies the current "scene time" to display the scene.
     * <p>
     * The scene time only affect scene time based animations (see SCNAnimation.h "usesSceneTimeBase" and SCNSceneSource.h "SCNSceneSourceAnimationImportPolicyKey" for how to create scene time based animations). Scene time based animations and this property are typically used by tools and viewer to ease seeking in time while previewing a scene.
     */
    @Generated
    @Selector("sceneTime")
    double sceneTime();

    /**
     * [@property] audioListener
     * <p>
     * Use this property to set the audio node to use as the listener position and orientation when rendering positional audio for this scene. The default is nil which means that the current point of view will be used dynamically.
     */
    @Generated
    @Selector("setAudioListener:")
    void setAudioListener(SCNNode value);

    /**
     * [@property] autoenablesDefaultLighting
     * <p>
     * Specifies whether the receiver should automatically light up scenes that have no light source. The default is NO.
     * <p>
     * When enabled, a diffuse light is automatically added and placed while rendering scenes that have no light or only ambient lights.
     */
    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    void setAutoenablesDefaultLighting(boolean value);

    /**
     * [@property] debugOptions
     * <p>
     * Specifies the debug options of the receiver. Defaults to SCNDebugOptionNone.
     */
    @Generated
    @Selector("setDebugOptions:")
    void setDebugOptions(@NUInt long value);

    /**
     * [@property] delegate
     * <p>
     * Specifies the renderer delegate.
     */
    @Generated
    @Selector("setDelegate:")
    void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] loops
     * <p>
     * Indicates whether the receiver restarts playback when it reaches the end of its content. Default: YES.
     * <p>
     * YES when the receiver restarts playback when it finishes, NO otherwise.
     */
    @Generated
    @Selector("setLoops:")
    void setLoops(boolean value);

    /**
     * [@property] overlaySKScene
     * <p>
     * Specifies the overlay of the receiver as a SpriteKit scene instance. Defaults to nil.
     */
    @Generated
    @Selector("setOverlaySKScene:")
    void setOverlaySKScene(SKScene value);

    /**
     * [@property] pointOfView
     * <p>
     * Specifies the point of view used to render the scene.
     * <p>
     * A point of view must have either a camera or a spot light attached.
     */
    @Generated
    @Selector("setPointOfView:")
    void setPointOfView(SCNNode value);

    /**
     * [@property] scene
     * <p>
     * Specifies the scene of the receiver.
     */
    @Generated
    @Selector("setScene:")
    void setScene(SCNScene value);

    /**
     * [@property] sceneTime
     * <p>
     * Specifies the current "scene time" to display the scene.
     * <p>
     * The scene time only affect scene time based animations (see SCNAnimation.h "usesSceneTimeBase" and SCNSceneSource.h "SCNSceneSourceAnimationImportPolicyKey" for how to create scene time based animations). Scene time based animations and this property are typically used by tools and viewer to ease seeking in time while previewing a scene.
     */
    @Generated
    @Selector("setSceneTime:")
    void setSceneTime(double value);

    /**
     * [@property] showsStatistics
     * <p>
     * Determines whether the receiver should display statistics info like FPS. Defaults to NO.
     * <p>
     * When set to YES, statistics are displayed in a overlay on top of the rendered scene.
     */
    @Generated
    @Selector("setShowsStatistics:")
    void setShowsStatistics(boolean value);

    /**
     * [@property] showsStatistics
     * <p>
     * Determines whether the receiver should display statistics info like FPS. Defaults to NO.
     * <p>
     * When set to YES, statistics are displayed in a overlay on top of the rendered scene.
     */
    @Generated
    @Selector("showsStatistics")
    boolean showsStatistics();

    /**
     * [@property] stencilPixelFormat
     * <p>
     * The pixel format of the stencil attachment of the renderer. This property is only valid on a renderer created with a Metal device.
     */
    @Generated
    @Selector("stencilPixelFormat")
    @NUInt
    long stencilPixelFormat();

    /**
     * unprojectPoint
     * <p>
     * Unprojects a screenspace 2D point with depth info using the receiver's current point of view and viewport.
     * <p>
     * A point whose z component is 0 (resp. 1) is unprojected on the near (resp. far) clip plane. Starting in macOS 11.0, iOS 14, tvOS 14 and watchOS 7 the range of the z component will be reversed (from 1 to 0) if the receiver uses 'reverseZ'.
     *
     * @param point The screenspace position to be unprojected.
     */
    @Generated
    @Selector("unprojectPoint:")
    @ByValue
    SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareObjectShouldAbortBlock {
        @Generated
        boolean call_prepareObjectShouldAbortBlock();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_prepareObjectsWithCompletionHandler {
        @Generated
        void call_prepareObjectsWithCompletionHandler(boolean success);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler {
        @Generated
        void call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler();
    }

    /**
     * [@property] currentViewport
     * <p>
     * Returns the current viewport for this renderer, can be used to get the actual viewport from within the delegate callback during a live resize.
     */
    @Generated
    @Selector("currentViewport")
    @ByValue
    CGRect currentViewport();

    /**
     * [@property] temporalAntialiasingEnabled
     * <p>
     * Specifies whether the receiver should reduce aliasing artifacts in real time based on temporal coherency. Defaults to NO.
     */
    @Generated
    @Selector("isTemporalAntialiasingEnabled")
    boolean isTemporalAntialiasingEnabled();

    /**
     * [@property] temporalAntialiasingEnabled
     * <p>
     * Specifies whether the receiver should reduce aliasing artifacts in real time based on temporal coherency. Defaults to NO.
     */
    @Generated
    @Selector("setTemporalAntialiasingEnabled:")
    void setTemporalAntialiasingEnabled(boolean value);

    /**
     * [@property] usesReverseZ
     * <p>
     * Specifies if the renderer should use the reverse Z technique. Defaults to YES.
     * <p>
     * This property is only valid on a renderer created with a Metal device.
     */
    @Generated
    @Selector("setUsesReverseZ:")
    void setUsesReverseZ(boolean value);

    /**
     * [@property] usesReverseZ
     * <p>
     * Specifies if the renderer should use the reverse Z technique. Defaults to YES.
     * <p>
     * This property is only valid on a renderer created with a Metal device.
     */
    @Generated
    @Selector("usesReverseZ")
    boolean usesReverseZ();

    /**
     * [@property] currentRenderPassDescriptor
     * <p>
     * The render pass descriptor of the receiver. This property is only valid within the SCNSceneRendererDelegate methods and when rendering with Metal. Otherwise it is set to nil.
     */
    @Generated
    @Selector("currentRenderPassDescriptor")
    MTLRenderPassDescriptor currentRenderPassDescriptor();
}

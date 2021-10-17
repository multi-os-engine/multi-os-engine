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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLRenderCommandEncoder;
import apple.opengles.EAGLContext;
import apple.scenekit.protocol.SCNSceneRenderer;
import apple.scenekit.protocol.SCNTechniqueSupport;
import apple.scenekit.struct.SCNVector3;
import apple.spritekit.SKScene;
import apple.spritekit.SKTransition;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNRenderer
 * <p>
 * SCNRenderer lets you use the SceneKit renderer in an OpenGL context or Metal render pass descriptor of your own.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNRenderer extends NSObject implements SCNSceneRenderer, SCNTechniqueSupport {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNRenderer alloc();

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
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * rendererWithContext:options:
     * <p>
     * Creates a new renderer object.
     *
     * @param context The context to render into.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("rendererWithContext:options:")
    public static native SCNRenderer rendererWithContextOptions(EAGLContext context, NSDictionary<?, ?> options);

    /**
     * rendererWithDevice:options:
     * <p>
     * Creates a new renderer object that renders using Metal.
     *
     * @param device  The metal device to use. Pass nil to let SceneKit choose a default device.
     * @param options An optional dictionary for future extensions.
     */
    @Generated
    @Selector("rendererWithDevice:options:")
    public static native SCNRenderer rendererWithDeviceOptions(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            NSDictionary<?, ?> options);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("audioEngine")
    public native apple.avfaudio.AVAudioEngine audioEngine();

    @Generated
    @Selector("audioEnvironmentNode")
    public native apple.avfaudio.AVAudioEnvironmentNode audioEnvironmentNode();

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

    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandQueue commandQueue();

    @Generated
    @Selector("context")
    public native VoidPtr context();

    @Generated
    @Selector("currentRenderCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLRenderCommandEncoder currentRenderCommandEncoder();

    @Generated
    @Selector("debugOptions")
    @NUInt
    public native long debugOptions();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object delegate();

    @Generated
    @Selector("depthPixelFormat")
    @NUInt
    public native long depthPixelFormat();

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("hitTest:options:")
    public native NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("init")
    public native SCNRenderer init();

    @Generated
    @Selector("isJitteringEnabled")
    public native boolean isJitteringEnabled();

    @Generated
    @Selector("setJitteringEnabled:")
    public native void setJitteringEnabled(boolean value);

    @Generated
    @Selector("isNodeInsideFrustum:withPointOfView:")
    public native boolean isNodeInsideFrustumWithPointOfView(SCNNode node, SCNNode pointOfView);

    @Generated
    @Selector("isPlaying")
    public native boolean isPlaying();

    @Generated
    @Selector("setPlaying:")
    public native void setPlaying(boolean value);

    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * [@property] nextFrameTime
     * <p>
     * Returns the time at which the next update should happen. If infinite no update needs to be scheduled yet. If the current frame time, a continuous animation is running and an update should be scheduled after a "natural" delay.
     */
    @Generated
    @Selector("nextFrameTime")
    public native double nextFrameTime();

    @Generated
    @Selector("nodesInsideFrustumWithPointOfView:")
    public native NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(SCNNode pointOfView);

    @Generated
    @Selector("overlaySKScene")
    public native SKScene overlaySKScene();

    @Generated
    @Selector("pointOfView")
    public native SCNNode pointOfView();

    @Generated
    @Selector("prepareObject:shouldAbortBlock:")
    public native boolean prepareObjectShouldAbortBlock(@Mapped(ObjCObjectMapper.class) Object object,
            @ObjCBlock(name = "call_prepareObjectShouldAbortBlock") SCNSceneRenderer.Block_prepareObjectShouldAbortBlock block);

    @Generated
    @Selector("prepareObjects:withCompletionHandler:")
    public native void prepareObjectsWithCompletionHandler(NSArray<?> objects,
            @ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") SCNSceneRenderer.Block_prepareObjectsWithCompletionHandler completionHandler);

    @Generated
    @Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
    public native void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(SCNScene scene,
            SKTransition transition, SCNNode pointOfView,
            @ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") SCNSceneRenderer.Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

    @Generated
    @Selector("projectPoint:")
    @ByValue
    public native SCNVector3 projectPoint(@ByValue SCNVector3 point);

    /**
     * Deprecated
     * <p>
     * render
     * <p>
     * renders the receiver's scene at the current system time.
     * <p>
     * This method only work if the receiver was allocated with an OpenGL context and it is deprecated (use renderAtTime: instead). Use renderAtTime:withEncoder:pass:commandQueue: to render with Metal.
     */
    @Generated
    @Deprecated
    @Selector("render")
    public native void render();

    /**
     * renderAtTime:
     * <p>
     * updates and renders the receiver's scene at the specified time (system time).
     * <p>
     * This method only work if the receiver was allocated with an OpenGL context. Use renderAtTime:withEncoder:pass:commandQueue: to render with Metal.
     */
    @Generated
    @Selector("renderAtTime:")
    public native void renderAtTime(double time);

    /**
     * renderAtTime:viewport:commandBuffer:passDescriptor:
     * <p>
     * updates and renders the receiver's scene at the specified time (system time) viewport, Metal command buffer and pass descriptor.
     * <p>
     * Use this method to render using Metal.
     */
    @Generated
    @Selector("renderAtTime:viewport:commandBuffer:passDescriptor:")
    public native void renderAtTimeViewportCommandBufferPassDescriptor(double time, @ByValue CGRect viewport,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("renderingAPI")
    @NUInt
    public native long renderingAPI();

    @Generated
    @Selector("scene")
    public native SCNScene scene();

    @Generated
    @Selector("sceneTime")
    public native double sceneTime();

    @Generated
    @Selector("setAudioListener:")
    public native void setAudioListener(SCNNode value);

    @Generated
    @Selector("setAutoenablesDefaultLighting:")
    public native void setAutoenablesDefaultLighting(boolean value);

    @Generated
    @Selector("setDebugOptions:")
    public native void setDebugOptions(@NUInt long value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    @Generated
    @Selector("setOverlaySKScene:")
    public native void setOverlaySKScene(SKScene value);

    @Generated
    @Selector("setPointOfView:")
    public native void setPointOfView(SCNNode value);

    @Generated
    @Selector("setScene:")
    public native void setScene(SCNScene value);

    @Generated
    @Selector("setSceneTime:")
    public native void setSceneTime(double value);

    @Generated
    @Selector("setShowsStatistics:")
    public native void setShowsStatistics(boolean value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    @Generated
    @Selector("showsStatistics")
    public native boolean showsStatistics();

    /**
     * snapshotAtTime:withSize:antialiasingMode:
     * <p>
     * renders the receiver's scene at the specified time (system time) into an image.
     */
    @Generated
    @Selector("snapshotAtTime:withSize:antialiasingMode:")
    public native UIImage snapshotAtTimeWithSizeAntialiasingMode(double time, @ByValue CGSize size,
            @NUInt long antialiasingMode);

    @Generated
    @Selector("stencilPixelFormat")
    @NUInt
    public native long stencilPixelFormat();

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    @Generated
    @Selector("unprojectPoint:")
    @ByValue
    public native SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

    /**
     * updateProbes:atTime:
     * <p>
     * Update the specified probes by computing their incoming irradiance in the receiver's scene at the specified time.
     * <p>
     * Light probes are only supported with Metal. This method is observable using NSProgress.
     *
     * @param lightProbes An array of nodes that must have a light probe attached.
     * @param time        The time used to render the scene when computing the light probes irradiance.
     */
    @Generated
    @Selector("updateProbes:atTime:")
    public native void updateProbesAtTime(NSArray<? extends SCNNode> lightProbes, double time);

    /**
     * renderWithViewport:viewport:commandBuffer:passDescriptor:
     * <p>
     * renders the receiver's scene with the specified viewport, Metal command buffer and pass descriptor.
     * <p>
     * Use this method to render using Metal. This method doesn't update the scene's animations, physics, particles etc... It's up to you to call "updateAtTime:" to update the scene.
     */
    @Generated
    @Selector("renderWithViewport:commandBuffer:passDescriptor:")
    public native void renderWithViewportCommandBufferPassDescriptor(@ByValue CGRect viewport,
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MTLRenderPassDescriptor renderPassDescriptor);

    /**
     * updateAtTime:
     * <p>
     * updates the receiver's scene at the specified time (system time).
     */
    @Generated
    @Selector("updateAtTime:")
    public native void updateAtTime(double time);

    @Generated
    @Selector("currentViewport")
    @ByValue
    public native CGRect currentViewport();

    @Generated
    @Selector("isTemporalAntialiasingEnabled")
    public native boolean isTemporalAntialiasingEnabled();

    @Generated
    @Selector("setTemporalAntialiasingEnabled:")
    public native void setTemporalAntialiasingEnabled(boolean value);

    @Generated
    @Selector("setUsesReverseZ:")
    public native void setUsesReverseZ(boolean value);

    @Generated
    @Selector("usesReverseZ")
    public native boolean usesReverseZ();

    @Generated
    @Selector("currentRenderPassDescriptor")
    public native MTLRenderPassDescriptor currentRenderPassDescriptor();
}

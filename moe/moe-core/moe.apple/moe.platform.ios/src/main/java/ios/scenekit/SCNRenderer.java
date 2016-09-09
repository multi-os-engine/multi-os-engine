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

package ios.scenekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.avfoundation.AVAudioEngine;
import ios.avfoundation.AVAudioEnvironmentNode;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.metal.MTLRenderPassDescriptor;
import ios.opengles.EAGLContext;
import ios.scenekit.protocol.SCNSceneRenderer;
import ios.scenekit.protocol.SCNTechniqueSupport;
import ios.scenekit.struct.SCNVector3;
import ios.spritekit.SKScene;
import ios.spritekit.SKTransition;
import ios.metal.protocol.MTLCommandBuffer;
import ios.metal.protocol.MTLDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNRenderer extends NSObject implements SCNSceneRenderer,
		SCNTechniqueSupport {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNRenderer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNRenderer alloc();

	@Generated
	@Selector("autoenablesDefaultLighting")
	public native boolean autoenablesDefaultLighting();

	@Generated
	@Selector("context")
	public native VoidPtr context();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

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
	@Selector("isNodeInsideFrustum:withPointOfView:")
	public native boolean isNodeInsideFrustumWithPointOfView(SCNNode node,
			SCNNode pointOfView);

	@Generated
	@Selector("isPlaying")
	public native boolean isPlaying();

	@Generated
	@Selector("loops")
	public native boolean loops();

	/**
	 * nextFrameTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/instp/SCNRenderer/nextFrameTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nextFrameTime")
	public native double nextFrameTime();

	@Generated
	@Selector("overlaySKScene")
	public native SKScene overlaySKScene();

	@Generated
	@Selector("pointOfView")
	public native SCNNode pointOfView();

	@Generated
	@Selector("prepareObject:shouldAbortBlock:")
	public native boolean prepareObjectShouldAbortBlock(
			@Mapped(ObjCObjectMapper.class) Object object,
			@ObjCBlock(name = "call_prepareObjectShouldAbortBlock") SCNSceneRenderer.Block_prepareObjectShouldAbortBlock block);

	@Generated
	@Selector("prepareObjects:withCompletionHandler:")
	public native void prepareObjectsWithCompletionHandler(
			NSArray<?> objects,
			@ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") SCNSceneRenderer.Block_prepareObjectsWithCompletionHandler completionHandler);

	@Generated
	@Selector("projectPoint:")
	@ByValue
	public native SCNVector3 projectPoint(@ByValue SCNVector3 point);

	/**
	 * render</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/instm/SCNRenderer/render">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("render")
	public native void render();

	/**
	 * renderAtTime:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/instm/SCNRenderer/renderAtTime:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderAtTime:")
	public native void renderAtTime(double time);

	/**
	 * rendererWithContext:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/clm/SCNRenderer/rendererWithContext:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rendererWithContext:options:")
	public static native SCNRenderer rendererWithContextOptions(
			EAGLContext context, NSDictionary<?, ?> options);

	@Generated
	@Selector("scene")
	public native SCNScene scene();

	@Generated
	@Selector("sceneTime")
	public native double sceneTime();

	@Generated
	@Selector("setAutoenablesDefaultLighting:")
	public native void setAutoenablesDefaultLighting(boolean value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

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
	@Selector("setJitteringEnabled:")
	public native void setJitteringEnabled(boolean value);

	@Generated
	@Selector("setLoops:")
	public native void setLoops(boolean value);

	@Generated
	@Selector("setOverlaySKScene:")
	public native void setOverlaySKScene(SKScene value);

	@Generated
	@Selector("setPlaying:")
	public native void setPlaying(boolean value);

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

	@Generated
	@Selector("technique")
	public native SCNTechnique technique();

	@Generated
	@Selector("unprojectPoint:")
	@ByValue
	public native SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

	@Generated
	@Selector("audioEngine")
	public native AVAudioEngine audioEngine();

	@Generated
	@Selector("audioEnvironmentNode")
	public native AVAudioEnvironmentNode audioEnvironmentNode();

	@Generated
	@Selector("audioListener")
	public native SCNNode audioListener();

	@Generated
	@Selector("colorPixelFormat")
	@NUInt
	public native long colorPixelFormat();

	@Generated
	@Selector("commandQueue")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object commandQueue();

	@Generated
	@Selector("currentRenderCommandEncoder")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object currentRenderCommandEncoder();

	@Generated
	@Selector("debugOptions")
	@NUInt
	public native long debugOptions();

	@Generated
	@Selector("depthPixelFormat")
	@NUInt
	public native long depthPixelFormat();

	@Generated
	@Selector("device")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object device();

	@Generated
	@Selector("nodesInsideFrustumWithPointOfView:")
	public native NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(SCNNode pointOfView);

	@Generated
	@Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
	public native void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(SCNScene scene,
			SKTransition transition, SCNNode pointOfView,
			@ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") SCNSceneRenderer.Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

	/**
	 * renderAtTime:viewport:commandBuffer:passDescriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/instm/SCNRenderer/renderAtTime:viewport:commandBuffer:passDescriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderAtTime:viewport:commandBuffer:passDescriptor:")
	public native void renderAtTimeViewportCommandBufferPassDescriptor(double time, @ByValue CGRect viewport,
			@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MTLRenderPassDescriptor renderPassDescriptor);

	/**
	 * rendererWithDevice:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNRenderer_Class/index.html#//apple_ref/occ/clm/SCNRenderer/rendererWithDevice:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rendererWithDevice:options:")
	public static native SCNRenderer rendererWithDeviceOptions(@Mapped(ObjCObjectMapper.class) MTLDevice device,
			NSDictionary<?, ?> options);

	@Generated
	@Selector("renderingAPI")
	@NUInt
	public native long renderingAPI();

	@Generated
	@Selector("setAudioListener:")
	public native void setAudioListener(SCNNode value);

	@Generated
	@Selector("setDebugOptions:")
	public native void setDebugOptions(@NUInt long value);

	@Generated
	@Selector("stencilPixelFormat")
	@NUInt
	public native long stencilPixelFormat();

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
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

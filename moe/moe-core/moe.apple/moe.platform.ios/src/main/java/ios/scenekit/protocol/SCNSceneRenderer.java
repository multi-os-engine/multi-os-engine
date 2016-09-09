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

package ios.scenekit.protocol;


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

import ios.avfoundation.AVAudioEngine;
import ios.avfoundation.AVAudioEnvironmentNode;
import ios.coregraphics.struct.CGPoint;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.scenekit.SCNHitTestResult;
import ios.scenekit.SCNNode;
import ios.scenekit.SCNScene;
import ios.scenekit.struct.SCNVector3;
import ios.spritekit.SKScene;
import ios.spritekit.SKTransition;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNSceneRenderer")
public interface SCNSceneRenderer {
	/**
	 * autoenablesDefaultLighting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/autoenablesDefaultLighting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("autoenablesDefaultLighting")
	boolean autoenablesDefaultLighting();

	/**
	 * context</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/context">iOS Dev Center</a>
	 */
	@Generated
	@Selector("context")
	VoidPtr context();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object delegate();

	/**
	 * hitTest:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/hitTest:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hitTest:options:")
	NSArray<? extends SCNHitTestResult> hitTestOptions(@ByValue CGPoint point,
			NSDictionary<String, ?> options);

	/**
	 * jitteringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/jitteringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isJitteringEnabled")
	boolean isJitteringEnabled();

	/**
	 * isNodeInsideFrustum:withPointOfView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/isNodeInsideFrustum:withPointOfView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isNodeInsideFrustum:withPointOfView:")
	boolean isNodeInsideFrustumWithPointOfView(SCNNode node,
			SCNNode pointOfView);

	/**
	 * playing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/playing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPlaying")
	boolean isPlaying();

	/**
	 * loops</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/loops">iOS Dev Center</a>
	 */
	@Generated
	@Selector("loops")
	boolean loops();

	/**
	 * overlaySKScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/overlaySKScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("overlaySKScene")
	SKScene overlaySKScene();

	/**
	 * pointOfView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/pointOfView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pointOfView")
	SCNNode pointOfView();

	/**
	 * prepareObject:shouldAbortBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/prepareObject:shouldAbortBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareObject:shouldAbortBlock:")
	boolean prepareObjectShouldAbortBlock(
			@Mapped(ObjCObjectMapper.class) Object object,
			@ObjCBlock(name = "call_prepareObjectShouldAbortBlock") Block_prepareObjectShouldAbortBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_prepareObjectShouldAbortBlock {
		@Generated
		boolean call_prepareObjectShouldAbortBlock();
	}

	/**
	 * prepareObjects:withCompletionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/prepareObjects:withCompletionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("prepareObjects:withCompletionHandler:")
	void prepareObjectsWithCompletionHandler(
			NSArray<?> objects,
			@ObjCBlock(name = "call_prepareObjectsWithCompletionHandler") Block_prepareObjectsWithCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_prepareObjectsWithCompletionHandler {
		@Generated
		void call_prepareObjectsWithCompletionHandler(boolean arg0);
	}

	/**
	 * projectPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/projectPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("projectPoint:")
	@ByValue
	SCNVector3 projectPoint(@ByValue SCNVector3 point);

	/**
	 * scene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/scene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scene")
	SCNScene scene();

	/**
	 * sceneTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/sceneTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneTime")
	double sceneTime();

	/**
	 * autoenablesDefaultLighting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/autoenablesDefaultLighting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAutoenablesDefaultLighting:")
	void setAutoenablesDefaultLighting(boolean value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	void setDelegate(@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * jitteringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/jitteringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setJitteringEnabled:")
	void setJitteringEnabled(boolean value);

	/**
	 * loops</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/loops">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLoops:")
	void setLoops(boolean value);

	/**
	 * overlaySKScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/overlaySKScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOverlaySKScene:")
	void setOverlaySKScene(SKScene value);

	/**
	 * playing</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/playing">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPlaying:")
	void setPlaying(boolean value);

	/**
	 * pointOfView</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/pointOfView">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPointOfView:")
	void setPointOfView(SCNNode value);

	/**
	 * scene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/scene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScene:")
	void setScene(SCNScene value);

	/**
	 * sceneTime</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/sceneTime">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSceneTime:")
	void setSceneTime(double value);

	/**
	 * showsStatistics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/showsStatistics">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShowsStatistics:")
	void setShowsStatistics(boolean value);

	/**
	 * showsStatistics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/showsStatistics">iOS Dev Center</a>
	 */
	@Generated
	@Selector("showsStatistics")
	boolean showsStatistics();

	/**
	 * unprojectPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/unprojectPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("unprojectPoint:")
	@ByValue
	SCNVector3 unprojectPoint(@ByValue SCNVector3 point);

	/**
	 * audioEngine</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/audioEngine">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioEngine")
	AVAudioEngine audioEngine();

	/**
	 * audioEnvironmentNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/audioEnvironmentNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioEnvironmentNode")
	AVAudioEnvironmentNode audioEnvironmentNode();

	/**
	 * audioListener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/audioListener">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioListener")
	SCNNode audioListener();

	/**
	 * colorPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/colorPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorPixelFormat")
	@NUInt
	long colorPixelFormat();

	/**
	 * commandQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/commandQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("commandQueue")
	@MappedReturn(ObjCObjectMapper.class)
	Object commandQueue();

	/**
	 * currentRenderCommandEncoder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/currentRenderCommandEncoder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentRenderCommandEncoder")
	@MappedReturn(ObjCObjectMapper.class)
	Object currentRenderCommandEncoder();

	/**
	 * debugOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/debugOptions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("debugOptions")
	@NUInt
	long debugOptions();

	/**
	 * depthPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/depthPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("depthPixelFormat")
	@NUInt
	long depthPixelFormat();

	/**
	 * device</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/device">iOS Dev Center</a>
	 */
	@Generated
	@Selector("device")
	@MappedReturn(ObjCObjectMapper.class)
	Object device();

	/**
	 * nodesInsideFrustumWithPointOfView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/nodesInsideFrustumWithPointOfView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nodesInsideFrustumWithPointOfView:")
	NSArray<? extends SCNNode> nodesInsideFrustumWithPointOfView(SCNNode pointOfView);

	/**
	 * presentScene:withTransition:incomingPointOfView:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfm/SCNSceneRenderer/presentScene:withTransition:incomingPointOfView:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("presentScene:withTransition:incomingPointOfView:completionHandler:")
	void presentSceneWithTransitionIncomingPointOfViewCompletionHandler(SCNScene scene, SKTransition transition,
			SCNNode pointOfView,
			@ObjCBlock(name = "call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler") Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_presentSceneWithTransitionIncomingPointOfViewCompletionHandler {
		@Generated
		void call_presentSceneWithTransitionIncomingPointOfViewCompletionHandler();
	}

	/**
	 * renderingAPI</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/renderingAPI">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderingAPI")
	@NUInt
	long renderingAPI();

	/**
	 * audioListener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/audioListener">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAudioListener:")
	void setAudioListener(SCNNode value);

	/**
	 * debugOptions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/debugOptions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDebugOptions:")
	void setDebugOptions(@NUInt long value);

	/**
	 * stencilPixelFormat</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNSceneRenderer_Protocol/index.html#//apple_ref/occ/intfp/SCNSceneRenderer/stencilPixelFormat">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stencilPixelFormat")
	@NUInt
	long stencilPixelFormat();
}

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
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coreimage.CIFilter;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.modelio.MDLObject;
import ios.quartzcore.CAAnimation;
import ios.scenekit.protocol.SCNActionable;
import ios.scenekit.protocol.SCNAnimatable;
import ios.scenekit.protocol.SCNBoundingVolume;
import ios.scenekit.struct.SCNMatrix4;
import ios.scenekit.struct.SCNVector3;
import ios.scenekit.struct.SCNVector4;
import ios.scenekit.protocol.SCNNodeRendererDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNNode extends NSObject implements NSCopying, NSSecureCoding,
		SCNAnimatable, SCNActionable, SCNBoundingVolume {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("actionForKey:")
	public native SCNAction actionForKey(String key);

	@Generated
	@Selector("addAnimation:forKey:")
	public native void addAnimationForKey(CAAnimation animation, String key);

	/**
	 * addChildNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/addChildNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addChildNode:")
	public native void addChildNode(SCNNode child);

	/**
	 * addParticleSystem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/addParticleSystem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addParticleSystem:")
	public native void addParticleSystem(SCNParticleSystem system);

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNNode alloc();

	@Generated
	@Selector("animationForKey:")
	public native CAAnimation animationForKey(String key);

	@Generated
	@Selector("animationKeys")
	public native NSArray<String> animationKeys();

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("camera")
	public native SCNCamera camera();

	/**
	 * castsShadow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/castsShadow">iOS Dev Center</a>
	 */
	@Generated
	@Selector("castsShadow")
	public native boolean castsShadow();

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("categoryBitMask")
	@NUInt
	public native long categoryBitMask();

	/**
	 * childNodeWithName:recursively:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/childNodeWithName:recursively:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childNodeWithName:recursively:")
	public native SCNNode childNodeWithNameRecursively(String name,
			boolean recursively);

	/**
	 * childNodes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/childNodes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childNodes")
	public native NSArray<? extends SCNNode> childNodes();

	/**
	 * childNodesPassingTest:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/childNodesPassingTest:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("childNodesPassingTest:")
	public native NSArray<? extends SCNNode> childNodesPassingTest(
			@ObjCBlock(name = "call_childNodesPassingTest") Block_childNodesPassingTest predicate);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_childNodesPassingTest {
		@Generated
		boolean call_childNodesPassingTest(SCNNode arg0, BoolPtr arg1);
	}

	/**
	 * clone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/clone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("clone")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object clone();

	/**
	 * constraints</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/constraints">iOS Dev Center</a>
	 */
	@Generated
	@Selector("constraints")
	public native NSArray<? extends SCNConstraint> constraints();

	/**
	 * convertPosition:fromNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/convertPosition:fromNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPosition:fromNode:")
	@ByValue
	public native SCNVector3 convertPositionFromNode(
			@ByValue SCNVector3 position, SCNNode node);

	/**
	 * convertPosition:toNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/convertPosition:toNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPosition:toNode:")
	@ByValue
	public native SCNVector3 convertPositionToNode(
			@ByValue SCNVector3 position, SCNNode node);

	/**
	 * convertTransform:fromNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/convertTransform:fromNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertTransform:fromNode:")
	@ByValue
	public native SCNMatrix4 convertTransformFromNode(
			@ByValue SCNMatrix4 transform, SCNNode node);

	/**
	 * convertTransform:toNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/convertTransform:toNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertTransform:toNode:")
	@ByValue
	public native SCNMatrix4 convertTransformToNode(
			@ByValue SCNMatrix4 transform, SCNNode node);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * enumerateChildNodesUsingBlock:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/enumerateChildNodesUsingBlock:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enumerateChildNodesUsingBlock:")
	public native void enumerateChildNodesUsingBlock(
			@ObjCBlock(name = "call_enumerateChildNodesUsingBlock") Block_enumerateChildNodesUsingBlock block);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_enumerateChildNodesUsingBlock {
		@Generated
		void call_enumerateChildNodesUsingBlock(SCNNode arg0,
				BoolPtr arg1);
	}

	/**
	 * eulerAngles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/eulerAngles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("eulerAngles")
	@ByValue
	public native SCNVector3 eulerAngles();

	/**
	 * filters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/filters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filters")
	public native NSArray<? extends CIFilter> filters();

	/**
	 * flattenedClone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/flattenedClone">iOS Dev Center</a>
	 */
	@MappedReturn(ObjCObjectMapper.class)
	@Generated
	@Selector("flattenedClone")
	public native Object flattenedClone();

	/**
	 * geometry</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/geometry">iOS Dev Center</a>
	 */
	@Generated
	@Selector("geometry")
	public native SCNGeometry geometry();

	@Generated
	@Selector("getBoundingBoxMin:max:")
	public native boolean getBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);

	@Generated
	@Selector("getBoundingSphereCenter:radius:")
	public native boolean getBoundingSphereCenterRadius(
			SCNVector3 center,
			NFloatPtr radius);

	@Generated
	@Selector("hasActions")
	public native boolean hasActions();

	/**
	 * hitTestWithSegmentFromPoint:toPoint:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/hitTestWithSegmentFromPoint:toPoint:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hitTestWithSegmentFromPoint:toPoint:options:")
	public native NSArray<? extends SCNHitTestResult> hitTestWithSegmentFromPointToPointOptions(
			@ByValue SCNVector3 pointA, @ByValue SCNVector3 pointB,
			NSDictionary<String, ?> options);

	@Generated
	@Selector("init")
	public native SCNNode init();

	@Generated
	@Selector("initWithCoder:")
	public native SCNNode initWithCoder(NSCoder aDecoder);

	/**
	 * insertChildNode:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/insertChildNode:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("insertChildNode:atIndex:")
	public native void insertChildNodeAtIndex(SCNNode child, @NUInt long index);

	@Generated
	@Selector("isAnimationForKeyPaused:")
	public native boolean isAnimationForKeyPaused(String key);

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isHidden")
	public native boolean isHidden();

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isPaused")
	public native boolean isPaused();

	/**
	 * light</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/light">iOS Dev Center</a>
	 */
	@Generated
	@Selector("light")
	public native SCNLight light();

	/**
	 * morpher</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/morpher">iOS Dev Center</a>
	 */
	@Generated
	@Selector("morpher")
	public native SCNMorpher morpher();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * node</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/clm/SCNNode/node">iOS Dev Center</a>
	 */
	@Generated
	@Selector("node")
	public static native SCNNode node();

	/**
	 * nodeWithGeometry:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/clm/SCNNode/nodeWithGeometry:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nodeWithGeometry:")
	public static native SCNNode nodeWithGeometry(SCNGeometry geometry);

	/**
	 * opacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/opacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("opacity")
	@NFloat
	public native double opacity();

	/**
	 * orientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/orientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientation")
	@ByValue
	public native SCNVector4 orientation();

	/**
	 * parentNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/parentNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("parentNode")
	public native SCNNode parentNode();

	/**
	 * particleSystems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/particleSystems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("particleSystems")
	public native NSArray<? extends SCNParticleSystem> particleSystems();

	@Generated
	@Selector("pauseAnimationForKey:")
	public native void pauseAnimationForKey(String key);

	/**
	 * physicsBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/physicsBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("physicsBody")
	public native SCNPhysicsBody physicsBody();

	/**
	 * physicsField</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/physicsField">iOS Dev Center</a>
	 */
	@Generated
	@Selector("physicsField")
	public native SCNPhysicsField physicsField();

	/**
	 * pivot</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/pivot">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pivot")
	@ByValue
	public native SCNMatrix4 pivot();

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("position")
	@ByValue
	public native SCNVector3 position();

	@Generated
	@Selector("presentationNode")
	public native SCNNode presentationNode();

	@Generated
	@Selector("removeActionForKey:")
	public native void removeActionForKey(String key);

	@Generated
	@Selector("removeAllActions")
	public native void removeAllActions();

	@Generated
	@Selector("removeAllAnimations")
	public native void removeAllAnimations();

	/**
	 * removeAllParticleSystems</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/removeAllParticleSystems">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllParticleSystems")
	public native void removeAllParticleSystems();

	@Generated
	@Selector("removeAnimationForKey:")
	public native void removeAnimationForKey(String key);

	@Generated
	@Selector("removeAnimationForKey:fadeOutDuration:")
	public native void removeAnimationForKeyFadeOutDuration(String key,
			@NFloat double duration);

	/**
	 * removeFromParentNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/removeFromParentNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeFromParentNode")
	public native void removeFromParentNode();

	/**
	 * removeParticleSystem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/removeParticleSystem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeParticleSystem:")
	public native void removeParticleSystem(SCNParticleSystem system);

	/**
	 * rendererDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/rendererDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rendererDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native SCNNodeRendererDelegate rendererDelegate();

	/**
	 * renderingOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/renderingOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderingOrder")
	@NInt
	public native long renderingOrder();

	/**
	 * replaceChildNode:with:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/replaceChildNode:with:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("replaceChildNode:with:")
	public native void replaceChildNodeWith(SCNNode oldChild, SCNNode newChild);

	@Generated
	@Selector("resumeAnimationForKey:")
	public native void resumeAnimationForKey(String key);

	/**
	 * rotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/rotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rotation")
	@ByValue
	public native SCNVector4 rotation();

	@Generated
	@Selector("runAction:")
	public native void runAction(SCNAction action);

	@Generated
	@Selector("runAction:completionHandler:")
	public native void runActionCompletionHandler(
			SCNAction action,
			@ObjCBlock(name = "call_runActionCompletionHandler") SCNActionable.Block_runActionCompletionHandler block);

	@Generated
	@Selector("runAction:forKey:")
	public native void runActionForKey(SCNAction action, String key);

	@Generated
	@Selector("runAction:forKey:completionHandler:")
	public native void runActionForKeyCompletionHandler(
			SCNAction action,
			String key,
			@ObjCBlock(name = "call_runActionForKeyCompletionHandler") SCNActionable.Block_runActionForKeyCompletionHandler block);

	/**
	 * scale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/scale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scale")
	@ByValue
	public native SCNVector3 scale();

	@Generated
	@Selector("setBoundingBoxMin:max:")
	public native void setBoundingBoxMinMax(
			SCNVector3 min,
			SCNVector3 max);

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCamera:")
	public native void setCamera(SCNCamera value);

	/**
	 * castsShadow</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/castsShadow">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCastsShadow:")
	public native void setCastsShadow(boolean value);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategoryBitMask:")
	public native void setCategoryBitMask(@NUInt long value);

	/**
	 * constraints</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/constraints">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setConstraints:")
	public native void setConstraints(NSArray<? extends SCNConstraint> value);

	/**
	 * eulerAngles</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/eulerAngles">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEulerAngles:")
	public native void setEulerAngles(@ByValue SCNVector3 value);

	/**
	 * filters</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/filters">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFilters:")
	public native void setFilters(NSArray<? extends CIFilter> value);

	/**
	 * geometry</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/geometry">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setGeometry:")
	public native void setGeometry(SCNGeometry value);

	/**
	 * hidden</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/hidden">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHidden:")
	public native void setHidden(boolean value);

	/**
	 * light</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/light">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLight:")
	public native void setLight(SCNLight value);

	/**
	 * morpher</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/morpher">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMorpher:")
	public native void setMorpher(SCNMorpher value);

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setName:")
	public native void setName(String value);

	/**
	 * opacity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/opacity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOpacity:")
	public native void setOpacity(@NFloat double value);

	/**
	 * orientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/orientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOrientation:")
	public native void setOrientation(@ByValue SCNVector4 value);

	/**
	 * paused</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/paused">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPaused:")
	public native void setPaused(boolean value);

	/**
	 * physicsBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/physicsBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhysicsBody:")
	public native void setPhysicsBody(SCNPhysicsBody value);

	/**
	 * physicsField</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/physicsField">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhysicsField:")
	public native void setPhysicsField(SCNPhysicsField value);

	/**
	 * pivot</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/pivot">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPivot:")
	public native void setPivot(@ByValue SCNMatrix4 value);

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPosition:")
	public native void setPosition(@ByValue SCNVector3 value);

	/**
	 * rendererDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/rendererDelegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRendererDelegate:")
	public native void setRendererDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value);

	/**
	 * rendererDelegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/rendererDelegate">iOS Dev Center</a>
	 */
	@Generated
	public void setRendererDelegate(@Mapped(ObjCObjectMapper.class) SCNNodeRendererDelegate value) {
		Object __old = rendererDelegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime
					.associateObjCObject(this, value);
		}
		setRendererDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	/**
	 * renderingOrder</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/renderingOrder">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRenderingOrder:")
	public native void setRenderingOrder(@NInt long value);

	/**
	 * rotation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/rotation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRotation:")
	public native void setRotation(@ByValue SCNVector4 value);

	/**
	 * scale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/scale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScale:")
	public native void setScale(@ByValue SCNVector3 value);

	/**
	 * skinner</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/skinner">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSkinner:")
	public native void setSkinner(SCNSkinner value);

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTransform:")
	public native void setTransform(@ByValue SCNMatrix4 value);

	/**
	 * skinner</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/skinner">iOS Dev Center</a>
	 */
	@Generated
	@Selector("skinner")
	public native SCNSkinner skinner();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * transform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/transform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transform")
	@ByValue
	public native SCNMatrix4 transform();

	/**
	 * worldTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/worldTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("worldTransform")
	@ByValue
	public native SCNMatrix4 worldTransform();

	@Generated
	@Selector("actionKeys")
	public native NSArray<String> actionKeys();

	/**
	 * addAudioPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/addAudioPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAudioPlayer:")
	public native void addAudioPlayer(SCNAudioPlayer player);

	/**
	 * audioPlayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instp/SCNNode/audioPlayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioPlayers")
	public native NSArray<? extends SCNAudioPlayer> audioPlayers();

	/**
	 * nodeWithMDLObject:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/clm/SCNNode/nodeWithMDLObject:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("nodeWithMDLObject:")
	public static native SCNNode nodeWithMDLObject(MDLObject mdlObject);

	/**
	 * removeAllAudioPlayers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/removeAllAudioPlayers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllAudioPlayers")
	public native void removeAllAudioPlayers();

	/**
	 * removeAudioPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNNode_Class/index.html#//apple_ref/occ/instm/SCNNode/removeAudioPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAudioPlayer:")
	public native void removeAudioPlayer(SCNAudioPlayer player);

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

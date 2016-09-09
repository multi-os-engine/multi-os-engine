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

package ios.spritekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.avfoundation.AVAudioEngine;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSCoder;
import ios.uikit.UIColor;
import ios.spritekit.protocol.SKSceneDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.gameplaykit.GKPolygonObstacle;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKScene extends SKEffectNode {
	static {
		NatJ.register();
	}

	@Generated
	protected SKScene(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKScene alloc();

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorPoint")
	@ByValue
	public native CGPoint anchorPoint();

	/**
	 * backgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/backgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("backgroundColor")
	public native UIColor backgroundColor();

	/**
	 * convertPointFromView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/convertPointFromView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPointFromView:")
	@ByValue
	public native CGPoint convertPointFromView(@ByValue CGPoint point);

	/**
	 * convertPointToView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/convertPointToView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("convertPointToView:")
	@ByValue
	public native CGPoint convertPointToView(@ByValue CGPoint point);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native SKSceneDelegate delegate();

	/**
	 * didApplyConstraints</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didApplyConstraints">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didApplyConstraints")
	public native void didApplyConstraints();

	/**
	 * didChangeSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didChangeSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didChangeSize:")
	public native void didChangeSize(@ByValue CGSize oldSize);

	/**
	 * didEvaluateActions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didEvaluateActions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didEvaluateActions")
	public native void didEvaluateActions();

	/**
	 * didFinishUpdate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didFinishUpdate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didFinishUpdate")
	public native void didFinishUpdate();

	/**
	 * didMoveToView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didMoveToView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didMoveToView:")
	public native void didMoveToView(SKView view);

	/**
	 * didSimulatePhysics</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/didSimulatePhysics">iOS Dev Center</a>
	 */
	@Generated
	@Selector("didSimulatePhysics")
	public native void didSimulatePhysics();

	@Generated
	@Selector("init")
	public native SKScene init();

	@Generated
	@Selector("initWithCoder:")
	public native SKScene initWithCoder(NSCoder aDecoder);

	/**
	 * initWithSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/initWithSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithSize:")
	public native SKScene initWithSize(@ByValue CGSize size);

	@Generated
	@Selector("node")
	public static native SKScene node();

	@Generated
	@Selector("nodeWithFileNamed:")
	public static native SKScene nodeWithFileNamed(String filename);

	/**
	 * physicsWorld</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/physicsWorld">iOS Dev Center</a>
	 */
	@Generated
	@Selector("physicsWorld")
	public native SKPhysicsWorld physicsWorld();

	/**
	 * scaleMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/scaleMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scaleMode")
	@NInt
	public native long scaleMode();

	/**
	 * sceneWithSize:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/clm/SKScene/sceneWithSize:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sceneWithSize:")
	public static native SKScene sceneWithSize(@ByValue CGSize size);

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorPoint:")
	public native void setAnchorPoint(@ByValue CGPoint value);

	/**
	 * backgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/backgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBackgroundColor:")
	public native void setBackgroundColor(UIColor value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) SKSceneDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) SKSceneDelegate value) {
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
	 * scaleMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/scaleMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScaleMode:")
	public native void setScaleMode(@NInt long value);

	/**
	 * size</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/size">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSize:")
	public native void setSize(@ByValue CGSize value);

	/**
	 * size</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/size">iOS Dev Center</a>
	 */
	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	/**
	 * update:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/update:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("update:")
	public native void update(double currentTime);

	/**
	 * view</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/view">iOS Dev Center</a>
	 */
	@Generated
	@Selector("view")
	public native SKView view();

	/**
	 * willMoveFromView:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instm/SKScene/willMoveFromView:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("willMoveFromView:")
	public native void willMoveFromView(SKView view);

	/**
	 * audioEngine</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/audioEngine">iOS Dev Center</a>
	 */
	@Generated
	@Selector("audioEngine")
	public native AVAudioEngine audioEngine();

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("camera")
	public native SKCameraNode camera();

	/**
	 * listener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/listener">iOS Dev Center</a>
	 */
	@Generated
	@Selector("listener")
	public native SKNode listener();

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/camera">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCamera:")
	public native void setCamera_unsafe(SKCameraNode value);

	/**
	 * camera</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/camera">iOS Dev Center</a>
	 */
	@Generated
	public void setCamera(SKCameraNode value) {
		Object __old = camera();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setCamera_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * listener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/listener">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setListener:")
	public native void setListener_unsafe(SKNode value);

	/**
	 * listener</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKScene_Ref/index.html#//apple_ref/occ/instp/SKScene/listener">iOS Dev Center</a>
	 */
	@Generated
	public void setListener(SKNode value) {
		Object __old = listener();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setListener_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

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
	@Selector("clearTextInputContextIdentifier:")
	public static native void clearTextInputContextIdentifier(String identifier);

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
	@Selector("obstaclesFromNodeBounds:")
	public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
			NSArray<? extends SKNode> nodes);

	@Generated
	@Selector("obstaclesFromNodePhysicsBodies:")
	public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
			NSArray<? extends SKNode> nodes);

	@Generated
	@Selector("obstaclesFromSpriteTextures:accuracy:")
	public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
			NSArray<? extends SKNode> sprites, float accuracy);

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

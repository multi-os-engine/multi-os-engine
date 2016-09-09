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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCoder;
import ios.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;
import ios.gameplaykit.GKPolygonObstacle;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKLightNode extends SKNode {
	static {
		NatJ.register();
	}

	@Generated
	protected SKLightNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKLightNode alloc();

	/**
	 * ambientColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/ambientColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ambientColor")
	public native UIColor ambientColor();

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("categoryBitMask")
	public native int categoryBitMask();

	/**
	 * falloff</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/falloff">iOS Dev Center</a>
	 */
	@Generated
	@Selector("falloff")
	@NFloat
	public native double falloff();

	@Generated
	@Selector("init")
	public native SKLightNode init();

	@Generated
	@Selector("initWithCoder:")
	public native SKLightNode initWithCoder(NSCoder aDecoder);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isEnabled")
	public native boolean isEnabled();

	/**
	 * lightColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/lightColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightColor")
	public native UIColor lightColor();

	@Generated
	@Selector("node")
	public static native SKLightNode node();

	@Generated
	@Selector("nodeWithFileNamed:")
	public static native SKLightNode nodeWithFileNamed(String filename);

	/**
	 * ambientColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/ambientColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAmbientColor:")
	public native void setAmbientColor(UIColor value);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategoryBitMask:")
	public native void setCategoryBitMask(int value);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * falloff</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/falloff">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFalloff:")
	public native void setFalloff(@NFloat double value);

	/**
	 * lightColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/lightColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLightColor:")
	public native void setLightColor(UIColor value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShadowColor:")
	public native void setShadowColor(UIColor value);

	/**
	 * shadowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKLightNode_Ref/index.html#//apple_ref/occ/instp/SKLightNode/shadowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shadowColor")
	public native UIColor shadowColor();

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

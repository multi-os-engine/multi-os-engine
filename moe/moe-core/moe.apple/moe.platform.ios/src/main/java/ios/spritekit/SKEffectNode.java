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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.coreimage.CIFilter;
import ios.foundation.NSCoder;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
public class SKEffectNode extends SKNode {
	static {
		NatJ.register();
	}

	@Generated
	protected SKEffectNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKEffectNode alloc();

	/**
	 * blendMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/blendMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("blendMode")
	@NInt
	public native long blendMode();

	/**
	 * filter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/filter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("filter")
	public native CIFilter filter();

	@Generated
	@Selector("init")
	public native SKEffectNode init();

	@Generated
	@Selector("initWithCoder:")
	public native SKEffectNode initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("node")
	public static native SKEffectNode node();

	@Generated
	@Selector("nodeWithFileNamed:")
	public static native SKEffectNode nodeWithFileNamed(String filename);

	/**
	 * blendMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/blendMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBlendMode:")
	public native void setBlendMode(@NInt long value);

	/**
	 * filter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/filter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFilter:")
	public native void setFilter(CIFilter value);

	/**
	 * shader</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shader">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShader:")
	public native void setShader(SKShader value);

	/**
	 * shouldCenterFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldCenterFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldCenterFilter:")
	public native void setShouldCenterFilter(boolean value);

	/**
	 * shouldEnableEffects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldEnableEffects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldEnableEffects:")
	public native void setShouldEnableEffects(boolean value);

	/**
	 * shouldRasterize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldRasterize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setShouldRasterize:")
	public native void setShouldRasterize(boolean value);

	/**
	 * shader</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shader">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shader")
	public native SKShader shader();

	/**
	 * shouldCenterFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldCenterFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldCenterFilter")
	public native boolean shouldCenterFilter();

	/**
	 * shouldEnableEffects</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldEnableEffects">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldEnableEffects")
	public native boolean shouldEnableEffects();

	/**
	 * shouldRasterize</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEffectNode_Ref/index.html#//apple_ref/occ/instp/SKEffectNode/shouldRasterize">iOS Dev Center</a>
	 */
	@Generated
	@Selector("shouldRasterize")
	public native boolean shouldRasterize();

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

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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.AVPlayer;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSCoder;
import ios.foundation.NSURL;
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
public class SKVideoNode extends SKNode {
	static {
		NatJ.register();
	}

	@Generated
	protected SKVideoNode(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKVideoNode alloc();

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instp/SKVideoNode/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorPoint")
	@ByValue
	public native CGPoint anchorPoint();

	@Generated
	@Selector("init")
	public native SKVideoNode init();

	/**
	 * initWithAVPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/initWithAVPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithAVPlayer:")
	public native SKVideoNode initWithAVPlayer(AVPlayer player);

	@Generated
	@Selector("initWithCoder:")
	public native SKVideoNode initWithCoder(NSCoder aDecoder);

	/**
	 * initWithVideoFileNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/initWithVideoFileNamed:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("initWithVideoFileNamed:")
	public native SKVideoNode initWithVideoFileNamed(String videoFile);

	/**
	 * initWithVideoURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/initWithVideoURL:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("initWithVideoURL:")
	public native SKVideoNode initWithVideoURL(NSURL url);

	@Generated
	@Selector("node")
	public static native SKVideoNode node();

	@Generated
	@Selector("nodeWithFileNamed:")
	public static native SKVideoNode nodeWithFileNamed(String filename);

	/**
	 * pause</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/pause">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pause")
	public native void pause();

	/**
	 * play</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/play">iOS Dev Center</a>
	 */
	@Generated
	@Selector("play")
	public native void play();

	/**
	 * anchorPoint</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instp/SKVideoNode/anchorPoint">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorPoint:")
	public native void setAnchorPoint(@ByValue CGPoint value);

	/**
	 * size</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instp/SKVideoNode/size">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSize:")
	public native void setSize(@ByValue CGSize value);

	/**
	 * size</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instp/SKVideoNode/size">iOS Dev Center</a>
	 */
	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	/**
	 * videoNodeWithAVPlayer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/clm/SKVideoNode/videoNodeWithAVPlayer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoNodeWithAVPlayer:")
	public static native SKVideoNode videoNodeWithAVPlayer(AVPlayer player);

	/**
	 * videoNodeWithVideoFileNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/clm/SKVideoNode/videoNodeWithVideoFileNamed:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("videoNodeWithVideoFileNamed:")
	public static native SKVideoNode videoNodeWithVideoFileNamed(
			String videoFile);

	/**
	 * videoNodeWithVideoURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/clm/SKVideoNode/videoNodeWithVideoURL:">iOS Dev Center</a>
	 */
	@Deprecated
	@Generated
	@Selector("videoNodeWithVideoURL:")
	public static native SKVideoNode videoNodeWithVideoURL(NSURL videoURL);

	/**
	 * initWithFileNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/initWithFileNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithFileNamed:")
	public native SKVideoNode initWithFileNamed(String videoFile);

	/**
	 * initWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/instm/SKVideoNode/initWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithURL:")
	public native SKVideoNode initWithURL(NSURL url);

	/**
	 * videoNodeWithFileNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/clm/SKVideoNode/videoNodeWithFileNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoNodeWithFileNamed:")
	public static native SKVideoNode videoNodeWithFileNamed(String videoFile);

	/**
	 * videoNodeWithURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKVideoNode/index.html#//apple_ref/occ/clm/SKVideoNode/videoNodeWithURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("videoNodeWithURL:")
	public static native SKVideoNode videoNodeWithURL(NSURL videoURL);

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

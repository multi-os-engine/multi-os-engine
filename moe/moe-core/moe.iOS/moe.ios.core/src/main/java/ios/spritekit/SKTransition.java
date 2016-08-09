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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coreimage.CIFilter;
import ios.foundation.protocol.NSCopying;
import ios.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTransition extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected SKTransition(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKTransition alloc();

	/**
	 * crossFadeWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/crossFadeWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("crossFadeWithDuration:")
	public static native SKTransition crossFadeWithDuration(double sec);

	/**
	 * doorsCloseHorizontalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/doorsCloseHorizontalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doorsCloseHorizontalWithDuration:")
	public static native SKTransition doorsCloseHorizontalWithDuration(
			double sec);

	/**
	 * doorsCloseVerticalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/doorsCloseVerticalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doorsCloseVerticalWithDuration:")
	public static native SKTransition doorsCloseVerticalWithDuration(double sec);

	/**
	 * doorsOpenHorizontalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/doorsOpenHorizontalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doorsOpenHorizontalWithDuration:")
	public static native SKTransition doorsOpenHorizontalWithDuration(double sec);

	/**
	 * doorsOpenVerticalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/doorsOpenVerticalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doorsOpenVerticalWithDuration:")
	public static native SKTransition doorsOpenVerticalWithDuration(double sec);

	/**
	 * doorwayWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/doorwayWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("doorwayWithDuration:")
	public static native SKTransition doorwayWithDuration(double sec);

	/**
	 * fadeWithColor:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/fadeWithColor:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fadeWithColor:duration:")
	public static native SKTransition fadeWithColorDuration(UIColor color,
			double sec);

	/**
	 * fadeWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/fadeWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("fadeWithDuration:")
	public static native SKTransition fadeWithDuration(double sec);

	/**
	 * flipHorizontalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/flipHorizontalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("flipHorizontalWithDuration:")
	public static native SKTransition flipHorizontalWithDuration(double sec);

	/**
	 * flipVerticalWithDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/flipVerticalWithDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("flipVerticalWithDuration:")
	public static native SKTransition flipVerticalWithDuration(double sec);

	@Generated
	@Selector("init")
	public native SKTransition init();

	/**
	 * moveInWithDirection:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/moveInWithDirection:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("moveInWithDirection:duration:")
	public static native SKTransition moveInWithDirectionDuration(
			@NInt long direction, double sec);

	/**
	 * pausesIncomingScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/instp/SKTransition/pausesIncomingScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pausesIncomingScene")
	public native boolean pausesIncomingScene();

	/**
	 * pausesOutgoingScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/instp/SKTransition/pausesOutgoingScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pausesOutgoingScene")
	public native boolean pausesOutgoingScene();

	/**
	 * pushWithDirection:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/pushWithDirection:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushWithDirection:duration:")
	public static native SKTransition pushWithDirectionDuration(
			@NInt long direction, double sec);

	/**
	 * revealWithDirection:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/revealWithDirection:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("revealWithDirection:duration:")
	public static native SKTransition revealWithDirectionDuration(
			@NInt long direction, double sec);

	/**
	 * pausesIncomingScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/instp/SKTransition/pausesIncomingScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPausesIncomingScene:")
	public native void setPausesIncomingScene(boolean value);

	/**
	 * pausesOutgoingScene</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/instp/SKTransition/pausesOutgoingScene">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPausesOutgoingScene:")
	public native void setPausesOutgoingScene(boolean value);

	/**
	 * transitionWithCIFilter:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKTransition_Ref/index.html#//apple_ref/occ/clm/SKTransition/transitionWithCIFilter:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transitionWithCIFilter:duration:")
	public static native SKTransition transitionWithCIFilterDuration(
			CIFilter filter, double sec);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version();
}

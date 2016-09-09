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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.coregraphics.struct.CGVector;
import ios.foundation.NSArray;
import ios.uikit.struct.UIOffset;
import ios.uikit.protocol.UIDynamicItem;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPushBehavior extends UIDynamicBehavior {
	static {
		NatJ.register();
	}

	@Generated
	protected UIPushBehavior(Pointer peer) {
		super(peer);
	}

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("active")
	public native boolean active();

	/**
	 * addItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/addItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addItem:")
	public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIPushBehavior alloc();

	/**
	 * angle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/angle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angle")
	@NFloat
	public native double angle();

	@Generated
	@Selector("init")
	public native UIPushBehavior init();

	/**
	 * initWithItems:mode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/initWithItems:mode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithItems:mode:")
	public native UIPushBehavior initWithItemsMode(NSArray<?> items,
			@NInt long mode);

	/**
	 * items</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/items">iOS Dev Center</a>
	 */
	@Generated
	@Selector("items")
	public native NSArray<?> items();

	/**
	 * magnitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/magnitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("magnitude")
	@NFloat
	public native double magnitude();

	/**
	 * mode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/mode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mode")
	@NInt
	public native long mode();

	/**
	 * pushDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/pushDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pushDirection")
	@ByValue
	public native CGVector pushDirection();

	/**
	 * removeItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/removeItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeItem:")
	public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

	/**
	 * active</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/active">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActive:")
	public native void setActive(boolean value);

	/**
	 * angle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/angle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngle:")
	public native void setAngle(@NFloat double value);

	/**
	 * setAngle:magnitude:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/setAngle:magnitude:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngle:magnitude:")
	public native void setAngleMagnitude(@NFloat double angle,
			@NFloat double magnitude);

	/**
	 * magnitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/magnitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMagnitude:")
	public native void setMagnitude(@NFloat double value);

	/**
	 * pushDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instp/UIPushBehavior/pushDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPushDirection:")
	public native void setPushDirection(@ByValue CGVector value);

	/**
	 * setTargetOffsetFromCenter:forItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/setTargetOffsetFromCenter:forItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTargetOffsetFromCenter:forItem:")
	public native void setTargetOffsetFromCenterForItem(@ByValue UIOffset o,
			@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

	/**
	 * targetOffsetFromCenterForItem:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIPushBehavior_Class/index.html#//apple_ref/occ/instm/UIPushBehavior/targetOffsetFromCenterForItem:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("targetOffsetFromCenterForItem:")
	@ByValue
	public native UIOffset targetOffsetFromCenterForItem(
			@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

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
	public static native long version_static();
}

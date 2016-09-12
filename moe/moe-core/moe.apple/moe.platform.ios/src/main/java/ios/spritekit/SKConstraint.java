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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.struct.CGPoint;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
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
public class SKConstraint extends NSObject implements NSCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected SKConstraint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKConstraint alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * distance:toNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/distance:toNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distance:toNode:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object distanceToNode(SKRange range, SKNode node);

	/**
	 * distance:toPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/distance:toPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distance:toPoint:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object distanceToPoint(SKRange range,
			@ByValue CGPoint point);

	/**
	 * distance:toPoint:inNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/distance:toPoint:inNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distance:toPoint:inNode:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object distanceToPointInNode(SKRange range,
			@ByValue CGPoint point, SKNode node);

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/instp/SKConstraint/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("enabled")
	public native boolean enabled();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native SKConstraint init();

	@Generated
	@Selector("initWithCoder:")
	public native SKConstraint initWithCoder(NSCoder aDecoder);

	/**
	 * orientToNode:offset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/orientToNode:offset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientToNode:offset:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object orientToNodeOffset(SKNode node, SKRange radians);

	/**
	 * orientToPoint:inNode:offset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/orientToPoint:inNode:offset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientToPoint:inNode:offset:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object orientToPointInNodeOffset(
			@ByValue CGPoint point, SKNode node, SKRange radians);

	/**
	 * orientToPoint:offset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/orientToPoint:offset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orientToPoint:offset:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object orientToPointOffset(@ByValue CGPoint point,
			SKRange radians);

	/**
	 * positionX:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/positionX:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("positionX:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object positionX(SKRange range);

	/**
	 * positionX:Y:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/positionX:Y:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("positionX:Y:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object positionXY(SKRange xRange, SKRange yRange);

	/**
	 * positionY:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/positionY:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("positionY:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object positionY(SKRange range);

	/**
	 * referenceNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/instp/SKConstraint/referenceNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("referenceNode")
	public native SKNode referenceNode();

	/**
	 * enabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/instp/SKConstraint/enabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setEnabled:")
	public native void setEnabled(boolean value);

	/**
	 * referenceNode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/instp/SKConstraint/referenceNode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setReferenceNode:")
	public native void setReferenceNode(SKNode value);

	/**
	 * zRotation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKConstraint_Ref/index.html#//apple_ref/occ/clm/SKConstraint/zRotation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("zRotation:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object zRotation(SKRange zRange);

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

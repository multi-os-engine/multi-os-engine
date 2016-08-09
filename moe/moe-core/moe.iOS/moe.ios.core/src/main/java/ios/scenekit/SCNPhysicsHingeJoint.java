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
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSCoder;
import ios.scenekit.struct.SCNVector3;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsHingeJoint extends SCNPhysicsBehavior {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNPhysicsHingeJoint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNPhysicsHingeJoint alloc();

	/**
	 * anchorA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/anchorA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorA")
	@ByValue
	public native SCNVector3 anchorA();

	/**
	 * anchorB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/anchorB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorB")
	@ByValue
	public native SCNVector3 anchorB();

	/**
	 * axisA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/axisA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("axisA")
	@ByValue
	public native SCNVector3 axisA();

	/**
	 * axisB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/axisB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("axisB")
	@ByValue
	public native SCNVector3 axisB();

	/**
	 * bodyA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/bodyA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyA")
	public native SCNPhysicsBody bodyA();

	/**
	 * bodyB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/bodyB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyB")
	public native SCNPhysicsBody bodyB();

	@Generated
	@Selector("init")
	public native SCNPhysicsHingeJoint init();

	/**
	 * jointWithBody:axis:anchor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/clm/SCNPhysicsHingeJoint/jointWithBody:axis:anchor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jointWithBody:axis:anchor:")
	public static native SCNPhysicsHingeJoint jointWithBodyAxisAnchor(
			SCNPhysicsBody body, @ByValue SCNVector3 axis,
			@ByValue SCNVector3 anchor);

	/**
	 * jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/clm/SCNPhysicsHingeJoint/jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:")
	public static native SCNPhysicsHingeJoint jointWithBodyAAxisAAnchorABodyBAxisBAnchorB(
			SCNPhysicsBody bodyA, @ByValue SCNVector3 axisA,
			@ByValue SCNVector3 anchorA, SCNPhysicsBody bodyB,
			@ByValue SCNVector3 axisB, @ByValue SCNVector3 anchorB);

	/**
	 * anchorA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/anchorA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorA:")
	public native void setAnchorA(@ByValue SCNVector3 value);

	/**
	 * anchorB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/anchorB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorB:")
	public native void setAnchorB(@ByValue SCNVector3 value);

	/**
	 * axisA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/axisA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAxisA:")
	public native void setAxisA(@ByValue SCNVector3 value);

	/**
	 * axisB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsHingeJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsHingeJoint/axisB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAxisB:")
	public native void setAxisB(@ByValue SCNVector3 value);

	@Generated
	@Selector("initWithCoder:")
	public native SCNPhysicsHingeJoint initWithCoder(NSCoder aDecoder);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}

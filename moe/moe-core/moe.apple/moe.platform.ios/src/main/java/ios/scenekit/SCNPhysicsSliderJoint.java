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
import org.moe.natj.general.ann.NFloat;
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
public class SCNPhysicsSliderJoint extends SCNPhysicsBehavior {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNPhysicsSliderJoint(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNPhysicsSliderJoint alloc();

	/**
	 * anchorA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/anchorA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorA")
	@ByValue
	public native SCNVector3 anchorA();

	/**
	 * anchorB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/anchorB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("anchorB")
	@ByValue
	public native SCNVector3 anchorB();

	/**
	 * axisA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/axisA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("axisA")
	@ByValue
	public native SCNVector3 axisA();

	/**
	 * axisB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/axisB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("axisB")
	@ByValue
	public native SCNVector3 axisB();

	/**
	 * bodyA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/bodyA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyA")
	public native SCNPhysicsBody bodyA();

	/**
	 * bodyB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/bodyB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyB")
	public native SCNPhysicsBody bodyB();

	@Generated
	@Selector("init")
	public native SCNPhysicsSliderJoint init();

	/**
	 * jointWithBody:axis:anchor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/clm/SCNPhysicsSliderJoint/jointWithBody:axis:anchor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jointWithBody:axis:anchor:")
	public static native SCNPhysicsSliderJoint jointWithBodyAxisAnchor(
			SCNPhysicsBody body, @ByValue SCNVector3 axis,
			@ByValue SCNVector3 anchor);

	/**
	 * jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/clm/SCNPhysicsSliderJoint/jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("jointWithBodyA:axisA:anchorA:bodyB:axisB:anchorB:")
	public static native SCNPhysicsSliderJoint jointWithBodyAAxisAAnchorABodyBAxisBAnchorB(
			SCNPhysicsBody bodyA, @ByValue SCNVector3 axisA,
			@ByValue SCNVector3 anchorA, SCNPhysicsBody bodyB,
			@ByValue SCNVector3 axisB, @ByValue SCNVector3 anchorB);

	/**
	 * maximumAngularLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/maximumAngularLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumAngularLimit")
	@NFloat
	public native double maximumAngularLimit();

	/**
	 * maximumLinearLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/maximumLinearLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumLinearLimit")
	@NFloat
	public native double maximumLinearLimit();

	/**
	 * minimumAngularLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/minimumAngularLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumAngularLimit")
	@NFloat
	public native double minimumAngularLimit();

	/**
	 * minimumLinearLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/minimumLinearLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minimumLinearLimit")
	@NFloat
	public native double minimumLinearLimit();

	/**
	 * motorMaximumForce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorMaximumForce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("motorMaximumForce")
	@NFloat
	public native double motorMaximumForce();

	/**
	 * motorMaximumTorque</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorMaximumTorque">iOS Dev Center</a>
	 */
	@Generated
	@Selector("motorMaximumTorque")
	@NFloat
	public native double motorMaximumTorque();

	/**
	 * motorTargetAngularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorTargetAngularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("motorTargetAngularVelocity")
	@NFloat
	public native double motorTargetAngularVelocity();

	/**
	 * motorTargetLinearVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorTargetLinearVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("motorTargetLinearVelocity")
	@NFloat
	public native double motorTargetLinearVelocity();

	/**
	 * anchorA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/anchorA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorA:")
	public native void setAnchorA(@ByValue SCNVector3 value);

	/**
	 * anchorB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/anchorB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAnchorB:")
	public native void setAnchorB(@ByValue SCNVector3 value);

	/**
	 * axisA</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/axisA">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAxisA:")
	public native void setAxisA(@ByValue SCNVector3 value);

	/**
	 * axisB</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/axisB">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAxisB:")
	public native void setAxisB(@ByValue SCNVector3 value);

	/**
	 * maximumAngularLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/maximumAngularLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumAngularLimit:")
	public native void setMaximumAngularLimit(@NFloat double value);

	/**
	 * maximumLinearLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/maximumLinearLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumLinearLimit:")
	public native void setMaximumLinearLimit(@NFloat double value);

	/**
	 * minimumAngularLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/minimumAngularLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumAngularLimit:")
	public native void setMinimumAngularLimit(@NFloat double value);

	/**
	 * minimumLinearLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/minimumLinearLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMinimumLinearLimit:")
	public native void setMinimumLinearLimit(@NFloat double value);

	/**
	 * motorMaximumForce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorMaximumForce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMotorMaximumForce:")
	public native void setMotorMaximumForce(@NFloat double value);

	/**
	 * motorMaximumTorque</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorMaximumTorque">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMotorMaximumTorque:")
	public native void setMotorMaximumTorque(@NFloat double value);

	/**
	 * motorTargetAngularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorTargetAngularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMotorTargetAngularVelocity:")
	public native void setMotorTargetAngularVelocity(@NFloat double value);

	/**
	 * motorTargetLinearVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsSliderJoint_Class/index.html#//apple_ref/occ/instp/SCNPhysicsSliderJoint/motorTargetLinearVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMotorTargetLinearVelocity:")
	public native void setMotorTargetLinearVelocity(@NFloat double value);

	@Generated
	@Selector("initWithCoder:")
	public native SCNPhysicsSliderJoint initWithCoder(NSCoder aDecoder);

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

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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.scenekit.struct.SCNVector3;
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
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsVehicleWheel extends NSObject implements NSCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNPhysicsVehicleWheel(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNPhysicsVehicleWheel alloc();

	/**
	 * axle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/axle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("axle")
	@ByValue
	public native SCNVector3 axle();

	/**
	 * connectionPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/connectionPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectionPosition")
	@ByValue
	public native SCNVector3 connectionPosition();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * frictionSlip</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/frictionSlip">iOS Dev Center</a>
	 */
	@Generated
	@Selector("frictionSlip")
	@NFloat
	public native double frictionSlip();

	@Generated
	@Selector("init")
	public native SCNPhysicsVehicleWheel init();

	@Generated
	@Selector("initWithCoder:")
	public native SCNPhysicsVehicleWheel initWithCoder(NSCoder aDecoder);

	/**
	 * maximumSuspensionForce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/maximumSuspensionForce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumSuspensionForce")
	@NFloat
	public native double maximumSuspensionForce();

	/**
	 * maximumSuspensionTravel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/maximumSuspensionTravel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumSuspensionTravel")
	@NFloat
	public native double maximumSuspensionTravel();

	/**
	 * node</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/node">iOS Dev Center</a>
	 */
	@Generated
	@Selector("node")
	public native SCNNode node();

	/**
	 * radius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/radius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("radius")
	@NFloat
	public native double radius();

	/**
	 * axle</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/axle">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAxle:")
	public native void setAxle(@ByValue SCNVector3 value);

	/**
	 * connectionPosition</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/connectionPosition">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setConnectionPosition:")
	public native void setConnectionPosition(@ByValue SCNVector3 value);

	/**
	 * frictionSlip</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/frictionSlip">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFrictionSlip:")
	public native void setFrictionSlip(@NFloat double value);

	/**
	 * maximumSuspensionForce</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/maximumSuspensionForce">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumSuspensionForce:")
	public native void setMaximumSuspensionForce(@NFloat double value);

	/**
	 * maximumSuspensionTravel</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/maximumSuspensionTravel">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMaximumSuspensionTravel:")
	public native void setMaximumSuspensionTravel(@NFloat double value);

	/**
	 * radius</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/radius">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRadius:")
	public native void setRadius(@NFloat double value);

	/**
	 * steeringAxis</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/steeringAxis">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSteeringAxis:")
	public native void setSteeringAxis(@ByValue SCNVector3 value);

	/**
	 * suspensionCompression</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionCompression">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSuspensionCompression:")
	public native void setSuspensionCompression(@NFloat double value);

	/**
	 * suspensionDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSuspensionDamping:")
	public native void setSuspensionDamping(@NFloat double value);

	/**
	 * suspensionRestLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionRestLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSuspensionRestLength:")
	public native void setSuspensionRestLength(@NFloat double value);

	/**
	 * suspensionStiffness</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionStiffness">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSuspensionStiffness:")
	public native void setSuspensionStiffness(@NFloat double value);

	/**
	 * steeringAxis</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/steeringAxis">iOS Dev Center</a>
	 */
	@Generated
	@Selector("steeringAxis")
	@ByValue
	public native SCNVector3 steeringAxis();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * suspensionCompression</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionCompression">iOS Dev Center</a>
	 */
	@Generated
	@Selector("suspensionCompression")
	@NFloat
	public native double suspensionCompression();

	/**
	 * suspensionDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("suspensionDamping")
	@NFloat
	public native double suspensionDamping();

	/**
	 * suspensionRestLength</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionRestLength">iOS Dev Center</a>
	 */
	@Generated
	@Selector("suspensionRestLength")
	@NFloat
	public native double suspensionRestLength();

	/**
	 * suspensionStiffness</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/instp/SCNPhysicsVehicleWheel/suspensionStiffness">iOS Dev Center</a>
	 */
	@Generated
	@Selector("suspensionStiffness")
	@NFloat
	public native double suspensionStiffness();

	/**
	 * wheelWithNode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsVehicleWheel_Class/index.html#//apple_ref/occ/clm/SCNPhysicsVehicleWheel/wheelWithNode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("wheelWithNode:")
	public static native SCNPhysicsVehicleWheel wheelWithNode(SCNNode node);

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
	public static native void load_objc();

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

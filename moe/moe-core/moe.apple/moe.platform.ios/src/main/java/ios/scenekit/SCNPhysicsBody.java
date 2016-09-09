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
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
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
import ios.scenekit.struct.SCNVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsBody extends NSObject implements NSCopying,
		NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected SCNPhysicsBody(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SCNPhysicsBody alloc();

	/**
	 * allowsResting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/allowsResting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsResting")
	public native boolean allowsResting();

	/**
	 * angularDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angularDamping")
	@NFloat
	public native double angularDamping();

	/**
	 * angularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angularVelocity")
	@ByValue
	public native SCNVector4 angularVelocity();

	/**
	 * angularVelocityFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularVelocityFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("angularVelocityFactor")
	@ByValue
	public native SCNVector3 angularVelocityFactor();

	/**
	 * applyForce:atPosition:impulse:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instm/SCNPhysicsBody/applyForce:atPosition:impulse:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyForce:atPosition:impulse:")
	public native void applyForceAtPositionImpulse(
			@ByValue SCNVector3 direction, @ByValue SCNVector3 position,
			boolean impulse);

	/**
	 * applyForce:impulse:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instm/SCNPhysicsBody/applyForce:impulse:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyForce:impulse:")
	public native void applyForceImpulse(@ByValue SCNVector3 direction,
			boolean impulse);

	/**
	 * applyTorque:impulse:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instm/SCNPhysicsBody/applyTorque:impulse:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("applyTorque:impulse:")
	public native void applyTorqueImpulse(@ByValue SCNVector4 torque,
			boolean impulse);

	/**
	 * bodyWithType:shape:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/clm/SCNPhysicsBody/bodyWithType:shape:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("bodyWithType:shape:")
	public static native SCNPhysicsBody bodyWithTypeShape(@NInt long type,
			SCNPhysicsShape shape);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("categoryBitMask")
	@NUInt
	public native long categoryBitMask();

	/**
	 * charge</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/charge">iOS Dev Center</a>
	 */
	@Generated
	@Selector("charge")
	@NFloat
	public native double charge();

	/**
	 * clearAllForces</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instm/SCNPhysicsBody/clearAllForces">iOS Dev Center</a>
	 */
	@Generated
	@Selector("clearAllForces")
	public native void clearAllForces();

	/**
	 * collisionBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/collisionBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("collisionBitMask")
	@NUInt
	public native long collisionBitMask();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * damping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/damping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("damping")
	@NFloat
	public native double damping();

	/**
	 * dynamicBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/clm/SCNPhysicsBody/dynamicBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dynamicBody")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object dynamicBody();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * friction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/friction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("friction")
	@NFloat
	public native double friction();

	@Generated
	@Selector("init")
	public native SCNPhysicsBody init();

	@Generated
	@Selector("initWithCoder:")
	public native SCNPhysicsBody initWithCoder(NSCoder aDecoder);

	/**
	 * isResting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/isResting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isResting")
	public native boolean isResting();

	/**
	 * kinematicBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/clm/SCNPhysicsBody/kinematicBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("kinematicBody")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object kinematicBody();

	/**
	 * mass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/mass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mass")
	@NFloat
	public native double mass();

	/**
	 * physicsShape</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/physicsShape">iOS Dev Center</a>
	 */
	@Generated
	@Selector("physicsShape")
	public native SCNPhysicsShape physicsShape();

	/**
	 * resetTransform</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instm/SCNPhysicsBody/resetTransform">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resetTransform")
	public native void resetTransform();

	/**
	 * restitution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/restitution">iOS Dev Center</a>
	 */
	@Generated
	@Selector("restitution")
	@NFloat
	public native double restitution();

	/**
	 * rollingFriction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/rollingFriction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rollingFriction")
	@NFloat
	public native double rollingFriction();

	/**
	 * allowsResting</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/allowsResting">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsResting:")
	public native void setAllowsResting(boolean value);

	/**
	 * angularDamping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularDamping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngularDamping:")
	public native void setAngularDamping(@NFloat double value);

	/**
	 * angularVelocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularVelocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngularVelocity:")
	public native void setAngularVelocity(@ByValue SCNVector4 value);

	/**
	 * angularVelocityFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/angularVelocityFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAngularVelocityFactor:")
	public native void setAngularVelocityFactor(@ByValue SCNVector3 value);

	/**
	 * categoryBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/categoryBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCategoryBitMask:")
	public native void setCategoryBitMask(@NUInt long value);

	/**
	 * charge</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/charge">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCharge:")
	public native void setCharge(@NFloat double value);

	/**
	 * collisionBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/collisionBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCollisionBitMask:")
	public native void setCollisionBitMask(@NUInt long value);

	/**
	 * damping</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/damping">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDamping:")
	public native void setDamping(@NFloat double value);

	/**
	 * friction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/friction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFriction:")
	public native void setFriction(@NFloat double value);

	/**
	 * mass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/mass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMass:")
	public native void setMass(@NFloat double value);

	/**
	 * physicsShape</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/physicsShape">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPhysicsShape:")
	public native void setPhysicsShape(SCNPhysicsShape value);

	/**
	 * restitution</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/restitution">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRestitution:")
	public native void setRestitution(@NFloat double value);

	/**
	 * rollingFriction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/rollingFriction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRollingFriction:")
	public native void setRollingFriction(@NFloat double value);

	/**
	 * type</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/type">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setType:")
	public native void setType(@NInt long value);

	/**
	 * velocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/velocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVelocity:")
	public native void setVelocity(@ByValue SCNVector3 value);

	/**
	 * velocityFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/velocityFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVelocityFactor:")
	public native void setVelocityFactor(@ByValue SCNVector3 value);

	/**
	 * staticBody</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/clm/SCNPhysicsBody/staticBody">iOS Dev Center</a>
	 */
	@Generated
	@Selector("staticBody")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object staticBody();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * type</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/type">iOS Dev Center</a>
	 */
	@Generated
	@Selector("type")
	@NInt
	public native long type();

	/**
	 * velocity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/velocity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("velocity")
	@ByValue
	public native SCNVector3 velocity();

	/**
	 * velocityFactor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/velocityFactor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("velocityFactor")
	@ByValue
	public native SCNVector3 velocityFactor();

	/**
	 * contactTestBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/contactTestBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("contactTestBitMask")
	@NUInt
	public native long contactTestBitMask();

	/**
	 * affectedByGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/affectedByGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAffectedByGravity")
	public native boolean isAffectedByGravity();

	/**
	 * momentOfInertia</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/momentOfInertia">iOS Dev Center</a>
	 */
	@Generated
	@Selector("momentOfInertia")
	@ByValue
	public native SCNVector3 momentOfInertia();

	/**
	 * affectedByGravity</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/affectedByGravity">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAffectedByGravity:")
	public native void setAffectedByGravity(boolean value);

	/**
	 * contactTestBitMask</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/contactTestBitMask">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setContactTestBitMask:")
	public native void setContactTestBitMask(@NUInt long value);

	/**
	 * momentOfInertia</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/momentOfInertia">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setMomentOfInertia:")
	public native void setMomentOfInertia(@ByValue SCNVector3 value);

	/**
	 * usesDefaultMomentOfInertia</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/usesDefaultMomentOfInertia">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesDefaultMomentOfInertia:")
	public native void setUsesDefaultMomentOfInertia(boolean value);

	/**
	 * usesDefaultMomentOfInertia</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNPhysicsBody_Class/index.html#//apple_ref/occ/instp/SCNPhysicsBody/usesDefaultMomentOfInertia">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesDefaultMomentOfInertia")
	public native boolean usesDefaultMomentOfInertia();

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

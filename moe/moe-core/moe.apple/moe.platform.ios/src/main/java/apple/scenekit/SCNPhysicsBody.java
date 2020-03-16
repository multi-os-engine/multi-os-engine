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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsBody extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsBody(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsBody alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bodyWithType:shape:")
    public static native SCNPhysicsBody bodyWithTypeShape(@NInt long type, SCNPhysicsShape shape);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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
    @Selector("dynamicBody")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object dynamicBody();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("kinematicBody")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object kinematicBody();

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
    @Selector("staticBody")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object staticBody();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("allowsResting")
    public native boolean allowsResting();

    @Generated
    @Selector("angularDamping")
    @NFloat
    public native double angularDamping();

    @Generated
    @Selector("angularVelocity")
    @ByValue
    public native SCNVector4 angularVelocity();

    @Generated
    @Selector("angularVelocityFactor")
    @ByValue
    public native SCNVector3 angularVelocityFactor();

    @Generated
    @Selector("applyForce:atPosition:impulse:")
    public native void applyForceAtPositionImpulse(@ByValue SCNVector3 direction, @ByValue SCNVector3 position,
            boolean impulse);

    @Generated
    @Selector("applyForce:impulse:")
    public native void applyForceImpulse(@ByValue SCNVector3 direction, boolean impulse);

    @Generated
    @Selector("applyTorque:impulse:")
    public native void applyTorqueImpulse(@ByValue SCNVector4 torque, boolean impulse);

    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Selector("charge")
    @NFloat
    public native double charge();

    @Generated
    @Selector("clearAllForces")
    public native void clearAllForces();

    @Generated
    @Selector("collisionBitMask")
    @NUInt
    public native long collisionBitMask();

    @Generated
    @Selector("contactTestBitMask")
    @NUInt
    public native long contactTestBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("friction")
    @NFloat
    public native double friction();

    @Generated
    @Selector("init")
    public native SCNPhysicsBody init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsBody initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAffectedByGravity")
    public native boolean isAffectedByGravity();

    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    @Generated
    @Selector("isResting")
    public native boolean isResting();

    @Generated
    @Selector("mass")
    @NFloat
    public native double mass();

    @Generated
    @Selector("momentOfInertia")
    @ByValue
    public native SCNVector3 momentOfInertia();

    @Generated
    @Selector("physicsShape")
    public native SCNPhysicsShape physicsShape();

    @Generated
    @Selector("resetTransform")
    public native void resetTransform();

    @Generated
    @Selector("restitution")
    @NFloat
    public native double restitution();

    @Generated
    @Selector("rollingFriction")
    @NFloat
    public native double rollingFriction();

    @Generated
    @Selector("setAllowsResting:")
    public native void setAllowsResting(boolean value);

    @Generated
    @Selector("setAngularDamping:")
    public native void setAngularDamping(@NFloat double value);

    @Generated
    @Selector("setAngularVelocity:")
    public native void setAngularVelocity(@ByValue SCNVector4 value);

    @Generated
    @Selector("setAngularVelocityFactor:")
    public native void setAngularVelocityFactor(@ByValue SCNVector3 value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);

    @Generated
    @Selector("setCollisionBitMask:")
    public native void setCollisionBitMask(@NUInt long value);

    @Generated
    @Selector("setContactTestBitMask:")
    public native void setContactTestBitMask(@NUInt long value);

    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    @Generated
    @Selector("setMass:")
    public native void setMass(@NFloat double value);

    @Generated
    @Selector("setMomentOfInertia:")
    public native void setMomentOfInertia(@ByValue SCNVector3 value);

    @Generated
    @Selector("setPhysicsShape:")
    public native void setPhysicsShape(SCNPhysicsShape value);

    @Generated
    @Selector("setRestitution:")
    public native void setRestitution(@NFloat double value);

    @Generated
    @Selector("setRollingFriction:")
    public native void setRollingFriction(@NFloat double value);

    @Generated
    @Selector("setType:")
    public native void setType(@NInt long value);

    @Generated
    @Selector("setUsesDefaultMomentOfInertia:")
    public native void setUsesDefaultMomentOfInertia(boolean value);

    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@ByValue SCNVector3 value);

    @Generated
    @Selector("setVelocityFactor:")
    public native void setVelocityFactor(@ByValue SCNVector3 value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("type")
    @NInt
    public native long type();

    @Generated
    @Selector("usesDefaultMomentOfInertia")
    public native boolean usesDefaultMomentOfInertia();

    @Generated
    @Selector("velocity")
    @ByValue
    public native SCNVector3 velocity();

    @Generated
    @Selector("velocityFactor")
    @ByValue
    public native SCNVector3 velocityFactor();

    @Generated
    @Selector("angularRestingThreshold")
    @NFloat
    public native double angularRestingThreshold();

    @Generated
    @Selector("centerOfMassOffset")
    @ByValue
    public native SCNVector3 centerOfMassOffset();

    @Generated
    @Selector("continuousCollisionDetectionThreshold")
    @NFloat
    public native double continuousCollisionDetectionThreshold();

    @Generated
    @Selector("linearRestingThreshold")
    @NFloat
    public native double linearRestingThreshold();

    @Generated
    @Selector("setAngularRestingThreshold:")
    public native void setAngularRestingThreshold(@NFloat double value);

    @Generated
    @Selector("setCenterOfMassOffset:")
    public native void setCenterOfMassOffset(@ByValue SCNVector3 value);

    @Generated
    @Selector("setContinuousCollisionDetectionThreshold:")
    public native void setContinuousCollisionDetectionThreshold(@NFloat double value);

    @Generated
    @Selector("setLinearRestingThreshold:")
    public native void setLinearRestingThreshold(@NFloat double value);

    @Generated
    @Selector("setResting:")
    public native void setResting(boolean resting);
}

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

/**
 * SCNPhysicsBody
 * <p>
 * The SCNPhysicsBody class describes the physics properties (such as mass, friction...) of a node.
 */
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNPhysicsBody allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Creates an instance of a rigid body with a specific shape.
     */
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

    /**
     * Creates an instance of a dynamic body with default properties.
     */
    @Generated
    @Selector("dynamicBody")
    public static native SCNPhysicsBody dynamicBody();

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

    /**
     * Creates an instance of a kinematic body with default properties.
     */
    @Generated
    @Selector("kinematicBody")
    public static native SCNPhysicsBody kinematicBody();

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPhysicsBody new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Creates an instance of a static body with default properties.
     */
    @Generated
    @Selector("staticBody")
    public static native SCNPhysicsBody staticBody();

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

    /**
     * Specifies if the receiver can be set at rest.
     */
    @Generated
    @Selector("allowsResting")
    public native boolean allowsResting();

    /**
     * Specifies the angular damping of the receiver. Optionally reduce the body's angular velocity each frame to simulate rotational friction. (0.0 - 1.0). Defaults to 0.1.
     */
    @Generated
    @Selector("angularDamping")
    @NFloat
    public native double angularDamping();

    /**
     * Specifies the angular velocity of the receiver as an axis angle.
     */
    @Generated
    @Selector("angularVelocity")
    @ByValue
    public native SCNVector4 angularVelocity();

    /**
     * Specifies a factor applied on the rotation on each axis that results from the physics simulation before applying it to the node.
     */
    @Generated
    @Selector("angularVelocityFactor")
    @ByValue
    public native SCNVector3 angularVelocityFactor();

    /**
     * Applies a linear force with the specified position and direction. The position is relative to the node that owns the physics body.
     */
    @Generated
    @Selector("applyForce:atPosition:impulse:")
    public native void applyForceAtPositionImpulse(@ByValue SCNVector3 direction, @ByValue SCNVector3 position,
            boolean impulse);

    /**
     * Applies a linear force in the specified direction. The linear force is applied on the center of mass of the receiver. If impulse is set to YES then the force is applied for just one frame, otherwise it applies a continuous force.
     */
    @Generated
    @Selector("applyForce:impulse:")
    public native void applyForceImpulse(@ByValue SCNVector3 direction, boolean impulse);

    /**
     * Applies an angular force (torque). If impulse is set to YES then the force is applied for just one frame, otherwise it applies a continuous force. The torque is specified as an axis angle.
     */
    @Generated
    @Selector("applyTorque:impulse:")
    public native void applyTorqueImpulse(@ByValue SCNVector4 torque, boolean impulse);

    /**
     * Defines what logical 'categories' this body belongs too.
     * Defaults to SCNPhysicsCollisionCategoryStatic for static bodies and SCNPhysicsCollisionCategoryDefault for the other body types.
     * limited to the first 15 bits on macOS 10.10 and iOS 8.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * Specifies the charge on the body. Charge determines the degree to which a body is affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0
     */
    @Generated
    @Selector("charge")
    @NFloat
    public native double charge();

    /**
     * Clears the forces applied one the receiver.
     */
    @Generated
    @Selector("clearAllForces")
    public native void clearAllForces();

    /**
     * Defines what logical 'categories' of bodies this body responds to collisions with. Defaults to all bits set (all categories).
     */
    @Generated
    @Selector("collisionBitMask")
    @NUInt
    public native long collisionBitMask();

    /**
     * A mask that defines which categories of bodies cause intersection notifications with this physics body. Defaults to 0.
     * On iOS 8 and macOS 10.10 and lower the intersection notifications are always sent when a collision occurs.
     */
    @Generated
    @Selector("contactTestBitMask")
    @NUInt
    public native long contactTestBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Specifies the damping factor of the receiver. Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or greater. Defaults to 0.1.
     */
    @Generated
    @Selector("damping")
    @NFloat
    public native double damping();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Specifies the force resisting the relative motion of solid sliding against each other. Defaults to 0.5.
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
    public native SCNPhysicsBody initWithCoder(NSCoder coder);

    /**
     * If set to YES this node will be affected by gravity. The default is YES.
     */
    @Generated
    @Selector("isAffectedByGravity")
    public native boolean isAffectedByGravity();

    /**
     * If set to YES this node will be affected by gravity. The default is YES.
     */
    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    /**
     * If the physics simulation has determined that this body is at rest it may set the resting property to YES. Resting bodies do not participate in the simulation until some collision with a non-resting object, or an impulse is applied, that unrests it. If all bodies in the world are resting then the simulation as a whole is "at rest".
     */
    @Generated
    @Selector("isResting")
    public native boolean isResting();

    /**
     * Specifies the Mass of the body in kilogram. Defaults to 1 for dynamic bodies, defaults to 0 for static bodies.
     */
    @Generated
    @Selector("mass")
    @NFloat
    public native double mass();

    /**
     * Specifies the moment of inertia of the body as a vector in 3D. Disable usesDefaultMomentOfInertia for this value to be used instead of the default moment of inertia that is calculated from the shape geometry.
     */
    @Generated
    @Selector("momentOfInertia")
    @ByValue
    public native SCNVector3 momentOfInertia();

    /**
     * Specifies the physics shape of the receiver. Leaving this nil will let the system decide and use the most efficients bounding representation of the actual geometry.
     */
    @Generated
    @Selector("physicsShape")
    public native SCNPhysicsShape physicsShape();

    /**
     * Reset the physical transform to the node's model transform.
     */
    @Generated
    @Selector("resetTransform")
    public native void resetTransform();

    /**
     * Specifies the restitution of collisions. Defaults to 0.5.
     */
    @Generated
    @Selector("restitution")
    @NFloat
    public native double restitution();

    /**
     * Specifies the force resisting the relative motion of solid rolling against each other. Defaults to 0.
     */
    @Generated
    @Selector("rollingFriction")
    @NFloat
    public native double rollingFriction();

    /**
     * Specifies if the receiver can be set at rest.
     */
    @Generated
    @Selector("setAllowsResting:")
    public native void setAllowsResting(boolean value);

    /**
     * Specifies the angular damping of the receiver. Optionally reduce the body's angular velocity each frame to simulate rotational friction. (0.0 - 1.0). Defaults to 0.1.
     */
    @Generated
    @Selector("setAngularDamping:")
    public native void setAngularDamping(@NFloat double value);

    /**
     * Specifies the angular velocity of the receiver as an axis angle.
     */
    @Generated
    @Selector("setAngularVelocity:")
    public native void setAngularVelocity(@ByValue SCNVector4 value);

    /**
     * Specifies a factor applied on the rotation on each axis that results from the physics simulation before applying it to the node.
     */
    @Generated
    @Selector("setAngularVelocityFactor:")
    public native void setAngularVelocityFactor(@ByValue SCNVector3 value);

    /**
     * Defines what logical 'categories' this body belongs too.
     * Defaults to SCNPhysicsCollisionCategoryStatic for static bodies and SCNPhysicsCollisionCategoryDefault for the other body types.
     * limited to the first 15 bits on macOS 10.10 and iOS 8.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * Specifies the charge on the body. Charge determines the degree to which a body is affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0
     */
    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);

    /**
     * Defines what logical 'categories' of bodies this body responds to collisions with. Defaults to all bits set (all categories).
     */
    @Generated
    @Selector("setCollisionBitMask:")
    public native void setCollisionBitMask(@NUInt long value);

    /**
     * A mask that defines which categories of bodies cause intersection notifications with this physics body. Defaults to 0.
     * On iOS 8 and macOS 10.10 and lower the intersection notifications are always sent when a collision occurs.
     */
    @Generated
    @Selector("setContactTestBitMask:")
    public native void setContactTestBitMask(@NUInt long value);

    /**
     * Specifies the damping factor of the receiver. Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or greater. Defaults to 0.1.
     */
    @Generated
    @Selector("setDamping:")
    public native void setDamping(@NFloat double value);

    /**
     * Specifies the force resisting the relative motion of solid sliding against each other. Defaults to 0.5.
     */
    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    /**
     * Specifies the Mass of the body in kilogram. Defaults to 1 for dynamic bodies, defaults to 0 for static bodies.
     */
    @Generated
    @Selector("setMass:")
    public native void setMass(@NFloat double value);

    /**
     * Specifies the moment of inertia of the body as a vector in 3D. Disable usesDefaultMomentOfInertia for this value to be used instead of the default moment of inertia that is calculated from the shape geometry.
     */
    @Generated
    @Selector("setMomentOfInertia:")
    public native void setMomentOfInertia(@ByValue SCNVector3 value);

    /**
     * Specifies the physics shape of the receiver. Leaving this nil will let the system decide and use the most efficients bounding representation of the actual geometry.
     */
    @Generated
    @Selector("setPhysicsShape:")
    public native void setPhysicsShape(SCNPhysicsShape value);

    /**
     * Specifies the restitution of collisions. Defaults to 0.5.
     */
    @Generated
    @Selector("setRestitution:")
    public native void setRestitution(@NFloat double value);

    /**
     * Specifies the force resisting the relative motion of solid rolling against each other. Defaults to 0.
     */
    @Generated
    @Selector("setRollingFriction:")
    public native void setRollingFriction(@NFloat double value);

    /**
     * Specifies the type of the receiver.
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NInt long value);

    /**
     * Permits to disable the use of the default moment of inertia in favor of the one stored in momentOfInertia.
     */
    @Generated
    @Selector("setUsesDefaultMomentOfInertia:")
    public native void setUsesDefaultMomentOfInertia(boolean value);

    /**
     * Specifies the linear velocity of the receiver.
     */
    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@ByValue SCNVector3 value);

    /**
     * Specifies a factor applied on the translation that results from the physics simulation before applying it to the node.
     */
    @Generated
    @Selector("setVelocityFactor:")
    public native void setVelocityFactor(@ByValue SCNVector3 value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Specifies the type of the receiver.
     */
    @Generated
    @Selector("type")
    @NInt
    public native long type();

    /**
     * Permits to disable the use of the default moment of inertia in favor of the one stored in momentOfInertia.
     */
    @Generated
    @Selector("usesDefaultMomentOfInertia")
    public native boolean usesDefaultMomentOfInertia();

    /**
     * Specifies the linear velocity of the receiver.
     */
    @Generated
    @Selector("velocity")
    @ByValue
    public native SCNVector3 velocity();

    /**
     * Specifies a factor applied on the translation that results from the physics simulation before applying it to the node.
     */
    @Generated
    @Selector("velocityFactor")
    @ByValue
    public native SCNVector3 velocityFactor();

    /**
     * Angular velocity threshold under which the body may be considered resting. Defaults to 0.1.
     */
    @Generated
    @Selector("angularRestingThreshold")
    @NFloat
    public native double angularRestingThreshold();

    /**
     * Specifies an offset for the center of mass of the body. Defaults to (0,0,0).
     */
    @Generated
    @Selector("centerOfMassOffset")
    @ByValue
    public native SCNVector3 centerOfMassOffset();

    /**
     * Use discrete collision detection if the body’s distance traveled in one step is at or below this threshold, or continuous collision detection otherwise. Defaults to zero, indicating that continuous collision detection is always disabled.
     */
    @Generated
    @Selector("continuousCollisionDetectionThreshold")
    @NFloat
    public native double continuousCollisionDetectionThreshold();

    /**
     * Linear velocity threshold under which the body may be considered resting. Defaults to 0.1.
     */
    @Generated
    @Selector("linearRestingThreshold")
    @NFloat
    public native double linearRestingThreshold();

    /**
     * Angular velocity threshold under which the body may be considered resting. Defaults to 0.1.
     */
    @Generated
    @Selector("setAngularRestingThreshold:")
    public native void setAngularRestingThreshold(@NFloat double value);

    /**
     * Specifies an offset for the center of mass of the body. Defaults to (0,0,0).
     */
    @Generated
    @Selector("setCenterOfMassOffset:")
    public native void setCenterOfMassOffset(@ByValue SCNVector3 value);

    /**
     * Use discrete collision detection if the body’s distance traveled in one step is at or below this threshold, or continuous collision detection otherwise. Defaults to zero, indicating that continuous collision detection is always disabled.
     */
    @Generated
    @Selector("setContinuousCollisionDetectionThreshold:")
    public native void setContinuousCollisionDetectionThreshold(@NFloat double value);

    /**
     * Linear velocity threshold under which the body may be considered resting. Defaults to 0.1.
     */
    @Generated
    @Selector("setLinearRestingThreshold:")
    public native void setLinearRestingThreshold(@NFloat double value);

    /**
     * Sets a physics body at rest (or not)
     */
    @Generated
    @Selector("setResting:")
    public native void setResting(boolean resting);
}

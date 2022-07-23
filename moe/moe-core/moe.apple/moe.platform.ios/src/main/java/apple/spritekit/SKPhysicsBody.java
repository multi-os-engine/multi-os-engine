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

package apple.spritekit;

import apple.NSObject;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * A SpriteKit physics body. These are the physical representations of your nodes. These specify the area and mass and
 * any collision masking needed.
 * <p>
 * All bodies have zero, one or more shapes that define its area. A body with no shapes is ethereal and does not collide
 * with other bodies.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKPhysicsBody extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKPhysicsBody(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKPhysicsBody alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKPhysicsBody allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Creates an compound body that is the union of the bodies used to create it.
     */
    @Generated
    @Selector("bodyWithBodies:")
    public static native SKPhysicsBody bodyWithBodies(NSArray<? extends SKPhysicsBody> bodies);

    /**
     * Creates a circle of radius r centered at the node's origin.
     *
     * @param r the radius in points
     */
    @Generated
    @Selector("bodyWithCircleOfRadius:")
    public static native SKPhysicsBody bodyWithCircleOfRadius(@NFloat double r);

    /**
     * Creates a circle of radius r centered at a point in the node's coordinate space.
     *
     * @param r the radius in points
     */
    @Generated
    @Selector("bodyWithCircleOfRadius:center:")
    public static native SKPhysicsBody bodyWithCircleOfRadiusCenter(@NFloat double r, @ByValue CGPoint center);

    /**
     * Creates an edge chain from a path. The path must have no self intersection. Edges have no volume and are intended
     * to be used to create static environments. Edges can collide with bodies of volume, but not with each other.
     *
     * @param path the path to use
     */
    @Generated
    @Selector("bodyWithEdgeChainFromPath:")
    public static native SKPhysicsBody bodyWithEdgeChainFromPath(CGPathRef path);

    /**
     * Creates an edge from p1 to p2. Edges have no volume and are intended to be used to create static environments.
     * Edges can collide with bodies of volume, but not with each other.
     *
     * @param p1 start point
     * @param p2 end point
     */
    @Generated
    @Selector("bodyWithEdgeFromPoint:toPoint:")
    public static native SKPhysicsBody bodyWithEdgeFromPointToPoint(@ByValue CGPoint p1, @ByValue CGPoint p2);

    /**
     * Creates an edge loop from a path. A loop is automatically created by joining the last point to the first. The
     * path must have no self intersection. Edges have no volume and are intended to be used to create static
     * environments. Edges can collide with body's of volume, but not with each other.
     *
     * @param path the path to use
     */
    @Generated
    @Selector("bodyWithEdgeLoopFromPath:")
    public static native SKPhysicsBody bodyWithEdgeLoopFromPath(CGPathRef path);

    /**
     * Creates an edge loop from a CGRect. Edges have no volume and are intended to be used to create static
     * environments. Edges can collide with body's of volume, but not with each other.
     *
     * @param rect the CGRect to use
     */
    @Generated
    @Selector("bodyWithEdgeLoopFromRect:")
    public static native SKPhysicsBody bodyWithEdgeLoopFromRect(@ByValue CGRect rect);

    /**
     * The path must represent a convex or concave polygon with counter clockwise winding and no self intersection.
     * Positions are relative to the node's origin.
     *
     * @param path the path to use
     */
    @Generated
    @Selector("bodyWithPolygonFromPath:")
    public static native SKPhysicsBody bodyWithPolygonFromPath(CGPathRef path);

    /**
     * Creates a rectangle of the specified size centered at the node's origin.
     *
     * @param s the size in points
     */
    @Generated
    @Selector("bodyWithRectangleOfSize:")
    public static native SKPhysicsBody bodyWithRectangleOfSize(@ByValue CGSize s);

    /**
     * Creates a rectangle of the specified size centered at a point in the node's coordinate space.
     *
     * @param s the size in points
     */
    @Generated
    @Selector("bodyWithRectangleOfSize:center:")
    public static native SKPhysicsBody bodyWithRectangleOfSizeCenter(@ByValue CGSize s, @ByValue CGPoint center);

    /**
     * Creates a body from the alpha values in the supplied texture.
     *
     * @param texture        the texture to be interpreted
     * @param alphaThreshold the alpha value above which a pixel is interpreted as opaque
     * @param size           of the generated physics body
     */
    @Generated
    @Selector("bodyWithTexture:alphaThreshold:size:")
    public static native SKPhysicsBody bodyWithTextureAlphaThresholdSize(SKTexture texture, float alphaThreshold,
            @ByValue CGSize size);

    /**
     * Creates a body from the alpha values in the supplied texture.
     *
     * @param texture the texture to be interpreted
     * @param size    of the generated physics body
     */
    @Generated
    @Selector("bodyWithTexture:size:")
    public static native SKPhysicsBody bodyWithTextureSize(SKTexture texture, @ByValue CGSize size);

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
    @Owned
    @Selector("new")
    public static native SKPhysicsBody new_objc();

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

    /**
     * Bodies are affected by field forces such as gravity if this property is set and the field's category mask is set
     * appropriately. The default value is YES.
     * <p>
     * If this is set a force is applied to the object based on the mass. Set the field force vector in the scene to
     * modify the strength of the force.
     */
    @Generated
    @Selector("affectedByGravity")
    public native boolean affectedByGravity();

    /**
     * Returns an array of all SKPhysicsBodies currently in contact with this one
     */
    @Generated
    @Selector("allContactedBodies")
    public native NSArray<? extends SKPhysicsBody> allContactedBodies();

    @Generated
    @Selector("allowsRotation")
    public native boolean allowsRotation();

    /**
     * Optionally reduce the body's angular velocity each frame to simulate rotational friction. (0.0 - 1.0). Defaults
     * to 0.1
     */
    @Generated
    @Selector("angularDamping")
    @NFloat
    public native double angularDamping();

    @Generated
    @Selector("angularVelocity")
    @NFloat
    public native double angularVelocity();

    @Generated
    @Selector("applyAngularImpulse:")
    public native void applyAngularImpulse(@NFloat double impulse);

    @Generated
    @Selector("applyForce:")
    public native void applyForce(@ByValue CGVector force);

    @Generated
    @Selector("applyForce:atPoint:")
    public native void applyForceAtPoint(@ByValue CGVector force, @ByValue CGPoint point);

    @Generated
    @Selector("applyImpulse:")
    public native void applyImpulse(@ByValue CGVector impulse);

    @Generated
    @Selector("applyImpulse:atPoint:")
    public native void applyImpulseAtPoint(@ByValue CGVector impulse, @ByValue CGPoint point);

    @Generated
    @Selector("applyTorque:")
    public native void applyTorque(@NFloat double torque);

    /**
     * The area of the body.
     * <p>
     * The unit is arbitrary, as long as the relative areas are consistent throughout the application.
     */
    @Generated
    @Selector("area")
    @NFloat
    public native double area();

    /**
     * Defines what logical 'categories' this body belongs to. Defaults to all bits set (all categories).
     */
    @Generated
    @Selector("categoryBitMask")
    public native int categoryBitMask();

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
     * Defines what logical 'categories' of bodies this body responds to collisions with. Defaults to all bits set (all
     * categories).
     */
    @Generated
    @Selector("collisionBitMask")
    public native int collisionBitMask();

    /**
     * Defines what logical 'categories' of bodies this body generates intersection notifications with. Defaults to all
     * bits cleared (no categories).
     */
    @Generated
    @Selector("contactTestBitMask")
    public native int contactTestBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * The density of the body.
     * <p>
     * The unit is arbitrary, as long as the relative densities are consistent throughout the application. Note that
     * density and mass are inherently related (they are directly proportional), so changing one also changes the other.
     * Both are provided so either can be used depending on what is more relevant to your usage.
     */
    @Generated
    @Selector("density")
    @NFloat
    public native double density();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Defines what logical 'categories' of fields this body responds to. Defaults to all bits set (all categories).
     * Can be forced off via affectedByGravity.
     */
    @Generated
    @Selector("fieldBitMask")
    public native int fieldBitMask();

    /**
     * Determines the 'roughness' for the surface of the physics body (0.0 - 1.0). Defaults to 0.2
     */
    @Generated
    @Selector("friction")
    @NFloat
    public native double friction();

    @Generated
    @Selector("init")
    public native SKPhysicsBody init();

    @Generated
    @Selector("initWithCoder:")
    public native SKPhysicsBody initWithCoder(NSCoder coder);

    @Generated
    @Selector("isDynamic")
    public native boolean isDynamic();

    @Generated
    @Selector("setDynamic:")
    public native void setDynamic(boolean value);

    /**
     * If the physics simulation has determined that this body is at rest it may set the resting property to YES.
     * Resting bodies do not participate
     * in the simulation until some collision with a non-resting object, or an impulse is applied, that unrests it. If
     * all bodies in the world are resting
     * then the simulation as a whole is "at rest".
     */
    @Generated
    @Selector("isResting")
    public native boolean isResting();

    /**
     * If the physics simulation has determined that this body is at rest it may set the resting property to YES.
     * Resting bodies do not participate
     * in the simulation until some collision with a non-resting object, or an impulse is applied, that unrests it. If
     * all bodies in the world are resting
     * then the simulation as a whole is "at rest".
     */
    @Generated
    @Selector("setResting:")
    public native void setResting(boolean value);

    @Generated
    @Selector("joints")
    public native NSArray<? extends SKPhysicsJoint> joints();

    /**
     * Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or
     * greater. Defaults to 0.1.
     * Used in conjunction with per frame impulses, an object can be made to move at a constant speed. For example, if
     * an object 64 points in size
     * and default density and a linearDamping of 25 will slide across the screen in a few seconds if an impulse of
     * magnitude 10 is applied every update.
     */
    @Generated
    @Selector("linearDamping")
    @NFloat
    public native double linearDamping();

    /**
     * The mass of the body.
     * <p>
     * The unit is arbitrary, as long as the relative masses are consistent throughout the application. Note that
     * density and mass are inherently related (they are directly proportional), so changing one also changes the other.
     * Both are provided so either can be used depending on what is more relevant to your usage.
     */
    @Generated
    @Selector("mass")
    @NFloat
    public native double mass();

    /**
     * The representedObject this physicsBody is currently bound to, or nil if it is not.
     */
    @Generated
    @Selector("node")
    public native SKNode node();

    @Generated
    @Selector("pinned")
    public native boolean pinned();

    /**
     * Determines the 'bounciness' of the physics body (0.0 - 1.0). Defaults to 0.2
     */
    @Generated
    @Selector("restitution")
    @NFloat
    public native double restitution();

    /**
     * Bodies are affected by field forces such as gravity if this property is set and the field's category mask is set
     * appropriately. The default value is YES.
     * <p>
     * If this is set a force is applied to the object based on the mass. Set the field force vector in the scene to
     * modify the strength of the force.
     */
    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    @Generated
    @Selector("setAllowsRotation:")
    public native void setAllowsRotation(boolean value);

    /**
     * Optionally reduce the body's angular velocity each frame to simulate rotational friction. (0.0 - 1.0). Defaults
     * to 0.1
     */
    @Generated
    @Selector("setAngularDamping:")
    public native void setAngularDamping(@NFloat double value);

    @Generated
    @Selector("setAngularVelocity:")
    public native void setAngularVelocity(@NFloat double value);

    /**
     * Defines what logical 'categories' this body belongs to. Defaults to all bits set (all categories).
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(int value);

    /**
     * Specifies the charge on the body. Charge determines the degree to which a body is affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0
     */
    @Generated
    @Selector("setCharge:")
    public native void setCharge(@NFloat double value);

    /**
     * Defines what logical 'categories' of bodies this body responds to collisions with. Defaults to all bits set (all
     * categories).
     */
    @Generated
    @Selector("setCollisionBitMask:")
    public native void setCollisionBitMask(int value);

    /**
     * Defines what logical 'categories' of bodies this body generates intersection notifications with. Defaults to all
     * bits cleared (no categories).
     */
    @Generated
    @Selector("setContactTestBitMask:")
    public native void setContactTestBitMask(int value);

    /**
     * The density of the body.
     * <p>
     * The unit is arbitrary, as long as the relative densities are consistent throughout the application. Note that
     * density and mass are inherently related (they are directly proportional), so changing one also changes the other.
     * Both are provided so either can be used depending on what is more relevant to your usage.
     */
    @Generated
    @Selector("setDensity:")
    public native void setDensity(@NFloat double value);

    /**
     * Defines what logical 'categories' of fields this body responds to. Defaults to all bits set (all categories).
     * Can be forced off via affectedByGravity.
     */
    @Generated
    @Selector("setFieldBitMask:")
    public native void setFieldBitMask(int value);

    /**
     * Determines the 'roughness' for the surface of the physics body (0.0 - 1.0). Defaults to 0.2
     */
    @Generated
    @Selector("setFriction:")
    public native void setFriction(@NFloat double value);

    /**
     * Optionally reduce the body's linear velocity each frame to simulate fluid/air friction. Value should be zero or
     * greater. Defaults to 0.1.
     * Used in conjunction with per frame impulses, an object can be made to move at a constant speed. For example, if
     * an object 64 points in size
     * and default density and a linearDamping of 25 will slide across the screen in a few seconds if an impulse of
     * magnitude 10 is applied every update.
     */
    @Generated
    @Selector("setLinearDamping:")
    public native void setLinearDamping(@NFloat double value);

    /**
     * The mass of the body.
     * <p>
     * The unit is arbitrary, as long as the relative masses are consistent throughout the application. Note that
     * density and mass are inherently related (they are directly proportional), so changing one also changes the other.
     * Both are provided so either can be used depending on what is more relevant to your usage.
     */
    @Generated
    @Selector("setMass:")
    public native void setMass(@NFloat double value);

    @Generated
    @Selector("setPinned:")
    public native void setPinned(boolean value);

    /**
     * Determines the 'bounciness' of the physics body (0.0 - 1.0). Defaults to 0.2
     */
    @Generated
    @Selector("setRestitution:")
    public native void setRestitution(@NFloat double value);

    @Generated
    @Selector("setUsesPreciseCollisionDetection:")
    public native void setUsesPreciseCollisionDetection(boolean value);

    @Generated
    @Selector("setVelocity:")
    public native void setVelocity(@ByValue CGVector value);

    @Generated
    @Selector("usesPreciseCollisionDetection")
    public native boolean usesPreciseCollisionDetection();

    @Generated
    @Selector("velocity")
    @ByValue
    public native CGVector velocity();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

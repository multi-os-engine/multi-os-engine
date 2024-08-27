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
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.scenekit.protocol.SCNPhysicsContactDelegate;
import apple.scenekit.struct.SCNMatrix4;
import apple.scenekit.struct.SCNVector3;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNPhysicsWorld
 * 
 * The SCNPhysicsWorld class describes and allows to control the physics simulation of a 3d scene.
 * 
 * The SCNPhysicsWorld class should not be allocated directly but retrieved from the SCNScene class using the
 * physicsWorld property.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsWorld extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsWorld(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsWorld alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNPhysicsWorld allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNPhysicsWorld new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Behaviors management
     */
    @Generated
    @Selector("addBehavior:")
    public native void addBehavior(@NotNull SCNPhysicsBehavior behavior);

    @NotNull
    @Generated
    @Selector("allBehaviors")
    public native NSArray<? extends SCNPhysicsBehavior> allBehaviors();

    /**
     * A delegate that is called when two physic bodies come in contact with each other.
     * On iOS 11 or lower the property is unsafe_unretained and it's the responsibility of the client to set it to nil
     * before deallocating the delegate.
     * Starting in iOS12, the property is weak
     */
    @Nullable
    @Generated
    @Selector("contactDelegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNPhysicsContactDelegate contactDelegate();

    /**
     * The methods below perform contact tests.
     */
    @NotNull
    @Generated
    @Selector("contactTestBetweenBody:andBody:options:")
    public native NSArray<? extends SCNPhysicsContact> contactTestBetweenBodyAndBodyOptions(
            @NotNull SCNPhysicsBody bodyA, @NotNull SCNPhysicsBody bodyB, @Nullable NSDictionary<String, ?> options);

    @NotNull
    @Generated
    @Selector("contactTestWithBody:options:")
    public native NSArray<? extends SCNPhysicsContact> contactTestWithBodyOptions(@NotNull SCNPhysicsBody body,
            @Nullable NSDictionary<String, ?> options);

    @NotNull
    @Generated
    @Selector("convexSweepTestWithShape:fromTransform:toTransform:options:")
    public native NSArray<? extends SCNPhysicsContact> convexSweepTestWithShapeFromTransformToTransformOptions(
            @NotNull SCNPhysicsShape shape, @ByValue SCNMatrix4 from, @ByValue SCNMatrix4 to,
            @Nullable NSDictionary<String, ?> options);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * A global 3D vector specifying the field force acceleration due to gravity. The unit is meter per second. Default
     * is {0, -9.8, 0}.
     */
    @Generated
    @Selector("gravity")
    @ByValue
    public native SCNVector3 gravity();

    @Generated
    @Selector("init")
    public native SCNPhysicsWorld init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsWorld initWithCoder(@NotNull NSCoder coder);

    /**
     * Performs a ray test on the physics bodies and their physics shapes.
     */
    @NotNull
    @Generated
    @Selector("rayTestWithSegmentFromPoint:toPoint:options:")
    public native NSArray<? extends SCNHitTestResult> rayTestWithSegmentFromPointToPointOptions(
            @ByValue SCNVector3 origin, @ByValue SCNVector3 dest, @Nullable NSDictionary<String, ?> options);

    @Generated
    @Selector("removeAllBehaviors")
    public native void removeAllBehaviors();

    @Generated
    @Selector("removeBehavior:")
    public native void removeBehavior(@NotNull SCNPhysicsBehavior behavior);

    /**
     * A delegate that is called when two physic bodies come in contact with each other.
     * On iOS 11 or lower the property is unsafe_unretained and it's the responsibility of the client to set it to nil
     * before deallocating the delegate.
     * Starting in iOS12, the property is weak
     */
    @Generated
    @Selector("setContactDelegate:")
    public native void setContactDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) SCNPhysicsContactDelegate value);

    /**
     * A delegate that is called when two physic bodies come in contact with each other.
     * On iOS 11 or lower the property is unsafe_unretained and it's the responsibility of the client to set it to nil
     * before deallocating the delegate.
     * Starting in iOS12, the property is weak
     */
    @Generated
    public void setContactDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SCNPhysicsContactDelegate value) {
        Object __old = contactDelegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setContactDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * A global 3D vector specifying the field force acceleration due to gravity. The unit is meter per second. Default
     * is {0, -9.8, 0}.
     */
    @Generated
    @Selector("setGravity:")
    public native void setGravity(@ByValue SCNVector3 value);

    /**
     * A speed multiplier applied to the physics simulation. Default is 1.0.
     * The speed can be reduced to slowdown the simulation, but beware that increasing the speed factor will decrease
     * the accuracy of the simulation.
     */
    @Generated
    @Selector("setSpeed:")
    public native void setSpeed(@NFloat double value);

    /**
     * The time step of the physics simulation. Default is 1/60s (60 Hz).
     */
    @Generated
    @Selector("setTimeStep:")
    public native void setTimeStep(double value);

    /**
     * A speed multiplier applied to the physics simulation. Default is 1.0.
     * The speed can be reduced to slowdown the simulation, but beware that increasing the speed factor will decrease
     * the accuracy of the simulation.
     */
    @Generated
    @Selector("speed")
    @NFloat
    public native double speed();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * The time step of the physics simulation. Default is 1/60s (60 Hz).
     */
    @Generated
    @Selector("timeStep")
    public native double timeStep();

    /**
     * Force the physics engine to re-evaluate collisions.
     * This needs to be called if kinematic are moved and the contacts are wanted before the next simulation step.
     */
    @Generated
    @Selector("updateCollisionPairs")
    public native void updateCollisionPairs();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

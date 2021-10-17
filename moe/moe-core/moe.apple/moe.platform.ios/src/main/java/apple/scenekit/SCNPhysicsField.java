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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNPhysicsField
 * <p>
 * SCNPhysicsField is an abstract class that describes a force field that applies in the physics world.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNPhysicsField extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNPhysicsField(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNPhysicsField alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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

    /**
     * A field force with a custom force evaluator.
     */
    @Generated
    @Selector("customFieldWithEvaluationBlock:")
    public static native SCNPhysicsField customFieldWithEvaluationBlock(
            @ObjCBlock(name = "call_customFieldWithEvaluationBlock") Block_customFieldWithEvaluationBlock block);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Slows an object proportionally to the object’s velocity.
     * Use this to simulate effects such as friction from motion through the air.
     */
    @Generated
    @Selector("dragField")
    public static native SCNPhysicsField dragField();

    /**
     * A force proportional to the charge on the object. An example use of this field is to make objects behavior differently
     * from one another when they enter a region, or to make an object's behavior different than its mass based behavior
     * This field models the first part of the Lorentz equation, F = qE
     */
    @Generated
    @Selector("electricField")
    public static native SCNPhysicsField electricField();

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
     * Applies a force in the direction of the "direction" vector in the local space. To repel objects, use a negative strength.
     * The force is the same everywhere in the field. Varies with the mass of the object according to F = ma
     * The field node's rotation property can be used to orient the gravity in a particular direction.
     */
    @Generated
    @Selector("linearGravityField")
    public static native SCNPhysicsField linearGravityField();

    /**
     * A force proportional to the charge on the object and the object’s velocity.
     * An example use of this field is to make objects behavior differently from one another when they enter a region, or to make an object's behavior different than its mass based behavior
     * This field models the second part of the Lorentz equation, F = qvB
     */
    @Generated
    @Selector("magneticField")
    public static native SCNPhysicsField magneticField();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * A time varying differentiable Perlin simplex noise field. A smoothness of 0 means as noisy as possible.
     * Use this to simulate such effects as fireflies, or snow.
     * To freeze the noise in place, set animationSpeed to 0.0. Mass is ignored.
     * You can change the "smoothness" and "animationSpeed" using KVC.
     */
    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * Applies a force in the direction of the origin of the field in local space. To repel objects, use a negative strength.
     * The force is proportional to the distance from the field origin. Varies with the mass of the object according to F = ma
     * The field node's rotation property can be used to orient the gravity in a particular direction.
     */
    @Generated
    @Selector("radialGravityField")
    public static native SCNPhysicsField radialGravityField();

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
     * A Hooke’s law force - a force linearly proportional to distance from the center of the field. An object in this
     * field will oscillate with a period proportional to the inverse of the mass.
     * An example use is to keep objects confined to a particular region.
     */
    @Generated
    @Selector("springField")
    public static native SCNPhysicsField springField();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    /**
     * Just like Noise, except the strength of the noise is proportional to the velocity of the object in the field.
     */
    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SCNPhysicsField turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Applies a force tangential to the direction from the sample point to the field's position.
     * The force will be CCW to the direction. Make the strength negative to apply force in the CW direction.
     * Amount is proportional to distance from center and the object's mass.
     * Use this to create effects such as tornadoes.
     */
    @Generated
    @Selector("vortexField")
    public static native SCNPhysicsField vortexField();

    /**
     * [@property] categoryBitMask
     * <p>
     * Determines the node physicsBody's categories that will be influenced by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Direction of the field. Only applies to linear gravity and vortex fields. Defaults to (0,-1,0).
     */
    @Generated
    @Selector("direction")
    @ByValue
    public native SCNVector3 direction();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Changes the power of the force based on the distance from the center of the field (1 / distance ^ falloffExponent). Defaults to 0.0.
     */
    @Generated
    @Selector("falloffExponent")
    @NFloat
    public native double falloffExponent();

    /**
     * Specifies the half extent of the area of effect. Defaults to FLT_MAX.
     */
    @Generated
    @Selector("halfExtent")
    @ByValue
    public native SCNVector3 halfExtent();

    @Generated
    @Selector("init")
    public native SCNPhysicsField init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNPhysicsField initWithCoder(NSCoder coder);

    /**
     * Specifies whether force field is active or not. Defaults to YES.
     */
    @Generated
    @Selector("isActive")
    public native boolean isActive();

    /**
     * Specifies whether force field is active or not. Defaults to YES.
     */
    @Generated
    @Selector("setActive:")
    public native void setActive(boolean value);

    /**
     * If YES, it suppresses any other field in its area. Defaults to NO.
     */
    @Generated
    @Selector("isExclusive")
    public native boolean isExclusive();

    /**
     * If YES, it suppresses any other field in its area. Defaults to NO.
     */
    @Generated
    @Selector("setExclusive:")
    public native void setExclusive(boolean value);

    /**
     * Distance from the center of the field where the effect is at full strength. Defaults to 1e-6.
     */
    @Generated
    @Selector("minimumDistance")
    @NFloat
    public native double minimumDistance();

    /**
     * Offset of origin effect within the area.
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native SCNVector3 offset();

    /**
     * Controls whether the force field should apply inside or outside of the area. Defaults to inside.
     */
    @Generated
    @Selector("scope")
    @NInt
    public native long scope();

    /**
     * [@property] categoryBitMask
     * <p>
     * Determines the node physicsBody's categories that will be influenced by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * Direction of the field. Only applies to linear gravity and vortex fields. Defaults to (0,-1,0).
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@ByValue SCNVector3 value);

    /**
     * Changes the power of the force based on the distance from the center of the field (1 / distance ^ falloffExponent). Defaults to 0.0.
     */
    @Generated
    @Selector("setFalloffExponent:")
    public native void setFalloffExponent(@NFloat double value);

    /**
     * Specifies the half extent of the area of effect. Defaults to FLT_MAX.
     */
    @Generated
    @Selector("setHalfExtent:")
    public native void setHalfExtent(@ByValue SCNVector3 value);

    /**
     * Distance from the center of the field where the effect is at full strength. Defaults to 1e-6.
     */
    @Generated
    @Selector("setMinimumDistance:")
    public native void setMinimumDistance(@NFloat double value);

    /**
     * Offset of origin effect within the area.
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue SCNVector3 value);

    /**
     * Controls whether the force field should apply inside or outside of the area. Defaults to inside.
     */
    @Generated
    @Selector("setScope:")
    public native void setScope(@NInt long value);

    /**
     * The strength factor of the force field. Defaults to 1.0.
     */
    @Generated
    @Selector("setStrength:")
    public native void setStrength(@NFloat double value);

    /**
     * YES means that the area of effect is rounded within the extent. Defaults to NO.
     */
    @Generated
    @Selector("setUsesEllipsoidalExtent:")
    public native void setUsesEllipsoidalExtent(boolean value);

    /**
     * The strength factor of the force field. Defaults to 1.0.
     */
    @Generated
    @Selector("strength")
    @NFloat
    public native double strength();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * YES means that the area of effect is rounded within the extent. Defaults to NO.
     */
    @Generated
    @Selector("usesEllipsoidalExtent")
    public native boolean usesEllipsoidalExtent();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_customFieldWithEvaluationBlock {
        @Generated
        @ByValue
        SCNVector3 call_customFieldWithEvaluationBlock(@ByValue SCNVector3 position, @ByValue SCNVector3 velocity,
                float mass, float charge, double time);
    }
}

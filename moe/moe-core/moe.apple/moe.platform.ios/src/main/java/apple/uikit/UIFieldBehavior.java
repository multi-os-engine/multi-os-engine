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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.protocol.UIDynamicItem;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIFieldBehavior extends UIDynamicBehavior {
    static {
        NatJ.register();
    }

    @Generated
    protected UIFieldBehavior(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIFieldBehavior alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIFieldBehavior allocWithZone(VoidPtr zone);

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
    public static native UIFieldBehavior dragField();

    /**
     * A force proportional to the charge on the object. A charge property has been
     * added to UIDynamicItemBehavior to accomplish this. An example use of this field is to make objects behavior differently
     * from one another when they enter a region, or to make an object's behavior different than its mass based behavior
     * This field models the first part of the Lorentz equation, F = qE
     */
    @Generated
    @Selector("electricField")
    public static native UIFieldBehavior electricField();

    /**
     * A field force with a custom force evaluator.
     *
     * @param field     the field being evaluated
     * @param position  The location to evaluate the force at
     * @param velocity  The velocity to be considered during force evaluation. Useful for calculating drag.
     * @param mass      The mass to be taken into account during force evaluation
     * @param charge    The charge to be taken into account during force evaluation
     * @param deltaTime The current time step
     */
    @Generated
    @Selector("fieldWithEvaluationBlock:")
    public static native UIFieldBehavior fieldWithEvaluationBlock(
            @ObjCBlock(name = "call_fieldWithEvaluationBlock") Block_fieldWithEvaluationBlock block);

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
     * Applies a force in the direction of the vector in the local space. To repel objects, use a negative strength.
     * The force is the same everywhere in the field. Varies with the mass of the object according to F = ma
     *
     * @param direction The direction the force is applied in the x,y plane. The length of the direction vector is multiplied by
     *                  the field's strength property to get the final calculated force. All components of the direction vector are used to calculate the length.
     * @see direction
     */
    @Generated
    @Selector("linearGravityFieldWithVector:")
    public static native UIFieldBehavior linearGravityFieldWithVector(@ByValue CGVector direction);

    /**
     * The magnetic field is a uniform field in the positive-z direction (coming out of the screen). When the velocity
     * of a charged dynamic item is perpendicular to the uniform magnetic field, the item feels a resulting force normal
     * to both the velocity and the B field. This results CCW circular motion. You can adjust the strength of the B field
     * to be negative which will result in circular motion being CW instead of CCW. An example use of this field is to make
     * objects behavior differently from one another when they enter a region, or to make an object's behavior different
     * than its mass based behavior. This field models the second part of the Lorentz equation, F = qvB
     */
    @Generated
    @Selector("magneticField")
    public static native UIFieldBehavior magneticField();

    @Generated
    @Owned
    @Selector("new")
    public static native UIFieldBehavior new_objc();

    /**
     * A time varying differentiable Perlin simplex noise field. By default a smooth noise is calculated,
     * and the field is time varying. To freeze the noise in place, set animationSpeed to 0.0. Mass is ignored.
     *
     * @param smoothness     value of 0 means as noisy as possible, 1 means as smooth as possible
     * @param animationSpeed is the general field rate of change in Hz
     * @see smoothness
     * @see animationSpeed
     */
    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    public static native UIFieldBehavior noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * Applies a force in the direction of the origin of the field in local space. To repel objects, use a negative strength.
     * The force is proportional to the distance from the field origin. Varies with the mass of the object according to F = ma
     *
     * @param position the origin of the field
     * @see position
     */
    @Generated
    @Selector("radialGravityFieldWithPosition:")
    public static native UIFieldBehavior radialGravityFieldWithPosition(@ByValue CGPoint position);

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
    public static native UIFieldBehavior springField();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Just like Noise, except the strength of the noise is proportional to the velocity of the object in the field.
     *
     * @param smoothness     value of 0 means as noisy as possible, 1 means as smooth as possible
     * @param animationSpeed is the general field rate of change in Hz
     * @see smoothness
     * @see animationSpeed
     */
    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native UIFieldBehavior turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * Uses the supplied velocity vector for any object entering the field’s region of effect.
     * Velocity fields override the effect of any other acceleration applied to the body.
     *
     * @param direction The directed velocity that will be applied to the body.
     * @see direction
     */
    @Generated
    @Selector("velocityFieldWithVector:")
    public static native UIFieldBehavior velocityFieldWithVector(@ByValue CGVector direction);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Applies a force tangential to the direction from the sample point to the field's position.
     * The force will be CCW to the direction. Make the strength negative to apply force in the CW direction.
     * Amount is proportional to distance from center and the object's mass. This can be used to create rotational effects.
     */
    @Generated
    @Selector("vortexField")
    public static native UIFieldBehavior vortexField();

    @Generated
    @Selector("addItem:")
    public native void addItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * Fields that can be animated can have non zero values. A value of 2 will animate twice as fast as a value of 1.
     *
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("animationSpeed")
    @NFloat
    public native double animationSpeed();

    /**
     * The direction of the field.
     * If the field is non-directional, a zero vector will be returned
     *
     * @see linearGravityFieldWithVector:direction
     * @see velocityFieldWithVector:direction
     */
    @Generated
    @Selector("direction")
    @ByValue
    public native CGVector direction();

    /**
     * The falloff exponent used to calculate field strength at a distance.
     * Falloff starts at the minimum radius.
     * The default exponent is zero, which results in a uniform field with no falloff.
     *
     * @see minimumRadius
     */
    @Generated
    @Selector("falloff")
    @NFloat
    public native double falloff();

    @Generated
    @Selector("init")
    public native UIFieldBehavior init();

    @Generated
    @Selector("items")
    public native NSArray<?> items();

    /**
     * Minimum radius of effect. Default is very small.
     */
    @Generated
    @Selector("minimumRadius")
    @NFloat
    public native double minimumRadius();

    /**
     * The position (origin) of the field in the reference coordinate system
     */
    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    /**
     * The region property is the domain of the field's effect. No force is applied to objects outside the region.
     * The default region is the infiniteRegion
     */
    @Generated
    @Selector("region")
    public native UIRegion region();

    @Generated
    @Selector("removeItem:")
    public native void removeItem(@Mapped(ObjCObjectMapper.class) UIDynamicItem item);

    /**
     * Fields that can be animated can have non zero values. A value of 2 will animate twice as fast as a value of 1.
     *
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("setAnimationSpeed:")
    public native void setAnimationSpeed(@NFloat double value);

    /**
     * The direction of the field.
     * If the field is non-directional, a zero vector will be returned
     *
     * @see linearGravityFieldWithVector:direction
     * @see velocityFieldWithVector:direction
     */
    @Generated
    @Selector("setDirection:")
    public native void setDirection(@ByValue CGVector value);

    /**
     * The falloff exponent used to calculate field strength at a distance.
     * Falloff starts at the minimum radius.
     * The default exponent is zero, which results in a uniform field with no falloff.
     *
     * @see minimumRadius
     */
    @Generated
    @Selector("setFalloff:")
    public native void setFalloff(@NFloat double value);

    /**
     * Minimum radius of effect. Default is very small.
     */
    @Generated
    @Selector("setMinimumRadius:")
    public native void setMinimumRadius(@NFloat double value);

    /**
     * The position (origin) of the field in the reference coordinate system
     */
    @Generated
    @Selector("setPosition:")
    public native void setPosition(@ByValue CGPoint value);

    /**
     * The region property is the domain of the field's effect. No force is applied to objects outside the region.
     * The default region is the infiniteRegion
     */
    @Generated
    @Selector("setRegion:")
    public native void setRegion(UIRegion value);

    /**
     * Fields without a smoothness component will return 0
     *
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("setSmoothness:")
    public native void setSmoothness(@NFloat double value);

    /**
     * Strength scaling value. default 1.0
     */
    @Generated
    @Selector("setStrength:")
    public native void setStrength(@NFloat double value);

    /**
     * Fields without a smoothness component will return 0
     *
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("smoothness")
    @NFloat
    public native double smoothness();

    /**
     * Strength scaling value. default 1.0
     */
    @Generated
    @Selector("strength")
    @NFloat
    public native double strength();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_fieldWithEvaluationBlock {
        @Generated
        @ByValue
        CGVector call_fieldWithEvaluationBlock(UIFieldBehavior field, @ByValue CGPoint position,
                @ByValue CGVector velocity, @NFloat double mass, @NFloat double charge, double deltaTime);
    }
}

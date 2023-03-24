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
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
 * API-Since: 8.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKFieldNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKFieldNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKFieldNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKFieldNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

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
    @NotNull
    @Generated
    @Selector("dragField")
    public static native SKFieldNode dragField();

    /**
     * A force proportional to the charge on the object. A charge property has been
     * added to SKPhysicsBodies to accomplish this. An example use of this field is to make objects behavior differently
     * from one another when they enter a region, or to make an object's behavior different than its mass based behavior
     * This field models the first part of the Lorentz equation, F = qE
     */
    @NotNull
    @Generated
    @Selector("electricField")
    public static native SKFieldNode electricField();

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

    /**
     * A force proportional to the charge on the object and the object’s velocity. A charge property has been
     * added to SKPhysicsBodies to accomplish this. An example use of this field is to make objects behavior differently
     * from one another when they enter a region, or to make an object's behavior different than its mass based behavior
     * This field models the second part of the Lorentz equation, F = qvB
     */
    @NotNull
    @Generated
    @Selector("magneticField")
    public static native SKFieldNode magneticField();

    @Generated
    @Owned
    @Selector("new")
    public static native SKFieldNode new_objc();

    @Generated
    @Selector("node")
    public static native SKFieldNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKFieldNode nodeWithFileNamed(@NotNull String filename);

    /**
     * A time varying differentiable Perlin simplex noise field. By default a smooth noise is calculated,
     * and the field is time varying. Use this to simulate such effects as fireflies, or snow.
     * To freeze the noise in place, set animationSpeed to 0.0. Mass is ignored.
     * 
     * @param smoothness value of 0 means as noisy as possible, 1 means as smooth as possible
     * @param speed      is the general rate in Hz that any particular texel changes to a different value
     * 
     * @see smoothness
     * @see animationSpeed
     */
    @NotNull
    @Generated
    @Selector("noiseFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode noiseFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            @NotNull NSArray<? extends SKNode> nodes);

    @NotNull
    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            @NotNull NSArray<? extends SKNode> sprites, float accuracy);

    /**
     * Applies a force in the direction of the origin of the field in local space. To repel objects, use a negative
     * strength.
     * The force is proportional to the distance from the field origin. Varies with the mass of the object according to
     * F = ma
     * The field node's rotation property can be used to orient the gravity in a particular direction.
     */
    @NotNull
    @Generated
    @Selector("radialGravityField")
    public static native SKFieldNode radialGravityField();

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
    @NotNull
    @Generated
    @Selector("springField")
    public static native SKFieldNode springField();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Just like Noise, except the strength of the noise is proportional to the velocity of the object in the field.
     * 
     * @param smoothness value of 0 means as noisy as possible, 1 means as smooth as possible
     * @param speed      is the general rate in Hz that any particular texel changes to a different value
     * 
     * @see smoothness
     * @see animationSpeed
     */
    @NotNull
    @Generated
    @Selector("turbulenceFieldWithSmoothness:animationSpeed:")
    public static native SKFieldNode turbulenceFieldWithSmoothnessAnimationSpeed(@NFloat double smoothness,
            @NFloat double speed);

    /**
     * The supplied texture contains velocity values for any object entering the field’s area of effect.
     * If no texture is supplied, the direction property is used instead.
     * Velocity fields override the effect of any other acceleration applied to the body.
     * Velocity fields are typically used for such effects as advection, for example, a velocity field
     * might describe the velocity on the surface of a river. An object placed in the river would then follow the river.
     * 
     * @param velocityTexture The R and G channels of the supplied texture become x and y components of velocity. B and
     *                        A, if present in the SKTexture, are ignored.
     * 
     * @see texture
     */
    @NotNull
    @Generated
    @Selector("velocityFieldWithTexture:")
    public static native SKFieldNode velocityFieldWithTexture(@NotNull SKTexture velocityTexture);

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
    @NotNull
    @Generated
    @Selector("vortexField")
    public static native SKFieldNode vortexField();

    /**
     * fields that can be animated can have non zero values.
     * 
     * A value of 2 will animated twice as fast as a value of 1.
     * 
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("animationSpeed")
    public native float animationSpeed();

    /**
     * Logical categories the field belongs to. Default is all categories.
     * These categories correspond to fieldBitMasks, and can be used to enforce that a particular field applies
     * to a particular category of objects.
     * 
     * @see SKPhysicsBody.fieldBitMask
     * @see SKEmitterNode.fieldBitMask
     */
    @Generated
    @Selector("categoryBitMask")
    public native int categoryBitMask();

    /**
     * The falloff exponent used to calculate field strength at a distance.
     * Falloff starts at the minimum radius.
     * 
     * The default exponent is zero, which results in a uniform field with no falloff.
     * 
     * @see minimumRadius
     */
    @Generated
    @Selector("falloff")
    public native float falloff();

    @Generated
    @Selector("init")
    public native SKFieldNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKFieldNode initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * If enabled, a field has an effect.
     * 
     * default YES
     */
    @Generated
    @Selector("isEnabled")
    public native boolean isEnabled();

    /**
     * If enabled, a field has an effect.
     * 
     * default YES
     */
    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    /**
     * If a field is exclusive, it suppresses any other field in its region of effect.
     * If two or more exclusive fields overlap, it is undefined which one of them will take effect
     * 
     * @see region
     */
    @Generated
    @Selector("isExclusive")
    public native boolean isExclusive();

    /**
     * If a field is exclusive, it suppresses any other field in its region of effect.
     * If two or more exclusive fields overlap, it is undefined which one of them will take effect
     * 
     * @see region
     */
    @Generated
    @Selector("setExclusive:")
    public native void setExclusive(boolean value);

    /**
     * minimum radius of effect. Default is very small.
     */
    @Generated
    @Selector("minimumRadius")
    public native float minimumRadius();

    /**
     * The region property is the domain of the field's effect. No force is applied to objects outside the region.
     */
    @Nullable
    @Generated
    @Selector("region")
    public native SKRegion region();

    /**
     * fields that can be animated can have non zero values.
     * 
     * A value of 2 will animated twice as fast as a value of 1.
     * 
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("setAnimationSpeed:")
    public native void setAnimationSpeed(float value);

    /**
     * Logical categories the field belongs to. Default is all categories.
     * These categories correspond to fieldBitMasks, and can be used to enforce that a particular field applies
     * to a particular category of objects.
     * 
     * @see SKPhysicsBody.fieldBitMask
     * @see SKEmitterNode.fieldBitMask
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(int value);

    /**
     * The falloff exponent used to calculate field strength at a distance.
     * Falloff starts at the minimum radius.
     * 
     * The default exponent is zero, which results in a uniform field with no falloff.
     * 
     * @see minimumRadius
     */
    @Generated
    @Selector("setFalloff:")
    public native void setFalloff(float value);

    /**
     * minimum radius of effect. Default is very small.
     */
    @Generated
    @Selector("setMinimumRadius:")
    public native void setMinimumRadius(float value);

    /**
     * The region property is the domain of the field's effect. No force is applied to objects outside the region.
     */
    @Generated
    @Selector("setRegion:")
    public native void setRegion(@Nullable SKRegion value);

    /**
     * fields without a smoothness component will return 0
     * 
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("setSmoothness:")
    public native void setSmoothness(float value);

    /**
     * strength scaling value. default 1.0
     */
    @Generated
    @Selector("setStrength:")
    public native void setStrength(float value);

    /**
     * fields constructed with a texture can be uppdated by assigning a new texture
     * 
     * @see velocityFieldWithTexture:velocityTexture
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(@Nullable SKTexture value);

    /**
     * fields without a smoothness component will return 0
     * 
     * @see noiseFieldWithSmoothness:smoothness:animationSpeed
     * @see turbulenceFieldWithSmoothness:smoothness:animationSpeed
     */
    @Generated
    @Selector("smoothness")
    public native float smoothness();

    /**
     * strength scaling value. default 1.0
     */
    @Generated
    @Selector("strength")
    public native float strength();

    /**
     * fields constructed with a texture can be uppdated by assigning a new texture
     * 
     * @see velocityFieldWithTexture:velocityTexture
     */
    @Nullable
    @Generated
    @Selector("texture")
    public native SKTexture texture();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKFieldNode nodeWithFileNamedSecurelyWithClassesAndError(@NotNull String filename,
            @NotNull NSSet<? extends Class> classes, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

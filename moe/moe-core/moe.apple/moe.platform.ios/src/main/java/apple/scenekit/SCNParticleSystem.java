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
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
import apple.scenekit.struct.SCNVector3;
import apple.scenekit.struct.SCNVector4;
import apple.uikit.UIColor;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.Ptr;
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
 * SCNParticleSystem
 * <p>
 * The SCNParticleSystem class represents a system of particles.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNParticleSystem extends NSObject implements NSCopying, NSSecureCoding, SCNAnimatable {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNParticleSystem(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNParticleSystem alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SCNParticleSystem allocWithZone(VoidPtr zone);

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
    public static native SCNParticleSystem new_objc();

    /**
     * Create an instance of a particle system
     */
    @Generated
    @Selector("particleSystem")
    public static native SCNParticleSystem particleSystem();

    @Generated
    @Selector("particleSystemNamed:inDirectory:")
    public static native SCNParticleSystem particleSystemNamedInDirectory(String name, String directory);

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
     * Specifies the acceleration applied to particles, in world coordinates.
     * Allows to simulate winds or gravity. Defaults to {0, 0, 0}. Animatable.
     */
    @Generated
    @Selector("acceleration")
    @ByValue
    public native SCNVector3 acceleration();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    /**
     * Modifications handling
     * "block" will be invoked at every simulation step at the specified stage. The data and dataStride passed to the block will corresponds to the specified "properties".
     */
    @Generated
    @Selector("addModifierForProperties:atStage:withBlock:")
    public native void addModifierForPropertiesAtStageWithBlock(NSArray<String> properties, @NInt long stage,
            @ObjCBlock(name = "call_addModifierForPropertiesAtStageWithBlock") Block_addModifierForPropertiesAtStageWithBlock block);

    /**
     * Enables the use of the gravity defined in SCNPhysicsWorld
     */
    @Generated
    @Selector("affectedByGravity")
    public native boolean affectedByGravity();

    /**
     * Enables the effect of the physics fields added to the SCNPhysicsWorld
     */
    @Generated
    @Selector("affectedByPhysicsFields")
    public native boolean affectedByPhysicsFields();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * Specifies the direction of newly created particles. Defaults to SCNParticleBirthDirectionConstant.
     */
    @Generated
    @Selector("birthDirection")
    @NInt
    public native long birthDirection();

    /**
     * Specifies the location of newly created particles. Defaults to SCNParticleBirthLocationSurface.
     */
    @Generated
    @Selector("birthLocation")
    @NInt
    public native long birthLocation();

    /**
     * Specifies the particle rate flow, in particles per emissionDuration.
     * An emissionDuration of 0 without looping means that the particles are emitted instantaneously
     * 0 means that the emitter emits nothing, unless it has variation. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("birthRate")
    @NFloat
    public native double birthRate();

    /**
     * Specifies the variation of the rate flow. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("birthRateVariation")
    @NFloat
    public native double birthRateVariation();

    /**
     * Specifies the blend mode to use to render the particle system. Defaults to SCNParticleBlendModeAdditive.
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * Specifies an array of SCNNode to collide with.
     */
    @Generated
    @Selector("colliderNodes")
    public native NSArray<? extends SCNNode> colliderNodes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Specifies the particle air resistance. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("dampingFactor")
    @NFloat
    public native double dampingFactor();

    /**
     * Specifies the duration of the emission. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("emissionDuration")
    @NFloat
    public native double emissionDuration();

    /**
     * Specifies the variation of the emission duration. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("emissionDurationVariation")
    @NFloat
    public native double emissionDurationVariation();

    /**
     * Specifies the shape of the emitter. nil means a punctual emitter. Defaults to nil.
     */
    @Generated
    @Selector("emitterShape")
    public native SCNGeometry emitterShape();

    /**
     * Specifies the emitting direction of newly created particles, used in the SCNParticleBirthDirectionConstant mode. Defaults to {0, 0, 1}. Animatable.
     */
    @Generated
    @Selector("emittingDirection")
    @ByValue
    public native SCNVector3 emittingDirection();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Specifies the receiver's fresnel exponent value. Defaults to 3. Animatable.
     * Only used if the particleImage is a cube map. The bigger the amount, the more concentrated the reflection is around the edges
     */
    @Generated
    @Selector("fresnelExponent")
    @NFloat
    public native double fresnelExponent();

    /**
     * Events handling
     * "block" will be invoked for particles that trigger the specified event, with the data and dataStride that corresponds to "properties". The block should only update the particle properties reference by the "indices" passed as argument in the block.
     */
    @Generated
    @Selector("handleEvent:forProperties:withBlock:")
    public native void handleEventForPropertiesWithBlock(@NInt long event, NSArray<String> properties,
            @ObjCBlock(name = "call_handleEventForPropertiesWithBlock") Block_handleEventForPropertiesWithBlock block);

    /**
     * Specifies the idle duration between two emissions. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("idleDuration")
    @NFloat
    public native double idleDuration();

    /**
     * Specifies the variation of the idle duration. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("idleDurationVariation")
    @NFloat
    public native double idleDurationVariation();

    /**
     * Specifies the texture animation mode. Defaults to SCNTextureAnimationModeRepeat.
     */
    @Generated
    @Selector("imageSequenceAnimationMode")
    @NInt
    public native long imageSequenceAnimationMode();

    /**
     * Specifies the number of column in the image sequence. Defaults to 1.
     */
    @Generated
    @Selector("imageSequenceColumnCount")
    @NUInt
    public native long imageSequenceColumnCount();

    /**
     * Specifies the texture animation frame rate, in frames per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("imageSequenceFrameRate")
    @NFloat
    public native double imageSequenceFrameRate();

    /**
     * Specifies the texture animation frame rate variation, in frames per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("imageSequenceFrameRateVariation")
    @NFloat
    public native double imageSequenceFrameRateVariation();

    /**
     * Specifies the texture initial frame index. Ranges from 0 to (imageSequenceColumnCount * imageSequenceRowCount - 1). Defaults to 0. Animatable.
     */
    @Generated
    @Selector("imageSequenceInitialFrame")
    @NFloat
    public native double imageSequenceInitialFrame();

    /**
     * Specifies the texture initial frame variation. Animatable.
     */
    @Generated
    @Selector("imageSequenceInitialFrameVariation")
    @NFloat
    public native double imageSequenceInitialFrameVariation();

    /**
     * Specifies the number of row in the image sequence. Defaults to 1
     */
    @Generated
    @Selector("imageSequenceRowCount")
    @NUInt
    public native long imageSequenceRowCount();

    @Generated
    @Selector("init")
    public native SCNParticleSystem init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNParticleSystem initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * Specifies whether a black pass is required or not when rendering the particle system.
     * This reinforces the contrast of additive/light systems. Defaults to NO.
     */
    @Generated
    @Selector("isBlackPassEnabled")
    public native boolean isBlackPassEnabled();

    /**
     * Specifies whether a black pass is required or not when rendering the particle system.
     * This reinforces the contrast of additive/light systems. Defaults to NO.
     */
    @Generated
    @Selector("setBlackPassEnabled:")
    public native void setBlackPassEnabled(boolean value);

    /**
     * Enables the lighting of particle systems
     */
    @Generated
    @Selector("isLightingEnabled")
    public native boolean isLightingEnabled();

    /**
     * Enables the lighting of particle systems
     */
    @Generated
    @Selector("setLightingEnabled:")
    public native void setLightingEnabled(boolean value);

    /**
     * Specifies the rendering and simulation type of the system.
     * If set to YES, the system is rendered with the transform of the attached node. Defaults to NO.
     */
    @Generated
    @Selector("isLocal")
    public native boolean isLocal();

    /**
     * Specifies the rendering and simulation type of the system.
     * If set to YES, the system is rendered with the transform of the attached node. Defaults to NO.
     */
    @Generated
    @Selector("setLocal:")
    public native void setLocal(boolean value);

    /**
     * Specifies the looping behavior of the emission. Defaults to YES.
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * Specifies the orientation mode of the particles. Defaults to SCNParticleOrientationModeBillboardScreenAligned.
     */
    @Generated
    @Selector("orientationMode")
    @NInt
    public native long orientationMode();

    /**
     * Specifies the initial angle of the particles at birth, in degrees. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleAngle")
    @NFloat
    public native double particleAngle();

    /**
     * Specifies the variation of the initial angle of the particles at birth, in degrees. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleAngleVariation")
    @NFloat
    public native double particleAngleVariation();

    /**
     * Specifies the initial angular velocity of the particles at birth,
     * in degrees per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleAngularVelocity")
    @NFloat
    public native double particleAngularVelocity();

    /**
     * Specifies the variation of the angular velocity, in degrees per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleAngularVelocityVariation")
    @NFloat
    public native double particleAngularVelocityVariation();

    /**
     * Specifies the particle bounce. Animatable.
     */
    @Generated
    @Selector("particleBounce")
    @NFloat
    public native double particleBounce();

    /**
     * Specifies the particle bounce variation. Animatable.
     */
    @Generated
    @Selector("particleBounceVariation")
    @NFloat
    public native double particleBounceVariation();

    /**
     * Specifies the charge on the particle. Charge determines the degree to which a particle is affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0. Animatable.
     */
    @Generated
    @Selector("particleCharge")
    @NFloat
    public native double particleCharge();

    /**
     * Specifies the particle charge variation. Animatable.
     */
    @Generated
    @Selector("particleChargeVariation")
    @NFloat
    public native double particleChargeVariation();

    /**
     * Specifies the initial color of the particle. Animatable. Defaults to opaque white.
     */
    @Generated
    @Selector("particleColor")
    public native UIColor particleColor();

    /**
     * Specifies the normalized variation of the color.
     * With x : hue variation, y : saturation variation, z : brightness variation, w : alpha variation. Animatable.
     */
    @Generated
    @Selector("particleColorVariation")
    @ByValue
    public native SCNVector4 particleColorVariation();

    /**
     * Specifies whether particles die on collision
     */
    @Generated
    @Selector("particleDiesOnCollision")
    public native boolean particleDiesOnCollision();

    /**
     * Specifies the particle friction. Animatable.
     */
    @Generated
    @Selector("particleFriction")
    @NFloat
    public native double particleFriction();

    /**
     * Specifies the particle friction variation. Animatable.
     */
    @Generated
    @Selector("particleFrictionVariation")
    @NFloat
    public native double particleFrictionVariation();

    /**
     * Specifies the image of the particle.
     * Can be set to an NSImage/UIImage, a path or a URL.
     */
    @Generated
    @Selector("particleImage")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object particleImage();

    /**
     * Specifies the life span of particles. Animatable.
     */
    @Generated
    @Selector("particleLifeSpan")
    @NFloat
    public native double particleLifeSpan();

    /**
     * Specifies the life span variation of particles. Animatable.
     */
    @Generated
    @Selector("particleLifeSpanVariation")
    @NFloat
    public native double particleLifeSpanVariation();

    /**
     * Specifies the particle mass. Animatable.
     */
    @Generated
    @Selector("particleMass")
    @NFloat
    public native double particleMass();

    /**
     * Specifies the particle mass variation. Animatable.
     */
    @Generated
    @Selector("particleMassVariation")
    @NFloat
    public native double particleMassVariation();

    /**
     * Specifies the initial size of the particle. Animatable.
     */
    @Generated
    @Selector("particleSize")
    @NFloat
    public native double particleSize();

    /**
     * Specifies the initial size variation of the particle. Animatable.
     */
    @Generated
    @Selector("particleSizeVariation")
    @NFloat
    public native double particleSizeVariation();

    /**
     * Specifies the initial velocity of the particles at birth,
     * in units per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleVelocity")
    @NFloat
    public native double particleVelocity();

    /**
     * Specifies the variation of the velocity. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("particleVelocityVariation")
    @NFloat
    public native double particleVelocityVariation();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    /**
     * Property controllers.
     */
    @Generated
    @Selector("propertyControllers")
    public native NSDictionary<String, ? extends SCNParticlePropertyController> propertyControllers();

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAllModifiers")
    public native void removeAllModifiers();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("removeModifiersOfStage:")
    public native void removeModifiersOfStage(@NInt long stage);

    /**
     * Remove all the already-emitted particles and restart the simulation.
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * Specifies the acceleration applied to particles, in world coordinates.
     * Allows to simulate winds or gravity. Defaults to {0, 0, 0}. Animatable.
     */
    @Generated
    @Selector("setAcceleration:")
    public native void setAcceleration(@ByValue SCNVector3 value);

    /**
     * Enables the use of the gravity defined in SCNPhysicsWorld
     */
    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    /**
     * Enables the effect of the physics fields added to the SCNPhysicsWorld
     */
    @Generated
    @Selector("setAffectedByPhysicsFields:")
    public native void setAffectedByPhysicsFields(boolean value);

    /**
     * Specifies the direction of newly created particles. Defaults to SCNParticleBirthDirectionConstant.
     */
    @Generated
    @Selector("setBirthDirection:")
    public native void setBirthDirection(@NInt long value);

    /**
     * Specifies the location of newly created particles. Defaults to SCNParticleBirthLocationSurface.
     */
    @Generated
    @Selector("setBirthLocation:")
    public native void setBirthLocation(@NInt long value);

    /**
     * Specifies the particle rate flow, in particles per emissionDuration.
     * An emissionDuration of 0 without looping means that the particles are emitted instantaneously
     * 0 means that the emitter emits nothing, unless it has variation. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(@NFloat double value);

    /**
     * Specifies the variation of the rate flow. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setBirthRateVariation:")
    public native void setBirthRateVariation(@NFloat double value);

    /**
     * Specifies the blend mode to use to render the particle system. Defaults to SCNParticleBlendModeAdditive.
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * Specifies an array of SCNNode to collide with.
     */
    @Generated
    @Selector("setColliderNodes:")
    public native void setColliderNodes(NSArray<? extends SCNNode> value);

    /**
     * Specifies the particle air resistance. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setDampingFactor:")
    public native void setDampingFactor(@NFloat double value);

    /**
     * Specifies the duration of the emission. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("setEmissionDuration:")
    public native void setEmissionDuration(@NFloat double value);

    /**
     * Specifies the variation of the emission duration. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setEmissionDurationVariation:")
    public native void setEmissionDurationVariation(@NFloat double value);

    /**
     * Specifies the shape of the emitter. nil means a punctual emitter. Defaults to nil.
     */
    @Generated
    @Selector("setEmitterShape:")
    public native void setEmitterShape(SCNGeometry value);

    /**
     * Specifies the emitting direction of newly created particles, used in the SCNParticleBirthDirectionConstant mode. Defaults to {0, 0, 1}. Animatable.
     */
    @Generated
    @Selector("setEmittingDirection:")
    public native void setEmittingDirection(@ByValue SCNVector3 value);

    /**
     * Specifies the receiver's fresnel exponent value. Defaults to 3. Animatable.
     * Only used if the particleImage is a cube map. The bigger the amount, the more concentrated the reflection is around the edges
     */
    @Generated
    @Selector("setFresnelExponent:")
    public native void setFresnelExponent(@NFloat double value);

    /**
     * Specifies the idle duration between two emissions. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setIdleDuration:")
    public native void setIdleDuration(@NFloat double value);

    /**
     * Specifies the variation of the idle duration. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setIdleDurationVariation:")
    public native void setIdleDurationVariation(@NFloat double value);

    /**
     * Specifies the texture animation mode. Defaults to SCNTextureAnimationModeRepeat.
     */
    @Generated
    @Selector("setImageSequenceAnimationMode:")
    public native void setImageSequenceAnimationMode(@NInt long value);

    /**
     * Specifies the number of column in the image sequence. Defaults to 1.
     */
    @Generated
    @Selector("setImageSequenceColumnCount:")
    public native void setImageSequenceColumnCount(@NUInt long value);

    /**
     * Specifies the texture animation frame rate, in frames per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setImageSequenceFrameRate:")
    public native void setImageSequenceFrameRate(@NFloat double value);

    /**
     * Specifies the texture animation frame rate variation, in frames per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setImageSequenceFrameRateVariation:")
    public native void setImageSequenceFrameRateVariation(@NFloat double value);

    /**
     * Specifies the texture initial frame index. Ranges from 0 to (imageSequenceColumnCount * imageSequenceRowCount - 1). Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setImageSequenceInitialFrame:")
    public native void setImageSequenceInitialFrame(@NFloat double value);

    /**
     * Specifies the texture initial frame variation. Animatable.
     */
    @Generated
    @Selector("setImageSequenceInitialFrameVariation:")
    public native void setImageSequenceInitialFrameVariation(@NFloat double value);

    /**
     * Specifies the number of row in the image sequence. Defaults to 1
     */
    @Generated
    @Selector("setImageSequenceRowCount:")
    public native void setImageSequenceRowCount(@NUInt long value);

    /**
     * Specifies the looping behavior of the emission. Defaults to YES.
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * Specifies the orientation mode of the particles. Defaults to SCNParticleOrientationModeBillboardScreenAligned.
     */
    @Generated
    @Selector("setOrientationMode:")
    public native void setOrientationMode(@NInt long value);

    /**
     * Specifies the initial angle of the particles at birth, in degrees. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleAngle:")
    public native void setParticleAngle(@NFloat double value);

    /**
     * Specifies the variation of the initial angle of the particles at birth, in degrees. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleAngleVariation:")
    public native void setParticleAngleVariation(@NFloat double value);

    /**
     * Specifies the initial angular velocity of the particles at birth,
     * in degrees per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleAngularVelocity:")
    public native void setParticleAngularVelocity(@NFloat double value);

    /**
     * Specifies the variation of the angular velocity, in degrees per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleAngularVelocityVariation:")
    public native void setParticleAngularVelocityVariation(@NFloat double value);

    /**
     * Specifies the particle bounce. Animatable.
     */
    @Generated
    @Selector("setParticleBounce:")
    public native void setParticleBounce(@NFloat double value);

    /**
     * Specifies the particle bounce variation. Animatable.
     */
    @Generated
    @Selector("setParticleBounceVariation:")
    public native void setParticleBounceVariation(@NFloat double value);

    /**
     * Specifies the charge on the particle. Charge determines the degree to which a particle is affected by
     * electric and magnetic fields. Note that this is a unitless quantity, it is up to the developer to
     * set charge and field strength appropriately. Defaults to 0.0. Animatable.
     */
    @Generated
    @Selector("setParticleCharge:")
    public native void setParticleCharge(@NFloat double value);

    /**
     * Specifies the particle charge variation. Animatable.
     */
    @Generated
    @Selector("setParticleChargeVariation:")
    public native void setParticleChargeVariation(@NFloat double value);

    /**
     * Specifies the initial color of the particle. Animatable. Defaults to opaque white.
     */
    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    /**
     * Specifies the normalized variation of the color.
     * With x : hue variation, y : saturation variation, z : brightness variation, w : alpha variation. Animatable.
     */
    @Generated
    @Selector("setParticleColorVariation:")
    public native void setParticleColorVariation(@ByValue SCNVector4 value);

    /**
     * Specifies whether particles die on collision
     */
    @Generated
    @Selector("setParticleDiesOnCollision:")
    public native void setParticleDiesOnCollision(boolean value);

    /**
     * Specifies the particle friction. Animatable.
     */
    @Generated
    @Selector("setParticleFriction:")
    public native void setParticleFriction(@NFloat double value);

    /**
     * Specifies the particle friction variation. Animatable.
     */
    @Generated
    @Selector("setParticleFrictionVariation:")
    public native void setParticleFrictionVariation(@NFloat double value);

    /**
     * Specifies the image of the particle.
     * Can be set to an NSImage/UIImage, a path or a URL.
     */
    @Generated
    @Selector("setParticleImage:")
    public native void setParticleImage(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * Specifies the life span of particles. Animatable.
     */
    @Generated
    @Selector("setParticleLifeSpan:")
    public native void setParticleLifeSpan(@NFloat double value);

    /**
     * Specifies the life span variation of particles. Animatable.
     */
    @Generated
    @Selector("setParticleLifeSpanVariation:")
    public native void setParticleLifeSpanVariation(@NFloat double value);

    /**
     * Specifies the particle mass. Animatable.
     */
    @Generated
    @Selector("setParticleMass:")
    public native void setParticleMass(@NFloat double value);

    /**
     * Specifies the particle mass variation. Animatable.
     */
    @Generated
    @Selector("setParticleMassVariation:")
    public native void setParticleMassVariation(@NFloat double value);

    /**
     * Specifies the initial size of the particle. Animatable.
     */
    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@NFloat double value);

    /**
     * Specifies the initial size variation of the particle. Animatable.
     */
    @Generated
    @Selector("setParticleSizeVariation:")
    public native void setParticleSizeVariation(@NFloat double value);

    /**
     * Specifies the initial velocity of the particles at birth,
     * in units per second. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleVelocity:")
    public native void setParticleVelocity(@NFloat double value);

    /**
     * Specifies the variation of the velocity. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setParticleVelocityVariation:")
    public native void setParticleVelocityVariation(@NFloat double value);

    /**
     * Property controllers.
     */
    @Generated
    @Selector("setPropertyControllers:")
    public native void setPropertyControllers(NSDictionary<String, ? extends SCNParticlePropertyController> value);

    /**
     * Specifies the sorting mode of the particles. Defaults to SCNParticleSortingModeNone.
     */
    @Generated
    @Selector("setSortingMode:")
    public native void setSortingMode(@NInt long value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * Specifies the simulation speed multiplier. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("setSpeedFactor:")
    public native void setSpeedFactor(@NFloat double value);

    /**
     * Specifies the spreading direction of newly created particles, in degrees. Not used in SCNParticleBirthDirectionRandom. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setSpreadingAngle:")
    public native void setSpreadingAngle(@NFloat double value);

    /**
     * Specifies whether particles stretch along their direction. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setStretchFactor:")
    public native void setStretchFactor(@NFloat double value);

    /**
     * Specifies an optional system to spawn new particles when a particle dies
     */
    @Generated
    @Selector("setSystemSpawnedOnCollision:")
    public native void setSystemSpawnedOnCollision(SCNParticleSystem value);

    /**
     * Specifies an optional system to spawn new particles when a particle dies
     */
    @Generated
    @Selector("setSystemSpawnedOnDying:")
    public native void setSystemSpawnedOnDying(SCNParticleSystem value);

    /**
     * Specifies an optional system to spawn new particles when a particle is alive
     */
    @Generated
    @Selector("setSystemSpawnedOnLiving:")
    public native void setSystemSpawnedOnLiving(SCNParticleSystem value);

    /**
     * Specifies the time length during which particles are emit before the first rendering of the system.
     * For example this allows to start a scene with snow that already has fallen. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("setWarmupDuration:")
    public native void setWarmupDuration(@NFloat double value);

    /**
     * Specifies the sorting mode of the particles. Defaults to SCNParticleSortingModeNone.
     */
    @Generated
    @Selector("sortingMode")
    @NInt
    public native long sortingMode();

    /**
     * Specifies the simulation speed multiplier. Defaults to 1. Animatable.
     */
    @Generated
    @Selector("speedFactor")
    @NFloat
    public native double speedFactor();

    /**
     * Specifies the spreading direction of newly created particles, in degrees. Not used in SCNParticleBirthDirectionRandom. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("spreadingAngle")
    @NFloat
    public native double spreadingAngle();

    /**
     * Specifies whether particles stretch along their direction. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("stretchFactor")
    @NFloat
    public native double stretchFactor();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Specifies an optional system to spawn new particles when a particle dies
     */
    @Generated
    @Selector("systemSpawnedOnCollision")
    public native SCNParticleSystem systemSpawnedOnCollision();

    /**
     * Specifies an optional system to spawn new particles when a particle dies
     */
    @Generated
    @Selector("systemSpawnedOnDying")
    public native SCNParticleSystem systemSpawnedOnDying();

    /**
     * Specifies an optional system to spawn new particles when a particle is alive
     */
    @Generated
    @Selector("systemSpawnedOnLiving")
    public native SCNParticleSystem systemSpawnedOnLiving();

    /**
     * Specifies the time length during which particles are emit before the first rendering of the system.
     * For example this allows to start a scene with snow that already has fallen. Defaults to 0. Animatable.
     */
    @Generated
    @Selector("warmupDuration")
    @NFloat
    public native double warmupDuration();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addModifierForPropertiesAtStageWithBlock {
        @Generated
        void call_addModifierForPropertiesAtStageWithBlock(
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> data, NUIntPtr dataStride, @NInt long start,
                @NInt long end, float deltaTime);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleEventForPropertiesWithBlock {
        @Generated
        void call_handleEventForPropertiesWithBlock(@ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> data,
                NUIntPtr dataStride, IntPtr indices, @NInt long count);
    }

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    /**
     * Specifies the orientation direction of newly created particles, used in the SCNParticleOrientationModeFree mode. The particle will rotate around this axis. Defaults to {0, 0, 0}, which means random. The particle will then rotate arbitraly. Animatable.
     */
    @Generated
    @Selector("orientationDirection")
    @ByValue
    public native SCNVector3 orientationDirection();

    /**
     * Specifies the initial intensity of the particle. Animatable.
     */
    @Generated
    @Selector("particleIntensity")
    @NFloat
    public native double particleIntensity();

    /**
     * Specifies the initial intensity variation of the particle. Animatable.
     */
    @Generated
    @Selector("particleIntensityVariation")
    @NFloat
    public native double particleIntensityVariation();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * Specifies the orientation direction of newly created particles, used in the SCNParticleOrientationModeFree mode. The particle will rotate around this axis. Defaults to {0, 0, 0}, which means random. The particle will then rotate arbitraly. Animatable.
     */
    @Generated
    @Selector("setOrientationDirection:")
    public native void setOrientationDirection(@ByValue SCNVector3 value);

    /**
     * Specifies the initial intensity of the particle. Animatable.
     */
    @Generated
    @Selector("setParticleIntensity:")
    public native void setParticleIntensity(@NFloat double value);

    /**
     * Specifies the initial intensity variation of the particle. Animatable.
     */
    @Generated
    @Selector("setParticleIntensityVariation:")
    public native void setParticleIntensityVariation(@NFloat double value);

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);

    /**
     * [@property] writeToDepthBuffer
     * <p>
     * Determines whether the receiver writes to the depth buffer when rendered. Defaults to NO.
     */
    @Generated
    @Selector("setWritesToDepthBuffer:")
    public native void setWritesToDepthBuffer(boolean value);

    /**
     * [@property] writeToDepthBuffer
     * <p>
     * Determines whether the receiver writes to the depth buffer when rendered. Defaults to NO.
     */
    @Generated
    @Selector("writesToDepthBuffer")
    public native boolean writesToDepthBuffer();
}

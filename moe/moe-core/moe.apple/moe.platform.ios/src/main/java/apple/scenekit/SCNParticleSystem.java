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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("acceleration")
    @ByValue
    public native SCNVector3 acceleration();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) Object animation, String key);

    @Generated
    @Selector("addModifierForProperties:atStage:withBlock:")
    public native void addModifierForPropertiesAtStageWithBlock(NSArray<String> properties, @NInt long stage,
            @ObjCBlock(name = "call_addModifierForPropertiesAtStageWithBlock") Block_addModifierForPropertiesAtStageWithBlock block);

    @Generated
    @Selector("affectedByGravity")
    public native boolean affectedByGravity();

    @Generated
    @Selector("affectedByPhysicsFields")
    public native boolean affectedByPhysicsFields();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("birthDirection")
    @NInt
    public native long birthDirection();

    @Generated
    @Selector("birthLocation")
    @NInt
    public native long birthLocation();

    @Generated
    @Selector("birthRate")
    @NFloat
    public native double birthRate();

    @Generated
    @Selector("birthRateVariation")
    @NFloat
    public native double birthRateVariation();

    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Selector("colliderNodes")
    public native NSArray<? extends SCNNode> colliderNodes();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("dampingFactor")
    @NFloat
    public native double dampingFactor();

    @Generated
    @Selector("emissionDuration")
    @NFloat
    public native double emissionDuration();

    @Generated
    @Selector("emissionDurationVariation")
    @NFloat
    public native double emissionDurationVariation();

    @Generated
    @Selector("emitterShape")
    public native SCNGeometry emitterShape();

    @Generated
    @Selector("emittingDirection")
    @ByValue
    public native SCNVector3 emittingDirection();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("fresnelExponent")
    @NFloat
    public native double fresnelExponent();

    @Generated
    @Selector("handleEvent:forProperties:withBlock:")
    public native void handleEventForPropertiesWithBlock(@NInt long event, NSArray<String> properties,
            @ObjCBlock(name = "call_handleEventForPropertiesWithBlock") Block_handleEventForPropertiesWithBlock block);

    @Generated
    @Selector("idleDuration")
    @NFloat
    public native double idleDuration();

    @Generated
    @Selector("idleDurationVariation")
    @NFloat
    public native double idleDurationVariation();

    @Generated
    @Selector("imageSequenceAnimationMode")
    @NInt
    public native long imageSequenceAnimationMode();

    @Generated
    @Selector("imageSequenceColumnCount")
    @NUInt
    public native long imageSequenceColumnCount();

    @Generated
    @Selector("imageSequenceFrameRate")
    @NFloat
    public native double imageSequenceFrameRate();

    @Generated
    @Selector("imageSequenceFrameRateVariation")
    @NFloat
    public native double imageSequenceFrameRateVariation();

    @Generated
    @Selector("imageSequenceInitialFrame")
    @NFloat
    public native double imageSequenceInitialFrame();

    @Generated
    @Selector("imageSequenceInitialFrameVariation")
    @NFloat
    public native double imageSequenceInitialFrameVariation();

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

    @Generated
    @Selector("isBlackPassEnabled")
    public native boolean isBlackPassEnabled();

    @Generated
    @Selector("setBlackPassEnabled:")
    public native void setBlackPassEnabled(boolean value);

    @Generated
    @Selector("isLightingEnabled")
    public native boolean isLightingEnabled();

    @Generated
    @Selector("setLightingEnabled:")
    public native void setLightingEnabled(boolean value);

    @Generated
    @Selector("isLocal")
    public native boolean isLocal();

    @Generated
    @Selector("setLocal:")
    public native void setLocal(boolean value);

    @Generated
    @Selector("loops")
    public native boolean loops();

    @Generated
    @Selector("orientationMode")
    @NInt
    public native long orientationMode();

    @Generated
    @Selector("particleAngle")
    @NFloat
    public native double particleAngle();

    @Generated
    @Selector("particleAngleVariation")
    @NFloat
    public native double particleAngleVariation();

    @Generated
    @Selector("particleAngularVelocity")
    @NFloat
    public native double particleAngularVelocity();

    @Generated
    @Selector("particleAngularVelocityVariation")
    @NFloat
    public native double particleAngularVelocityVariation();

    @Generated
    @Selector("particleBounce")
    @NFloat
    public native double particleBounce();

    @Generated
    @Selector("particleBounceVariation")
    @NFloat
    public native double particleBounceVariation();

    @Generated
    @Selector("particleCharge")
    @NFloat
    public native double particleCharge();

    @Generated
    @Selector("particleChargeVariation")
    @NFloat
    public native double particleChargeVariation();

    @Generated
    @Selector("particleColor")
    public native UIColor particleColor();

    @Generated
    @Selector("particleColorVariation")
    @ByValue
    public native SCNVector4 particleColorVariation();

    @Generated
    @Selector("particleDiesOnCollision")
    public native boolean particleDiesOnCollision();

    @Generated
    @Selector("particleFriction")
    @NFloat
    public native double particleFriction();

    @Generated
    @Selector("particleFrictionVariation")
    @NFloat
    public native double particleFrictionVariation();

    @Generated
    @Selector("particleImage")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object particleImage();

    @Generated
    @Selector("particleLifeSpan")
    @NFloat
    public native double particleLifeSpan();

    @Generated
    @Selector("particleLifeSpanVariation")
    @NFloat
    public native double particleLifeSpanVariation();

    @Generated
    @Selector("particleMass")
    @NFloat
    public native double particleMass();

    @Generated
    @Selector("particleMassVariation")
    @NFloat
    public native double particleMassVariation();

    @Generated
    @Selector("particleSize")
    @NFloat
    public native double particleSize();

    @Generated
    @Selector("particleSizeVariation")
    @NFloat
    public native double particleSizeVariation();

    @Generated
    @Selector("particleVelocity")
    @NFloat
    public native double particleVelocity();

    @Generated
    @Selector("particleVelocityVariation")
    @NFloat
    public native double particleVelocityVariation();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

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

    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    @Generated
    @Selector("setAcceleration:")
    public native void setAcceleration(@ByValue SCNVector3 value);

    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    @Generated
    @Selector("setAffectedByPhysicsFields:")
    public native void setAffectedByPhysicsFields(boolean value);

    @Generated
    @Selector("setBirthDirection:")
    public native void setBirthDirection(@NInt long value);

    @Generated
    @Selector("setBirthLocation:")
    public native void setBirthLocation(@NInt long value);

    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(@NFloat double value);

    @Generated
    @Selector("setBirthRateVariation:")
    public native void setBirthRateVariation(@NFloat double value);

    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    @Generated
    @Selector("setColliderNodes:")
    public native void setColliderNodes(NSArray<? extends SCNNode> value);

    @Generated
    @Selector("setDampingFactor:")
    public native void setDampingFactor(@NFloat double value);

    @Generated
    @Selector("setEmissionDuration:")
    public native void setEmissionDuration(@NFloat double value);

    @Generated
    @Selector("setEmissionDurationVariation:")
    public native void setEmissionDurationVariation(@NFloat double value);

    @Generated
    @Selector("setEmitterShape:")
    public native void setEmitterShape(SCNGeometry value);

    @Generated
    @Selector("setEmittingDirection:")
    public native void setEmittingDirection(@ByValue SCNVector3 value);

    @Generated
    @Selector("setFresnelExponent:")
    public native void setFresnelExponent(@NFloat double value);

    @Generated
    @Selector("setIdleDuration:")
    public native void setIdleDuration(@NFloat double value);

    @Generated
    @Selector("setIdleDurationVariation:")
    public native void setIdleDurationVariation(@NFloat double value);

    @Generated
    @Selector("setImageSequenceAnimationMode:")
    public native void setImageSequenceAnimationMode(@NInt long value);

    @Generated
    @Selector("setImageSequenceColumnCount:")
    public native void setImageSequenceColumnCount(@NUInt long value);

    @Generated
    @Selector("setImageSequenceFrameRate:")
    public native void setImageSequenceFrameRate(@NFloat double value);

    @Generated
    @Selector("setImageSequenceFrameRateVariation:")
    public native void setImageSequenceFrameRateVariation(@NFloat double value);

    @Generated
    @Selector("setImageSequenceInitialFrame:")
    public native void setImageSequenceInitialFrame(@NFloat double value);

    @Generated
    @Selector("setImageSequenceInitialFrameVariation:")
    public native void setImageSequenceInitialFrameVariation(@NFloat double value);

    @Generated
    @Selector("setImageSequenceRowCount:")
    public native void setImageSequenceRowCount(@NUInt long value);

    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    @Generated
    @Selector("setOrientationMode:")
    public native void setOrientationMode(@NInt long value);

    @Generated
    @Selector("setParticleAngle:")
    public native void setParticleAngle(@NFloat double value);

    @Generated
    @Selector("setParticleAngleVariation:")
    public native void setParticleAngleVariation(@NFloat double value);

    @Generated
    @Selector("setParticleAngularVelocity:")
    public native void setParticleAngularVelocity(@NFloat double value);

    @Generated
    @Selector("setParticleAngularVelocityVariation:")
    public native void setParticleAngularVelocityVariation(@NFloat double value);

    @Generated
    @Selector("setParticleBounce:")
    public native void setParticleBounce(@NFloat double value);

    @Generated
    @Selector("setParticleBounceVariation:")
    public native void setParticleBounceVariation(@NFloat double value);

    @Generated
    @Selector("setParticleCharge:")
    public native void setParticleCharge(@NFloat double value);

    @Generated
    @Selector("setParticleChargeVariation:")
    public native void setParticleChargeVariation(@NFloat double value);

    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    @Generated
    @Selector("setParticleColorVariation:")
    public native void setParticleColorVariation(@ByValue SCNVector4 value);

    @Generated
    @Selector("setParticleDiesOnCollision:")
    public native void setParticleDiesOnCollision(boolean value);

    @Generated
    @Selector("setParticleFriction:")
    public native void setParticleFriction(@NFloat double value);

    @Generated
    @Selector("setParticleFrictionVariation:")
    public native void setParticleFrictionVariation(@NFloat double value);

    @Generated
    @Selector("setParticleImage:")
    public native void setParticleImage(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setParticleLifeSpan:")
    public native void setParticleLifeSpan(@NFloat double value);

    @Generated
    @Selector("setParticleLifeSpanVariation:")
    public native void setParticleLifeSpanVariation(@NFloat double value);

    @Generated
    @Selector("setParticleMass:")
    public native void setParticleMass(@NFloat double value);

    @Generated
    @Selector("setParticleMassVariation:")
    public native void setParticleMassVariation(@NFloat double value);

    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@NFloat double value);

    @Generated
    @Selector("setParticleSizeVariation:")
    public native void setParticleSizeVariation(@NFloat double value);

    @Generated
    @Selector("setParticleVelocity:")
    public native void setParticleVelocity(@NFloat double value);

    @Generated
    @Selector("setParticleVelocityVariation:")
    public native void setParticleVelocityVariation(@NFloat double value);

    @Generated
    @Selector("setPropertyControllers:")
    public native void setPropertyControllers(NSDictionary<String, ? extends SCNParticlePropertyController> value);

    @Generated
    @Selector("setSortingMode:")
    public native void setSortingMode(@NInt long value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setSpeedFactor:")
    public native void setSpeedFactor(@NFloat double value);

    @Generated
    @Selector("setSpreadingAngle:")
    public native void setSpreadingAngle(@NFloat double value);

    @Generated
    @Selector("setStretchFactor:")
    public native void setStretchFactor(@NFloat double value);

    @Generated
    @Selector("setSystemSpawnedOnCollision:")
    public native void setSystemSpawnedOnCollision(SCNParticleSystem value);

    @Generated
    @Selector("setSystemSpawnedOnDying:")
    public native void setSystemSpawnedOnDying(SCNParticleSystem value);

    @Generated
    @Selector("setSystemSpawnedOnLiving:")
    public native void setSystemSpawnedOnLiving(SCNParticleSystem value);

    @Generated
    @Selector("setWarmupDuration:")
    public native void setWarmupDuration(@NFloat double value);

    @Generated
    @Selector("sortingMode")
    @NInt
    public native long sortingMode();

    @Generated
    @Selector("speedFactor")
    @NFloat
    public native double speedFactor();

    @Generated
    @Selector("spreadingAngle")
    @NFloat
    public native double spreadingAngle();

    @Generated
    @Selector("stretchFactor")
    @NFloat
    public native double stretchFactor();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("systemSpawnedOnCollision")
    public native SCNParticleSystem systemSpawnedOnCollision();

    @Generated
    @Selector("systemSpawnedOnDying")
    public native SCNParticleSystem systemSpawnedOnDying();

    @Generated
    @Selector("systemSpawnedOnLiving")
    public native SCNParticleSystem systemSpawnedOnLiving();

    @Generated
    @Selector("warmupDuration")
    @NFloat
    public native double warmupDuration();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_addModifierForPropertiesAtStageWithBlock {
        @Generated
        void call_addModifierForPropertiesAtStageWithBlock(
                @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg0, NUIntPtr arg1, @NInt long arg2,
                @NInt long arg3, float arg4);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleEventForPropertiesWithBlock {
        @Generated
        void call_handleEventForPropertiesWithBlock(@ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg0,
                NUIntPtr arg1, IntPtr arg2, @NInt long arg3);
    }

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("orientationDirection")
    @ByValue
    public native SCNVector3 orientationDirection();

    @Generated
    @Selector("particleIntensity")
    @NFloat
    public native double particleIntensity();

    @Generated
    @Selector("particleIntensityVariation")
    @NFloat
    public native double particleIntensityVariation();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("setOrientationDirection:")
    public native void setOrientationDirection(@ByValue SCNVector3 value);

    @Generated
    @Selector("setParticleIntensity:")
    public native void setParticleIntensity(@NFloat double value);

    @Generated
    @Selector("setParticleIntensityVariation:")
    public native void setParticleIntensityVariation(@NFloat double value);
}

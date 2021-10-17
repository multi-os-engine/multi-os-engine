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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.GKPolygonObstacle;
import apple.uikit.UIColor;
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

/**
 * An emitter of particle sprites.
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKEmitterNode extends SKNode {
    static {
        NatJ.register();
    }

    @Generated
    protected SKEmitterNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKEmitterNode alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native SKEmitterNode allocWithZone(VoidPtr zone);

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(String identifier);

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
    public static native SKEmitterNode new_objc();

    @Generated
    @Selector("node")
    public static native SKEmitterNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKEmitterNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("obstaclesFromNodeBounds:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodeBounds(NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromNodePhysicsBodies:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromNodePhysicsBodies(
            NSArray<? extends SKNode> nodes);

    @Generated
    @Selector("obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<? extends GKPolygonObstacle> obstaclesFromSpriteTexturesAccuracy(
            NSArray<? extends SKNode> sprites, float accuracy);

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
     * The particle simulation is stepped automatically each frame when present in the scene. This allows the user to manually advance the simulation by a fixed amount of time. Useful for pre-populating particles before adding them to the scene.
     */
    @Generated
    @Selector("advanceSimulationTime:")
    public native void advanceSimulationTime(double sec);

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     */
    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    /**
     * The angle at which to emit each new particle, in radians. Defaults to 0.0.
     */
    @Generated
    @Selector("emissionAngle")
    @NFloat
    public native double emissionAngle();

    /**
     * The random variance about the angle at which to emit each new particle, in radians. Defaults to 0.0.
     */
    @Generated
    @Selector("emissionAngleRange")
    @NFloat
    public native double emissionAngleRange();

    /**
     * Defines what logical 'categories' of fields this particles emitted respond to. Defaults to all bits set (all categories).
     * Can be forced off via affectedByGravity.
     */
    @Generated
    @Selector("fieldBitMask")
    public native int fieldBitMask();

    @Generated
    @Selector("init")
    public native SKEmitterNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKEmitterNode initWithCoder(NSCoder aDecoder);

    /**
     * The number of particles that will be emitted. If set to 0, there is no limit. Defaults to 0.
     */
    @Generated
    @Selector("numParticlesToEmit")
    @NUInt
    public native long numParticlesToEmit();

    /**
     * Specifies an action executed by new particles.
     */
    @Generated
    @Selector("particleAction")
    public native SKAction particleAction();

    /**
     * The starting alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("particleAlpha")
    @NFloat
    public native double particleAlpha();

    /**
     * The random variance about the starting alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("particleAlphaRange")
    @NFloat
    public native double particleAlphaRange();

    @Generated
    @Selector("particleAlphaSequence")
    public native SKKeyframeSequence particleAlphaSequence();

    /**
     * The rate at which to modify the alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("particleAlphaSpeed")
    @NFloat
    public native double particleAlphaSpeed();

    /**
     * The rate at which new particles are generated, in particles per second. Defaults to 0.0.
     */
    @Generated
    @Selector("particleBirthRate")
    @NFloat
    public native double particleBirthRate();

    /**
     * The blend mode for each particle. Defaults to SKBlendModeAlpha.
     */
    @Generated
    @Selector("particleBlendMode")
    @NInt
    public native long particleBlendMode();

    /**
     * The starting color for each particle. Defaults to clear.
     */
    @Generated
    @Selector("particleColor")
    public native UIColor particleColor();

    @Generated
    @Selector("particleColorAlphaRange")
    @NFloat
    public native double particleColorAlphaRange();

    @Generated
    @Selector("particleColorAlphaSpeed")
    @NFloat
    public native double particleColorAlphaSpeed();

    /**
     * The starting color blend for each particle. Behaves the same as SKSpriteNode. Defaults to 0.0.
     */
    @Generated
    @Selector("particleColorBlendFactor")
    @NFloat
    public native double particleColorBlendFactor();

    /**
     * The random variance about the starting color blend for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleColorBlendFactorRange")
    @NFloat
    public native double particleColorBlendFactorRange();

    @Generated
    @Selector("particleColorBlendFactorSequence")
    public native SKKeyframeSequence particleColorBlendFactorSequence();

    /**
     * The rate at which to modify the color blend for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleColorBlendFactorSpeed")
    @NFloat
    public native double particleColorBlendFactorSpeed();

    @Generated
    @Selector("particleColorBlueRange")
    @NFloat
    public native double particleColorBlueRange();

    @Generated
    @Selector("particleColorBlueSpeed")
    @NFloat
    public native double particleColorBlueSpeed();

    @Generated
    @Selector("particleColorGreenRange")
    @NFloat
    public native double particleColorGreenRange();

    @Generated
    @Selector("particleColorGreenSpeed")
    @NFloat
    public native double particleColorGreenSpeed();

    /**
     * The random variance about each color component for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleColorRedRange")
    @NFloat
    public native double particleColorRedRange();

    /**
     * The rate at which to modify each color component for each particle (per second).
     */
    @Generated
    @Selector("particleColorRedSpeed")
    @NFloat
    public native double particleColorRedSpeed();

    @Generated
    @Selector("particleColorSequence")
    public native SKKeyframeSequence particleColorSequence();

    /**
     * The lifetime of each particle, in seconds. Defaults to 0.0.
     */
    @Generated
    @Selector("particleLifetime")
    @NFloat
    public native double particleLifetime();

    /**
     * The random variance about the lifetime of each particle, in seconds. Defaults to 0.0.
     */
    @Generated
    @Selector("particleLifetimeRange")
    @NFloat
    public native double particleLifetimeRange();

    /**
     * The starting position for each particle in the emitter's coordinate space. Defaults to (0.0, 0,0).
     */
    @Generated
    @Selector("particlePosition")
    @ByValue
    public native CGPoint particlePosition();

    /**
     * The random variance about the starting position for each particle in the emitter's coordinate space. Defaults to (0.0, 0,0).
     */
    @Generated
    @Selector("particlePositionRange")
    @ByValue
    public native CGVector particlePositionRange();

    /**
     * The order in which particles will be rendered. Defaults to SKParticleRenderOrderOldestLast.
     */
    @Generated
    @Selector("particleRenderOrder")
    @NUInt
    public native long particleRenderOrder();

    /**
     * The starting z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleRotation")
    @NFloat
    public native double particleRotation();

    /**
     * The random variance about the starting z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleRotationRange")
    @NFloat
    public native double particleRotationRange();

    /**
     * The rate at which to modify the z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleRotationSpeed")
    @NFloat
    public native double particleRotationSpeed();

    /**
     * The starting scale for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("particleScale")
    @NFloat
    public native double particleScale();

    /**
     * The random variance about the starting scale for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleScaleRange")
    @NFloat
    public native double particleScaleRange();

    @Generated
    @Selector("particleScaleSequence")
    public native SKKeyframeSequence particleScaleSequence();

    /**
     * The rate at which to modify the scale for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleScaleSpeed")
    @NFloat
    public native double particleScaleSpeed();

    /**
     * The starting size for each particle. If set to CGSizeZero (the default) the particles will start at the size of the texture assigned to particleTexture. Note that particleScale and particleScaleRange will also have an effect on the effective size of each new particle.
     */
    @Generated
    @Selector("particleSize")
    @ByValue
    public native CGSize particleSize();

    /**
     * The starting speed for each particle along its emission vector. Defaults to 0.0.
     */
    @Generated
    @Selector("particleSpeed")
    @NFloat
    public native double particleSpeed();

    /**
     * The random variance about the starting speed for each particle along its emission vector. Defaults to 0.0.
     */
    @Generated
    @Selector("particleSpeedRange")
    @NFloat
    public native double particleSpeedRange();

    /**
     * The texture to be used for the particles.
     */
    @Generated
    @Selector("particleTexture")
    public native SKTexture particleTexture();

    /**
     * The starting z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("particleZPosition")
    @NFloat
    public native double particleZPosition();

    /**
     * The random variance about the starting z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Deprecated
    @Selector("particleZPositionRange")
    @NFloat
    public native double particleZPositionRange();

    /**
     * The rate at which to modify the z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Deprecated
    @Selector("particleZPositionSpeed")
    @NFloat
    public native double particleZPositionSpeed();

    /**
     * Removes all particles and restarts the emitter
     */
    @Generated
    @Selector("resetSimulation")
    public native void resetSimulation();

    /**
     * Optional dictionary of SKAttributeValues
     * Attributes can be used with custom SKShaders.
     */
    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    /**
     * The angle at which to emit each new particle, in radians. Defaults to 0.0.
     */
    @Generated
    @Selector("setEmissionAngle:")
    public native void setEmissionAngle(@NFloat double value);

    /**
     * The random variance about the angle at which to emit each new particle, in radians. Defaults to 0.0.
     */
    @Generated
    @Selector("setEmissionAngleRange:")
    public native void setEmissionAngleRange(@NFloat double value);

    /**
     * Defines what logical 'categories' of fields this particles emitted respond to. Defaults to all bits set (all categories).
     * Can be forced off via affectedByGravity.
     */
    @Generated
    @Selector("setFieldBitMask:")
    public native void setFieldBitMask(int value);

    /**
     * The number of particles that will be emitted. If set to 0, there is no limit. Defaults to 0.
     */
    @Generated
    @Selector("setNumParticlesToEmit:")
    public native void setNumParticlesToEmit(@NUInt long value);

    /**
     * Specifies an action executed by new particles.
     */
    @Generated
    @Selector("setParticleAction:")
    public native void setParticleAction(SKAction value);

    /**
     * The starting alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("setParticleAlpha:")
    public native void setParticleAlpha(@NFloat double value);

    /**
     * The random variance about the starting alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("setParticleAlphaRange:")
    public native void setParticleAlphaRange(@NFloat double value);

    @Generated
    @Selector("setParticleAlphaSequence:")
    public native void setParticleAlphaSequence(SKKeyframeSequence value);

    /**
     * The rate at which to modify the alpha for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("setParticleAlphaSpeed:")
    public native void setParticleAlphaSpeed(@NFloat double value);

    /**
     * The rate at which new particles are generated, in particles per second. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleBirthRate:")
    public native void setParticleBirthRate(@NFloat double value);

    /**
     * The blend mode for each particle. Defaults to SKBlendModeAlpha.
     */
    @Generated
    @Selector("setParticleBlendMode:")
    public native void setParticleBlendMode(@NInt long value);

    /**
     * The starting color for each particle. Defaults to clear.
     */
    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    @Generated
    @Selector("setParticleColorAlphaRange:")
    public native void setParticleColorAlphaRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorAlphaSpeed:")
    public native void setParticleColorAlphaSpeed(@NFloat double value);

    /**
     * The starting color blend for each particle. Behaves the same as SKSpriteNode. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleColorBlendFactor:")
    public native void setParticleColorBlendFactor(@NFloat double value);

    /**
     * The random variance about the starting color blend for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleColorBlendFactorRange:")
    public native void setParticleColorBlendFactorRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlendFactorSequence:")
    public native void setParticleColorBlendFactorSequence(SKKeyframeSequence value);

    /**
     * The rate at which to modify the color blend for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleColorBlendFactorSpeed:")
    public native void setParticleColorBlendFactorSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlueRange:")
    public native void setParticleColorBlueRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlueSpeed:")
    public native void setParticleColorBlueSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleColorGreenRange:")
    public native void setParticleColorGreenRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorGreenSpeed:")
    public native void setParticleColorGreenSpeed(@NFloat double value);

    /**
     * The random variance about each color component for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleColorRedRange:")
    public native void setParticleColorRedRange(@NFloat double value);

    /**
     * The rate at which to modify each color component for each particle (per second).
     */
    @Generated
    @Selector("setParticleColorRedSpeed:")
    public native void setParticleColorRedSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleColorSequence:")
    public native void setParticleColorSequence(SKKeyframeSequence value);

    /**
     * The lifetime of each particle, in seconds. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleLifetime:")
    public native void setParticleLifetime(@NFloat double value);

    /**
     * The random variance about the lifetime of each particle, in seconds. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleLifetimeRange:")
    public native void setParticleLifetimeRange(@NFloat double value);

    /**
     * The starting position for each particle in the emitter's coordinate space. Defaults to (0.0, 0,0).
     */
    @Generated
    @Selector("setParticlePosition:")
    public native void setParticlePosition(@ByValue CGPoint value);

    /**
     * The random variance about the starting position for each particle in the emitter's coordinate space. Defaults to (0.0, 0,0).
     */
    @Generated
    @Selector("setParticlePositionRange:")
    public native void setParticlePositionRange(@ByValue CGVector value);

    /**
     * The order in which particles will be rendered. Defaults to SKParticleRenderOrderOldestLast.
     */
    @Generated
    @Selector("setParticleRenderOrder:")
    public native void setParticleRenderOrder(@NUInt long value);

    /**
     * The starting z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleRotation:")
    public native void setParticleRotation(@NFloat double value);

    /**
     * The random variance about the starting z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleRotationRange:")
    public native void setParticleRotationRange(@NFloat double value);

    /**
     * The rate at which to modify the z-rotation for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleRotationSpeed:")
    public native void setParticleRotationSpeed(@NFloat double value);

    /**
     * The starting scale for each particle. Defaults to 1.0.
     */
    @Generated
    @Selector("setParticleScale:")
    public native void setParticleScale(@NFloat double value);

    /**
     * The random variance about the starting scale for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleScaleRange:")
    public native void setParticleScaleRange(@NFloat double value);

    @Generated
    @Selector("setParticleScaleSequence:")
    public native void setParticleScaleSequence(SKKeyframeSequence value);

    /**
     * The rate at which to modify the scale for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleScaleSpeed:")
    public native void setParticleScaleSpeed(@NFloat double value);

    /**
     * The starting size for each particle. If set to CGSizeZero (the default) the particles will start at the size of the texture assigned to particleTexture. Note that particleScale and particleScaleRange will also have an effect on the effective size of each new particle.
     */
    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@ByValue CGSize value);

    /**
     * The starting speed for each particle along its emission vector. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleSpeed:")
    public native void setParticleSpeed(@NFloat double value);

    /**
     * The random variance about the starting speed for each particle along its emission vector. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleSpeedRange:")
    public native void setParticleSpeedRange(@NFloat double value);

    /**
     * The texture to be used for the particles.
     */
    @Generated
    @Selector("setParticleTexture:")
    public native void setParticleTexture(SKTexture value);

    /**
     * The starting z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Selector("setParticleZPosition:")
    public native void setParticleZPosition(@NFloat double value);

    /**
     * The random variance about the starting z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Deprecated
    @Selector("setParticleZPositionRange:")
    public native void setParticleZPositionRange(@NFloat double value);

    /**
     * The rate at which to modify the z-position for each particle. Defaults to 0.0.
     */
    @Generated
    @Deprecated
    @Selector("setParticleZPositionSpeed:")
    public native void setParticleZPositionSpeed(@NFloat double value);

    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    /**
     * Normally the particles are rendered as if they were a child of the SKEmitterNode, they can also be rendered as if they were a child of any other node in the scene by setting the targetNode property. Defaults to nil (standard behavior).
     */
    @Generated
    @Selector("setTargetNode:")
    public native void setTargetNode_unsafe(SKNode value);

    /**
     * Normally the particles are rendered as if they were a child of the SKEmitterNode, they can also be rendered as if they were a child of any other node in the scene by setting the targetNode property. Defaults to nil (standard behavior).
     */
    @Generated
    public void setTargetNode(SKNode value) {
        Object __old = targetNode();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTargetNode_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setValue:forAttributeNamed:")
    public native void setValueForAttributeNamed(SKAttributeValue value, String key);

    /**
     * The acceleration to apply to each particles velocity. Useful for simulating effects such as wind or gravity. Defaults to 0.0.
     */
    @Generated
    @Selector("setXAcceleration:")
    public native void setXAcceleration(@NFloat double value);

    @Generated
    @Selector("setYAcceleration:")
    public native void setYAcceleration(@NFloat double value);

    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * Normally the particles are rendered as if they were a child of the SKEmitterNode, they can also be rendered as if they were a child of any other node in the scene by setting the targetNode property. Defaults to nil (standard behavior).
     */
    @Generated
    @Selector("targetNode")
    public native SKNode targetNode();

    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);

    /**
     * The acceleration to apply to each particles velocity. Useful for simulating effects such as wind or gravity. Defaults to 0.0.
     */
    @Generated
    @Selector("xAcceleration")
    @NFloat
    public native double xAcceleration();

    @Generated
    @Selector("yAcceleration")
    @NFloat
    public native double yAcceleration();

    @Generated
    @Selector("nodeWithFileNamed:securelyWithClasses:andError:")
    public static native SKEmitterNode nodeWithFileNamedSecurelyWithClassesAndError(String filename,
            NSSet<? extends Class> classes, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

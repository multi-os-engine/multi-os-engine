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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

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
    @Selector("initialize")
    public static native void initialize();

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
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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

    @Generated
    @Selector("advanceSimulationTime:")
    public native void advanceSimulationTime(double sec);

    @Generated
    @Selector("attributeValues")
    public native NSDictionary<String, ? extends SKAttributeValue> attributeValues();

    @Generated
    @Selector("emissionAngle")
    @NFloat
    public native double emissionAngle();

    @Generated
    @Selector("emissionAngleRange")
    @NFloat
    public native double emissionAngleRange();

    @Generated
    @Selector("fieldBitMask")
    public native int fieldBitMask();

    @Generated
    @Selector("init")
    public native SKEmitterNode init();

    @Generated
    @Selector("initWithCoder:")
    public native SKEmitterNode initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("numParticlesToEmit")
    @NUInt
    public native long numParticlesToEmit();

    @Generated
    @Selector("particleAction")
    public native SKAction particleAction();

    @Generated
    @Selector("particleAlpha")
    @NFloat
    public native double particleAlpha();

    @Generated
    @Selector("particleAlphaRange")
    @NFloat
    public native double particleAlphaRange();

    @Generated
    @Selector("particleAlphaSequence")
    public native SKKeyframeSequence particleAlphaSequence();

    @Generated
    @Selector("particleAlphaSpeed")
    @NFloat
    public native double particleAlphaSpeed();

    @Generated
    @Selector("particleBirthRate")
    @NFloat
    public native double particleBirthRate();

    @Generated
    @Selector("particleBlendMode")
    @NInt
    public native long particleBlendMode();

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

    @Generated
    @Selector("particleColorBlendFactor")
    @NFloat
    public native double particleColorBlendFactor();

    @Generated
    @Selector("particleColorBlendFactorRange")
    @NFloat
    public native double particleColorBlendFactorRange();

    @Generated
    @Selector("particleColorBlendFactorSequence")
    public native SKKeyframeSequence particleColorBlendFactorSequence();

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

    @Generated
    @Selector("particleColorRedRange")
    @NFloat
    public native double particleColorRedRange();

    @Generated
    @Selector("particleColorRedSpeed")
    @NFloat
    public native double particleColorRedSpeed();

    @Generated
    @Selector("particleColorSequence")
    public native SKKeyframeSequence particleColorSequence();

    @Generated
    @Selector("particleLifetime")
    @NFloat
    public native double particleLifetime();

    @Generated
    @Selector("particleLifetimeRange")
    @NFloat
    public native double particleLifetimeRange();

    @Generated
    @Selector("particlePosition")
    @ByValue
    public native CGPoint particlePosition();

    @Generated
    @Selector("particlePositionRange")
    @ByValue
    public native CGVector particlePositionRange();

    @Generated
    @Selector("particleRenderOrder")
    @NUInt
    public native long particleRenderOrder();

    @Generated
    @Selector("particleRotation")
    @NFloat
    public native double particleRotation();

    @Generated
    @Selector("particleRotationRange")
    @NFloat
    public native double particleRotationRange();

    @Generated
    @Selector("particleRotationSpeed")
    @NFloat
    public native double particleRotationSpeed();

    @Generated
    @Selector("particleScale")
    @NFloat
    public native double particleScale();

    @Generated
    @Selector("particleScaleRange")
    @NFloat
    public native double particleScaleRange();

    @Generated
    @Selector("particleScaleSequence")
    public native SKKeyframeSequence particleScaleSequence();

    @Generated
    @Selector("particleScaleSpeed")
    @NFloat
    public native double particleScaleSpeed();

    @Generated
    @Selector("particleSize")
    @ByValue
    public native CGSize particleSize();

    @Generated
    @Selector("particleSpeed")
    @NFloat
    public native double particleSpeed();

    @Generated
    @Selector("particleSpeedRange")
    @NFloat
    public native double particleSpeedRange();

    @Generated
    @Selector("particleTexture")
    public native SKTexture particleTexture();

    @Generated
    @Selector("particleZPosition")
    @NFloat
    public native double particleZPosition();

    @Generated
    @Deprecated
    @Selector("particleZPositionRange")
    @NFloat
    public native double particleZPositionRange();

    @Generated
    @Deprecated
    @Selector("particleZPositionSpeed")
    @NFloat
    public native double particleZPositionSpeed();

    @Generated
    @Selector("resetSimulation")
    public native void resetSimulation();

    @Generated
    @Selector("setAttributeValues:")
    public native void setAttributeValues(NSDictionary<String, ? extends SKAttributeValue> value);

    @Generated
    @Selector("setEmissionAngle:")
    public native void setEmissionAngle(@NFloat double value);

    @Generated
    @Selector("setEmissionAngleRange:")
    public native void setEmissionAngleRange(@NFloat double value);

    @Generated
    @Selector("setFieldBitMask:")
    public native void setFieldBitMask(int value);

    @Generated
    @Selector("setNumParticlesToEmit:")
    public native void setNumParticlesToEmit(@NUInt long value);

    @Generated
    @Selector("setParticleAction:")
    public native void setParticleAction(SKAction value);

    @Generated
    @Selector("setParticleAlpha:")
    public native void setParticleAlpha(@NFloat double value);

    @Generated
    @Selector("setParticleAlphaRange:")
    public native void setParticleAlphaRange(@NFloat double value);

    @Generated
    @Selector("setParticleAlphaSequence:")
    public native void setParticleAlphaSequence(SKKeyframeSequence value);

    @Generated
    @Selector("setParticleAlphaSpeed:")
    public native void setParticleAlphaSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleBirthRate:")
    public native void setParticleBirthRate(@NFloat double value);

    @Generated
    @Selector("setParticleBlendMode:")
    public native void setParticleBlendMode(@NInt long value);

    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    @Generated
    @Selector("setParticleColorAlphaRange:")
    public native void setParticleColorAlphaRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorAlphaSpeed:")
    public native void setParticleColorAlphaSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlendFactor:")
    public native void setParticleColorBlendFactor(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlendFactorRange:")
    public native void setParticleColorBlendFactorRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorBlendFactorSequence:")
    public native void setParticleColorBlendFactorSequence(SKKeyframeSequence value);

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

    @Generated
    @Selector("setParticleColorRedRange:")
    public native void setParticleColorRedRange(@NFloat double value);

    @Generated
    @Selector("setParticleColorRedSpeed:")
    public native void setParticleColorRedSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleColorSequence:")
    public native void setParticleColorSequence(SKKeyframeSequence value);

    @Generated
    @Selector("setParticleLifetime:")
    public native void setParticleLifetime(@NFloat double value);

    @Generated
    @Selector("setParticleLifetimeRange:")
    public native void setParticleLifetimeRange(@NFloat double value);

    @Generated
    @Selector("setParticlePosition:")
    public native void setParticlePosition(@ByValue CGPoint value);

    @Generated
    @Selector("setParticlePositionRange:")
    public native void setParticlePositionRange(@ByValue CGVector value);

    @Generated
    @Selector("setParticleRenderOrder:")
    public native void setParticleRenderOrder(@NUInt long value);

    @Generated
    @Selector("setParticleRotation:")
    public native void setParticleRotation(@NFloat double value);

    @Generated
    @Selector("setParticleRotationRange:")
    public native void setParticleRotationRange(@NFloat double value);

    @Generated
    @Selector("setParticleRotationSpeed:")
    public native void setParticleRotationSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleScale:")
    public native void setParticleScale(@NFloat double value);

    @Generated
    @Selector("setParticleScaleRange:")
    public native void setParticleScaleRange(@NFloat double value);

    @Generated
    @Selector("setParticleScaleSequence:")
    public native void setParticleScaleSequence(SKKeyframeSequence value);

    @Generated
    @Selector("setParticleScaleSpeed:")
    public native void setParticleScaleSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@ByValue CGSize value);

    @Generated
    @Selector("setParticleSpeed:")
    public native void setParticleSpeed(@NFloat double value);

    @Generated
    @Selector("setParticleSpeedRange:")
    public native void setParticleSpeedRange(@NFloat double value);

    @Generated
    @Selector("setParticleTexture:")
    public native void setParticleTexture(SKTexture value);

    @Generated
    @Selector("setParticleZPosition:")
    public native void setParticleZPosition(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("setParticleZPositionRange:")
    public native void setParticleZPositionRange(@NFloat double value);

    @Generated
    @Deprecated
    @Selector("setParticleZPositionSpeed:")
    public native void setParticleZPositionSpeed(@NFloat double value);

    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    @Generated
    @Selector("setTargetNode:")
    public native void setTargetNode_unsafe(SKNode value);

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

    @Generated
    @Selector("setXAcceleration:")
    public native void setXAcceleration(@NFloat double value);

    @Generated
    @Selector("setYAcceleration:")
    public native void setYAcceleration(@NFloat double value);

    @Generated
    @Selector("shader")
    public native SKShader shader();

    @Generated
    @Selector("targetNode")
    public native SKNode targetNode();

    @Generated
    @Selector("valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);

    @Generated
    @Selector("xAcceleration")
    @NFloat
    public native double xAcceleration();

    @Generated
    @Selector("yAcceleration")
    @NFloat
    public native double yAcceleration();
}

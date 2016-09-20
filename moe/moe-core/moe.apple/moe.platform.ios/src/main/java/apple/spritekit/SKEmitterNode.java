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
    @Owned
    @Selector("alloc")
    public static native SKEmitterNode alloc();

    @Generated
    @Selector("node")
    public static native SKEmitterNode node();

    @Generated
    @Selector("nodeWithFileNamed:")
    public static native SKEmitterNode nodeWithFileNamed(String filename);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * advanceSimulationTime:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instm/SKEmitterNode/advanceSimulationTime:">iOS Dev Center</a>
     */
    @Generated
    @Selector("advanceSimulationTime:")
    public native void advanceSimulationTime(double sec);

    /**
     * emissionAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/emissionAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionAngle")
    @NFloat
    public native double emissionAngle();

    /**
     * emissionAngleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/emissionAngleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionAngleRange")
    @NFloat
    public native double emissionAngleRange();

    /**
     * fieldBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/fieldBitMask">iOS Dev Center</a>
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
     * numParticlesToEmit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/numParticlesToEmit">iOS Dev Center</a>
     */
    @Generated
    @Selector("numParticlesToEmit")
    @NUInt
    public native long numParticlesToEmit();

    /**
     * particleAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAction")
    public native SKAction particleAction();

    /**
     * particleAlpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlpha">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAlpha")
    @NFloat
    public native double particleAlpha();

    /**
     * particleAlphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAlphaRange")
    @NFloat
    public native double particleAlphaRange();

    /**
     * particleAlphaSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAlphaSequence")
    public native SKKeyframeSequence particleAlphaSequence();

    /**
     * particleAlphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAlphaSpeed")
    @NFloat
    public native double particleAlphaSpeed();

    /**
     * particleBirthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleBirthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleBirthRate")
    @NFloat
    public native double particleBirthRate();

    /**
     * particleBlendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleBlendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleBlendMode")
    @NInt
    public native long particleBlendMode();

    /**
     * particleColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColor")
    public native UIColor particleColor();

    /**
     * particleColorAlphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorAlphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorAlphaRange")
    @NFloat
    public native double particleColorAlphaRange();

    /**
     * particleColorAlphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorAlphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorAlphaSpeed")
    @NFloat
    public native double particleColorAlphaSpeed();

    /**
     * particleColorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlendFactor")
    @NFloat
    public native double particleColorBlendFactor();

    /**
     * particleColorBlendFactorRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlendFactorRange")
    @NFloat
    public native double particleColorBlendFactorRange();

    /**
     * particleColorBlendFactorSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlendFactorSequence")
    public native SKKeyframeSequence particleColorBlendFactorSequence();

    /**
     * particleColorBlendFactorSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlendFactorSpeed")
    @NFloat
    public native double particleColorBlendFactorSpeed();

    /**
     * particleColorBlueRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlueRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlueRange")
    @NFloat
    public native double particleColorBlueRange();

    /**
     * particleColorBlueSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlueSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorBlueSpeed")
    @NFloat
    public native double particleColorBlueSpeed();

    /**
     * particleColorGreenRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorGreenRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorGreenRange")
    @NFloat
    public native double particleColorGreenRange();

    /**
     * particleColorGreenSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorGreenSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorGreenSpeed")
    @NFloat
    public native double particleColorGreenSpeed();

    /**
     * particleColorRedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorRedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorRedRange")
    @NFloat
    public native double particleColorRedRange();

    /**
     * particleColorRedSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorRedSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorRedSpeed")
    @NFloat
    public native double particleColorRedSpeed();

    /**
     * particleColorSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorSequence")
    public native SKKeyframeSequence particleColorSequence();

    /**
     * particleLifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleLifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleLifetime")
    @NFloat
    public native double particleLifetime();

    /**
     * particleLifetimeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleLifetimeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleLifetimeRange")
    @NFloat
    public native double particleLifetimeRange();

    /**
     * particlePosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particlePosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("particlePosition")
    @ByValue
    public native CGPoint particlePosition();

    /**
     * particlePositionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particlePositionRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particlePositionRange")
    @ByValue
    public native CGVector particlePositionRange();

    /**
     * particleRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleRotation")
    @NFloat
    public native double particleRotation();

    /**
     * particleRotationRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotationRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleRotationRange")
    @NFloat
    public native double particleRotationRange();

    /**
     * particleRotationSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotationSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleRotationSpeed")
    @NFloat
    public native double particleRotationSpeed();

    /**
     * particleScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleScale")
    @NFloat
    public native double particleScale();

    /**
     * particleScaleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleScaleRange")
    @NFloat
    public native double particleScaleRange();

    /**
     * particleScaleSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleScaleSequence")
    public native SKKeyframeSequence particleScaleSequence();

    /**
     * particleScaleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleScaleSpeed")
    @NFloat
    public native double particleScaleSpeed();

    /**
     * particleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSize")
    @ByValue
    public native CGSize particleSize();

    /**
     * particleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSpeed")
    @NFloat
    public native double particleSpeed();

    /**
     * particleSpeedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSpeedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSpeedRange")
    @NFloat
    public native double particleSpeedRange();

    /**
     * particleTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleTexture")
    public native SKTexture particleTexture();

    /**
     * particleZPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleZPosition")
    @NFloat
    public native double particleZPosition();

    /**
     * particleZPositionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPositionRange">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("particleZPositionRange")
    @NFloat
    public native double particleZPositionRange();

    /**
     * particleZPositionSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPositionSpeed">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("particleZPositionSpeed")
    @NFloat
    public native double particleZPositionSpeed();

    /**
     * resetSimulation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instm/SKEmitterNode/resetSimulation">iOS Dev Center</a>
     */
    @Generated
    @Selector("resetSimulation")
    public native void resetSimulation();

    /**
     * emissionAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/emissionAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionAngle:")
    public native void setEmissionAngle(@NFloat double value);

    /**
     * emissionAngleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/emissionAngleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionAngleRange:")
    public native void setEmissionAngleRange(@NFloat double value);

    /**
     * fieldBitMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/fieldBitMask">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFieldBitMask:")
    public native void setFieldBitMask(int value);

    /**
     * numParticlesToEmit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/numParticlesToEmit">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNumParticlesToEmit:")
    public native void setNumParticlesToEmit(@NUInt long value);

    /**
     * particleAction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAction:")
    public native void setParticleAction(SKAction value);

    /**
     * particleAlpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlpha">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAlpha:")
    public native void setParticleAlpha(@NFloat double value);

    /**
     * particleAlphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAlphaRange:")
    public native void setParticleAlphaRange(@NFloat double value);

    /**
     * particleAlphaSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAlphaSequence:")
    public native void setParticleAlphaSequence(SKKeyframeSequence value);

    /**
     * particleAlphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleAlphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAlphaSpeed:")
    public native void setParticleAlphaSpeed(@NFloat double value);

    /**
     * particleBirthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleBirthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleBirthRate:")
    public native void setParticleBirthRate(@NFloat double value);

    /**
     * particleBlendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleBlendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleBlendMode:")
    public native void setParticleBlendMode(@NInt long value);

    /**
     * particleColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    /**
     * particleColorAlphaRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorAlphaRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorAlphaRange:")
    public native void setParticleColorAlphaRange(@NFloat double value);

    /**
     * particleColorAlphaSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorAlphaSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorAlphaSpeed:")
    public native void setParticleColorAlphaSpeed(@NFloat double value);

    /**
     * particleColorBlendFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlendFactor:")
    public native void setParticleColorBlendFactor(@NFloat double value);

    /**
     * particleColorBlendFactorRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlendFactorRange:")
    public native void setParticleColorBlendFactorRange(@NFloat double value);

    /**
     * particleColorBlendFactorSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlendFactorSequence:")
    public native void setParticleColorBlendFactorSequence(SKKeyframeSequence value);

    /**
     * particleColorBlendFactorSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlendFactorSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlendFactorSpeed:")
    public native void setParticleColorBlendFactorSpeed(@NFloat double value);

    /**
     * particleColorBlueRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlueRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlueRange:")
    public native void setParticleColorBlueRange(@NFloat double value);

    /**
     * particleColorBlueSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorBlueSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorBlueSpeed:")
    public native void setParticleColorBlueSpeed(@NFloat double value);

    /**
     * particleColorGreenRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorGreenRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorGreenRange:")
    public native void setParticleColorGreenRange(@NFloat double value);

    /**
     * particleColorGreenSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorGreenSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorGreenSpeed:")
    public native void setParticleColorGreenSpeed(@NFloat double value);

    /**
     * particleColorRedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorRedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorRedRange:")
    public native void setParticleColorRedRange(@NFloat double value);

    /**
     * particleColorRedSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorRedSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorRedSpeed:")
    public native void setParticleColorRedSpeed(@NFloat double value);

    /**
     * particleColorSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleColorSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorSequence:")
    public native void setParticleColorSequence(SKKeyframeSequence value);

    /**
     * particleLifetime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleLifetime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleLifetime:")
    public native void setParticleLifetime(@NFloat double value);

    /**
     * particleLifetimeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleLifetimeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleLifetimeRange:")
    public native void setParticleLifetimeRange(@NFloat double value);

    /**
     * particlePosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particlePosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticlePosition:")
    public native void setParticlePosition(@ByValue CGPoint value);

    /**
     * particlePositionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particlePositionRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticlePositionRange:")
    public native void setParticlePositionRange(@ByValue CGVector value);

    /**
     * particleRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleRotation:")
    public native void setParticleRotation(@NFloat double value);

    /**
     * particleRotationRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotationRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleRotationRange:")
    public native void setParticleRotationRange(@NFloat double value);

    /**
     * particleRotationSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRotationSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleRotationSpeed:")
    public native void setParticleRotationSpeed(@NFloat double value);

    /**
     * particleScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScale">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleScale:")
    public native void setParticleScale(@NFloat double value);

    /**
     * particleScaleRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleScaleRange:")
    public native void setParticleScaleRange(@NFloat double value);

    /**
     * particleScaleSequence</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleSequence">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleScaleSequence:")
    public native void setParticleScaleSequence(SKKeyframeSequence value);

    /**
     * particleScaleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleScaleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleScaleSpeed:")
    public native void setParticleScaleSpeed(@NFloat double value);

    /**
     * particleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@ByValue CGSize value);

    /**
     * particleSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSpeed">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleSpeed:")
    public native void setParticleSpeed(@NFloat double value);

    /**
     * particleSpeedRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleSpeedRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleSpeedRange:")
    public native void setParticleSpeedRange(@NFloat double value);

    /**
     * particleTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleTexture:")
    public native void setParticleTexture(SKTexture value);

    /**
     * particleZPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPosition">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleZPosition:")
    public native void setParticleZPosition(@NFloat double value);

    /**
     * particleZPositionRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPositionRange">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setParticleZPositionRange:")
    public native void setParticleZPositionRange(@NFloat double value);

    /**
     * particleZPositionSpeed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleZPositionSpeed">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @Selector("setParticleZPositionSpeed:")
    public native void setParticleZPositionSpeed(@NFloat double value);

    /**
     * shader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/shader">iOS Dev Center</a>
     */
    @Generated
    @Selector("setShader:")
    public native void setShader(SKShader value);

    /**
     * targetNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/targetNode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTargetNode:")
    public native void setTargetNode_unsafe(SKNode value);

    /**
     * targetNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/targetNode">iOS Dev Center</a>
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

    /**
     * xAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/xAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setXAcceleration:")
    public native void setXAcceleration(@NFloat double value);

    /**
     * yAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/yAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setYAcceleration:")
    public native void setYAcceleration(@NFloat double value);

    /**
     * shader</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/shader">iOS Dev Center</a>
     */
    @Generated
    @Selector("shader")
    public native SKShader shader();

    /**
     * targetNode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/targetNode">iOS Dev Center</a>
     */
    @Generated
    @Selector("targetNode")
    public native SKNode targetNode();

    /**
     * xAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/xAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("xAcceleration")
    @NFloat
    public native double xAcceleration();

    /**
     * yAcceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/yAcceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("yAcceleration")
    @NFloat
    public native double yAcceleration();

    /**
     * particleRenderOrder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRenderOrder">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleRenderOrder")
    @NUInt
    public native long particleRenderOrder();

    /**
     * particleRenderOrder</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKEmitterNode_Ref/index.html#//apple_ref/occ/instp/SKEmitterNode/particleRenderOrder">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleRenderOrder:")
    public native void setParticleRenderOrder(@NUInt long value);
}

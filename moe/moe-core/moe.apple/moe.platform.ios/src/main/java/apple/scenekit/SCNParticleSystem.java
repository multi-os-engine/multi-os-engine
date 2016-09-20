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
    @Owned
    @Selector("alloc")
    public static native SCNParticleSystem alloc();

    /**
     * particleSystem</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/clm/SCNParticleSystem/particleSystem">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSystem")
    public static native SCNParticleSystem particleSystem();

    /**
     * particleSystemNamed:inDirectory:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/clm/SCNParticleSystem/particleSystemNamed:inDirectory:">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSystemNamed:inDirectory:")
    public static native SCNParticleSystem particleSystemNamedInDirectory(String name, String directory);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

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
     * acceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/acceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("acceleration")
    @ByValue
    public native SCNVector3 acceleration();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(CAAnimation animation, String key);

    /**
     * addModifierForProperties:atStage:withBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instm/SCNParticleSystem/addModifierForProperties:atStage:withBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addModifierForProperties:atStage:withBlock:")
    public native void addModifierForPropertiesAtStageWithBlock(NSArray<String> properties, @NInt long stage,
            @ObjCBlock(name = "call_addModifierForPropertiesAtStageWithBlock") Block_addModifierForPropertiesAtStageWithBlock block);

    /**
     * affectedByGravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/affectedByGravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("affectedByGravity")
    public native boolean affectedByGravity();

    /**
     * affectedByPhysicsFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/affectedByPhysicsFields">iOS Dev Center</a>
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
     * birthDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthDirection")
    @NInt
    public native long birthDirection();

    /**
     * birthLocation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthLocation">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthLocation")
    @NInt
    public native long birthLocation();

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthRate")
    @NFloat
    public native double birthRate();

    /**
     * birthRateVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthRateVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("birthRateVariation")
    @NFloat
    public native double birthRateVariation();

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    /**
     * colliderNodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/colliderNodes">iOS Dev Center</a>
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
     * dampingFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/dampingFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("dampingFactor")
    @NFloat
    public native double dampingFactor();

    /**
     * emissionDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emissionDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionDuration")
    @NFloat
    public native double emissionDuration();

    /**
     * emissionDurationVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emissionDurationVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("emissionDurationVariation")
    @NFloat
    public native double emissionDurationVariation();

    /**
     * emitterShape</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emitterShape">iOS Dev Center</a>
     */
    @Generated
    @Selector("emitterShape")
    public native SCNGeometry emitterShape();

    /**
     * emittingDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emittingDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("emittingDirection")
    @ByValue
    public native SCNVector3 emittingDirection();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    /**
     * fresnelExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/fresnelExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("fresnelExponent")
    @NFloat
    public native double fresnelExponent();

    /**
     * handleEvent:forProperties:withBlock:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instm/SCNParticleSystem/handleEvent:forProperties:withBlock:">iOS Dev Center</a>
     */
    @Generated
    @Selector("handleEvent:forProperties:withBlock:")
    public native void handleEventForPropertiesWithBlock(@NInt long event, NSArray<String> properties,
            @ObjCBlock(name = "call_handleEventForPropertiesWithBlock") Block_handleEventForPropertiesWithBlock block);

    /**
     * idleDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/idleDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("idleDuration")
    @NFloat
    public native double idleDuration();

    /**
     * idleDurationVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/idleDurationVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("idleDurationVariation")
    @NFloat
    public native double idleDurationVariation();

    /**
     * imageSequenceAnimationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceAnimationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceAnimationMode")
    @NInt
    public native long imageSequenceAnimationMode();

    /**
     * imageSequenceColumnCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceColumnCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceColumnCount")
    @NUInt
    public native long imageSequenceColumnCount();

    /**
     * imageSequenceFrameRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceFrameRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceFrameRate")
    @NFloat
    public native double imageSequenceFrameRate();

    /**
     * imageSequenceFrameRateVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceFrameRateVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceFrameRateVariation")
    @NFloat
    public native double imageSequenceFrameRateVariation();

    /**
     * imageSequenceInitialFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceInitialFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceInitialFrame")
    @NFloat
    public native double imageSequenceInitialFrame();

    /**
     * imageSequenceInitialFrameVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceInitialFrameVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("imageSequenceInitialFrameVariation")
    @NFloat
    public native double imageSequenceInitialFrameVariation();

    /**
     * imageSequenceRowCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceRowCount">iOS Dev Center</a>
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
    public native SCNParticleSystem initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * blackPassEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/blackPassEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isBlackPassEnabled")
    public native boolean isBlackPassEnabled();

    /**
     * blackPassEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/blackPassEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlackPassEnabled:")
    public native void setBlackPassEnabled(boolean value);

    /**
     * lightingEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/lightingEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLightingEnabled")
    public native boolean isLightingEnabled();

    /**
     * lightingEnabled</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/lightingEnabled">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLightingEnabled:")
    public native void setLightingEnabled(boolean value);

    /**
     * local</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/local">iOS Dev Center</a>
     */
    @Generated
    @Selector("isLocal")
    public native boolean isLocal();

    /**
     * local</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/local">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLocal:")
    public native void setLocal(boolean value);

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("loops")
    public native boolean loops();

    /**
     * orientationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/orientationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("orientationMode")
    @NInt
    public native long orientationMode();

    /**
     * particleAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAngle")
    @NFloat
    public native double particleAngle();

    /**
     * particleAngleVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngleVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAngleVariation")
    @NFloat
    public native double particleAngleVariation();

    /**
     * particleAngularVelocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngularVelocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAngularVelocity")
    @NFloat
    public native double particleAngularVelocity();

    /**
     * particleAngularVelocityVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngularVelocityVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleAngularVelocityVariation")
    @NFloat
    public native double particleAngularVelocityVariation();

    /**
     * particleBounce</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleBounce">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleBounce")
    @NFloat
    public native double particleBounce();

    /**
     * particleBounceVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleBounceVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleBounceVariation")
    @NFloat
    public native double particleBounceVariation();

    /**
     * particleCharge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleCharge">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleCharge")
    @NFloat
    public native double particleCharge();

    /**
     * particleChargeVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleChargeVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleChargeVariation")
    @NFloat
    public native double particleChargeVariation();

    /**
     * particleColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColor")
    public native UIColor particleColor();

    /**
     * particleColorVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleColorVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleColorVariation")
    @ByValue
    public native SCNVector4 particleColorVariation();

    /**
     * particleDiesOnCollision</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleDiesOnCollision">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleDiesOnCollision")
    public native boolean particleDiesOnCollision();

    /**
     * particleFriction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleFriction">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleFriction")
    @NFloat
    public native double particleFriction();

    /**
     * particleFrictionVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleFrictionVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleFrictionVariation")
    @NFloat
    public native double particleFrictionVariation();

    /**
     * particleImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleImage")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object particleImage();

    /**
     * particleLifeSpan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleLifeSpan">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleLifeSpan")
    @NFloat
    public native double particleLifeSpan();

    /**
     * particleLifeSpanVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleLifeSpanVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleLifeSpanVariation")
    @NFloat
    public native double particleLifeSpanVariation();

    /**
     * particleMass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleMass">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleMass")
    @NFloat
    public native double particleMass();

    /**
     * particleMassVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleMassVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleMassVariation")
    @NFloat
    public native double particleMassVariation();

    /**
     * particleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSize")
    @NFloat
    public native double particleSize();

    /**
     * particleSizeVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleSizeVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleSizeVariation")
    @NFloat
    public native double particleSizeVariation();

    /**
     * particleVelocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleVelocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleVelocity")
    @NFloat
    public native double particleVelocity();

    /**
     * particleVelocityVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleVelocityVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("particleVelocityVariation")
    @NFloat
    public native double particleVelocityVariation();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    /**
     * propertyControllers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/propertyControllers">iOS Dev Center</a>
     */
    @Generated
    @Selector("propertyControllers")
    public native NSDictionary<String, ? extends SCNParticlePropertyController> propertyControllers();

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    /**
     * removeAllModifiers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instm/SCNParticleSystem/removeAllModifiers">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeAllModifiers")
    public native void removeAllModifiers();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    /**
     * removeModifiersOfStage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instm/SCNParticleSystem/removeModifiersOfStage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("removeModifiersOfStage:")
    public native void removeModifiersOfStage(@NInt long stage);

    /**
     * reset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instm/SCNParticleSystem/reset">iOS Dev Center</a>
     */
    @Generated
    @Selector("reset")
    public native void reset();

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    /**
     * acceleration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/acceleration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAcceleration:")
    public native void setAcceleration(@ByValue SCNVector3 value);

    /**
     * affectedByGravity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/affectedByGravity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAffectedByGravity:")
    public native void setAffectedByGravity(boolean value);

    /**
     * affectedByPhysicsFields</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/affectedByPhysicsFields">iOS Dev Center</a>
     */
    @Generated
    @Selector("setAffectedByPhysicsFields:")
    public native void setAffectedByPhysicsFields(boolean value);

    /**
     * birthDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthDirection:")
    public native void setBirthDirection(@NInt long value);

    /**
     * birthLocation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthLocation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthLocation:")
    public native void setBirthLocation(@NInt long value);

    /**
     * birthRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthRate:")
    public native void setBirthRate(@NFloat double value);

    /**
     * birthRateVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/birthRateVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBirthRateVariation:")
    public native void setBirthRateVariation(@NFloat double value);

    /**
     * blendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/blendMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * colliderNodes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/colliderNodes">iOS Dev Center</a>
     */
    @Generated
    @Selector("setColliderNodes:")
    public native void setColliderNodes(NSArray<? extends SCNNode> value);

    /**
     * dampingFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/dampingFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setDampingFactor:")
    public native void setDampingFactor(@NFloat double value);

    /**
     * emissionDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emissionDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionDuration:")
    public native void setEmissionDuration(@NFloat double value);

    /**
     * emissionDurationVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emissionDurationVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmissionDurationVariation:")
    public native void setEmissionDurationVariation(@NFloat double value);

    /**
     * emitterShape</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emitterShape">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmitterShape:")
    public native void setEmitterShape(SCNGeometry value);

    /**
     * emittingDirection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/emittingDirection">iOS Dev Center</a>
     */
    @Generated
    @Selector("setEmittingDirection:")
    public native void setEmittingDirection(@ByValue SCNVector3 value);

    /**
     * fresnelExponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/fresnelExponent">iOS Dev Center</a>
     */
    @Generated
    @Selector("setFresnelExponent:")
    public native void setFresnelExponent(@NFloat double value);

    /**
     * idleDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/idleDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdleDuration:")
    public native void setIdleDuration(@NFloat double value);

    /**
     * idleDurationVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/idleDurationVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setIdleDurationVariation:")
    public native void setIdleDurationVariation(@NFloat double value);

    /**
     * imageSequenceAnimationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceAnimationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceAnimationMode:")
    public native void setImageSequenceAnimationMode(@NInt long value);

    /**
     * imageSequenceColumnCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceColumnCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceColumnCount:")
    public native void setImageSequenceColumnCount(@NUInt long value);

    /**
     * imageSequenceFrameRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceFrameRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceFrameRate:")
    public native void setImageSequenceFrameRate(@NFloat double value);

    /**
     * imageSequenceFrameRateVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceFrameRateVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceFrameRateVariation:")
    public native void setImageSequenceFrameRateVariation(@NFloat double value);

    /**
     * imageSequenceInitialFrame</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceInitialFrame">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceInitialFrame:")
    public native void setImageSequenceInitialFrame(@NFloat double value);

    /**
     * imageSequenceInitialFrameVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceInitialFrameVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceInitialFrameVariation:")
    public native void setImageSequenceInitialFrameVariation(@NFloat double value);

    /**
     * imageSequenceRowCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/imageSequenceRowCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("setImageSequenceRowCount:")
    public native void setImageSequenceRowCount(@NUInt long value);

    /**
     * loops</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/loops">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLoops:")
    public native void setLoops(boolean value);

    /**
     * orientationMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/orientationMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setOrientationMode:")
    public native void setOrientationMode(@NInt long value);

    /**
     * particleAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAngle:")
    public native void setParticleAngle(@NFloat double value);

    /**
     * particleAngleVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngleVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAngleVariation:")
    public native void setParticleAngleVariation(@NFloat double value);

    /**
     * particleAngularVelocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngularVelocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAngularVelocity:")
    public native void setParticleAngularVelocity(@NFloat double value);

    /**
     * particleAngularVelocityVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleAngularVelocityVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleAngularVelocityVariation:")
    public native void setParticleAngularVelocityVariation(@NFloat double value);

    /**
     * particleBounce</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleBounce">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleBounce:")
    public native void setParticleBounce(@NFloat double value);

    /**
     * particleBounceVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleBounceVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleBounceVariation:")
    public native void setParticleBounceVariation(@NFloat double value);

    /**
     * particleCharge</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleCharge">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleCharge:")
    public native void setParticleCharge(@NFloat double value);

    /**
     * particleChargeVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleChargeVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleChargeVariation:")
    public native void setParticleChargeVariation(@NFloat double value);

    /**
     * particleColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleColor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColor:")
    public native void setParticleColor(UIColor value);

    /**
     * particleColorVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleColorVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleColorVariation:")
    public native void setParticleColorVariation(@ByValue SCNVector4 value);

    /**
     * particleDiesOnCollision</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleDiesOnCollision">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleDiesOnCollision:")
    public native void setParticleDiesOnCollision(boolean value);

    /**
     * particleFriction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleFriction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleFriction:")
    public native void setParticleFriction(@NFloat double value);

    /**
     * particleFrictionVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleFrictionVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleFrictionVariation:")
    public native void setParticleFrictionVariation(@NFloat double value);

    /**
     * particleImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleImage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleImage:")
    public native void setParticleImage(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * particleLifeSpan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleLifeSpan">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleLifeSpan:")
    public native void setParticleLifeSpan(@NFloat double value);

    /**
     * particleLifeSpanVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleLifeSpanVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleLifeSpanVariation:")
    public native void setParticleLifeSpanVariation(@NFloat double value);

    /**
     * particleMass</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleMass">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleMass:")
    public native void setParticleMass(@NFloat double value);

    /**
     * particleMassVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleMassVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleMassVariation:")
    public native void setParticleMassVariation(@NFloat double value);

    /**
     * particleSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleSize">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleSize:")
    public native void setParticleSize(@NFloat double value);

    /**
     * particleSizeVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleSizeVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleSizeVariation:")
    public native void setParticleSizeVariation(@NFloat double value);

    /**
     * particleVelocity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleVelocity">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleVelocity:")
    public native void setParticleVelocity(@NFloat double value);

    /**
     * particleVelocityVariation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/particleVelocityVariation">iOS Dev Center</a>
     */
    @Generated
    @Selector("setParticleVelocityVariation:")
    public native void setParticleVelocityVariation(@NFloat double value);

    /**
     * propertyControllers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/propertyControllers">iOS Dev Center</a>
     */
    @Generated
    @Selector("setPropertyControllers:")
    public native void setPropertyControllers(NSDictionary<String, ? extends SCNParticlePropertyController> value);

    /**
     * sortingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/sortingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSortingMode:")
    public native void setSortingMode(@NInt long value);

    /**
     * speedFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/speedFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpeedFactor:")
    public native void setSpeedFactor(@NFloat double value);

    /**
     * spreadingAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/spreadingAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSpreadingAngle:")
    public native void setSpreadingAngle(@NFloat double value);

    /**
     * stretchFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/stretchFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setStretchFactor:")
    public native void setStretchFactor(@NFloat double value);

    /**
     * systemSpawnedOnCollision</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnCollision">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSystemSpawnedOnCollision:")
    public native void setSystemSpawnedOnCollision(SCNParticleSystem value);

    /**
     * systemSpawnedOnDying</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnDying">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSystemSpawnedOnDying:")
    public native void setSystemSpawnedOnDying(SCNParticleSystem value);

    /**
     * systemSpawnedOnLiving</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnLiving">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSystemSpawnedOnLiving:")
    public native void setSystemSpawnedOnLiving(SCNParticleSystem value);

    /**
     * warmupDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/warmupDuration">iOS Dev Center</a>
     */
    @Generated
    @Selector("setWarmupDuration:")
    public native void setWarmupDuration(@NFloat double value);

    /**
     * sortingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/sortingMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("sortingMode")
    @NInt
    public native long sortingMode();

    /**
     * speedFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/speedFactor">iOS Dev Center</a>
     */
    @Generated
    @Selector("speedFactor")
    @NFloat
    public native double speedFactor();

    /**
     * spreadingAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/spreadingAngle">iOS Dev Center</a>
     */
    @Generated
    @Selector("spreadingAngle")
    @NFloat
    public native double spreadingAngle();

    /**
     * stretchFactor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/stretchFactor">iOS Dev Center</a>
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
     * systemSpawnedOnCollision</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnCollision">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemSpawnedOnCollision")
    public native SCNParticleSystem systemSpawnedOnCollision();

    /**
     * systemSpawnedOnDying</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnDying">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemSpawnedOnDying")
    public native SCNParticleSystem systemSpawnedOnDying();

    /**
     * systemSpawnedOnLiving</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/systemSpawnedOnLiving">iOS Dev Center</a>
     */
    @Generated
    @Selector("systemSpawnedOnLiving")
    public native SCNParticleSystem systemSpawnedOnLiving();

    /**
     * warmupDuration</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNParticleSystem_Class/index.html#//apple_ref/occ/instp/SCNParticleSystem/warmupDuration">iOS Dev Center</a>
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
}

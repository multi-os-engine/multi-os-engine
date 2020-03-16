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
import apple.coregraphics.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.NSValue;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLLight;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNTechniqueSupport;
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

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNLight extends NSObject implements SCNAnimatable, NSCopying, NSSecureCoding, SCNTechniqueSupport {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNLight(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNLight alloc();

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
    @Selector("light")
    public static native SCNLight light();

    @Generated
    @Selector("lightWithMDLLight:")
    public static native SCNLight lightWithMDLLight(MDLLight mdlLight);

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("IESProfileURL")
    public native NSURL IESProfileURL();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) Object animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("attenuationEndDistance")
    @NFloat
    public native double attenuationEndDistance();

    @Generated
    @Selector("attenuationFalloffExponent")
    @NFloat
    public native double attenuationFalloffExponent();

    @Generated
    @Selector("attenuationStartDistance")
    @NFloat
    public native double attenuationStartDistance();

    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Selector("color")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object color();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("gobo")
    public native SCNMaterialProperty gobo();

    @Generated
    @Selector("init")
    public native SCNLight init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLight initWithCoder(NSCoder coder);

    @Generated
    @Selector("intensity")
    @NFloat
    public native double intensity();

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("orthographicScale")
    @NFloat
    public native double orthographicScale();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    @Generated
    @Selector("setAttenuationEndDistance:")
    public native void setAttenuationEndDistance(@NFloat double value);

    @Generated
    @Selector("setAttenuationFalloffExponent:")
    public native void setAttenuationFalloffExponent(@NFloat double value);

    @Generated
    @Selector("setAttenuationStartDistance:")
    public native void setAttenuationStartDistance(@NFloat double value);

    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    @Generated
    @Selector("setColor:")
    public native void setColor(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setIESProfileURL:")
    public native void setIESProfileURL(NSURL value);

    @Generated
    @Selector("setIntensity:")
    public native void setIntensity(@NFloat double value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(@NFloat double value);

    @Generated
    @Selector("setShadowBias:")
    public native void setShadowBias(@NFloat double value);

    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Mapped(ObjCObjectMapper.class) Object value);

    @Generated
    @Selector("setShadowMapSize:")
    public native void setShadowMapSize(@ByValue CGSize value);

    @Generated
    @Selector("setShadowMode:")
    public native void setShadowMode(@NInt long value);

    @Generated
    @Selector("setShadowRadius:")
    public native void setShadowRadius(@NFloat double value);

    @Generated
    @Selector("setShadowSampleCount:")
    public native void setShadowSampleCount(@NUInt long value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setSpotInnerAngle:")
    public native void setSpotInnerAngle(@NFloat double value);

    @Generated
    @Selector("setSpotOuterAngle:")
    public native void setSpotOuterAngle(@NFloat double value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    @Generated
    @Selector("setTemperature:")
    public native void setTemperature(@NFloat double value);

    @Generated
    @Selector("setType:")
    public native void setType(String value);

    @Generated
    @Selector("setZFar:")
    public native void setZFar(@NFloat double value);

    @Generated
    @Selector("setZNear:")
    public native void setZNear(@NFloat double value);

    @Generated
    @Selector("shadowBias")
    @NFloat
    public native double shadowBias();

    @Generated
    @Selector("shadowColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object shadowColor();

    @Generated
    @Selector("shadowMapSize")
    @ByValue
    public native CGSize shadowMapSize();

    @Generated
    @Selector("shadowMode")
    @NInt
    public native long shadowMode();

    @Generated
    @Selector("shadowRadius")
    @NFloat
    public native double shadowRadius();

    @Generated
    @Selector("shadowSampleCount")
    @NUInt
    public native long shadowSampleCount();

    @Generated
    @Selector("spotInnerAngle")
    @NFloat
    public native double spotInnerAngle();

    @Generated
    @Selector("spotOuterAngle")
    @NFloat
    public native double spotOuterAngle();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    @Generated
    @Selector("temperature")
    @NFloat
    public native double temperature();

    @Generated
    @Selector("type")
    public native String type();

    @Generated
    @Selector("zFar")
    @NFloat
    public native double zFar();

    @Generated
    @Selector("zNear")
    @NFloat
    public native double zNear();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("automaticallyAdjustsShadowProjection")
    public native boolean automaticallyAdjustsShadowProjection();

    @Generated
    @Selector("forcesBackFaceCasters")
    public native boolean forcesBackFaceCasters();

    @Generated
    @Selector("maximumShadowDistance")
    @NFloat
    public native double maximumShadowDistance();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("sampleDistributedShadowMaps")
    public native boolean sampleDistributedShadowMaps();

    @Generated
    @Selector("setAutomaticallyAdjustsShadowProjection:")
    public native void setAutomaticallyAdjustsShadowProjection(boolean value);

    @Generated
    @Selector("setForcesBackFaceCasters:")
    public native void setForcesBackFaceCasters(boolean value);

    @Generated
    @Selector("setMaximumShadowDistance:")
    public native void setMaximumShadowDistance(@NFloat double value);

    @Generated
    @Selector("setSampleDistributedShadowMaps:")
    public native void setSampleDistributedShadowMaps(boolean value);

    @Generated
    @Selector("setShadowCascadeCount:")
    public native void setShadowCascadeCount(@NUInt long value);

    @Generated
    @Selector("setShadowCascadeSplittingFactor:")
    public native void setShadowCascadeSplittingFactor(@NFloat double value);

    @Generated
    @Selector("shadowCascadeCount")
    @NUInt
    public native long shadowCascadeCount();

    @Generated
    @Selector("shadowCascadeSplittingFactor")
    @NFloat
    public native double shadowCascadeSplittingFactor();

    @Generated
    @Selector("sphericalHarmonicsCoefficients")
    public native NSData sphericalHarmonicsCoefficients();

    @Generated
    @Selector("areaPolygonVertices")
    public native NSArray<? extends NSValue> areaPolygonVertices();

    @Generated
    @Selector("areaType")
    @NInt
    public native long areaType();

    @Generated
    @Selector("doubleSided")
    public native boolean doubleSided();

    @Generated
    @Selector("drawsArea")
    public native boolean drawsArea();

    @Generated
    @Selector("parallaxCorrectionEnabled")
    public native boolean parallaxCorrectionEnabled();

    @Generated
    @Selector("probeEnvironment")
    public native SCNMaterialProperty probeEnvironment();

    @Generated
    @Selector("probeType")
    @NInt
    public native long probeType();

    @Generated
    @Selector("probeUpdateType")
    @NInt
    public native long probeUpdateType();

    @Generated
    @Selector("setAreaPolygonVertices:")
    public native void setAreaPolygonVertices(NSArray<? extends NSValue> value);

    @Generated
    @Selector("setAreaType:")
    public native void setAreaType(@NInt long value);

    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    @Generated
    @Selector("setDrawsArea:")
    public native void setDrawsArea(boolean value);

    @Generated
    @Selector("setParallaxCorrectionEnabled:")
    public native void setParallaxCorrectionEnabled(boolean value);

    @Generated
    @Selector("setProbeType:")
    public native void setProbeType(@NInt long value);

    @Generated
    @Selector("setProbeUpdateType:")
    public native void setProbeUpdateType(@NInt long value);
}

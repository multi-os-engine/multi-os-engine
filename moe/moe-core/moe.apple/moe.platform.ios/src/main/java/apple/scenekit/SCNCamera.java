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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.modelio.MDLCamera;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNTechniqueSupport;
import apple.scenekit.struct.SCNMatrix4;
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
public class SCNCamera extends NSObject implements SCNAnimatable, SCNTechniqueSupport, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNCamera(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNCamera alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("camera")
    public static native SCNCamera camera();

    @Generated
    @Selector("cameraWithMDLCamera:")
    public static native SCNCamera cameraWithMDLCamera(MDLCamera mdlCamera);

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
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) Object animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("aperture")
    @NFloat
    public native double aperture();

    @Generated
    @Selector("automaticallyAdjustsZRange")
    public native boolean automaticallyAdjustsZRange();

    @Generated
    @Selector("averageGray")
    @NFloat
    public native double averageGray();

    @Generated
    @Selector("bloomBlurRadius")
    @NFloat
    public native double bloomBlurRadius();

    @Generated
    @Selector("bloomIntensity")
    @NFloat
    public native double bloomIntensity();

    @Generated
    @Selector("bloomThreshold")
    @NFloat
    public native double bloomThreshold();

    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    @Generated
    @Selector("colorFringeIntensity")
    @NFloat
    public native double colorFringeIntensity();

    @Generated
    @Selector("colorFringeStrength")
    @NFloat
    public native double colorFringeStrength();

    @Generated
    @Selector("colorGrading")
    public native SCNMaterialProperty colorGrading();

    @Generated
    @Selector("contrast")
    @NFloat
    public native double contrast();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("exposureAdaptationBrighteningSpeedFactor")
    @NFloat
    public native double exposureAdaptationBrighteningSpeedFactor();

    @Generated
    @Selector("exposureAdaptationDarkeningSpeedFactor")
    @NFloat
    public native double exposureAdaptationDarkeningSpeedFactor();

    @Generated
    @Selector("exposureOffset")
    @NFloat
    public native double exposureOffset();

    @Generated
    @Selector("focalBlurRadius")
    @NFloat
    public native double focalBlurRadius();

    @Generated
    @Selector("focalDistance")
    @NFloat
    public native double focalDistance();

    @Generated
    @Selector("focalSize")
    @NFloat
    public native double focalSize();

    @Generated
    @Selector("init")
    public native SCNCamera init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNCamera initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    @Generated
    @Selector("maximumExposure")
    @NFloat
    public native double maximumExposure();

    @Generated
    @Selector("minimumExposure")
    @NFloat
    public native double minimumExposure();

    @Generated
    @Selector("motionBlurIntensity")
    @NFloat
    public native double motionBlurIntensity();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("orthographicScale")
    public native double orthographicScale();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @Selector("projectionTransform")
    @ByValue
    public native SCNMatrix4 projectionTransform();

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
    @Selector("saturation")
    @NFloat
    public native double saturation();

    @Generated
    @Selector("setAperture:")
    public native void setAperture(@NFloat double value);

    @Generated
    @Selector("setAutomaticallyAdjustsZRange:")
    public native void setAutomaticallyAdjustsZRange(boolean value);

    @Generated
    @Selector("setAverageGray:")
    public native void setAverageGray(@NFloat double value);

    @Generated
    @Selector("setBloomBlurRadius:")
    public native void setBloomBlurRadius(@NFloat double value);

    @Generated
    @Selector("setBloomIntensity:")
    public native void setBloomIntensity(@NFloat double value);

    @Generated
    @Selector("setBloomThreshold:")
    public native void setBloomThreshold(@NFloat double value);

    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    @Generated
    @Selector("setColorFringeIntensity:")
    public native void setColorFringeIntensity(@NFloat double value);

    @Generated
    @Selector("setColorFringeStrength:")
    public native void setColorFringeStrength(@NFloat double value);

    @Generated
    @Selector("setContrast:")
    public native void setContrast(@NFloat double value);

    @Generated
    @Selector("setExposureAdaptationBrighteningSpeedFactor:")
    public native void setExposureAdaptationBrighteningSpeedFactor(@NFloat double value);

    @Generated
    @Selector("setExposureAdaptationDarkeningSpeedFactor:")
    public native void setExposureAdaptationDarkeningSpeedFactor(@NFloat double value);

    @Generated
    @Selector("setExposureOffset:")
    public native void setExposureOffset(@NFloat double value);

    @Generated
    @Selector("setFocalBlurRadius:")
    public native void setFocalBlurRadius(@NFloat double value);

    @Generated
    @Selector("setFocalDistance:")
    public native void setFocalDistance(@NFloat double value);

    @Generated
    @Selector("setFocalSize:")
    public native void setFocalSize(@NFloat double value);

    @Generated
    @Selector("setMaximumExposure:")
    public native void setMaximumExposure(@NFloat double value);

    @Generated
    @Selector("setMinimumExposure:")
    public native void setMinimumExposure(@NFloat double value);

    @Generated
    @Selector("setMotionBlurIntensity:")
    public native void setMotionBlurIntensity(@NFloat double value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(double value);

    @Generated
    @Selector("setProjectionTransform:")
    public native void setProjectionTransform(@ByValue SCNMatrix4 value);

    @Generated
    @Selector("setSaturation:")
    public native void setSaturation(@NFloat double value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    @Generated
    @Selector("setUsesOrthographicProjection:")
    public native void setUsesOrthographicProjection(boolean value);

    @Generated
    @Selector("setVignettingIntensity:")
    public native void setVignettingIntensity(@NFloat double value);

    @Generated
    @Selector("setVignettingPower:")
    public native void setVignettingPower(@NFloat double value);

    @Generated
    @Selector("setWantsExposureAdaptation:")
    public native void setWantsExposureAdaptation(boolean value);

    @Generated
    @Selector("setWantsHDR:")
    public native void setWantsHDR(boolean value);

    @Generated
    @Selector("setWhitePoint:")
    public native void setWhitePoint(@NFloat double value);

    @Generated
    @Selector("setXFov:")
    public native void setXFov(double value);

    @Generated
    @Selector("setYFov:")
    public native void setYFov(double value);

    @Generated
    @Selector("setZFar:")
    public native void setZFar(double value);

    @Generated
    @Selector("setZNear:")
    public native void setZNear(double value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    @Generated
    @Selector("usesOrthographicProjection")
    public native boolean usesOrthographicProjection();

    @Generated
    @Selector("vignettingIntensity")
    @NFloat
    public native double vignettingIntensity();

    @Generated
    @Selector("vignettingPower")
    @NFloat
    public native double vignettingPower();

    @Generated
    @Selector("wantsExposureAdaptation")
    public native boolean wantsExposureAdaptation();

    @Generated
    @Selector("wantsHDR")
    public native boolean wantsHDR();

    @Generated
    @Selector("whitePoint")
    @NFloat
    public native double whitePoint();

    @Generated
    @Selector("xFov")
    public native double xFov();

    @Generated
    @Selector("yFov")
    public native double yFov();

    @Generated
    @Selector("zFar")
    public native double zFar();

    @Generated
    @Selector("zNear")
    public native double zNear();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("apertureBladeCount")
    @NInt
    public native long apertureBladeCount();

    @Generated
    @Selector("fStop")
    @NFloat
    public native double fStop();

    @Generated
    @Selector("fieldOfView")
    @NFloat
    public native double fieldOfView();

    @Generated
    @Selector("focalBlurSampleCount")
    @NInt
    public native long focalBlurSampleCount();

    @Generated
    @Selector("focalLength")
    @NFloat
    public native double focalLength();

    @Generated
    @Selector("focusDistance")
    @NFloat
    public native double focusDistance();

    @Generated
    @Selector("projectionDirection")
    @NInt
    public native long projectionDirection();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("screenSpaceAmbientOcclusionBias")
    @NFloat
    public native double screenSpaceAmbientOcclusionBias();

    @Generated
    @Selector("screenSpaceAmbientOcclusionDepthThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionDepthThreshold();

    @Generated
    @Selector("screenSpaceAmbientOcclusionIntensity")
    @NFloat
    public native double screenSpaceAmbientOcclusionIntensity();

    @Generated
    @Selector("screenSpaceAmbientOcclusionNormalThreshold")
    @NFloat
    public native double screenSpaceAmbientOcclusionNormalThreshold();

    @Generated
    @Selector("screenSpaceAmbientOcclusionRadius")
    @NFloat
    public native double screenSpaceAmbientOcclusionRadius();

    @Generated
    @Selector("sensorHeight")
    @NFloat
    public native double sensorHeight();

    @Generated
    @Selector("setApertureBladeCount:")
    public native void setApertureBladeCount(@NInt long value);

    @Generated
    @Selector("setFStop:")
    public native void setFStop(@NFloat double value);

    @Generated
    @Selector("setFieldOfView:")
    public native void setFieldOfView(@NFloat double value);

    @Generated
    @Selector("setFocalBlurSampleCount:")
    public native void setFocalBlurSampleCount(@NInt long value);

    @Generated
    @Selector("setFocalLength:")
    public native void setFocalLength(@NFloat double value);

    @Generated
    @Selector("setFocusDistance:")
    public native void setFocusDistance(@NFloat double value);

    @Generated
    @Selector("setProjectionDirection:")
    public native void setProjectionDirection(@NInt long value);

    @Generated
    @Selector("setScreenSpaceAmbientOcclusionBias:")
    public native void setScreenSpaceAmbientOcclusionBias(@NFloat double value);

    @Generated
    @Selector("setScreenSpaceAmbientOcclusionDepthThreshold:")
    public native void setScreenSpaceAmbientOcclusionDepthThreshold(@NFloat double value);

    @Generated
    @Selector("setScreenSpaceAmbientOcclusionIntensity:")
    public native void setScreenSpaceAmbientOcclusionIntensity(@NFloat double value);

    @Generated
    @Selector("setScreenSpaceAmbientOcclusionNormalThreshold:")
    public native void setScreenSpaceAmbientOcclusionNormalThreshold(@NFloat double value);

    @Generated
    @Selector("setScreenSpaceAmbientOcclusionRadius:")
    public native void setScreenSpaceAmbientOcclusionRadius(@NFloat double value);

    @Generated
    @Selector("setSensorHeight:")
    public native void setSensorHeight(@NFloat double value);

    @Generated
    @Selector("setWantsDepthOfField:")
    public native void setWantsDepthOfField(boolean value);

    @Generated
    @Selector("wantsDepthOfField")
    public native boolean wantsDepthOfField();

    @Generated
    @Selector("bloomIterationCount")
    @NInt
    public native long bloomIterationCount();

    @Generated
    @Selector("bloomIterationSpread")
    @NFloat
    public native double bloomIterationSpread();

    @Generated
    @Selector("grainIntensity")
    @NFloat
    public native double grainIntensity();

    @Generated
    @Selector("grainIsColored")
    public native boolean grainIsColored();

    @Generated
    @Selector("grainScale")
    @NFloat
    public native double grainScale();

    @Generated
    @Selector("projectionTransformWithViewportSize:")
    @ByValue
    public native SCNMatrix4 projectionTransformWithViewportSize(@ByValue CGSize viewportSize);

    @Generated
    @Selector("setBloomIterationCount:")
    public native void setBloomIterationCount(@NInt long value);

    @Generated
    @Selector("setBloomIterationSpread:")
    public native void setBloomIterationSpread(@NFloat double value);

    @Generated
    @Selector("setGrainIntensity:")
    public native void setGrainIntensity(@NFloat double value);

    @Generated
    @Selector("setGrainIsColored:")
    public native void setGrainIsColored(boolean value);

    @Generated
    @Selector("setGrainScale:")
    public native void setGrainScale(@NFloat double value);

    @Generated
    @Selector("setWhiteBalanceTemperature:")
    public native void setWhiteBalanceTemperature(@NFloat double value);

    @Generated
    @Selector("setWhiteBalanceTint:")
    public native void setWhiteBalanceTint(@NFloat double value);

    @Generated
    @Selector("whiteBalanceTemperature")
    @NFloat
    public native double whiteBalanceTemperature();

    @Generated
    @Selector("whiteBalanceTint")
    @NFloat
    public native double whiteBalanceTint();
}

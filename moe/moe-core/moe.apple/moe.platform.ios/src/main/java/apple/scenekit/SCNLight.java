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
import apple.scenekit.protocol.SCNAnimation;
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

/**
 * @class SCNLight
 * @abstract SCNLight represents a light that can be attached to a SCNNode. 
 */
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

    /**
     * @method light
     * @abstract Creates and returns a light instance.
     */
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

    /**
     * @property IESProfileURL
     * @abstract Specifies the IES file from which the shape, direction, and intensity of illumination is determined. Defaults to nil.
     */
    @Generated
    @Selector("IESProfileURL")
    public native NSURL IESProfileURL();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * @property attenuationEndDistance
     * @abstract The distance at which the attenuation ends (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("attenuationEndDistance")
    @NFloat
    public native double attenuationEndDistance();

    /**
     * @property attenuationFalloffExponent
     * @abstract Specifies the attenuation between the start and end attenuation distances. 0 means a constant attenuation, 1 a linear attenuation and 2 a quadratic attenuation, but any positive value will work (Omni or Spot light types only). Animatable. Defaults to 2.
     */
    @Generated
    @Selector("attenuationFalloffExponent")
    @NFloat
    public native double attenuationFalloffExponent();

    /**
     * @property attenuationStartDistance
     * @abstract The distance at which the attenuation starts (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("attenuationStartDistance")
    @NFloat
    public native double attenuationStartDistance();

    /**
     * @property castsShadow
     * @abstract Determines whether the receiver casts a shadow. Defaults to NO.
     * @discussion Shadows are only supported by spot and directional lights.
     */
    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    /**
     * @property categoryBitMask
     * @abstract Determines the node categories that will be lit by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * @property color
     * @abstract Specifies the receiver's color (NSColor or CGColorRef). Animatable. Defaults to white.
     * @discussion The initial value is a NSColor. The renderer multiplies the light's color is by the color derived from the light's temperature.
     */
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

    /**
     * @property gobo
     * @abstract Specifies the gobo (or "cookie") of the light, used to control the shape of emitted light.
     * @discussion Gobos are only supported by spot lights.
     */
    @Generated
    @Selector("gobo")
    public native SCNMaterialProperty gobo();

    @Generated
    @Selector("init")
    public native SCNLight init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLight initWithCoder(NSCoder coder);

    /**
     * @property intensity
     * @abstract Specifies the receiver's intensity.
     * @discussion This intensity is used to modulate the light color. When used with a physically-based material, this corresponds to the luminous flux of the light, expressed in lumens (lm). Defaults to 1000. Animatable.
     */
    @Generated
    @Selector("intensity")
    @NFloat
    public native double intensity();

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * @property name
     * @abstract Determines the name of the receiver.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @property orthographicScale
     * @abstract Specifies the orthographic scale used to render from the directional light into the shadow map. Defaults to 1.
     * @discussion This is only applicable for directional lights.
     */
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

    /**
     * @property attenuationEndDistance
     * @abstract The distance at which the attenuation ends (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setAttenuationEndDistance:")
    public native void setAttenuationEndDistance(@NFloat double value);

    /**
     * @property attenuationFalloffExponent
     * @abstract Specifies the attenuation between the start and end attenuation distances. 0 means a constant attenuation, 1 a linear attenuation and 2 a quadratic attenuation, but any positive value will work (Omni or Spot light types only). Animatable. Defaults to 2.
     */
    @Generated
    @Selector("setAttenuationFalloffExponent:")
    public native void setAttenuationFalloffExponent(@NFloat double value);

    /**
     * @property attenuationStartDistance
     * @abstract The distance at which the attenuation starts (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setAttenuationStartDistance:")
    public native void setAttenuationStartDistance(@NFloat double value);

    /**
     * @property castsShadow
     * @abstract Determines whether the receiver casts a shadow. Defaults to NO.
     * @discussion Shadows are only supported by spot and directional lights.
     */
    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    /**
     * @property categoryBitMask
     * @abstract Determines the node categories that will be lit by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * @property color
     * @abstract Specifies the receiver's color (NSColor or CGColorRef). Animatable. Defaults to white.
     * @discussion The initial value is a NSColor. The renderer multiplies the light's color is by the color derived from the light's temperature.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * @property IESProfileURL
     * @abstract Specifies the IES file from which the shape, direction, and intensity of illumination is determined. Defaults to nil.
     */
    @Generated
    @Selector("setIESProfileURL:")
    public native void setIESProfileURL(NSURL value);

    /**
     * @property intensity
     * @abstract Specifies the receiver's intensity.
     * @discussion This intensity is used to modulate the light color. When used with a physically-based material, this corresponds to the luminous flux of the light, expressed in lumens (lm). Defaults to 1000. Animatable.
     */
    @Generated
    @Selector("setIntensity:")
    public native void setIntensity(@NFloat double value);

    /**
     * @property name
     * @abstract Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @property orthographicScale
     * @abstract Specifies the orthographic scale used to render from the directional light into the shadow map. Defaults to 1.
     * @discussion This is only applicable for directional lights.
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(@NFloat double value);

    /**
     * @property shadowBias
     * @abstract Specifies the correction to apply to the shadow map to correct acne artefacts. It is multiplied by an implementation-specific value to create a constant depth offset. Defaults to 1.0
     */
    @Generated
    @Selector("setShadowBias:")
    public native void setShadowBias(@NFloat double value);

    /**
     * @property shadowColor
     * @abstract Specifies the color (CGColorRef or NSColor) of the shadow casted by the receiver. Defaults to black. Animatable.
     * @discussion On iOS 9 or earlier and macOS 10.11 or earlier, this defaults to black 50% transparent.
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * @property shadowMapSize
     * @abstract Specifies the size of the shadow map.
     * @discussion The larger the shadow map is the more precise the shadows are but the slower the computation is. If set to {0,0} the size of the shadow map is automatically chosen. Defaults to {0,0}.
     */
    @Generated
    @Selector("setShadowMapSize:")
    public native void setShadowMapSize(@ByValue CGSize value);

    /**
     * @property shadowMode
     * @abstract Specified the mode to use to cast shadows. See above for the available modes and their description. Defaults to SCNShadowModeForward.
     */
    @Generated
    @Selector("setShadowMode:")
    public native void setShadowMode(@NInt long value);

    /**
     * @property shadowRadius
     * @abstract Specifies the sample radius used to render the receiver’s shadow. Default value is 3.0. Animatable.
     */
    @Generated
    @Selector("setShadowRadius:")
    public native void setShadowRadius(@NFloat double value);

    /**
     * @property shadowSampleCount
     * @abstract Specifies the number of sample per fragment to compute the shadow map. Defaults to 0.
     * @discussion On macOS 10.11 or earlier, the shadowSampleCount defaults to 16. On iOS 9 or earlier it defaults to 1.0.
     * On macOS 10.12, iOS 10 and greater, when the shadowSampleCount is set to 0, a default sample count is chosen depending on the platform.
     */
    @Generated
    @Selector("setShadowSampleCount:")
    public native void setShadowSampleCount(@NUInt long value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * @property spotInnerAngle
     * @abstract The angle in degrees between the spot direction and the lit element below which the lighting is at full strength. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setSpotInnerAngle:")
    public native void setSpotInnerAngle(@NFloat double value);

    /**
     * @property spotOuterAngle
     * @abstract The angle in degrees between the spot direction and the lit element after which the lighting is at zero strength. Animatable. Defaults to 45 degrees.
     */
    @Generated
    @Selector("setSpotOuterAngle:")
    public native void setSpotOuterAngle(@NFloat double value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(SCNTechnique value);

    /**
     * @property temperature
     * @abstract Specifies the receiver's temperature.
     * @discussion This specifies the temperature of the light in Kelvin. The renderer multiplies the light's color by the color derived from the light's temperature. Defaults to 6500 (pure white). Animatable.
     */
    @Generated
    @Selector("setTemperature:")
    public native void setTemperature(@NFloat double value);

    /**
     * @property type
     * @abstract Specifies the receiver's type.
     * @discussion Defaults to SCNLightTypeOmni on iOS 8 and later, and on macOS 10.10 and later (otherwise defaults to SCNLightTypeAmbient).
     */
    @Generated
    @Selector("setType:")
    public native void setType(String value);

    /**
     * @property zFar
     * @abstract Specifies the maximal distance between the light and a visible surface to cast shadow on. If a surface is further from the light than this maximal distance, then the surface won't be shadowed. Animatable. Defaults to 100.
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(@NFloat double value);

    /**
     * @property zNear
     * @abstract Specifies the minimal distance between the light and the surface to cast shadow on. If a surface is closer to the light than this minimal distance, then the surface won't be shadowed. The near value must be different than zero. Animatable. Defaults to 1.
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(@NFloat double value);

    /**
     * @property shadowBias
     * @abstract Specifies the correction to apply to the shadow map to correct acne artefacts. It is multiplied by an implementation-specific value to create a constant depth offset. Defaults to 1.0
     */
    @Generated
    @Selector("shadowBias")
    @NFloat
    public native double shadowBias();

    /**
     * @property shadowColor
     * @abstract Specifies the color (CGColorRef or NSColor) of the shadow casted by the receiver. Defaults to black. Animatable.
     * @discussion On iOS 9 or earlier and macOS 10.11 or earlier, this defaults to black 50% transparent.
     */
    @Generated
    @Selector("shadowColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object shadowColor();

    /**
     * @property shadowMapSize
     * @abstract Specifies the size of the shadow map.
     * @discussion The larger the shadow map is the more precise the shadows are but the slower the computation is. If set to {0,0} the size of the shadow map is automatically chosen. Defaults to {0,0}.
     */
    @Generated
    @Selector("shadowMapSize")
    @ByValue
    public native CGSize shadowMapSize();

    /**
     * @property shadowMode
     * @abstract Specified the mode to use to cast shadows. See above for the available modes and their description. Defaults to SCNShadowModeForward.
     */
    @Generated
    @Selector("shadowMode")
    @NInt
    public native long shadowMode();

    /**
     * @property shadowRadius
     * @abstract Specifies the sample radius used to render the receiver’s shadow. Default value is 3.0. Animatable.
     */
    @Generated
    @Selector("shadowRadius")
    @NFloat
    public native double shadowRadius();

    /**
     * @property shadowSampleCount
     * @abstract Specifies the number of sample per fragment to compute the shadow map. Defaults to 0.
     * @discussion On macOS 10.11 or earlier, the shadowSampleCount defaults to 16. On iOS 9 or earlier it defaults to 1.0.
     * On macOS 10.12, iOS 10 and greater, when the shadowSampleCount is set to 0, a default sample count is chosen depending on the platform.
     */
    @Generated
    @Selector("shadowSampleCount")
    @NUInt
    public native long shadowSampleCount();

    /**
     * @property spotInnerAngle
     * @abstract The angle in degrees between the spot direction and the lit element below which the lighting is at full strength. Animatable. Defaults to 0.
     */
    @Generated
    @Selector("spotInnerAngle")
    @NFloat
    public native double spotInnerAngle();

    /**
     * @property spotOuterAngle
     * @abstract The angle in degrees between the spot direction and the lit element after which the lighting is at zero strength. Animatable. Defaults to 45 degrees.
     */
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

    /**
     * @property temperature
     * @abstract Specifies the receiver's temperature.
     * @discussion This specifies the temperature of the light in Kelvin. The renderer multiplies the light's color by the color derived from the light's temperature. Defaults to 6500 (pure white). Animatable.
     */
    @Generated
    @Selector("temperature")
    @NFloat
    public native double temperature();

    /**
     * @property type
     * @abstract Specifies the receiver's type.
     * @discussion Defaults to SCNLightTypeOmni on iOS 8 and later, and on macOS 10.10 and later (otherwise defaults to SCNLightTypeAmbient).
     */
    @Generated
    @Selector("type")
    public native String type();

    /**
     * @property zFar
     * @abstract Specifies the maximal distance between the light and a visible surface to cast shadow on. If a surface is further from the light than this maximal distance, then the surface won't be shadowed. Animatable. Defaults to 100.
     */
    @Generated
    @Selector("zFar")
    @NFloat
    public native double zFar();

    /**
     * @property zNear
     * @abstract Specifies the minimal distance between the light and the surface to cast shadow on. If a surface is closer to the light than this minimal distance, then the surface won't be shadowed. The near value must be different than zero. Animatable. Defaults to 1.
     */
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

    /**
     * @property automaticallyAdjustsShadowProjection
     * @abstract Specifies if the shadow map projection should be done automatically or manually by the user. Defaults to YES.
     */
    @Generated
    @Selector("automaticallyAdjustsShadowProjection")
    public native boolean automaticallyAdjustsShadowProjection();

    /**
     * @property forcesBackFaceCasters
     * @abstract Render only back faces of the shadow caster when enabled. Defaults to NO.
     * This is a behavior change from previous releases.
     */
    @Generated
    @Selector("forcesBackFaceCasters")
    public native boolean forcesBackFaceCasters();

    /**
     * @property maximumShadowDistance
     * @abstract Specifies the maximum distance from the viewpoint from which the shadows for the receiver light won't be computed. Defaults to 100.0.
     */
    @Generated
    @Selector("maximumShadowDistance")
    @NFloat
    public native double maximumShadowDistance();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * @property sampleDistributedShadowMaps
     * @abstract Use the sample distribution of the main rendering to better fit the shadow frusta. Defaults to NO.
     */
    @Generated
    @Selector("sampleDistributedShadowMaps")
    public native boolean sampleDistributedShadowMaps();

    /**
     * @property automaticallyAdjustsShadowProjection
     * @abstract Specifies if the shadow map projection should be done automatically or manually by the user. Defaults to YES.
     */
    @Generated
    @Selector("setAutomaticallyAdjustsShadowProjection:")
    public native void setAutomaticallyAdjustsShadowProjection(boolean value);

    /**
     * @property forcesBackFaceCasters
     * @abstract Render only back faces of the shadow caster when enabled. Defaults to NO.
     * This is a behavior change from previous releases.
     */
    @Generated
    @Selector("setForcesBackFaceCasters:")
    public native void setForcesBackFaceCasters(boolean value);

    /**
     * @property maximumShadowDistance
     * @abstract Specifies the maximum distance from the viewpoint from which the shadows for the receiver light won't be computed. Defaults to 100.0.
     */
    @Generated
    @Selector("setMaximumShadowDistance:")
    public native void setMaximumShadowDistance(@NFloat double value);

    /**
     * @property sampleDistributedShadowMaps
     * @abstract Use the sample distribution of the main rendering to better fit the shadow frusta. Defaults to NO.
     */
    @Generated
    @Selector("setSampleDistributedShadowMaps:")
    public native void setSampleDistributedShadowMaps(boolean value);

    /**
     * @property shadowCascadeCount
     * @abstract Specifies the number of distinct shadow maps that will be computed for the receiver light. Defaults to 1. Maximum is 4.
     */
    @Generated
    @Selector("setShadowCascadeCount:")
    public native void setShadowCascadeCount(@NUInt long value);

    /**
     * @property shadowCascadeSplittingFactor
     * @abstract Specifies a factor to interpolate between linear splitting (0) and logarithmic splitting (1). Defaults to 0.15.
     */
    @Generated
    @Selector("setShadowCascadeSplittingFactor:")
    public native void setShadowCascadeSplittingFactor(@NFloat double value);

    /**
     * @property shadowCascadeCount
     * @abstract Specifies the number of distinct shadow maps that will be computed for the receiver light. Defaults to 1. Maximum is 4.
     */
    @Generated
    @Selector("shadowCascadeCount")
    @NUInt
    public native long shadowCascadeCount();

    /**
     * @property shadowCascadeSplittingFactor
     * @abstract Specifies a factor to interpolate between linear splitting (0) and logarithmic splitting (1). Defaults to 0.15.
     */
    @Generated
    @Selector("shadowCascadeSplittingFactor")
    @NFloat
    public native double shadowCascadeSplittingFactor();

    /**
     * @property sphericalHarmonicsCoefficients
     * @abstract The receiver's spherical harmonics coefficients.
     * @discussion Currently spherical harmonics are only supported by light probes (SCNLightTypeProbe). The data is an array of 27 32-bit floating-point values, containing three non-interleaved data sets corresponding to the red, green, and blue sets of coefficients.
     */
    @Generated
    @Selector("sphericalHarmonicsCoefficients")
    public native NSData sphericalHarmonicsCoefficients();

    /**
     * @property areaPolygonVertices
     * @abstract Determines the shape of light of an area light of type SCNLightAreaTypePolygon. Defaults nil.
     * @discussion An array of CGPoint values corresponding to the coordinates of the polygon's vertices in the XY plane.
     */
    @Generated
    @Selector("areaPolygonVertices")
    public native NSArray<? extends NSValue> areaPolygonVertices();

    /**
     * @property areaType
     * @abstract Determines the shape of a light of type SCNLightTypeArea. Defaults to SCNLightAreaTypeRectangle.
     */
    @Generated
    @Selector("areaType")
    @NInt
    public native long areaType();

    /**
     * @property doubleSided
     * @abstract Determines whether a light of type SCNLightTypeArea is double-sided. Defaults NO.
     * @discussion Area lights of type SCNLightAreaTypeRectangle or SCNLightAreaTypePolygon emit light along the -Z axis. When set to YES, they also emit light along the +Z axis.
     */
    @Generated
    @Selector("doubleSided")
    public native boolean doubleSided();

    /**
     * @property drawsArea
     * @abstract Determines whether the shape of a light of type SCNLightTypeArea is drawn in the scene. Defaults to YES.
     */
    @Generated
    @Selector("drawsArea")
    public native boolean drawsArea();

    /**
     * Whether parallax correction is enabled for the reflection probe. Defaults to NO.
     */
    @Generated
    @Selector("parallaxCorrectionEnabled")
    public native boolean parallaxCorrectionEnabled();

    /**
     * Only applies to a probe of type SCNLightProbeTypeRadiance.
     */
    @Generated
    @Selector("probeEnvironment")
    public native SCNMaterialProperty probeEnvironment();

    /**
     * Type of the probe. Defaults to SCNLightProbeTypeIrradiance.
     */
    @Generated
    @Selector("probeType")
    @NInt
    public native long probeType();

    /**
     * Update type of the probe. Defaults to SCNLightProbeUpdateTypeNever.
     */
    @Generated
    @Selector("probeUpdateType")
    @NInt
    public native long probeUpdateType();

    /**
     * @property areaPolygonVertices
     * @abstract Determines the shape of light of an area light of type SCNLightAreaTypePolygon. Defaults nil.
     * @discussion An array of CGPoint values corresponding to the coordinates of the polygon's vertices in the XY plane.
     */
    @Generated
    @Selector("setAreaPolygonVertices:")
    public native void setAreaPolygonVertices(NSArray<? extends NSValue> value);

    /**
     * @property areaType
     * @abstract Determines the shape of a light of type SCNLightTypeArea. Defaults to SCNLightAreaTypeRectangle.
     */
    @Generated
    @Selector("setAreaType:")
    public native void setAreaType(@NInt long value);

    /**
     * @property doubleSided
     * @abstract Determines whether a light of type SCNLightTypeArea is double-sided. Defaults NO.
     * @discussion Area lights of type SCNLightAreaTypeRectangle or SCNLightAreaTypePolygon emit light along the -Z axis. When set to YES, they also emit light along the +Z axis.
     */
    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    /**
     * @property drawsArea
     * @abstract Determines whether the shape of a light of type SCNLightTypeArea is drawn in the scene. Defaults to YES.
     */
    @Generated
    @Selector("setDrawsArea:")
    public native void setDrawsArea(boolean value);

    /**
     * Whether parallax correction is enabled for the reflection probe. Defaults to NO.
     */
    @Generated
    @Selector("setParallaxCorrectionEnabled:")
    public native void setParallaxCorrectionEnabled(boolean value);

    /**
     * Type of the probe. Defaults to SCNLightProbeTypeIrradiance.
     */
    @Generated
    @Selector("setProbeType:")
    public native void setProbeType(@NInt long value);

    /**
     * Update type of the probe. Defaults to SCNLightProbeUpdateTypeNever.
     */
    @Generated
    @Selector("setProbeUpdateType:")
    public native void setProbeUpdateType(@NInt long value);
}

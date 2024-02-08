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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNLight
 * 
 * SCNLight represents a light that can be attached to a SCNNode.
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

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNLight allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * light
     * 
     * Creates and returns a light instance.
     */
    @Generated
    @Selector("light")
    public static native SCNLight light();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("lightWithMDLLight:")
    public static native SCNLight lightWithMDLLight(@NotNull MDLLight mdlLight);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNLight new_objc();

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
     * [@property] IESProfileURL
     * 
     * Specifies the IES file from which the shape, direction, and intensity of illumination is determined. Defaults to
     * nil.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("IESProfileURL")
    public native NSURL IESProfileURL();

    @Generated
    @Selector("addAnimation:forKey:")
    public native void addAnimationForKey(@NotNull @Mapped(ObjCObjectMapper.class) SCNAnimation animation,
            @Nullable String key);

    @Nullable
    @Deprecated
    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(@NotNull String key);

    @NotNull
    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] attenuationEndDistance
     * 
     * The distance at which the attenuation ends (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("attenuationEndDistance")
    @NFloat
    public native double attenuationEndDistance();

    /**
     * [@property] attenuationFalloffExponent
     * 
     * Specifies the attenuation between the start and end attenuation distances. 0 means a constant attenuation, 1 a
     * linear attenuation and 2 a quadratic attenuation, but any positive value will work (Omni or Spot light types
     * only). Animatable. Defaults to 2.
     */
    @Generated
    @Selector("attenuationFalloffExponent")
    @NFloat
    public native double attenuationFalloffExponent();

    /**
     * [@property] attenuationStartDistance
     * 
     * The distance at which the attenuation starts (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("attenuationStartDistance")
    @NFloat
    public native double attenuationStartDistance();

    /**
     * [@property] castsShadow
     * 
     * Determines whether the receiver casts a shadow. Defaults to NO.
     * 
     * Shadows are only supported by spot and directional lights.
     */
    @Generated
    @Selector("castsShadow")
    public native boolean castsShadow();

    /**
     * [@property] categoryBitMask
     * 
     * Determines the node categories that will be lit by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("categoryBitMask")
    @NUInt
    public native long categoryBitMask();

    /**
     * [@property] color
     * 
     * Specifies the receiver's color (NSColor or CGColorRef). Animatable. Defaults to white.
     * 
     * The initial value is a NSColor. The renderer multiplies the light's color is by the color derived from the
     * light's temperature.
     */
    @NotNull
    @Generated
    @Selector("color")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object color();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] gobo
     * 
     * Specifies the gobo (or "cookie") of the light, used to control the shape of emitted light.
     * 
     * Gobos are only supported by spot lights.
     */
    @Nullable
    @Generated
    @Selector("gobo")
    public native SCNMaterialProperty gobo();

    @Generated
    @Selector("init")
    public native SCNLight init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNLight initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] intensity
     * 
     * Specifies the receiver's intensity.
     * 
     * This intensity is used to modulate the light color. When used with a physically-based material, this corresponds
     * to the luminous flux of the light, expressed in lumens (lm). Defaults to 1000. Animatable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("intensity")
    @NFloat
    public native double intensity();

    @Deprecated
    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(@NotNull String key);

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] orthographicScale
     * 
     * Specifies the orthographic scale used to render from the directional light into the shadow map. Defaults to 1.
     * 
     * This is only applicable for directional lights.
     */
    @Generated
    @Selector("orthographicScale")
    @NFloat
    public native double orthographicScale();

    @Deprecated
    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(@NotNull String key);

    @Generated
    @Selector("removeAllAnimations")
    public native void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    public native void removeAnimationForKey(@NotNull String key);

    @Deprecated
    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    public native void removeAnimationForKeyFadeOutDuration(@NotNull String key, @NFloat double duration);

    @Deprecated
    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(@NotNull String key);

    /**
     * [@property] attenuationEndDistance
     * 
     * The distance at which the attenuation ends (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setAttenuationEndDistance:")
    public native void setAttenuationEndDistance(@NFloat double value);

    /**
     * [@property] attenuationFalloffExponent
     * 
     * Specifies the attenuation between the start and end attenuation distances. 0 means a constant attenuation, 1 a
     * linear attenuation and 2 a quadratic attenuation, but any positive value will work (Omni or Spot light types
     * only). Animatable. Defaults to 2.
     */
    @Generated
    @Selector("setAttenuationFalloffExponent:")
    public native void setAttenuationFalloffExponent(@NFloat double value);

    /**
     * [@property] attenuationStartDistance
     * 
     * The distance at which the attenuation starts (Omni or Spot light types only). Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setAttenuationStartDistance:")
    public native void setAttenuationStartDistance(@NFloat double value);

    /**
     * [@property] castsShadow
     * 
     * Determines whether the receiver casts a shadow. Defaults to NO.
     * 
     * Shadows are only supported by spot and directional lights.
     */
    @Generated
    @Selector("setCastsShadow:")
    public native void setCastsShadow(boolean value);

    /**
     * [@property] categoryBitMask
     * 
     * Determines the node categories that will be lit by the receiver. Defaults to all bit set.
     */
    @Generated
    @Selector("setCategoryBitMask:")
    public native void setCategoryBitMask(@NUInt long value);

    /**
     * [@property] color
     * 
     * Specifies the receiver's color (NSColor or CGColorRef). Animatable. Defaults to white.
     * 
     * The initial value is a NSColor. The renderer multiplies the light's color is by the color derived from the
     * light's temperature.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@NotNull @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] IESProfileURL
     * 
     * Specifies the IES file from which the shape, direction, and intensity of illumination is determined. Defaults to
     * nil.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setIESProfileURL:")
    public native void setIESProfileURL(@Nullable NSURL value);

    /**
     * [@property] intensity
     * 
     * Specifies the receiver's intensity.
     * 
     * This intensity is used to modulate the light color. When used with a physically-based material, this corresponds
     * to the luminous flux of the light, expressed in lumens (lm). Defaults to 1000. Animatable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setIntensity:")
    public native void setIntensity(@NFloat double value);

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * [@property] orthographicScale
     * 
     * Specifies the orthographic scale used to render from the directional light into the shadow map. Defaults to 1.
     * 
     * This is only applicable for directional lights.
     */
    @Generated
    @Selector("setOrthographicScale:")
    public native void setOrthographicScale(@NFloat double value);

    /**
     * [@property] shadowBias
     * 
     * Specifies the correction to apply to the shadow map to correct acne artefacts. It is multiplied by an
     * implementation-specific value to create a constant depth offset. Defaults to 1.0
     */
    @Generated
    @Selector("setShadowBias:")
    public native void setShadowBias(@NFloat double value);

    /**
     * [@property] shadowColor
     * 
     * Specifies the color (CGColorRef or NSColor) of the shadow casted by the receiver. Defaults to black. Animatable.
     * 
     * On iOS 9 or earlier and macOS 10.11 or earlier, this defaults to black 50% transparent.
     */
    @Generated
    @Selector("setShadowColor:")
    public native void setShadowColor(@NotNull @Mapped(ObjCObjectMapper.class) Object value);

    /**
     * [@property] shadowMapSize
     * 
     * Specifies the size of the shadow map.
     * 
     * The larger the shadow map is the more precise the shadows are but the slower the computation is. If set to {0,0}
     * the size of the shadow map is automatically chosen. Defaults to {0,0}.
     */
    @Generated
    @Selector("setShadowMapSize:")
    public native void setShadowMapSize(@ByValue CGSize value);

    /**
     * [@property] shadowMode
     * 
     * Specified the mode to use to cast shadows. See above for the available modes and their description. Defaults to
     * SCNShadowModeForward.
     */
    @Generated
    @Selector("setShadowMode:")
    public native void setShadowMode(@NInt long value);

    /**
     * [@property] shadowRadius
     * 
     * Specifies the sample radius used to render the receiver’s shadow. Default value is 3.0. Animatable.
     */
    @Generated
    @Selector("setShadowRadius:")
    public native void setShadowRadius(@NFloat double value);

    /**
     * [@property] shadowSampleCount
     * 
     * Specifies the number of sample per fragment to compute the shadow map. Defaults to 0.
     * 
     * On macOS 10.11 or earlier, the shadowSampleCount defaults to 16. On iOS 9 or earlier it defaults to 1.0.
     * On macOS 10.12, iOS 10 and greater, when the shadowSampleCount is set to 0, a default sample count is chosen
     * depending on the platform.
     */
    @Generated
    @Selector("setShadowSampleCount:")
    public native void setShadowSampleCount(@NUInt long value);

    @Deprecated
    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, @NotNull String key);

    /**
     * [@property] spotInnerAngle
     * 
     * The angle in degrees between the spot direction and the lit element below which the lighting is at full strength.
     * Animatable. Defaults to 0.
     */
    @Generated
    @Selector("setSpotInnerAngle:")
    public native void setSpotInnerAngle(@NFloat double value);

    /**
     * [@property] spotOuterAngle
     * 
     * The angle in degrees between the spot direction and the lit element after which the lighting is at zero strength.
     * Animatable. Defaults to 45 degrees.
     */
    @Generated
    @Selector("setSpotOuterAngle:")
    public native void setSpotOuterAngle(@NFloat double value);

    @Generated
    @Selector("setTechnique:")
    public native void setTechnique(@Nullable SCNTechnique value);

    /**
     * [@property] temperature
     * 
     * Specifies the receiver's temperature.
     * 
     * This specifies the temperature of the light in Kelvin. The renderer multiplies the light's color by the color
     * derived from the light's temperature. Defaults to 6500 (pure white). Animatable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTemperature:")
    public native void setTemperature(@NFloat double value);

    /**
     * [@property] type
     * 
     * Specifies the receiver's type.
     * 
     * Defaults to SCNLightTypeOmni on iOS 8 and later, and on macOS 10.10 and later (otherwise defaults to
     * SCNLightTypeAmbient).
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NotNull String value);

    /**
     * [@property] zFar
     * 
     * Specifies the maximal distance between the light and a visible surface to cast shadow on. If a surface is further
     * from the light than this maximal distance, then the surface won't be shadowed. Animatable. Defaults to 100.
     */
    @Generated
    @Selector("setZFar:")
    public native void setZFar(@NFloat double value);

    /**
     * [@property] zNear
     * 
     * Specifies the minimal distance between the light and the surface to cast shadow on. If a surface is closer to the
     * light than this minimal distance, then the surface won't be shadowed. The near value must be different than zero.
     * Animatable. Defaults to 1.
     */
    @Generated
    @Selector("setZNear:")
    public native void setZNear(@NFloat double value);

    /**
     * [@property] shadowBias
     * 
     * Specifies the correction to apply to the shadow map to correct acne artefacts. It is multiplied by an
     * implementation-specific value to create a constant depth offset. Defaults to 1.0
     */
    @Generated
    @Selector("shadowBias")
    @NFloat
    public native double shadowBias();

    /**
     * [@property] shadowColor
     * 
     * Specifies the color (CGColorRef or NSColor) of the shadow casted by the receiver. Defaults to black. Animatable.
     * 
     * On iOS 9 or earlier and macOS 10.11 or earlier, this defaults to black 50% transparent.
     */
    @NotNull
    @Generated
    @Selector("shadowColor")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object shadowColor();

    /**
     * [@property] shadowMapSize
     * 
     * Specifies the size of the shadow map.
     * 
     * The larger the shadow map is the more precise the shadows are but the slower the computation is. If set to {0,0}
     * the size of the shadow map is automatically chosen. Defaults to {0,0}.
     */
    @Generated
    @Selector("shadowMapSize")
    @ByValue
    public native CGSize shadowMapSize();

    /**
     * [@property] shadowMode
     * 
     * Specified the mode to use to cast shadows. See above for the available modes and their description. Defaults to
     * SCNShadowModeForward.
     */
    @Generated
    @Selector("shadowMode")
    @NInt
    public native long shadowMode();

    /**
     * [@property] shadowRadius
     * 
     * Specifies the sample radius used to render the receiver’s shadow. Default value is 3.0. Animatable.
     */
    @Generated
    @Selector("shadowRadius")
    @NFloat
    public native double shadowRadius();

    /**
     * [@property] shadowSampleCount
     * 
     * Specifies the number of sample per fragment to compute the shadow map. Defaults to 0.
     * 
     * On macOS 10.11 or earlier, the shadowSampleCount defaults to 16. On iOS 9 or earlier it defaults to 1.0.
     * On macOS 10.12, iOS 10 and greater, when the shadowSampleCount is set to 0, a default sample count is chosen
     * depending on the platform.
     */
    @Generated
    @Selector("shadowSampleCount")
    @NUInt
    public native long shadowSampleCount();

    /**
     * [@property] spotInnerAngle
     * 
     * The angle in degrees between the spot direction and the lit element below which the lighting is at full strength.
     * Animatable. Defaults to 0.
     */
    @Generated
    @Selector("spotInnerAngle")
    @NFloat
    public native double spotInnerAngle();

    /**
     * [@property] spotOuterAngle
     * 
     * The angle in degrees between the spot direction and the lit element after which the lighting is at zero strength.
     * Animatable. Defaults to 45 degrees.
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

    @Nullable
    @Generated
    @Selector("technique")
    public native SCNTechnique technique();

    /**
     * [@property] temperature
     * 
     * Specifies the receiver's temperature.
     * 
     * This specifies the temperature of the light in Kelvin. The renderer multiplies the light's color by the color
     * derived from the light's temperature. Defaults to 6500 (pure white). Animatable.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("temperature")
    @NFloat
    public native double temperature();

    /**
     * [@property] type
     * 
     * Specifies the receiver's type.
     * 
     * Defaults to SCNLightTypeOmni on iOS 8 and later, and on macOS 10.10 and later (otherwise defaults to
     * SCNLightTypeAmbient).
     */
    @NotNull
    @Generated
    @Selector("type")
    public native String type();

    /**
     * [@property] zFar
     * 
     * Specifies the maximal distance between the light and a visible surface to cast shadow on. If a surface is further
     * from the light than this maximal distance, then the surface won't be shadowed. Animatable. Defaults to 100.
     */
    @Generated
    @Selector("zFar")
    @NFloat
    public native double zFar();

    /**
     * [@property] zNear
     * 
     * Specifies the minimal distance between the light and the surface to cast shadow on. If a surface is closer to the
     * light than this minimal distance, then the surface won't be shadowed. The near value must be different than zero.
     * Animatable. Defaults to 1.
     */
    @Generated
    @Selector("zNear")
    @NFloat
    public native double zNear();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(@NotNull SCNAnimationPlayer player, @Nullable String key);

    @Nullable
    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(@NotNull String key);

    /**
     * [@property] automaticallyAdjustsShadowProjection
     * 
     * Specifies if the shadow map projection should be done automatically or manually by the user. Defaults to YES.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("automaticallyAdjustsShadowProjection")
    public native boolean automaticallyAdjustsShadowProjection();

    /**
     * [@property] forcesBackFaceCasters
     * 
     * Render only back faces of the shadow caster when enabled. Defaults to NO.
     * This is a behavior change from previous releases.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("forcesBackFaceCasters")
    public native boolean forcesBackFaceCasters();

    /**
     * [@property] maximumShadowDistance
     * 
     * Specifies the maximum distance from the viewpoint from which the shadows for the receiver light won't be
     * computed. Defaults to 100.0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maximumShadowDistance")
    @NFloat
    public native double maximumShadowDistance();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(@NotNull String key, @NFloat double duration);

    /**
     * [@property] sampleDistributedShadowMaps
     * 
     * Use the sample distribution of the main rendering to better fit the shadow frusta. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("sampleDistributedShadowMaps")
    public native boolean sampleDistributedShadowMaps();

    /**
     * [@property] automaticallyAdjustsShadowProjection
     * 
     * Specifies if the shadow map projection should be done automatically or manually by the user. Defaults to YES.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setAutomaticallyAdjustsShadowProjection:")
    public native void setAutomaticallyAdjustsShadowProjection(boolean value);

    /**
     * [@property] forcesBackFaceCasters
     * 
     * Render only back faces of the shadow caster when enabled. Defaults to NO.
     * This is a behavior change from previous releases.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setForcesBackFaceCasters:")
    public native void setForcesBackFaceCasters(boolean value);

    /**
     * [@property] maximumShadowDistance
     * 
     * Specifies the maximum distance from the viewpoint from which the shadows for the receiver light won't be
     * computed. Defaults to 100.0.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setMaximumShadowDistance:")
    public native void setMaximumShadowDistance(@NFloat double value);

    /**
     * [@property] sampleDistributedShadowMaps
     * 
     * Use the sample distribution of the main rendering to better fit the shadow frusta. Defaults to NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setSampleDistributedShadowMaps:")
    public native void setSampleDistributedShadowMaps(boolean value);

    /**
     * [@property] shadowCascadeCount
     * 
     * Specifies the number of distinct shadow maps that will be computed for the receiver light. Defaults to 1. Maximum
     * is 4.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setShadowCascadeCount:")
    public native void setShadowCascadeCount(@NUInt long value);

    /**
     * [@property] shadowCascadeSplittingFactor
     * 
     * Specifies a factor to interpolate between linear splitting (0) and logarithmic splitting (1). Defaults to 0.15.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setShadowCascadeSplittingFactor:")
    public native void setShadowCascadeSplittingFactor(@NFloat double value);

    /**
     * [@property] shadowCascadeCount
     * 
     * Specifies the number of distinct shadow maps that will be computed for the receiver light. Defaults to 1. Maximum
     * is 4.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("shadowCascadeCount")
    @NUInt
    public native long shadowCascadeCount();

    /**
     * [@property] shadowCascadeSplittingFactor
     * 
     * Specifies a factor to interpolate between linear splitting (0) and logarithmic splitting (1). Defaults to 0.15.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("shadowCascadeSplittingFactor")
    @NFloat
    public native double shadowCascadeSplittingFactor();

    /**
     * [@property] sphericalHarmonicsCoefficients
     * 
     * The receiver's spherical harmonics coefficients.
     * 
     * Currently spherical harmonics are only supported by light probes (SCNLightTypeProbe). The data is an array of 27
     * 32-bit floating-point values, containing three non-interleaved data sets corresponding to the red, green, and
     * blue sets of coefficients.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("sphericalHarmonicsCoefficients")
    public native NSData sphericalHarmonicsCoefficients();

    /**
     * [@property] areaPolygonVertices
     * 
     * Determines the shape of light of an area light of type SCNLightAreaTypePolygon. Defaults nil.
     * 
     * An array of CGPoint values corresponding to the coordinates of the polygon's vertices in the XY plane.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("areaPolygonVertices")
    public native NSArray<? extends NSValue> areaPolygonVertices();

    /**
     * [@property] areaType
     * 
     * Determines the shape of a light of type SCNLightTypeArea. Defaults to SCNLightAreaTypeRectangle.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("areaType")
    @NInt
    public native long areaType();

    /**
     * [@property] doubleSided
     * 
     * Determines whether a light of type SCNLightTypeArea is double-sided. Defaults NO.
     * 
     * Area lights of type SCNLightAreaTypeRectangle or SCNLightAreaTypePolygon emit light along the -Z axis. When set
     * to YES, they also emit light along the +Z axis.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("doubleSided")
    public native boolean doubleSided();

    /**
     * [@property] drawsArea
     * 
     * Determines whether the shape of a light of type SCNLightTypeArea is drawn in the scene. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("drawsArea")
    public native boolean drawsArea();

    /**
     * Whether parallax correction is enabled for the reflection probe. Defaults to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("parallaxCorrectionEnabled")
    public native boolean parallaxCorrectionEnabled();

    /**
     * Only applies to a probe of type SCNLightProbeTypeRadiance.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("probeEnvironment")
    public native SCNMaterialProperty probeEnvironment();

    /**
     * Type of the probe. Defaults to SCNLightProbeTypeIrradiance.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("probeType")
    @NInt
    public native long probeType();

    /**
     * Update type of the probe. Defaults to SCNLightProbeUpdateTypeNever.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("probeUpdateType")
    @NInt
    public native long probeUpdateType();

    /**
     * [@property] areaPolygonVertices
     * 
     * Determines the shape of light of an area light of type SCNLightAreaTypePolygon. Defaults nil.
     * 
     * An array of CGPoint values corresponding to the coordinates of the polygon's vertices in the XY plane.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAreaPolygonVertices:")
    public native void setAreaPolygonVertices(@Nullable NSArray<? extends NSValue> value);

    /**
     * [@property] areaType
     * 
     * Determines the shape of a light of type SCNLightTypeArea. Defaults to SCNLightAreaTypeRectangle.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setAreaType:")
    public native void setAreaType(@NInt long value);

    /**
     * [@property] doubleSided
     * 
     * Determines whether a light of type SCNLightTypeArea is double-sided. Defaults NO.
     * 
     * Area lights of type SCNLightAreaTypeRectangle or SCNLightAreaTypePolygon emit light along the -Z axis. When set
     * to YES, they also emit light along the +Z axis.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    /**
     * [@property] drawsArea
     * 
     * Determines whether the shape of a light of type SCNLightTypeArea is drawn in the scene. Defaults to YES.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setDrawsArea:")
    public native void setDrawsArea(boolean value);

    /**
     * Whether parallax correction is enabled for the reflection probe. Defaults to NO.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setParallaxCorrectionEnabled:")
    public native void setParallaxCorrectionEnabled(boolean value);

    /**
     * Type of the probe. Defaults to SCNLightProbeTypeIrradiance.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setProbeType:")
    public native void setProbeType(@NInt long value);

    /**
     * Update type of the probe. Defaults to SCNLightProbeUpdateTypeNever.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setProbeUpdateType:")
    public native void setProbeUpdateType(@NInt long value);

    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    public native void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

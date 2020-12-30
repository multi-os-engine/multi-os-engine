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
import apple.modelio.MDLMaterial;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNAnimation;
import apple.scenekit.protocol.SCNShadable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNMaterial
 * 
 * A SCNMaterial determines how a geometry is rendered. It encapsulates the colors and textures that define the appearance of 3d geometries.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNMaterial extends NSObject implements SCNAnimatable, SCNShadable, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNMaterial(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNMaterial alloc();

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
     * material
     * 
     * Creates and initialize a material instance.
     */
    @Generated
    @Selector("material")
    public static native SCNMaterial material();

    @Generated
    @Selector("materialWithMDLMaterial:")
    public static native SCNMaterial materialWithMDLMaterial(MDLMaterial mdlMaterial);

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
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    /**
     * [@property] ambient
     * 
     * Specifies the receiver's ambient property.
     * 
     * The ambient property specifies the amount of ambient light to reflect. This property has no visual impact on scenes that have no ambient light. Setting the ambient has no effect if locksAmbientWithDiffuse is set to YES.
     */
    @Generated
    @Selector("ambient")
    public native SCNMaterialProperty ambient();

    /**
     * [@property] ambientOcclusion
     * 
     * The ambientOcclusion property specifies the ambient occlusion of the surface. The ambient occlusion is multiplied with the ambient light, then the result is added to the lighting contribution. This property has no visual impact on scenes that have no ambient light. When an ambient occlusion map is set, the ambient property is ignored.
     */
    @Generated
    @Selector("ambientOcclusion")
    public native SCNMaterialProperty ambientOcclusion();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    /**
     * [@property] blendMode
     * 
     * Specifies the receiver's blend mode. Defaults to SCNBlendModeAlpha.
     */
    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] cullMode
     * 
     * Determines the culling mode of the receiver. Defaults to SCNCullBack. Animatable.
     */
    @Generated
    @Selector("cullMode")
    @NInt
    public native long cullMode();

    /**
     * [@property] diffuse
     * 
     * Specifies the receiver's diffuse property.
     * 
     * The diffuse property specifies the amount of light diffusely reflected from the surface. The diffuse light is reflected equally in all directions and is therefore independent of the point of view.
     */
    @Generated
    @Selector("diffuse")
    public native SCNMaterialProperty diffuse();

    /**
     * [@property] emission
     * 
     * The emission property specifies the amount of light the material emits. This emission does not light up other surfaces in the scene.
     */
    @Generated
    @Selector("emission")
    public native SCNMaterialProperty emission();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] fresnelExponent
     * 
     * Specifies the receiver's fresnel exponent value. Defaults to 0.0. Animatable.
     * 
     * The effect of the reflectivity property is modulated by this property. The fresnelExponent changes the exponent of the reflectance. The bigger the exponent, the more concentrated the reflection is around the edges.
     */
    @Generated
    @Selector("fresnelExponent")
    @NFloat
    public native double fresnelExponent();

    @Generated
    @IsOptional
    @Selector("handleBindingOfSymbol:usingBlock:")
    public native void handleBindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleBindingOfSymbolUsingBlock") SCNShadable.Block_handleBindingOfSymbolUsingBlock block);

    @Generated
    @IsOptional
    @Selector("handleUnbindingOfSymbol:usingBlock:")
    public native void handleUnbindingOfSymbolUsingBlock(String symbol,
            @ObjCBlock(name = "call_handleUnbindingOfSymbolUsingBlock") SCNShadable.Block_handleUnbindingOfSymbolUsingBlock block);

    @Generated
    @Selector("init")
    public native SCNMaterial init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNMaterial initWithCoder(NSCoder coder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * [@property] doubleSided
     * 
     * Determines whether the receiver is double sided. Defaults to NO. Animatable.
     */
    @Generated
    @Selector("isDoubleSided")
    public native boolean isDoubleSided();

    /**
     * [@property] doubleSided
     * 
     * Determines whether the receiver is double sided. Defaults to NO. Animatable.
     */
    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    /**
     * [@property] litPerPixel
     * 
     * Determines whether the receiver is lit per pixel. Defaults to YES. Animatable.
     */
    @Generated
    @Selector("isLitPerPixel")
    public native boolean isLitPerPixel();

    /**
     * [@property] litPerPixel
     * 
     * Determines whether the receiver is lit per pixel. Defaults to YES. Animatable.
     */
    @Generated
    @Selector("setLitPerPixel:")
    public native void setLitPerPixel(boolean value);

    /**
     * [@property] lightingModelName
     * 
     * Determines the receiver's lighting model. See above for the list of lighting models. Defaults to SCNLightingModelBlinn.
     */
    @Generated
    @Selector("lightingModelName")
    public native String lightingModelName();

    /**
     * [@property] locksAmbientWithDiffuse
     * 
     * Makes the ambient property automatically match the diffuse property. Defaults to YES. Animatable.
     */
    @Generated
    @Selector("locksAmbientWithDiffuse")
    public native boolean locksAmbientWithDiffuse();

    /**
     * [@property] metalness
     * 
     * The metalness property specifies how metallic the material's surface appears. Lower values (darker colors) cause the material to appear more like a dielectric surface. Higher values (brighter colors) cause the surface to appear more metallic. This property is only used when 'lightingModelName' is 'SCNLightingModelPhysicallyBased'.
     */
    @Generated
    @Selector("metalness")
    public native SCNMaterialProperty metalness();

    /**
     * [@property] multiply
     * 
     * The multiply property specifies a color or an image used to multiply the output fragments with. The computed fragments are multiplied with the multiply value to produce the final fragments. This property may be used for shadow maps, to fade out or tint 3d objects.
     */
    @Generated
    @Selector("multiply")
    public native SCNMaterialProperty multiply();

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] normal
     * 
     * The normal property specifies the surface orientation.
     * 
     * When an image is set on the normal property the material is automatically lit per pixel. Setting a color has no effect.
     */
    @Generated
    @Selector("normal")
    public native SCNMaterialProperty normal();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @IsOptional
    @Selector("program")
    public native SCNProgram program();

    /**
     * [@property] readsFromDepthBuffer
     * 
     * Determines whether the receiver reads from the depth buffer when rendered. Defaults to YES.
     */
    @Generated
    @Selector("readsFromDepthBuffer")
    public native boolean readsFromDepthBuffer();

    /**
     * [@property] reflective
     * 
     * The reflective property specifies the reflectivity of the surface. The surface will not actually reflect other objects in the scene. This property may be used as a sphere mapping to reflect a precomputed environment.
     */
    @Generated
    @Selector("reflective")
    public native SCNMaterialProperty reflective();

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
     * [@property] roughness
     * 
     * The roughness property specifies the apparent smoothness of the surface. Lower values (darker colors) cause the material to appear shiny, with well-defined specular highlights. Higher values (brighter colors) cause specular highlights to spread out and the diffuse property of the material to become more retroreflective. This property is only used when 'lightingModelName' is 'SCNLightingModelPhysicallyBased'.
     */
    @Generated
    @Selector("roughness")
    public native SCNMaterialProperty roughness();

    /**
     * [@property] selfIllumination
     * 
     * The selfIllumination property specifies a texture or a color that is added to the lighting contribution of the surface. When a selfIllumination is set, the emission property is ignored.
     */
    @Generated
    @Selector("selfIllumination")
    public native SCNMaterialProperty selfIllumination();

    /**
     * [@property] blendMode
     * 
     * Specifies the receiver's blend mode. Defaults to SCNBlendModeAlpha.
     */
    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    /**
     * [@property] cullMode
     * 
     * Determines the culling mode of the receiver. Defaults to SCNCullBack. Animatable.
     */
    @Generated
    @Selector("setCullMode:")
    public native void setCullMode(@NInt long value);

    /**
     * [@property] fresnelExponent
     * 
     * Specifies the receiver's fresnel exponent value. Defaults to 0.0. Animatable.
     * 
     * The effect of the reflectivity property is modulated by this property. The fresnelExponent changes the exponent of the reflectance. The bigger the exponent, the more concentrated the reflection is around the edges.
     */
    @Generated
    @Selector("setFresnelExponent:")
    public native void setFresnelExponent(@NFloat double value);

    /**
     * [@property] lightingModelName
     * 
     * Determines the receiver's lighting model. See above for the list of lighting models. Defaults to SCNLightingModelBlinn.
     */
    @Generated
    @Selector("setLightingModelName:")
    public native void setLightingModelName(String value);

    /**
     * [@property] locksAmbientWithDiffuse
     * 
     * Makes the ambient property automatically match the diffuse property. Defaults to YES. Animatable.
     */
    @Generated
    @Selector("setLocksAmbientWithDiffuse:")
    public native void setLocksAmbientWithDiffuse(boolean value);

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @IsOptional
    @Selector("setProgram:")
    public native void setProgram(SCNProgram value);

    /**
     * [@property] readsFromDepthBuffer
     * 
     * Determines whether the receiver reads from the depth buffer when rendered. Defaults to YES.
     */
    @Generated
    @Selector("setReadsFromDepthBuffer:")
    public native void setReadsFromDepthBuffer(boolean value);

    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    public native void setShaderModifiers(NSDictionary<String, String> value);

    /**
     * [@property] shininess
     * 
     * Specifies the receiver's shininess value. Defaults to 1.0. Animatable.
     */
    @Generated
    @Selector("setShininess:")
    public native void setShininess(@NFloat double value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * [@property] transparency
     * 
     * Specifies the receiver's transparency value. Defaults to 1.0. Animatable.
     * 
     * The color of the transparent property is multiplied by this property. The result is then used to produce the final transparency according to the rule defined by the transparencyMode property.
     */
    @Generated
    @Selector("setTransparency:")
    public native void setTransparency(@NFloat double value);

    /**
     * [@property] transparencyMode
     * 
     * Determines the transparency mode of the receiver. See above for the transparency modes. Defaults to SCNTransparencyModeDefault.
     */
    @Generated
    @Selector("setTransparencyMode:")
    public native void setTransparencyMode(@NInt long value);

    /**
     * [@property] writeToDepthBuffer
     * 
     * Determines whether the receiver writes to the depth buffer when rendered. Defaults to YES.
     */
    @Generated
    @Selector("setWritesToDepthBuffer:")
    public native void setWritesToDepthBuffer(boolean value);

    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    public native NSDictionary<String, String> shaderModifiers();

    /**
     * [@property] shininess
     * 
     * Specifies the receiver's shininess value. Defaults to 1.0. Animatable.
     */
    @Generated
    @Selector("shininess")
    @NFloat
    public native double shininess();

    /**
     * [@property] specular
     * 
     * Specifies the receiver's specular property.
     * 
     * The specular property specifies the amount of light to reflect in a mirror-like manner. The specular intensity increases when the point of view lines up with the direction of the reflected light.
     */
    @Generated
    @Selector("specular")
    public native SCNMaterialProperty specular();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] transparency
     * 
     * Specifies the receiver's transparency value. Defaults to 1.0. Animatable.
     * 
     * The color of the transparent property is multiplied by this property. The result is then used to produce the final transparency according to the rule defined by the transparencyMode property.
     */
    @Generated
    @Selector("transparency")
    @NFloat
    public native double transparency();

    /**
     * [@property] transparencyMode
     * 
     * Determines the transparency mode of the receiver. See above for the transparency modes. Defaults to SCNTransparencyModeDefault.
     */
    @Generated
    @Selector("transparencyMode")
    @NInt
    public native long transparencyMode();

    /**
     * [@property] transparent
     * 
     * The transparent property specifies the transparent areas of the material.
     */
    @Generated
    @Selector("transparent")
    public native SCNMaterialProperty transparent();

    /**
     * [@property] writeToDepthBuffer
     * 
     * Determines whether the receiver writes to the depth buffer when rendered. Defaults to YES.
     */
    @Generated
    @Selector("writesToDepthBuffer")
    public native boolean writesToDepthBuffer();

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    /**
     * Determines whether the receiver writes to the color buffer when rendered. Defaults to SCNColorMaskAll.
     */
    @Generated
    @Selector("colorBufferWriteMask")
    @NInt
    public native long colorBufferWriteMask();

    /**
     * [@property] displacement
     * 
     * The displacement property specifies how vertex are translated in tangent space.
     * 
     * Pass a grayscale image for a simple 'elevation' or rgb image for a vector displacement.
     */
    @Generated
    @Selector("displacement")
    public native SCNMaterialProperty displacement();

    /**
     * [@property] fillMode
     * 
     * Determines of to how to rasterize the receiver's primitives. Defaults to SCNFillModeFill.
     */
    @Generated
    @Selector("fillMode")
    @NUInt
    public native long fillMode();

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * Determines whether the receiver writes to the color buffer when rendered. Defaults to SCNColorMaskAll.
     */
    @Generated
    @Selector("setColorBufferWriteMask:")
    public native void setColorBufferWriteMask(@NInt long value);

    /**
     * [@property] fillMode
     * 
     * Determines of to how to rasterize the receiver's primitives. Defaults to SCNFillModeFill.
     */
    @Generated
    @Selector("setFillMode:")
    public native void setFillMode(@NUInt long value);

    /**
     * [@property] clearCoat
     * 
     * The clearCoat property specifies color and intensity of the coat layer.
     */
    @Generated
    @Selector("clearCoat")
    public native SCNMaterialProperty clearCoat();

    /**
     * [@property] clearCoatNormal
     * 
     * The clearCoatNormal property specifies color and intensity of the optional coat normal map.
     */
    @Generated
    @Selector("clearCoatNormal")
    public native SCNMaterialProperty clearCoatNormal();

    /**
     * [@property] clearCoatRoughness
     * 
     * The clearCoat property specifies color and intensity of the coat roughness.
     */
    @Generated
    @Selector("clearCoatRoughness")
    public native SCNMaterialProperty clearCoatRoughness();
}

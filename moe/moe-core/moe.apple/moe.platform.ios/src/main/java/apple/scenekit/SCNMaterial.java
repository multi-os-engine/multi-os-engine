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
    public native void addAnimationForKey(CAAnimation animation, String key);

    @Generated
    @Selector("ambient")
    public native SCNMaterialProperty ambient();

    @Generated
    @Selector("ambientOcclusion")
    public native SCNMaterialProperty ambientOcclusion();

    @Generated
    @Selector("animationForKey:")
    public native CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    public native NSArray<String> animationKeys();

    @Generated
    @Selector("blendMode")
    @NInt
    public native long blendMode();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("cullMode")
    @NInt
    public native long cullMode();

    @Generated
    @Selector("diffuse")
    public native SCNMaterialProperty diffuse();

    @Generated
    @Selector("emission")
    public native SCNMaterialProperty emission();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

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
    public native SCNMaterial initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    @Generated
    @Selector("isDoubleSided")
    public native boolean isDoubleSided();

    @Generated
    @Selector("setDoubleSided:")
    public native void setDoubleSided(boolean value);

    @Generated
    @Selector("isLitPerPixel")
    public native boolean isLitPerPixel();

    @Generated
    @Selector("setLitPerPixel:")
    public native void setLitPerPixel(boolean value);

    @Generated
    @Selector("lightingModelName")
    public native String lightingModelName();

    @Generated
    @Selector("locksAmbientWithDiffuse")
    public native boolean locksAmbientWithDiffuse();

    @Generated
    @Selector("metalness")
    public native SCNMaterialProperty metalness();

    @Generated
    @Selector("multiply")
    public native SCNMaterialProperty multiply();

    @Generated
    @Selector("name")
    public native String name();

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

    @Generated
    @Selector("readsFromDepthBuffer")
    public native boolean readsFromDepthBuffer();

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

    @Generated
    @Selector("roughness")
    public native SCNMaterialProperty roughness();

    @Generated
    @Selector("selfIllumination")
    public native SCNMaterialProperty selfIllumination();

    @Generated
    @Selector("setBlendMode:")
    public native void setBlendMode(@NInt long value);

    @Generated
    @Selector("setCullMode:")
    public native void setCullMode(@NInt long value);

    @Generated
    @Selector("setFresnelExponent:")
    public native void setFresnelExponent(@NFloat double value);

    @Generated
    @Selector("setLightingModelName:")
    public native void setLightingModelName(String value);

    @Generated
    @Selector("setLocksAmbientWithDiffuse:")
    public native void setLocksAmbientWithDiffuse(boolean value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @IsOptional
    @Selector("setProgram:")
    public native void setProgram(SCNProgram value);

    @Generated
    @Selector("setReadsFromDepthBuffer:")
    public native void setReadsFromDepthBuffer(boolean value);

    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    public native void setShaderModifiers(NSDictionary<String, String> value);

    @Generated
    @Selector("setShininess:")
    public native void setShininess(@NFloat double value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setTransparency:")
    public native void setTransparency(@NFloat double value);

    @Generated
    @Selector("setTransparencyMode:")
    public native void setTransparencyMode(@NInt long value);

    @Generated
    @Selector("setWritesToDepthBuffer:")
    public native void setWritesToDepthBuffer(boolean value);

    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    public native NSDictionary<String, String> shaderModifiers();

    @Generated
    @Selector("shininess")
    @NFloat
    public native double shininess();

    @Generated
    @Selector("specular")
    public native SCNMaterialProperty specular();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("transparency")
    @NFloat
    public native double transparency();

    @Generated
    @Selector("transparencyMode")
    @NInt
    public native long transparencyMode();

    @Generated
    @Selector("transparent")
    public native SCNMaterialProperty transparent();

    @Generated
    @Selector("writesToDepthBuffer")
    public native boolean writesToDepthBuffer();
}

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
import apple.modelio.MDLMesh;
import apple.quartzcore.CAAnimation;
import apple.scenekit.protocol.SCNAnimatable;
import apple.scenekit.protocol.SCNBoundingVolume;
import apple.scenekit.protocol.SCNShadable;
import apple.scenekit.struct.SCNVector3;
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
import org.moe.natj.general.ptr.NFloatPtr;
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
public class SCNGeometry extends NSObject
        implements SCNAnimatable, SCNBoundingVolume, SCNShadable, NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNGeometry(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNGeometry alloc();

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
    @Selector("geometry")
    public static native SCNGeometry geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNGeometry geometryWithMDLMesh(MDLMesh mdlMesh);

    @Generated
    @Selector("geometryWithSources:elements:")
    public static native SCNGeometry geometryWithSourcesElements(NSArray<? extends SCNGeometrySource> sources,
            NSArray<? extends SCNGeometryElement> elements);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("edgeCreasesElement")
    public native SCNGeometryElement edgeCreasesElement();

    @Generated
    @Selector("edgeCreasesSource")
    public native SCNGeometrySource edgeCreasesSource();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("firstMaterial")
    public native SCNMaterial firstMaterial();

    @Generated
    @Selector("geometryElementAtIndex:")
    public native SCNGeometryElement geometryElementAtIndex(@NInt long elementIndex);

    @Generated
    @Selector("geometryElementCount")
    @NInt
    public native long geometryElementCount();

    @Generated
    @Selector("geometryElements")
    public native NSArray<? extends SCNGeometryElement> geometryElements();

    @Generated
    @Selector("geometrySources")
    public native NSArray<? extends SCNGeometrySource> geometrySources();

    @Generated
    @Selector("geometrySourcesForSemantic:")
    public native NSArray<? extends SCNGeometrySource> geometrySourcesForSemantic(String semantic);

    @Generated
    @Selector("getBoundingBoxMin:max:")
    public native boolean getBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    @Generated
    @Selector("getBoundingSphereCenter:radius:")
    public native boolean getBoundingSphereCenterRadius(SCNVector3 center, NFloatPtr radius);

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
    public native SCNGeometry init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometry initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("insertMaterial:atIndex:")
    public native void insertMaterialAtIndex(SCNMaterial material, @NUInt long index);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    @Generated
    @Selector("levelsOfDetail")
    public native NSArray<? extends SCNLevelOfDetail> levelsOfDetail();

    @Generated
    @Selector("materialWithName:")
    public native SCNMaterial materialWithName(String name);

    @Generated
    @Selector("materials")
    public native NSArray<? extends SCNMaterial> materials();

    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("pauseAnimationForKey:")
    public native void pauseAnimationForKey(String key);

    @Generated
    @IsOptional
    @Selector("program")
    public native SCNProgram program();

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
    @Selector("removeMaterialAtIndex:")
    public native void removeMaterialAtIndex(@NUInt long index);

    @Generated
    @Selector("replaceMaterialAtIndex:withMaterial:")
    public native void replaceMaterialAtIndexWithMaterial(@NUInt long index, SCNMaterial material);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    @Generated
    @Selector("setBoundingBoxMin:max:")
    public native void setBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    @Generated
    @Selector("setEdgeCreasesElement:")
    public native void setEdgeCreasesElement(SCNGeometryElement value);

    @Generated
    @Selector("setEdgeCreasesSource:")
    public native void setEdgeCreasesSource(SCNGeometrySource value);

    @Generated
    @Selector("setFirstMaterial:")
    public native void setFirstMaterial(SCNMaterial value);

    @Generated
    @Selector("setLevelsOfDetail:")
    public native void setLevelsOfDetail(NSArray<? extends SCNLevelOfDetail> value);

    @Generated
    @Selector("setMaterials:")
    public native void setMaterials(NSArray<? extends SCNMaterial> value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    @Generated
    @IsOptional
    @Selector("setProgram:")
    public native void setProgram(SCNProgram value);

    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    public native void setShaderModifiers(NSDictionary<String, String> value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("setSubdivisionLevel:")
    public native void setSubdivisionLevel(@NUInt long value);

    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    public native NSDictionary<String, String> shaderModifiers();

    @Generated
    @Selector("subdivisionLevel")
    @NUInt
    public native long subdivisionLevel();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    public native void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    public native SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    public native void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("setTessellator:")
    public native void setTessellator(SCNGeometryTessellator value);

    @Generated
    @Selector("setWantsAdaptiveSubdivision:")
    public native void setWantsAdaptiveSubdivision(boolean value);

    @Generated
    @Selector("tessellator")
    public native SCNGeometryTessellator tessellator();

    @Generated
    @Selector("wantsAdaptiveSubdivision")
    public native boolean wantsAdaptiveSubdivision();
}

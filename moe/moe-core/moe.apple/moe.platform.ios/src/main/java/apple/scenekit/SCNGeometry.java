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
import apple.scenekit.protocol.SCNAnimation;
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

/**
 * SCNGeometry
 * 
 * SCNGeometry is an abstract class that represents the geometry that can be attached to a SCNNode.
 */
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

    /**
     * geometry
     * 
     * Creates and returns an empty geometry object.
     * 
     * An empty geometry may be used as the lowest level of detail of a geometry.
     */
    @Generated
    @Selector("geometry")
    public static native SCNGeometry geometry();

    @Generated
    @Selector("geometryWithMDLMesh:")
    public static native SCNGeometry geometryWithMDLMesh(MDLMesh mdlMesh);

    /**
     * geometryWithSources:elements:
     * 
     * Creates and returns a new geometry built from geometry sources and geometry elements.
     * 
     * A geometry is made of geometry sources (at least vertices) and at least one geometry element. Multiple sources for texture coordinates are accepted. In that case the mappingChannel is implicitly set based on the order of the texture sources, starting at index 0.
     * 
     * @param sources An array of geometry sources. If several geometry sources have the same semantic, only the first one is taken into account.
     * @param elements An array of geometry elements. The sort order in the array determines the mapping between materials and geometry elements.
     */
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
    public native void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

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

    /**
     * [@property] edgeCreasesElement
     * 
     * Specifies the edges creases that control the subdivision. Defaults to nil.
     * 
     * The primitive type of this geometry element must be SCNGeometryPrimitiveTypeLine. See subdivisionLevel above to control the level of subdivision. See edgeCreasesSource below to specify sharpness of the creases.
     */
    @Generated
    @Selector("edgeCreasesElement")
    public native SCNGeometryElement edgeCreasesElement();

    /**
     * [@property] edgeCreasesSource
     * 
     * Specifies the crease value of the edges specified by edgeCreasesElement. Defaults to nil.
     * 
     * The semantic of this geometry source must be "SCNGeometrySourceSemanticEdgeCrease". The creases values are floating values between 0 and 10, where 0 means smooth and 10 means infinitely sharp. See subdivisionLevel above to control the level of subdivision. See edgeCreasesElement above to specify edges for edge creases.
     */
    @Generated
    @Selector("edgeCreasesSource")
    public native SCNGeometrySource edgeCreasesSource();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] firstMaterial
     * 
     * Determines the first material of the geometry. Returns nil if the geometry has no material.
     * 
     * This method is here for convenience. It is equivalent to the first object in the "materials" array above.
     */
    @Generated
    @Selector("firstMaterial")
    public native SCNMaterial firstMaterial();

    /**
     * geometryElementAtIndex:
     * 
     * Returns the geometry element at a given index.
     * 
     * @param elementIndex The index of the geometry element.
     */
    @Generated
    @Selector("geometryElementAtIndex:")
    public native SCNGeometryElement geometryElementAtIndex(@NInt long elementIndex);

    /**
     * [@property] geometryElementCount
     * 
     * Returns the number of geometry elements owned by the geometry.
     */
    @Generated
    @Selector("geometryElementCount")
    @NInt
    public native long geometryElementCount();

    /**
     * [@property] geometryElements
     * 
     * The array of geometry elements of the receiver.
     */
    @Generated
    @Selector("geometryElements")
    public native NSArray<? extends SCNGeometryElement> geometryElements();

    /**
     * [@property] geometrySources
     * 
     * The array of geometry sources of the receiver.
     */
    @Generated
    @Selector("geometrySources")
    public native NSArray<? extends SCNGeometrySource> geometrySources();

    /**
     * geometrySourcesForSemantic:
     * 
     * Returns the geometry sources for a given semantic.
     * 
     * Returns nil if no geometry source is found for the given semantic. May return more than one source, typically for multiple texture coordinate sources.
     * 
     * @param semantic The semantic of the geometry sources that should be retrieved.
     */
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
    public native SCNGeometry initWithCoder(NSCoder coder);

    /**
     * insertMaterial:atIndex:
     * 
     * Insert a material in the materials array at the specified index.
     * 
     * @param material The material to insert.
     * @param index Index in the materials array to insert the new material.
     */
    @Generated
    @Selector("insertMaterial:atIndex:")
    public native void insertMaterialAtIndex(SCNMaterial material, @NUInt long index);

    @Generated
    @Selector("isAnimationForKeyPaused:")
    public native boolean isAnimationForKeyPaused(String key);

    /**
     * [@property] levelsOfDetail
     * 
     * Determines the receiver's levels of detail. Defaults to nil.
     */
    @Generated
    @Selector("levelsOfDetail")
    public native NSArray<? extends SCNLevelOfDetail> levelsOfDetail();

    /**
     * materialWithName:
     * 
     * Return the first material from the materials array of the receiver with the specified name.
     * 
     * @param name The name of the material to retrieve.
     */
    @Generated
    @Selector("materialWithName:")
    public native SCNMaterial materialWithName(String name);

    /**
     * [@property] materials
     * 
     * Specifies the receiver's materials array.
     * 
     * Each geometry element can be rendered using a different material. The index of the material used for a geometry element is equal to the index of that element modulo the number of materials.
     */
    @Generated
    @Selector("materials")
    public native NSArray<? extends SCNMaterial> materials();

    /**
     * [@property] name
     * 
     * Determines the name of the receiver.
     */
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

    /**
     * removeMaterialAtIndex:
     * 
     * Remove the material at the specified index from the materials array.
     * 
     * @param index The index of the material to remove from the 'materials' array.
     */
    @Generated
    @Selector("removeMaterialAtIndex:")
    public native void removeMaterialAtIndex(@NUInt long index);

    /**
     * replaceMaterialAtIndex:withMaterial:
     * 
     * Remove the material at the index 'index' from the materials array of the receiver and insert 'material' in its position.
     * 
     * @param index The index of the material to replace in the materials array.
     * @param material The new material that will replace the previous one.
     */
    @Generated
    @Selector("replaceMaterialAtIndex:withMaterial:")
    public native void replaceMaterialAtIndexWithMaterial(@NUInt long index, SCNMaterial material);

    @Generated
    @Selector("resumeAnimationForKey:")
    public native void resumeAnimationForKey(String key);

    @Generated
    @Selector("setBoundingBoxMin:max:")
    public native void setBoundingBoxMinMax(SCNVector3 min, SCNVector3 max);

    /**
     * [@property] edgeCreasesElement
     * 
     * Specifies the edges creases that control the subdivision. Defaults to nil.
     * 
     * The primitive type of this geometry element must be SCNGeometryPrimitiveTypeLine. See subdivisionLevel above to control the level of subdivision. See edgeCreasesSource below to specify sharpness of the creases.
     */
    @Generated
    @Selector("setEdgeCreasesElement:")
    public native void setEdgeCreasesElement(SCNGeometryElement value);

    /**
     * [@property] edgeCreasesSource
     * 
     * Specifies the crease value of the edges specified by edgeCreasesElement. Defaults to nil.
     * 
     * The semantic of this geometry source must be "SCNGeometrySourceSemanticEdgeCrease". The creases values are floating values between 0 and 10, where 0 means smooth and 10 means infinitely sharp. See subdivisionLevel above to control the level of subdivision. See edgeCreasesElement above to specify edges for edge creases.
     */
    @Generated
    @Selector("setEdgeCreasesSource:")
    public native void setEdgeCreasesSource(SCNGeometrySource value);

    /**
     * [@property] firstMaterial
     * 
     * Determines the first material of the geometry. Returns nil if the geometry has no material.
     * 
     * This method is here for convenience. It is equivalent to the first object in the "materials" array above.
     */
    @Generated
    @Selector("setFirstMaterial:")
    public native void setFirstMaterial(SCNMaterial value);

    /**
     * [@property] levelsOfDetail
     * 
     * Determines the receiver's levels of detail. Defaults to nil.
     */
    @Generated
    @Selector("setLevelsOfDetail:")
    public native void setLevelsOfDetail(NSArray<? extends SCNLevelOfDetail> value);

    /**
     * [@property] materials
     * 
     * Specifies the receiver's materials array.
     * 
     * Each geometry element can be rendered using a different material. The index of the material used for a geometry element is equal to the index of that element modulo the number of materials.
     */
    @Generated
    @Selector("setMaterials:")
    public native void setMaterials(NSArray<? extends SCNMaterial> value);

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

    @Generated
    @IsOptional
    @Selector("setShaderModifiers:")
    public native void setShaderModifiers(NSDictionary<String, String> value);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    public native void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * [@property] subdivisionLevel
     * 
     * Specifies the subdivision level of the receiver. Defaults to 0.
     * 
     * A subdivision level of 0 means no subdivision. When the `tessellator` property of the receiver is not nil, the refinement is done on the GPU.
     */
    @Generated
    @Selector("setSubdivisionLevel:")
    public native void setSubdivisionLevel(@NUInt long value);

    @Generated
    @IsOptional
    @Selector("shaderModifiers")
    public native NSDictionary<String, String> shaderModifiers();

    /**
     * [@property] subdivisionLevel
     * 
     * Specifies the subdivision level of the receiver. Defaults to 0.
     * 
     * A subdivision level of 0 means no subdivision. When the `tessellator` property of the receiver is not nil, the refinement is done on the GPU.
     */
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

    /**
     * [@property] wantsAdaptiveSubdivision
     * 
     * Specifies if the subdivision is adaptive or uniform. Defaults to YES.
     * 
     * Adaptive subdivision requires that the `tessellator` property of the receiver is not nil.
     */
    @Generated
    @Selector("setWantsAdaptiveSubdivision:")
    public native void setWantsAdaptiveSubdivision(boolean value);

    @Generated
    @Selector("tessellator")
    public native SCNGeometryTessellator tessellator();

    /**
     * [@property] wantsAdaptiveSubdivision
     * 
     * Specifies if the subdivision is adaptive or uniform. Defaults to YES.
     * 
     * Adaptive subdivision requires that the `tessellator` property of the receiver is not nil.
     */
    @Generated
    @Selector("wantsAdaptiveSubdivision")
    public native boolean wantsAdaptiveSubdivision();
}

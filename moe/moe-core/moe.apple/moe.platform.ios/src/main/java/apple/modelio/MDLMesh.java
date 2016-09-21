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

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBuffer;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.scenekit.SCNGeometry;
import apple.scenekit.SCNNode;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLMesh extends MDLObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLMesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLMesh alloc();

    @Generated
    @Selector("meshWithSCNGeometry:")
    public static native MDLMesh meshWithSCNGeometry(SCNGeometry scnGeometry);

    @Generated
    @Owned
    @Selector("newIcosahedronWithRadius:inwardNormals:allocator:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object newIcosahedronWithRadiusInwardNormalsAllocator(float radius, boolean inwardNormals,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    @Generated
    @Owned
    @Selector("newSubdividedMesh:submeshIndex:subdivisionLevels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object newSubdividedMeshSubmeshIndexSubdivisionLevels(MDLMesh mesh, @NUInt long submeshIndex,
            @NUInt long subdivisionLevels);

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLMesh objectWithSCNNode(SCNNode scnNode);

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
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addAttributeWithName:format:")
    public native void addAttributeWithNameFormat(String name, @NUInt long format);

    @Generated
    @Selector("addNormalsWithAttributeNamed:creaseThreshold:")
    public native void addNormalsWithAttributeNamedCreaseThreshold(String attributeName, float creaseThreshold);

    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedNormalAttributeNamedTangentAttributeNamed(
            String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);

    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedTangentAttributeNamedBitangentAttributeNamed(
            String textureCoordinateAttributeName, String tangentAttributeName, String bitangentAttributeName);

    @Generated
    @Selector("generateAmbientOcclusionTextureWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateAmbientOcclusionTextureWithQualityAttenuationFactorObjectsToConsiderVertexAttributeNamedMaterialPropertyNamed(
            float bakeQuality, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName, String materialPropertyName);

    @Generated
    @Selector("generateAmbientOcclusionVertexColorsWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColorsWithQualityAttenuationFactorObjectsToConsiderVertexAttributeNamed(
            float bakeQuality, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    @Generated
    @Selector("generateAmbientOcclusionVertexColorsWithRaysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColorsWithRaysPerSampleAttenuationFactorObjectsToConsiderVertexAttributeNamed(
            @NInt long raysPerSample, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    @Generated
    @Selector("generateLightMapTextureWithQuality:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateLightMapTextureWithQualityLightsToConsiderObjectsToConsiderVertexAttributeNamedMaterialPropertyNamed(
            float bakeQuality, NSArray<? extends MDLLight> lightsToConsider,
            NSArray<? extends MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);

    @Generated
    @Selector("generateLightMapVertexColorsWithLightsToConsider:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateLightMapVertexColorsWithLightsToConsiderObjectsToConsiderVertexAttributeNamed(
            NSArray<? extends MDLLight> lightsToConsider, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    @Generated
    @Selector("init")
    public native MDLMesh init();

    @Generated
    @Selector("initWithVertexBuffer:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBufferVertexCountDescriptorSubmeshes(
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer vertexBuffer, @NUInt long vertexCount,
            MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    @Generated
    @Selector("initWithVertexBuffers:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBuffersVertexCountDescriptorSubmeshes(NSArray<?> vertexBuffers,
            @NUInt long vertexCount, MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    @Generated
    @Selector("makeVerticesUnique")
    public native void makeVerticesUnique();

    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(MDLVertexDescriptor value);

    @Generated
    @Selector("submeshes")
    public native NSMutableArray<MDLSubmesh> submeshes();

    @Generated
    @Selector("vertexAttributeDataForAttributeNamed:")
    public native MDLVertexAttributeData vertexAttributeDataForAttributeNamed(String name);

    @Generated
    @Selector("vertexBuffers")
    public native NSArray<?> vertexBuffers();

    @Generated
    @Selector("vertexCount")
    @NUInt
    public native long vertexCount();

    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}

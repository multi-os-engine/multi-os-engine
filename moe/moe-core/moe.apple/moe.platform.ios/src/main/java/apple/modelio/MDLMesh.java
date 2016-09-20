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

    /**
     * meshWithSCNGeometry:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/clm/MDLMesh/meshWithSCNGeometry:">iOS Dev Center</a>
     */
    @Generated
    @Selector("meshWithSCNGeometry:")
    public static native MDLMesh meshWithSCNGeometry(SCNGeometry scnGeometry);

    /**
     * newIcosahedronWithRadius:inwardNormals:allocator:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/clm/MDLMesh/newIcosahedronWithRadius:inwardNormals:allocator:">iOS Dev Center</a>
     */
    @Generated
    @Owned
    @Selector("newIcosahedronWithRadius:inwardNormals:allocator:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object newIcosahedronWithRadiusInwardNormalsAllocator(float radius, boolean inwardNormals,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    /**
     * newSubdividedMesh:submeshIndex:subdivisionLevels:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/clm/MDLMesh/newSubdividedMesh:submeshIndex:subdivisionLevels:">iOS Dev Center</a>
     */
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

    /**
     * addAttributeWithName:format:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/addAttributeWithName:format:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addAttributeWithName:format:")
    public native void addAttributeWithNameFormat(String name, @NUInt long format);

    /**
     * addNormalsWithAttributeNamed:creaseThreshold:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/addNormalsWithAttributeNamed:creaseThreshold:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addNormalsWithAttributeNamed:creaseThreshold:")
    public native void addNormalsWithAttributeNamedCreaseThreshold(String attributeName, float creaseThreshold);

    /**
     * addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedNormalAttributeNamedTangentAttributeNamed(
            String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);

    /**
     * addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedTangentAttributeNamedBitangentAttributeNamed(
            String textureCoordinateAttributeName, String tangentAttributeName, String bitangentAttributeName);

    /**
     * generateAmbientOcclusionTextureWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/generateAmbientOcclusionTextureWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("generateAmbientOcclusionTextureWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateAmbientOcclusionTextureWithQualityAttenuationFactorObjectsToConsiderVertexAttributeNamedMaterialPropertyNamed(
            float bakeQuality, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName, String materialPropertyName);

    /**
     * generateAmbientOcclusionVertexColorsWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/generateAmbientOcclusionVertexColorsWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("generateAmbientOcclusionVertexColorsWithQuality:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColorsWithQualityAttenuationFactorObjectsToConsiderVertexAttributeNamed(
            float bakeQuality, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    /**
     * generateAmbientOcclusionVertexColorsWithRaysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/generateAmbientOcclusionVertexColorsWithRaysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("generateAmbientOcclusionVertexColorsWithRaysPerSample:attenuationFactor:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateAmbientOcclusionVertexColorsWithRaysPerSampleAttenuationFactorObjectsToConsiderVertexAttributeNamed(
            @NInt long raysPerSample, float attenuationFactor, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    /**
     * generateLightMapTextureWithQuality:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/generateLightMapTextureWithQuality:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("generateLightMapTextureWithQuality:lightsToConsider:objectsToConsider:vertexAttributeNamed:materialPropertyNamed:")
    public native boolean generateLightMapTextureWithQualityLightsToConsiderObjectsToConsiderVertexAttributeNamedMaterialPropertyNamed(
            float bakeQuality, NSArray<? extends MDLLight> lightsToConsider,
            NSArray<? extends MDLObject> objectsToConsider, String vertexAttributeName, String materialPropertyName);

    /**
     * generateLightMapVertexColorsWithLightsToConsider:objectsToConsider:vertexAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/generateLightMapVertexColorsWithLightsToConsider:objectsToConsider:vertexAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("generateLightMapVertexColorsWithLightsToConsider:objectsToConsider:vertexAttributeNamed:")
    public native boolean generateLightMapVertexColorsWithLightsToConsiderObjectsToConsiderVertexAttributeNamed(
            NSArray<? extends MDLLight> lightsToConsider, NSArray<? extends MDLObject> objectsToConsider,
            String vertexAttributeName);

    @Generated
    @Selector("init")
    public native MDLMesh init();

    /**
     * initWithVertexBuffer:vertexCount:descriptor:submeshes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/initWithVertexBuffer:vertexCount:descriptor:submeshes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithVertexBuffer:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBufferVertexCountDescriptorSubmeshes(
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer vertexBuffer, @NUInt long vertexCount,
            MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    /**
     * initWithVertexBuffers:vertexCount:descriptor:submeshes:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/initWithVertexBuffers:vertexCount:descriptor:submeshes:">iOS Dev Center</a>
     */
    @Generated
    @Selector("initWithVertexBuffers:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBuffersVertexCountDescriptorSubmeshes(NSArray<?> vertexBuffers,
            @NUInt long vertexCount, MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    /**
     * makeVerticesUnique</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/makeVerticesUnique">iOS Dev Center</a>
     */
    @Generated
    @Selector("makeVerticesUnique")
    public native void makeVerticesUnique();

    /**
     * vertexDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instp/MDLMesh/vertexDescriptor">iOS Dev Center</a>
     */
    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(MDLVertexDescriptor value);

    /**
     * submeshes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instp/MDLMesh/submeshes">iOS Dev Center</a>
     */
    @Generated
    @Selector("submeshes")
    public native NSMutableArray<MDLSubmesh> submeshes();

    /**
     * vertexAttributeDataForAttributeNamed:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instm/MDLMesh/vertexAttributeDataForAttributeNamed:">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexAttributeDataForAttributeNamed:")
    public native MDLVertexAttributeData vertexAttributeDataForAttributeNamed(String name);

    /**
     * vertexBuffers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instp/MDLMesh/vertexBuffers">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexBuffers")
    public native NSArray<?> vertexBuffers();

    /**
     * vertexCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instp/MDLMesh/vertexCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexCount")
    @NUInt
    public native long vertexCount();

    /**
     * vertexDescriptor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ModelIO/Reference/MDLMesh_Class/index.html#//apple_ref/occ/instp/MDLMesh/vertexDescriptor">iOS Dev Center</a>
     */
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}

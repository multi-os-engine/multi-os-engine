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
import apple.foundation.NSData;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @class MDLMesh
 * @abstract A vertex buffer with info to interpret vertex data
 * @discussion Includes a collection of submeshs which have indexbuffer and
 *             material information
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLMesh alloc();

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
    @Selector("meshWithSCNGeometry:")
    public static native MDLMesh meshWithSCNGeometry(SCNGeometry scnGeometry);

    @Generated
    @Selector("meshWithSCNGeometry:bufferAllocator:")
    public static native MDLMesh meshWithSCNGeometryBufferAllocator(SCNGeometry scnGeometry,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Owned
    @Selector("newIcosahedronWithRadius:inwardNormals:allocator:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object newIcosahedronWithRadiusInwardNormalsAllocator(float radius, boolean inwardNormals,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    @Generated
    @Owned
    @Selector("newIcosahedronWithRadius:inwardNormals:geometryType:allocator:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object newIcosahedronWithRadiusInwardNormalsGeometryTypeAllocator(float radius,
            boolean inwardNormals, @NInt long geometryType,
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
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLMesh objectWithSCNNodeBufferAllocator(SCNNode scnNode,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @method addAttributeWithName:format
     * @abstract Convenience method to add an attribute
     * @discussion The mesh's allocator will be used to create storage for the new
     *             attribute.
     */
    @Generated
    @Selector("addAttributeWithName:format:")
    public native void addAttributeWithNameFormat(String name, @NUInt long format);

    /**
     * @method addAttributeWithName:format:type:data:stride
     * @abstract Create a new vertex attribute including an associated buffer with
     *           a copy of the supplied data, and update the vertex descriptor accordingly
     * @param name The name the attribute can be found by
     * @param format Format of the data, such as MDLVertexFormatFloat3
     * @param type The usage of the attribute, such as MDLVertexAttributePosition
     * @param data Object containing the data to be used in the new vertex buffer
     * @param stride The increment in bytes from the start of one data entry to
     *        the next.
     */
    @Generated
    @Selector("addAttributeWithName:format:type:data:stride:")
    public native void addAttributeWithNameFormatTypeDataStride(String name, @NUInt long format, String type,
            NSData data, @NInt long stride);

    /**
     * @method addAttributeWithName:format:type:data:stride:time
     * @abstract Create a new vertex attribute including an associated buffer with
     *           a copy of the supplied data, and update the vertex descriptor accordingly
     * @param name The name the attribute can be found by
     * @param format Format of the data, such as MDLVertexFormatFloat3
     * @param type The usage of the attribute, such as MDLVertexAttributePosition
     * @param data Object containing the data to be used in the new vertex buffer
     * @param stride The increment in bytes from the start of one data entry to
     *        the next.
     * @param time The time the attribute is to be invoked at.
     * @discussion Adding an attribute, such as position data, at multiple times will
     *             result in attributes being created for each of those times.
     *             Attributes corresponding to multiple times can be retrieved from
     *             the vertex descriptor.
     */
    @Generated
    @Selector("addAttributeWithName:format:type:data:stride:time:")
    public native void addAttributeWithNameFormatTypeDataStrideTime(String name, @NUInt long format, String type,
            NSData data, @NInt long stride, double time);

    /**
     * @method addNormalsWithAttributeNamed:creaseThreshold:
     * @abstract Calculate and add vertex normal data
     * @param attributeName Name is the attribute name of vertex normal attribute.  If nil, vertex normals
     *        will be added with the MDLVertexAttributeNormal name string
     * @param creaseThreshold Threshold of the dot product between the 2 triangles after which
     *                        their face normal will be smoothed out. Therefore, a threshold of 0 will
     *                        smooth everything and a threshold of 1 won't smooth anything.
     * @discussion Uses the attribute named MDLVertexAttributePosition to calculate
     *             vertex normals. If the mesh does not have an attribute with
     *             'attributeName', it will be added, otherwise the attribute name will
     *             be overwritten with vertex normal data. 'vertexDescriptor' will be
     *             updated to reflect the new attribute.
     */
    @Generated
    @Selector("addNormalsWithAttributeNamed:creaseThreshold:")
    public native void addNormalsWithAttributeNamedCreaseThreshold(String attributeName, float creaseThreshold);

    /**
     * @method addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed
     * @abstract Create tangents which are orthogonal to the normal
     * @param textureCoordinateAttributeName texture coordinates to use in calculations
     * @param normalAttributeName normals to use in calculations
     * @param tangentAttributeName Name of a four component vertex tangent attribute.
     * @discussion Uses the attribute named MDLVertexAttributePosition and
     *             textureCoordinateAttributeName and the specified normals to calculate
     *             tangent information. The mesh's vertexDescriptor will be updated to
     *             reflect the new attribute if necessary.
     *             Note that this method does NOT produce a T.w component which is used in B = (N x T) * T.w
     *             Please use addOrthTanBasisForTextureCoordinateAttributeNamed.
     */
    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedNormalAttributeNamedTangentAttributeNamed(
            String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);

    /**
     * @method addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed
     * @abstract Create a shader basis where the tangent and bitangent span the uv -> object space transform
     * @param textureCoordinateAttributeName Name of texture coordinates to use in calculations
     * @param tangentAttributeName Name of vertex tangent attribute.
     * @param bitangentAttributeName Name of vertex bitangent attribute.
     * @discussion Uses the attribute named MDLVertexAttributePosition and
     *             textureCoordinateAttributeName to calculate tangent and bitangent
     *             attributes. The mesh's vertexDescriptor will be updated to reflect
     *             the new attributes if necessary. The basis may not be orthogonal; to gaurantee an orthogonal
     *              tangent basis please use addOrthTanBasisForTextureCoordinateAttibuteNamed selector.
     */
    @Generated
    @Selector("addTangentBasisForTextureCoordinateAttributeNamed:tangentAttributeNamed:bitangentAttributeNamed:")
    public native void addTangentBasisForTextureCoordinateAttributeNamedTangentAttributeNamedBitangentAttributeNamed(
            String textureCoordinateAttributeName, String tangentAttributeName, String bitangentAttributeName);

    /**
     * @method addTextureCoordinatesForAttributeNamed:textureCoordinateAttributeName
     * @abstract Creates texture coordinates by unwrapping the mesh
     * @param textureCoordinateAttributeName texture coordinates to modify or create
     * @discussion Uses the attribute named MDLVertexAttributePosition and if available,
     *             the attribute named MDLVertexAttributeNormal to calculate texture coordinates
     */
    @Generated
    @Selector("addUnwrappedTextureCoordinatesForAttributeNamed:")
    public native void addUnwrappedTextureCoordinatesForAttributeNamed(String textureCoordinateAttributeName);

    /**
     * @property allocator
     * @abstract allocator used to allocate contained mesh buffers
     */
    @Generated
    @Selector("allocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBufferAllocator allocator();

    /**
     * @method generateAmbientOcclusionTextureWithQuality:
     * @abstract Creates an Ambient Occlusion texture, returns true upon success, false
     *           upon failure
     * @param bakeQuality Float between 0 and 1 that defines quality of the bake process.
     *        0 is of lower quality but bakes faster and uses less memory, where 1 is
     *        of higher quality.
     * @param attenuationFactor Float between 0 to 1 that defines how to attenuate the
     *        AO value. 0 doesn't change it, and at 1, all AO values are white except
     *        if they are originally completely black. Quadratic attenuation in between.
     * @param objectsToConsider NSArray of MDLMeshes containing the objects to raytrace
     *        against
     * @param vertexAttributeName NSString of the MDLVertexAttribute where the vertex
     *        texture UVs will be stored. Creates it if it doesn't exist, otherwise
     *        overwrites current values.
     * @param materialPropertyName NSString of the MDLMaterialProperty that will store
     *        the texture in the Mesh.
     * @result Success or failure of the baking process.
     */
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

    /**
     * @method initMeshBySubdividingMesh:submeshIndex:subdivisionLevels:allocator
     * @abstract Factory method that generates a subdivided mesh from a source mesh
     * @param mesh Mesh from which to generate a subdivided mesh
     * @param submeshIndex Index of submesh in Mesh's submesh array from which to
     *        generate a subdivided mesh
     * @param subdivisionLevels The number of levels to subdivide mesh
     * @discussion Subdivision levels over four are likely to generate more triangles
     *             than can be reasonably displayed. Index and vertex data will use
     *             the same allocator used for the source mesh. Loading an asset
     *             using the topology preservation flag set to YES will result in the
     *             best subdivision results.
     * @return Returns a mesh subdivided to index level, unless subdivision is
     *         impossible.
     */
    @Generated
    @Selector("initMeshBySubdividingMesh:submeshIndex:subdivisionLevels:allocator:")
    public native MDLMesh initMeshBySubdividingMeshSubmeshIndexSubdivisionLevelsAllocator(MDLMesh mesh,
            int submeshIndex, int subdivisionLevels, @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    /**
     * @method initWithAllocator:
     * @abstract Initialize a mesh with an allocator
     * @return An empty mesh
     */
    @Generated
    @Selector("initWithBufferAllocator:")
    public native MDLMesh initWithBufferAllocator(
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    /**
     * @method initWithVertexBuffer:vertexCount:descriptor:submeshes:
     * @abstract Initialize object with a vertex buffer and a collection of submeshes
     * @return Initialized mesh or nil if descriptor's layout array does not describe
     *         a single buffer
     * @param vertexBuffer MDLMeshBuffer object containing all vertex data for the mesh
     * @param vertexCount Number of vertices in the vertexBuffer
     * @param descriptor VertexDescriptor specifying how to interpret vertex data
     * @param submeshes Array of submeshes with index buffers referencing vertex data
     *        and/or materials to be applied to mesh
     */
    @Generated
    @Selector("initWithVertexBuffer:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBufferVertexCountDescriptorSubmeshes(
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer vertexBuffer, @NUInt long vertexCount,
            MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    /**
     * @method initWithVertexBuffer:vertexCount:descriptor:submeshes:
     * @abstract Initialize object with an array of vertex buffers (Structure of
     *           Arrays) and a collection of submeshes
     * @return Initialized mesh or nil if descriptor's layout array is incompatible
     *         with vertexBuffers array
     * @param vertexCount Number of vertices in vertexBuffers
     * @param descriptor VertexDescriptor specifying how to interpret vertex data
     * @param submeshes Array of submeshes with index buffers referencing vertex data
     *        and/or materials to be applied to mesh
     * @discussion Allows initialization with the layout of the vertexBuffers in a
     *        structure-of-arrays form, in other words, non-interleaved vertex attributes
     */
    @Generated
    @Selector("initWithVertexBuffers:vertexCount:descriptor:submeshes:")
    public native MDLMesh initWithVertexBuffersVertexCountDescriptorSubmeshes(NSArray<?> vertexBuffers,
            @NUInt long vertexCount, MDLVertexDescriptor descriptor, NSArray<? extends MDLSubmesh> submeshes);

    /**
     * @method makeVerticesUnique:
     * @abstract Deindexes the vertex array
     * @discussion If any vertices are shared on multiple faces, duplicate those
     *             vertices so faces do not share vertices. The vertex buffer and index
     *             buffers on submeshes may grow to accomadate any vertices added.
     */
    @Generated
    @Selector("makeVerticesUnique")
    public native void makeVerticesUnique();

    /**
     * @method removeAttributeNamed:
     * @abstract remove an attribute
     * @discussion if the named attribute does not exist, nothing happens.
     */
    @Generated
    @Selector("removeAttributeNamed:")
    public native void removeAttributeNamed(String name);

    /**
     * @method replaceAttributeNamed:withData
     * @abstract replace existing attribute data with new attribute data retaining
     * the format of the replacement data.
     * @discussion If the specified attribute does not already exist, it will be
     * created.
     */
    @Generated
    @Selector("replaceAttributeNamed:withData:")
    public native void replaceAttributeNamedWithData(String name, MDLVertexAttributeData newData);

    /**
     * @property submeshes
     * @abstract Array of submeshes containing an indexbuffer referencing the vertex
     *           data and material to be applied when the mesh is rendered
     */
    @Generated
    @Selector("setSubmeshes:")
    public native void setSubmeshes(NSMutableArray<MDLSubmesh> value);

    /**
     * @property vertexBuffers
     * @abstract Array of buffers containing vertex data
     * @discussion The vertex buffers in this array are indexed by the vertex descriptor.
     */
    @Generated
    @Selector("setVertexBuffers:")
    public native void setVertexBuffers(NSArray<?> value);

    /**
     * @property vertexCount
     * @abstract Number of vertices in the vertexBuffers
     * @discussion The size of vertex data in each buffer can be computed by multiplying
     *             this value with the stride of the buffer in the vertexDescriptor's
     *             layout
     */
    @Generated
    @Selector("setVertexCount:")
    public native void setVertexCount(@NUInt long value);

    /**
     * @property vertexDescriptor
     * @abstract Immutable vertex descriptor for interpreting data in vertexBuffers
     * @discussion Setting this applies the new layout in 'vertexBuffers' thus is a
     *             heavyweight operation as structured copies of almost all vertex
     *             buffer data could be made.  Additionally, if the new vertexDescriptor
     *             does not have an attribute in the original vertexDescriptor, that
     *             attribute will be deleted.  If the original vertexDescriptor does
     *             not have an attribute in the new vertexDescriptor, the data for the
     *             added attribute set as the added attribute's initializationValue
     *             property.
     * 
     *             The allocator associated with each original meshbuffer is used to
     *             reallocate the corresponding resultant meshbuffer.
     */
    @Generated
    @Selector("setVertexDescriptor:")
    public native void setVertexDescriptor(MDLVertexDescriptor value);

    /**
     * @property submeshes
     * @abstract Array of submeshes containing an indexbuffer referencing the vertex
     *           data and material to be applied when the mesh is rendered
     */
    @Generated
    @Selector("submeshes")
    public native NSMutableArray<MDLSubmesh> submeshes();

    /**
     * @method updateAttributeNamed:withData
     * @abstract update existing attribute data with new attribute data retaining
     * the format of the existing data.
     * @discussion If the specified attribute does not already exist, it will be
     * created with the same format as the newData.
     */
    @Generated
    @Selector("updateAttributeNamed:withData:")
    public native void updateAttributeNamedWithData(String name, MDLVertexAttributeData newData);

    /**
     * @method vertexAttributeDataForAttributeNamed:
     * @abstract convenience selector to get quick access to vertex attribute data
     * @discussion the vertex buffer will remain mapped until the MDLVertexAttributeData
     *             is freed.
     */
    @Generated
    @Selector("vertexAttributeDataForAttributeNamed:")
    public native MDLVertexAttributeData vertexAttributeDataForAttributeNamed(String name);

    /**
     * @method vertexAttributeDataForAttributeNamed:asFormat
     * @abstract convenience selector to get quick access to vertex attribute data
     *           reformatted to the requested format if necessary.
     * @discussion If the desired format has less elements than the source attribute
     *             elements, excess elements will be discarded. If the desired format
     *             has more elements than the source attribute, then the destination
     *             elements will be set to zero.
     *             The vertex buffer will remain mapped until the MDLVertexAttributeData
     *             is freed.
     */
    @Generated
    @Selector("vertexAttributeDataForAttributeNamed:asFormat:")
    public native MDLVertexAttributeData vertexAttributeDataForAttributeNamedAsFormat(String name, @NUInt long format);

    /**
     * @property vertexBuffers
     * @abstract Array of buffers containing vertex data
     * @discussion The vertex buffers in this array are indexed by the vertex descriptor.
     */
    @Generated
    @Selector("vertexBuffers")
    public native NSArray<?> vertexBuffers();

    /**
     * @property vertexCount
     * @abstract Number of vertices in the vertexBuffers
     * @discussion The size of vertex data in each buffer can be computed by multiplying
     *             this value with the stride of the buffer in the vertexDescriptor's
     *             layout
     */
    @Generated
    @Selector("vertexCount")
    @NUInt
    public native long vertexCount();

    /**
     * @property vertexDescriptor
     * @abstract Immutable vertex descriptor for interpreting data in vertexBuffers
     * @discussion Setting this applies the new layout in 'vertexBuffers' thus is a
     *             heavyweight operation as structured copies of almost all vertex
     *             buffer data could be made.  Additionally, if the new vertexDescriptor
     *             does not have an attribute in the original vertexDescriptor, that
     *             attribute will be deleted.  If the original vertexDescriptor does
     *             not have an attribute in the new vertexDescriptor, the data for the
     *             added attribute set as the added attribute's initializationValue
     *             property.
     * 
     *             The allocator associated with each original meshbuffer is used to
     *             reallocate the corresponding resultant meshbuffer.
     */
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();

    /**
     * @method addOrthTanBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed
     * @abstract Create an orthonormal tangent basis with tangent specified
     * @param textureCoordinateAttributeName texture coordinates to use in calculations
     * @param normalAttributeName normals to use in calculations
     * @param tangentAttributeName Name of a three/four component vertex tangent attribute.
     * @discussion Uses the attribute named MDLVertexAttributePosition and
     *             textureCoordinateAttributeName and the specified normals to calculate
     *             tangent information. The mesh's vertexDescriptor will be updated to
     *             reflect the new attribute if necessary.
     *             Note that the bitangent can be calculated from the normal and
     *             tangent by B = (N x T) * T.w
     */
    @Generated
    @Selector("addOrthTanBasisForTextureCoordinateAttributeNamed:normalAttributeNamed:tangentAttributeNamed:")
    public native void addOrthTanBasisForTextureCoordinateAttributeNamedNormalAttributeNamedTangentAttributeNamed(
            String textureCoordinateAttributeName, String normalAttributeName, String tangentAttributeName);

    /**
     * @method flipTextureCoordinatesInAttributeNamed:
     * @abstract Flips texture coordinates by performing the operation (u,v) = (u, 1-v)
     * @param textureCoordinateAttributeName texture coordinates to modify
     * @discussion Many application generate model files with texture coordinate mapping
     *             assuming a bottom left bitmap origin. It can be more convenient to
     *             have texture coordinates corresponding to an upper left bitmap origin.
     *             This selector will perform the flip operation if the requested texture
     *             coordinate attribute exists on the mesh. An exception will be raised if
     *             the attribute cannot be found
     */
    @Generated
    @Selector("flipTextureCoordinatesInAttributeNamed:")
    public native void flipTextureCoordinatesInAttributeNamed(String textureCoordinateAttributeName);

    /**
     * @method makeVerticesUniqueAndReturnError:
     * @abstract Deindexes the vertex array
     * @discussion If any vertices are shared on multiple faces, duplicate those
     * vertices so faces do not share vertices. The vertex buffer and index
     * buffers on submeshes may grow to accomadate any vertices added.
     */
    @Generated
    @Selector("makeVerticesUniqueAndReturnError:")
    public native boolean makeVerticesUniqueAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}

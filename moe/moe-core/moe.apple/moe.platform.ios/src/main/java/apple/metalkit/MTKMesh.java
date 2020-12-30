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

package apple.metalkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.modelio.MDLAsset;
import apple.modelio.MDLMesh;
import apple.modelio.MDLVertexDescriptor;
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
 * @class MTKMesh
 * @abstract Container for vertex data of a mesh and submeshes to render it.
 */
@Generated
@Library("MetalKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTKMesh extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTKMesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTKMesh alloc();

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
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @method newMeshesFromAsset:device:sourceMeshes:error:
     * @abstract Initialize all meshes in a Model I/O asset.
     * @param asset Model I/O asset from which to create MetalKit meshes
     * @param device Metal device on which to create mesh resources
     * @param sourceMeshes Array built by this method containing MDLMesh objects corresponding the returned MTKMesh objects
     * @param error Pointer to an NSError object set if an error occurred
     * @return MetalKit Meshes created from the Model I/O asset
     * @discussion A convenience method to create MetalKit meshes from each mesh in a Model I/O asset.  resulting meshes are returned while the corresponding Model I/O meshes from which they were generated will appear in the sourceMeshes array.  All vertexBuffer objects in each MDLMesh object in the asset and the indexBuffer of each submesh within each of these meshes must have been created using a MTKMeshBufferAllocator object.  Thus 
     */
    @Generated
    @Owned
    @Selector("newMeshesFromAsset:device:sourceMeshes:error:")
    public static native NSArray<? extends MTKMesh> newMeshesFromAssetDeviceSourceMeshesError(MDLAsset asset,
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends MDLMesh>> sourceMeshes,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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

    @Generated
    @Selector("init")
    public native MTKMesh init();

    /**
     * @method initWithMesh:device:error:
     * @abstract Initialize the mesh and the mesh's submeshes.
     * @param mesh Model I/O Mesh from which to create this MetalKit mesh
     * @param device Metal device on which to create mesh resources
     * @param error Pointer to an NSError object set if an error occurred
     * @discussion The designated initializer for this class.  This does NOT initialize any meshes that are children of the Model I/O mesh, only submeshes that are part of the given mesh.  An exception is raised if vertexBuffer objects in the given mesh and the indexBuffer of any submesh in this mesh have not been created with a MTKMeshBufferAllocator object.  If a submesh using MDLGeometryTypeQuads or MDLGeometryTypeTopology is used, that submesh will be copied, and recreated to use MDLGeometryTypeTriangles, before this routine creates the MTKSubmesh.
     */
    @Generated
    @Selector("initWithMesh:device:error:")
    public native MTKMesh initWithMeshDeviceError(MDLMesh mesh, @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @property name
     * @abstract Name of the mesh copies from the originating Model I/O mesh.
     * @discussion Can be used by the app to identify the mesh in its scene/world/renderer etc.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * @property name
     * @abstract Name of the mesh copies from the originating Model I/O mesh.
     * @discussion Can be used by the app to identify the mesh in its scene/world/renderer etc.
     */
    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @property submeshes
     * @abstract Submeshes containing index buffers to rendering mesh vertices.
     */
    @Generated
    @Selector("submeshes")
    public native NSArray<? extends MTKSubmesh> submeshes();

    /**
     * @property vertexBuffers
     * @abstract Array of buffers in which mesh vertex data resides.
     * @discussion This is filled with mesh buffer objects using the layout described by the vertexDescriptor property.  Elements in this array can be [NSNull null] if the vertexDescriptor does not specify elements for buffer for the given index
     */
    @Generated
    @Selector("vertexBuffers")
    public native NSArray<? extends MTKMeshBuffer> vertexBuffers();

    /**
     * @property vertexCount
     * @abstract Number of vertices in the vertexBuffers.
     */
    @Generated
    @Selector("vertexCount")
    @NUInt
    public native long vertexCount();

    /**
     * @property vertexDescriptor
     * @abstract Model I/O vertex descriptor specifying the layout of data in vertexBuffers.
     * @discussion This is not directly used by this object, but the application can use this information to determine rendering state or create a Metal vertex descriptor to build a RenderPipelineState object capable of interpreting data in 'vertexBuffers'.  Changing propties in the object will not result in the relayout data in vertex descriptor and thus will make the vertex descriptor no loger describe the layout of vertes data and verticies. (i.e. don't change properties in this vertexDescriptor)
     */
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}

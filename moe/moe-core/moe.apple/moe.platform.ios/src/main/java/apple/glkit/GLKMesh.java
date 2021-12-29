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

package apple.glkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.MDLAsset;
import apple.modelio.MDLMesh;
import apple.modelio.MDLVertexDescriptor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

@Generated
@Library("GLKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GLKMesh extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GLKMesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GLKMesh alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GLKMesh allocWithZone(VoidPtr zone);

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
    public static native GLKMesh new_objc();

    /**
     * newMeshesFromAsset:sourceMeshes:error:
     * <p>
     * Initialize all meshes in a Model I/O asset.
     * [@dicussion] A convenience method to create GLKit meshes from each mesh in a Model/IO asset.  Resulting meshes are returned while Model I/O meshes from which they were generated will appear in the sourceMeshes array.
     *
     * @param asset        Model I/O asset from which to create GLKit meshes
     * @param sourceMeshes Model I/O meshes corresponding the newly created GLKMeshes
     * @param error        Pointer to an NSError object set if an error occurred
     * @param return       GLKit meshes created from the Model I/O asset
     * @return An array of GLKit meshes built an asset
     */
    @Generated
    @Owned
    @Selector("newMeshesFromAsset:sourceMeshes:error:")
    public static native NSArray<? extends GLKMesh> newMeshesFromAssetSourceMeshesError(MDLAsset asset,
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
    public native GLKMesh init();

    /**
     * initWithMesh:error:
     * <p>
     * Initialize the mesh and the mesh's submeshes
     * <p>
     * This does NOT initialize any meshes that are children of the Model I/O mesh
     * [@error] Pointer to an NSError object which will be set if an error occurred
     *
     * @param mesh Model I/O Mesh from which to create this GLKit mesh
     */
    @Generated
    @Selector("initWithMesh:error:")
    public native GLKMesh initWithMeshError(MDLMesh mesh, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] name
     * <p>
     * Name of the mesh copies from the originating Model I/O mesh
     * <p>
     * Can be used by the app to identiry the mesh in it's scene/world/renderer etc.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] submeshes
     * <p>
     * Submeshes containing index buffers to rendering mesh verticies.
     * <p>
     * Submeshes may also contain texture materials to apply when rendering this object
     */
    @Generated
    @Selector("submeshes")
    public native NSArray<? extends GLKSubmesh> submeshes();

    /**
     * [@property] vertexBuffers
     * <p>
     * Array of buffers in which mesh vertex data resides
     */
    @Generated
    @Selector("vertexBuffers")
    public native NSArray<? extends GLKMeshBuffer> vertexBuffers();

    /**
     * [@property] vertexCount
     * <p>
     * Number of verticies in the vertexBuffers
     */
    @Generated
    @Selector("vertexCount")
    @NUInt
    public native long vertexCount();

    /**
     * [@property] vertexDescriptor
     * <p>
     * Model I/O vertex descriptor specifying the layout of data in vertexBuffers
     * <p>
     * This is not directly used by this object, but the application can use this information to determine rendering state or setup a vertex attribute object.
     */
    @Generated
    @Selector("vertexDescriptor")
    public native MDLVertexDescriptor vertexDescriptor();
}

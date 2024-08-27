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
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBuffer;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.modelio.protocol.MDLNamed;
import apple.scenekit.SCNGeometryElement;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MDLSubmesh
 * 
 * A drawable subset of an MDLMesh, with its own material
 * 
 * API-Since: 9.0
 */
@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLSubmesh extends NSObject implements MDLNamed {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLSubmesh(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLSubmesh alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLSubmesh allocWithZone(VoidPtr zone);

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

    @Generated
    @Owned
    @Selector("new")
    public static native MDLSubmesh new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("submeshWithSCNGeometryElement:")
    public static native MDLSubmesh submeshWithSCNGeometryElement(@NotNull SCNGeometryElement scnGeometryElement);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("submeshWithSCNGeometryElement:bufferAllocator:")
    public static native MDLSubmesh submeshWithSCNGeometryElementBufferAllocator(
            @NotNull SCNGeometryElement scnGeometryElement,
            @Nullable @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] geometryType
     * 
     * Type of primitive that vertices referenced by the indexBuffer are
     * assembled into
     */
    @Generated
    @Selector("geometryType")
    @NInt
    public native long geometryType();

    /**
     * [@property] indexBuffer
     * 
     * Index data referencing vertex data in parent mesh
     */
    @NotNull
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer indexBuffer();

    @NotNull
    @Generated
    @Selector("indexBufferAsIndexType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer indexBufferAsIndexType(@NUInt long indexType);

    /**
     * [@property] indexCount
     * 
     * Number of indices in the indexBuffer
     */
    @Generated
    @Selector("indexCount")
    @NUInt
    public native long indexCount();

    /**
     * [@property] indexType
     * 
     * Data type of indices in indexBuffer
     * 
     * Support 8, 16, and 32 bit unsigned integer values
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MDLSubmesh init();

    /**
     * initWithIndexBuffer:indexCount:indexType:geometryType:material:
     * 
     * Initialize submesh with all data necessary to make properties valid
     */
    @Generated
    @Selector("initWithIndexBuffer:indexCount:indexType:geometryType:material:")
    public native MDLSubmesh initWithIndexBufferIndexCountIndexTypeGeometryTypeMaterial(
            @NotNull @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount,
            @NUInt long indexType, @NInt long geometryType, @Nullable MDLMaterial material);

    /**
     * initWithMDLSubmesh:indexType:geometryType:
     * 
     * Initialize submesh using another submesh as input.
     * 
     * the resulting submesh will have a new index type if necessary.
     * If a conversion from the source submesh's geometry type to the requested
     * geometry type is possible, conversion will be performed. Otherwise nil will
     * be returned.
     */
    @Generated
    @Selector("initWithMDLSubmesh:indexType:geometryType:")
    public native MDLSubmesh initWithMDLSubmeshIndexTypeGeometryType(@NotNull MDLSubmesh submesh, @NUInt long indexType,
            @NInt long geometryType);

    /**
     * initWithName:indexBuffer:indexCount:indexType:geometryType:material:
     * 
     * Initialize submesh with all data necessary to make properties valid
     */
    @Generated
    @Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:")
    public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterial(@NotNull String name,
            @NotNull @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount,
            @NUInt long indexType, @NInt long geometryType, @Nullable MDLMaterial material);

    /**
     * initWithIndexBuffer:indexCount:indexType:faceTopologyBuffer:geometryType:material:
     * 
     * Initialize submesh with all data necessary to make properties valid
     * 
     * The geometry type will typically be MDLGeometryTypeVariableTopology,
     * if other types are used the faceTopologyBuffer contents should
     * reflect that.
     */
    @Generated
    @Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:topology:")
    public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterialTopology(
            @NotNull String name, @NotNull @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer,
            @NUInt long indexCount, @NUInt long indexType, @NInt long geometryType, @Nullable MDLMaterial material,
            @Nullable MDLSubmeshTopology topology);

    /**
     * [@property] material
     * 
     * Material to apply when rendering this object
     */
    @Nullable
    @Generated
    @Selector("material")
    public native MDLMaterial material();

    @NotNull
    @Generated
    @Selector("name")
    public native String name();

    /**
     * [@property] material
     * 
     * Material to apply when rendering this object
     */
    @Generated
    @Selector("setMaterial:")
    public native void setMaterial(@Nullable MDLMaterial value);

    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    /**
     * [@property] topology
     * 
     * Topology data structure for use with MDLGeometryTypeVariableTopology
     * 
     * ignored for geometry types other than MDLGeometryTypeVariableTopology.
     * A submesh of type MDLGeometryTypeVariableTopology with no topology
     * data is an empty submesh.
     */
    @Generated
    @Selector("setTopology:")
    public native void setTopology(@Nullable MDLSubmeshTopology value);

    /**
     * [@property] topology
     * 
     * Topology data structure for use with MDLGeometryTypeVariableTopology
     * 
     * ignored for geometry types other than MDLGeometryTypeVariableTopology.
     * A submesh of type MDLGeometryTypeVariableTopology with no topology
     * data is an empty submesh.
     */
    @Nullable
    @Generated
    @Selector("topology")
    public native MDLSubmeshTopology topology();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}

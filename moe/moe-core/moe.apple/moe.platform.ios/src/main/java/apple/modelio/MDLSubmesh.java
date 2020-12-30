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

/**
 * @class MDLSubmesh
 * @abstract A drawable subset of an MDLMesh, with its own material
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
    @Selector("submeshWithSCNGeometryElement:")
    public static native MDLSubmesh submeshWithSCNGeometryElement(SCNGeometryElement scnGeometryElement);

    @Generated
    @Selector("submeshWithSCNGeometryElement:bufferAllocator:")
    public static native MDLSubmesh submeshWithSCNGeometryElementBufferAllocator(SCNGeometryElement scnGeometryElement,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * @property geometryType
     * @abstract Type of primitive that vertices referenced by the indexBuffer are 
     *           assembled into
     */
    @Generated
    @Selector("geometryType")
    @NInt
    public native long geometryType();

    /**
     * @property indexBuffer
     * @abstract Index data referencing vertex data in parent mesh
     */
    @Generated
    @Selector("indexBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer indexBuffer();

    @Generated
    @Selector("indexBufferAsIndexType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer indexBufferAsIndexType(@NUInt long indexType);

    /**
     * @property indexCount
     * @abstract Number of indices in the indexBuffer
     */
    @Generated
    @Selector("indexCount")
    @NUInt
    public native long indexCount();

    /**
     * @property indexType
     * @abstract Data type of indices in indexBuffer
     * @discussion Support 8, 16, and 32 bit unsigned integer values
     */
    @Generated
    @Selector("indexType")
    @NUInt
    public native long indexType();

    @Generated
    @Selector("init")
    public native MDLSubmesh init();

    /**
     * @method initWithIndexBuffer:indexCount:indexType:geometryType:material:
     * @abstract Initialize submesh with all data necessary to make properties valid
     */
    @Generated
    @Selector("initWithIndexBuffer:indexCount:indexType:geometryType:material:")
    public native MDLSubmesh initWithIndexBufferIndexCountIndexTypeGeometryTypeMaterial(
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
            @NInt long geometryType, MDLMaterial material);

    /**
     * @method initWithMDLSubmesh:indexType:geometryType:
     * @abstract Initialize submesh using another submesh as input.
     * @discussion the resulting submesh will have a new index type if necessary.
     *  If a conversion from the source submesh's geometry type to the requested
     *  geometry type is possible, conversion will be performed. Otherwise nil will
     *  be returned.
     */
    @Generated
    @Selector("initWithMDLSubmesh:indexType:geometryType:")
    public native MDLSubmesh initWithMDLSubmeshIndexTypeGeometryType(MDLSubmesh submesh, @NUInt long indexType,
            @NInt long geometryType);

    /**
     * @method initWithName:indexBuffer:indexCount:indexType:geometryType:material:
     * @abstract Initialize submesh with all data necessary to make properties valid
     */
    @Generated
    @Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:")
    public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterial(String name,
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
            @NInt long geometryType, MDLMaterial material);

    /**
     * @method initWithIndexBuffer:indexCount:indexType:faceTopologyBuffer:geometryType:material:
     * @abstract Initialize submesh with all data necessary to make properties valid
     * 
     * @discussion The geometry type will typically be MDLGeometryTypeVariableTopology,
     *             if other types are used the faceTopologyBuffer contents should
     *             reflect that.
     */
    @Generated
    @Selector("initWithName:indexBuffer:indexCount:indexType:geometryType:material:topology:")
    public native MDLSubmesh initWithNameIndexBufferIndexCountIndexTypeGeometryTypeMaterialTopology(String name,
            @Mapped(ObjCObjectMapper.class) MDLMeshBuffer indexBuffer, @NUInt long indexCount, @NUInt long indexType,
            @NInt long geometryType, MDLMaterial material, MDLSubmeshTopology topology);

    /**
     * @property material
     * @abstract Material to apply when rendering this object
     */
    @Generated
    @Selector("material")
    public native MDLMaterial material();

    @Generated
    @Selector("name")
    public native String name();

    /**
     * @property material
     * @abstract Material to apply when rendering this object
     */
    @Generated
    @Selector("setMaterial:")
    public native void setMaterial(MDLMaterial value);

    @Generated
    @Selector("setName:")
    public native void setName(String value);

    /**
     * @property topology
     * @abstract Topology data structure for use with MDLGeometryTypeVariableTopology
     * 
     * @discussion ignored for geometry types other than MDLGeometryTypeVariableTopology.
     *             A submesh of type MDLGeometryTypeVariableTopology with no topology
     *             data is an empty submesh.
     */
    @Generated
    @Selector("setTopology:")
    public native void setTopology(MDLSubmeshTopology value);

    /**
     * @property topology
     * @abstract Topology data structure for use with MDLGeometryTypeVariableTopology
     * 
     * @discussion ignored for geometry types other than MDLGeometryTypeVariableTopology.
     *             A submesh of type MDLGeometryTypeVariableTopology with no topology
     *             data is an empty submesh.
     */
    @Generated
    @Selector("topology")
    public native MDLSubmeshTopology topology();
}

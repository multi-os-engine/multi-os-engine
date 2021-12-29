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
public class MDLSubmeshTopology extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLSubmeshTopology(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLSubmeshTopology alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MDLSubmeshTopology allocWithZone(VoidPtr zone);

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
    public static native MDLSubmeshTopology new_objc();

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
     * [@property] edgeCreaseCount
     * <p>
     * The number of edge creases encoded in edgeCreases
     */
    @Generated
    @Selector("edgeCreaseCount")
    @NUInt
    public native long edgeCreaseCount();

    /**
     * A crease value at an edge to be applied during subdivision. Edge creases
     * A zero value is smooth, a one value is peaked. It is intended to be used
     * with an index buffer, where the index buffer entries are edge index pairs.
     * Accordingly, there will be two index entries for each edge sharpness entry,
     * and the sharpness entry corresponds to the edge itself.
     * The corresponding values in the edge sharpness attribute indicate the
     * edge sharpness of those edges.  The index buffer is sparse. If a mesh
     * has three sharp edges, then the index buffer will have six entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("edgeCreaseIndices")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer edgeCreaseIndices();

    @Generated
    @Selector("edgeCreases")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer edgeCreases();

    /**
     * [@property] faceCount
     * <p>
     * The number of faces encoded in faceTopologyBuffer
     */
    @Generated
    @Selector("faceCount")
    @NUInt
    public native long faceCount();

    /**
     * [@property] faceTopologyBuffer
     * <p>
     * A buffer of 8 bit unsigned integer values, where each entry corresponds
     * to the number of vertices making up a face.
     * <p>
     * A submesh containing two triangles, a four sided polygon, and a
     * line, would contain the data 3 3 4 2.
     * If geometryType is of a fixed type, such as triangles, the buffer
     * is optional, and will be created on demand if read.
     * <p>
     * Indices to the vertex buffer will be stored in the index buffer
     * correspondingly. In the example above, the indices would be stored
     * in order, three indices for the first triangle, followed by three
     * for the second, followed by four for the polygon, and finally two
     * indices for the line.
     */
    @Generated
    @Selector("faceTopology")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer faceTopology();

    /**
     * [@property] holeCount
     * <p>
     * The number of holes encoded in holes
     */
    @Generated
    @Selector("holeCount")
    @NUInt
    public native long holeCount();

    /**
     * The hole attribute is a vertex attribute of single integer values where
     * each integer is an index of a face that is to be used as a hole. If there
     * are two holes in a mesh, then the vertex buffer will have two entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("holes")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer holes();

    @Generated
    @Selector("init")
    public native MDLSubmeshTopology init();

    /**
     * initWithSubmesh:
     * <p>
     * create a topology object corresponding to the topology in the submesh
     */
    @Generated
    @Selector("initWithSubmesh:")
    public native MDLSubmeshTopology initWithSubmesh(MDLSubmesh submesh);

    /**
     * [@property] edgeCreaseCount
     * <p>
     * The number of edge creases encoded in edgeCreases
     */
    @Generated
    @Selector("setEdgeCreaseCount:")
    public native void setEdgeCreaseCount(@NUInt long value);

    /**
     * A crease value at an edge to be applied during subdivision. Edge creases
     * A zero value is smooth, a one value is peaked. It is intended to be used
     * with an index buffer, where the index buffer entries are edge index pairs.
     * Accordingly, there will be two index entries for each edge sharpness entry,
     * and the sharpness entry corresponds to the edge itself.
     * The corresponding values in the edge sharpness attribute indicate the
     * edge sharpness of those edges.  The index buffer is sparse. If a mesh
     * has three sharp edges, then the index buffer will have six entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("setEdgeCreaseIndices:")
    public native void setEdgeCreaseIndices(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    @Generated
    @Selector("setEdgeCreases:")
    public native void setEdgeCreases(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    /**
     * [@property] faceCount
     * <p>
     * The number of faces encoded in faceTopologyBuffer
     */
    @Generated
    @Selector("setFaceCount:")
    public native void setFaceCount(@NUInt long value);

    /**
     * [@property] faceTopologyBuffer
     * <p>
     * A buffer of 8 bit unsigned integer values, where each entry corresponds
     * to the number of vertices making up a face.
     * <p>
     * A submesh containing two triangles, a four sided polygon, and a
     * line, would contain the data 3 3 4 2.
     * If geometryType is of a fixed type, such as triangles, the buffer
     * is optional, and will be created on demand if read.
     * <p>
     * Indices to the vertex buffer will be stored in the index buffer
     * correspondingly. In the example above, the indices would be stored
     * in order, three indices for the first triangle, followed by three
     * for the second, followed by four for the polygon, and finally two
     * indices for the line.
     */
    @Generated
    @Selector("setFaceTopology:")
    public native void setFaceTopology(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    /**
     * [@property] holeCount
     * <p>
     * The number of holes encoded in holes
     */
    @Generated
    @Selector("setHoleCount:")
    public native void setHoleCount(@NUInt long value);

    /**
     * The hole attribute is a vertex attribute of single integer values where
     * each integer is an index of a face that is to be used as a hole. If there
     * are two holes in a mesh, then the vertex buffer will have two entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("setHoles:")
    public native void setHoles(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    /**
     * [@property] vertexCreaseCount
     * <p>
     * The number of vertex creases encoded in vertexCreases
     */
    @Generated
    @Selector("setVertexCreaseCount:")
    public native void setVertexCreaseCount(@NUInt long value);

    /**
     * A crease value at a vertex to be applied during subdivision. Vertex creases
     * A zero value is smooth, a one value is peaked. It is intended to be used
     * with an index buffer, where the index buffer entries are vertex indices.
     * The corresponding values in the corner sharpness attribute indicate the
     * corner sharpness of those vertices. The index buffer is sparse. If a mesh
     * has three sharp vertices, then the index buffer will have three entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("setVertexCreaseIndices:")
    public native void setVertexCreaseIndices(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    @Generated
    @Selector("setVertexCreases:")
    public native void setVertexCreases(@Mapped(ObjCObjectMapper.class) MDLMeshBuffer value);

    /**
     * [@property] vertexCreaseCount
     * <p>
     * The number of vertex creases encoded in vertexCreases
     */
    @Generated
    @Selector("vertexCreaseCount")
    @NUInt
    public native long vertexCreaseCount();

    /**
     * A crease value at a vertex to be applied during subdivision. Vertex creases
     * A zero value is smooth, a one value is peaked. It is intended to be used
     * with an index buffer, where the index buffer entries are vertex indices.
     * The corresponding values in the corner sharpness attribute indicate the
     * corner sharpness of those vertices. The index buffer is sparse. If a mesh
     * has three sharp vertices, then the index buffer will have three entries.
     * Since the number of entries in this vertex buffer is likely to be different
     * than the number of entries in any other vertex buffer, it shouldn't be
     * interleaved with other data.
     */
    @Generated
    @Selector("vertexCreaseIndices")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer vertexCreaseIndices();

    @Generated
    @Selector("vertexCreases")
    @MappedReturn(ObjCObjectMapper.class)
    public native MDLMeshBuffer vertexCreases();
}

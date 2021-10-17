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
import apple.coregraphics.struct.CGPoint;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLBuffer;
import apple.scenekit.struct.SCNVector3;
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
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * SCNGeometrySource
 * <p>
 * A geometry source contains geometry data for a specific semantic. The data format is described by properties.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNGeometrySource extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNGeometrySource(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNGeometrySource alloc();

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
     * geometrySourceWithBuffer:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:
     * <p>
     * Creates and returns a geometry source from the given data and parameters.
     * <p>
     * Attempting to modify the Metal buffer outside the SCNSceneRenderer delegate callbacks is undefined.
     * The typical usage it to modify the MTLBuffer within the willRenderScene callback, using a compute kernel or a vertex function in the user own command buffer. So something like:
     * <p>
     * - (void)renderer:(id <SCNSceneRenderer>)aRenderer willRenderScene:(SCNScene *)scene atTime:(NSTimeInterval)time
     * {
     * // ask for a new command buffer
     * id <MTLCommandBuffer> myCommandBuffer = [aRenderer.commandQueue commandBuffer];
     * <p>
     * // get a compute command encoder
     * id <MTLComputeCommandEncoder> myComputeCommandEncoder = [myCommandBuffer computeCommandEncoder];
     * <p>
     * // configure the compute command encoder's pipeline state, buffer inputs etc...
     * //...
     * <p>
     * // dispatch the
     * [myComputeCommandEncoder dispatchThreadgroups:numberOfWorkingGroups threadsPerThreadgroup:numberOfThreads];
     * [myComputeCommandEncoder endEncoding];
     * <p>
     * [myCommandBuffer commit];
     * }
     *
     * @param buffer       A Metal buffer.
     * @param vertexFormat The vertex format.
     * @param semantic     The semantic of the geometry source.
     * @param vertexCount  The number of vertex.
     * @param offset       The offset from the beginning of the data. In bytes.
     * @param stride       The number of bytes from a vector to the next one in the data.
     */
    @Generated
    @Selector("geometrySourceWithBuffer:vertexFormat:semantic:vertexCount:dataOffset:dataStride:")
    public static native SCNGeometrySource geometrySourceWithBufferVertexFormatSemanticVertexCountDataOffsetDataStride(
            @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long vertexFormat, String semantic,
            @NInt long vertexCount, @NInt long offset, @NInt long stride);

    /**
     * geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:
     * <p>
     * Creates and returns a geometry source from the given data and parameters.
     *
     * @param data                The geometry data.
     * @param semantic            The semantic of the geometry source.
     * @param vectorCount         The number of geometry source vectors.
     * @param floatComponents     A flag that indicates if vector components are floating point values.
     * @param componentsPerVector The number of scalar components in a vector.
     * @param bytesPerComponent   The number of bytes that represent a vector component.
     * @param offset              The offset from the beginning of the data. In bytes.
     * @param stride              The number of bytes from a vector to the next one in the data.
     */
    @Generated
    @Selector("geometrySourceWithData:semantic:vectorCount:floatComponents:componentsPerVector:bytesPerComponent:dataOffset:dataStride:")
    public static native SCNGeometrySource geometrySourceWithDataSemanticVectorCountFloatComponentsComponentsPerVectorBytesPerComponentDataOffsetDataStride(
            NSData data, String semantic, @NInt long vectorCount, boolean floatComponents,
            @NInt long componentsPerVector, @NInt long bytesPerComponent, @NInt long offset, @NInt long stride);

    /**
     * geometrySourceWithNormals:count:
     * <p>
     * Creates and returns a geometry source from normals stored in a buffer of SCNVector3 values.
     * <p>
     * Input normals are copied to an optimized data format. The actual format is described by the properties of the resulting instance.
     *
     * @param normals The buffer of normals.
     * @param count   The number of normals.
     */
    @Generated
    @Selector("geometrySourceWithNormals:count:")
    public static native SCNGeometrySource geometrySourceWithNormalsCount(
            @ReferenceInfo(type = SCNVector3.class) ConstPtr<SCNVector3> normals, @NInt long count);

    /**
     * geometrySourceWithTextureCoordinates:count:
     * <p>
     * Creates and returns a geometry source from texture coordinates stored in a buffer of CGPoint values.
     * <p>
     * Input texture coordinates are copied to an optimized data format. The actual format is described by the properties of the resulting instance.
     *
     * @param texcoord The buffer of texture coordinates.
     * @param count    The number of texture coordinate points.
     */
    @Generated
    @Selector("geometrySourceWithTextureCoordinates:count:")
    public static native SCNGeometrySource geometrySourceWithTextureCoordinatesCount(
            @ReferenceInfo(type = CGPoint.class) ConstPtr<CGPoint> texcoord, @NInt long count);

    /**
     * geometrySourceWithVertices:count:
     * <p>
     * Creates and returns a geometry source from vertices stored in a buffer of SCNVector3 values.
     * <p>
     * Input vertices are copied to an optimized data format. The actual format is described by the properties of the resulting instance.
     *
     * @param vertices The buffer of vertices.
     * @param count    The number of vertices.
     */
    @Generated
    @Selector("geometrySourceWithVertices:count:")
    public static native SCNGeometrySource geometrySourceWithVerticesCount(
            @ReferenceInfo(type = SCNVector3.class) ConstPtr<SCNVector3> vertices, @NInt long count);

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

    /**
     * [@property] bytesPerComponent
     * <p>
     * The size of a vector component in bytes.
     */
    @Generated
    @Selector("bytesPerComponent")
    @NInt
    public native long bytesPerComponent();

    /**
     * [@property] componentsPerVector
     * <p>
     * The number of scalar components in each vector.
     */
    @Generated
    @Selector("componentsPerVector")
    @NInt
    public native long componentsPerVector();

    /**
     * [@property] data
     * <p>
     * The data for the geometry source
     */
    @Generated
    @Selector("data")
    public native NSData data();

    /**
     * [@property] dataOffset
     * <p>
     * The offset from the beginning of the data. In bytes.
     */
    @Generated
    @Selector("dataOffset")
    @NInt
    public native long dataOffset();

    /**
     * [@property] dataStride
     * <p>
     * The number of bytes from a vector to the next one in the data.
     */
    @Generated
    @Selector("dataStride")
    @NInt
    public native long dataStride();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * [@property] floatComponents
     * <p>
     * A flag that indicates if vector components are floating point values.
     */
    @Generated
    @Selector("floatComponents")
    public native boolean floatComponents();

    @Generated
    @Selector("init")
    public native SCNGeometrySource init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNGeometrySource initWithCoder(NSCoder coder);

    /**
     * [@property] semantic
     * <p>
     * The semantic of the geometry source
     */
    @Generated
    @Selector("semantic")
    public native String semantic();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] vectorCount
     * <p>
     * The number of vectors in the data.
     */
    @Generated
    @Selector("vectorCount")
    @NInt
    public native long vectorCount();
}

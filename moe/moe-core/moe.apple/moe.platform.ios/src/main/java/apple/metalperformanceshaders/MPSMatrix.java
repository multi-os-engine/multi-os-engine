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

package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
 * MPSMatrix
 * 
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSMatrix object describes a set of 2-dimensional arrays of data and provides storage
 * for its values. MPSMatrix objects serve as inputs and outputs of MPSMatrixKernel
 * objects.
 * 
 * Implementation note:
 * A MPSMatrix object maintains its internal storage using a MTLBuffer object and thus
 * the same rules for maintaining coherency of a MTLBuffer's data between CPU memory and GPU
 * memory apply to a MPSMatrix. An MPSMatrix object's data refers to an array of matrices.
 * Data is assumed to be ordered by matrix first, followed by row, followed by column.
 * 
 * For example, index [i,j] of the k'th matrix of an MPSMatrix is located at byte offset:
 * k * matrixBytes + i * rowBytes + j * sizeof(dataType)
 * 
 * Where matrixBytes is a multiple of rowBytes at least equal to rows * rowBytes.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrix extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrix(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrix alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrix allocWithZone(VoidPtr zone);

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
    public static native MPSMatrix new_objc();

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
     * [@property] columns
     * 
     * The number of columns in a matrix in the MPSMatrix.
     */
    @Generated
    @Selector("columns")
    @NUInt
    public native long columns();

    /**
     * [@property] data
     * 
     * An MTLBuffer to store the data.
     */
    @Generated
    @Selector("data")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBuffer data();

    /**
     * [@property] dataType
     * 
     * The type of the MPSMatrix data.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    /**
     * [@property] device
     * 
     * The device on which the MPSMatrix will be used.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("init")
    public native MPSMatrix init();

    /**
     * Initialize a MPSMatrix object with a MTLBuffer.
     * 
     * This function returns a MPSMatrix object which uses the supplied MTLBuffer. The
     * dimensions and stride of the matrix are specified by the MPSMatrixDescriptor object.
     * 
     * The provided MTLBuffer must have enough storage to hold
     * 
     * (descriptor.matrices-1) * descriptor.matrixBytes +
     * (descriptor.rows-1) * descriptor.rowBytes +
     * descriptor.columns * (element size) bytes.
     * 
     * @param buffer     The MTLBuffer object which contains the data to use for the
     *                   MPSMatrix. May not be NULL.
     * 
     * @param descriptor The MPSMatrixDescriptor. May not be NULL.
     * 
     * @return A valid MPSMatrix object or nil, if failure.
     */
    @Generated
    @Selector("initWithBuffer:descriptor:")
    public native MPSMatrix initWithBufferDescriptor(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            MPSMatrixDescriptor descriptor);

    /**
     * [@property] rowBytes
     * 
     * The stride, in bytes, between corresponding elements of
     * consecutive rows.
     */
    @Generated
    @Selector("rowBytes")
    @NUInt
    public native long rowBytes();

    /**
     * [@property] rows
     * 
     * The number of rows in a matrix in the MPSMatrix.
     */
    @Generated
    @Selector("rows")
    @NUInt
    public native long rows();

    /**
     * [@property] matrices
     * 
     * The number of matrices in the MPSMatrix.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("matrices")
    @NUInt
    public native long matrices();

    /**
     * [@property] matrixBytes
     * 
     * The stride, in bytes, between corresponding elements of
     * consecutive matrices.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("matrixBytes")
    @NUInt
    public native long matrixBytes();

    /**
     * Initialize a MPSMatrix object with a MTLBuffer at a given offset.
     * 
     * @param buffer     The MTLBuffer object which contains the data to use for the
     *                   MPSMatrix. May not be NULL.
     * 
     * @param offset     The offset, in bytes, into the buffer at which the data begins.
     * 
     * @param descriptor The MPSMatrixDescriptor describing the shape of the matrix.
     * 
     *                   API-Since: 13.0
     */
    @Generated
    @Selector("initWithBuffer:offset:descriptor:")
    public native MPSMatrix initWithBufferOffsetDescriptor(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset, MPSMatrixDescriptor descriptor);

    /**
     * Initialize a MPSMatrix object with a descriptor. Allocate the buffer.
     * 
     * The matrix object will be created, but the storage to hold the
     * matrix data will only be allocated when it is needed, typically
     * when the data property is invoked. In conjunction
     * with -resourceSize, this will allow you to estimate storage needs
     * without actually creating the backing store for the matrix.
     * 
     * @param device     The device with which it will be used
     * @param descriptor The shape and style of the matrix
     * @return A valid MPSMatrix object or nil
     */
    @Generated
    @Selector("initWithDevice:descriptor:")
    public native MPSMatrix initWithDeviceDescriptor(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            MPSMatrixDescriptor descriptor);

    /**
     * [@property] offset
     * 
     * Byte-offset to the buffer where the matrix data begins - see @ref initWithBuffer: offset: descriptor: .
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("offset")
    @NUInt
    public native long offset();

    /**
     * Get the number of bytes used to allocate underyling MTLResources
     * 
     * This is the size of the backing store of underlying MTLResources.
     * It does not include all storage used by the object, for example
     * the storage used to hold the MPSMatrix instantiation and MTLBuffer
     * is not included. It only measures the size of the allocation used
     * to hold the matrix data in the buffer. This value is subject to
     * change between different devices and operating systems.
     * 
     * Except when -initWithBuffer:descriptor: is used, most MPSMatrixes are allocated
     * without a backing store. The backing store is allocated lazily when
     * it is needed, typically when the .texture property is called.
     * Consequently, in most cases, it should be inexpensive to make
     * a MPSImage to see how much memory it will need, and release it
     * if it is too large.
     * 
     * This method may fail in certain circumstances, such as when the
     * MPSImage is created with -initWithTexture:featureChannels:. In
     * such cases, 0 will be returned.
     * 
     * API-Since: 11.3
     */
    @Generated
    @Selector("resourceSize")
    @NUInt
    public native long resourceSize();

    /**
     * Flush the underlying MTLBuffer from the device's caches, and invalidate any CPU caches if needed.
     * 
     * This will call [id <MTLBlitEncoder> synchronizeResource: ] on the matrix's MTLBuffer, if any.
     * This is necessary for all MTLStorageModeManaged resources. For other resources, including temporary
     * resources (these are all MTLStorageModePrivate), and buffers that have not yet been allocated, nothing is done.
     * It is more efficient to use this method than to attempt to do this yourself with the data property.
     * 
     * @param commandBuffer The commandbuffer on which to synchronize
     * 
     *                      API-Since: 11.3
     */
    @Generated
    @Selector("synchronizeOnCommandBuffer:")
    public native void synchronizeOnCommandBuffer(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);
}

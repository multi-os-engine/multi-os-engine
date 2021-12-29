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
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLOrigin;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSMatrixMultiplication
 * <p>
 * [@dependency] This depends on Metal.framework.
 * <p>
 * A matrix multiplication kernel.
 * <p>
 * A MPSMatrixMultiplication object computes:
 * <p>
 * C = alpha * op(A) * op(B) + beta * C
 * <p>
 * A, B, and C are matrices which are represented by MPSMatrix
 * objects. alpha and beta are scalar values (of the same data type
 * as values of C) which are applied as shown above.  A and B may
 * each have an optional transposition operation applied.
 * <p>
 * A, B, and C (also referred to in later discussions as the left input
 * matrix, the right input matrix, and the result matrix respectively).
 * <p>
 * A MPSMatrixMultiplication object is initialized with the transpose
 * operators to apply to A and B, sizes for the operation to perform,
 * and the scalar values alpha and beta.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixMultiplication extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixMultiplication(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixMultiplication alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSMatrixMultiplication allocWithZone(VoidPtr zone);

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
    public static native MPSMatrixMultiplication new_objc();

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
     * Encode a MPSMatrixMultiplication object to a command buffer.
     * <p>
     * Certain constraints apply to the sizes of the matrices depending on the transposition
     * operations and sizes requested at initialization time as well as the origins at the time
     * this routine is called:
     * <p>
     * The left input matrix must be large enough to hold an array of size resultRows x interiorColumns
     * elements beginning at leftMatrixOrigin.
     * <p>
     * The right input matrix must be large enough to hold an array of size interiorColumns x resultColumns
     * elements beginning at rightMatrixOrigin.
     * <p>
     * The result matrix must be large enough to hold an array of size resultRows x resultColumns
     * elements beginning at resultMatrixOrigin.
     * <p>
     * Each matrix within the range specified by batchStart and batchSize, which also specifies
     * a valid set of matrices within leftMatrix, rightMatrix, and resultMatrix, will
     * be processed.
     *
     * @param commandBuffer A valid MTLCommandBuffer to receive the encoded kernel.
     * @param leftMatrix    A valid MPSMatrix object which specifies the left input matrix.
     * @param rightMatrix   A valid MPSMatrix object which specifies the right input matrix.
     * @param resultMatrix  A valid MPSMatrix object which specifies the addend matrix which will
     *                      also be overwritten by the result.
     */
    @Generated
    @Selector("encodeToCommandBuffer:leftMatrix:rightMatrix:resultMatrix:")
    public native void encodeToCommandBufferLeftMatrixRightMatrixResultMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix leftMatrix, MPSMatrix rightMatrix,
            MPSMatrix resultMatrix);

    @Generated
    @Selector("init")
    public native MPSMatrixMultiplication init();

    @Generated
    @Selector("initWithDevice:")
    public native MPSMatrixMultiplication initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an MPSMatrixMultiplication object on a device for a given size
     * and desired transpose and scale values.
     *
     * @param device          The device on which the kernel will execute.
     * @param transposeLeft   A boolean value which indicates if the left input matrix should be
     *                        used in transposed form.  If 'YES' then op(A) = A**T, otherwise
     *                        op(A) = A.
     * @param transposeRight  A boolean value which indicates if the right input matrix should be
     *                        used in transposed form.  If 'YES' then op(B) = B**T, otherwise
     *                        op(B) = B.
     * @param resultRows      The number of rows in the result matrix, M in BLAS GEMM description.
     * @param resultColumns   The number of columns in the result matrix, N in BLAS GEMM description.
     * @param interiorColumns The number of columns of the left input matrix after the
     *                        appropriate transpose operation has been applied. K in BLAS
     *                        GEMM description.
     * @param alpha           The scale factor to apply to the product.  Specified in double
     *                        precision.  Will be converted to the appropriate precision in the
     *                        implementation subject to rounding and/or clamping as necessary.
     * @param beta            The scale factor to apply to the initial values of C.  Specified
     *                        in double precision.  Will be converted to the appropriate precision in the
     *                        implementation subject to rounding and/or clamping as necessary.
     * @return A valid MPSMatrixMultiplication object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:transposeLeft:transposeRight:resultRows:resultColumns:interiorColumns:alpha:beta:")
    public native MPSMatrixMultiplication initWithDeviceTransposeLeftTransposeRightResultRowsResultColumnsInteriorColumnsAlphaBeta(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, boolean transposeLeft, boolean transposeRight,
            @NUInt long resultRows, @NUInt long resultColumns, @NUInt long interiorColumns, double alpha, double beta);

    /**
     * [@property]   leftMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the left input matrix, at which to
     * start reading values.  This property is modifiable and defaults to
     * [0, 0] at initialization time.  If a different origin is desired then
     * this should be modified prior to encoding the kernel.  The z value
     * must be 0.
     */
    @Generated
    @Selector("leftMatrixOrigin")
    @ByValue
    public native MTLOrigin leftMatrixOrigin();

    /**
     * [@property]   resultMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing (and reading if necessary) results.  This property is
     * modifiable and defaults to [0, 0] at initialization time.  If a
     * different origin is desired then this should be modified prior to
     * encoding the kernel.  The z value must be 0.
     */
    @Generated
    @Selector("resultMatrixOrigin")
    @ByValue
    public native MTLOrigin resultMatrixOrigin();

    /**
     * [@property]   rightMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the right input matrix, at which to
     * start reading values.  This property is modifiable and defaults to
     * [0, 0] at initialization time.  If a different origin is desired then
     * this should be modified prior to encoding the kernel.  The z value
     * must be 0.
     */
    @Generated
    @Selector("rightMatrixOrigin")
    @ByValue
    public native MTLOrigin rightMatrixOrigin();

    /**
     * [@property]   leftMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the left input matrix, at which to
     * start reading values.  This property is modifiable and defaults to
     * [0, 0] at initialization time.  If a different origin is desired then
     * this should be modified prior to encoding the kernel.  The z value
     * must be 0.
     */
    @Generated
    @Selector("setLeftMatrixOrigin:")
    public native void setLeftMatrixOrigin(@ByValue MTLOrigin value);

    /**
     * [@property]   resultMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the result matrix, at which to
     * start writing (and reading if necessary) results.  This property is
     * modifiable and defaults to [0, 0] at initialization time.  If a
     * different origin is desired then this should be modified prior to
     * encoding the kernel.  The z value must be 0.
     */
    @Generated
    @Selector("setResultMatrixOrigin:")
    public native void setResultMatrixOrigin(@ByValue MTLOrigin value);

    /**
     * [@property]   rightMatrixOrigin
     * <p>
     * The origin, relative to [0, 0] in the right input matrix, at which to
     * start reading values.  This property is modifiable and defaults to
     * [0, 0] at initialization time.  If a different origin is desired then
     * this should be modified prior to encoding the kernel.  The z value
     * must be 0.
     */
    @Generated
    @Selector("setRightMatrixOrigin:")
    public native void setRightMatrixOrigin(@ByValue MTLOrigin value);

    /**
     * [@property]   batchSize
     * <p>
     * The number of matrices in the batch to process.  This property
     * is modifiable and by default allows all matrices available at
     * encoding time to be processed.
     */
    @Generated
    @Selector("batchSize")
    @NUInt
    public native long batchSize();

    /**
     * [@property]   batchStart
     * <p>
     * The index of the first matrix in the batch.  This property is
     * modifiable and defaults to 0 at initialization time.  If
     * batch processing should begin at a different matrix this value
     * should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("batchStart")
    @NUInt
    public native long batchStart();

    @Generated
    @Selector("initWithCoder:")
    public native MPSMatrixMultiplication initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSMatrixMultiplication initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Convenience initialization for a matrix-matrix multiplication
     * with no transpositions, unit scaling of the product, and no
     * accumulation of the result.  The scaling factors alpha and beta
     * are taken to be 1.0 and 0.0 respectively.
     *
     * @param device          The device on which the kernel will execute.
     * @param resultRows      The number of rows in the result matrix, M in BLAS GEMM description.
     * @param resultColumns   The number of columns in the result matrix, N in BLAS GEMM description.
     * @param interiorColumns The number of columns of the left input matrix. K in BLAS
     *                        GEMM description.
     * @return A valid MPSMatrixMultiplication object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:resultRows:resultColumns:interiorColumns:")
    public native MPSMatrixMultiplication initWithDeviceResultRowsResultColumnsInteriorColumns(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long resultRows, @NUInt long resultColumns,
            @NUInt long interiorColumns);

    /**
     * [@property]   batchSize
     * <p>
     * The number of matrices in the batch to process.  This property
     * is modifiable and by default allows all matrices available at
     * encoding time to be processed.
     */
    @Generated
    @Selector("setBatchSize:")
    public native void setBatchSize(@NUInt long value);

    /**
     * [@property]   batchStart
     * <p>
     * The index of the first matrix in the batch.  This property is
     * modifiable and defaults to 0 at initialization time.  If
     * batch processing should begin at a different matrix this value
     * should be modified prior to encoding the kernel.
     */
    @Generated
    @Selector("setBatchStart:")
    public native void setBatchStart(@NUInt long value);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}

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
 * MPSMatrixDescriptor
 * 
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSMatrixDescriptor describes the sizes, strides, and data type of a
 *             an array of 2-dimensional matrices.  All storage is assumed to be in
 *             "matrix-major".  See the description for MPSMatrix for further details.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSMatrixDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSMatrixDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSMatrixDescriptor alloc();

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

    /**
     * Create a MPSMatrixDescriptor with the specified dimensions and data type.
     * 
     * For performance considerations the optimal row stride may not necessarily be equal
     *             to the number of columns in the matrix.  The MPSMatrix class provides a method which
     *             may be used to determine this value, see the rowBytesForColumns API in the MPSMatrix
     *             class.
     *             The number of matrices described is initialized to 1.
     * 
     * @param      rows                The number of rows of the matrix.
     * 
     * @param      columns             The number of columns of the matrix.
     * 
     * @param      rowBytes            The number of bytes between starting elements of consecutive
     *                                 rows.  Must be a multiple of the element size.
     * 
     * @param      dataType            The type of the data to be stored in the matrix.
     */
    @Generated
    @Selector("matrixDescriptorWithDimensions:columns:rowBytes:dataType:")
    public static native MPSMatrixDescriptor matrixDescriptorWithDimensionsColumnsRowBytesDataType(@NUInt long rows,
            @NUInt long columns, @NUInt long rowBytes, int dataType);

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

    /**
     * Return the recommended row stride, in bytes, for a given number of
     *             columns.
     * 
     * To achieve best performance the optimal stride between rows of a matrix is not
     *             necessarily equivalent to the number of columns.  This method returns the row stride, in
     *             bytes, which gives best performance for a given number of columns.  Using this row stride
     *             to construct your array is recommended, but not required (provided that the stride
     *             used is still large enough to allocate a full row of data).
     * 
     * @param      columns         The number of columns in the matrix for which the recommended
     *                             row stride, in bytes, is to be determined.
     * 
     * @param      dataType        The type of matrix data values.
     */
    @Generated
    @Selector("rowBytesFromColumns:dataType:")
    @NUInt
    public static native long rowBytesFromColumnsDataType(@NUInt long columns, int dataType);

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
     * [@property]   columns
     * 
     * The number of columns in a matrix.
     */
    @Generated
    @Selector("columns")
    @NUInt
    public native long columns();

    /**
     * [@property]   dataType
     * 
     * The type of the data which makes up the values of the matrix.
     */
    @Generated
    @Selector("dataType")
    public native int dataType();

    @Generated
    @Selector("init")
    public native MPSMatrixDescriptor init();

    /**
     * [@property]   rowBytes
     * 
     * The stride, in bytes, between corresponding elements of
     *             consecutive rows.  Must be a multiple of the element size.
     */
    @Generated
    @Selector("rowBytes")
    @NUInt
    public native long rowBytes();

    /**
     * [@property]   rows
     * 
     * The number of rows in a matrix.
     */
    @Generated
    @Selector("rows")
    @NUInt
    public native long rows();

    /**
     * [@property]   columns
     * 
     * The number of columns in a matrix.
     */
    @Generated
    @Selector("setColumns:")
    public native void setColumns(@NUInt long value);

    /**
     * [@property]   dataType
     * 
     * The type of the data which makes up the values of the matrix.
     */
    @Generated
    @Selector("setDataType:")
    public native void setDataType(int value);

    /**
     * [@property]   rowBytes
     * 
     * The stride, in bytes, between corresponding elements of
     *             consecutive rows.  Must be a multiple of the element size.
     */
    @Generated
    @Selector("setRowBytes:")
    public native void setRowBytes(@NUInt long value);

    /**
     * [@property]   rows
     * 
     * The number of rows in a matrix.
     */
    @Generated
    @Selector("setRows:")
    public native void setRows(@NUInt long value);

    /**
     * [@property]   matrices
     * 
     * The number of matrices.
     */
    @Generated
    @Selector("matrices")
    @NUInt
    public native long matrices();

    /**
     * [@property]   matrixBytes
     * 
     * The stride, in bytes, between corresponding elements of
     *             consecutive matrices.  Must be a multiple of rowBytes.
     */
    @Generated
    @Selector("matrixBytes")
    @NUInt
    public native long matrixBytes();

    /**
     * Create a MPSMatrixDescriptor with the specified dimensions and data type.
     * 
     * For performance considerations the optimal row stride may not necessarily be equal
     *             to the number of columns in the matrix.  The MPSMatrix class provides a method which
     *             may be used to determine this value, see the rowBytesForColumns API in the MPSMatrix
     *             class.
     * 
     * @param      rows                The number of rows of a single matrix.
     * 
     * @param      columns             The number of columns of a single matrix.
     * 
     * @param      matrices            The number of matrices in the MPSMatrix object.
     * 
     * @param      rowBytes            The number of bytes between starting elements of consecutive
     *                                 rows.  Must be a multiple of the element size.
     * 
     * @param      matrixBytes         The number of bytes between starting elements of consecutive
     *                                 matrices.  Must be a multiple of rowBytes.
     * 
     * @param      dataType            The type of the data to be stored in the matrix.
     */
    @Generated
    @Selector("matrixDescriptorWithRows:columns:matrices:rowBytes:matrixBytes:dataType:")
    public static native MPSMatrixDescriptor matrixDescriptorWithRowsColumnsMatricesRowBytesMatrixBytesDataType(
            @NUInt long rows, @NUInt long columns, @NUInt long matrices, @NUInt long rowBytes, @NUInt long matrixBytes,
            int dataType);

    @Generated
    @Selector("matrixDescriptorWithRows:columns:rowBytes:dataType:")
    public static native MPSMatrixDescriptor matrixDescriptorWithRowsColumnsRowBytesDataType(@NUInt long rows,
            @NUInt long columns, @NUInt long rowBytes, int dataType);

    @Generated
    @Selector("rowBytesForColumns:dataType:")
    @NUInt
    public static native long rowBytesForColumnsDataType(@NUInt long columns, int dataType);
}

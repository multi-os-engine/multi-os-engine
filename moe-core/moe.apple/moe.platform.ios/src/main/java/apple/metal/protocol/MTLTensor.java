package apple.metal.protocol;

import apple.metal.MTLTensorExtents;
import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A resource representing a multi-dimensional array that you can use with machine learning workloads.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTensor")
public interface MTLTensor extends MTLResource {
    /**
     * A buffer instance this tensor shares its storage with or nil if this tensor does not wrap an underlying buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLBuffer buffer();

    /**
     * An offset, in bytes, into the buffer instance this tensor shares its storage with, or zero if this tensor does
     * not wrap an underlying buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("bufferOffset")
    @NUInt
    long bufferOffset();

    /**
     * An underlying data format of this tensor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dataType")
    @NInt
    long dataType();

    /**
     * An array of sizes, in elements, one for each dimension of this tensor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dimensions")
    @NotNull
    MTLTensorExtents dimensions();

    /**
     * Copies the data corresponding to a slice of this tensor into a pointer you provide.
     * 
     * - Parameters:
     * - bytes: A pointer to bytes of data that this method copies into the slice you specify with `sliceOrigin` and
     * `sliceDimensions`.
     * - strides: An array of strides, in elements, that describes the layout of the data in `bytes`. You are
     * responsible for ensuring `strides` meets the following requirements:
     * - Elements of `strides`are in monotonically non-decreasing order.
     * - For any `i` larger than zero, `strides[i]` is greater than or equal to `strides[i-1] * dimensions[i-1]`.
     * - sliceOrigin: An array of offsets, in elements, to the first element of the slice that this method reads data
     * from.
     * - sliceDimensions: An array of sizes, in elements, of the slice this method reads data from.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("getBytes:strides:fromSliceOrigin:sliceDimensions:")
    void getBytesStridesFromSliceOriginSliceDimensions(@NotNull VoidPtr bytes, @NotNull MTLTensorExtents strides,
            @NotNull MTLTensorExtents sliceOrigin, @NotNull MTLTensorExtents sliceDimensions);

    /**
     * A handle that represents the GPU resource, which you can store in an argument buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();

    /**
     * Replaces the contents of a slice of this tensor with data you provide.
     * 
     * - Parameters:
     * - sliceOrigin: An array of offsets, in elements, to the first element of the slice that this method writes data
     * to.
     * - sliceDimensions: An array of sizes, in elements, of the slice this method writes data to.
     * - bytes: A pointer to bytes of data that this method copies into the slice you specify with `sliceOrigin` and
     * `sliceDimensions`.
     * - strides: An array of strides, in elements, that describes the layout of the data in `bytes`. You are
     * responsible for ensuring `strides` meets the following requirements:
     * - Elements of `strides`are in monotonically non-decreasing order.
     * - For any `i` larger than zero, `strides[i]` is greater than or equal to `strides[i-1] * dimensions[i-1]`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("replaceSliceOrigin:sliceDimensions:withBytes:strides:")
    void replaceSliceOriginSliceDimensionsWithBytesStrides(@NotNull MTLTensorExtents sliceOrigin,
            @NotNull MTLTensorExtents sliceDimensions, @NotNull ConstVoidPtr bytes, @NotNull MTLTensorExtents strides);

    /**
     * An array of strides, in elements, one for each dimension of this tensor.
     * 
     * This property only applies if this tensor shares its storage with a buffer, otherwise it's nil.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("strides")
    @Nullable
    MTLTensorExtents strides();

    /**
     * A set of contexts in which you can use this tensor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("usage")
    @NUInt
    long usage();
}
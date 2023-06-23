package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphPoolingReturnIndicesMode
 * 
 * Flattening mode for returned indices with max pooling
 * 
 * [@constant] MPSGraphPoolingReturnIndicesNone No indices returned
 * [@constant] MPSGraphPoolingReturnIndicesGlobalFlatten1D Return indices flattened in inner most (last) dimension
 * [@constant] MPSGraphPoolingReturnIndicesGlobalFlatten2D Return indices flattened in 2 innermost dimensions. eg: HW in
 * NCHW
 * [@constant] MPSGraphPoolingReturnIndicesGlobalFlatten3D Return indices flattened in 3 innernost dimensions. eg: HWC
 * in NHWC
 * [@constant] MPSGraphPoolingReturnIndicesGlobalFlatten4D Return indices flattened in 4 innermost dimensions.
 * [@constant] MPSGraphPoolingReturnIndicesLocalFlatten1D Return indices within pooling window, flattened in inner most
 * dimension
 * [@constant] MPSGraphPoolingReturnIndicesLocalFlatten2D Return indices within pooling window, flattened in 2 innermost
 * dimensions. eg: HW in NCHW
 * [@constant] MPSGraphPoolingReturnIndicesLocalFlatten3D Return indices within pooling window, flattened in 3 innernost
 * dimensions. eg: HWC in NHWC
 * [@constant] MPSGraphPoolingReturnIndicesLocalFlatten4D Return indices within pooling window, flattened in 4 innermost
 * dimensions.
 */
@Generated
public final class MPSGraphPoolingReturnIndicesMode {
    @Generated
    private MPSGraphPoolingReturnIndicesMode() {
    }

    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long GlobalFlatten1D = 0x0000000000000001L;
    @Generated @NUInt public static final long GlobalFlatten2D = 0x0000000000000002L;
    @Generated @NUInt public static final long GlobalFlatten3D = 0x0000000000000003L;
    @Generated @NUInt public static final long GlobalFlatten4D = 0x0000000000000004L;
    @Generated @NUInt public static final long LocalFlatten1D = 0x0000000000000005L;
    @Generated @NUInt public static final long LocalFlatten2D = 0x0000000000000006L;
    @Generated @NUInt public static final long LocalFlatten3D = 0x0000000000000007L;
    @Generated @NUInt public static final long LocalFlatten4D = 0x0000000000000008L;
}
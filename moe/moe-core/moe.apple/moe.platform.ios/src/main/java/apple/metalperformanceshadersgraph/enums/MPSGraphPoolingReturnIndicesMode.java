package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The flattening mode for returned indices with max pooling.
 */
@Generated
public final class MPSGraphPoolingReturnIndicesMode {
    @Generated
    private MPSGraphPoolingReturnIndicesMode() {
    }

    /**
     * No indices returned.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Returns indices flattened in inner most (last) dimension.
     */
    @Generated @NUInt public static final long GlobalFlatten1D = 0x0000000000000001L;
    /**
     * Returns indices flattened in 2 innermost dimensions. eg: HW in NCHW.
     */
    @Generated @NUInt public static final long GlobalFlatten2D = 0x0000000000000002L;
    /**
     * Returns indices flattened in 3 innernost dimensions. eg: HWC in NHWC.
     */
    @Generated @NUInt public static final long GlobalFlatten3D = 0x0000000000000003L;
    /**
     * Returns indices flattened in 4 innermost dimensions.
     */
    @Generated @NUInt public static final long GlobalFlatten4D = 0x0000000000000004L;
    /**
     * Returns indices within pooling window, flattened in inner most dimension.
     */
    @Generated @NUInt public static final long LocalFlatten1D = 0x0000000000000005L;
    /**
     * Returns indices within pooling window, flattened in 2 innermost dimensions. eg: HW in NCHW.
     */
    @Generated @NUInt public static final long LocalFlatten2D = 0x0000000000000006L;
    /**
     * Returns indices within pooling window, flattened in 3 innernost dimensions. eg: HWC in NHWC.
     */
    @Generated @NUInt public static final long LocalFlatten3D = 0x0000000000000007L;
    /**
     * Returns indices within pooling window, flattened in 4 innermost dimensions.
     */
    @Generated @NUInt public static final long LocalFlatten4D = 0x0000000000000008L;
}
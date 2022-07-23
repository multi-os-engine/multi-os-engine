package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphSparseStorageType
 * <p>
 * Sparse Storage options in graph
 * <p>
 * [@constant] MPSGraphSparseStorageCOO COO Storage
 * [@constant] MPSGraphSparseStorageCSC CSC Storage
 * [@constant] MPSGraphSparseStorageCSR CSR Storage
 */
@Generated
public final class MPSGraphSparseStorageType {
    @Generated
    private MPSGraphSparseStorageType() {
    }

    @Generated public static final long COO = 0x0000000000000000L;
    @Generated public static final long CSC = 0x0000000000000001L;
    @Generated public static final long CSR = 0x0000000000000002L;
}

package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphSparseStorageType
 * 
 * Sparse Storage options in graph
 * 
 * [@constant] MPSGraphSparseStorageCOO COO Storage
 * [@constant] MPSGraphSparseStorageCSC CSC Storage
 * [@constant] MPSGraphSparseStorageCSR CSR Storage
 */
@Generated
public final class MPSGraphSparseStorageType {
    @Generated
    private MPSGraphSparseStorageType() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated public static final long COO = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated public static final long CSC = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated public static final long CSR = 0x0000000000000002L;
}

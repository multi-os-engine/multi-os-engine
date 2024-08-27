package apple.fileprovider.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Type of the operation
 * 
 * API-Since: 16.0
 */
@Generated
public final class NSFileProviderTestingOperationType {
    @Generated
    private NSFileProviderTestingOperationType() {
    }

    /**
     * A testing operation of type Ingestion
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Ingestion = 0x0000000000000000L;
    /**
     * A testing operation of type Lookup
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Lookup = 0x0000000000000001L;
    /**
     * A testing operation of type Creation
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Creation = 0x0000000000000002L;
    /**
     * A testing operation of type Modification
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Modification = 0x0000000000000003L;
    /**
     * A testing operation of type Deletion
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Deletion = 0x0000000000000004L;
    /**
     * A testing operation of type ContentFetch
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ContentFetch = 0x0000000000000005L;
    /**
     * A testing operation of type ChildrenEnumeration
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ChildrenEnumeration = 0x0000000000000006L;
    /**
     * A testing operation of type CollisionResolution
     * 
     * API-Since: 16.0
     */
    @Generated @NInt public static final long CollisionResolution = 0x0000000000000007L;
}
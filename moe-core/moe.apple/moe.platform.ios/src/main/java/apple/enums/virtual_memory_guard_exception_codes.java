package apple.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Reasons for exception for virtual memory
 */
@Generated
public final class virtual_memory_guard_exception_codes {
    @Generated
    private virtual_memory_guard_exception_codes() {
    }

    @Generated public static final int DEALLOC_GAP = 0x00000001;
    @Generated public static final int RECLAIM_COPYIO_FAILURE = 0x00000002;
    @Generated public static final int RECLAIM_INDEX_FAILURE = 0x00000004;
    @Generated public static final int RECLAIM_DEALLOCATE_FAILURE = 0x00000008;
}
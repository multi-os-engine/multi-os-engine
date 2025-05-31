package apple.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class virtual_memory_guard_exception_code_t {
    @Generated
    private virtual_memory_guard_exception_code_t() {
    }

    @Generated public static final int DEALLOC_GAP = 0x00000001;
    @Generated public static final int RECLAIM_COPYIO_FAILURE = 0x00000002;
    @Generated public static final int SEC_LOOKUP_DENIED = 0x00000003;
    @Generated public static final int RECLAIM_INDEX_FAILURE = 0x00000004;
    @Generated public static final int SEC_RANGE_DENIED = 0x00000006;
    @Generated public static final int SEC_ACCESS_FAULT = 0x00000007;
    @Generated public static final int RECLAIM_DEALLOCATE_FAILURE = 0x00000008;
    @Generated public static final int SEC_COPY_DENIED = 0x00000010;
    @Generated public static final int SEC_SHARING_DENIED = 0x00000020;
    @Generated public static final int SEC_ASYNC_ACCESS_FAULT = 0x00000040;
}
package apple.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class virtual_memory_guard_exception_code_t {
    @Generated
    private virtual_memory_guard_exception_code_t() {
    }

    @Generated public static final int DEALLOC_GAP = 0x00000001;
    @Generated public static final int RECLAIM_COPYIO_FAILURE = 0x00000002;
    @Generated public static final int RECLAIM_INDEX_FAILURE = 0x00000004;
    @Generated public static final int SEC_ACCESS_FAULT = 0x00000062;
    @Generated public static final int RECLAIM_DEALLOCATE_FAILURE = 0x00000008;
    @Generated public static final int SEC_COPY_DENIED = 0x00000064;
    @Generated public static final int SEC_SHARING_DENIED = 0x00000065;
    @Generated public static final int SEC_ASYNC_ACCESS_FAULT = 0x00000063;
    @Generated public static final int RECLAIM_ACCOUNTING_FAILURE = 0x00000009;
    @Generated public static final int SEC_IOPL_ON_EXEC_PAGE = 0x0000000A;
    @Generated public static final int SEC_EXEC_ON_IOPL_PAGE = 0x0000000B;
    @Generated public static final int SEC_UPL_WRITE_ON_EXEC_REGION = 0x0000000C;
    @Generated public static final int MTE_SYNC_FAULT = 0x000000C8;
    @Generated public static final int MTE_ASYNC_USER_FAULT = 0x000000C9;
    @Generated public static final int MTE_ASYNC_KERN_FAULT = 0x000000CA;
}
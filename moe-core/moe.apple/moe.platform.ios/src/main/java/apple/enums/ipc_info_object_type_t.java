package apple.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class ipc_info_object_type_t {
    @Generated
    private ipc_info_object_type_t() {
    }

    @Generated public static final int NONE = 0x00000000;
    @Generated public static final int THREAD_CONTROL = 0x00000001;
    @Generated public static final int TASK_CONTROL = 0x00000002;
    @Generated public static final int HOST = 0x00000003;
    @Generated public static final int HOST_PRIV = 0x00000004;
    @Generated public static final int PROCESSOR = 0x00000005;
    @Generated public static final int PROCESSOR_SET = 0x00000006;
    @Generated public static final int PROCESSOR_SET_NAME = 0x00000007;
    @Generated public static final int TIMER = 0x00000008;
    @Generated public static final int PORT_SUBST_ONCE = 0x00000009;
    @Generated public static final int MIG = 0x0000000A;
    @Generated public static final int MEMORY_OBJECT = 0x0000000B;
    @Generated public static final int XMM_PAGER = 0x0000000C;
    @Generated public static final int XMM_KERNEL = 0x0000000D;
    @Generated public static final int XMM_REPLY = 0x0000000E;
    @Generated public static final int UND_REPLY = 0x0000000F;
    @Generated public static final int HOST_NOTIFY = 0x00000010;
    @Generated public static final int HOST_SECURITY = 0x00000011;
    @Generated public static final int LEDGER = 0x00000012;
    @Generated public static final int MAIN_DEVICE = 0x00000013;
    @Generated public static final int TASK_NAME = 0x00000014;
    @Generated public static final int SUBSYSTEM = 0x00000015;
    @Generated public static final int IO_DONE_QUEUE = 0x00000016;
    @Generated public static final int SEMAPHORE = 0x00000017;
    @Generated public static final int LOCK_SET = 0x00000018;
    @Generated public static final int CLOCK = 0x00000019;
    @Generated public static final int CLOCK_CTRL = 0x0000001A;
    @Generated public static final int IOKIT_IDENT = 0x0000001B;
    @Generated public static final int NAMED_ENTRY = 0x0000001C;
    @Generated public static final int IOKIT_CONNECT = 0x0000001D;
    @Generated public static final int IOKIT_OBJECT = 0x0000001E;
    @Generated public static final int UPL = 0x0000001F;
    @Generated public static final int MEM_OBJ_CONTROL = 0x00000020;
    @Generated public static final int AU_SESSIONPORT = 0x00000021;
    @Generated public static final int FILEPORT = 0x00000022;
    @Generated public static final int LABELH = 0x00000023;
    @Generated public static final int TASK_RESUME = 0x00000024;
    @Generated public static final int VOUCHER = 0x00000025;
    @Generated public static final int VOUCHER_ATTR_CONTROL = 0x00000026;
    @Generated public static final int WORK_INTERVAL = 0x00000027;
    @Generated public static final int UX_HANDLER = 0x00000028;
    @Generated public static final int UEXT_OBJECT = 0x00000029;
    @Generated public static final int ARCADE_REG = 0x0000002A;
    @Generated public static final int EVENTLINK = 0x0000002B;
    @Generated public static final int TASK_INSPECT = 0x0000002C;
    @Generated public static final int TASK_READ = 0x0000002D;
    @Generated public static final int THREAD_INSPECT = 0x0000002E;
    @Generated public static final int THREAD_READ = 0x0000002F;
    @Generated public static final int SUID_CRED = 0x00000030;
    @Generated public static final int HYPERVISOR = 0x00000031;
    @Generated public static final int TASK_ID_TOKEN = 0x00000032;
    @Generated public static final int TASK_FATAL = 0x00000033;
    @Generated public static final int KCDATA = 0x00000034;
    @Generated public static final int EXCLAVES_RESOURCE = 0x00000035;
    @Generated public static final int UNKNOWN = 0xFFFFFFFF;
}
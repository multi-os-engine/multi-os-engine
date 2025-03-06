package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class lockgroup_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public lockgroup_info() {
        super(lockgroup_info.class);
    }

    @Generated
    protected lockgroup_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 64)
    public native byte lockgroup_name(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 64)
    public native void setLockgroup_name(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long lockgroup_attr();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLockgroup_attr(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long lock_spin_cnt();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLock_spin_cnt(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long lock_spin_util_cnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setLock_spin_util_cnt(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long lock_spin_held_cnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setLock_spin_held_cnt(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long lock_spin_miss_cnt();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setLock_spin_miss_cnt(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long lock_spin_held_max();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setLock_spin_held_max(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long lock_spin_held_cum();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setLock_spin_held_cum(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long lock_mtx_cnt();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setLock_mtx_cnt(long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long lock_mtx_util_cnt();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setLock_mtx_util_cnt(long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long lock_mtx_held_cnt();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setLock_mtx_held_cnt(long value);

    @Generated
    @StructureField(order = 11, isGetter = true)
    public native long lock_mtx_miss_cnt();

    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setLock_mtx_miss_cnt(long value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native long lock_mtx_wait_cnt();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setLock_mtx_wait_cnt(long value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native long lock_mtx_held_max();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setLock_mtx_held_max(long value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native long lock_mtx_held_cum();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setLock_mtx_held_cum(long value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native long lock_mtx_wait_max();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setLock_mtx_wait_max(long value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native long lock_mtx_wait_cum();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setLock_mtx_wait_cum(long value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native long lock_rw_cnt();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setLock_rw_cnt(long value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native long lock_rw_util_cnt();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setLock_rw_util_cnt(long value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native long lock_rw_held_cnt();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setLock_rw_held_cnt(long value);

    @Generated
    @StructureField(order = 20, isGetter = true)
    public native long lock_rw_miss_cnt();

    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setLock_rw_miss_cnt(long value);

    @Generated
    @StructureField(order = 21, isGetter = true)
    public native long lock_rw_wait_cnt();

    @Generated
    @StructureField(order = 21, isGetter = false)
    public native void setLock_rw_wait_cnt(long value);

    @Generated
    @StructureField(order = 22, isGetter = true)
    public native long lock_rw_held_max();

    @Generated
    @StructureField(order = 22, isGetter = false)
    public native void setLock_rw_held_max(long value);

    @Generated
    @StructureField(order = 23, isGetter = true)
    public native long lock_rw_held_cum();

    @Generated
    @StructureField(order = 23, isGetter = false)
    public native void setLock_rw_held_cum(long value);

    @Generated
    @StructureField(order = 24, isGetter = true)
    public native long lock_rw_wait_max();

    @Generated
    @StructureField(order = 24, isGetter = false)
    public native void setLock_rw_wait_max(long value);

    @Generated
    @StructureField(order = 25, isGetter = true)
    public native long lock_rw_wait_cum();

    @Generated
    @StructureField(order = 25, isGetter = false)
    public native void setLock_rw_wait_cum(long value);
}
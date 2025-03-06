package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class processor_cpu_stat extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_cpu_stat() {
        super(processor_cpu_stat.class);
    }

    @Generated
    protected processor_cpu_stat(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int irq_ex_cnt();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIrq_ex_cnt(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ipi_cnt();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIpi_cnt(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int timer_cnt();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTimer_cnt(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int undef_ex_cnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUndef_ex_cnt(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int unaligned_cnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUnaligned_cnt(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int vfp_cnt();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setVfp_cnt(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int vfp_shortv_cnt();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setVfp_shortv_cnt(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int data_ex_cnt();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setData_ex_cnt(int value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int instr_ex_cnt();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInstr_ex_cnt(int value);
}
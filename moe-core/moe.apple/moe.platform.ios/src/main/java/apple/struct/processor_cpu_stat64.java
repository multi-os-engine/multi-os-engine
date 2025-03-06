package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class processor_cpu_stat64 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public processor_cpu_stat64() {
        super(processor_cpu_stat64.class);
    }

    @Generated
    protected processor_cpu_stat64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long irq_ex_cnt();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIrq_ex_cnt(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long ipi_cnt();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIpi_cnt(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long timer_cnt();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTimer_cnt(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long undef_ex_cnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUndef_ex_cnt(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long unaligned_cnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUnaligned_cnt(long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long vfp_cnt();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setVfp_cnt(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long vfp_shortv_cnt();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setVfp_shortv_cnt(long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long data_ex_cnt();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setData_ex_cnt(long value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long instr_ex_cnt();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setInstr_ex_cnt(long value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long pmi_cnt();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setPmi_cnt(long value);
}
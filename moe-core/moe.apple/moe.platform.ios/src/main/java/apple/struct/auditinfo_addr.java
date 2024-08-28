package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class auditinfo_addr extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public auditinfo_addr() {
        super(auditinfo_addr.class);
    }

    @Generated
    protected auditinfo_addr(Pointer peer) {
        super(peer);
    }

    /**
     * Audit user ID.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int ai_auid();

    /**
     * Audit user ID.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setAi_auid(int value);

    /**
     * Audit masks.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native au_mask ai_mask();

    /**
     * Audit masks.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setAi_mask(@ByValue au_mask value);

    /**
     * Terminal ID.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native au_tid_addr ai_termid();

    /**
     * Terminal ID.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAi_termid(@ByValue au_tid_addr value);

    /**
     * Audit session ID.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int ai_asid();

    /**
     * Audit session ID.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAi_asid(int value);

    /**
     * Audit session flags.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long ai_flags();

    /**
     * Audit session flags.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAi_flags(long value);
}
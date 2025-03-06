package apple.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;

@Generated
@Structure()
public final class mig_symtab extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mig_symtab() {
        super(mig_symtab.class);
    }

    @Generated
    protected mig_symtab(Pointer peer) {
        super(peer);
    }

    @Generated
    public mig_symtab(BytePtr ms_routine_name, int ms_routine_number,
            @FunctionPtr(name = "call_ms_routine") Function_ms_routine ms_routine) {
        super(mig_symtab.class);
        setMs_routine_name(ms_routine_name);
        setMs_routine_number(ms_routine_number);
        setMs_routine(ms_routine);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native BytePtr ms_routine_name();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMs_routine_name(BytePtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ms_routine_number();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMs_routine_number(int value);

    /**
     * Since the functions in the
     * symbol table have unknown
     * signatures, this is the best
     * we can do...
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_ms_routine")
    public native Function_ms_routine ms_routine();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ms_routine {
        @Generated
        void call_ms_routine();
    }

    /**
     * Since the functions in the
     * symbol table have unknown
     * signatures, this is the best
     * we can do...
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMs_routine(@FunctionPtr(name = "call_ms_routine") Function_ms_routine value);
}
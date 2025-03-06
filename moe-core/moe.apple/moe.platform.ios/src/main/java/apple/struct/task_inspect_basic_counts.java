package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_inspect_basic_counts extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_inspect_basic_counts() {
        super(task_inspect_basic_counts.class);
    }

    @Generated
    protected task_inspect_basic_counts(Pointer peer) {
        super(peer);
    }

    @Generated
    public task_inspect_basic_counts(long instructions, long cycles) {
        super(task_inspect_basic_counts.class);
        setInstructions(instructions);
        setCycles(cycles);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long instructions();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setInstructions(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long cycles();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCycles(long value);
}
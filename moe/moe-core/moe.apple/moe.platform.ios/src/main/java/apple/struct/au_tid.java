package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class au_tid extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public au_tid() {
        super(au_tid.class);
    }

    @Generated
    protected au_tid(Pointer peer) {
        super(peer);
    }

    @Generated
    public au_tid(int port, int machine) {
        super(au_tid.class);
        setPort(port);
        setMachine(machine);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int port();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setPort(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int machine();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMachine(int value);
}
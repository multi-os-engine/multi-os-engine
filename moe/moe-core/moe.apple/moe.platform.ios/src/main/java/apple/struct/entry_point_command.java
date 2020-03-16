package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class entry_point_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public entry_point_command() {
        super(entry_point_command.class);
    }

    @Generated
    protected entry_point_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public entry_point_command(int cmd, int cmdsize, long entryoff, long stacksize) {
        super(entry_point_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setEntryoff(entryoff);
        setStacksize(stacksize);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long entryoff();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEntryoff(long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long stacksize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setStacksize(long value);
}
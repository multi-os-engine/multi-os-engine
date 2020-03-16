package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class linkedit_data_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public linkedit_data_command() {
        super(linkedit_data_command.class);
    }

    @Generated
    protected linkedit_data_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public linkedit_data_command(int cmd, int cmdsize, int dataoff, int datasize) {
        super(linkedit_data_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setDataoff(dataoff);
        setDatasize(datasize);
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
    public native int dataoff();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDataoff(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int datasize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDatasize(int value);
}
package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class prebind_cksum_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public prebind_cksum_command() {
        super(prebind_cksum_command.class);
    }

    @Generated
    protected prebind_cksum_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public prebind_cksum_command(int cmd, int cmdsize, int cksum) {
        super(prebind_cksum_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setCksum(cksum);
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
    public native int cksum();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCksum(int value);
}
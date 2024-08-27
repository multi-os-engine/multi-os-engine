package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class load_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public load_command() {
        super(load_command.class);
    }

    @Generated
    protected load_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public load_command(int cmd, int cmdsize) {
        super(load_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
    }

    /**
     * type of load command
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * type of load command
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * total size of command in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * total size of command in bytes
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);
}
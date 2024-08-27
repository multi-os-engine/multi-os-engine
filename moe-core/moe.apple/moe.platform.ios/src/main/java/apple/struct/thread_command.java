package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class thread_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public thread_command() {
        super(thread_command.class);
    }

    @Generated
    protected thread_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public thread_command(int cmd, int cmdsize) {
        super(thread_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
    }

    /**
     * LC_THREAD or LC_UNIXTHREAD
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_THREAD or LC_UNIXTHREAD
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * total size of this command
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * total size of this command
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);
}
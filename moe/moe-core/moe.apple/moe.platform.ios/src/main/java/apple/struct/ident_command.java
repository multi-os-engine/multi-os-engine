package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ident_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public ident_command() {
        super(ident_command.class);
    }

    @Generated
    protected ident_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public ident_command(int cmd, int cmdsize) {
        super(ident_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
    }

    /**
     * LC_IDENT
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_IDENT
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * strings that follow this command
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * strings that follow this command
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);
}
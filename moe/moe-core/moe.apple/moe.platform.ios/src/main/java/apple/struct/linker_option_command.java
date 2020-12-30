package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class linker_option_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public linker_option_command() {
        super(linker_option_command.class);
    }

    @Generated
    protected linker_option_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public linker_option_command(int cmd, int cmdsize, int count) {
        super(linker_option_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setCount(count);
    }

    /**
     * LC_LINKER_OPTION only used in MH_OBJECT filetypes
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_LINKER_OPTION only used in MH_OBJECT filetypes
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * number of strings
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int count();

    /**
     * number of strings
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setCount(int value);
}
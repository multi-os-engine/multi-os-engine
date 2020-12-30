package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class twolevel_hints_command extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public twolevel_hints_command() {
        super(twolevel_hints_command.class);
    }

    @Generated
    protected twolevel_hints_command(Pointer peer) {
        super(peer);
    }

    @Generated
    public twolevel_hints_command(int cmd, int cmdsize, int offset, int nhints) {
        super(twolevel_hints_command.class);
        setCmd(cmd);
        setCmdsize(cmdsize);
        setOffset(offset);
        setNhints(nhints);
    }

    /**
     * LC_TWOLEVEL_HINTS
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_TWOLEVEL_HINTS
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct twolevel_hints_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct twolevel_hints_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * offset to the hint table
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int offset();

    /**
     * offset to the hint table
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOffset(int value);

    /**
     * number of hints in the hint table
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int nhints();

    /**
     * number of hints in the hint table
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNhints(int value);
}
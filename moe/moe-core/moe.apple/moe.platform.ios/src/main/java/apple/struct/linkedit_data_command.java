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

    /**
     * LC_CODE_SIGNATURE, LC_SEGMENT_SPLIT_INFO,
     * LC_FUNCTION_STARTS, LC_DATA_IN_CODE,
     * LC_DYLIB_CODE_SIGN_DRS,
     * LC_LINKER_OPTIMIZATION_HINT,
     * LC_DYLD_EXPORTS_TRIE, or
     * LC_DYLD_CHAINED_FIXUPS. 
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int cmd();

    /**
     * LC_CODE_SIGNATURE, LC_SEGMENT_SPLIT_INFO,
     * LC_FUNCTION_STARTS, LC_DATA_IN_CODE,
     * LC_DYLIB_CODE_SIGN_DRS,
     * LC_LINKER_OPTIMIZATION_HINT,
     * LC_DYLD_EXPORTS_TRIE, or
     * LC_DYLD_CHAINED_FIXUPS. 
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCmd(int value);

    /**
     * sizeof(struct linkedit_data_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int cmdsize();

    /**
     * sizeof(struct linkedit_data_command)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCmdsize(int value);

    /**
     * file offset of data in __LINKEDIT segment
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int dataoff();

    /**
     * file offset of data in __LINKEDIT segment
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDataoff(int value);

    /**
     * file size of data in __LINKEDIT segment
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int datasize();

    /**
     * file size of data in __LINKEDIT segment
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDatasize(int value);
}
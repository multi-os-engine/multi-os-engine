package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ftrimactivefile extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public ftrimactivefile() {
        super(ftrimactivefile.class);
    }

    @Generated
    protected ftrimactivefile(Pointer peer) {
        super(peer);
    }

    @Generated
    public ftrimactivefile(long fta_offset, long fta_length) {
        super(ftrimactivefile.class);
        setFta_offset(fta_offset);
        setFta_length(fta_length);
    }

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long fta_offset();

    /**
     * IN: start of the region
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFta_offset(long value);

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long fta_length();

    /**
     * IN: size of the region
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFta_length(long value);
}
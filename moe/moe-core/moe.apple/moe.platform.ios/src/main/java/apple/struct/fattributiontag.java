package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fattributiontag extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public fattributiontag() {
        super(fattributiontag.class);
    }

    @Generated
    protected fattributiontag(Pointer peer) {
        super(peer);
    }

    /**
     * IN: flags word
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int ft_flags();

    /**
     * IN: flags word
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFt_flags(int value);

    /**
     * OUT: hash of attribution tag name
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long ft_hash();

    /**
     * OUT: hash of attribution tag name
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFt_hash(long value);

    /**
     * IN/OUT: attribution tag name associated with the file
     */
    @Generated
    @StructureField(order = 2, isGetter = true, count = 255)
    public native byte ft_attribution_name(int field_idx);

    /**
     * IN/OUT: attribution tag name associated with the file
     */
    @Generated
    @StructureField(order = 2, isGetter = false, count = 255)
    public native void setFt_attribution_name(byte value, int field_idx);
}
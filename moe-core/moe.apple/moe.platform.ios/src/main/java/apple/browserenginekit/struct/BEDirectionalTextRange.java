package apple.browserenginekit.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class BEDirectionalTextRange extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public BEDirectionalTextRange() {
        super(BEDirectionalTextRange.class);
    }

    @Generated
    protected BEDirectionalTextRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public BEDirectionalTextRange(@NInt long offset, @NInt long length) {
        super(BEDirectionalTextRange.class);
        setOffset(offset);
        setLength(length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long offset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOffset(@NInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(@NInt long value);
}
package apple.coremedia.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CMTag extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CMTag() {
        super(CMTag.class);
    }

    @Generated
    protected CMTag(Pointer peer) {
        super(peer);
    }

    @Generated
    public CMTag(int category, int dataType, long value) {
        super(CMTag.class);
        setCategory(category);
        setDataType(dataType);
        setValue(value);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int category();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCategory(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int dataType();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDataType(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long value();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setValue(long value);
}
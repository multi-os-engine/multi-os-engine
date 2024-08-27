package apple.corefoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CGRect extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGRect() {
        super(CGRect.class);
    }

    @Generated
    protected CGRect(Pointer peer) {
        super(peer);
    }

    @Generated
    public CGRect(@ByValue CGPoint origin, @ByValue CGSize size) {
        super(CGRect.class);
        setOrigin(origin);
        setSize(size);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native CGPoint origin();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOrigin(@ByValue CGPoint value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CGSize size();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(@ByValue CGSize value);
}
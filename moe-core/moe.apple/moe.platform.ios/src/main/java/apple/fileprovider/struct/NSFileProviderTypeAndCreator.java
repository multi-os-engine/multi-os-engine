package apple.fileprovider.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class NSFileProviderTypeAndCreator extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public NSFileProviderTypeAndCreator() {
        super(NSFileProviderTypeAndCreator.class);
    }

    @Generated
    protected NSFileProviderTypeAndCreator(Pointer peer) {
        super(peer);
    }

    @Generated
    public NSFileProviderTypeAndCreator(int type, int creator) {
        super(NSFileProviderTypeAndCreator.class);
        setType(type);
        setCreator(creator);
    }

    /**
     * The first word of the FinderInfo structure. It matches the file type code
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int type();

    /**
     * The first word of the FinderInfo structure. It matches the file type code
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setType(int value);

    /**
     * The second word of the FinderInfo structure. It matches the creator code
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int creator();

    /**
     * The second word of the FinderInfo structure. It matches the creator code
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCreator(int value);
}

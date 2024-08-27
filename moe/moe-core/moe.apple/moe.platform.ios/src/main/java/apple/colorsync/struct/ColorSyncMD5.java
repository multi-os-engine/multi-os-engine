package apple.colorsync.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ColorSyncMD5 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ColorSyncMD5() {
        super(ColorSyncMD5.class);
    }

    @Generated
    protected ColorSyncMD5(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte digest(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setDigest(byte value, int field_idx);
}
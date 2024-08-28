package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLMapIndirectArguments extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLMapIndirectArguments() {
        super(MTLMapIndirectArguments.class);
    }

    @Generated
    protected MTLMapIndirectArguments(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int regionOriginX();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRegionOriginX(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int regionOriginY();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRegionOriginY(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int regionOriginZ();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRegionOriginZ(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int regionSizeWidth();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRegionSizeWidth(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int regionSizeHeight();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setRegionSizeHeight(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int regionSizeDepth();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRegionSizeDepth(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mipMapLevel();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMipMapLevel(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int sliceId();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setSliceId(int value);
}
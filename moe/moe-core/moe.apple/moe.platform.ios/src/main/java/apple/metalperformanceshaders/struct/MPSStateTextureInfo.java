package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MPSStateTextureInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSStateTextureInfo() {
        super(MPSStateTextureInfo.class);
    }

    @Generated
    protected MPSStateTextureInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long width();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWidth(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long height();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long depth();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDepth(@NUInt long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long arrayLength();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setArrayLength(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long pixelFormat();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPixelFormat(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long textureType();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTextureType(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NUInt
    public native long usage();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setUsage(@NUInt long value);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 4)
    public native long _reserved(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 4)
    public native void set_reserved(long value, int field_idx);
}
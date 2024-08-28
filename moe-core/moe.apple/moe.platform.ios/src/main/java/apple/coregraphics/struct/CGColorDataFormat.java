package apple.coregraphics.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NFloatPtr;

@Generated
@Structure()
public final class CGColorDataFormat extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CGColorDataFormat() {
        super(CGColorDataFormat.class);
    }

    @Generated
    protected CGColorDataFormat(Pointer peer) {
        super(peer);
    }

    /**
     * current version = 0
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    /**
     * current version = 0
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    /**
     * one of:
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native ConstVoidPtr colorspace_info();

    /**
     * one of:
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setColorspace_info(ConstVoidPtr value);

    /**
     * see CGImage.h
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int bitmap_info();

    /**
     * see CGImage.h
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBitmap_info(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long bits_per_component();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBits_per_component(@NUInt long value);

    /**
     * can be 0, if data is pixel aligned
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long bytes_per_row();

    /**
     * can be 0, if data is pixel aligned
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBytes_per_row(@NUInt long value);

    /**
     * set to kCGRenderingIntentDefault if unknown
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int intent();

    /**
     * set to kCGRenderingIntentDefault if unknown
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIntent(int value);

    /**
     * pass NULL; reserved for future use
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native NFloatPtr decode();

    /**
     * pass NULL; reserved for future use
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setDecode(NFloatPtr value);
}

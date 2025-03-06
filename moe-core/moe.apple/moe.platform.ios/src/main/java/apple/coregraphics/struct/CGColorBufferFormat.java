package apple.coregraphics.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class CGColorBufferFormat extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGColorBufferFormat() {
        super(CGColorBufferFormat.class);
    }

    @Generated
    protected CGColorBufferFormat(Pointer peer) {
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
     * see CGImage.h
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int bitmapInfo();

    /**
     * see CGImage.h
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBitmapInfo(int value);

    /**
     * only 8, 10, 16 fixed, 16 bit float and 32 bit float are supported
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long bitsPerComponent();

    /**
     * only 8, 10, 16 fixed, 16 bit float and 32 bit float are supported
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBitsPerComponent(@NUInt long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long bitsPerPixel();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBitsPerPixel(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long bytesPerRow();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBytesPerRow(@NUInt long value);
}
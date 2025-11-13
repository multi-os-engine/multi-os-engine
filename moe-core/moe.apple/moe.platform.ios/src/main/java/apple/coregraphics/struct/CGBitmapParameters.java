package apple.coregraphics.struct;

import apple.coregraphics.opaque.CGColorSpaceRef;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class CGBitmapParameters extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public CGBitmapParameters() {
        super(CGBitmapParameters.class);
    }

    @Generated
    protected CGBitmapParameters(Pointer peer) {
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
    public native long bytesPerPixel();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setBytesPerPixel(@NUInt long value);

    /**
     * Rounded up to an appropriate value for bitmap data
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long alignedBytesPerRow();

    /**
     * Rounded up to an appropriate value for bitmap data
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setAlignedBytesPerRow(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int component();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setComponent(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int layout();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setLayout(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int format();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setFormat(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NotNull
    public native CGColorSpaceRef colorSpace();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setColorSpace(@NotNull CGColorSpaceRef value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native boolean hasPremultipliedAlpha();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setHasPremultipliedAlpha(boolean value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    @NInt
    public native long byteOrder();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setByteOrder(@NInt long value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float edrTargetHeadroom();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setEdrTargetHeadroom(float value);
}
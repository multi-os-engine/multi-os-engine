package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVCaptionSize extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AVCaptionSize() {
        super(AVCaptionSize.class);
    }

    @Generated
    protected AVCaptionSize(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVCaptionSize(@ByValue AVCaptionDimension width, @ByValue AVCaptionDimension height) {
        super(AVCaptionSize.class);
        setWidth(width);
        setHeight(height);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AVCaptionDimension width();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setWidth(@ByValue AVCaptionDimension value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native AVCaptionDimension height();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setHeight(@ByValue AVCaptionDimension value);
}
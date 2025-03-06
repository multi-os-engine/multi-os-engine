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
public final class AVCaptionPoint extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AVCaptionPoint() {
        super(AVCaptionPoint.class);
    }

    @Generated
    protected AVCaptionPoint(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVCaptionPoint(@ByValue AVCaptionDimension x, @ByValue AVCaptionDimension y) {
        super(AVCaptionPoint.class);
        setX(x);
        setY(y);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AVCaptionDimension x();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@ByValue AVCaptionDimension value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native AVCaptionDimension y();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@ByValue AVCaptionDimension value);
}
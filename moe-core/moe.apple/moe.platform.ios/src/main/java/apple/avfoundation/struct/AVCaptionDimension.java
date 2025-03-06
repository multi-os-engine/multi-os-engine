package apple.avfoundation.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;

@Generated
@Structure()
public final class AVCaptionDimension extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public AVCaptionDimension() {
        super(AVCaptionDimension.class);
    }

    @Generated
    protected AVCaptionDimension(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVCaptionDimension(@NFloat double value, @NInt long units) {
        super(AVCaptionDimension.class);
        setValue(value);
        setUnits(units);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NFloat
    public native double value();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setValue(@NFloat double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NInt
    public native long units();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUnits(@NInt long value);
}
package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioValueRange extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioValueRange() {
        super(AudioValueRange.class);
    }

    @Generated
    protected AudioValueRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioValueRange(double mMinimum, double mMaximum) {
        super(AudioValueRange.class);
        setMMinimum(mMinimum);
        setMMaximum(mMaximum);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double mMinimum();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMMinimum(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double mMaximum();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMMaximum(double value);
}
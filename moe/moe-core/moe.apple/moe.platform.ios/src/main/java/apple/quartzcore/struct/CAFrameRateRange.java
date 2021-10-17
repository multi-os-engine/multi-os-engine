package apple.quartzcore.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CAFrameRateRange extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CAFrameRateRange() {
        super(CAFrameRateRange.class);
    }

    @Generated
    protected CAFrameRateRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public CAFrameRateRange(float minimum, float maximum, float preferred) {
        super(CAFrameRateRange.class);
        setMinimum(minimum);
        setMaximum(maximum);
        setPreferred(preferred);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native float minimum();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMinimum(float value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float maximum();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMaximum(float value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native float preferred();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPreferred(float value);
}

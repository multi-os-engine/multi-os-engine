package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSIntegerDivisionParams extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSIntegerDivisionParams() {
        super(MPSIntegerDivisionParams.class);
    }

    @Generated
    protected MPSIntegerDivisionParams(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSIntegerDivisionParams(char divisor, char recip, char addend, char shift) {
        super(MPSIntegerDivisionParams.class);
        setDivisor(divisor);
        setRecip(recip);
        setAddend(addend);
        setShift(shift);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native char divisor();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDivisor(char value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native char recip();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRecip(char value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native char addend();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddend(char value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native char shift();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setShift(char value);
}
package apple.avfaudio.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AVBeatRange extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AVBeatRange() {
        super(AVBeatRange.class);
    }

    @Generated
    protected AVBeatRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public AVBeatRange(double start, double length) {
        super(AVBeatRange.class);
        setStart(start);
        setLength(length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double start();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setStart(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native double length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(double value);
}

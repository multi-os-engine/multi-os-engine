package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MPSImageCoordinate extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSImageCoordinate() {
        super(MPSImageCoordinate.class);
    }

    @Generated
    protected MPSImageCoordinate(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSImageCoordinate(@NUInt long x, @NUInt long y, @NUInt long channel) {
        super(MPSImageCoordinate.class);
        setX(x);
        setY(y);
        setChannel(channel);
    }

    /**
     * < The horizontal component of the coordinate. Units: pixels
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long x();

    /**
     * < The horizontal component of the coordinate. Units: pixels
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setX(@NUInt long value);

    /**
     * < The vertical component of the coordinate. Units: pixels
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long y();

    /**
     * < The vertical component of the coordinate. Units: pixels
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setY(@NUInt long value);

    /**
     * < The index of the channel or feature channel within the pixel
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long channel();

    /**
     * < The index of the channel or feature channel within the pixel
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setChannel(@NUInt long value);
}
package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSImageRegion extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSImageRegion() {
        super(MPSImageRegion.class);
    }

    @Generated
    protected MPSImageRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSImageRegion(@ByValue MPSImageCoordinate offset, @ByValue MPSImageCoordinate size) {
        super(MPSImageRegion.class);
        setOffset(offset);
        setSize(size);
    }

    /**
     * < The position of the top left corner of the subregion
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MPSImageCoordinate offset();

    /**
     * < The position of the top left corner of the subregion
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOffset(@ByValue MPSImageCoordinate value);

    /**
     * < The size {pixels, pixels, channels} of the subregion
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MPSImageCoordinate size();

    /**
     * < The size {pixels, pixels, channels} of the subregion
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSize(@ByValue MPSImageCoordinate value);
}
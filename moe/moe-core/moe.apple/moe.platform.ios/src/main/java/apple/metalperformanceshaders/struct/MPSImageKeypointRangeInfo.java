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
public final class MPSImageKeypointRangeInfo extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSImageKeypointRangeInfo() {
        super(MPSImageKeypointRangeInfo.class);
    }

    @Generated
    protected MPSImageKeypointRangeInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public MPSImageKeypointRangeInfo(@NUInt long maximumKeypoints, float minimumThresholdValue) {
        super(MPSImageKeypointRangeInfo.class);
        setMaximumKeypoints(maximumKeypoints);
        setMinimumThresholdValue(minimumThresholdValue);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long maximumKeypoints();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMaximumKeypoints(@NUInt long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float minimumThresholdValue();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinimumThresholdValue(float value);
}
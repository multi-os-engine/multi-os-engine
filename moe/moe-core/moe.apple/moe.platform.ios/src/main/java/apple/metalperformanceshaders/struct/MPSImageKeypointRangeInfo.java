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

    /**
     * < maximum number of keypoints
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long maximumKeypoints();

    /**
     * < maximum number of keypoints
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMaximumKeypoints(@NUInt long value);

    /**
     * < minimum threshold value -  value between 0.0 and 1.0f
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native float minimumThresholdValue();

    /**
     * < minimum threshold value -  value between 0.0 and 1.0f
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMinimumThresholdValue(float value);
}
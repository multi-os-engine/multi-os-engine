package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLIndirectAccelerationStructureMotionInstanceDescriptor extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLIndirectAccelerationStructureMotionInstanceDescriptor() {
        super(MTLIndirectAccelerationStructureMotionInstanceDescriptor.class);
    }

    @Generated
    protected MTLIndirectAccelerationStructureMotionInstanceDescriptor(Pointer peer) {
        super(peer);
    }

    /**
     * Instance options
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int options();

    /**
     * Instance options
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setOptions(int value);

    /**
     * Instance mask used to ignore geometry during ray tracing
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int mask();

    /**
     * Instance mask used to ignore geometry during ray tracing
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMask(int value);

    /**
     * Used to index into intersection function tables
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int intersectionFunctionTableOffset();

    /**
     * Used to index into intersection function tables
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIntersectionFunctionTableOffset(int value);

    /**
     * User-assigned instance ID to help identify this instance in an
     * application-defined way
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int userID();

    /**
     * User-assigned instance ID to help identify this instance in an
     * application-defined way
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setUserID(int value);

    /**
     * Acceleration structure resource handle to use for this instance
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native MTLResourceID accelerationStructureID();

    /**
     * Acceleration structure resource handle to use for this instance
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setAccelerationStructureID(@ByValue MTLResourceID value);

    /**
     * The index of the first set of transforms describing one keyframe of the animation.
     * These transforms are stored in a separate buffer and they are uniformly distributed over
     * time time span of the motion.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int motionTransformsStartIndex();

    /**
     * The index of the first set of transforms describing one keyframe of the animation.
     * These transforms are stored in a separate buffer and they are uniformly distributed over
     * time time span of the motion.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMotionTransformsStartIndex(int value);

    /**
     * The count of motion transforms belonging to this motion which are stored in consecutive
     * memory addresses at the separate motionTransforms buffer.
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int motionTransformsCount();

    /**
     * The count of motion transforms belonging to this motion which are stored in consecutive
     * memory addresses at the separate motionTransforms buffer.
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMotionTransformsCount(int value);

    /**
     * Motion border mode describing what happens if acceleration structure is sampled
     * before motionStartTime
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int motionStartBorderMode();

    /**
     * Motion border mode describing what happens if acceleration structure is sampled
     * before motionStartTime
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMotionStartBorderMode(int value);

    /**
     * Motion border mode describing what happens if acceleration structure is sampled
     * after motionEndTime
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int motionEndBorderMode();

    /**
     * Motion border mode describing what happens if acceleration structure is sampled
     * after motionEndTime
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setMotionEndBorderMode(int value);

    /**
     * Motion start time of this instance
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native float motionStartTime();

    /**
     * Motion start time of this instance
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setMotionStartTime(float value);

    /**
     * Motion end time of this instance
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native float motionEndTime();

    /**
     * Motion end time of this instance
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setMotionEndTime(float value);
}
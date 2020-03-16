package apple.coreaudiotypes.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class AudioTimeStamp extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AudioTimeStamp() {
        super(AudioTimeStamp.class);
    }

    @Generated
    protected AudioTimeStamp(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native double mSampleTime();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMSampleTime(double value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long mHostTime();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMHostTime(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native double mRateScalar();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMRateScalar(double value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long mWordClockTime();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMWordClockTime(long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @ByValue
    public native SMPTETime mSMPTETime();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMSMPTETime(@ByValue SMPTETime value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int mFlags();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMFlags(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mReserved();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMReserved(int value);
}
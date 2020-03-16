package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class AudioTimeStampFlags {
    @Generated
    private AudioTimeStampFlags() {
    }

    @Generated public static final int NothingValid = 0x00000000;
    @Generated public static final int SampleTimeValid = 0x00000001;
    @Generated public static final int HostTimeValid = 0x00000002;
    @Generated public static final int RateScalarValid = 0x00000004;
    @Generated public static final int WordClockTimeValid = 0x00000008;
    @Generated public static final int SMPTETimeValid = 0x00000010;
    @Generated public static final int SampleHostTimeValid = 0x00000003;
}
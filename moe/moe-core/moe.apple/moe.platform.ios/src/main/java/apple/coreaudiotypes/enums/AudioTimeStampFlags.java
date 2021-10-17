package apple.coreaudiotypes.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]           AudioTimeStampFlags
 * <p>
 * The flags that indicate which fields in an AudioTimeStamp structure are valid.
 * [@constant]       kAudioTimeStampSampleTimeValid
 * The sample frame time is valid.
 * [@constant]       kAudioTimeStampHostTimeValid
 * The host time is valid.
 * [@constant]       kAudioTimeStampRateScalarValid
 * The rate scalar is valid.
 * [@constant]       kAudioTimeStampWordClockTimeValid
 * The word clock time is valid.
 * [@constant]       kAudioTimeStampSMPTETimeValid
 * The SMPTE time is valid.
 * [@constant]       kAudioTimeStampSampleHostTimeValid
 * The sample frame time and the host time are valid.
 */
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

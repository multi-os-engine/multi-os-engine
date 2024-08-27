package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAudioConverterPrimeMethod
 * 
 * values for the primeMethod property. See further discussion under AVAudioConverterPrimeInfo.
 */
@Generated
public final class AVAudioConverterPrimeMethod {
    @Generated
    private AVAudioConverterPrimeMethod() {
    }

    /**
     * Primes with leading + trailing input frames.
     */
    @Generated @NInt public static final long Pre = 0x0000000000000000L;
    /**
     * Only primes with trailing (zero latency). Leading frames are assumed to be silence.
     */
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    /**
     * Acts in "latency" mode. Both leading and trailing frames assumed to be silence.
     */
    @Generated @NInt public static final long None = 0x0000000000000002L;
}

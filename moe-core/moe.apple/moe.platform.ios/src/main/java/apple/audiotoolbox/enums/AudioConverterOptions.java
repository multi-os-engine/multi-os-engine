package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] AudioConverterOptions
 * [@constant] kAudioConverterOption_Unbuffered
 * This is an option for AudioConverterNewWithOptions which removes unnecessary
 * buffering, both for input and internally to the converter, saving memory
 * at the cost of reduced format support and usage restrictions:
 * 
 * - Input and output formats must be constant bit-rate, non-zero bytes per packet
 * (e.g. linear PCM, a-law, etc.) with the same sample rate and frames per packet.
 * - AudioConverterFillBuffer cannot be used.
 * - AudioConverterFillComplexBuffer cannot be used.
 */
@Generated
public final class AudioConverterOptions {
    @Generated
    private AudioConverterOptions() {
    }

    @Generated public static final int kAudioConverterOption_Unbuffered = 0x00010000;
}
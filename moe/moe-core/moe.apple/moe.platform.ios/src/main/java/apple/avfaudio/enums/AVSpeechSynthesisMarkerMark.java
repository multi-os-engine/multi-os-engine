package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Markers used in the output event callback. Used for providing metadata on synthesized audio.
 * 
 * API-Since: 16.0
 */
@Generated
public final class AVSpeechSynthesisMarkerMark {
    @Generated
    private AVSpeechSynthesisMarkerMark() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Phoneme = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Word = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Sentence = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Paragraph = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Bookmark = 0x0000000000000004L;
}
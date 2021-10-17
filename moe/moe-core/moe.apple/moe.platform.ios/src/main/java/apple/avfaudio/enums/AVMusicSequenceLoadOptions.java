package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] AVMusicSequenceLoadOptions
 * <p>
 * Determines whether data on different MIDI channels is mapped to multiple tracks, or
 * if the tracks are preserved as-is.
 * <p>
 * If AVMusicSequenceLoadSMF_ChannelsToTracks is set, the loaded MIDI Sequence will contain a
 * tempo track, one track for each MIDI channel that is found in the SMF, and one track for
 * SysEx and/or MetaEvents (this will be the last track in the sequence).
 * <p>
 * If AVMusicSequenceLoadSMF_ChannelsToTracks is not set, the loadad MIDI Sequence will
 * contain one track for each track that is found in the SMF, plus a tempo track (if not found
 * in the SMF).
 * <p>
 * API_AVAILABLE(macos(10.11), ios(9.0), watchos(2.0), tvos(9.0))
 */
@Generated
public final class AVMusicSequenceLoadOptions {
    @Generated
    private AVMusicSequenceLoadOptions() {
    }

    /**
     * 0x00
     */
    @Generated @NUInt public static final long PreserveTracks = 0x0000000000000000L;
    /**
     * 0x01
     */
    @Generated @NUInt public static final long ChannelsToTracks = 0x0000000000000001L;
}

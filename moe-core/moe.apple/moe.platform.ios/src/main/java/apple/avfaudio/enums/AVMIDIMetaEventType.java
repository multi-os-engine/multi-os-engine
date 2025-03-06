package apple.avfaudio.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVMIDIMetaEventType
 * 
 * Constants which indicate which type of MIDI Meta-Event to create.
 * 
 * API-Since: 16.0
 */
@Generated
public final class AVMIDIMetaEventType {
    @Generated
    private AVMIDIMetaEventType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long SequenceNumber = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Text = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Copyright = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TrackName = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Instrument = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Lyric = 0x0000000000000005L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Marker = 0x0000000000000006L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long CuePoint = 0x0000000000000007L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MidiChannel = 0x0000000000000020L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long MidiPort = 0x0000000000000021L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long EndOfTrack = 0x000000000000002FL;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Tempo = 0x0000000000000051L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long SmpteOffset = 0x0000000000000054L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long TimeSignature = 0x0000000000000058L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long KeySignature = 0x0000000000000059L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long ProprietaryEvent = 0x000000000000007FL;
}
package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDIUMPProtocolOptions
 * 
 * The UMP protocols that can be supported by a UMP endpoint.
 * 
 * [@constant] kMIDIUMPSupportedProtocolMIDI1
 * Support for MIDI 1.0 in Universal Packets, or MIDI-1UP.
 * 
 * [@constant] kMIDIUMPSupportedProtocolMIDI2
 * Support for MIDI 2.0 protocol.
 */
@Generated
public final class MIDIUMPProtocolOptions {
    @Generated
    private MIDIUMPProtocolOptions() {
    }

    @Generated public static final byte MIDI1 = 1;
    @Generated public static final byte MIDI2 = 2;
}